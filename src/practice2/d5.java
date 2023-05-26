package practice2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d5
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcd");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//String text=driver.switchTo().alert().getText();
	//System.out.println(text);
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
	Alert alt=driver.switchTo().alert();
	String text=alt.getText();
	alt.accept();
	alt.accept();
	//alt.dismiss();
}
}
