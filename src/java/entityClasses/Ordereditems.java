/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gdodd
 */
@Entity
@Table(name = "ORDEREDITEMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordereditems.findAll", query = "SELECT o FROM Ordereditems o"),
    @NamedQuery(name = "Ordereditems.findByOrderitemid", query = "SELECT o FROM Ordereditems o WHERE o.orderitemid = :orderitemid"),
    @NamedQuery(name = "Ordereditems.findByItemdescription", query = "SELECT o FROM Ordereditems o WHERE o.itemdescription = :itemdescription"),
    @NamedQuery(name = "Ordereditems.findByOrdereditemprice", query = "SELECT o FROM Ordereditems o WHERE o.ordereditemprice = :ordereditemprice"),
    @NamedQuery(name = "Ordereditems.findByOrdereditemquantity", query = "SELECT o FROM Ordereditems o WHERE o.ordereditemquantity = :ordereditemquantity"),
    @NamedQuery(name = "Ordereditems.findByOrdereditemtotalprice", query = "SELECT o FROM Ordereditems o WHERE o.ordereditemtotalprice = :ordereditemtotalprice")})
public class Ordereditems implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ORDERITEMID")
    private BigDecimal orderitemid;
    @Column(name = "ITEMDESCRIPTION")
    private String itemdescription;
    @Column(name = "ORDEREDITEMPRICE")
    private BigDecimal ordereditemprice;
    @Column(name = "ORDEREDITEMQUANTITY")
    private Integer ordereditemquantity;
    @Column(name = "ORDEREDITEMTOTALPRICE")
    private BigDecimal ordereditemtotalprice;
    @JoinColumn(name = "SKU", referencedColumnName = "SKU")
    @ManyToOne
    private Stockitems sku;
    @JoinColumn(name = "ORDERID", referencedColumnName = "ORDERID")
    @ManyToOne
    private Orders orderid;

    public Ordereditems() {
    }

    public Ordereditems(BigDecimal orderitemid) {
        this.orderitemid = orderitemid;
    }

    public BigDecimal getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(BigDecimal orderitemid) {
        this.orderitemid = orderitemid;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public BigDecimal getOrdereditemprice() {
        return ordereditemprice;
    }

    public void setOrdereditemprice(BigDecimal ordereditemprice) {
        this.ordereditemprice = ordereditemprice;
    }

    public Integer getOrdereditemquantity() {
        return ordereditemquantity;
    }

    public void setOrdereditemquantity(Integer ordereditemquantity) {
        this.ordereditemquantity = ordereditemquantity;
    }

    public BigDecimal getOrdereditemtotalprice() {
        return ordereditemtotalprice;
    }

    public void setOrdereditemtotalprice(BigDecimal ordereditemtotalprice) {
        this.ordereditemtotalprice = ordereditemtotalprice;
    }

    public Stockitems getSku() {
        return sku;
    }

    public void setSku(Stockitems sku) {
        this.sku = sku;
    }

    public Orders getOrderid() {
        return orderid;
    }

    public void setOrderid(Orders orderid) {
        this.orderid = orderid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderitemid != null ? orderitemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordereditems)) {
            return false;
        }
        Ordereditems other = (Ordereditems) object;
        if ((this.orderitemid == null && other.orderitemid != null) || (this.orderitemid != null && !this.orderitemid.equals(other.orderitemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.Ordereditems[ orderitemid=" + orderitemid + " ]";
    }
    
}
