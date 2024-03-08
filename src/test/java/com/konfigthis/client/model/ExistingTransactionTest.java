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
import com.konfigthis.client.model.SaveSubTransaction;
import com.konfigthis.client.model.TransactionClearedStatus;
import com.konfigthis.client.model.TransactionFlagColor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ExistingTransaction
 */
public class ExistingTransactionTest {
    private final ExistingTransaction model = new ExistingTransaction();

    /**
     * Model tests for ExistingTransaction
     */
    @Test
    public void testExistingTransaction() {
        // TODO: test ExistingTransaction
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        // TODO: test accountId
    }

    /**
     * Test the property 'date'
     */
    @Test
    public void dateTest() {
        // TODO: test date
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'payeeId'
     */
    @Test
    public void payeeIdTest() {
        // TODO: test payeeId
    }

    /**
     * Test the property 'payeeName'
     */
    @Test
    public void payeeNameTest() {
        // TODO: test payeeName
    }

    /**
     * Test the property 'categoryId'
     */
    @Test
    public void categoryIdTest() {
        // TODO: test categoryId
    }

    /**
     * Test the property 'memo'
     */
    @Test
    public void memoTest() {
        // TODO: test memo
    }

    /**
     * Test the property 'cleared'
     */
    @Test
    public void clearedTest() {
        // TODO: test cleared
    }

    /**
     * Test the property 'approved'
     */
    @Test
    public void approvedTest() {
        // TODO: test approved
    }

    /**
     * Test the property 'flagColor'
     */
    @Test
    public void flagColorTest() {
        // TODO: test flagColor
    }

    /**
     * Test the property 'subtransactions'
     */
    @Test
    public void subtransactionsTest() {
        // TODO: test subtransactions
    }

}
