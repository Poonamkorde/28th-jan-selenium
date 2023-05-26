package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement English=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",English);
	
	
}
}

