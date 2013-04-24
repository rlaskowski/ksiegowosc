
package pl.entity;

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
@SequenceGenerator(name = "con_finance_seq",sequenceName = "con_finance_seq",allocationSize = 100000000)
public class ConFinance implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "con_finance_seq")
    private Long id;
    
    @Size(max = 30)
    @Column(name = "bank_account")
    private char bankAccount; 
    
    @Size(max = 60)
    @Column(name = "name_bank")
    private char nameBank;
    
    @Column(name = "method_payment")
    private short methodOfPayment;
    
    @Column(name = "term_payments")
    private int termOfPayments;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(char bankAccount) {
        this.bankAccount = bankAccount;
    }

    public char getNameBank() {
        return nameBank;
    }

    public void setNameBank(char nameBank) {
        this.nameBank = nameBank;
    }

    public short getMethodOfPayment() {
        return methodOfPayment;
    }

    public void setMethodOfPayment(short methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public int getTermOfPayments() {
        return termOfPayments;
    }

    public void setTermOfPayments(int termOfPayments) {
        this.termOfPayments = termOfPayments;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof ConFinance)) {
            return false;
        }
        ConFinance other = (ConFinance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.entity.Contact[ id=" + id + " ]";
    }
    
}
