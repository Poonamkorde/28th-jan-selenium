package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3getBooleanData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel\\28thjaneve.xlsx");
		
	boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow (0).getCell (3).getBooleanCellValue();
	
	
	System.out.println(value);
	
	}


}
