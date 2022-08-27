$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/featuresfiles/PrintGoogle.feature");
formatter.feature({
  "name": "Verify google search functionality in chrome",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search bdd in google search box",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.PrintGoogle.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter bdd in searcch box",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.PrintGoogle.user_enter_bdd_in_searcch_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.PrintGoogle.user_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
});