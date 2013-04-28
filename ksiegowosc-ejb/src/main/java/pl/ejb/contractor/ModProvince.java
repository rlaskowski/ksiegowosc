
package pl.ejb.contractor;

import java.util.*;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.entity.Province;

/**
 *
 * @author Rafał
 */
@Stateless
@LocalBean
public class ModProvince {
    
    @PersistenceContext
    private EntityManager em;
    
    public List getProvinceList()
    {
        Query q = em.createNamedQuery("Province.all");
        
       
        return q.getResultList();
    }

    
     
    

}
