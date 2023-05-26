package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_ScrollRightLeft
{
	public static void main(String[] args) throws InterruptedException
	{
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//For Scroll right
			((JavascriptExecutor)driver).executeScript("window.scrollBy(200,0)");
			
			Thread.sleep(2000);
			//for scrolll left
			((JavascriptExecutor)driver).executeScript("window.scrollBy(-100,0)");
			
			
		}
		
	}

}
