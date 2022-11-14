package navigate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrptdemo3 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,300,0)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,300,0)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		jse.executeScript("window.location= 'https://www.google.com'");
		jse.executeScript("document.getElementsByName('q')[0].value='vellore Fort'");
		
		
	}
	

}
