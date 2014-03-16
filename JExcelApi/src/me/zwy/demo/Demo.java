package me.zwy.demo;

import java.io.File;

import jxl.Cell;
import jxl.LabelCell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.NumberFormats;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Demo {

	public static void main(String[] args) throws Exception{
		//����Excel�ĵ�
		WritableWorkbook workbook = Workbook.createWorkbook(new File("helloworld.xls"));
		//����һ��������
		WritableSheet sheet = workbook.createSheet("��һ��sheet", 0);
		//����һ����Ԫ���ʽ
		WritableFont font = new WritableFont(WritableFont.createFont("΢���ź�"), 20, WritableFont.BOLD);
		WritableCellFormat format = new WritableCellFormat(font);
		WritableCellFormat numformat = new WritableCellFormat(NumberFormats.INTEGER);
		//����һ��label
		Label label = new Label(0, 0, "��һ�е�һ��", format);
		//��label��ӵ�excel��Ԫ����
		sheet.addCell(label);
		//����һ��number
		Number number = new Number(0, 1, 1, numformat);
		//��number��ӵ�excel��Ԫ����
		sheet.addCell(number);
		//�༭������д���ļ�
		workbook.write();
		workbook.close();
		
		//��ȡexcel�ĵ�
		Workbook work = Workbook.getWorkbook(new File("helloworld.xls"));
		//��ȡ��һ��������
		Sheet s = work.getSheet(0);
		//��ȡ��һ�е�һ��
		Cell a1 = s.getCell(0, 0);
		//��ȡ��һ�еڶ���
		Cell a2 = s.getCell(0, 1);
		//�������
		LabelCell lab = (LabelCell) a1;
		NumberCell num = (NumberCell) a2;
		System.out.println(lab.getString() + "\n" + (int)num.getValue());
		//�ر��ļ�
		work.close();
	}

}
