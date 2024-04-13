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
    * Content `category, funFact, and adminKey are all empty: nothing to edit.`
    or
    * Content `There is no fun fact with ID 55`

* Success Response:

  * Status Code: 200 
  * Content:

	 ```
	Fun fact 5 has been updated.
	```

* Sample curl: 

	```
	curl --request PUT --data "id=5&category=Country"
	```
