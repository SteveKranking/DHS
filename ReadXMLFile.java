import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class ReadXMLFile {
  static public void main(String[] arg){
  try {

        String xmlFile = "question1.xml";
        File file = new File(xmlFile);
        
        if(file.exists()){
            try {
            // Create a new factory to create parsers 
                DocumentBuilderFactory dBF = 
                DocumentBuilderFactory.newInstance();
            // Use the factory to create a parser (builder) and use
            // it to parse the document.
                DocumentBuilder builder = dBF.newDocumentBuilder();
            // builder.setErrorHandler(new MyErrorHandler());
                InputSource is = new InputSource(xmlFile);
                Document doc = builder.parse(is);
                System.out.println(xmlFile + " is well-formed!");
            }
            catch (Exception e) {
                System.out.println(xmlFile + " isn't well-formed!");
                System.exit(1);
            }
        }

        else {
            System.out.print("File not found!");
        }
    }
  
    catch(IOException io) {
        io.printStackTrace();
    } 
    
  }
}