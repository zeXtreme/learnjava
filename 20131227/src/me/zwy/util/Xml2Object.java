package me.zwy.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Xml2Object {

	public static Set<Object> X2O(String xmlPath,@SuppressWarnings("rawtypes") Class className) {
		try {
			Set<Object> objs = new HashSet<Object>();
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlPath);
			NodeList list = doc.getElementsByTagName(className.getSimpleName());
			for(int i=0;i<list.getLength();i++){
				Object o = className.newInstance();
				NamedNodeMap attr = list.item(i).getAttributes();
				for(int j=0;j<attr.getLength();j++){
					Field f = className.getDeclaredField(attr.item(j).getNodeName());
					f.setAccessible(true);
					if(f.getType().getName().equals("int")){
						f.set(o, Integer.parseInt(attr.item(j).getNodeValue()));
					}else{
						f.set(o, attr.item(j).getNodeValue());
					}
				}
				NodeList childs = list.item(i).getChildNodes();
				for(int j=0;j<childs.getLength();j++){
					if(!(childs.item(j) instanceof Text)){
						Field f = className.getDeclaredField(childs.item(j).getNodeName());
						f.setAccessible(true);
						if(f.getType().getName().equals("int")){
							f.set(o, Integer.parseInt(childs.item(j).getFirstChild().getNodeValue()));
						}else{
							f.set(o, childs.item(j).getFirstChild().getNodeValue());
						}
					}
				}
				objs.add(o);
			}
			return objs;
		} catch (SAXException | IOException | ParserConfigurationException | InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException | DOMException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
