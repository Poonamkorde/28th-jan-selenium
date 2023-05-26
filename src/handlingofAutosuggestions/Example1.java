package handlingofAutosuggestions;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("samsung");;
		Thread.sleep(2000);
		
		java.util.List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));

		String expText="samsung s23";
		
		for(WebElement s1: allOptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}	
	}


	
	
}