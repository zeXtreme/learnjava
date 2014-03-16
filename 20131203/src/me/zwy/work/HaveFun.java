package me.zwy.work;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class HaveFun {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i <= 100; i++) {//通过循环控制产生的文件夹个数，i为文件夹名
			String path = "D:/test/" + i;// 文件夹path
			File file = new File(path);// 文件夹对象
			if(file.mkdirs()){// 创建文件夹
				int filesCount = new Random().nextInt(5) + 1;// 创建随机个文件的个数
				for (int j = 0; j < filesCount; j++) {
					String str = "";// 定义字符串
					for (int k = 0; k < 3; k++) {//通过循环控制字符串中随机字符的个数
						str += ((char) (new Random().nextInt(26) + 97));// 通过ASCII码随机产生a-z字符并拼接成字符串
					}
					String filePath = path + "/" + str + ".txt";
					File files = new File(filePath);
					files.createNewFile();// 创建文件
					String text = "";//定义文本中的内容
					for (int k = 0; k < new Random().nextInt(1000)+1; k++) {//随机生成多个字符
						text += ((char) (new Random().nextInt(26) + 97));//拼接字符串
					}
					FileWriter fw = new FileWriter(files);//字符流
					BufferedWriter bw = new BufferedWriter(fw);//缓冲字符流（包装）
					bw.write(text);//写入字符串
					bw.flush();
					bw.close();
				}
			}
		}
		System.out.println("看看你D盘的test文件夹！");
	}

}
