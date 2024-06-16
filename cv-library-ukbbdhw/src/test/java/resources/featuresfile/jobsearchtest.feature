Feature:job search test

  Scenario:verifyJobSearchResultUsingDifferentDataSet
    Given I am on Homepage
    When I click on cookie
  And enter job title 'Tester'
  And enter Location 'Harrow'
  And select distance 'up to 5 miles'
  And click on moreSearchOptionsLink
  And enter salaryMin '30000'
  And enter salaryMax '50000'
  And select salaryType 'Per annum'
  And select jobType 'Permanent'
  And click on 'Find Jobs' button
  Then verify the result 'result'