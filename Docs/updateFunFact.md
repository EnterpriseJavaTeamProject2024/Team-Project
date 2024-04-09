### PUT /updateFunFact/:category&ID&funFact&adminKey

  Updates a fun fact.

* Data Params

| Parameter Name | Description | Type/Format | Required/Optional |
| ---------------| ----------- | ----------- |   -------- |
| id | Fun Fact id. | number | Required|
| category| Fun Fact category. Must be valid category | string |  Required |
| funFact| Fun fact. | string | Required |
| adminKey| Only admins can update fun facts | string | Required |


* Error Response:
    * Status Code: 400
    * Content `date, conditions, and user are all empty: nothing to edit.`
    or
    * Content `There is no report with ID 55`

* Success Response:

  * Status Code: 200 
  * Content:

	 ```
	Report 3 has been updated.
	```

* Sample curl: 

	```
	curl --request PUT --data "id=3&conditions=Updated Report conditions" http://localhost:8080/fbtr/services/reports
	```
