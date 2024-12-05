Feature: Registration form filling
  In order to add nominees 
  As a valid user
  I should able to fill the registration deatils of page.

#using map
  Scenario: To add multiple nominee deatils
    Given I am on registartion page
    When I click add nominee button
    And I add below nominee details
      | fullName    | Email           | Age | Contact    |
      | Neral Gopi  | neral@gmail.com |  27 | 9567843567 |
      | Sedal Mintu | sedal@gmail.com |  38 | 8976577766 |
    Then I click to save button
    
    
#using list
  Scenario: To update multiple nominee deatils
    Given I am on registartion page
    When I click edit nominee button
    And I add below nominee details at the existing deatils
      | Minal Gopi  | minal@gmail.com |  15 | 9567843567 |
      | Rinku Mintu | rinku@gmail.com |  32 | 8976577766 |
    Then I click to save button
