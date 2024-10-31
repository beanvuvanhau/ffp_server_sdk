# AuthMethodTokenServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authMethodTokenServiceCreateToken**](AuthMethodTokenServiceApi.md#authMethodTokenServiceCreateToken) | **POST** /auth/v1/method/token |  |


<a id="authMethodTokenServiceCreateToken"></a>
# **authMethodTokenServiceCreateToken**
> AuthenticationToken authMethodTokenServiceCreateToken(authMethodTokenServiceCreateTokenRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthMethodTokenServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AuthMethodTokenServiceApi apiInstance = new AuthMethodTokenServiceApi(defaultClient);
    AuthMethodTokenServiceCreateTokenRequest authMethodTokenServiceCreateTokenRequest = new AuthMethodTokenServiceCreateTokenRequest(); // AuthMethodTokenServiceCreateTokenRequest | 
    try {
      AuthenticationToken result = apiInstance.authMethodTokenServiceCreateToken(authMethodTokenServiceCreateTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMethodTokenServiceApi#authMethodTokenServiceCreateToken");
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
| **authMethodTokenServiceCreateTokenRequest** | [**AuthMethodTokenServiceCreateTokenRequest**](AuthMethodTokenServiceCreateTokenRequest.md)|  | |

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

