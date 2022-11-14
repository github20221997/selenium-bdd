import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo{
	public static void main(String[]args)throws Exception
	{
	System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
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
	
}}
