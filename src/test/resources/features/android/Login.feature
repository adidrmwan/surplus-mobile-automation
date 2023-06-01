@Android @Login
Feature: As user, I have be able to success login, So that I can see home screen

  Background:
    Given user on login screen

  @Positive @Success-Login
  Scenario: user input valid username and valid password
    When user input valid email on email field
    And user input valid password on password field
    And user click submit button
    Then user on home screen