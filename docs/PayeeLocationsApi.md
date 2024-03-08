# PayeeLocationsApi

All URIs are relative to *https://api.ynab.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingle**](PayeeLocationsApi.md#getSingle) | **GET** /budgets/{budget_id}/payee_locations/{payee_location_id} | Single payee location |
| [**listAll**](PayeeLocationsApi.md#listAll) | **GET** /budgets/{budget_id}/payee_locations | List payee locations |
| [**listByPayee**](PayeeLocationsApi.md#listByPayee) | **GET** /budgets/{budget_id}/payees/{payee_id}/payee_locations | List locations for a payee |


<a name="getSingle"></a>
# **getSingle**
> PayeeLocationResponse getSingle(budgetId, payeeLocationId).execute();

Single payee location

Returns a single payee location

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayeeLocationsApi;
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
    String payeeLocationId = "payeeLocationId_example"; // id of payee location
    try {
      PayeeLocationResponse result = client
              .payeeLocations
              .getSingle(budgetId, payeeLocationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeeLocationsApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeeLocationResponse> response = client
              .payeeLocations
              .getSingle(budgetId, payeeLocationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeeLocationsApi#getSingle");
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
| **payeeLocationId** | **String**| id of payee location | |

### Return type

[**PayeeLocationResponse**](PayeeLocationResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The payee location |  -  |
| **0** | An error occurred |  -  |

<a name="listAll"></a>
# **listAll**
> PayeeLocationsResponse listAll(budgetId).execute();

List payee locations

Returns all payee locations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayeeLocationsApi;
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
      PayeeLocationsResponse result = client
              .payeeLocations
              .listAll(budgetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeeLocationsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeeLocationsResponse> response = client
              .payeeLocations
              .listAll(budgetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeeLocationsApi#listAll");
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

[**PayeeLocationsResponse**](PayeeLocationsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of payee locations |  -  |
| **0** | An error occurred |  -  |

<a name="listByPayee"></a>
# **listByPayee**
> PayeeLocationsResponse listByPayee(budgetId, payeeId).execute();

List locations for a payee

Returns all payee locations for a specified payee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayeeLocationsApi;
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
    String payeeId = "payeeId_example"; // id of payee
    try {
      PayeeLocationsResponse result = client
              .payeeLocations
              .listByPayee(budgetId, payeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeeLocationsApi#listByPayee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayeeLocationsResponse> response = client
              .payeeLocations
              .listByPayee(budgetId, payeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayeeLocationsApi#listByPayee");
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
| **payeeId** | **String**| id of payee | |

### Return type

[**PayeeLocationsResponse**](PayeeLocationsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of requested payee locations |  -  |
| **0** | An error occurred |  -  |

