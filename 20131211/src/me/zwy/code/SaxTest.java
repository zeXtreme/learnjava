package me.zwy.code;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SaxTest {

	public static void main(String[] args) throws Exception{
		XMLReader handler = XMLReaderFactory.createXMLReader();
		
		MyHandler2 process = new MyHandler2();
		
		handler.setContentHandler(process);
		
		handler.parse("a.xml");
	}

}
