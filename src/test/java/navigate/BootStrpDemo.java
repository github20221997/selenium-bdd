package navigate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrpDemo {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/boostrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement ele1= driver.findElement(By.id("menul"));
		ele1.click();
		List<WebElement> ls=driver.findElements(By.xpath("//u1[@class='dropdown-menu']//li/a"));
	for(WebElement k:ls)
	{
		if(k.getText().equals("JavaScript"))
		{k.click();
	}
	}
	Thread.sleep(6000);
	driver.close();
	}
	
		
		
		
		
		
	}
	


