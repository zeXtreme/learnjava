package me.zwy.demo;

import opensource.jpinyin.PinyinFormat;
import opensource.jpinyin.PinyinHelper;

public class Demo {

	public static void main(String[] args) {
		//ͨ��PinyinHelper������ĵ�ƴ��
		String pinyin = 
				PinyinHelper.convertToPinyinString("ƴ��", " ", PinyinFormat.WITHOUT_TONE);//��������ƴ��,�ÿո�ֿ�
		System.out.println(pinyin);
	}

}
