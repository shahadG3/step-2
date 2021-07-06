package webAppDeom;

import java.net.MalformedURLException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestNG1 {
	
	public static WebDriver driver = null;
	
	
public static void main(String []args)throws InterruptedException, MalformedURLException {
	
	
		System.setProperty("webDriver.chrome.driver","D:\\shad\\eclipse\\WebAppDemo-\\WebDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.navigate().to("https://www.swiggy.com" );
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("https://www.swiggy.com")) 
			System.out.println("title matches");
		else
		   System.out.println(title);

		String login = "";
		login = driver.findElement(By.cssSelector("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")).getText();
		System.out.println(login);
		
		
		WebElement category = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5) "));
		Actions action = new Actions(driver);
		action.click();
		action.moveToElement(category).perform();
		Thread.sleep(2000);
		
		WebElement books = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)"));
		action.moveToElement(books);
		action.click();
		action.perform();
	
		Thread.sleep(3000);
	
	}

}


	
	