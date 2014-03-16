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
		//创建Excel文档
		WritableWorkbook workbook = Workbook.createWorkbook(new File("helloworld.xls"));
		//创建一个工作簿
		WritableSheet sheet = workbook.createSheet("第一个sheet", 0);
		//创建一个单元格格式
		WritableFont font = new WritableFont(WritableFont.createFont("微软雅黑"), 20, WritableFont.BOLD);
		WritableCellFormat format = new WritableCellFormat(font);
		WritableCellFormat numformat = new WritableCellFormat(NumberFormats.INTEGER);
		//创建一个label
		Label label = new Label(0, 0, "第一行第一列", format);
		//把label添加到excel单元格中
		sheet.addCell(label);
		//创建一个number
		Number number = new Number(0, 1, 1, numformat);
		//把number添加到excel单元格中
		sheet.addCell(number);
		//编辑结束后写到文件
		workbook.write();
		workbook.close();
		
		//读取excel文档
		Workbook work = Workbook.getWorkbook(new File("helloworld.xls"));
		//读取第一个工作簿
		Sheet s = work.getSheet(0);
		//读取第一列第一行
		Cell a1 = s.getCell(0, 0);
		//读取第一列第二行
		Cell a2 = s.getCell(0, 1);
		//输出内容
		LabelCell lab = (LabelCell) a1;
		NumberCell num = (NumberCell) a2;
		System.out.println(lab.getString() + "\n" + (int)num.getValue());
		//关闭文件
		work.close();
	}

}
