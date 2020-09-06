#author: Robinson Quintero

Feature: User is going to use Rick and Morty API.

  @smokeTest_response
  Scenario Outline: The user is trying to get a right response for every resources of API.

    Given There are <resources> to try the API
    When I execute the endpoint code API
    Then I should have the  200 code response from the API
    And I should see the <content type>

    Examples:
      | resources | content type                    |
      | character | application/json; charset=utf-8 |
      | location  | application/json; charset=utf-8 |
      | episode   | application/json; charset=utf-8 |

  @RightResponse
  Scenario Outline: The user is trying to get a right response of API.

    Given There are <resources> to try the API
    When I execute the endpoint code API
    Then I will see the  <api response> response from the API

    Examples:
      | resources            | api response                                                |
      | episode              | https://rickandmortyapi.com/api/episode?page=2              |
      | location/?name=earth | https://rickandmortyapi.com/api/location/?page=2&name=earth |
      | character/?page=19   | https://rickandmortyapi.com/api/character/?page=20          |


