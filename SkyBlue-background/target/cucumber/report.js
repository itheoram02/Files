$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Alain Mickey/Desktop/All Java project____eclipse/maven projects/DATA_DRIVEN (for submission)/Set SkyBlue Background/src/test/java/features/set_sky_blue_background.feature");
formatter.feature({
  "line": 1,
  "name": "Set SkyBlue Background",
  "description": "",
  "id": "set-skyblue-background",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "SkyBlue Background",
  "keyword": "Given "
});
formatter.match({
  "location": "SkyblueSteps.skyblue_Background()"
});
formatter.result({
  "duration": 230332900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "1 user will be able to click on Set SkyBlue Background button",
  "description": "",
  "id": "set-skyblue-background;1-user-will-be-able-to-click-on-set-skyblue-background-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user will open the chrome browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user will go to the \"\u003chttps://techfios.com/test/101/index.php\u003e\" website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "users click on set to SkyBlue Background  button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "background color will set to SkyBlue Background and take screenshoot",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user will close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SkyblueSteps.user_will_open_the_chrome_browser()"
});
formatter.result({
  "duration": 4542370100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003chttps://techfios.com/test/101/index.php\u003e",
      "offset": 21
    }
  ],
  "location": "SkyblueSteps.user_will_go_to_the_website(String)"
});
formatter.result({
  "duration": 691730900,
  "status": "passed"
});
formatter.match({
  "location": "SkyblueSteps.users_click_on_set_to_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 2115001600,
  "status": "passed"
});
formatter.match({
  "location": "SkyblueSteps.background_color_will_set_to_SkyBlue_Background_and_take_screenshoot()"
});
formatter.result({
  "duration": 2339784400,
  "status": "passed"
});
formatter.match({
  "location": "SkyblueSteps.user_will_close_the_browser()"
});
formatter.result({
  "duration": 5765666300,
  "status": "passed"
});
});