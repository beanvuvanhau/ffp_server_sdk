# AuthMethodK8SServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authMethodK8SServiceVerifyServiceAccount**](AuthMethodK8SServiceApi.md#authMethodK8SServiceVerifyServiceAccount) | **POST** /auth/v1/method/kubernetes/serviceaccount |  |


<a id="authMethodK8SServiceVerifyServiceAccount"></a>
# **authMethodK8SServiceVerifyServiceAccount**
> AuthenticationToken authMethodK8SServiceVerifyServiceAccount(authMethodK8SServiceVerifyServiceAccountRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthMethodK8SServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AuthMethodK8SServiceApi apiInstance = new AuthMethodK8SServiceApi(defaultClient);
    AuthMethodK8SServiceVerifyServiceAccountRequest authMethodK8SServiceVerifyServiceAccountRequest = new AuthMethodK8SServiceVerifyServiceAccountRequest(); // AuthMethodK8SServiceVerifyServiceAccountRequest | 
    try {
      AuthenticationToken result = apiInstance.authMethodK8SServiceVerifyServiceAccount(authMethodK8SServiceVerifyServiceAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMethodK8SServiceApi#authMethodK8SServiceVerifyServiceAccount");
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
| **authMethodK8SServiceVerifyServiceAccountRequest** | [**AuthMethodK8SServiceVerifyServiceAccountRequest**](AuthMethodK8SServiceVerifyServiceAccountRequest.md)|  | |

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

