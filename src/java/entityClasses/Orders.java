/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gdodd
 */
@Entity
@Table(name = "ORDERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderid", query = "SELECT o FROM Orders o WHERE o.orderid = :orderid"),
    @NamedQuery(name = "Orders.findByOrderpaid", query = "SELECT o FROM Orders o WHERE o.orderpaid = :orderpaid"),
    @NamedQuery(name = "Orders.findByDateordered", query = "SELECT o FROM Orders o WHERE o.dateordered = :dateordered"),
    @NamedQuery(name = "Orders.findByDatepaid", query = "SELECT o FROM Orders o WHERE o.datepaid = :datepaid"),
    @NamedQuery(name = "Orders.findByDatedelivered", query = "SELECT o FROM Orders o WHERE o.datedelivered = :datedelivered"),
    @NamedQuery(name = "Orders.findByTtoalinvoice", query = "SELECT o FROM Orders o WHERE o.ttoalinvoice = :ttoalinvoice"),
    @NamedQuery(name = "Orders.findByClubpayment", query = "SELECT o FROM Orders o WHERE o.clubpayment = :clubpayment"),
    @NamedQuery(name = "Orders.findByDonorpayment", query = "SELECT o FROM Orders o WHERE o.donorpayment = :donorpayment"),
    @NamedQuery(name = "Orders.findByOrderinvoicepaid", query = "SELECT o FROM Orders o WHERE o.orderinvoicepaid = :orderinvoicepaid")})
public class Orders implements Serializable {
    @OneToMany(mappedBy = "orderid")
    private Collection<Ordereditems> ordereditemsCollection;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ORDERID")
    private BigDecimal orderid;
    @Column(name = "ORDERPAID")
    private String orderpaid;
    @Column(name = "DATEORDERED")
    private String dateordered;
    @Column(name = "DATEPAID")
    private String datepaid;
    @Column(name = "DATEDELIVERED")
    private String datedelivered;
    @Column(name = "TTOALINVOICE")
    private BigDecimal ttoalinvoice;
    @Column(name = "CLUBPAYMENT")
    private BigDecimal clubpayment;
    @Column(name = "DONORPAYMENT")
    private BigDecimal donorpayment;
    @Column(name = "ORDERINVOICEPAID")
    private String orderinvoicepaid;
    @JoinColumn(name = "CLUBID", referencedColumnName = "CLUBID")
    @ManyToOne
    private Clubs clubid;

    public Orders() {
    }

    public Orders(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getOrderpaid() {
        return orderpaid;
    }

    public void setOrderpaid(String orderpaid) {
        this.orderpaid = orderpaid;
    }

    public String getDateordered() {
        return dateordered;
    }

    public void setDateordered(String dateordered) {
        this.dateordered = dateordered;
    }

    public String getDatepaid() {
        return datepaid;
    }

    public void setDatepaid(String datepaid) {
        this.datepaid = datepaid;
    }

    public String getDatedelivered() {
        return datedelivered;
    }

    public void setDatedelivered(String datedelivered) {
        this.datedelivered = datedelivered;
    }

    public BigDecimal getTtoalinvoice() {
        return ttoalinvoice;
    }

    public void setTtoalinvoice(BigDecimal ttoalinvoice) {
        this.ttoalinvoice = ttoalinvoice;
    }

    public BigDecimal getClubpayment() {
        return clubpayment;
    }

    public void setClubpayment(BigDecimal clubpayment) {
        this.clubpayment = clubpayment;
    }

    public BigDecimal getDonorpayment() {
        return donorpayment;
    }

    public void setDonorpayment(BigDecimal donorpayment) {
        this.donorpayment = donorpayment;
    }

    public String getOrderinvoicepaid() {
        return orderinvoicepaid;
    }

    public void setOrderinvoicepaid(String orderinvoicepaid) {
        this.orderinvoicepaid = orderinvoicepaid;
    }

    public Clubs getClubid() {
        return clubid;
    }

    public void setClubid(Clubs clubid) {
        this.clubid = clubid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.Orders[ orderid=" + orderid + " ]";
    }

    @XmlTransient
    public Collection<Ordereditems> getOrdereditemsCollection() {
        return ordereditemsCollection;
    }

    public void setOrdereditemsCollection(Collection<Ordereditems> ordereditemsCollection) {
        this.ordereditemsCollection = ordereditemsCollection;
    }
    
}
