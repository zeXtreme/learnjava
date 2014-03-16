package me.zwy.code;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class DomTest2 {

	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fac.newDocumentBuilder();
		Document doc = builder.parse("a.xml");
		Element root = doc.getDocumentElement();
		
		printAnyXml(root);
	}
	
	public static void printAnyXml(Node node){
		if(node instanceof Text){
			System.out.print(node.getNodeValue());
		}else{
			System.out.print("<" + node.getNodeName() + ">");
			NodeList subs = node.getChildNodes();
			for(int i = 0;i < subs.getLength();i++){
				Node sub = subs.item(i);
				printAnyXml(sub);//调用自身进行递归
			}
			System.out.print("</" + node.getNodeName() + ">");
		}
	}

}
