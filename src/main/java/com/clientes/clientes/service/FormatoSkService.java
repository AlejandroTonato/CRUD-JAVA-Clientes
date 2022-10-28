package com.clientes.clientes.service;

import com.clientes.clientes.model.FormatoSk;
import com.clientes.clientes.model.FormatoTh;
import com.clientes.clientes.repository.IFormatoSkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;

@Service
public class FormatoSkService implements IFormatoSkService{
    @Autowired
    private IFormatoSkRepository formatoSkRepo;
    @Override
    public List<FormatoSk> findAll() {

        return formatoSkRepo.findAll();
    }

    @Override
   public FormatoSk create(FormatoSk formatoSk) {
       return formatoSkRepo.save(formatoSk);
   }
    public void cargarXML(){
        try {
            File archivo = new File("C:\\Formato\\th_formato.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);
            document.getDocumentElement().normalize();
            System.out.println("\nLos beneficios XML son: ");
            NodeList listaEmpleados = document.getElementsByTagName("beneficios");
            for (int i = 0; i < listaEmpleados.getLength(); i++) {
                // Cojo el nodo actual
                Node nodo = listaEmpleados.item(i);
                // Compruebo si el nodo es un elemento
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    // Lo transformo a Element
                    Element e = (Element) nodo;
                    // Obtengo sus hijos
                    NodeList hijos = e.getChildNodes();
                    // Recorro sus hijos
                    for (int j = 0; j < hijos.getLength(); j++) {
                        // Obtengo al hijo actual
                        Node hijo = hijos.item(j);
                        // Compruebo si es un nodo
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            // Muestro el contenido
                            System.out.println("beneficio: " +  hijo.getTextContent());
                        }
                    }
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
