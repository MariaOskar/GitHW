# GitHW
**JDK 9.0.4**  <br/>
Application class creates directory in the project's root with empty .txt file inside.<br/> 
Names for directory and file are generated randomly ( 9 <= characters <= 20 ).

## To run app with exec-maven-plugin:
#### Compile:
```
mvn compile
```
> **note:** To compile code run this command from the project's directory. 
Source and target java levels should be set in the pom.xml (maven-compiler-plugin configuration)
#### Run:
```
mvn exec:java
```
> **note:** mainClass should be set in the pom.xml (exec-maven-plugin configuration)

## To run app with JRE:
#### Compile:
```
mvn compile
```
> **note:** To compile code run this command from the project's directory. 
Source and target java levels should be set in the pom.xml (maven-compiler-plugin configuration)
#### Run:
```
java -classpath target\classes Application
```
## To run with jar file:
#### Build jar:
```
mvn install
```
#### Run:
```
java -cp target\fintech-1.0-SNAPSHOT.jar Application
```
