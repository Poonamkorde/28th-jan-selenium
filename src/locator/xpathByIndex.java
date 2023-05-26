package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByIndex 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//enterFN
		driver.findElement( By.xpath("(//input[@type='text'])[2]")).sendKeys("Poonam");
		//enterLN
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Korde");
		
	}

}
