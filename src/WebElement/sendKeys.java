package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement UN=driver.findElement(By.xpath("//input[@id='email']"));
		UN.sendKeys("Mayur");
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("Kavyansh");
		
		
	}

}
