package me.zwy.work;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ����һ����ϵ�˹���ϵͳ��������ϵ�˵���ӡ���ѯ���޸ĺ���ʾ��
 * �������к���������ݣ��رպ�Ҫ������ӵ����ݣ����´����е�ʱ������ʾ������
 * ��ʾ�˵����£�
 * 1.��ʾ��������
 * 2.�������ϵ��
 * 3.������ϵ�ˣ��������֣�
 * 4.ɾ����ϵ��
 * 5.�޸���ϵ��
 * 6.�˳�
 * @author Zeng
 *
 */
public class Demo {

	static ArrayList contacts = new ArrayList();
	static Scanner scan = new Scanner(System.in);
	static final File FILE_NAME = new File("Contacts.dat");
	
	public static void main(String[] args) throws Exception {
		try{
			if(FILE_NAME.exists()){
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
				contacts = (ArrayList)ois.readObject();
				ois.close();
			}
		}catch (EOFException io){	
		}finally{
			System.out.println("=================��ϵ�˹���ϵͳ==================");
			while(true){
				System.out.println("1.��ʾ������ϵ�� 2.�������ϵ�� 3.������ϵ�� 4.ɾ����ϵ�� 5.�޸���ϵ�� 6.�˳�ϵͳ");
				System.out.print("����������Ҫ���еĲ�����1-6����");
				int choose = scan.nextInt();
				if(choose == 1){
					showALL();
				}else if(choose == 2){
					creatContact();
				}else if(choose == 3){
					findByName();
				}else if(choose == 4){
					deleteContact();
				}else if(choose == 5){
					changeContact();
				}else if(choose == 6){
					exit();
					scan.close();
					break;
				}else{
					System.out.println("�������������1-6��ѡ�");
				}
			}
		}
	}
	
	/**
	 * ��ʾ��������
	 */
	public static void showALL(){
		System.out.println("����"+"\t"+"����"+"\t"+"�绰");
		if(contacts.size() == 0){
			System.out.println("û����ϵ�ˣ�����ӣ�");
		}else{
			for(int i=0;i<contacts.size();i++){
				Contact c = (Contact)contacts.get(i);
				System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getTel());
			}
		}
		
	}
	
	/**
	 * �������ϵ��
	 * @throws Exception 
	 */
	public static void creatContact() throws Exception{
		Contact c = new Contact();
		System.out.print("��������ϵ��������");
		c.setName(scan.next());
		System.out.print("��������ϵ�����䣺");
		c.setAge(scan.nextInt());
		System.out.print("��������ϵ�˵绰��");
		c.setTel(scan.next());
		contacts.add(c);
		System.out.println("��ӳɹ���");
		saveData();
	}
	
	/**
	 * ������ϵ�ˣ��������֣�
	 * @throws Exception 
	 */
	public static void findByName(){
		System.out.print("����������Ҫ���ҵ���ϵ�˵����֣�");
		String cname = scan.next();
		Contact c = null;
		for(int i=0;i<contacts.size();i++){
			c = (Contact)contacts.get(i);
			if(c.getName().equals(cname)){
				break;
			}else{
				c = null;
			}
		}
		if(c == null){
			System.out.println("û�������ϵ��");
		}else{
			System.out.println("����"+"\t"+"����"+"\t"+"�绰");
			System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getTel());
		}
	}
	
	/**
	 * ɾ����ϵ��
	 * @throws Exception 
	 */
	public static void deleteContact() throws Exception{
		System.out.print("������Ҫɾ������ϵ�˵����֣�");
		String cname = scan.next();
		Contact c = null;
		for(int i=0;i<contacts.size();i++){
			c = (Contact)contacts.get(i);
			if(c.getName().equals(cname)){
				break;
			}else{
				c = null;
			}
		}
		if(c == null){
			System.out.println("û�������ϵ��");
		}else{
			contacts.remove(c);
			System.out.println("ɾ���ɹ���");
		}
		saveData();
	}
	
	/**
	 * �޸���ϵ��
	 * @throws Exception 
	 */
	public static void changeContact() throws Exception{
		System.out.print("������Ҫ�޸ĵ���ϵ�˵����֣�");
		String cname = scan.next();
		Contact c = null;
		for(int i=0;i<contacts.size();i++){
			c = (Contact)contacts.get(i);
			if(c.getName().equals(cname)){
				break;
			}else{
				c = null;
			}
		}
		if(c == null){
			System.out.println("û�������ϵ��");
		}else{
			System.out.print("�������µ�������");
			c.setName(scan.next());
			System.out.print("�������µ����䣺");
			c.setAge(scan.nextInt());
			System.out.print("�������µĵ绰��");
			c.setTel(scan.next());
			System.out.println("�޸ĳɹ���");
		}
		saveData();
	}
	
	/**
	 * �˳�
	 * @throws Exception
	 */
	public static void exit() throws Exception{
		saveData();
		System.out.println("лл����ʹ��");
	}
	
	/**
	 * ��������
	 * @throws Exception
	 */
	public static void saveData() throws Exception{
		//����������
		Collections.sort(contacts);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
		oos.writeObject(contacts);
		oos.flush();
		oos.close();
	}

}
