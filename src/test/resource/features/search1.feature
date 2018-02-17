@navigation
Feature: This is a search filter feature to RSC

@navigate_to_rscsearch_filter
  Scenario: Testing RSC for filter1
    Given navigate to RSC site1
    When click on all products
    Then I should navigate to batteries
    Then select non recharchable batteries
    Then select camera batteries
    Then click on brand from the filter options
    Then click duracell
    Then click on apply filter
    And close the browser driver
