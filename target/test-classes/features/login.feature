Feature: Automating the Home Page of Flipkart application
  Scenario Outline: Home page Login 
    Given The User is on the Login Page of Flipkart application
    When The User login to the application using <userName> and <password> and click login button
    Then Home page is populated
    Examples: 
      | userName  | password | 
      | "9994704312" | "Ananth@123" | 

  Scenario Outline: username validation
    Given user is on landing page
     When username using "Ananth" and "ABC123" and click login button
     Then Home page is displayed
      And Page displayed are "True"



