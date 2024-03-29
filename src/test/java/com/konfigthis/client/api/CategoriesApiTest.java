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
import com.konfigthis.client.model.CategoriesResponse;
import com.konfigthis.client.model.CategoryResponse;
import com.konfigthis.client.model.ErrorResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.PatchCategoryWrapper;
import com.konfigthis.client.model.PatchMonthCategoryWrapper;
import com.konfigthis.client.model.SaveCategory;
import com.konfigthis.client.model.SaveCategoryResponse;
import com.konfigthis.client.model.SaveMonthCategory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
@Disabled
public class CategoriesApiTest {

    private static CategoriesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CategoriesApi(apiClient);
    }

    /**
     * Single category for a specific budget month
     *
     * Returns a single category for a specific budget month.  Amounts (budgeted, activity, balance, etc.) are specific to the current budget month (UTC).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMonthCategoryByIdTest() throws ApiException {
        String budgetId = null;
        LocalDate month = null;
        String categoryId = null;
        CategoryResponse response = api.getMonthCategoryById(budgetId, month, categoryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Single category
     *
     * Returns a single category.  Amounts (budgeted, activity, balance, etc.) are specific to the current budget month (UTC).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleCategoryTest() throws ApiException {
        String budgetId = null;
        String categoryId = null;
        CategoryResponse response = api.getSingleCategory(budgetId, categoryId)
                .execute();
        // TODO: test validations
    }

    /**
     * List categories
     *
     * Returns all categories grouped by category group.  Amounts (budgeted, activity, balance, etc.) are specific to the current budget month (UTC).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listByBudgetIdTest() throws ApiException {
        String budgetId = null;
        Long lastKnowledgeOfServer = null;
        CategoriesResponse response = api.listByBudgetId(budgetId)
                .lastKnowledgeOfServer(lastKnowledgeOfServer)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a category
     *
     * Update a category
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCategoryByIdTest() throws ApiException {
        SaveCategory category = null;
        String budgetId = null;
        String categoryId = null;
        SaveCategoryResponse response = api.updateCategoryById(category, budgetId, categoryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a category for a specific month
     *
     * Update a category for a specific month.  Only &#x60;budgeted&#x60; amount can be updated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMonthCategoryTest() throws ApiException {
        SaveMonthCategory category = null;
        String budgetId = null;
        LocalDate month = null;
        String categoryId = null;
        SaveCategoryResponse response = api.updateMonthCategory(category, budgetId, month, categoryId)
                .execute();
        // TODO: test validations
    }

}
