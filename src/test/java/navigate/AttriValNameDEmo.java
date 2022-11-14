package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttriValNameDEmo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ele1= driver.findElement(By.name("q"));
		ele1.sendKeys("vellore Fort");
		String val = ele1.getAttribute("value");
		if(val.equals("vellore Fort"))
		{
			System.out.println("Matched");
		}
		else
		{
      System.out.println("unMatched");
	}
		String ttl= ele1.getAttribute("title");
				System.out.println(ttl);
	}}
