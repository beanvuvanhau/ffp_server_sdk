# AuthMethodOidcServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authMethodOIDCServiceAuthorizeURL**](AuthMethodOidcServiceApi.md#authMethodOIDCServiceAuthorizeURL) | **GET** /auth/v1/method/oidc/{provider}/authorize |  |
| [**authMethodOIDCServiceCallback**](AuthMethodOidcServiceApi.md#authMethodOIDCServiceCallback) | **GET** /auth/v1/method/oidc/{provider}/callback |  |


<a id="authMethodOIDCServiceAuthorizeURL"></a>
# **authMethodOIDCServiceAuthorizeURL**
> AuthMethodOIDCAuthorizeURLResponse authMethodOIDCServiceAuthorizeURL(provider, state)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthMethodOidcServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AuthMethodOidcServiceApi apiInstance = new AuthMethodOidcServiceApi(defaultClient);
    String provider = "provider_example"; // String | 
    String state = "state_example"; // String | 
    try {
      AuthMethodOIDCAuthorizeURLResponse result = apiInstance.authMethodOIDCServiceAuthorizeURL(provider, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMethodOidcServiceApi#authMethodOIDCServiceAuthorizeURL");
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
| **provider** | **String**|  | |
| **state** | **String**|  | |

### Return type

[**AuthMethodOIDCAuthorizeURLResponse**](AuthMethodOIDCAuthorizeURLResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="authMethodOIDCServiceCallback"></a>
# **authMethodOIDCServiceCallback**
> AuthMethodOIDCCallbackResponse authMethodOIDCServiceCallback(provider, code, state)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthMethodOidcServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AuthMethodOidcServiceApi apiInstance = new AuthMethodOidcServiceApi(defaultClient);
    String provider = "provider_example"; // String | 
    String code = "code_example"; // String | 
    String state = "state_example"; // String | 
    try {
      AuthMethodOIDCCallbackResponse result = apiInstance.authMethodOIDCServiceCallback(provider, code, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMethodOidcServiceApi#authMethodOIDCServiceCallback");
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
| **provider** | **String**|  | |
| **code** | **String**|  | |
| **state** | **String**|  | |

### Return type

[**AuthMethodOIDCCallbackResponse**](AuthMethodOIDCCallbackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

