package navigate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelementsdemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	List<WebElement> ls =driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	 for(int i=0; i<ls.size();i++)
	 {
		 System.out.println(ls.get(i).getText());
	 }
	 for(int i=0; i<ls.size();i++)
	 {
		 if(ls.get(i).getText().equals("tamil"))
		 {
			 ls.get(i).click();
			 
		 }
	 }
		
	}

}
