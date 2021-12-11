# API Automation
>*includes* Selenium , Cucumber , Gherkin , Karate , API , Test Automation
  ## Kata_1
   **Scenario: print task**</br>
    - * print 'Hello World!'</br>
    - * karate.log("my first log!")</br>

  **Scenario: variables printing**</br>
    - * def myFirstVar = 'Hello World!'</br>
    - * def mySecondVar = 20</br>
    - * print myFirstVar,mySecondVar</br>

  **Scenario: config print task**</br>
    - * print appId</br>


  **Scenario: printing JSON file**</br>
    - * def myJson =</br>
    -  """</br>
    -      {</br>
    -      "id": 0,</br>
    -      "name": 'example',</br>
    -      "status": "available",</br>
    -  };</br>
    -  """</br>
    - * print myJson </br>
  
    ![task1](https://user-images.githubusercontent.com/88919177/145682606-b2f6f6ec-701a-4954-99b2-ea320c5da9df.gif)

