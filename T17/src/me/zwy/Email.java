package me.zwy;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "zerozwy@163.com";

		if (email.indexOf("@") > 0
				&& email.indexOf("@") == email.lastIndexOf("@")
				&& email.indexOf(".") == email.lastIndexOf(".")
				&& email.indexOf(".") - email.indexOf("@") > 1
				&& email.indexOf(".") < email.length()) {
			System.out.println("�������������Ч");
			if (email.substring(email.indexOf("@")).equals("@163.com")) {
				System.out.println("���������163����");
			}
		} else {
			System.out.println("�������������Ч");
		}

	}

}
