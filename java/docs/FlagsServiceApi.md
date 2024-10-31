# FlagsServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**flagsServiceCreate**](FlagsServiceApi.md#flagsServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/flags |  |
| [**flagsServiceDelete**](FlagsServiceApi.md#flagsServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/flags/{key} |  |
| [**flagsServiceGet**](FlagsServiceApi.md#flagsServiceGet) | **GET** /api/v1/namespaces/{namespaceKey}/flags/{key} |  |
| [**flagsServiceList**](FlagsServiceApi.md#flagsServiceList) | **GET** /api/v1/namespaces/{namespaceKey}/flags |  |
| [**flagsServiceUpdate**](FlagsServiceApi.md#flagsServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{key} |  |


<a id="flagsServiceCreate"></a>
# **flagsServiceCreate**
> Flag flagsServiceCreate(namespaceKey, flagCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlagsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FlagsServiceApi apiInstance = new FlagsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    FlagCreateRequest flagCreateRequest = new FlagCreateRequest(); // FlagCreateRequest | 
    try {
      Flag result = apiInstance.flagsServiceCreate(namespaceKey, flagCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlagsServiceApi#flagsServiceCreate");
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
| **flagCreateRequest** | [**FlagCreateRequest**](FlagCreateRequest.md)|  | |

### Return type

[**Flag**](Flag.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="flagsServiceDelete"></a>
# **flagsServiceDelete**
> flagsServiceDelete(namespaceKey, key)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlagsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FlagsServiceApi apiInstance = new FlagsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.flagsServiceDelete(namespaceKey, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlagsServiceApi#flagsServiceDelete");
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
| **key** | **String**|  | |

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

<a id="flagsServiceGet"></a>
# **flagsServiceGet**
> Flag flagsServiceGet(namespaceKey, key, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlagsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FlagsServiceApi apiInstance = new FlagsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String key = "key_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      Flag result = apiInstance.flagsServiceGet(namespaceKey, key, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlagsServiceApi#flagsServiceGet");
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
| **key** | **String**|  | |
| **reference** | **String**|  | [optional] |

### Return type

[**Flag**](Flag.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="flagsServiceList"></a>
# **flagsServiceList**
> FlagList flagsServiceList(namespaceKey, limit, offset, pageToken, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlagsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FlagsServiceApi apiInstance = new FlagsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      FlagList result = apiInstance.flagsServiceList(namespaceKey, limit, offset, pageToken, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlagsServiceApi#flagsServiceList");
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
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **reference** | **String**|  | [optional] |

### Return type

[**FlagList**](FlagList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="flagsServiceUpdate"></a>
# **flagsServiceUpdate**
> Flag flagsServiceUpdate(namespaceKey, key, flagUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlagsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    FlagsServiceApi apiInstance = new FlagsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String key = "key_example"; // String | 
    FlagUpdateRequest flagUpdateRequest = new FlagUpdateRequest(); // FlagUpdateRequest | 
    try {
      Flag result = apiInstance.flagsServiceUpdate(namespaceKey, key, flagUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlagsServiceApi#flagsServiceUpdate");
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
| **key** | **String**|  | |
| **flagUpdateRequest** | [**FlagUpdateRequest**](FlagUpdateRequest.md)|  | |

### Return type

[**Flag**](Flag.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

