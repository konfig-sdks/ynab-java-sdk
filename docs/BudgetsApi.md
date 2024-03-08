# BudgetsApi

All URIs are relative to *https://api.ynab.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBudget**](BudgetsApi.md#getBudget) | **GET** /budgets/{budget_id} | Single budget |
| [**getSettings**](BudgetsApi.md#getSettings) | **GET** /budgets/{budget_id}/settings | Budget Settings |
| [**listSummary**](BudgetsApi.md#listSummary) | **GET** /budgets | List budgets |


<a name="getBudget"></a>
# **getBudget**
> BudgetDetailResponse getBudget(budgetId).lastKnowledgeOfServer(lastKnowledgeOfServer).execute();

Single budget

Returns a single budget with all related entities.  This resource is effectively a full budget export.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.ynab.com/v1";
    
    // Configure HTTP bearer authorization: bearer
    configuration.token = "BEARER TOKEN";
    Ynab client = new Ynab(configuration);
    String budgetId = "budgetId_example"; // The id of the budget. \"last-used\" can be used to specify the last used budget and \"default\" can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget).
    Long lastKnowledgeOfServer = 56L; // The starting server knowledge.  If provided, only entities that have changed since `last_knowledge_of_server` will be included.
    try {
      BudgetDetailResponse result = client
              .budgets
              .getBudget(budgetId)
              .lastKnowledgeOfServer(lastKnowledgeOfServer)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getBudget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetDetailResponse> response = client
              .budgets
              .getBudget(budgetId)
              .lastKnowledgeOfServer(lastKnowledgeOfServer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getBudget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **budgetId** | **String**| The id of the budget. \&quot;last-used\&quot; can be used to specify the last used budget and \&quot;default\&quot; can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget). | |
| **lastKnowledgeOfServer** | **Long**| The starting server knowledge.  If provided, only entities that have changed since &#x60;last_knowledge_of_server&#x60; will be included. | [optional] |

### Return type

[**BudgetDetailResponse**](BudgetDetailResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested budget |  -  |
| **0** | An error occurred |  -  |

<a name="getSettings"></a>
# **getSettings**
> BudgetSettingsResponse getSettings(budgetId).execute();

Budget Settings

Returns settings for a budget

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.ynab.com/v1";
    
    // Configure HTTP bearer authorization: bearer
    configuration.token = "BEARER TOKEN";
    Ynab client = new Ynab(configuration);
    String budgetId = "budgetId_example"; // The id of the budget. \"last-used\" can be used to specify the last used budget and \"default\" can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget).
    try {
      BudgetSettingsResponse result = client
              .budgets
              .getSettings(budgetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetSettingsResponse> response = client
              .budgets
              .getSettings(budgetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **budgetId** | **String**| The id of the budget. \&quot;last-used\&quot; can be used to specify the last used budget and \&quot;default\&quot; can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget). | |

### Return type

[**BudgetSettingsResponse**](BudgetSettingsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested budget settings |  -  |
| **0** | An error occurred |  -  |

<a name="listSummary"></a>
# **listSummary**
> BudgetSummaryResponse listSummary().includeAccounts(includeAccounts).execute();

List budgets

Returns budgets list with summary information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BudgetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.ynab.com/v1";
    
    // Configure HTTP bearer authorization: bearer
    configuration.token = "BEARER TOKEN";
    Ynab client = new Ynab(configuration);
    Boolean includeAccounts = true; // Whether to include the list of budget accounts
    try {
      BudgetSummaryResponse result = client
              .budgets
              .listSummary()
              .includeAccounts(includeAccounts)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#listSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BudgetSummaryResponse> response = client
              .budgets
              .listSummary()
              .includeAccounts(includeAccounts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#listSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeAccounts** | **Boolean**| Whether to include the list of budget accounts | [optional] |

### Return type

[**BudgetSummaryResponse**](BudgetSummaryResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of budgets |  -  |
| **0** | An error occurred |  -  |

