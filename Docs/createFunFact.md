### POST /createFunFact/:category&funFact&adminKey/

  Adds a fun fact.

* Data Params

| Parameter Name | Description | Type/Format | Required/Optional |
| ---------------| ----------- | ----------- |   -------- |
| category| Fun Fact category. Must be valid category | string |  Required |
| funFact| Fun fact. | string | Required |
| adminKey| Only admins can update fun facts | string | Required |


* Error Response:
    * Status Code: 400
    * Content `Property 'funFact' is missing.`


* Success Response:

  * Status Code: 200 
  * Content:

	 ```
	Fun Fact created: (category = Food funFact = Water is wet adminKey = adminKeyExample) ```
	```

* Sample curl: 

	```
	curl --request POST --data "category=Food&funFact=Water is wet&adminKey=adminKeyExample" 
	```
