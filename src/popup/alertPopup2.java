package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//switch To alert popup
		
		Alert alt=driver.switchTo().alert();
		
		//1:get text from alert popup
		
		String text=alt.getText();
		System.out.println(text);
		//2:click on ok button from alert popup
		alt.accept();
		//get text from second alert popup
		String text1=alt.getText();
		System.out.println(text1);
		//click on ok button from second alert popup
		alt.accept();
		//2:click on camcel button from alert popup
		alt.dismiss();
	}
	

}
