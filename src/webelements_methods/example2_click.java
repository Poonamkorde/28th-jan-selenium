package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_click 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	//String text=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
//	System.out.println(text);
	Thread.sleep(4000);
	
			boolean result=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
			
			System.out.println(result);
			
			if(result)
			{
				System.out.println("Element is Enabled");
			}
			else
			{
				System.out.println("Element is Enabled");	
			}
		}

			
		
	}


