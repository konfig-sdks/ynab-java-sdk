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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Account;
import com.konfigthis.client.model.CurrencyFormat;
import com.konfigthis.client.model.DateFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BudgetSummary
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BudgetSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON = "last_modified_on";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_FIRST_MONTH = "first_month";
  @SerializedName(SERIALIZED_NAME_FIRST_MONTH)
  private LocalDate firstMonth;

  public static final String SERIALIZED_NAME_LAST_MONTH = "last_month";
  @SerializedName(SERIALIZED_NAME_LAST_MONTH)
  private LocalDate lastMonth;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "date_format";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private DateFormat dateFormat;

  public static final String SERIALIZED_NAME_CURRENCY_FORMAT = "currency_format";
  @SerializedName(SERIALIZED_NAME_CURRENCY_FORMAT)
  private CurrencyFormat currencyFormat;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<Account> accounts = null;

  public BudgetSummary() {
  }

  public BudgetSummary id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public BudgetSummary name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public BudgetSummary lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    
    
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

   /**
   * The last time any changes were made to the budget from either a web or mobile client
   * @return lastModifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time any changes were made to the budget from either a web or mobile client")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }


  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    
    
    this.lastModifiedOn = lastModifiedOn;
  }


  public BudgetSummary firstMonth(LocalDate firstMonth) {
    
    
    
    
    this.firstMonth = firstMonth;
    return this;
  }

   /**
   * The earliest budget month
   * @return firstMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earliest budget month")

  public LocalDate getFirstMonth() {
    return firstMonth;
  }


  public void setFirstMonth(LocalDate firstMonth) {
    
    
    
    this.firstMonth = firstMonth;
  }


  public BudgetSummary lastMonth(LocalDate lastMonth) {
    
    
    
    
    this.lastMonth = lastMonth;
    return this;
  }

   /**
   * The latest budget month
   * @return lastMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest budget month")

  public LocalDate getLastMonth() {
    return lastMonth;
  }


  public void setLastMonth(LocalDate lastMonth) {
    
    
    
    this.lastMonth = lastMonth;
  }


  public BudgetSummary dateFormat(DateFormat dateFormat) {
    
    
    
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateFormat getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(DateFormat dateFormat) {
    
    
    
    this.dateFormat = dateFormat;
  }


  public BudgetSummary currencyFormat(CurrencyFormat currencyFormat) {
    
    
    
    
    this.currencyFormat = currencyFormat;
    return this;
  }

   /**
   * Get currencyFormat
   * @return currencyFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CurrencyFormat getCurrencyFormat() {
    return currencyFormat;
  }


  public void setCurrencyFormat(CurrencyFormat currencyFormat) {
    
    
    
    this.currencyFormat = currencyFormat;
  }


  public BudgetSummary accounts(List<Account> accounts) {
    
    
    
    
    this.accounts = accounts;
    return this;
  }

  public BudgetSummary addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The budget accounts (only included if &#x60;include_accounts&#x3D;true&#x60; specified as query parameter)
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The budget accounts (only included if `include_accounts=true` specified as query parameter)")

  public List<Account> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<Account> accounts) {
    
    
    
    this.accounts = accounts;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BudgetSummary instance itself
   */
  public BudgetSummary putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetSummary budgetSummary = (BudgetSummary) o;
    return Objects.equals(this.id, budgetSummary.id) &&
        Objects.equals(this.name, budgetSummary.name) &&
        Objects.equals(this.lastModifiedOn, budgetSummary.lastModifiedOn) &&
        Objects.equals(this.firstMonth, budgetSummary.firstMonth) &&
        Objects.equals(this.lastMonth, budgetSummary.lastMonth) &&
        Objects.equals(this.dateFormat, budgetSummary.dateFormat) &&
        Objects.equals(this.currencyFormat, budgetSummary.currencyFormat) &&
        Objects.equals(this.accounts, budgetSummary.accounts)&&
        Objects.equals(this.additionalProperties, budgetSummary.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastModifiedOn, firstMonth, lastMonth, dateFormat, currencyFormat, accounts, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    firstMonth: ").append(toIndentedString(firstMonth)).append("\n");
    sb.append("    lastMonth: ").append(toIndentedString(lastMonth)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    currencyFormat: ").append(toIndentedString(currencyFormat)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("last_modified_on");
    openapiFields.add("first_month");
    openapiFields.add("last_month");
    openapiFields.add("date_format");
    openapiFields.add("currency_format");
    openapiFields.add("accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BudgetSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BudgetSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BudgetSummary is not found in the empty JSON string", BudgetSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BudgetSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `date_format`
      if (jsonObj.get("date_format") != null && !jsonObj.get("date_format").isJsonNull()) {
        DateFormat.validateJsonObject(jsonObj.getAsJsonObject("date_format"));
      }
      // validate the optional field `currency_format`
      if (jsonObj.get("currency_format") != null && !jsonObj.get("currency_format").isJsonNull()) {
        CurrencyFormat.validateJsonObject(jsonObj.getAsJsonObject("currency_format"));
      }
      if (jsonObj.get("accounts") != null && !jsonObj.get("accounts").isJsonNull()) {
        JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
        if (jsonArrayaccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
          }

          // validate the optional field `accounts` (array)
          for (int i = 0; i < jsonArrayaccounts.size(); i++) {
            Account.validateJsonObject(jsonArrayaccounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetSummary>() {
           @Override
           public void write(JsonWriter out, BudgetSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BudgetSummary instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetSummary
  * @throws IOException if the JSON string is invalid with respect to BudgetSummary
  */
  public static BudgetSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetSummary.class);
  }

 /**
  * Convert an instance of BudgetSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

