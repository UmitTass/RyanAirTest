Feature: Declined Payment File
#I used Background keyword to run this step everytime before each Scenario.
  Background: opening_ryanair_homepage
    Given user is on the RyanAir Homepage
 # In feature files we use Gherkin language to make the steps we do easy understandable for the non-technical person in our team
  Scenario: TC01_Failed_Payment_Attempt
    When accept cookie pop-up
    Then user fills in departure and destination
    Then user selects the flight options
    Then user does log in



# I couldn't finish the test because after login they want a email verification code. First of
  # all please run this test and see the result. I really tried my best to finish this task and you can see the project until
  # the log in part and its details. This is the way I am working with Cucumber maybe you will still like it.
  # I never had a problem similar but i still tried during the last 3 days just to solve this problem. But google search
  # neither my colleagues couldn't help me with this case. I could do this task with JUnit framework opening a new page and
  # getting the verification code from my email but as you wanted me to work with cucumber I didn't use the JUnit framework.
 # If it wouldn't be because of this problem I could easily finish this test. The test wasn't difficult at all but as
  # mentioned the verification step was a big barrier for me. Thanks a lot for your time and kind regards.

