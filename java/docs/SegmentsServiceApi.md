# SegmentsServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**segmentsServiceCreate**](SegmentsServiceApi.md#segmentsServiceCreate) | **POST** /api/v1/namespaces/{namespaceKey}/segments |  |
| [**segmentsServiceDelete**](SegmentsServiceApi.md#segmentsServiceDelete) | **DELETE** /api/v1/namespaces/{namespaceKey}/segments/{key} |  |
| [**segmentsServiceGet**](SegmentsServiceApi.md#segmentsServiceGet) | **GET** /api/v1/namespaces/{namespaceKey}/segments/{key} |  |
| [**segmentsServiceList**](SegmentsServiceApi.md#segmentsServiceList) | **GET** /api/v1/namespaces/{namespaceKey}/segments |  |
| [**segmentsServiceUpdate**](SegmentsServiceApi.md#segmentsServiceUpdate) | **PUT** /api/v1/namespaces/{namespaceKey}/segments/{key} |  |


<a id="segmentsServiceCreate"></a>
# **segmentsServiceCreate**
> Segment segmentsServiceCreate(namespaceKey, segmentCreateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SegmentsServiceApi apiInstance = new SegmentsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    SegmentCreateRequest segmentCreateRequest = new SegmentCreateRequest(); // SegmentCreateRequest | 
    try {
      Segment result = apiInstance.segmentsServiceCreate(namespaceKey, segmentCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsServiceApi#segmentsServiceCreate");
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
| **segmentCreateRequest** | [**SegmentCreateRequest**](SegmentCreateRequest.md)|  | |

### Return type

[**Segment**](Segment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="segmentsServiceDelete"></a>
# **segmentsServiceDelete**
> segmentsServiceDelete(namespaceKey, key)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SegmentsServiceApi apiInstance = new SegmentsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.segmentsServiceDelete(namespaceKey, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsServiceApi#segmentsServiceDelete");
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

<a id="segmentsServiceGet"></a>
# **segmentsServiceGet**
> Segment segmentsServiceGet(namespaceKey, key, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SegmentsServiceApi apiInstance = new SegmentsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String key = "key_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      Segment result = apiInstance.segmentsServiceGet(namespaceKey, key, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsServiceApi#segmentsServiceGet");
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

[**Segment**](Segment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="segmentsServiceList"></a>
# **segmentsServiceList**
> SegmentList segmentsServiceList(namespaceKey, limit, offset, pageToken, reference)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SegmentsServiceApi apiInstance = new SegmentsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String pageToken = "pageToken_example"; // String | 
    String reference = "reference_example"; // String | 
    try {
      SegmentList result = apiInstance.segmentsServiceList(namespaceKey, limit, offset, pageToken, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsServiceApi#segmentsServiceList");
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

[**SegmentList**](SegmentList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="segmentsServiceUpdate"></a>
# **segmentsServiceUpdate**
> Segment segmentsServiceUpdate(namespaceKey, key, segmentUpdateRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SegmentsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    SegmentsServiceApi apiInstance = new SegmentsServiceApi(defaultClient);
    String namespaceKey = "namespaceKey_example"; // String | 
    String key = "key_example"; // String | 
    SegmentUpdateRequest segmentUpdateRequest = new SegmentUpdateRequest(); // SegmentUpdateRequest | 
    try {
      Segment result = apiInstance.segmentsServiceUpdate(namespaceKey, key, segmentUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsServiceApi#segmentsServiceUpdate");
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
| **segmentUpdateRequest** | [**SegmentUpdateRequest**](SegmentUpdateRequest.md)|  | |

### Return type

[**Segment**](Segment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

