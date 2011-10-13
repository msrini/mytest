package abc;

import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

@Stateful
public class SCBean implements SCBeanLocal {

   private ArrayList cartItems;

   public void addItem(String item) {
      cartItems.add(item);
   }

    public void removeItem(String item) {
        cartItems.remove(item);
    }

    public Collection getItems() {
        return cartItems;
    }
    public void checkout() {
        cartItems = null;
    }  
}
