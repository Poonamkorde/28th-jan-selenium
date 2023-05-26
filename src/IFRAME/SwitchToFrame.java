package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@type='button']]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		driver.findElement(By.xpath("//button[contains (text(),'Click me to display')]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}

}

