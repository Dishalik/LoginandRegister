# new feature
# Tags: optional
Feature: Register on the website
  Scenario: Login and Register New User
      Given user is on home page
      Then user click on Sign in
      When you reach at authentication page
      Then user enter email
      And user click on create account
      When you reach at dashboard
      Then click on title Mrs
      Then enter details first-name and last-name
      Then enter email and password
      Then select date month and year
      Then click on sign-up
      Then click on receive-spl
      Then enter details Name and Surname
      Then enter address and city
      Then select state
      Then enter pin-code
      And select country
      Then enter phone number and alias
      And click on submit
      When reached landing page
      Then verify full name






