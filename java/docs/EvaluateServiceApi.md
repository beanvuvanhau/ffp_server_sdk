# EvaluateServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evaluateServiceBatchEvaluate**](EvaluateServiceApi.md#evaluateServiceBatchEvaluate) | **POST** /api/v1/namespaces/{namespaceKey}/batch-evaluate |  |
| [**evaluateServiceEvaluate**](EvaluateServiceApi.md#evaluateServiceEvaluate) | **POST** /api/v1/namespaces/{namespaceKey}/evaluate |  |


<a id="evaluateServiceBatchEvaluate"></a>
# **evaluateServiceBatchEvaluate**
> BatchEvaluationResponse evaluateServiceBatchEvaluate(namespaceKey, batchEvaluationRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EvaluateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EvaluateServiceApi apiInstance = new EvaluateServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    BatchEvaluationRequest batchEvaluationRequest = new BatchEvaluationRequest(); // BatchEvaluationRequest | 
    try {
      BatchEvaluationResponse result = apiInstance.evaluateServiceBatchEvaluate(namespaceKey, batchEvaluationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EvaluateServiceApi#evaluateServiceBatchEvaluate");
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
| **namespaceKey** | **String**|  | |
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

<a id="evaluateServiceEvaluate"></a>
# **evaluateServiceEvaluate**
> EvaluationResponse evaluateServiceEvaluate(namespaceKey, evaluationRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EvaluateServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    EvaluateServiceApi apiInstance = new EvaluateServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    EvaluationRequest evaluationRequest = new EvaluationRequest(); // EvaluationRequest | 
    try {
      EvaluationResponse result = apiInstance.evaluateServiceEvaluate(namespaceKey, evaluationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EvaluateServiceApi#evaluateServiceEvaluate");
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
| **namespaceKey** | **String**|  | |
| **evaluationRequest** | [**EvaluationRequest**](EvaluationRequest.md)|  | |

### Return type

[**EvaluationResponse**](EvaluationResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

