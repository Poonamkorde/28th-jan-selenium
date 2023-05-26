package Listbox_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2selectoptionfrommuliselactablelistbox 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/automation%20class/selenium/selectmultitabSample6.html");
		//step1:
		WebElement SelectCountry=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s=new Select(SelectCountry);
		//s.selectByVisibleText("Aus");
		s.selectByIndex(0);
	}

}
