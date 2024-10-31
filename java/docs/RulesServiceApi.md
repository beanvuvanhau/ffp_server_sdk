# RulesServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rulesServiceCreate**](RulesServiceApi.md#rulesServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules |  |
| [**rulesServiceDelete**](RulesServiceApi.md#rulesServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/{id} |  |
| [**rulesServiceGet**](RulesServiceApi.md#rulesServiceGet) | **GET** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/{id} |  |
| [**rulesServiceList**](RulesServiceApi.md#rulesServiceList) | **GET** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules |  |
| [**rulesServiceOrder**](RulesServiceApi.md#rulesServiceOrder) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/order |  |
| [**rulesServiceUpdate**](RulesServiceApi.md#rulesServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/rules/{id} |  |


<a id="rulesServiceCreate"></a>
# **rulesServiceCreate**
> Rule rulesServiceCreate(namespaceKey, flagKey, ruleCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RulesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RulesServiceApi apiInstance = new RulesServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    RuleCreateRequest ruleCreateRequest = new RuleCreateRequest(); // RuleCreateRequest | 
    try {
      Rule result = apiInstance.rulesServiceCreate(namespaceKey, flagKey, ruleCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesServiceApi#rulesServiceCreate");
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
| **ruleCreateRequest** | [**RuleCreateRequest**](RuleCreateRequest.md)|  | |

### Return type

[**Rule**](Rule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="rulesServiceDelete"></a>
# **rulesServiceDelete**
> rulesServiceDelete(namespaceKey, flagKey, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RulesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RulesServiceApi apiInstance = new RulesServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.rulesServiceDelete(namespaceKey, flagKey, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesServiceApi#rulesServiceDelete");
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

<a id="rulesServiceGet"></a>
# **rulesServiceGet**
> Rule rulesServiceGet(namespaceKey, flagKey, id, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RulesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RulesServiceApi apiInstance = new RulesServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      Rule result = apiInstance.rulesServiceGet(namespaceKey, flagKey, id, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesServiceApi#rulesServiceGet");
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

[**Rule**](Rule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="rulesServiceList"></a>
# **rulesServiceList**
> RuleList rulesServiceList(namespaceKey, flagKey, limit, offset, pageToken, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RulesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RulesServiceApi apiInstance = new RulesServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      RuleList result = apiInstance.rulesServiceList(namespaceKey, flagKey, limit, offset, pageToken, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesServiceApi#rulesServiceList");
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

[**RuleList**](RuleList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="rulesServiceOrder"></a>
# **rulesServiceOrder**
> rulesServiceOrder(namespaceKey, flagKey, ruleOrderRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RulesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RulesServiceApi apiInstance = new RulesServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    RuleOrderRequest ruleOrderRequest = new RuleOrderRequest(); // RuleOrderRequest | 
    try {
      apiInstance.rulesServiceOrder(namespaceKey, flagKey, ruleOrderRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesServiceApi#rulesServiceOrder");
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
| **ruleOrderRequest** | [**RuleOrderRequest**](RuleOrderRequest.md)|  | |

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

<a id="rulesServiceUpdate"></a>
# **rulesServiceUpdate**
> rulesServiceUpdate(namespaceKey, flagKey, id, ruleUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RulesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RulesServiceApi apiInstance = new RulesServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    RuleUpdateRequest ruleUpdateRequest = new RuleUpdateRequest(); // RuleUpdateRequest | 
    try {
      apiInstance.rulesServiceUpdate(namespaceKey, flagKey, id, ruleUpdateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesServiceApi#rulesServiceUpdate");
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
| **ruleUpdateRequest** | [**RuleUpdateRequest**](RuleUpdateRequest.md)|  | |

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

