import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireDemo {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https:// www.google.com");
	String url= driver.getCurrentUrl();
	if(url.equals("https://www.google.com/"))
	{
		System.out.println(url+": is correct");
	}
	else
	{System.out.println(url+": is Incorrect");
	
	}
	String title = driver.getTitle();
	if(title.equals("Google"))
	{
		System.out.println(title+":TITLE IS MATCHED");
		
	}
	else
	{
		System.out.println(title+"TITLE NOT MATCHED");
	}
	
	Thread.sleep(5000);
	driver.close();
	
		
		
	}

}
