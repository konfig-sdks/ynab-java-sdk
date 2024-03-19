<div align="left">

[![Visit You need a budget](./header.png)](https://api.youneedabudget.com)

# [You need a budget](https://api.youneedabudget.com)

Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.ynab.com

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=You%20Need%20A%20Budget&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>ynab-java-sdk</artifactId>
  <version>1.68.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:ynab-java-sdk:1.68.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ynab-java-sdk-1.68.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Ynab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    SaveAccount account = new SaveAccount();
    String budgetId = "budgetId_example"; // The id of the budget (\"last-used\" can be used to specify the last used budget and \"default\" can be used if default budget selection is enabled (see: https://api.ynab.com/#oauth-default-budget)
    try {
      AccountResponse result = client
              .accounts
              .createNewAccount(account, budgetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createNewAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountResponse> response = client
              .accounts
              .createNewAccount(account, budgetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createNewAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.ynab.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createNewAccount**](docs/AccountsApi.md#createNewAccount) | **POST** /budgets/{budget_id}/accounts | Create a new account
*AccountsApi* | [**getSingleAccount**](docs/AccountsApi.md#getSingleAccount) | **GET** /budgets/{budget_id}/accounts/{account_id} | Single account
*AccountsApi* | [**listAll**](docs/AccountsApi.md#listAll) | **GET** /budgets/{budget_id}/accounts | Account list
*BudgetsApi* | [**getBudget**](docs/BudgetsApi.md#getBudget) | **GET** /budgets/{budget_id} | Single budget
*BudgetsApi* | [**getSettings**](docs/BudgetsApi.md#getSettings) | **GET** /budgets/{budget_id}/settings | Budget Settings
*BudgetsApi* | [**listSummary**](docs/BudgetsApi.md#listSummary) | **GET** /budgets | List budgets
*CategoriesApi* | [**getMonthCategoryById**](docs/CategoriesApi.md#getMonthCategoryById) | **GET** /budgets/{budget_id}/months/{month}/categories/{category_id} | Single category for a specific budget month
*CategoriesApi* | [**getSingleCategory**](docs/CategoriesApi.md#getSingleCategory) | **GET** /budgets/{budget_id}/categories/{category_id} | Single category
*CategoriesApi* | [**listByBudgetId**](docs/CategoriesApi.md#listByBudgetId) | **GET** /budgets/{budget_id}/categories | List categories
*CategoriesApi* | [**updateCategoryById**](docs/CategoriesApi.md#updateCategoryById) | **PATCH** /budgets/{budget_id}/categories/{category_id} | Update a category
*CategoriesApi* | [**updateMonthCategory**](docs/CategoriesApi.md#updateMonthCategory) | **PATCH** /budgets/{budget_id}/months/{month}/categories/{category_id} | Update a category for a specific month
*MonthsApi* | [**getSingle**](docs/MonthsApi.md#getSingle) | **GET** /budgets/{budget_id}/months/{month} | Single budget month
*MonthsApi* | [**list**](docs/MonthsApi.md#list) | **GET** /budgets/{budget_id}/months | List budget months
*PayeeLocationsApi* | [**getSingle**](docs/PayeeLocationsApi.md#getSingle) | **GET** /budgets/{budget_id}/payee_locations/{payee_location_id} | Single payee location
*PayeeLocationsApi* | [**listAll**](docs/PayeeLocationsApi.md#listAll) | **GET** /budgets/{budget_id}/payee_locations | List payee locations
*PayeeLocationsApi* | [**listByPayee**](docs/PayeeLocationsApi.md#listByPayee) | **GET** /budgets/{budget_id}/payees/{payee_id}/payee_locations | List locations for a payee
*PayeesApi* | [**getSinglePayee**](docs/PayeesApi.md#getSinglePayee) | **GET** /budgets/{budget_id}/payees/{payee_id} | Single payee
*PayeesApi* | [**listAll**](docs/PayeesApi.md#listAll) | **GET** /budgets/{budget_id}/payees | List payees
*ScheduledTransactionsApi* | [**getSingleScheduledTransaction**](docs/ScheduledTransactionsApi.md#getSingleScheduledTransaction) | **GET** /budgets/{budget_id}/scheduled_transactions/{scheduled_transaction_id} | Single scheduled transaction
*ScheduledTransactionsApi* | [**listAll**](docs/ScheduledTransactionsApi.md#listAll) | **GET** /budgets/{budget_id}/scheduled_transactions | List scheduled transactions
*TransactionsApi* | [**createSingleOrMultiple**](docs/TransactionsApi.md#createSingleOrMultiple) | **POST** /budgets/{budget_id}/transactions | Create a single transaction or multiple transactions
*TransactionsApi* | [**deleteExistingTransaction**](docs/TransactionsApi.md#deleteExistingTransaction) | **DELETE** /budgets/{budget_id}/transactions/{transaction_id} | Deletes an existing transaction
*TransactionsApi* | [**getSingleTransaction**](docs/TransactionsApi.md#getSingleTransaction) | **GET** /budgets/{budget_id}/transactions/{transaction_id} | Single transaction
*TransactionsApi* | [**importLinkedAccounts**](docs/TransactionsApi.md#importLinkedAccounts) | **POST** /budgets/{budget_id}/transactions/import | Import transactions
*TransactionsApi* | [**listByAccount**](docs/TransactionsApi.md#listByAccount) | **GET** /budgets/{budget_id}/accounts/{account_id}/transactions | List account transactions
*TransactionsApi* | [**listByCategory**](docs/TransactionsApi.md#listByCategory) | **GET** /budgets/{budget_id}/categories/{category_id}/transactions | List category transactions
*TransactionsApi* | [**listByPayee**](docs/TransactionsApi.md#listByPayee) | **GET** /budgets/{budget_id}/payees/{payee_id}/transactions | List payee transactions
*TransactionsApi* | [**listTransactions**](docs/TransactionsApi.md#listTransactions) | **GET** /budgets/{budget_id}/transactions | List transactions
*TransactionsApi* | [**updateExistingTransaction**](docs/TransactionsApi.md#updateExistingTransaction) | **PUT** /budgets/{budget_id}/transactions/{transaction_id} | Updates an existing transaction
*TransactionsApi* | [**updateMultiple**](docs/TransactionsApi.md#updateMultiple) | **PATCH** /budgets/{budget_id}/transactions | Update multiple transactions
*UserApi* | [**infoGet**](docs/UserApi.md#infoGet) | **GET** /user | User info


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AccountResponseData](docs/AccountResponseData.md)
 - [AccountType](docs/AccountType.md)
 - [AccountsResponse](docs/AccountsResponse.md)
 - [AccountsResponseData](docs/AccountsResponseData.md)
 - [BudgetDetail](docs/BudgetDetail.md)
 - [BudgetDetailAllOf](docs/BudgetDetailAllOf.md)
 - [BudgetDetailResponse](docs/BudgetDetailResponse.md)
 - [BudgetDetailResponseData](docs/BudgetDetailResponseData.md)
 - [BudgetSettings](docs/BudgetSettings.md)
 - [BudgetSettingsResponse](docs/BudgetSettingsResponse.md)
 - [BudgetSettingsResponseData](docs/BudgetSettingsResponseData.md)
 - [BudgetSummary](docs/BudgetSummary.md)
 - [BudgetSummaryResponse](docs/BudgetSummaryResponse.md)
 - [BudgetSummaryResponseData](docs/BudgetSummaryResponseData.md)
 - [BulkResponse](docs/BulkResponse.md)
 - [BulkResponseData](docs/BulkResponseData.md)
 - [BulkResponseDataBulk](docs/BulkResponseDataBulk.md)
 - [BulkTransactions](docs/BulkTransactions.md)
 - [CategoriesResponse](docs/CategoriesResponse.md)
 - [CategoriesResponseData](docs/CategoriesResponseData.md)
 - [Category](docs/Category.md)
 - [CategoryGroup](docs/CategoryGroup.md)
 - [CategoryGroupWithCategories](docs/CategoryGroupWithCategories.md)
 - [CategoryGroupWithCategoriesAllOf](docs/CategoryGroupWithCategoriesAllOf.md)
 - [CategoryResponse](docs/CategoryResponse.md)
 - [CategoryResponseData](docs/CategoryResponseData.md)
 - [CurrencyFormat](docs/CurrencyFormat.md)
 - [DateFormat](docs/DateFormat.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ExistingTransaction](docs/ExistingTransaction.md)
 - [HybridTransaction](docs/HybridTransaction.md)
 - [HybridTransactionAllOf](docs/HybridTransactionAllOf.md)
 - [HybridTransactionsResponse](docs/HybridTransactionsResponse.md)
 - [HybridTransactionsResponseData](docs/HybridTransactionsResponseData.md)
 - [MonthDetail](docs/MonthDetail.md)
 - [MonthDetailAllOf](docs/MonthDetailAllOf.md)
 - [MonthDetailResponse](docs/MonthDetailResponse.md)
 - [MonthDetailResponseData](docs/MonthDetailResponseData.md)
 - [MonthSummariesResponse](docs/MonthSummariesResponse.md)
 - [MonthSummariesResponseData](docs/MonthSummariesResponseData.md)
 - [MonthSummary](docs/MonthSummary.md)
 - [NewTransaction](docs/NewTransaction.md)
 - [NewTransactionAllOf](docs/NewTransactionAllOf.md)
 - [PatchCategoryWrapper](docs/PatchCategoryWrapper.md)
 - [PatchMonthCategoryWrapper](docs/PatchMonthCategoryWrapper.md)
 - [PatchTransactionsWrapper](docs/PatchTransactionsWrapper.md)
 - [Payee](docs/Payee.md)
 - [PayeeLocation](docs/PayeeLocation.md)
 - [PayeeLocationResponse](docs/PayeeLocationResponse.md)
 - [PayeeLocationResponseData](docs/PayeeLocationResponseData.md)
 - [PayeeLocationsResponse](docs/PayeeLocationsResponse.md)
 - [PayeeLocationsResponseData](docs/PayeeLocationsResponseData.md)
 - [PayeeResponse](docs/PayeeResponse.md)
 - [PayeeResponseData](docs/PayeeResponseData.md)
 - [PayeesResponse](docs/PayeesResponse.md)
 - [PayeesResponseData](docs/PayeesResponseData.md)
 - [PostAccountWrapper](docs/PostAccountWrapper.md)
 - [PostTransactionsWrapper](docs/PostTransactionsWrapper.md)
 - [PutTransactionWrapper](docs/PutTransactionWrapper.md)
 - [SaveAccount](docs/SaveAccount.md)
 - [SaveCategory](docs/SaveCategory.md)
 - [SaveCategoryResponse](docs/SaveCategoryResponse.md)
 - [SaveCategoryResponseData](docs/SaveCategoryResponseData.md)
 - [SaveMonthCategory](docs/SaveMonthCategory.md)
 - [SaveSubTransaction](docs/SaveSubTransaction.md)
 - [SaveTransactionWithIdOrImportId](docs/SaveTransactionWithIdOrImportId.md)
 - [SaveTransactionWithIdOrImportIdAllOf](docs/SaveTransactionWithIdOrImportIdAllOf.md)
 - [SaveTransactionWithOptionalFields](docs/SaveTransactionWithOptionalFields.md)
 - [SaveTransactionsResponse](docs/SaveTransactionsResponse.md)
 - [SaveTransactionsResponseData](docs/SaveTransactionsResponseData.md)
 - [ScheduledSubTransaction](docs/ScheduledSubTransaction.md)
 - [ScheduledTransactionDetail](docs/ScheduledTransactionDetail.md)
 - [ScheduledTransactionDetailAllOf](docs/ScheduledTransactionDetailAllOf.md)
 - [ScheduledTransactionResponse](docs/ScheduledTransactionResponse.md)
 - [ScheduledTransactionResponseData](docs/ScheduledTransactionResponseData.md)
 - [ScheduledTransactionSummary](docs/ScheduledTransactionSummary.md)
 - [ScheduledTransactionsResponse](docs/ScheduledTransactionsResponse.md)
 - [ScheduledTransactionsResponseData](docs/ScheduledTransactionsResponseData.md)
 - [SubTransaction](docs/SubTransaction.md)
 - [TransactionClearedStatus](docs/TransactionClearedStatus.md)
 - [TransactionDetail](docs/TransactionDetail.md)
 - [TransactionDetailAllOf](docs/TransactionDetailAllOf.md)
 - [TransactionFlagColor](docs/TransactionFlagColor.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionResponseData](docs/TransactionResponseData.md)
 - [TransactionSummary](docs/TransactionSummary.md)
 - [TransactionsImportResponse](docs/TransactionsImportResponse.md)
 - [TransactionsImportResponseData](docs/TransactionsImportResponseData.md)
 - [TransactionsResponse](docs/TransactionsResponse.md)
 - [TransactionsResponseData](docs/TransactionsResponseData.md)
 - [User](docs/User.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseData](docs/UserResponseData.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
