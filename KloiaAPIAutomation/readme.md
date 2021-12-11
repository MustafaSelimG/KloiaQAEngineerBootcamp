# API Automation
>*includes* Selenium , Cucumber , Gherkin , Karate , API , Test Automation
  ## Kata_1
   **Scenario: print task**</br>
      * print 'Hello World!'</br>
      * karate.log("my first log!")</br>
 </br>
  **Scenario: variables printing**</br>
      * def myFirstVar = 'Hello World!'</br>
      * def mySecondVar = 20</br>
      * print myFirstVar,mySecondVar</br>
 </br>
  **Scenario: config print task**</br>
      * print appId</br>

 </br>
  **Scenario: printing JSON file**</br>
      * def myJson =</br>
       """</br>
           {</br>
           "id": 0,</br>
           "name": 'example',</br>
           "status": "available",</br>
       };</br>
       """</br>
      * print myJson </br>
    </br>
  
![task1](https://user-images.githubusercontent.com/88919177/145682652-15206dcb-bfa7-4eda-9e19-bc73c78a13ed.gif)

