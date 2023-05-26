package ScrollUpDown;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ScrollUpDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//For Scroll down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		//for scroll Up
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
		
		
	}

}
