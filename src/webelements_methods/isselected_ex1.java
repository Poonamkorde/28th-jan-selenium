package webelements_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class isselected_ex1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		//female button is selected or not
		
		boolean result=driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]")).isSelected();
		System.out.println(result);
	if(result)
	{
		System.out.println("Radio button selected");
	}
	else
	{
		System.out.println("Radio button not selected");
		
	}
		
	}

}
