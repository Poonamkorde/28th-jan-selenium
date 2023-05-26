package practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class d4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel//28thjaneve.xlsx");
  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
         int getLastRowIndex=sh.getLastRowNum();
        int getLastCellIndex= sh.getRow(0).getLastCellNum()-1;
        for(int i=0;i<=getLastRowIndex;i++)
        {
        	for(int j=0;j<=getLastCellIndex;j++)
        	{
        		   String value=sh.getRow(i).getCell(j).getStringCellValue();
        		   System.out.print(value+" ");
        		
        	}
        	System.out.println();
        }
        
     
        


	}

}
