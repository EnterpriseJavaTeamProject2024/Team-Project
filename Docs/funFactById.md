### GET /funFactByID/:ID

  Returns a fun fact by id.

* Error Response:
    * Status Code: 400
    * Content `No results found for ID: 117`


* Success Response:

  * Status Code: 200 
  * Content:
  
	 ```
	{
	  "ID": 17,
	  "funFact": "A group of crows is called a murder.",
	  "category": "Animals"
	}
	 ```

* Sample curl: 

	```
	curl --request GET http://funfactapi-team-env.eba-x2myvpmm.us-east-2.elasticbeanstalk.com/funFacts/funFactByID?ID=17
	```

* Sample request in browser:

	```
	http://funfactapi-team-env.eba-x2myvpmm.us-east-2.elasticbeanstalk.com/funFacts/funFactByID?ID=17
	```
