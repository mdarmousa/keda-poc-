# Getting Started


## prerequisites
* java17
* docker
## build project

* build jar file `mvn clean install -DskipTest=true`
* build docker file `docker build -t keda-poc:latest .`
* run `docker run -d -p 8080:8080 keda-poc`