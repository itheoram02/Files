package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browser.Browserfactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SkyBlue;

public class SkyblueSteps {
	WebDriver driver;
	SkyBlue blue ;
	
	@Given("^SkyBlue Background$")
	public void skyblue_Background() throws Throwable {
	   
	}

	@When("^user will open the chrome browser$")
	public void user_will_open_the_chrome_browser() throws Throwable {
		 driver = Browserfactory.openBrowser(); 
	}

	@When("^user will go to the \"([^\"]*)\" website$")
	public void user_will_go_to_the_website(String website) throws Throwable {
		String url = "https://techfios.com/test/101/";
		driver.get(url);
	}

	@When("^users click on set to SkyBlue Background  button$")
	public void users_click_on_set_to_SkyBlue_Background_button() throws Throwable {
		
		 blue = PageFactory.initElements(driver, SkyBlue.class);
		 blue.blue_background();
	}

	@When("^background color will set to SkyBlue Background and take screenshoot$")
	public void background_color_will_set_to_SkyBlue_Background_and_take_screenshoot() throws Throwable {
	    blue.takescreenshhot();
	}

	@Then("^user will close the browser$")
	public void user_will_close_the_browser() throws Throwable {
		driver =  Browserfactory.closeBrowser();
	}
}
