package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import webelements_methods.webelements_isselected;

public class HandlingOfDropDown 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//click on close button
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	//step1
	WebElement login=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	//step2
	Actions act=new Actions(driver);
	//step3
	act.moveToElement(login).perform();
	Thread.sleep(2000);
	//click on wishlist element
	driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[4]")).click();
		
		
	}

}
