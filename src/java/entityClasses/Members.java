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
@Table(name = "MEMBERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m"),
    @NamedQuery(name = "Members.findByMemberid", query = "SELECT m FROM Members m WHERE m.memberid = :memberid"),
    @NamedQuery(name = "Members.findByMemberfirstname", query = "SELECT m FROM Members m WHERE m.memberfirstname = :memberfirstname"),
    @NamedQuery(name = "Members.findByMemberlastname", query = "SELECT m FROM Members m WHERE m.memberlastname = :memberlastname"),
    @NamedQuery(name = "Members.findByMemberaddressline1", query = "SELECT m FROM Members m WHERE m.memberaddressline1 = :memberaddressline1"),
    @NamedQuery(name = "Members.findByMemberaddressline2", query = "SELECT m FROM Members m WHERE m.memberaddressline2 = :memberaddressline2"),
    @NamedQuery(name = "Members.findByMembertown", query = "SELECT m FROM Members m WHERE m.membertown = :membertown"),
    @NamedQuery(name = "Members.findByMembercounty", query = "SELECT m FROM Members m WHERE m.membercounty = :membercounty"),
    @NamedQuery(name = "Members.findByMemberpostcode", query = "SELECT m FROM Members m WHERE m.memberpostcode = :memberpostcode"),
    @NamedQuery(name = "Members.findByMembermobile", query = "SELECT m FROM Members m WHERE m.membermobile = :membermobile"),
    @NamedQuery(name = "Members.findByMemberlandline", query = "SELECT m FROM Members m WHERE m.memberlandline = :memberlandline"),
    @NamedQuery(name = "Members.findByMemberemail", query = "SELECT m FROM Members m WHERE m.memberemail = :memberemail"),
    @NamedQuery(name = "Members.findByMembercountry", query = "SELECT m FROM Members m WHERE m.membercountry = :membercountry")})
public class Members implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "MEMBERID")
    private BigDecimal memberid;
    @Column(name = "MEMBERFIRSTNAME")
    private String memberfirstname;
    @Column(name = "MEMBERLASTNAME")
    private String memberlastname;
    @Column(name = "MEMBERADDRESSLINE1")
    private String memberaddressline1;
    @Column(name = "MEMBERADDRESSLINE2")
    private String memberaddressline2;
    @Column(name = "MEMBERTOWN")
    private String membertown;
    @Column(name = "MEMBERCOUNTY")
    private String membercounty;
    @Column(name = "MEMBERPOSTCODE")
    private String memberpostcode;
    @Column(name = "MEMBERMOBILE")
    private String membermobile;
    @Column(name = "MEMBERLANDLINE")
    private String memberlandline;
    @Column(name = "MEMBEREMAIL")
    private String memberemail;
    @Column(name = "MEMBERCOUNTRY")
    private String membercountry;
    @JoinColumn(name = "CLUBID", referencedColumnName = "CLUBID")
    @ManyToOne
    private Clubs clubid;

    public Members() {
    }

    public Members(BigDecimal memberid) {
        this.memberid = memberid;
    }

    public BigDecimal getMemberid() {
        return memberid;
    }

    public void setMemberid(BigDecimal memberid) {
        this.memberid = memberid;
    }

    public String getMemberfirstname() {
        return memberfirstname;
    }

    public void setMemberfirstname(String memberfirstname) {
        this.memberfirstname = memberfirstname;
    }

    public String getMemberlastname() {
        return memberlastname;
    }

    public void setMemberlastname(String memberlastname) {
        this.memberlastname = memberlastname;
    }

    public String getMemberaddressline1() {
        return memberaddressline1;
    }

    public void setMemberaddressline1(String memberaddressline1) {
        this.memberaddressline1 = memberaddressline1;
    }

    public String getMemberaddressline2() {
        return memberaddressline2;
    }

    public void setMemberaddressline2(String memberaddressline2) {
        this.memberaddressline2 = memberaddressline2;
    }

    public String getMembertown() {
        return membertown;
    }

    public void setMembertown(String membertown) {
        this.membertown = membertown;
    }

    public String getMembercounty() {
        return membercounty;
    }

    public void setMembercounty(String membercounty) {
        this.membercounty = membercounty;
    }

    public String getMemberpostcode() {
        return memberpostcode;
    }

    public void setMemberpostcode(String memberpostcode) {
        this.memberpostcode = memberpostcode;
    }

    public String getMembermobile() {
        return membermobile;
    }

    public void setMembermobile(String membermobile) {
        this.membermobile = membermobile;
    }

    public String getMemberlandline() {
        return memberlandline;
    }

    public void setMemberlandline(String memberlandline) {
        this.memberlandline = memberlandline;
    }

    public String getMemberemail() {
        return memberemail;
    }

    public void setMemberemail(String memberemail) {
        this.memberemail = memberemail;
    }

    public String getMembercountry() {
        return membercountry;
    }

    public void setMembercountry(String membercountry) {
        this.membercountry = membercountry;
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
        hash += (memberid != null ? memberid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.memberid == null && other.memberid != null) || (this.memberid != null && !this.memberid.equals(other.memberid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.Members[ memberid=" + memberid + " ]";
    }
    
}
