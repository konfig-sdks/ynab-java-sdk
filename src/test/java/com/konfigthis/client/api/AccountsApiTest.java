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
import com.konfigthis.client.model.AccountResponse;
import com.konfigthis.client.model.AccountsResponse;
import com.konfigthis.client.model.ErrorResponse;
import com.konfigthis.client.model.PostAccountWrapper;
import com.konfigthis.client.model.SaveAccount;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Disabled
public class AccountsApiTest {

    private static AccountsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccountsApi(apiClient);
    }

    /**
     * Create a new account
     *
     * Creates a new account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewAccountTest() throws ApiException {
        SaveAccount account = null;
        String budgetId = null;
        AccountResponse response = api.createNewAccount(account, budgetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Single account
     *
     * Returns a single account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleAccountTest() throws ApiException {
        String budgetId = null;
        UUID accountId = null;
        AccountResponse response = api.getSingleAccount(budgetId, accountId)
                .execute();
        // TODO: test validations
    }

    /**
     * Account list
     *
     * Returns all accounts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String budgetId = null;
        Long lastKnowledgeOfServer = null;
        AccountsResponse response = api.listAll(budgetId)
                .lastKnowledgeOfServer(lastKnowledgeOfServer)
                .execute();
        // TODO: test validations
    }

}