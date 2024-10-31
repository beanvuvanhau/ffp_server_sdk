# EvaluationServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evaluationServiceBatch**](EvaluationServiceApi.md#evaluationServiceBatch) | **POST** /evaluate/v1/batch |  |
| [**evaluationServiceBoolean**](EvaluationServiceApi.md#evaluationServiceBoolean) | **POST** /evaluate/v1/boolean |  |
| [**evaluationServiceVariant**](EvaluationServiceApi.md#evaluationServiceVariant) | **POST** /evaluate/v1/variant |  |


<a id="evaluationServiceBatch"></a>
# **evaluationServiceBatch**
> BatchEvaluationResponse evaluationServiceBatch(batchEvaluationRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EvaluationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EvaluationServiceApi apiInstance = new EvaluationServiceApi(defaultClient);
    BatchEvaluationRequest batchEvaluationRequest = new BatchEvaluationRequest(); // BatchEvaluationRequest | 
    try {
      BatchEvaluationResponse result = apiInstance.evaluationServiceBatch(batchEvaluationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EvaluationServiceApi#evaluationServiceBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchEvaluationRequest** | [**BatchEvaluationRequest**](BatchEvaluationRequest.md)|  | |

### Return type

[**BatchEvaluationResponse**](BatchEvaluationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="evaluationServiceBoolean"></a>
# **evaluationServiceBoolean**
> BooleanEvaluationResponse evaluationServiceBoolean(evaluationRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EvaluationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EvaluationServiceApi apiInstance = new EvaluationServiceApi(defaultClient);
    EvaluationRequest evaluationRequest = new EvaluationRequest(); // EvaluationRequest | 
    try {
      BooleanEvaluationResponse result = apiInstance.evaluationServiceBoolean(evaluationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EvaluationServiceApi#evaluationServiceBoolean");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **evaluationRequest** | [**EvaluationRequest**](EvaluationRequest.md)|  | |

### Return type

[**BooleanEvaluationResponse**](BooleanEvaluationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="evaluationServiceVariant"></a>
# **evaluationServiceVariant**
> VariantEvaluationResponse evaluationServiceVariant(evaluationRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EvaluationServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EvaluationServiceApi apiInstance = new EvaluationServiceApi(defaultClient);
    EvaluationRequest evaluationRequest = new EvaluationRequest(); // EvaluationRequest | 
    try {
      VariantEvaluationResponse result = apiInstance.evaluationServiceVariant(evaluationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EvaluationServiceApi#evaluationServiceVariant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **evaluationRequest** | [**EvaluationRequest**](EvaluationRequest.md)|  | |

### Return type

[**VariantEvaluationResponse**](VariantEvaluationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

