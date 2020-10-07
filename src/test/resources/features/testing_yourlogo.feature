#author: Robinson Quintero

Feature: User is going to buy on the your logo page.

  @SmokeTest_Register
  Scenario: As a user I need to be registered at the web page to start all the test
    Given The user clicks the sign in options
    When he enters all the personal information to register
      | name  | lastname | password  | email           |
      | robin | quintero | 1234robin | mart17423@gmail.com |

    And he enters the Address information in the register form
      | address   | city     | postalCode | mobilePhone |
      | cr47cll49 | Medellin | 33222      | 3155255362  |

    Then he will find the message Welcome to your account. Here you can manage all of your personal information and orders.

  @UserIsGoingToBuYaDress
  Scenario: As a user I want to buy different kind of dresses
    Given the user is in the principal menu of your logo page
      | email_login     | password_login |
      | r1L23@gmail.com | 1234robin      |
    When he chooses the dresses to buy
    Then he will see the number of product he chose









