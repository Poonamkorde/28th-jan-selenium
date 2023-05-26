package webelements_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements_isselected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//click on create new account link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		boolean result=driver.findElement(By.xpath("abc")).isSelected();
		System.out.println(result);
		
		

}
}
