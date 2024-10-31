# ConstraintsServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**constraintsServiceCreate**](ConstraintsServiceApi.md#constraintsServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/segments/{segmentKey}/constraints |  |
| [**constraintsServiceDelete**](ConstraintsServiceApi.md#constraintsServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/segments/{segmentKey}/constraints/{id} |  |
| [**constraintsServiceUpdate**](ConstraintsServiceApi.md#constraintsServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/segments/{segmentKey}/constraints/{id} |  |


<a id="constraintsServiceCreate"></a>
# **constraintsServiceCreate**
> Constraint constraintsServiceCreate(namespaceKey, segmentKey, constraintCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConstraintsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConstraintsServiceApi apiInstance = new ConstraintsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String segmentKey = "segmentKey_example"; // String | 
    ConstraintCreateRequest constraintCreateRequest = new ConstraintCreateRequest(); // ConstraintCreateRequest | 
    try {
      Constraint result = apiInstance.constraintsServiceCreate(namespaceKey, segmentKey, constraintCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConstraintsServiceApi#constraintsServiceCreate");
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
| **segmentKey** | **String**|  | |
| **constraintCreateRequest** | [**ConstraintCreateRequest**](ConstraintCreateRequest.md)|  | |

### Return type

[**Constraint**](Constraint.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="constraintsServiceDelete"></a>
# **constraintsServiceDelete**
> constraintsServiceDelete(namespaceKey, segmentKey, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConstraintsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConstraintsServiceApi apiInstance = new ConstraintsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String segmentKey = "segmentKey_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.constraintsServiceDelete(namespaceKey, segmentKey, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConstraintsServiceApi#constraintsServiceDelete");
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
| **segmentKey** | **String**|  | |
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a id="constraintsServiceUpdate"></a>
# **constraintsServiceUpdate**
> constraintsServiceUpdate(namespaceKey, segmentKey, id, constraintUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConstraintsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ConstraintsServiceApi apiInstance = new ConstraintsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String segmentKey = "segmentKey_example"; // String | 
    String id = "id_example"; // String | 
    ConstraintUpdateRequest constraintUpdateRequest = new ConstraintUpdateRequest(); // ConstraintUpdateRequest | 
    try {
      apiInstance.constraintsServiceUpdate(namespaceKey, segmentKey, id, constraintUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConstraintsServiceApi#constraintsServiceUpdate");
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
| **segmentKey** | **String**|  | |
| **id** | **String**|  | |
| **constraintUpdateRequest** | [**ConstraintUpdateRequest**](ConstraintUpdateRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

