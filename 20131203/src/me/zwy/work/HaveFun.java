package me.zwy.work;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class HaveFun {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i <= 100; i++) {//ͨ��ѭ�����Ʋ������ļ��и�����iΪ�ļ�����
			String path = "D:/test/" + i;// �ļ���path
			File file = new File(path);// �ļ��ж���
			if(file.mkdirs()){// �����ļ���
				int filesCount = new Random().nextInt(5) + 1;// ����������ļ��ĸ���
				for (int j = 0; j < filesCount; j++) {
					String str = "";// �����ַ���
					for (int k = 0; k < 3; k++) {//ͨ��ѭ�������ַ���������ַ��ĸ���
						str += ((char) (new Random().nextInt(26) + 97));// ͨ��ASCII���������a-z�ַ���ƴ�ӳ��ַ���
					}
					String filePath = path + "/" + str + ".txt";
					File files = new File(filePath);
					files.createNewFile();// �����ļ�
					String text = "";//�����ı��е�����
					for (int k = 0; k < new Random().nextInt(1000)+1; k++) {//������ɶ���ַ�
						text += ((char) (new Random().nextInt(26) + 97));//ƴ���ַ���
					}
					FileWriter fw = new FileWriter(files);//�ַ���
					BufferedWriter bw = new BufferedWriter(fw);//�����ַ�������װ��
					bw.write(text);//д���ַ���
					bw.flush();
					bw.close();
				}
			}
		}
		System.out.println("������D�̵�test�ļ��У�");
	}

}
