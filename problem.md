# CGI Core Track Spring Module - Coding Challenge - I

## Objective

In this case study, we will create a simple sprint boot web application where you should be able to add tablets,view all tablets and also delete a particular tablet by its id. The APIs should be tested through Postman

## Following are the steps:
	
- Define the model class Tablet with the following Properties

			- tabletId : int
			- tabletName : String
			- manufacturer : String
			- price : double
                        - quantity : int

- Configure the connection properties for MySql database in application.properties file 

- Define the TabletRepository class
        
        -   Annotate the TabletRepository with appropriate annotations


- Define TabletService interface with methods for the following actions

        - add tablet 
        - get all tablets
        - delete tablet by id

-  Define TabletServiceImpl implementing all the methods of TabletService

        - add tablet
        - get all tablets
        - delete tablet by id

- Define the Tabletcontroller class and implement methods to create REST web service APIs based on 
        the methods defined in Tablet Service interface

        HttpStatuses for 
            - add tablet
                - code : 201 for successful addition
                - code : 409 if the user already exists
            - get all tablets
                - code : 200 for successful
            - delete tablet by id
                - code : 200 for successful deletion

- Add annotations wherever required

- Test the REST APIs using postman and share the screenshots of them
