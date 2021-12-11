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


  ## Kata_2
   **Scenario: Get request to pet endpoint**</br>
     *Given* url 'https://petstore.swagger.io/v2/pet/250'</br>
     *When* method GET</br>
     *Then* print response</br>
</br>
   **Scenario: Matchers**</br>
     *Given* url 'https://petstore.swagger.io/v2/pet/1'</br>
     *When* method GET</br>
     *Then* status 200</br>
     *And* match response.id == 1</br>
     *And* match response.name == '#string'</br>
     *And* match response.status == '#present'</br>
</br>
   **Scenario: Path params and matchers**</br>
     *Given* url 'https://petstore.swagger.io/v2/'</br>
     *And* def id = 1</br>
     *And* path 'pet', id</br>
     *When* method GET</br>
     *Then* status 200</br>
     *And* match response.id == id</br>
     *And* match responseHeaders['Content-Type'][0] == 'application/json'</br>
</br>
   **Scenario: post request with json defined in feature**</br>
     *Given* url 'https://petstore.swagger.io/v2/'</br>
     *And* path 'pet'</br>
     *And* def myBody =</br>
      """</br>
          {</br>
          "id": 38155,</br>
          "name": 'example',</br>
          "status": "available",</br>
        };</br>
      """</br>
     *And* request myBody</br>
     *When* method POST</br>
     *Then* status 200</br>
     *And* print response</br>
</br>
![task2](https://user-images.githubusercontent.com/88919177/145683936-8da60236-1c72-4912-9e62-d657fcbde87a.gif)

