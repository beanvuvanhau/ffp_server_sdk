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
import org.openapitools.client.model.BatchEvaluationRequest;
import org.openapitools.client.model.BatchEvaluationResponse;
import org.openapitools.client.model.EvaluationRequest;
import org.openapitools.client.model.EvaluationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EvaluateServiceApi
 */
@Disabled
public class EvaluateServiceApiTest {

    private final EvaluateServiceApi api = new EvaluateServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evaluateServiceBatchEvaluateTest() throws ApiException {
        String namespaceKey = null;
        BatchEvaluationRequest batchEvaluationRequest = null;
        BatchEvaluationResponse response = api.evaluateServiceBatchEvaluate(namespaceKey, batchEvaluationRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evaluateServiceEvaluateTest() throws ApiException {
        String namespaceKey = null;
        EvaluationRequest evaluationRequest = null;
        EvaluationResponse response = api.evaluateServiceEvaluate(namespaceKey, evaluationRequest);
        // TODO: test validations
    }

}
