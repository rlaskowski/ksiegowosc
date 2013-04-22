
package pl.encje;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

/**
 *
 * @author Rafał
 */
@Entity
@SequenceGenerator(name = "phone_seq",sequenceName = "phone_seq",allocationSize = 100000000)
public class Phone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "phone_seq")
    private Long id;
    
    @Size(max = 20)
    private char number;
    
    private short type;
    
    private short czyus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getNumber() {
        return number;
    }

    public void setNumber(char number) {
        this.number = number;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
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
        if (!(object instanceof Phone)) {
            return false;
        }
        Phone other = (Phone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.encje.Phone[ id=" + id + " ]";
    }
    
}
