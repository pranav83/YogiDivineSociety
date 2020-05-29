@SanityPack
Feature: Verify Header and Logo
Scenario:
  Given I am on Yogi Divine Society homepage
  And I should verify logo and text
  When I click on links on header menu
  Then I should navigate to relevant page
  And I click on make donation link
  Then I should navigate to donation page