package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowsuizeinasheet
{
public static void main(String[] args) throws EncryptedDocumentException, IOException

{
	FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel\\28thjaneve.xlsx");

	int rowSize=WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
	System.out.println(rowSize);

}
}
