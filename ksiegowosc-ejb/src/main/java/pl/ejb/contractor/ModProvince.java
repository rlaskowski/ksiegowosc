
package pl.ejb.contractor;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Rafał
 */
@Stateless
@LocalBean
public class ModProvince {

    @PersistenceContext
    private EntityManager em;
    
    
    //GET Province list
    public List getProvinceList()
    {
        Query q = em.createQuery("SELECT p.name, p.code FROM Province p");
        return q.getResultList();
    }

}
