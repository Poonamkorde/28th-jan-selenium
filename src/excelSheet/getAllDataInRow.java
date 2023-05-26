package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllDataInRow 
{
public static void main(String[] args) throws FileNotFoundException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation class\\excel\\28thjaneve.xlsx");
	//Sheet sh=(Sheet) WorkbookFactory.create(file).getSheet("Sheet1")
			//int LastCellIndex=sh.getRow(0).getLastCellNum()-1;
	
	
}
}
