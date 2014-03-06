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
@Table(name = "SUPPLIERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Suppliers.findAll", query = "SELECT s FROM Suppliers s"),
    @NamedQuery(name = "Suppliers.findBySupplierid", query = "SELECT s FROM Suppliers s WHERE s.supplierid = :supplierid"),
    @NamedQuery(name = "Suppliers.findBySuppliername", query = "SELECT s FROM Suppliers s WHERE s.suppliername = :suppliername"),
    @NamedQuery(name = "Suppliers.findBySupplieraddressline1", query = "SELECT s FROM Suppliers s WHERE s.supplieraddressline1 = :supplieraddressline1"),
    @NamedQuery(name = "Suppliers.findBySupplieraddressline2", query = "SELECT s FROM Suppliers s WHERE s.supplieraddressline2 = :supplieraddressline2"),
    @NamedQuery(name = "Suppliers.findBySuppliertown", query = "SELECT s FROM Suppliers s WHERE s.suppliertown = :suppliertown"),
    @NamedQuery(name = "Suppliers.findBySuppliercounty", query = "SELECT s FROM Suppliers s WHERE s.suppliercounty = :suppliercounty"),
    @NamedQuery(name = "Suppliers.findBySupplierpostcode", query = "SELECT s FROM Suppliers s WHERE s.supplierpostcode = :supplierpostcode"),
    @NamedQuery(name = "Suppliers.findBySuppliercountry", query = "SELECT s FROM Suppliers s WHERE s.suppliercountry = :suppliercountry"),
    @NamedQuery(name = "Suppliers.findBySuppliermobile", query = "SELECT s FROM Suppliers s WHERE s.suppliermobile = :suppliermobile"),
    @NamedQuery(name = "Suppliers.findBySupplierlandline", query = "SELECT s FROM Suppliers s WHERE s.supplierlandline = :supplierlandline"),
    @NamedQuery(name = "Suppliers.findBySupplieremail", query = "SELECT s FROM Suppliers s WHERE s.supplieremail = :supplieremail"),
    @NamedQuery(name = "Suppliers.findBySuupliercontactfirstname", query = "SELECT s FROM Suppliers s WHERE s.suupliercontactfirstname = :suupliercontactfirstname"),
    @NamedQuery(name = "Suppliers.findBySuppliercontactlastname", query = "SELECT s FROM Suppliers s WHERE s.suppliercontactlastname = :suppliercontactlastname")})
public class Suppliers implements Serializable {
    @OneToMany(mappedBy = "supplierid")
    private Collection<Stockitems> stockitemsCollection;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SUPPLIERID")
    private BigDecimal supplierid;
    @Column(name = "SUPPLIERNAME")
    private String suppliername;
    @Column(name = "SUPPLIERADDRESSLINE1")
    private String supplieraddressline1;
    @Column(name = "SUPPLIERADDRESSLINE2")
    private String supplieraddressline2;
    @Column(name = "SUPPLIERTOWN")
    private String suppliertown;
    @Column(name = "SUPPLIERCOUNTY")
    private String suppliercounty;
    @Column(name = "SUPPLIERPOSTCODE")
    private String supplierpostcode;
    @Column(name = "SUPPLIERCOUNTRY")
    private String suppliercountry;
    @Column(name = "SUPPLIERMOBILE")
    private String suppliermobile;
    @Column(name = "SUPPLIERLANDLINE")
    private String supplierlandline;
    @Column(name = "SUPPLIEREMAIL")
    private String supplieremail;
    @Column(name = "SUUPLIERCONTACTFIRSTNAME")
    private String suupliercontactfirstname;
    @Column(name = "SUPPLIERCONTACTLASTNAME")
    private String suppliercontactlastname;

    public Suppliers() {
    }

    public Suppliers(BigDecimal supplierid) {
        this.supplierid = supplierid;
    }

    public BigDecimal getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(BigDecimal supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSupplieraddressline1() {
        return supplieraddressline1;
    }

    public void setSupplieraddressline1(String supplieraddressline1) {
        this.supplieraddressline1 = supplieraddressline1;
    }

    public String getSupplieraddressline2() {
        return supplieraddressline2;
    }

    public void setSupplieraddressline2(String supplieraddressline2) {
        this.supplieraddressline2 = supplieraddressline2;
    }

    public String getSuppliertown() {
        return suppliertown;
    }

    public void setSuppliertown(String suppliertown) {
        this.suppliertown = suppliertown;
    }

    public String getSuppliercounty() {
        return suppliercounty;
    }

    public void setSuppliercounty(String suppliercounty) {
        this.suppliercounty = suppliercounty;
    }

    public String getSupplierpostcode() {
        return supplierpostcode;
    }

    public void setSupplierpostcode(String supplierpostcode) {
        this.supplierpostcode = supplierpostcode;
    }

    public String getSuppliercountry() {
        return suppliercountry;
    }

    public void setSuppliercountry(String suppliercountry) {
        this.suppliercountry = suppliercountry;
    }

    public String getSuppliermobile() {
        return suppliermobile;
    }

    public void setSuppliermobile(String suppliermobile) {
        this.suppliermobile = suppliermobile;
    }

    public String getSupplierlandline() {
        return supplierlandline;
    }

    public void setSupplierlandline(String supplierlandline) {
        this.supplierlandline = supplierlandline;
    }

    public String getSupplieremail() {
        return supplieremail;
    }

    public void setSupplieremail(String supplieremail) {
        this.supplieremail = supplieremail;
    }

    public String getSuupliercontactfirstname() {
        return suupliercontactfirstname;
    }

    public void setSuupliercontactfirstname(String suupliercontactfirstname) {
        this.suupliercontactfirstname = suupliercontactfirstname;
    }

    public String getSuppliercontactlastname() {
        return suppliercontactlastname;
    }

    public void setSuppliercontactlastname(String suppliercontactlastname) {
        this.suppliercontactlastname = suppliercontactlastname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierid != null ? supplierid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suppliers)) {
            return false;
        }
        Suppliers other = (Suppliers) object;
        if ((this.supplierid == null && other.supplierid != null) || (this.supplierid != null && !this.supplierid.equals(other.supplierid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.Suppliers[ supplierid=" + supplierid + " ]";
    }

    @XmlTransient
    public Collection<Stockitems> getStockitemsCollection() {
        return stockitemsCollection;
    }

    public void setStockitemsCollection(Collection<Stockitems> stockitemsCollection) {
        this.stockitemsCollection = stockitemsCollection;
    }
    
}
