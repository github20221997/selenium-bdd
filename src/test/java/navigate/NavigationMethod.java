package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.google.com");
				Thread.sleep(3000);
				driver.navigate().to("https://www.amazon");
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3000);
				driver.close();
	}

}
