/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.entity;

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
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Rafał
 */
@Entity
@SequenceGenerator(sequenceName = "users_seq",name = "users_seq",allocationSize = 1)
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "users_seq")
    private Long id;
    
    @Size(max = 255)
    @Column(nullable = false)
    private char name;
    
    @Size(max = 255)
    @Column(nullable = false)
    private String password;
    
    @Size(max = 60)
    @Column(nullable = false)
    private char email;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateOfCreate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dateOfChange;
    
    @Column(nullable = false)
    private short czyus;
    
    
    //Contructors
    public Users()
    {
        
    }
    
    public Users(char name, String password, char email)
    {
        this.name = name;
        this.password = DigestUtils.sha512Hex(password);
        this.email = email;
    }
    
    //Join
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_users_address")
    private Address usersAddress;
    
    
    //Methods
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
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

    public Address getUsersAddress() {
        return usersAddress;
    }

    public void setUsersAddress(Address usersAddress) {
        this.usersAddress = usersAddress;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.encje.Users[ id=" + id + " ]";
    }
    
}
