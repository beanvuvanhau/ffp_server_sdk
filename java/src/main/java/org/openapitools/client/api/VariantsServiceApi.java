/*
 * api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.46.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Variant;
import org.openapitools.client.model.VariantCreateRequest;
import org.openapitools.client.model.VariantUpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariantsServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VariantsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VariantsServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for variantsServiceCreate
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param variantCreateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call variantsServiceCreateCall(String namespaceKey, String flagKey, VariantCreateRequest variantCreateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = variantCreateRequest;

        // create path and map variables
        String localVarPath = "/api/v1/namespaces/{namespaceKey}/flags/{flagKey}/variants"
            .replace("{" + "namespaceKey" + "}", localVarApiClient.escapeString(namespaceKey.toString()))
            .replace("{" + "flagKey" + "}", localVarApiClient.escapeString(flagKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call variantsServiceCreateValidateBeforeCall(String namespaceKey, String flagKey, VariantCreateRequest variantCreateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespaceKey' is set
        if (namespaceKey == null) {
            throw new ApiException("Missing the required parameter 'namespaceKey' when calling variantsServiceCreate(Async)");
        }

        // verify the required parameter 'flagKey' is set
        if (flagKey == null) {
            throw new ApiException("Missing the required parameter 'flagKey' when calling variantsServiceCreate(Async)");
        }

        // verify the required parameter 'variantCreateRequest' is set
        if (variantCreateRequest == null) {
            throw new ApiException("Missing the required parameter 'variantCreateRequest' when calling variantsServiceCreate(Async)");
        }

        return variantsServiceCreateCall(namespaceKey, flagKey, variantCreateRequest, _callback);

    }

    /**
     * 
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param variantCreateRequest  (required)
     * @return Variant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Variant variantsServiceCreate(String namespaceKey, String flagKey, VariantCreateRequest variantCreateRequest) throws ApiException {
        ApiResponse<Variant> localVarResp = variantsServiceCreateWithHttpInfo(namespaceKey, flagKey, variantCreateRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param variantCreateRequest  (required)
     * @return ApiResponse&lt;Variant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Variant> variantsServiceCreateWithHttpInfo(String namespaceKey, String flagKey, VariantCreateRequest variantCreateRequest) throws ApiException {
        okhttp3.Call localVarCall = variantsServiceCreateValidateBeforeCall(namespaceKey, flagKey, variantCreateRequest, null);
        Type localVarReturnType = new TypeToken<Variant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param variantCreateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call variantsServiceCreateAsync(String namespaceKey, String flagKey, VariantCreateRequest variantCreateRequest, final ApiCallback<Variant> _callback) throws ApiException {

        okhttp3.Call localVarCall = variantsServiceCreateValidateBeforeCall(namespaceKey, flagKey, variantCreateRequest, _callback);
        Type localVarReturnType = new TypeToken<Variant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for variantsServiceDelete
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call variantsServiceDeleteCall(String namespaceKey, String flagKey, String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/namespaces/{namespaceKey}/flags/{flagKey}/variants/{id}"
            .replace("{" + "namespaceKey" + "}", localVarApiClient.escapeString(namespaceKey.toString()))
            .replace("{" + "flagKey" + "}", localVarApiClient.escapeString(flagKey.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call variantsServiceDeleteValidateBeforeCall(String namespaceKey, String flagKey, String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespaceKey' is set
        if (namespaceKey == null) {
            throw new ApiException("Missing the required parameter 'namespaceKey' when calling variantsServiceDelete(Async)");
        }

        // verify the required parameter 'flagKey' is set
        if (flagKey == null) {
            throw new ApiException("Missing the required parameter 'flagKey' when calling variantsServiceDelete(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling variantsServiceDelete(Async)");
        }

        return variantsServiceDeleteCall(namespaceKey, flagKey, id, _callback);

    }

    /**
     * 
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void variantsServiceDelete(String namespaceKey, String flagKey, String id) throws ApiException {
        variantsServiceDeleteWithHttpInfo(namespaceKey, flagKey, id);
    }

    /**
     * 
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> variantsServiceDeleteWithHttpInfo(String namespaceKey, String flagKey, String id) throws ApiException {
        okhttp3.Call localVarCall = variantsServiceDeleteValidateBeforeCall(namespaceKey, flagKey, id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call variantsServiceDeleteAsync(String namespaceKey, String flagKey, String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = variantsServiceDeleteValidateBeforeCall(namespaceKey, flagKey, id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for variantsServiceUpdate
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @param variantUpdateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call variantsServiceUpdateCall(String namespaceKey, String flagKey, String id, VariantUpdateRequest variantUpdateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = variantUpdateRequest;

        // create path and map variables
        String localVarPath = "/api/v1/namespaces/{namespaceKey}/flags/{flagKey}/variants/{id}"
            .replace("{" + "namespaceKey" + "}", localVarApiClient.escapeString(namespaceKey.toString()))
            .replace("{" + "flagKey" + "}", localVarApiClient.escapeString(flagKey.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call variantsServiceUpdateValidateBeforeCall(String namespaceKey, String flagKey, String id, VariantUpdateRequest variantUpdateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespaceKey' is set
        if (namespaceKey == null) {
            throw new ApiException("Missing the required parameter 'namespaceKey' when calling variantsServiceUpdate(Async)");
        }

        // verify the required parameter 'flagKey' is set
        if (flagKey == null) {
            throw new ApiException("Missing the required parameter 'flagKey' when calling variantsServiceUpdate(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling variantsServiceUpdate(Async)");
        }

        // verify the required parameter 'variantUpdateRequest' is set
        if (variantUpdateRequest == null) {
            throw new ApiException("Missing the required parameter 'variantUpdateRequest' when calling variantsServiceUpdate(Async)");
        }

        return variantsServiceUpdateCall(namespaceKey, flagKey, id, variantUpdateRequest, _callback);

    }

    /**
     * 
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @param variantUpdateRequest  (required)
     * @return Variant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Variant variantsServiceUpdate(String namespaceKey, String flagKey, String id, VariantUpdateRequest variantUpdateRequest) throws ApiException {
        ApiResponse<Variant> localVarResp = variantsServiceUpdateWithHttpInfo(namespaceKey, flagKey, id, variantUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @param variantUpdateRequest  (required)
     * @return ApiResponse&lt;Variant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Variant> variantsServiceUpdateWithHttpInfo(String namespaceKey, String flagKey, String id, VariantUpdateRequest variantUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = variantsServiceUpdateValidateBeforeCall(namespaceKey, flagKey, id, variantUpdateRequest, null);
        Type localVarReturnType = new TypeToken<Variant>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param namespaceKey  (required)
     * @param flagKey  (required)
     * @param id  (required)
     * @param variantUpdateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call variantsServiceUpdateAsync(String namespaceKey, String flagKey, String id, VariantUpdateRequest variantUpdateRequest, final ApiCallback<Variant> _callback) throws ApiException {

        okhttp3.Call localVarCall = variantsServiceUpdateValidateBeforeCall(namespaceKey, flagKey, id, variantUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<Variant>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
