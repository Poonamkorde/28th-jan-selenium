package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9881216753");//FN
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz@12");//password
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();//click on login
	}

}
