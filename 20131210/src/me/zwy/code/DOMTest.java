package me.zwy.code;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class DOMTest {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("code.xml");
		Element root = document.getDocumentElement();
		System.out.println("<" + root.getNodeName() + ">");
		NodeList javas = root.getElementsByTagName("java");
		for(int i = 0;i < javas.getLength();i++){
			Node java = javas.item(i);
			System.out.println(" <" + java.getNodeName() + ">");
			NodeList childrens = java.getChildNodes();
			for(int j = 0;j < childrens.getLength();j++){
				Node sub = childrens.item(j);
				if(!(sub instanceof Text)){
					System.out.print("  <" + sub.getNodeName() + ">");
					System.out.print(sub.getFirstChild().getNodeValue());
					System.out.println("</" + sub.getNodeName() + ">");
				}
			}
			System.out.println(" </" + java.getNodeName() + ">");
		}
	}

}
