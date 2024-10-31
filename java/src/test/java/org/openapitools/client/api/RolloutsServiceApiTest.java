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
import org.openapitools.client.model.Rollout;
import org.openapitools.client.model.RolloutCreateRequest;
import org.openapitools.client.model.RolloutList;
import org.openapitools.client.model.RolloutOrderRequest;
import org.openapitools.client.model.RolloutUpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolloutsServiceApi
 */
@Disabled
public class RolloutsServiceApiTest {

    private final RolloutsServiceApi api = new RolloutsServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rolloutsServiceCreateTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        RolloutCreateRequest rolloutCreateRequest = null;
        Rollout response = api.rolloutsServiceCreate(namespaceKey, flagKey, rolloutCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rolloutsServiceDeleteTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        String id = null;
        api.rolloutsServiceDelete(namespaceKey, flagKey, id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rolloutsServiceGetTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        String id = null;
        String reference = null;
        Rollout response = api.rolloutsServiceGet(namespaceKey, flagKey, id, reference);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rolloutsServiceListTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        Integer limit = null;
        Integer offset = null;
        String pageToken = null;
        String reference = null;
        RolloutList response = api.rolloutsServiceList(namespaceKey, flagKey, limit, offset, pageToken, reference);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rolloutsServiceOrderTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        RolloutOrderRequest rolloutOrderRequest = null;
        api.rolloutsServiceOrder(namespaceKey, flagKey, rolloutOrderRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rolloutsServiceUpdateTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        String id = null;
        RolloutUpdateRequest rolloutUpdateRequest = null;
        api.rolloutsServiceUpdate(namespaceKey, flagKey, id, rolloutUpdateRequest);
        // TODO: test validations
    }

}