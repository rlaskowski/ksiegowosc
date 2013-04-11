/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.encje;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@SequenceGenerator(sequenceName = "users_seq",name = "users_seq",allocationSize = 100000000)
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
    private Date regiteredDate;
    
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
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
