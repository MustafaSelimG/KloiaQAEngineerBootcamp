Feature: crud request with external files

  Background:
    Given url baseUrl

  Scenario: post request with json
    And path 'pet'
    And def myBody = read('classpath:data/myJson.json')
    And set myBody.name = 'newName'
    And set myBody.id = 2022
    And request myBody
    When method POST
    Then status 200
    And match response.id == myBody.id
    And match response.name == myBody.name
    And match response.status == myBody.status

  Scenario Outline: get pet from table
    And path 'pet',id
    When method GET
    Then status 200
    Examples:
      | id   |
      | 3001 |
      | 3002 |
      | 3003 |

  Scenario Outline: get data from csv
    And path 'pet',id
    When method GET
    Then status 200

    Examples:
    | read('classpath:data/data.csv') |

  Scenario Outline: post request from table
    And path 'pet'
    And def myBody = read('classpath:data/myJson.json')
    And set myBody.id = id
    And set myBody.name = name
    And set myBody.status = status
    And request myBody
    When method POST
    Then status 200

    Examples:
      | read('classpath:data/example.csv') |
