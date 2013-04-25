
package pl.web.contractor;

import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import javax.persistence.Query;
import pl.ejb.contractor.ModProvince;
import pl.entity.Province;

/**
 *
 * @author r.laskowski
 */

@Named("contractor")
@SessionScoped
public class ViewContractor implements Serializable{
    
    
    @EJB
    private ModProvince modProvince;
    
    private List<SelectItem> provinceList = new ArrayList<SelectItem>();
    private Province province;
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
    
    public Province getProvince()
    {
        return province;
    }
    
    public void setProvince(Province province)
    {
        this.province = province;
    }
    
    public List<SelectItem> getProvinceList()
    {
        
        for(Object p : modProvince.getProvinceList())
        {
            provinceList.add(new SelectItem(p, p.toString()));
        }
        
        return provinceList;
    }
    
    
   
    
 

    
   
 
    
  
    
    
    
   
    
}
