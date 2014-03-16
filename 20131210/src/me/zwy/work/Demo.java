package me.zwy.work;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Demo {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = fac.newDocumentBuilder();
		Document doc = b.parse("cdcatalog.xml");
		Element root = doc.getDocumentElement();
		System.out.println("<" + root.getNodeName() + ">");
		NodeList cd = doc.getElementsByTagName("cd");
		for(int i = 0;i < cd.getLength();i++){
			System.out.println(" <" + cd.item(i).getNodeName() + ">");
			NodeList child = cd.item(i).getChildNodes();
			for(int j = 0;j < child.getLength();j++){
				if(!(child.item(j) instanceof Text)){
					System.out.print("  <" + child.item(j).getNodeName() + ">");
					System.out.print(child.item(j).getFirstChild().getNodeValue());
					System.out.println("</" + child.item(j).getNodeName() + ">");
				}
			}
			System.out.println(" </" + cd.item(i).getNodeName() + ">");
		}
		System.out.println("</" + root.getNodeName() + ">");
	}

}
