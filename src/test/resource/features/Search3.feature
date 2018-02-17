@navigation
Feature: This is a search filter3 feature to RSC

@navigate_to_rscsearch_filter
  Scenario: Testing RSC for filter 3
    Given navigate to RSC site3
    When click on all products
    Then I should navigate to batteries
    Then select non recharchable batteries
    Then select camera batteries
    Then click on nominal voltage from the filter options
    Then click 3V
    Then click on apply filter
    And close the browser driver
