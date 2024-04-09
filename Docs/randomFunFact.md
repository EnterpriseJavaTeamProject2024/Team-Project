### GET /trails/json/:id

  Returns a random fun fact

* Success Response:

  * Status Code: 200 
  * Content:

	 ```
{
  "ID": 30,
  "funFact": "Cats have a specialized collarbone that allows them to always land on their feet when they fall.",
  "category": "Animals"
}
	 ```

* Sample curl: 

	```
	curl --request GET http://funfactapi-team-env.eba-x2myvpmm.us-east-2.elasticbeanstalk.com/funFacts/randomFunFact
	```

* Sample request in browser:

	```
	[http://funfactapi-team-env.eba-x2myvpmm.us-east-2.elasticbeanstalk.com/funFacts/randomFunFact]
	```
