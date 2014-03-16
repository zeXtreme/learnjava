package me.zwy.demo;

import opensource.jpinyin.PinyinFormat;
import opensource.jpinyin.PinyinHelper;

public class Demo {

	public static void main(String[] args) {
		//通过PinyinHelper获得中文的拼音
		String pinyin = 
				PinyinHelper.convertToPinyinString("拼音", " ", PinyinFormat.WITHOUT_TONE);//无声调的拼音,用空格分开
		System.out.println(pinyin);
	}

}
