Feature: first kata tests

  Scenario: print task
    * print 'Hello World!'
    * karate.log("my first log!")

  Scenario: variables printing
    * def myFirstVar = 'Hello World!'
    * def mySecondVar = 20
    * print myFirstVar,mySecondVar

  Scenario: config print task
    * print appId


  Scenario: printing JSON file
    * def myJson =
    """
        {
        "id": 0,
        "name": 'example',
        "status": "available",
    };
    """
    * print myJson