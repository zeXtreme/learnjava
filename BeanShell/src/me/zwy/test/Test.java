package me.zwy.test;

import bsh.EvalError;
import bsh.Interpreter;

public class Test {

	public static void main(String[] args) {
		Interpreter bsh = new Interpreter();
		String str = "1+2";
		try {
			bsh.eval("result=" + str);
			System.out.println(bsh.get("result"));
		} catch (EvalError e) {
			e.printStackTrace();
		}
	}

}
