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
@Table(name = "CLUBS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clubs.findAll", query = "SELECT c FROM Clubs c"),
    @NamedQuery(name = "Clubs.findByClubid", query = "SELECT c FROM Clubs c WHERE c.clubid = :clubid"),
    @NamedQuery(name = "Clubs.findByClubcounty", query = "SELECT c FROM Clubs c WHERE c.clubcounty = :clubcounty"),
    @NamedQuery(name = "Clubs.findByClubpostcode", query = "SELECT c FROM Clubs c WHERE c.clubpostcode = :clubpostcode"),
    @NamedQuery(name = "Clubs.findByClubmobile", query = "SELECT c FROM Clubs c WHERE c.clubmobile = :clubmobile"),
    @NamedQuery(name = "Clubs.findByClublandline", query = "SELECT c FROM Clubs c WHERE c.clublandline = :clublandline"),
    @NamedQuery(name = "Clubs.findByClubmanagerfirstname", query = "SELECT c FROM Clubs c WHERE c.clubmanagerfirstname = :clubmanagerfirstname"),
    @NamedQuery(name = "Clubs.findByClubmanagerlastname", query = "SELECT c FROM Clubs c WHERE c.clubmanagerlastname = :clubmanagerlastname"),
    @NamedQuery(name = "Clubs.findByClubname", query = "SELECT c FROM Clubs c WHERE c.clubname = :clubname"),
    @NamedQuery(name = "Clubs.findByClubaddressline2", query = "SELECT c FROM Clubs c WHERE c.clubaddressline2 = :clubaddressline2"),
    @NamedQuery(name = "Clubs.findByClubemail", query = "SELECT c FROM Clubs c WHERE c.clubemail = :clubemail"),
    @NamedQuery(name = "Clubs.findByClubaddressline1", query = "SELECT c FROM Clubs c WHERE c.clubaddressline1 = :clubaddressline1"),
    @NamedQuery(name = "Clubs.findByClubcountry", query = "SELECT c FROM Clubs c WHERE c.clubcountry = :clubcountry"),
    @NamedQuery(name = "Clubs.findByClubtown", query = "SELECT c FROM Clubs c WHERE c.clubtown = :clubtown")})
public class Clubs implements Serializable {
    @OneToMany(mappedBy = "clubid")
    private Collection<Members> membersCollection;
    @OneToMany(mappedBy = "clubid")
    private Collection<Orders> ordersCollection;
    @OneToMany(mappedBy = "clubid")
    private Collection<Donations> donationsCollection;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CLUBID")
    private BigDecimal clubid;
    @Column(name = "CLUBCOUNTY")
    private String clubcounty;
    @Column(name = "CLUBPOSTCODE")
    private String clubpostcode;
    @Column(name = "CLUBMOBILE")
    private String clubmobile;
    @Column(name = "CLUBLANDLINE")
    private String clublandline;
    @Column(name = "CLUBMANAGERFIRSTNAME")
    private String clubmanagerfirstname;
    @Column(name = "CLUBMANAGERLASTNAME")
    private String clubmanagerlastname;
    @Column(name = "CLUBNAME")
    private String clubname;
    @Column(name = "CLUBADDRESSLINE2")
    private String clubaddressline2;
    @Column(name = "CLUBEMAIL")
    private String clubemail;
    @Column(name = "CLUBADDRESSLINE1")
    private String clubaddressline1;
    @Column(name = "CLUBCOUNTRY")
    private String clubcountry;
    @Column(name = "CLUBTOWN")
    private String clubtown;

    public Clubs() {
    }

    public Clubs(BigDecimal clubid) {
        this.clubid = clubid;
    }

    public BigDecimal getClubid() {
        return clubid;
    }

    public void setClubid(BigDecimal clubid) {
        this.clubid = clubid;
    }

    public String getClubcounty() {
        return clubcounty;
    }

    public void setClubcounty(String clubcounty) {
        this.clubcounty = clubcounty;
    }

    public String getClubpostcode() {
        return clubpostcode;
    }

    public void setClubpostcode(String clubpostcode) {
        this.clubpostcode = clubpostcode;
    }

    public String getClubmobile() {
        return clubmobile;
    }

    public void setClubmobile(String clubmobile) {
        this.clubmobile = clubmobile;
    }

    public String getClublandline() {
        return clublandline;
    }

    public void setClublandline(String clublandline) {
        this.clublandline = clublandline;
    }

    public String getClubmanagerfirstname() {
        return clubmanagerfirstname;
    }

    public void setClubmanagerfirstname(String clubmanagerfirstname) {
        this.clubmanagerfirstname = clubmanagerfirstname;
    }

    public String getClubmanagerlastname() {
        return clubmanagerlastname;
    }

    public void setClubmanagerlastname(String clubmanagerlastname) {
        this.clubmanagerlastname = clubmanagerlastname;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubaddressline2() {
        return clubaddressline2;
    }

    public void setClubaddressline2(String clubaddressline2) {
        this.clubaddressline2 = clubaddressline2;
    }

    public String getClubemail() {
        return clubemail;
    }

    public void setClubemail(String clubemail) {
        this.clubemail = clubemail;
    }

    public String getClubaddressline1() {
        return clubaddressline1;
    }

    public void setClubaddressline1(String clubaddressline1) {
        this.clubaddressline1 = clubaddressline1;
    }

    public String getClubcountry() {
        return clubcountry;
    }

    public void setClubcountry(String clubcountry) {
        this.clubcountry = clubcountry;
    }

    public String getClubtown() {
        return clubtown;
    }

    public void setClubtown(String clubtown) {
        this.clubtown = clubtown;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clubid != null ? clubid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clubs)) {
            return false;
        }
        Clubs other = (Clubs) object;
        if ((this.clubid == null && other.clubid != null) || (this.clubid != null && !this.clubid.equals(other.clubid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.Clubs[ clubid=" + clubid + " ]";
    }

    @XmlTransient
    public Collection<Donations> getDonationsCollection() {
        return donationsCollection;
    }

    public void setDonationsCollection(Collection<Donations> donationsCollection) {
        this.donationsCollection = donationsCollection;
    }

    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }

    @XmlTransient
    public Collection<Members> getMembersCollection() {
        return membersCollection;
    }

    public void setMembersCollection(Collection<Members> membersCollection) {
        this.membersCollection = membersCollection;
    }
    
}
