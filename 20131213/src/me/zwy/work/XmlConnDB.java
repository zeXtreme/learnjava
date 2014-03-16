package me.zwy.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlConnDB {

	public static void main(String[] args) throws Exception{
		String driver = null;
		String url = null;
		String user = null;
		String pwd = null;
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("Sqlconn.xml");
		NodeList sqls = doc.getElementsByTagName("sql");
		for(int i = 0;i < sqls.getLength();i++){
			Node sql = sqls.item(i);
			NamedNodeMap attrs = sql.getAttributes();
			for(int j = 0;j <attrs.getLength();j++){
				Node attr = attrs.item(j);
				if(attr.getNodeValue().equals("oracle")){
					driver = doc.getElementsByTagName("driver").item(i).getFirstChild().getNodeValue();
					url = doc.getElementsByTagName("url").item(i).getFirstChild().getNodeValue();
					user = doc.getElementsByTagName("user").item(i).getFirstChild().getNodeValue();
					pwd = doc.getElementsByTagName("pwd").item(i).getFirstChild().getNodeValue();
				}
			}
		}
		Class.forName(driver);
		Connection conn= DriverManager.getConnection(url, user, pwd);
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from dept2");
		while(rs.next()){
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
		if(rs.first()){
			System.out.println("已经回到第一条记录");
		}
	}

}
