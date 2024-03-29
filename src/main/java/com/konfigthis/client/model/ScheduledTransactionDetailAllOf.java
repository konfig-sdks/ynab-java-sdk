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
import com.konfigthis.client.model.ScheduledSubTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ScheduledTransactionDetailAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScheduledTransactionDetailAllOf {
  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_SUBTRANSACTIONS = "subtransactions";
  @SerializedName(SERIALIZED_NAME_SUBTRANSACTIONS)
  private List<ScheduledSubTransaction> subtransactions = new ArrayList<>();

  public ScheduledTransactionDetailAllOf() {
  }

  public ScheduledTransactionDetailAllOf accountName(String accountName) {
    
    
    
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    
    
    
    this.accountName = accountName;
  }


  public ScheduledTransactionDetailAllOf payeeName(String payeeName) {
    
    
    
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * Get payeeName
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    
    
    
    this.payeeName = payeeName;
  }


  public ScheduledTransactionDetailAllOf categoryName(String categoryName) {
    
    
    
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * The name of the category.  If a split scheduled transaction, this will be &#39;Split&#39;.
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the category.  If a split scheduled transaction, this will be 'Split'.")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    
    
    
    this.categoryName = categoryName;
  }


  public ScheduledTransactionDetailAllOf subtransactions(List<ScheduledSubTransaction> subtransactions) {
    
    
    
    
    this.subtransactions = subtransactions;
    return this;
  }

  public ScheduledTransactionDetailAllOf addSubtransactionsItem(ScheduledSubTransaction subtransactionsItem) {
    this.subtransactions.add(subtransactionsItem);
    return this;
  }

   /**
   * If a split scheduled transaction, the subtransactions.
   * @return subtransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If a split scheduled transaction, the subtransactions.")

  public List<ScheduledSubTransaction> getSubtransactions() {
    return subtransactions;
  }


  public void setSubtransactions(List<ScheduledSubTransaction> subtransactions) {
    
    
    
    this.subtransactions = subtransactions;
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
   * @return the ScheduledTransactionDetailAllOf instance itself
   */
  public ScheduledTransactionDetailAllOf putAdditionalProperty(String key, Object value) {
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
    ScheduledTransactionDetailAllOf scheduledTransactionDetailAllOf = (ScheduledTransactionDetailAllOf) o;
    return Objects.equals(this.accountName, scheduledTransactionDetailAllOf.accountName) &&
        Objects.equals(this.payeeName, scheduledTransactionDetailAllOf.payeeName) &&
        Objects.equals(this.categoryName, scheduledTransactionDetailAllOf.categoryName) &&
        Objects.equals(this.subtransactions, scheduledTransactionDetailAllOf.subtransactions)&&
        Objects.equals(this.additionalProperties, scheduledTransactionDetailAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, payeeName, categoryName, subtransactions, additionalProperties);
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
    sb.append("class ScheduledTransactionDetailAllOf {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    subtransactions: ").append(toIndentedString(subtransactions)).append("\n");
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
    openapiFields.add("account_name");
    openapiFields.add("payee_name");
    openapiFields.add("category_name");
    openapiFields.add("subtransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_name");
    openapiRequiredFields.add("subtransactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduledTransactionDetailAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScheduledTransactionDetailAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduledTransactionDetailAllOf is not found in the empty JSON string", ScheduledTransactionDetailAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScheduledTransactionDetailAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      if (!jsonObj.get("payee_name").isJsonNull() && (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonNull()) && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (!jsonObj.get("category_name").isJsonNull() && (jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonNull()) && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("subtransactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtransactions` to be an array in the JSON string but got `%s`", jsonObj.get("subtransactions").toString()));
      }

      JsonArray jsonArraysubtransactions = jsonObj.getAsJsonArray("subtransactions");
      // validate the required field `subtransactions` (array)
      for (int i = 0; i < jsonArraysubtransactions.size(); i++) {
        ScheduledSubTransaction.validateJsonObject(jsonArraysubtransactions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduledTransactionDetailAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduledTransactionDetailAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduledTransactionDetailAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduledTransactionDetailAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduledTransactionDetailAllOf>() {
           @Override
           public void write(JsonWriter out, ScheduledTransactionDetailAllOf value) throws IOException {
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
           public ScheduledTransactionDetailAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScheduledTransactionDetailAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScheduledTransactionDetailAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduledTransactionDetailAllOf
  * @throws IOException if the JSON string is invalid with respect to ScheduledTransactionDetailAllOf
  */
  public static ScheduledTransactionDetailAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduledTransactionDetailAllOf.class);
  }

 /**
  * Convert an instance of ScheduledTransactionDetailAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

