@Android @Transaction
Feature: As user, I have be able to success login, So that I can see home screen

  Background:
    Given user success login
    And user on home screen
    And user setting current location

  @Positive @Success-Create-Transaction
  Scenario Outline: user success create new transaction
    When user select product on best seller menu
    And user select "<pickup_type>" pickup method
    And user select "<payment_type>" payment method with phone "<number>"
    And user click bayar button
    Then user see payment confirmation detail
    And user see order detail confirmation with "<payment_type>" payment method

    Examples:
      |pickup_type                  |payment_type   |number         |
      |self_pickup                  |OVO            |089676073222   |
      |self_pickup                  |DANA           |none           |
      |self_pickup                  |GOPAY          |none           |
      |self_pickup                  |ShopeePay      |none           |

  @Negative @Failed-Create-Transaction
  Scenario: user failed create new transaction when input invalid ovo phone number
    When user select product on best seller menu
    And user select "self_pickup" pickup method
    And user select "OVO" payment method with phone "08967"
    Then user see bayar button is disabled