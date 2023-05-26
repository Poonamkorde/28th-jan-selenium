package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute
{
	public static void main(String[] args) throws InterruptedException
	{
		//send input in email id
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc");
		
		Thread.sleep(2000);
		//get attribute value present in email id
		String text=driver.findElement(By.xpath("//input[@id=\"email\"]")).getAttribute("value");
		System.out.println(text);
		
	}

}
