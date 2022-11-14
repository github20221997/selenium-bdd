package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//div[@class='FPdoLclJ9FBc']//input[1]"));
		WebElement ele2=driver.findElement(By.xpath("//div[@class='FPdoLclJ9FBc']//input[2]"));	
		WebElement ele3=driver.findElement(By.linkText("Gmail"));
		System.out.println(ele1.getCssValue("background Color"));
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border'3px solid red'",ele1);
		jse.executeScript("arguments[0].style.border'3px solid red'",ele2);
		jse.executeScript("arguments[0].style.background Color='rgb(0,200,0)'",ele1);
		jse.executeScript("arguments[0].click()",ele3);
		
		
	}

}
