/*
 * YNAB API Endpoints
 * Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.ynab.com
 *
 * The version of the OpenAPI document: 1.68.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ErrorResponse;
import com.konfigthis.client.model.PayeeResponse;
import com.konfigthis.client.model.PayeesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayeesApi
 */
@Disabled
public class PayeesApiTest {

    private static PayeesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PayeesApi(apiClient);
    }

    /**
     * Single payee
     *
     * Returns a single payee
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSinglePayeeTest() throws ApiException {
        String budgetId = null;
        String payeeId = null;
        PayeeResponse response = api.getSinglePayee(budgetId, payeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * List payees
     *
     * Returns all payees
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String budgetId = null;
        Long lastKnowledgeOfServer = null;
        PayeesResponse response = api.listAll(budgetId)
                .lastKnowledgeOfServer(lastKnowledgeOfServer)
                .execute();
        // TODO: test validations
    }

}
