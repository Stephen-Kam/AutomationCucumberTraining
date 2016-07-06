@tag
Feature: To test the functionality of the Mercury Tours Test Site

  @tag1
  Scenario: Test main navigation links work
    Given I am on the Mercury Tours home page
    When I click on each of the top navigation links I will be taken to the right page

  @tag2
  Scenario: Check that there are no broken links
    Given I am on the Mercury Tours home page
    When I click on all links on the page, I will be taken to the relevant page
