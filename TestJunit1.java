import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class TestJunit1 {

    @Test
    public void testCompare() {

        java.util.Hashtable ht = new java.util.Hashtable();
        
        UserKey b1 = new UserKey("Bill Smith", "BSMITH");
        UserKey b2 = new UserKey("Bill Smith", "BSMITH");
        UserKey b3 = new UserKey("Susan Smith", "SSMITH");
        UserKey b4 = new UserKey(null, null);

        assertEquals("B1 does not equals B1!?!?", b1, b1);
        assertEquals("B1 does not equals B2", b1, b2);
        assertNotEquals("B1 equals b3???????", b1, b3);

        assertNotEquals("B1 equals b4?????", b4, b1);

        
        // System.out.println( b1.equals(null) ); // prints false
        // System.out.println( b1.equals("Some String")); //prints false
        // System.out.println( b4.equals(b1) ); // prints false        
    
        ht.put(b1,"Some Data");
        String string = (String) ht.get(b2);
        System.out.println( string.equals("Some Data") );

    }
}