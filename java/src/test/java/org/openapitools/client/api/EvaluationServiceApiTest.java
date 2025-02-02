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
import org.openapitools.client.model.BooleanEvaluationResponse;
import org.openapitools.client.model.EvaluationRequest;
import org.openapitools.client.model.VariantEvaluationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EvaluationServiceApi
 */
@Disabled
public class EvaluationServiceApiTest {

    private final EvaluationServiceApi api = new EvaluationServiceApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evaluationServiceBatchTest() throws ApiException {
        BatchEvaluationRequest batchEvaluationRequest = null;
        BatchEvaluationResponse response = api.evaluationServiceBatch(batchEvaluationRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evaluationServiceBooleanTest() throws ApiException {
        EvaluationRequest evaluationRequest = null;
        BooleanEvaluationResponse response = api.evaluationServiceBoolean(evaluationRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evaluationServiceVariantTest() throws ApiException {
        EvaluationRequest evaluationRequest = null;
        VariantEvaluationResponse response = api.evaluationServiceVariant(evaluationRequest);
        // TODO: test validations
    }

}
