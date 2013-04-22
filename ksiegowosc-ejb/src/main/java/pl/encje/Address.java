
package pl.encje;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author r.laskowski
 */
@Entity
@SequenceGenerator(sequenceName = "address_seq",name="address_seq",allocationSize = 100000000)
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "address_seq")
    private Long id;
    
    @Size(max = 120)
    private char city;
    
    @Size(max = 120)
    private char street;
    
    @Size(max = 10)
    private char zip;
    
    
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateOfCreate;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfChange;
    
    private short czyus;
    
    //Constructors
    public Address()
    {
        
    }
    
    public Address(char city, char street, char zip)
    {
        this.city = city;
        this.street = street;
        this.zip = zip;
    }
    
    //Join
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "province_id")
    private Province province;
    
    
    //Methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getCity() {
        return city;
    }

    public void setCity(char city) {
        this.city = city;
    }

    public char getStreet() {
        return street;
    }

    public void setStreet(char street) {
        this.street = street;
    }
    
    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public char getZip() {
        return zip;
    }

    public void setZip(char zip) {
        this.zip = zip;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(Date dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public Date getDateOfChange() {
        return dateOfChange;
    }

    public void setDateOfChange(Date dateOfChange) {
        this.dateOfChange = dateOfChange;
    }
    
    public short getCzyus() {
        return czyus;
    }

    public void setCzyus(short czyus) {
        this.czyus = czyus;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
     
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.encje.UsersAddress[ id=" + id + " ]";
    }
    
}
