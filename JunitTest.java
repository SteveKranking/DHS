// package junitfaq;
import org.junit.*;
import static org.junit.Assert.*;
 
import java.util.*;

public class JunitTest {

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(TestJunit1.class);
    }
    
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("JunitTest");
    }

}
