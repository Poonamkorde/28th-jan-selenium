package IFRAME;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		File dest=new File("C:\\Users\\Lenovo\\Desktop\\Screenshot1\\abc.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src,dest);
		
		
		
	}

}
