/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.encje;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

/**
 *
 * @author r.laskowski
 */
@Entity
@SequenceGenerator(sequenceName = "state_adress_seq",name = "state_adress_seq")
public class StateAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "state_adress_seq")
    private Long id;
    
    @Size(max = 60)
    @Column(nullable = false)
    private  String name;
    
    private short czyus;

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
        if (!(object instanceof StateAddress)) {
            return false;
        }
        StateAddress other = (StateAddress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.encje.StateAddress[ id=" + id + " ]";
    }
    
}
