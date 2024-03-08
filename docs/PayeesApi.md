# PayeesApi

All URIs are relative to *https://api.ynab.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSinglePayee**](PayeesApi.md#getSinglePayee) | **GET** /budgets/{budget_id}/payees/{payee_id} | Single payee |
| [**listAll**](PayeesApi.md#listAll) | **GET** /budgets/{budget_id}/payees | List payees |


<a name="getSinglePayee"></a>
# **getSinglePayee**
> PayeeResponse getSinglePayee(budgetId, payeeId).execute();

Single payee

Returns a single payee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayeesApi;
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
    String payeeId = "payeeId_example"; // The id of the payee
    try {
      PayeeResponse result = client
              .payees
              .getSinglePayee(budgetId, payeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeesApi#getSinglePayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeeResponse> response = client
              .payees
              .getSinglePayee(budgetId, payeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeesApi#getSinglePayee");
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
| **payeeId** | **String**| The id of the payee | |

### Return type

[**PayeeResponse**](PayeeResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested payee |  -  |
| **0** | An error occurred |  -  |

<a name="listAll"></a>
# **listAll**
> PayeesResponse listAll(budgetId).lastKnowledgeOfServer(lastKnowledgeOfServer).execute();

List payees

Returns all payees

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayeesApi;
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
      PayeesResponse result = client
              .payees
              .listAll(budgetId)
              .lastKnowledgeOfServer(lastKnowledgeOfServer)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeesResponse> response = client
              .payees
              .listAll(budgetId)
              .lastKnowledgeOfServer(lastKnowledgeOfServer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeesApi#listAll");
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

[**PayeesResponse**](PayeesResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested list of payees |  -  |
| **0** | An error occurred |  -  |

