/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ejb.contractor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.entity.Contractor;

/**
 *
 * @author r.laskowski
 */
@Stateless
public class NewContractor {
    
    @PersistenceContext
    private EntityManager em;


    
    

}
