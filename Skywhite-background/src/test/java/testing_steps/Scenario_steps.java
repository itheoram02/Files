package testing_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browser.Chrome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WhiteB_ground;

public class Scenario_steps {
	
	WebDriver driver;
	WhiteB_ground color;
	
	
	
	@Given("^SkyWhite Background$")
	public void skywhite_Background() throws Throwable {
	  
	}

	@When("^user will open the browser$")
	public void user_will_open_the_browser() throws Throwable {
	    driver = Chrome.openBrowser();
	}

	@When("^user will go to the \"([^\"]*)\" website$")
	public void user_will_go_to_the_website(String arg1) throws Throwable {
	driver.get("https://techfios.com/test/101/index.php");
	}

	@When("^user will click on set skyblue button$")
	public void user_will_click_on_set_skyblue_button() throws Throwable {
		 color = PageFactory.initElements(driver, WhiteB_ground.class);
		 color.blue_background();
		 
		 
		 
	}

	@When("^user will click on set skywhite button$")
	public void user_will_click_on_set_skywhite_button() throws Throwable {
		color.whiteB_ground();
	}

	@When("^user will take screenshoot$")
	public void user_will_take_screenshoot() throws Throwable {
		color.takescreenshhot();
	}
	@Then("^user will close the browser$")
	public void user_will_close_the_browser() throws Throwable {
	   driver = Chrome.closeBrowser();
	}

}
