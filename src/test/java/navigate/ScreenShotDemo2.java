package navigate;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo2 {
	public static void main(String[] args) throws Exception{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement ele1=driver.findElement(By.name("q"));
	ele1.sendKeys("Sai baba images"+Keys.ENTER);
	TakesScreenshot tks =(TakesScreenshot)driver;
	File temp=tks.getScreenshotAs(OutputType.FILE);
	File perm=new File("./proof/Saibaba.png");
	FileUtils.copyFile(temp, perm);
	}
	
	
	
	
	
	
	
		
	}


