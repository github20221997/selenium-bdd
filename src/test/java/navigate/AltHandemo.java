package navigate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AltHandemo {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.tnstc.in/home.html");
	driver.manage().window().maximize();
	WebElement ele1 =driver.findElement(By.id("matchStartPlace"));
	ele1.sendKeys("CHENNAI COIMBADE");
	WebElement ele2= driver.findElement(By.xpath("//a[@class='btnTxt']"));
	ele2.click();
	Thread.sleep(4000);
	Alert alt=driver.switchTo().alert();
	String alttext=alt.getText();
	if(alttext.equals("'To' place is required."))
			{
		System.out.println("Correct statement");
		
			}
	else
	{
		System.out.println("Wrong Statement");
	}
	alt.accept();
	//alt.dismiss();
	
	
	
	
	
}
}
