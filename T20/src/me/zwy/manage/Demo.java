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
		System.out.println("                         员工管理系统");
		
		while(true){
			System.out.println("1、查询员工 2、查看所有员工 3、添加新员工 4、修改员工 5、删除员工 6、退出");
			System.out.print("请输入你的选择：");
			choice=scan.nextInt();
			
			if(choice==1){
				System.out.print("请输入员工编号：");
				eno=scan.next();
				if(emp.containsKey(eno)){
					System.out.println("编号                   姓名                     职位                        电话                      薪水");
				System.out.println(emp.get(eno));
				}
				else{
					System.out.println("没有此员工");
				}
			}
			
			if(choice==2){
				if(emp.isEmpty()){
					System.out.println("还没添加员工");
				}
				else{
					System.out.println("编号                   姓名                     职位                        电话                      薪水");
					Iterator iterEmp=emp.entrySet().iterator();
					while(iterEmp.hasNext()){
						Entry entryEmp=(Entry) iterEmp.next();
						System.out.println(entryEmp.getValue());
					}
				}
			}
			
			if(choice==3){
				System.out.println("添加员工");
				System.out.print("请输入员工编号：");
				eno=scan.next();
				if(emp.containsKey(eno)){
					System.out.println("已有此员工");
					continue;
				}
				System.out.print("请输入员工姓名：");
				name=scan.next();
				System.out.print("请输入员工职位：");
				position=scan.next();
				System.out.print("请输入员工电话：");
				phoneNumber=scan.next();
				System.out.print("请输入员工薪水：");
				sal=scan.nextInt();
				Emp e=addEmp(eno,name,position,phoneNumber,sal);
				emp.put(e.getEno(), e);
			}
			
			if(choice==4){
				System.out.print("请输入员工编号：");
				eno=scan.next();
				if(emp.containsKey(eno)){
					Emp e=(Emp)emp.get(eno);
					System.out.print("请输入新的姓名：");
					name=scan.next();
					e.setName(name);
					System.out.print("请输入新的职位：");
					position=scan.next();
					e.setPosition(position);
					System.out.print("请输入新的电话：");
					phoneNumber=scan.next();
					e.setPhoneNumber(phoneNumber);
					System.out.print("请输入新的薪水：");
					sal=scan.nextInt();
					e.setSal(sal);
				}
				else{
					System.out.println("没有此员工");
				}
			}
			
			if(choice==5){
				System.out.print("请输入员工编号：");
				eno=scan.next();
				System.out.println("编号                   姓名                     职位                        电话                      薪水");
				System.out.println(emp.get(eno));
				String ch;
				System.out.println("真的要删除吗？（y/n）");
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
