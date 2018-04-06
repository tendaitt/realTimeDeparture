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
   _PS:_The page shown is a AngularJS page showing the result for a hard-coded stop.

* To run in Eclipse omit the `bootRun` step and continue on to the following subsection.

### Importing into Eclipse
* Generate eclipse dependencies
   `./gradlew eclipse`

* Open Eclipse.

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



## 7. Trade-offs and Improvements



## 8. Personal Links
* [LinkedIn](https://www.linkedin.com/in/tendaimudyiwa/) 
* [Personal Website](https://www.tendaimudyiwa.com/)
* [Medium](https://medium.com/@zim_coder)