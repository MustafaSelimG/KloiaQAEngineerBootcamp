Feature: reusable feature file tests

  Background:
    Given url baseUrl

  Scenario: call post feature
    * def callToPost = call read('classpath:callers/caller.feature@name=post')
    * match callToPost.responseStatus == 200
    * print callToPost.response

  Scenario: call get feature
    * def myID = 1
    * def callToGet = call read('classpath:callers/caller.feature@name=get'){id: #(myID)}
    * match callToGet.response.id == myID