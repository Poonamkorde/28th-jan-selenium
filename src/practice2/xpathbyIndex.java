package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);
		//send first name in username field using index
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Poonam");
		//send last name in last name using index
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Korde");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9960368754");
	}

}
