
package pl.web.contractor;

import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
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
    
    private Map<String,Short> provinceList = new TreeMap<String,Short>();
    private String provinceName;
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
    
    public String getProvinceName()
    {
        return provinceName;
    }
    
    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }
    
    public Map<String,Short> getProvinceList()
    {
        Iterator iter = modProvince.getProvinceList().iterator();
        
        while(iter.hasNext())
        {
            Object[] o = (Object[])iter.next();
            
            String nameProvince = (String)o[0];
            Short codeProvince = (Short)o[1];
         
            
            provinceList.put(nameProvince,codeProvince);
            
            
        }
        
        return provinceList;
        
    }
    
    
   
    
 

    
   
 
    
  
    
    
    
   
    
}
