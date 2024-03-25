# Team Project Spring 2024
## Fun Fact API

## Members -
* Bryce Allard
* Kevin Grau
* Josh Haefner

## Problem Statement -  
Life is too short to endure dull moments. In a world where long meetings and endless conference calls drain our energy,
the need for a quick, refreshing break is more important than ever. Introducing the Fun Fact API, a solution designed to
break the monotony of the daily grind and inject a dose of joy into your routine.

Our API is more than just a repository of facts; it's a community-driven platform where users can discover, contribute,
and share intriguing tidbits of knowledge. Whether you're looking to impress your colleagues with a historical fact,
lighten the mood with a humorous anecdote, or simply learn something new, the Fun Fact API has you covered.

Join our community of fun fact enthusiasts and turn every moment into an opportunity to learn and smile.

## Tooling -
* Java
  * Spring (TBD)
  * Hibernate
  * Log4J
  * Junit
* AWS
  * AWS Aurora (TBD)
  * AWS RDS - MySQL (TBD)
  * Amazon API Gateway
  * AWS Beanstalk
* Postman 

## Proposed Operations -
* Retrieve random fun fact
* Retrieve fun fact by ID
* Retrieve random fun fact by category
* Add a fun fact
* Update fun fact
  * Admin token
* Delete fun fact
  * Admin token

## Project Plan - 
* Week 1 
  * Have Java skeleton built
    * Can build base project without any issues
    * Includes all dependencies
  * Database spun up in AWS
  * Application running in AWS
* Week 2
  * Have sample data within database.
    * 20-30 fun facts categorized
  * Have a pulse check endpoint stood up
  * Be able to retrieve a random fun fact via API
  * Be able to retrieve a fun fact by ID
  * Be able to retrieve a random fun fact from a specific category
* Week 3
  * Be able to add a fun fact
  * Be able to update a fun fact
  * Be able to delete a fun fact
  * Make sure crUD ops are admin only
  * Setup Amazon API gateway
    * I do not want someone to find this and make my life expensive.
* Week 4 
  * Testing and external feedback.

Github Board - https://github.com/orgs/EnterpriseJavaTeamProject2024/projects/2

### Important Documents - 
[User Guide](Docs/UserGuide.md)  
[Time Tracking](Docs/TimeTracker.md)  
[Team Charter](Docs/TeamCharter.md)  
[Team Resume](Docs/TeamResume.md)  

