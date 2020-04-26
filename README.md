Coverage: 34%
# Project Title

This project uses both Java and Mysql to create an inventory management system that can use hard coded CRUD statemnts in java to modify the database. This project involves Unit testing with JUnit and Integration testing with Mockito. This project uses Maven as a build tool and has been built in a project in Jenkins and then pushed through to Nexus using a CI pipeline model.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

1: Clone or fork this repository
2: Intitalise it in your own github repsoitory
3: Open the project in a compatible IDE
4: Run as a Java application to run the source code or to run tests run as a Junit test

### Prerequisites

```
You will need to install Maven on your device for this project.
you will also need MySQL 5.7, you can connect this to an SQL database in Google cloud platform as an alternative.

## Running the tests

### Unit Tests 

Unit tests are designed to test individual untits of a program, often indidiual functions of a project, they can be useful in that they can be quickly created in tandem with development to help ensure that only good code is being written

```
an example would be creating a unit test for a function that takes 1 parameter, manipluates a variable and returns a variable, then creating that function so that the specified outcomes met and then testing them too see if they are.
```

### Integration Tests 
Integration tests are where units are testsed as a group, this allows developers to see if the units within a program are able to intersct with each other in the way the developer wants them to.

```
You might use thsi to test a function that executes a different function from a different class.
```

### And coding style tests (Static Analysis)

Static analysis testing is where source code is testsing before being run, the code is analysed against good coding rules/practices

```
for example using sonarqube you may be shown where your code is ineficient and what you can do to make this more efficient
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
Matthew Dunnage

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Chris Perrins [christophperrins] for the base structure of the source code.
* Nick Johnson [nickrstewarttds] for guidance and advice for aspects of this project.