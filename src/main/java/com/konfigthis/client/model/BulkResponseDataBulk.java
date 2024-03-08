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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * BulkResponseDataBulk
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BulkResponseDataBulk {
  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transaction_ids";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_DUPLICATE_IMPORT_IDS = "duplicate_import_ids";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_IMPORT_IDS)
  private List<String> duplicateImportIds = new ArrayList<>();

  public BulkResponseDataBulk() {
  }

  public BulkResponseDataBulk transactionIds(List<String> transactionIds) {
    
    
    
    
    this.transactionIds = transactionIds;
    return this;
  }

  public BulkResponseDataBulk addTransactionIdsItem(String transactionIdsItem) {
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * The list of Transaction ids that were created.
   * @return transactionIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of Transaction ids that were created.")

  public List<String> getTransactionIds() {
    return transactionIds;
  }


  public void setTransactionIds(List<String> transactionIds) {
    
    
    
    this.transactionIds = transactionIds;
  }


  public BulkResponseDataBulk duplicateImportIds(List<String> duplicateImportIds) {
    
    
    
    
    this.duplicateImportIds = duplicateImportIds;
    return this;
  }

  public BulkResponseDataBulk addDuplicateImportIdsItem(String duplicateImportIdsItem) {
    this.duplicateImportIds.add(duplicateImportIdsItem);
    return this;
  }

   /**
   * If any Transactions were not created because they had an &#x60;import_id&#x60; matching a transaction already on the same account, the specified import_id(s) will be included in this list.
   * @return duplicateImportIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If any Transactions were not created because they had an `import_id` matching a transaction already on the same account, the specified import_id(s) will be included in this list.")

  public List<String> getDuplicateImportIds() {
    return duplicateImportIds;
  }


  public void setDuplicateImportIds(List<String> duplicateImportIds) {
    
    
    
    this.duplicateImportIds = duplicateImportIds;
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
   * @return the BulkResponseDataBulk instance itself
   */
  public BulkResponseDataBulk putAdditionalProperty(String key, Object value) {
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
    BulkResponseDataBulk bulkResponseDataBulk = (BulkResponseDataBulk) o;
    return Objects.equals(this.transactionIds, bulkResponseDataBulk.transactionIds) &&
        Objects.equals(this.duplicateImportIds, bulkResponseDataBulk.duplicateImportIds)&&
        Objects.equals(this.additionalProperties, bulkResponseDataBulk.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIds, duplicateImportIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponseDataBulk {\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
    sb.append("    duplicateImportIds: ").append(toIndentedString(duplicateImportIds)).append("\n");
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
    openapiFields.add("transaction_ids");
    openapiFields.add("duplicate_import_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transaction_ids");
    openapiRequiredFields.add("duplicate_import_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkResponseDataBulk
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BulkResponseDataBulk.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkResponseDataBulk is not found in the empty JSON string", BulkResponseDataBulk.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkResponseDataBulk.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("transaction_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("transaction_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_ids` to be an array in the JSON string but got `%s`", jsonObj.get("transaction_ids").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("duplicate_import_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("duplicate_import_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `duplicate_import_ids` to be an array in the JSON string but got `%s`", jsonObj.get("duplicate_import_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkResponseDataBulk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkResponseDataBulk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkResponseDataBulk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkResponseDataBulk.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkResponseDataBulk>() {
           @Override
           public void write(JsonWriter out, BulkResponseDataBulk value) throws IOException {
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
           public BulkResponseDataBulk read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BulkResponseDataBulk instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BulkResponseDataBulk given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkResponseDataBulk
  * @throws IOException if the JSON string is invalid with respect to BulkResponseDataBulk
  */
  public static BulkResponseDataBulk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkResponseDataBulk.class);
  }

 /**
  * Convert an instance of BulkResponseDataBulk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

