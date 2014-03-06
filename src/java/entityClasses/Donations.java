/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DONATIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donations.findAll", query = "SELECT d FROM Donations d"),
    @NamedQuery(name = "Donations.findByDonationid", query = "SELECT d FROM Donations d WHERE d.donationid = :donationid"),
    @NamedQuery(name = "Donations.findByDonationamount", query = "SELECT d FROM Donations d WHERE d.donationamount = :donationamount"),
    @NamedQuery(name = "Donations.findByDonationdate", query = "SELECT d FROM Donations d WHERE d.donationdate = :donationdate")})
public class Donations implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DONATIONID")
    private BigDecimal donationid;
    @Column(name = "DONATIONAMOUNT")
    private BigInteger donationamount;
    @Column(name = "DONATIONDATE")
    private String donationdate;
    @JoinColumn(name = "DONORID", referencedColumnName = "DONORID")
    @ManyToOne
    private Donors donorid;
    @JoinColumn(name = "CLUBID", referencedColumnName = "CLUBID")
    @ManyToOne
    private Clubs clubid;

    public Donations() {
    }

    public Donations(BigDecimal donationid) {
        this.donationid = donationid;
    }

    public BigDecimal getDonationid() {
        return donationid;
    }

    public void setDonationid(BigDecimal donationid) {
        this.donationid = donationid;
    }

    public BigInteger getDonationamount() {
        return donationamount;
    }

    public void setDonationamount(BigInteger donationamount) {
        this.donationamount = donationamount;
    }

    public String getDonationdate() {
        return donationdate;
    }

    public void setDonationdate(String donationdate) {
        this.donationdate = donationdate;
    }

    public Donors getDonorid() {
        return donorid;
    }

    public void setDonorid(Donors donorid) {
        this.donorid = donorid;
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
        hash += (donationid != null ? donationid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donations)) {
            return false;
        }
        Donations other = (Donations) object;
        if ((this.donationid == null && other.donationid != null) || (this.donationid != null && !this.donationid.equals(other.donationid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.Donations[ donationid=" + donationid + " ]";
    }
    
}
