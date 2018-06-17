import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class ReadXMLFile {
  static public void main(String[] arg){
    
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setValidating(false);
    factory.setNamespaceAware(true);
    
    DocumentBuilder builder = factory.newDocumentBuilder();
    
    builder.setErrorHandler(new SimpleErrorHandler());
    
    Document document = builder.parse(new InputSource("question1.xml"));
    //This process reads through the XML file listed, and checks if it is well-formed
    }

    public class SimpleErrorHandler implements ErrorHandler {
        public void warning(SAXParseException e) throws SAXException {
            System.out.println(e.getMessage());
        }
    
        public void error(SAXParseException e) throws SAXException {
            System.out.println(e.getMessage());
        }
    
        public void fatalError(SAXParseException e) throws SAXException {
            System.out.println(e.getMessage());
        }
    }
    //if the XML is not well formed, it will pass an error
}