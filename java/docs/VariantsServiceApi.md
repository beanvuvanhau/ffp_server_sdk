# VariantsServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**variantsServiceCreate**](VariantsServiceApi.md#variantsServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/variants |  |
| [**variantsServiceDelete**](VariantsServiceApi.md#variantsServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/variants/{id} |  |
| [**variantsServiceUpdate**](VariantsServiceApi.md#variantsServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/flags/{flagKey}/variants/{id} |  |


<a id="variantsServiceCreate"></a>
# **variantsServiceCreate**
> Variant variantsServiceCreate(namespaceKey, flagKey, variantCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariantsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VariantsServiceApi apiInstance = new VariantsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    VariantCreateRequest variantCreateRequest = new VariantCreateRequest(); // VariantCreateRequest | 
    try {
      Variant result = apiInstance.variantsServiceCreate(namespaceKey, flagKey, variantCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsServiceApi#variantsServiceCreate");
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
| **variantCreateRequest** | [**VariantCreateRequest**](VariantCreateRequest.md)|  | |

### Return type

[**Variant**](Variant.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="variantsServiceDelete"></a>
# **variantsServiceDelete**
> variantsServiceDelete(namespaceKey, flagKey, id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariantsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VariantsServiceApi apiInstance = new VariantsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.variantsServiceDelete(namespaceKey, flagKey, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsServiceApi#variantsServiceDelete");
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

<a id="variantsServiceUpdate"></a>
# **variantsServiceUpdate**
> Variant variantsServiceUpdate(namespaceKey, flagKey, id, variantUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariantsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VariantsServiceApi apiInstance = new VariantsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String flagKey = "flagKey_example"; // String | 
    String id = "id_example"; // String | 
    VariantUpdateRequest variantUpdateRequest = new VariantUpdateRequest(); // VariantUpdateRequest | 
    try {
      Variant result = apiInstance.variantsServiceUpdate(namespaceKey, flagKey, id, variantUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariantsServiceApi#variantsServiceUpdate");
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
| **variantUpdateRequest** | [**VariantUpdateRequest**](VariantUpdateRequest.md)|  | |

### Return type

[**Variant**](Variant.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

