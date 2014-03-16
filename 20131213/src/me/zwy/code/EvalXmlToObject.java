package me.zwy.code;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EvalXmlToObject {

	/**
	 * 解析XML中的数据保存为对象放入集合
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		ArrayList<Student> list = new ArrayList<Student>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse("Students.xml");
		NodeList students = doc.getElementsByTagName("student");
		for(int i = 0;i < students.getLength();i++){
			Student stu = new Student();
			Node name = doc.getElementsByTagName("name").item(i);
			stu.setName(name.getFirstChild().getNodeValue());
			Node age = doc.getElementsByTagName("age").item(i);
			stu.setAge(Integer.parseInt(age.getFirstChild().getNodeValue()));
			Node tel = doc.getElementsByTagName("tel").item(i);
			stu.setTel(tel.getFirstChild().getNodeValue());
			list.add(stu);
		}
		System.out.println(list);
	}

}
