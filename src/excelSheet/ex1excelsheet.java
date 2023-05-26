package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1excelsheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

	FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel\\28thjaneve.xlsx");
	
	String value=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(value);
	}
	

}
