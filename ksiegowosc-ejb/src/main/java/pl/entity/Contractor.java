
package pl.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author r.laskowski
 */
@Entity
@SequenceGenerator(name = "contractor_seq",sequenceName = "contractor_seq",allocationSize = 1)
public class Contractor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    //Join
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_contractor")
    private List<Address> idConAddress = new ArrayList<Address>();
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_contractor")
    private List<Phone> idConPhone = new ArrayList<Phone>();
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "contractor_seq")
    private Long id;
    
    @Size(max = 120)
    @Column(nullable = false)
    private char name;
    
    @Size(max = 20)
    @Column(nullable = false)
    private char shortName;
    
    @Size(max = 20)
    @Column(nullable = false)
    private char nip;
    
    @Size(max = 20)
    @Column(nullable = false)
    private char rego;
    
    @Column(nullable = false)
    private short type;
    
    @Size(max = 30)
    @Column(name = "web_site")
    private char webSite;
    
    @Size(max = 30)
    @Column(name = "email")
    private char email;
    
 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateOfCreate;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfChange;
    
 
    private short czyus;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
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
    
    public List<Address> getIdConAddress()
    {
        return idConAddress;
    }
    
    public void setIdConAddress(List<Address> idConAddress)
    {
        this.idConAddress = idConAddress;
    }
    
    public List<Phone> getIdConPhone()
    {
        return idConPhone;
    }
    
    public void setIdConPhone(List<Phone> idConPhone)
    {
        this.idConPhone = idConPhone;
    }

    public short getCzyus() {
        return czyus;
    }

    public void setCzyus(short czyus) {
        this.czyus = czyus;
    }

    public char getShortName() {
        return shortName;
    }

    public void setShortName(char shortName) {
        this.shortName = shortName;
    }

    public char getNip() {
        return nip;
    }

    public void setNip(char nip) {
        this.nip = nip;
    }

    public char getRego() {
        return rego;
    }

    public void setRego(char rego) {
        this.rego = rego;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public char getWebSite() {
        return webSite;
    }

    public void setWebSite(char webSite) {
        this.webSite = webSite;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Contractor)) {
            return false;
        }
        Contractor other = (Contractor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.encje.Contractors[ id=" + id + " ]";
    }
    
}
