### GET funFactByCategory/:category

  Returns a fun fact by category.

* Error Response:
    * Status Code: 400
    * Content `No results found for category: Lang`

* Success Response:

  * Status Code: 200 
  * Content:

	 ```
{
  "ID": 8,
  "funFact": "The shortest complete sentence in the English language is Go.",
  "category": "Language"
}
	 ```

* Sample curl: 

	```
	curl --request http://funfactapi-team-env.eba-x2myvpmm.us-east-2.elasticbeanstalk.com/funFacts/funFactByCategory?category=Language
	```

* Sample request in browser:

	```
	http://funfactapi-team-env.eba-x2myvpmm.us-east-2.elasticbeanstalk.com/funFacts/funFactByCategory?category=Language
	```
	```
