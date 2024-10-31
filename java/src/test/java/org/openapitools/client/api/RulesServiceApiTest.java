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
import org.openapitools.client.model.Rule;
import org.openapitools.client.model.RuleCreateRequest;
import org.openapitools.client.model.RuleList;
import org.openapitools.client.model.RuleOrderRequest;
import org.openapitools.client.model.RuleUpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RulesServiceApi
 */
@Disabled
public class RulesServiceApiTest {

    private final RulesServiceApi api = new RulesServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rulesServiceCreateTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        RuleCreateRequest ruleCreateRequest = null;
        Rule response = api.rulesServiceCreate(namespaceKey, flagKey, ruleCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rulesServiceDeleteTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        String id = null;
        api.rulesServiceDelete(namespaceKey, flagKey, id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rulesServiceGetTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        String id = null;
        String reference = null;
        Rule response = api.rulesServiceGet(namespaceKey, flagKey, id, reference);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rulesServiceListTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        Integer limit = null;
        Integer offset = null;
        String pageToken = null;
        String reference = null;
        RuleList response = api.rulesServiceList(namespaceKey, flagKey, limit, offset, pageToken, reference);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rulesServiceOrderTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        RuleOrderRequest ruleOrderRequest = null;
        api.rulesServiceOrder(namespaceKey, flagKey, ruleOrderRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rulesServiceUpdateTest() throws ApiException {
        String namespaceKey = null;
        String flagKey = null;
        String id = null;
        RuleUpdateRequest ruleUpdateRequest = null;
        api.rulesServiceUpdate(namespaceKey, flagKey, id, ruleUpdateRequest);
        // TODO: test validations
    }

}
