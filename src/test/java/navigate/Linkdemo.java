package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkdemo {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ele1= driver.findElement(By.linkText("gmail"));
		ele1.click();
		WebElement ele2= driver.findElement(By.partialLinkText("ma"));
		Thread.sleep(2000);
		ele2.click();
		driver.close();
	}
		

}
