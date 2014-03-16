package me.zwy.code;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class DomTest {

	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fac.newDocumentBuilder();
		Document doc = builder.parse("a.xml");
		Element root = doc.getDocumentElement();
		System.out.println("<" + root.getNodeName() + ">");
		NodeList persons = root.getElementsByTagName("PERSON");
		for(int i =0;i < persons.getLength();i++){
			Node person = persons.item(i);
			System.out.print(" <" + person.getNodeName());
			NamedNodeMap attrs= person.getAttributes();
			for(int j = 0;j < attrs.getLength();j++){
				Node attr = attrs.item(j);
				System.out.print(" " + attr.getNodeName() + "=\"" + attr.getNodeValue() + "\"");
			}
			System.out.println(">");
			NodeList child = person.getChildNodes();
			for(int j = 0;j < child.getLength();j++){
				Node sub = child.item(j);
				if(!(sub instanceof Text)){
					System.out.print("  <" + sub.getNodeName() + ">");
					System.out.print(sub.getFirstChild().getNodeValue());
					System.out.println("</" + sub.getNodeName() + ">");
				}
			}
			System.out.println(" </" + person.getNodeName() + ">");
		}
	}

}
