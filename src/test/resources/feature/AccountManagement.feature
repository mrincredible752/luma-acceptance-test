@AccountManagement
Feature: Account Management

  @createAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then my account page is displayed


    Examples:
      | FirstName | LastName | Email            | Password  | ConfirmPassword |
      | John      | Maxwell  | jmax126@well.com | Qwert123@ | Qwert123@       |

  @duplicateAccount
  Scenario Outline: Create an account - Duplicate account creation not allowed
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then error message should be displayed that email already exist


    Examples:
      | FirstName | LastName | Email            | Password  | ConfirmPassword |
      | John      | Maxwell  | jmax126@well.com | Qwert123@ | Qwert123@       |

  @registeredCustomer
  Scenario Outline: Registered Customer Login with Username and Password
    Given I am on Account login page
    When I enter "<Email>" "<Password>"
    And I click on Sign In
    Then account page is displayed


    Examples:
      | Email            | Password  |
      | jmax126@well.com | Qwert123@ |


  @unregisteredCustomer
  Scenario Outline: Unregistered Customer should see an error message
    Given I am on Account login page
    When I enter "<Email>" "<Password>"
    And I click on Sign In
    Then error message should be displayed

    Examples:
      | Email            | Password  |
      | jmaxwell@123.com | Qwert1234 |
