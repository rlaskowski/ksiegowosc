
package pl.web.contractor;

import java.io.Serializable;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import pl.ejb.contractor.ModProvince;

/**
 *
 * @author r.laskowski
 */

@Named("contractor")
@SessionScoped
public class ViewContractor implements Serializable{
    
    
    //EJB DI
    @EJB
    private ModProvince modProvince;
    
    
   
    private static Map<String,Integer> provinceItems;
    
    private String name;
    
    private String shortName;
    
    private String nip;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public Map<String,Integer> getProvinceItems()
    {
        return provinceItems;
    }
    
    //Select One Menu List
    //Province
    public void getProvinceList()
    {
        
    }
    
  
    
    
    
   
    
}
