package pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlue {
	public  SkyBlue (WebDriver driver){
		this.driver = driver;
	}
	 WebDriver driver;
	 
@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")WebElement SKY_BLUE_BUTTON;	 

public void blue_background() throws Throwable {
	Thread.sleep(2000);
	SKY_BLUE_BUTTON.click();
}
public void takescreenshhot() throws Throwable {
	
	Thread.sleep(2000);
	TakesScreenshot ts = ((TakesScreenshot) driver);
	SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
	Date date = new Date();
	String label = formatter.format(date);
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);

	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));
} 
}
