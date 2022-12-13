import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XML {

    public static void createXml() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element mainElement = document.createElement("departments");
        document.appendChild(mainElement);

        Element depOne = document.createElement("department");
        mainElement.appendChild(depOne);

        Element name = document.createElement("name");
        name.appendChild(document.createTextNode("HR"));
        depOne.appendChild(name);

        Element email = document.createElement("email");
        email.appendChild(document.createTextNode("hr@oracle.com"));
        depOne.appendChild(email);

        Element depTwo = document.createElement("department");
        mainElement.appendChild(depTwo);

        Element fName = document.createElement("firstname");
        fName.appendChild(document.createTextNode("IT"));
        depTwo.appendChild(fName);

        Element emailTwo = document.createElement("email");
        emailTwo.appendChild(document.createTextNode("it@java.com"));
        depTwo.appendChild(emailTwo);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("dep.xml"));
        transformer.transform(domSource, streamResult);

    }

}
