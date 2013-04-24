
package pl.web.contractor;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author r.laskowski
 */

@Named("contractor")
@SessionScoped
public class ViewContractor implements Serializable{
    
    private String name;
   
    
}
