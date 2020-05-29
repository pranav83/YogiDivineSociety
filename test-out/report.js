$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/VeirfyLogoHeader.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Header and Logo",
  "description": "",
  "id": "verify-header-and-logo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SanityPack"
    }
  ]
});
formatter.before({
  "duration": 7732911100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "verify-header-and-logo;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Yogi Divine Society homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should verify logo and text",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on links on header menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to relevant page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on make donation link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to donation page",
  "keyword": "Then "
});
formatter.match({
  "location": "HeaderLogoStepDefs.i_am_on_Yogi_Divine_Society_homepage()"
});
formatter.result({
  "duration": 2832420100,
  "status": "passed"
});
formatter.match({
  "location": "HeaderLogoStepDefs.i_should_verify_logo_and_text()"
});
formatter.result({
  "duration": 201103400,
  "status": "passed"
});
formatter.match({
  "location": "HeaderLogoStepDefs.i_click_on_links_on_header_menu()"
});
formatter.result({
  "duration": 3238273800,
  "status": "passed"
});
formatter.match({
  "location": "HeaderLogoStepDefs.i_should_navigate_to_relevant_page()"
});
formatter.result({
  "duration": 12709919000,
  "status": "passed"
});
formatter.match({
  "location": "HeaderLogoStepDefs.i_click_on_make_donation_link()"
});
formatter.result({
  "duration": 730025200,
  "status": "passed"
});
formatter.match({
  "location": "HeaderLogoStepDefs.i_should_navigate_to_donation_page()"
});
formatter.result({
  "duration": 45809900,
  "status": "passed"
});
formatter.after({
  "duration": 1343314400,
  "status": "passed"
});
});