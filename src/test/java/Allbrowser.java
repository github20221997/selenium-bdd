import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allbrowser {
public static void main(String[] args) throws Exception {
	WebDriver driver=null;
	String Browsername= "Firefox";
	switch(Browsername)
	{
	case"Chrome":
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		break;
	case"Firefox":
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		break;
	case" Edge":
		System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		driver=new EdgeDriver();
		break;
		default:
			System.out.println("Please Enter correct Browser Name");
			break;
	}
	
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
