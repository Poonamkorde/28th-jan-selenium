package practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1getAllDataInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel\\28thjaneve.xlsx");
		
	org.apache.poi.ss.usermodel.Sheet sh	=WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			String value=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}

}

