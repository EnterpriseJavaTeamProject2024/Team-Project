### DELETE /deleteFunFact/:id&adminKey

  Deletes a fun fact by id if user has valid admin key.

* Error Response:
    * Status Code: 400
    *** Needs Attention Content `There is no report with ID 19. Cannot delete.`

* Success Response:

  * Status Code: 200 
  *** Needs Attention * Content:
 ```
Fun Fact 117 deleted.
 ```

* Sample curl: 

```
curl --request DELETE http://localhost:8080/FunFactsAPI_war/funFacts/deleteFunFact?ID=117&adminKey=AdminKeyTest
curl --request DELETE http://localhost:8080/fbtr/services/reports/1
```
