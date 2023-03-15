# Trip Calculator

*Goal:* Given an entry and exit point, calculate the toll based on the rate of $0.25/km.

*Code Overview:* The trip calculator has been implemented as a class in Java. The TollCalculator class is stored along with its helper classes for Jackson Databind in src/main/java/com/caseyarnold folder, whereas its unit tests, written using the JUnit library are stored in src/test/java/com/caseyarnold folder. Below is an overview of the functions of the main TollCalculator class:

```

calculateDistance() -> Given an entry and exit interchange as a string, 
it will determine the distance between the two in kilometres and return it as a floating point

costOfTrip() -> Given an entry and exit interchange as a string, it will calculate the total 
cost to travel this segment

generateList() -> Given an entry and exit interchange, a list will be returned containing 
only the keys of the traversed interchanges ordered in the direction of travel

```

*Prerequisites:* Java, Maven, Jackson Databind, JUnit, Project Lombok

*Instructions:* To execute some functions in the main class, execute the following in your terminal. By default it will display the price for the QEW to Highway 400 east-bound and west-bound as well as the cost for Salem Road to the QEW both east-bound and west-bound.

Ensure you have all the dependencies installed by running this in the root folder:
```
mvn install
```

Then to run the main class:
```

java src/main/java/com/caseyarnold/TollCalculator.java

```

To run the unit tests, please execute the following:

```

java src/test/com/caseyarnold/TollCalculatorTest.java

```
There are 18 unit tests written, testing the cost, distance 6 different possible routes: QEW to Salem Road, Salem Road to QEW, Keele Street to Highway 404, Highway 404 to Keele Street, QEW to Highway 400, and Highway 400 to QEW.