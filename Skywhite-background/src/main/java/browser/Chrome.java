package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;

public class Chrome {

	static WebDriver driver;

	public static WebDriver openBrowser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Set SkyWhite Background\\Chrome driver\\chromedriver.exe");

		driver = new ChromeDriver();
		//driver.get("https://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		System.out.println("Chrome browser opened");
		return driver;
	}


	//@After
	public static WebDriver closeBrowser() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		System.out.println("Chrome browser Closed");

		return driver;

	}
	
}
