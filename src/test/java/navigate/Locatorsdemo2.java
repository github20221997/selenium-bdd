package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsdemo2 {
	public static void main(String[] args)  throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement ele1= driver.findElement(By.id("email"));
		Thread.sleep(2000);
		ele1.sendKeys("jeevi123@gmail.com");
		WebElement ele2= driver.findElement(By.name("pass"));
		ele2.sendKeys("facebook@123");
		WebElement ele3=driver.findElement(By.className("_61th"));
		ele3.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
