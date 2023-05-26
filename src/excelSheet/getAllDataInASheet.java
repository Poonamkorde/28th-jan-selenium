package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel\\28thjaneve.xlsx");
		org.apache.poi.ss.usermodel.Sheet sh=WorkbookFactory.create(file).getSheet("sheet3");
		
		int lastRowIndex=sh.getLastRowNum();
		int LastcellIndex=sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastRowIndex;i++) 
		{
			for(int j=0;j<=LastcellIndex;j++)
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
