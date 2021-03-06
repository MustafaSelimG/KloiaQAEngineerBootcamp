Feature: crud request tasks

  Scenario: Get request to pet endpoint
    Given url 'https://petstore.swagger.io/v2/pet/250'
    When method GET
    Then print response

  Scenario: Matchers
    Given url 'https://petstore.swagger.io/v2/pet/1'
    When method GET
    Then status 200
    And match response.id == 1
    And match response.name == '#string'
    And match response.status == '#present'

  Scenario: Path params and matchers
    Given url 'https://petstore.swagger.io/v2/'
    And def id = 1
    And path 'pet', id
    When method GET
    Then status 200
    And match response.id == id
    And match responseHeaders['Content-Type'][0] == 'application/json'

  Scenario: post request with json defined in feature
    Given url 'https://petstore.swagger.io/v2/'
    And path 'pet'
    And def myBody =
    """
        {
        "id": 38155,
        "name": 'example',
        "status": "available",
    };
    """
    And request myBody
    When method POST
    Then status 200
    And print response