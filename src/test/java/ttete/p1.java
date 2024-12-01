package ttete;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class p1 {
	
	
	@Test
	
	public void test() throws MalformedURLException, InterruptedException
	{
		System.out.println("test started");
		DesiredCapabilities d=new DesiredCapabilities();
		d.setBrowserName("chrome");
		d.setPlatform(Platform.WIN10);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.163:4444/wd/hub"), d);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("Title of the page is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		System.out.println("test ended");
	}
	
@Test
	
	public void test1() throws MalformedURLException, InterruptedException
	{
		System.out.println("test1 started");
		DesiredCapabilities d=new DesiredCapabilities();
		d.setBrowserName("chrome");
		d.setPlatform(Platform.WIN10);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.163:4444/wd/hub"), d);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Title of the page is:"+driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		System.out.println("test1 ended");
	}

@Test

public void test2() throws MalformedURLException, InterruptedException
{
	System.out.println("test2 started");
	DesiredCapabilities d=new DesiredCapabilities();
	d.setBrowserName("chrome");
	d.setPlatform(Platform.WIN10);
	
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.163:4444/wd/hub"), d);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println("Title of the page is:"+driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	System.out.println("test2 ended");
}

@Test

public void test3() throws MalformedURLException, InterruptedException
{
	System.out.println("test3 started");
	DesiredCapabilities d=new DesiredCapabilities();
	d.setBrowserName("chrome");
	d.setPlatform(Platform.WIN10);
	
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.163:4444/wd/hub"), d);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println("Title of the page is:"+driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	System.out.println("test3 ended");
}

}
