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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ErrorResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.MonthDetailResponse;
import com.konfigthis.client.model.MonthSummariesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MonthsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MonthsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public MonthsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSingleCall(String budgetId, LocalDate month, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/budgets/{budget_id}/months/{month}"
            .replace("{" + "budget_id" + "}", localVarApiClient.escapeString(budgetId.toString()))
            .replace("{" + "month" + "}", localVarApiClient.escapeString(month.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSingleValidateBeforeCall(String budgetId, LocalDate month, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling getSingle(Async)");
        }

        // verify the required parameter 'month' is set
        if (month == null) {
            throw new ApiException("Missing the required parameter 'month' when calling getSingle(Async)");
        }

        return getSingleCall(budgetId, month, _callback);

    }


    private ApiResponse<MonthDetailResponse> getSingleWithHttpInfo(String budgetId, LocalDate month) throws ApiException {
        okhttp3.Call localVarCall = getSingleValidateBeforeCall(budgetId, month, null);
        Type localVarReturnType = new TypeToken<MonthDetailResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSingleAsync(String budgetId, LocalDate month, final ApiCallback<MonthDetailResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSingleValidateBeforeCall(budgetId, month, _callback);
        Type localVarReturnType = new TypeToken<MonthDetailResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSingleRequestBuilder {
        private final String budgetId;
        private final LocalDate month;

        private GetSingleRequestBuilder(String budgetId, LocalDate month) {
            this.budgetId = budgetId;
            this.month = month;
        }

        /**
         * Build call for getSingle
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The budget month detail </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSingleCall(budgetId, month, _callback);
        }


        /**
         * Execute getSingle request
         * @return MonthDetailResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The budget month detail </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public MonthDetailResponse execute() throws ApiException {
            ApiResponse<MonthDetailResponse> localVarResp = getSingleWithHttpInfo(budgetId, month);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSingle request with HTTP info returned
         * @return ApiResponse&lt;MonthDetailResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The budget month detail </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MonthDetailResponse> executeWithHttpInfo() throws ApiException {
            return getSingleWithHttpInfo(budgetId, month);
        }

        /**
         * Execute getSingle request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The budget month detail </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MonthDetailResponse> _callback) throws ApiException {
            return getSingleAsync(budgetId, month, _callback);
        }
    }

    /**
     * Single budget month
     * Returns a single budget month
     * @param budgetId The id of the budget. \&quot;last-used\&quot; can be used to specify the last used budget and \&quot;default\&quot; can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget). (required)
     * @param month The budget month in ISO format (e.g. 2016-12-01) (\&quot;current\&quot; can also be used to specify the current calendar month (UTC)) (required)
     * @return GetSingleRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The budget month detail </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public GetSingleRequestBuilder getSingle(String budgetId, LocalDate month) throws IllegalArgumentException {
        if (budgetId == null) throw new IllegalArgumentException("\"budgetId\" is required but got null");
            

        if (month == null) throw new IllegalArgumentException("\"month\" is required but got null");
        return new GetSingleRequestBuilder(budgetId, month);
    }
    private okhttp3.Call listCall(String budgetId, Long lastKnowledgeOfServer, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/budgets/{budget_id}/months"
            .replace("{" + "budget_id" + "}", localVarApiClient.escapeString(budgetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (lastKnowledgeOfServer != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_knowledge_of_server", lastKnowledgeOfServer));
        }

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(String budgetId, Long lastKnowledgeOfServer, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling list(Async)");
        }

        return listCall(budgetId, lastKnowledgeOfServer, _callback);

    }


    private ApiResponse<MonthSummariesResponse> listWithHttpInfo(String budgetId, Long lastKnowledgeOfServer) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(budgetId, lastKnowledgeOfServer, null);
        Type localVarReturnType = new TypeToken<MonthSummariesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAsync(String budgetId, Long lastKnowledgeOfServer, final ApiCallback<MonthSummariesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(budgetId, lastKnowledgeOfServer, _callback);
        Type localVarReturnType = new TypeToken<MonthSummariesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private final String budgetId;
        private Long lastKnowledgeOfServer;

        private ListRequestBuilder(String budgetId) {
            this.budgetId = budgetId;
        }

        /**
         * Set lastKnowledgeOfServer
         * @param lastKnowledgeOfServer The starting server knowledge.  If provided, only entities that have changed since &#x60;last_knowledge_of_server&#x60; will be included. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder lastKnowledgeOfServer(Long lastKnowledgeOfServer) {
            this.lastKnowledgeOfServer = lastKnowledgeOfServer;
            return this;
        }
        
        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of budget months </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(budgetId, lastKnowledgeOfServer, _callback);
        }


        /**
         * Execute list request
         * @return MonthSummariesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of budget months </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public MonthSummariesResponse execute() throws ApiException {
            ApiResponse<MonthSummariesResponse> localVarResp = listWithHttpInfo(budgetId, lastKnowledgeOfServer);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;MonthSummariesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of budget months </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<MonthSummariesResponse> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(budgetId, lastKnowledgeOfServer);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The list of budget months </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<MonthSummariesResponse> _callback) throws ApiException {
            return listAsync(budgetId, lastKnowledgeOfServer, _callback);
        }
    }

    /**
     * List budget months
     * Returns all budget months
     * @param budgetId The id of the budget. \&quot;last-used\&quot; can be used to specify the last used budget and \&quot;default\&quot; can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget). (required)
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The list of budget months </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list(String budgetId) throws IllegalArgumentException {
        if (budgetId == null) throw new IllegalArgumentException("\"budgetId\" is required but got null");
            

        return new ListRequestBuilder(budgetId);
    }
}
