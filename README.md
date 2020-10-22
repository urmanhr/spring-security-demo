# spring-security-demo

This sample contains the use of Spring security with spring boot. I have implemented Username/password based authentication which are fetched from DB.
* /signup api will register the user in database
* /signin api will generate a JWT token which will be later used for authenticating other apis.
* after certain time period, token will be expired and user will have to sign in again.
* I have also made use of lombok.
* I have also used data validaiton.
* Postgres as database in the backend.
## To Do
* Make use of spring boot oauth2 starter.
* Spring actuator.
* Caching implementation.
* Docker.
