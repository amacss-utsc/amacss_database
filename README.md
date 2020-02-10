# :file_folder: AMACSS Database

_Going to write the description soon, too lazy rn_

## :rocket: Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### :taco: Prerequisites

You will need: [Java 8](https://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html), [MongoDB](https://www.mongodb.com/)
and [Maven](https://maven.apache.org/).

:apple: **Mac**

```
brew update
brew install maven
brew install mongodb
brew cask install homebrew/cask-versions/adoptopenjdk8
```

:fire: **Linux distributions based on Debian**

```
sudo apt update
sudo apt install maven
sudo apt install -y mongodb
apt install openjdk-8-jre-headless
```

:poop: **Windows**

```
Go download each package individually, double click them to install. Make sure to set path variables for Maven and Java
```

---

:runner: ### Running the application

1. Clone the repo, then cd into it. Windows users should use `dir`.

```
git clone https://github.com/amacss-utsc/amacss_database
cd amacss_database
```

2. Install Maven dependencies.

```
mvn install
```

3. Make sure the mongo service is started, and create your database with an arbitrary collection.

```
Uh idk I just use MongoDB Compass for this
```

4. Configure the [applications.properties](https://github.com/amacss-utsc/amacss_database/blob/master/src/main/resources/application.properties) file.
It should look something like this, where the database is whatever name you chose in the previous step.

```
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=amacss
```

5. Run the application.

```
mvn exec:java
```

## :hammer_and_wrench: Built With

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Maven](https://maven.apache.org/)
* [MongoDB](https://www.mongodb.com/)

## :man: Authors

* :sweet_potato: **Richard Hong** - [H-Richard](https://github.com/H-Richard)

See also the list of [contributors](https://github.com/amacss-utsc/amacss_database/contributors) who participated in this project.
