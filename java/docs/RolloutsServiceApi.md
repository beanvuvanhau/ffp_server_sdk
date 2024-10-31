# RolloutsServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rolloutsServiceCreate**](RolloutsServiceApi.md#rolloutsServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rollouts |  |
| [**rolloutsServiceDelete**](RolloutsServiceApi.md#rolloutsServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rollouts/{id} |  |
| [**rolloutsServiceGet**](RolloutsServiceApi.md#rolloutsServiceGet) | **GET** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rollouts/{id} |  |
| [**rolloutsServiceList**](RolloutsServiceApi.md#rolloutsServiceList) | **GET** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rollouts |  |
| [**rolloutsServiceOrder**](RolloutsServiceApi.md#rolloutsServiceOrder) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rollouts/order |  |
| [**rolloutsServiceUpdate**](RolloutsServiceApi.md#rolloutsServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rollouts/{id} |  |


<a id="rolloutsServiceCreate"></a>
# **rolloutsServiceCreate**
> Rollout rolloutsServiceCreate(namespaceKey, flagKey, rolloutCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolloutsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RolloutsServiceApi apiInstance = new RolloutsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    RolloutCreateRequest rolloutCreateRequest = new RolloutCreateRequest(); // RolloutCreateRequest | 
    try {
      Rollout result = apiInstance.rolloutsServiceCreate(namespaceKey, flagKey, rolloutCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolloutsServiceApi#rolloutsServiceCreate");
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
| **flagKey** | **String**|  | |
| **rolloutCreateRequest** | [**RolloutCreateRequest**](RolloutCreateRequest.md)|  | |

### Return type

[**Rollout**](Rollout.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="rolloutsServiceDelete"></a>
# **rolloutsServiceDelete**
> rolloutsServiceDelete(namespaceKey, flagKey, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolloutsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RolloutsServiceApi apiInstance = new RolloutsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.rolloutsServiceDelete(namespaceKey, flagKey, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolloutsServiceApi#rolloutsServiceDelete");
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
| **flagKey** | **String**|  | |
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

<a id="rolloutsServiceGet"></a>
# **rolloutsServiceGet**
> Rollout rolloutsServiceGet(namespaceKey, flagKey, id, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolloutsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RolloutsServiceApi apiInstance = new RolloutsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      Rollout result = apiInstance.rolloutsServiceGet(namespaceKey, flagKey, id, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolloutsServiceApi#rolloutsServiceGet");
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
| **flagKey** | **String**|  | |
| **id** | **String**|  | |
| **reference** | **String**|  | [optional] |

### Return type

[**Rollout**](Rollout.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="rolloutsServiceList"></a>
# **rolloutsServiceList**
> RolloutList rolloutsServiceList(namespaceKey, flagKey, limit, offset, pageToken, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolloutsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RolloutsServiceApi apiInstance = new RolloutsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      RolloutList result = apiInstance.rolloutsServiceList(namespaceKey, flagKey, limit, offset, pageToken, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolloutsServiceApi#rolloutsServiceList");
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
| **flagKey** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **reference** | **String**|  | [optional] |

### Return type

[**RolloutList**](RolloutList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="rolloutsServiceOrder"></a>
# **rolloutsServiceOrder**
> rolloutsServiceOrder(namespaceKey, flagKey, rolloutOrderRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolloutsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RolloutsServiceApi apiInstance = new RolloutsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    RolloutOrderRequest rolloutOrderRequest = new RolloutOrderRequest(); // RolloutOrderRequest | 
    try {
      apiInstance.rolloutsServiceOrder(namespaceKey, flagKey, rolloutOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolloutsServiceApi#rolloutsServiceOrder");
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
| **flagKey** | **String**|  | |
| **rolloutOrderRequest** | [**RolloutOrderRequest**](RolloutOrderRequest.md)|  | |

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

<a id="rolloutsServiceUpdate"></a>
# **rolloutsServiceUpdate**
> rolloutsServiceUpdate(namespaceKey, flagKey, id, rolloutUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolloutsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RolloutsServiceApi apiInstance = new RolloutsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    RolloutUpdateRequest rolloutUpdateRequest = new RolloutUpdateRequest(); // RolloutUpdateRequest | 
    try {
      apiInstance.rolloutsServiceUpdate(namespaceKey, flagKey, id, rolloutUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolloutsServiceApi#rolloutsServiceUpdate");
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
| **flagKey** | **String**|  | |
| **id** | **String**|  | |
| **rolloutUpdateRequest** | [**RolloutUpdateRequest**](RolloutUpdateRequest.md)|  | |

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

