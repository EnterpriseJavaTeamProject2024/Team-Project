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
    * Content `Property 'name' is missing.`


* Success Response:

  * Status Code: 200 
  * Content:

	 ```
	Trail 4 created: (name = New Trail Name length = 10 units = miles description = fun trail website = camba.com latitude = 124.12 longitude = 654.78) ```
	```

* Sample curl: 

	```
	curl --request POST --data "name=New Trail Name&length=10&units=miles&description=fun trail&website=camba.com&latitude=124.12&longitude=654.78" http://localhost:8080/fbtr/services/trails/
	```
