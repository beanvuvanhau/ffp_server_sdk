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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AuthMethodOIDCAuthorizeURLResponse;
import org.openapitools.client.model.AuthMethodOIDCCallbackResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthMethodOidcServiceApi
 */
@Disabled
public class AuthMethodOidcServiceApiTest {

    private final AuthMethodOidcServiceApi api = new AuthMethodOidcServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authMethodOIDCServiceAuthorizeURLTest() throws ApiException {
        String provider = null;
        String state = null;
        AuthMethodOIDCAuthorizeURLResponse response = api.authMethodOIDCServiceAuthorizeURL(provider, state);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authMethodOIDCServiceCallbackTest() throws ApiException {
        String provider = null;
        String code = null;
        String state = null;
        AuthMethodOIDCCallbackResponse response = api.authMethodOIDCServiceCallback(provider, code, state);
        // TODO: test validations
    }

}
