# realTimeDeparture
A service that gives real-time departure time for public transportation

## 1. Problem Statement:
Create a service that gives real-time departure time for public transportation (use freely available public API). The app should geolocalize the user.

## 2. Solution:
Rest-based web service that provides the real-time departure time at a user-provided stop.

## 3. Build & Run Instructions

* Obtain repository from GitHub

   `$ git clone https://github.com/tendaitt/realTimeDeparture.git`

* Go into project directory

   `$ cd realTimeDeparture/`

* Build the project using `gradle`

   `$ ./gradlew build -x test`

* To run locally, execute the following command

   `$ ./gradlew bootRun`

* Application should be live at http://localhost:8080/

   **PS**:The page shown is a AngularJS page showing the result for a hard-coded stop.

* To run in Eclipse omit the `bootRun` step and continue on to the following subsection.

### Importing into Eclipse
* Generate eclipse dependencies

   `$./gradlew eclipse`

* Open Eclipse.Go to **File->Import**

* Under Gradle, select **Existing Gradle Project**

* Complete the steps in the wizard and **Finish**

* You will now be able to start the project in Eclipse by running the **src/main/java/com/assessment/departure/DepartureTimeApplication.java** class.

* Application should be live at http://localhost:8080/

## 4. Hosted Location
* Application is hosted on Heroku at the following location: https://ancient-chamber-53270.herokuapp.com/getDepartureTime?stopTag=5205
* The GitHub repository is at the following location: https://github.com/tendaitt/realTimeDeparture

## 5. Using the application

Once the application is running or you go to the hosted location, you can use it by adding a `<stopTag>` value in the URL as illustrated below.

#### URL structure

`http://<host>/getDepartureTime?stopTag=<stopTag>`

#### Sample URLs
* Running application locally: http://localhost:8080/getDepartureTime?stopTag=4448
* Running application on Heroku: https://ancient-chamber-53270.herokuapp.com/getDepartureTime?stopTag=4448

#### Sample Response
`{"stopTitle":"Duboce Ave & Church St","direction":"Inbound to Caltrain/Ball Park","waitTime":2}`

Fields:
* `stopTitle`: the name of the stop.
* `direction`: the direction of the bus.
* `waitTime`: the time, in minutes, until the next bus arrives.

#### Sample `<stopTags>`

|      |      |      |
|:----:|:----:|:----:|
| 7217 | 4447 | 4448 |
| 5731 | 5206 | 3913 |
| 6995 | 3912 | 5193 |

## 6. Technical Decisions

#### Missing functionality
 * Application does not geolocalize the user to provide the result. Instead it takes a user input for a stop and returns the wait time. This feature was not implemented partly because the Next Bus API does not have a prediction request that takes in a Longitude and Latitude.

#### Additional Feature
Instead of merely returning the wait time, the application also retrieves the stop title and direction of the bus.

#### Architecture
* The decision to implement the application as a REST-based web service was largely due to familiarity with the technology.
* The application also models a Service Oriented Architecture. This ensures that we can easily replace components such as the Next Bus API with minimal code changes.

## 7. Trade-offs and Improvements

####Trade-offs
Since there is no geolocalization of the user, an alternative approach to retrieving the wait time had to be used. The application uses a prediction API, from Next Bus, that takes in a `<route tag>`, `<agency tag>` and `<stop tag>`. The route and agency are hard-coded while the user provides the stop tag.

####TODOs
* Add a fully functioning UI for the application.
* Add integration testing and increase the number of unit tests for the application.
* Implement geolocation functionality.

## 8. Personal Links
* [LinkedIn](https://www.linkedin.com/in/tendaimudyiwa/) 
* [Personal Website](https://www.tendaimudyiwa.com/)
* [Medium](https://medium.com/@zim_coder)