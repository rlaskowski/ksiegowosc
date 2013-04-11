
package pl.encje;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

/**
 *
 * @author r.laskowski
 */
@Entity
@SequenceGenerator(sequenceName = "users_address_seq",name="users_address_seq",allocationSize = 100000000)
public class UsersAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "users_address_seq")
    private Long id;
    
    @Size(max = 120)
    private char city;
    
    @Size(max = 120)
    private char street;
    
    @Size(max = 10)
    private char zip;
    
    private short czyus;
    
    //Constructors
    public UsersAddress()
    {
        
    }
    
    public UsersAddress(char city, char street, char zip)
    {
        this.city = city;
        this.street = street;
        this.zip = zip;
    }
    
    //Join
    @ManyToOne(cascade = {CascadeType.ALL})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersAddress)) {
            return false;
        }
        UsersAddress other = (UsersAddress) object;
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
