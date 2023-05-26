package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//enter UN
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		//Thread.sleep(2000);
		WebElement UN=driver.findElement(By.xpath(""));
		UN.sendKeys("");
		
				
		
	}

}
