### DELETE /deleteFunFact/:id&adminKey

  Deletes a fun fact by id if user has valid admin key.

* Error Response:
    * Status Code: 400
    * Content:
      ```
      There is no report with ID 117. Cannot delete.
      ```

* Success Response:

  * Status Code: 200 
  * Content:
 ```
Fun Fact 17 deleted.
 ```

* Sample curl: 

```
curl --request DELETE http://localhost:8080/FunFactsAPI_war/funFacts/deleteFunFact?ID=17&adminKey=AdminKeyTest
```
