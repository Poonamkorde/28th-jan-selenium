package installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example
{
	public static void main(String[] args)
	{
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/fkf-nsbu-dez?authuser=1");
		driver.get("https://www.google.com");
		//driver.close();
		//driver.quit();
	}

}
