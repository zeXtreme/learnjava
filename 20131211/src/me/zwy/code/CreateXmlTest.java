package me.zwy.code;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerFactory;
//import javax.xml.transform.dom.DOMSource;
//import javax.xml.transform.stream.StreamResult;

import org.apache.crimson.tree.XmlDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXmlTest {

	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();//����һ���յ��ĵ�����
		Element root = doc.createElement("root");
		doc.appendChild(root);//���ĵ������һ����Ԫ��
		Element java = doc.createElement("java");
		Element price = doc.createElement("price");
		Element name = doc.createElement("name");
		Text content_java = doc.createTextNode("java����ʦ");
		Text content_price = doc.createTextNode("5000");
		name.appendChild(content_java);
		price.appendChild(content_price);
		java.appendChild(name);
		java.appendChild(price);
		root.appendChild(java);
		
//		DOMSource dom = new DOMSource(doc);
//		Transformer trans = TransformerFactory.newInstance().newTransformer();
//		StreamResult target = new StreamResult("java.xml");
//		trans.transform(dom, target);
//		System.out.println("����XML�ɹ�");
		
		XmlDocument xml = (XmlDocument) doc;
		xml.write(new FileOutputStream("d:/java.xml"));
	}

}
