@navigation
Feature: This is a navigate feature to RSC

 

@navigate_to_rsc
  Scenario: Testing RSC
    Given navigate to RSC site
    When click on all products
    Then I should navigate to batteries
    Then select non recharchable batteries
    Then select camera batteries
    Then select duracell ulta photo batteries
    Then click on add to basket
    Then view basket
    Then click on checkout
    And close the browser driver
