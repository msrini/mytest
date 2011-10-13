package abc;

import java.util.Collection;
import javax.ejb.CreateException;
import javax.ejb.Local;
import javax.ejb.Remove;

@Local
public interface SCBeanLocal {

    public void addItem(String item);
    public void removeItem(String item);
    public Collection getItems();
   @Remove 
   public void checkout();
    //How is it?
}
