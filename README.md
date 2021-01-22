# World Map

#Introduction
This is a simple service to store hierarchical data in mongo dB database. In this hierarchical data we have four levels 
namely world, continents, countries and states. 
Level one is world which is considered as the parent of continents. Continent is the parent of countries and country is the parent of states.
We have developed CRUD (CREATE, READ, UPDATE, DELETE) operations for this project. The specific reason for using mongo dB database is to store 'unstructured data'.
We can connect backend with database through "application.properties" file.

#Software Requirements
	Intelij IDEA (BACK END)
	Visual Studio code(FRONT END)
	Mongo dB(database)
	Postman

#System Requirements
	We recommend: 1.6 GHZ or faster processor.
	1 GB of RAM
	Google chrome browser

#Implemented Operations
1.	To retrieve all the inserted data.
2.	To insert new data.
3.	To delete data.

#How to run
	Run by “npm start” command from vs code.


#How to test Endpoints
1. GET ALL: http://localhost:8080/api/v1/getworld

2. CREATE:  http://localhost:8080/api/v1/continent/{{parent}}
   Example: http://localhost:8080/api/v1/continent/India
  
3. DELETE:  http://localhost:8080/api/v1/delete/{{place}}/{{parent}}
   Example: http://localhost:8080/api/v1/delete/India/Asia

