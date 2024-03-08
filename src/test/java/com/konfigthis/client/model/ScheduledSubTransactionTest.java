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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ScheduledSubTransaction
 */
public class ScheduledSubTransactionTest {
    private final ScheduledSubTransaction model = new ScheduledSubTransaction();

    /**
     * Model tests for ScheduledSubTransaction
     */
    @Test
    public void testScheduledSubTransaction() {
        // TODO: test ScheduledSubTransaction
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'scheduledTransactionId'
     */
    @Test
    public void scheduledTransactionIdTest() {
        // TODO: test scheduledTransactionId
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'memo'
     */
    @Test
    public void memoTest() {
        // TODO: test memo
    }

    /**
     * Test the property 'payeeId'
     */
    @Test
    public void payeeIdTest() {
        // TODO: test payeeId
    }

    /**
     * Test the property 'categoryId'
     */
    @Test
    public void categoryIdTest() {
        // TODO: test categoryId
    }

    /**
     * Test the property 'transferAccountId'
     */
    @Test
    public void transferAccountIdTest() {
        // TODO: test transferAccountId
    }

    /**
     * Test the property 'deleted'
     */
    @Test
    public void deletedTest() {
        // TODO: test deleted
    }

}