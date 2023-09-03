#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: my login

  @instalogin
  Scenario: Title of your scenario
    Given lunch login page
    When Enter invalid data
      | 0,0 krishna6789@gmail.com | 0,1ronakloveskrishna |
      | 1,0krishna67834@insta.com| 1,1-678@myinsta       |
    When Click on login
