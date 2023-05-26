package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToChildWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on new tab of main page
		//click on new tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		//get child window ID
      Set<String> allIds=driver.getWindowHandles();//this syntax for get all ids like main page and other all windows
    //main page ID(0), Child window ID(1)

//	main page ID,child Window ID	

ArrayList<String> al=new ArrayList<String>(allIds);

String childWindowID=al.get(1);

//switch to child window
driver.switchTo().window(childWindowID);//string child window id

//click on training link from child window

driver.findElement(By.xpath("//span[text()='Training']")).click();




	}

}
