# microservices-series-practice


## Build to executable jar

```sh
# the executable jar will be in build/libs/*.jar
$ ./gradlew clean build
```

## Phase 1 - Greeting Service
greeting-service-start is the project written over Spring boot, it is quite simple.
with 1 api for greeting to the passed name.

```sh
$ http :8080/api/v1/greeting/{name}
```

## Phase 2 - Greeting Service with Service Registry and Api Gateway
greeting-service is one which is refactored base on the greeting-service-start.
service-registry is the service registry
edge-service is the api gateway

```sh
$ http :9001/api/v1/greeting/{name}
$ http :8080/greeting-service/api/v1/greeting/{name}
```
