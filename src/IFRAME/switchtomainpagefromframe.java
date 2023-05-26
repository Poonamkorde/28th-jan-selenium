package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtomainpagefromframe 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("iframeResult");//switch to outer frame
	//get the text inside outer frame
	String text=driver.findElement(By.xpath("//body[@contenteditable='false']")).getText();
System.out.println(text);

//switch to inner frame

	driver.switchTo().frame(driver.findElement (By.xpath("//iframe[@src='demo_iframe.htm']")));
	
	
	//get the text inside inner frame
	
	String text1=driver.findElement(By.xpath("//body[@style='background-color:powderblue']")).getText();
	System.out.println(text1);
	driver.switchTo().parentFrame();
	driver.switchTo().parentFrame();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
}
}

