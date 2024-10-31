# NamespacesServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**namespacesServiceCreate**](NamespacesServiceApi.md#namespacesServiceCreate) | **POST** /api/v1/namespaces |  |
| [**namespacesServiceDelete**](NamespacesServiceApi.md#namespacesServiceDelete) | **DELETE** /api/v1/namespaces/{key} |  |
| [**namespacesServiceGet**](NamespacesServiceApi.md#namespacesServiceGet) | **GET** /api/v1/namespaces/{key} |  |
| [**namespacesServiceList**](NamespacesServiceApi.md#namespacesServiceList) | **GET** /api/v1/namespaces |  |
| [**namespacesServiceUpdate**](NamespacesServiceApi.md#namespacesServiceUpdate) | **PUT** /api/v1/namespaces/{key} |  |


<a id="namespacesServiceCreate"></a>
# **namespacesServiceCreate**
> Namespace namespacesServiceCreate(namespaceCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NamespacesServiceApi apiInstance = new NamespacesServiceApi(defaultClient);
    NamespaceCreateRequest namespaceCreateRequest = new NamespaceCreateRequest(); // NamespaceCreateRequest | 
    try {
      Namespace result = apiInstance.namespacesServiceCreate(namespaceCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespacesServiceApi#namespacesServiceCreate");
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
| **namespaceCreateRequest** | [**NamespaceCreateRequest**](NamespaceCreateRequest.md)|  | |

### Return type

[**Namespace**](Namespace.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="namespacesServiceDelete"></a>
# **namespacesServiceDelete**
> namespacesServiceDelete(key)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NamespacesServiceApi apiInstance = new NamespacesServiceApi(defaultClient);
    String key = "key_example"; // String | 
    try {
      apiInstance.namespacesServiceDelete(key);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespacesServiceApi#namespacesServiceDelete");
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

<a id="namespacesServiceGet"></a>
# **namespacesServiceGet**
> Namespace namespacesServiceGet(key, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NamespacesServiceApi apiInstance = new NamespacesServiceApi(defaultClient);
    String key = "key_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      Namespace result = apiInstance.namespacesServiceGet(key, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespacesServiceApi#namespacesServiceGet");
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
| **key** | **String**|  | |
| **reference** | **String**|  | [optional] |

### Return type

[**Namespace**](Namespace.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="namespacesServiceList"></a>
# **namespacesServiceList**
> NamespaceList namespacesServiceList(limit, offset, pageToken, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NamespacesServiceApi apiInstance = new NamespacesServiceApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      NamespaceList result = apiInstance.namespacesServiceList(limit, offset, pageToken, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespacesServiceApi#namespacesServiceList");
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
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **pageToken** | **String**|  | [optional] |
| **reference** | **String**|  | [optional] |

### Return type

[**NamespaceList**](NamespaceList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="namespacesServiceUpdate"></a>
# **namespacesServiceUpdate**
> Namespace namespacesServiceUpdate(key, namespaceUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NamespacesServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NamespacesServiceApi apiInstance = new NamespacesServiceApi(defaultClient);
    String key = "key_example"; // String | 
    NamespaceUpdateRequest namespaceUpdateRequest = new NamespaceUpdateRequest(); // NamespaceUpdateRequest | 
    try {
      Namespace result = apiInstance.namespacesServiceUpdate(key, namespaceUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamespacesServiceApi#namespacesServiceUpdate");
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
| **key** | **String**|  | |
| **namespaceUpdateRequest** | [**NamespaceUpdateRequest**](NamespaceUpdateRequest.md)|  | |

### Return type

[**Namespace**](Namespace.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

