package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2AlertPopUp
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().timeouts().wait(2000);
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	driver.switchTo().alert().accept();
	
	
	
	
	
}
}
