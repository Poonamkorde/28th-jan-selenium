package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByusingTagname 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/automation%20class/selenium/tagname.html");
		//enter first name
		driver.findElement(By.tagName("input")).sendKeys("Poonam");
		driver.findElement(By.tagName("")).sendKeys("Korde");
		
	}

}
