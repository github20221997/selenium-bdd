package navigate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlDrpDemo {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//select[@id='first']"));
		Select s= new Select(ele1);
		Thread.sleep(4000);
		s.selectByVisibleText("Iphone");
		
		Thread.sleep(4000);
		s.selectByValue("Microsoft");
		List<WebElement> op= s.getOptions();
		for(int i=0; i<op.size();i++)
		{
			System.out.println(op.get(i).getText());
		}
		WebElement ele2=driver.findElement(By.xpath("//select[@id='second']"));
		Select s1= new Select(ele2);
		s1.selectByIndex(1);
		s1.selectByVisibleText("Burger");
		List<WebElement>all= s1.getAllSelectedOptions();
		for(WebElement k:all)
		{
			System.out.println(k.getText());
			
			
		}
		WebElement fs= s1.getFirstSelectedOption();
		System.out.println(fs.getText());
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}
	

}
