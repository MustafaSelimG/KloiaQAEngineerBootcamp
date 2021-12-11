Feature: kata 2 simple tests

  Scenario: reading data from json
    * def myVar = read('classpath:data/myJson.json')
    * print myVar

  Scenario: writing data to json
    * def myVar = read('classpath:data/myJson.json')
    * set myVar.name = "demo"
    * print myVar

  Scenario Outline: printing table variables
    * print id
    Examples:
    | id  |
    | 3001 |
    | 3002 |
    | 3003 |