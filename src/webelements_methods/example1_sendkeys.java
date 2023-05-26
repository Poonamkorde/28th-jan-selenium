package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendkeys 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		WebElement UN=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		UN.sendKeys("abc");
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("xyz");
		
		//	driver.findElement(By.xpath("")).click("");
	}

}
