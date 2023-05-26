package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyText
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on forgotten password
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//click on create new account using text
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//click on create new account using contains
		//driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		//enter text in login id field using contains(ie.partial text)
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abcd");
		//enter text in password field using contains(ie.partial text)

		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("1234");
		
	}

}
