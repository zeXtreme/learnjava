package me.zwy.manage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		HashMap emp=new HashMap();
		int sal,choice;
		String eno,phoneNumber,name,position;
		System.out.println("                         Ա������ϵͳ");
		
		while(true){
			System.out.println("1����ѯԱ�� 2���鿴����Ա�� 3�������Ա�� 4���޸�Ա�� 5��ɾ��Ա�� 6���˳�");
			System.out.print("���������ѡ��");
			choice=scan.nextInt();
			
			if(choice==1){
				System.out.print("������Ա����ţ�");
				eno=scan.next();
				if(emp.containsKey(eno)){
					System.out.println("���                   ����                     ְλ                        �绰                      нˮ");
				System.out.println(emp.get(eno));
				}
				else{
					System.out.println("û�д�Ա��");
				}
			}
			
			if(choice==2){
				if(emp.isEmpty()){
					System.out.println("��û���Ա��");
				}
				else{
					System.out.println("���                   ����                     ְλ                        �绰                      нˮ");
					Iterator iterEmp=emp.entrySet().iterator();
					while(iterEmp.hasNext()){
						Entry entryEmp=(Entry) iterEmp.next();
						System.out.println(entryEmp.getValue());
					}
				}
			}
			
			if(choice==3){
				System.out.println("���Ա��");
				System.out.print("������Ա����ţ�");
				eno=scan.next();
				if(emp.containsKey(eno)){
					System.out.println("���д�Ա��");
					continue;
				}
				System.out.print("������Ա��������");
				name=scan.next();
				System.out.print("������Ա��ְλ��");
				position=scan.next();
				System.out.print("������Ա���绰��");
				phoneNumber=scan.next();
				System.out.print("������Ա��нˮ��");
				sal=scan.nextInt();
				Emp e=addEmp(eno,name,position,phoneNumber,sal);
				emp.put(e.getEno(), e);
			}
			
			if(choice==4){
				System.out.print("������Ա����ţ�");
				eno=scan.next();
				if(emp.containsKey(eno)){
					Emp e=(Emp)emp.get(eno);
					System.out.print("�������µ�������");
					name=scan.next();
					e.setName(name);
					System.out.print("�������µ�ְλ��");
					position=scan.next();
					e.setPosition(position);
					System.out.print("�������µĵ绰��");
					phoneNumber=scan.next();
					e.setPhoneNumber(phoneNumber);
					System.out.print("�������µ�нˮ��");
					sal=scan.nextInt();
					e.setSal(sal);
				}
				else{
					System.out.println("û�д�Ա��");
				}
			}
			
			if(choice==5){
				System.out.print("������Ա����ţ�");
				eno=scan.next();
				System.out.println("���                   ����                     ְλ                        �绰                      нˮ");
				System.out.println(emp.get(eno));
				String ch;
				System.out.println("���Ҫɾ���𣿣�y/n��");
				ch=scan.next();
				if(ch.equals("y")){
					emp.remove(eno);
				}
				else if(ch.equals("n")){
					continue;
				}
			}
			
			if(choice==6){
				break;
			}
			
		}

	}
	
	public static Emp addEmp(String eno,String name,String position,String phoneNumber,int sal){
		Emp emp=new Emp();
		emp.setEno(eno);
		emp.setName(name);
		emp.setPosition(position);
		emp.setPhoneNumber(phoneNumber);
		emp.setSal(sal);
		return emp;
	}
	
}
