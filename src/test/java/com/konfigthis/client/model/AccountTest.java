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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Account
 */
public class AccountTest {
    private final Account model = new Account();

    /**
     * Model tests for Account
     */
    @Test
    public void testAccount() {
        // TODO: test Account
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'onBudget'
     */
    @Test
    public void onBudgetTest() {
        // TODO: test onBudget
    }

    /**
     * Test the property 'closed'
     */
    @Test
    public void closedTest() {
        // TODO: test closed
    }

    /**
     * Test the property 'note'
     */
    @Test
    public void noteTest() {
        // TODO: test note
    }

    /**
     * Test the property 'balance'
     */
    @Test
    public void balanceTest() {
        // TODO: test balance
    }

    /**
     * Test the property 'clearedBalance'
     */
    @Test
    public void clearedBalanceTest() {
        // TODO: test clearedBalance
    }

    /**
     * Test the property 'unclearedBalance'
     */
    @Test
    public void unclearedBalanceTest() {
        // TODO: test unclearedBalance
    }

    /**
     * Test the property 'transferPayeeId'
     */
    @Test
    public void transferPayeeIdTest() {
        // TODO: test transferPayeeId
    }

    /**
     * Test the property 'directImportLinked'
     */
    @Test
    public void directImportLinkedTest() {
        // TODO: test directImportLinked
    }

    /**
     * Test the property 'directImportInError'
     */
    @Test
    public void directImportInErrorTest() {
        // TODO: test directImportInError
    }

    /**
     * Test the property 'lastReconciledAt'
     */
    @Test
    public void lastReconciledAtTest() {
        // TODO: test lastReconciledAt
    }

    /**
     * Test the property 'debtOriginalBalance'
     */
    @Test
    public void debtOriginalBalanceTest() {
        // TODO: test debtOriginalBalance
    }

    /**
     * Test the property 'debtInterestRates'
     */
    @Test
    public void debtInterestRatesTest() {
        // TODO: test debtInterestRates
    }

    /**
     * Test the property 'debtMinimumPayments'
     */
    @Test
    public void debtMinimumPaymentsTest() {
        // TODO: test debtMinimumPayments
    }

    /**
     * Test the property 'debtEscrowAmounts'
     */
    @Test
    public void debtEscrowAmountsTest() {
        // TODO: test debtEscrowAmounts
    }

    /**
     * Test the property 'deleted'
     */
    @Test
    public void deletedTest() {
        // TODO: test deleted
    }

}
