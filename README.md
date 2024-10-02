# player-api

### A microservice which serves the contents of player.csv through REST API

### How to run:
This is a maven spring boot application, so you can run it in your favorite IDE or using the terminal (in case you have `maven` installed correctly): 
`mvn spring-boot:run`

### Parsing Implementation Selection
In `PlayerServiceImpl`, you can select from 2 implementations:
1. PlayerDbRepository - Loads CSV using the framework into an H2 DB and query over it
2. PlayerMemRepository - "Manually" loads CSV to memory and query over it

The selection can be done using the `Qualifier` annotation (Left other option in comment for each switching - in a real world scenario I would use a Spring property to control it)

##### Some comments:
1. I used `String` type for all values for simplicity, in real world scenario I will need to have types and convert the string to a specific type.
2. I added `dockerfile` & `docker-compose.yaml` but was unable to test them since I have an issue installing docker on my machine.
3. Used h2 DB, in real world scenario I will use a real DB and add it to the docker-compose file for running it locally.
4. Since we have no `create/update/delete` operations but only `get` operation, there are no exceptions expected, since normally in get you don't get exceptions (it is common to return empty response if none found, matter of preference). However, to demonstrate the handling, I throw an exception on not found player case.
5. I added only tests for the API (integration), in a real world scenario I will add tests for each layer of the application with mocking the underlining layer.
6. Since we know the size of the data (fixed, no insert is supported) I didn't implement paging. In a real world scenario, we will implement curser based paging or some other type of paging.