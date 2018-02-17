@navigation
Feature: This is a search filter2 feature to RSC

@navigate_to_rscsearch_filter
  Scenario: Testing RSC for filter 2
    Given navigate to RSC site2
    When click on all products
    Then I should navigate to batteries
    Then select non recharchable batteries
    Then select camera batteries
    Then click on size from the filter options
    Then click CR2
    Then click on apply filter
    And close the browser driver
