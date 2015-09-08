Feature: Meme sorter and scorer

  Scenario: MemesTest
    Given Memes Json
    When I consume a memes rest api
    And I sort the memes according to name
	And I generate random number to assign scores in json
    And I copy them to a json file locally
