Feature: Aplication Login
  I want to use this template for my feature file

  Background: 
    Given setup the entries in database
    Then launch the browser from config variables
    And hit the home page url of banking site

  @RegresionTest
  Scenario: Admin Page default login
    Given User is on NetBankung landing page
    When User login into aplication with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  @smokeTest
  Scenario: User Page default login
    Given User is on NetBankung landing page
    When User login into aplication with "user" and password "4343"
    Then Home Page is displayed
    And Cards are displayed

  @smokeTest
  Scenario Outline: Users Page default login
    Given User is on NetBankung landing page
    When User login into aplication with "<nickname>" and password "<password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | nickname | password |
      | test1    |    12345 |
      | test2    |    23456 |
      | Test3    |    34567 |
      | Test4    |    45678 |
      | Test5    |    56790 |

  @smokeTest
  Scenario Outline: Users Page default login
    Given User is on NetBankung landing page
    When User login into aplication with <nickname> and password "<password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | nickname | password |
      |        1 |    12345 |
      |        2 |    23456 |
      |        3 |    34567 |
      |        4 |    45678 |
      |        5 |    56790 |

  @RegresionTest @smokeTest
  Scenario: Users Page default sign up
    Given User is on register page
    When User signup into aplication
      | name       |
      | lastname   |
      | 1111111111 |
      | 111111-1   |
      | 12 bc 11   |
    Then Home Page is displayed
    And Cards are displayed
