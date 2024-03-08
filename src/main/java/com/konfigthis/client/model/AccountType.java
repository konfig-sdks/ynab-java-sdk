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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of account
 */
@JsonAdapter(AccountType.Adapter.class)public enum AccountType {
  
  CHECKING("checking"),
  
  SAVINGS("savings"),
  
  CASH("cash"),
  
  CREDITCARD("creditCard"),
  
  LINEOFCREDIT("lineOfCredit"),
  
  OTHERASSET("otherAsset"),
  
  OTHERLIABILITY("otherLiability"),
  
  MORTGAGE("mortgage"),
  
  AUTOLOAN("autoLoan"),
  
  STUDENTLOAN("studentLoan"),
  
  PERSONALLOAN("personalLoan"),
  
  MEDICALDEBT("medicalDebt"),
  
  OTHERDEBT("otherDebt");

  private String value;

  AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountType fromValue(String value) {
    for (AccountType b : AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountType.fromValue(value);
    }
  }
}

