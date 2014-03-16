package me.zwy.code;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler2 extends DefaultHandler {

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.print("<" + qName);
		for(int i = 0;i < attributes.getLength();i++){
			System.out.print(" " + attributes.getQName(i) + "=" + attributes.getValue(i));
		}
		System.out.print(">");
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.print("</" + qName + ">");
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.print(new String(ch,start,length));
	}
}
