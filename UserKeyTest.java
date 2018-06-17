// import javax.servlet;
// import javax.servlet.http.HttpSession;
import java.util.*;

public class UserKeyTest{
    public static void main(String[] args) {

        // Httpsession s;
        java.util.Hashtable ht = new java.util.Hashtable();

        UserKey b1 = new UserKey("Bill Smith", "BSMITH");
        // s.setAttribute(b1);
        //This is how you would use session
        
        UserKey b2 = new UserKey("Bill Smith", "BSMITH");
        
        UserKey b3 = new UserKey("Susan Smith", "SSMITH");
        
        UserKey b4 = new UserKey(null, null);

        System.out.println( b1.equals(b1) );  // prints true
        System.out.println( b1.equals(b2) );  // prints true
        System.out.println( b1.equals(b3) );  // prints false
        System.out.println( b1.equals(null) ); // prints false
        System.out.println( b1.equals("Some String")); //prints false
        System.out.println( b4.equals(b1) ); // prints false        
    
        ht.put(b1,"Some Data");
        //This is how you add to hashtables.
        String string = (String) ht.get(b2);
        System.out.println( string.equals("Some Data") );  // prints true

    }
}