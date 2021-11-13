
package lab_poo8;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Lab_POO8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            Document documento = implementation.createDocument(null, "concesionario1", null);
            documento.setXmlVersion("1.0");

            Element coches = documento.createElement("coches");
            Element coche = documento.createElement("coche");

            System.out.println("Introduce la matrícula del coche ");

            Element matricula = documento.createElement("matricula");
            Text textMatricula = documento.createTextNode(sc.nextLine());
            matricula.appendChild(textMatricula);
            coche.appendChild(matricula);

            System.out.println("Introduce la marca del coche ");

            Element marca = documento.createElement("marca");
            Text textMarca = documento.createTextNode(sc.nextLine());
            marca.appendChild(textMarca);
            coche.appendChild(marca);

            System.out.println("Introduce el precio del coche");

            Element precio = documento.createElement("precio");
            Text textPrecio = documento.createTextNode(sc.nextLine());
            precio.appendChild(textPrecio);
            coche.appendChild(precio);

            coches.appendChild(coche);

            documento.getDocumentElement().appendChild(coches);

            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("concesionario1.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException ex) {

            System.out.println(ex.getMessage());

        }
    }
    
}
