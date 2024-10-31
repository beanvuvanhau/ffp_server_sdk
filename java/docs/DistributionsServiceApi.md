# DistributionsServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**distributionsServiceCreate**](DistributionsServiceApi.md#distributionsServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/{ruleId}/distributions |  |
| [**distributionsServiceDelete**](DistributionsServiceApi.md#distributionsServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/{ruleId}/distributions/{id} |  |
| [**distributionsServiceUpdate**](DistributionsServiceApi.md#distributionsServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/{ruleId}/distributions/{id} |  |


<a id="distributionsServiceCreate"></a>
# **distributionsServiceCreate**
> Distribution distributionsServiceCreate(namespaceKey, flagKey, ruleId, distributionCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DistributionsServiceApi apiInstance = new DistributionsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    DistributionCreateRequest distributionCreateRequest = new DistributionCreateRequest(); // DistributionCreateRequest | 
    try {
      Distribution result = apiInstance.distributionsServiceCreate(namespaceKey, flagKey, ruleId, distributionCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistributionsServiceApi#distributionsServiceCreate");
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
| **ruleId** | **String**|  | |
| **distributionCreateRequest** | [**DistributionCreateRequest**](DistributionCreateRequest.md)|  | |

### Return type

[**Distribution**](Distribution.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="distributionsServiceDelete"></a>
# **distributionsServiceDelete**
> distributionsServiceDelete(namespaceKey, flagKey, ruleId, id, variantId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DistributionsServiceApi apiInstance = new DistributionsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    String id = "id_example"; // String | 
    String variantId = "variantId_example"; // String | 
    try {
      apiInstance.distributionsServiceDelete(namespaceKey, flagKey, ruleId, id, variantId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistributionsServiceApi#distributionsServiceDelete");
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
| **ruleId** | **String**|  | |
| **id** | **String**|  | |
| **variantId** | **String**|  | |

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

<a id="distributionsServiceUpdate"></a>
# **distributionsServiceUpdate**
> Distribution distributionsServiceUpdate(namespaceKey, flagKey, ruleId, id, distributionUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DistributionsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DistributionsServiceApi apiInstance = new DistributionsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String ruleId = "ruleId_example"; // String | 
    String id = "id_example"; // String | 
    DistributionUpdateRequest distributionUpdateRequest = new DistributionUpdateRequest(); // DistributionUpdateRequest | 
    try {
      Distribution result = apiInstance.distributionsServiceUpdate(namespaceKey, flagKey, ruleId, id, distributionUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DistributionsServiceApi#distributionsServiceUpdate");
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
| **ruleId** | **String**|  | |
| **id** | **String**|  | |
| **distributionUpdateRequest** | [**DistributionUpdateRequest**](DistributionUpdateRequest.md)|  | |

### Return type

[**Distribution**](Distribution.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

