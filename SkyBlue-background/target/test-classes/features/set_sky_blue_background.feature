Feature: Set SkyBlue Background

Background:
 Given SkyBlue Background  
	
Scenario: 1 user will be able to click on Set SkyBlue Background button
    
	When user will open the chrome browser   
	When user will go to the "<https://techfios.com/test/101/index.php>" website  
	When users click on set to SkyBlue Background  button    
	And background color will set to SkyBlue Background and take screenshoot 
	Then user will close the browser  