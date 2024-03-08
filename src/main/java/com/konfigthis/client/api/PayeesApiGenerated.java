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
import com.konfigthis.client.model.PayeeResponse;
import com.konfigthis.client.model.PayeesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PayeesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PayeesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PayeesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSinglePayeeCall(String budgetId, String payeeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/budgets/{budget_id}/payees/{payee_id}"
            .replace("{" + "budget_id" + "}", localVarApiClient.escapeString(budgetId.toString()))
            .replace("{" + "payee_id" + "}", localVarApiClient.escapeString(payeeId.toString()));

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
    private okhttp3.Call getSinglePayeeValidateBeforeCall(String budgetId, String payeeId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling getSinglePayee(Async)");
        }

        // verify the required parameter 'payeeId' is set
        if (payeeId == null) {
            throw new ApiException("Missing the required parameter 'payeeId' when calling getSinglePayee(Async)");
        }

        return getSinglePayeeCall(budgetId, payeeId, _callback);

    }


    private ApiResponse<PayeeResponse> getSinglePayeeWithHttpInfo(String budgetId, String payeeId) throws ApiException {
        okhttp3.Call localVarCall = getSinglePayeeValidateBeforeCall(budgetId, payeeId, null);
        Type localVarReturnType = new TypeToken<PayeeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSinglePayeeAsync(String budgetId, String payeeId, final ApiCallback<PayeeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSinglePayeeValidateBeforeCall(budgetId, payeeId, _callback);
        Type localVarReturnType = new TypeToken<PayeeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSinglePayeeRequestBuilder {
        private final String budgetId;
        private final String payeeId;

        private GetSinglePayeeRequestBuilder(String budgetId, String payeeId) {
            this.budgetId = budgetId;
            this.payeeId = payeeId;
        }

        /**
         * Build call for getSinglePayee
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested payee </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSinglePayeeCall(budgetId, payeeId, _callback);
        }


        /**
         * Execute getSinglePayee request
         * @return PayeeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested payee </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public PayeeResponse execute() throws ApiException {
            ApiResponse<PayeeResponse> localVarResp = getSinglePayeeWithHttpInfo(budgetId, payeeId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSinglePayee request with HTTP info returned
         * @return ApiResponse&lt;PayeeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested payee </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PayeeResponse> executeWithHttpInfo() throws ApiException {
            return getSinglePayeeWithHttpInfo(budgetId, payeeId);
        }

        /**
         * Execute getSinglePayee request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested payee </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayeeResponse> _callback) throws ApiException {
            return getSinglePayeeAsync(budgetId, payeeId, _callback);
        }
    }

    /**
     * Single payee
     * Returns a single payee
     * @param budgetId The id of the budget. \&quot;last-used\&quot; can be used to specify the last used budget and \&quot;default\&quot; can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget). (required)
     * @param payeeId The id of the payee (required)
     * @return GetSinglePayeeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested payee </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public GetSinglePayeeRequestBuilder getSinglePayee(String budgetId, String payeeId) throws IllegalArgumentException {
        if (budgetId == null) throw new IllegalArgumentException("\"budgetId\" is required but got null");
            

        if (payeeId == null) throw new IllegalArgumentException("\"payeeId\" is required but got null");
            

        return new GetSinglePayeeRequestBuilder(budgetId, payeeId);
    }
    private okhttp3.Call listAllCall(String budgetId, Long lastKnowledgeOfServer, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/budgets/{budget_id}/payees"
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
    private okhttp3.Call listAllValidateBeforeCall(String budgetId, Long lastKnowledgeOfServer, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling listAll(Async)");
        }

        return listAllCall(budgetId, lastKnowledgeOfServer, _callback);

    }


    private ApiResponse<PayeesResponse> listAllWithHttpInfo(String budgetId, Long lastKnowledgeOfServer) throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(budgetId, lastKnowledgeOfServer, null);
        Type localVarReturnType = new TypeToken<PayeesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(String budgetId, Long lastKnowledgeOfServer, final ApiCallback<PayeesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(budgetId, lastKnowledgeOfServer, _callback);
        Type localVarReturnType = new TypeToken<PayeesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRequestBuilder {
        private final String budgetId;
        private Long lastKnowledgeOfServer;

        private ListAllRequestBuilder(String budgetId) {
            this.budgetId = budgetId;
        }

        /**
         * Set lastKnowledgeOfServer
         * @param lastKnowledgeOfServer The starting server knowledge.  If provided, only entities that have changed since &#x60;last_knowledge_of_server&#x60; will be included. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder lastKnowledgeOfServer(Long lastKnowledgeOfServer) {
            this.lastKnowledgeOfServer = lastKnowledgeOfServer;
            return this;
        }
        
        /**
         * Build call for listAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested list of payees </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllCall(budgetId, lastKnowledgeOfServer, _callback);
        }


        /**
         * Execute listAll request
         * @return PayeesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested list of payees </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public PayeesResponse execute() throws ApiException {
            ApiResponse<PayeesResponse> localVarResp = listAllWithHttpInfo(budgetId, lastKnowledgeOfServer);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;PayeesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested list of payees </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PayeesResponse> executeWithHttpInfo() throws ApiException {
            return listAllWithHttpInfo(budgetId, lastKnowledgeOfServer);
        }

        /**
         * Execute listAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The requested list of payees </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PayeesResponse> _callback) throws ApiException {
            return listAllAsync(budgetId, lastKnowledgeOfServer, _callback);
        }
    }

    /**
     * List payees
     * Returns all payees
     * @param budgetId The id of the budget. \&quot;last-used\&quot; can be used to specify the last used budget and \&quot;default\&quot; can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget). (required)
     * @return ListAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested list of payees </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error occurred </td><td>  -  </td></tr>
     </table>
     */
    public ListAllRequestBuilder listAll(String budgetId) throws IllegalArgumentException {
        if (budgetId == null) throw new IllegalArgumentException("\"budgetId\" is required but got null");
            

        return new ListAllRequestBuilder(budgetId);
    }
}
