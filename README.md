# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.ActivesessionApi;

public class ActivesessionApiExample {

    public static void main(String[] args) {
        ActivesessionApi apiInstance = new ActivesessionApi();
        try {
            Response1ObjectActivesessionGetCurrent result = apiInstance.1objectActivesessionGetCurrentGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivesessionApi#1objectActivesessionGetCurrentGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivesessionApi* | [**1objectActivesessionGetCurrentGet**](docs/ActivesessionApi.md#1objectActivesessionGetCurrentGet) | **GET** /1/object/activesession/getCurrent | Get Current Activesession


## Documentation for Models

 - [Response1ObjectActivesessionGetCurrent](docs/Response1ObjectActivesessionGetCurrent.md)
 - [Response1ObjectActivesessionGetCurrentAllOf](docs/Response1ObjectActivesessionGetCurrentAllOf.md)
 - [ResponseGeneric](docs/ResponseGeneric.md)
 - [SchemaGenericObjDebug](docs/SchemaGenericObjDebug.md)
 - [SchemaGenericObjDebugPayload](docs/SchemaGenericObjDebugPayload.md)
 - [SchemaGenericObjSQLQuery](docs/SchemaGenericObjSQLQuery.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key

- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@ezmax.ca

