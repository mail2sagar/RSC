@navigation
Feature: This is a navigate feature to RSC Connectors
@navigate_to_rsc_connectors
  Scenario: Testing RSC Connectors
    Given navigate to RSC site
    When click on all products
    Then I should navigate to connectors
    Then select power connectors 
    Then select automotive connectors
    Then select TE Connectivity AMP SUPERSEAL
    Then click on add to basket
    Then view basket
    Then click on checkout
    And close the browser driver
