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
 * The currency format setting for the budget.  In some cases the format will not be available and will be specified as null.
 */
@ApiModel(description = "The currency format setting for the budget.  In some cases the format will not be available and will be specified as null.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CurrencyFormat {
  public static final String SERIALIZED_NAME_ISO_CODE = "iso_code";
  @SerializedName(SERIALIZED_NAME_ISO_CODE)
  private String isoCode;

  public static final String SERIALIZED_NAME_EXAMPLE_FORMAT = "example_format";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_FORMAT)
  private String exampleFormat;

  public static final String SERIALIZED_NAME_DECIMAL_DIGITS = "decimal_digits";
  @SerializedName(SERIALIZED_NAME_DECIMAL_DIGITS)
  private Integer decimalDigits;

  public static final String SERIALIZED_NAME_DECIMAL_SEPARATOR = "decimal_separator";
  @SerializedName(SERIALIZED_NAME_DECIMAL_SEPARATOR)
  private String decimalSeparator;

  public static final String SERIALIZED_NAME_SYMBOL_FIRST = "symbol_first";
  @SerializedName(SERIALIZED_NAME_SYMBOL_FIRST)
  private Boolean symbolFirst;

  public static final String SERIALIZED_NAME_GROUP_SEPARATOR = "group_separator";
  @SerializedName(SERIALIZED_NAME_GROUP_SEPARATOR)
  private String groupSeparator;

  public static final String SERIALIZED_NAME_CURRENCY_SYMBOL = "currency_symbol";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SYMBOL)
  private String currencySymbol;

  public static final String SERIALIZED_NAME_DISPLAY_SYMBOL = "display_symbol";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SYMBOL)
  private Boolean displaySymbol;

  public CurrencyFormat() {
  }

  public CurrencyFormat isoCode(String isoCode) {
    
    
    
    
    this.isoCode = isoCode;
    return this;
  }

   /**
   * Get isoCode
   * @return isoCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIsoCode() {
    return isoCode;
  }


  public void setIsoCode(String isoCode) {
    
    
    
    this.isoCode = isoCode;
  }


  public CurrencyFormat exampleFormat(String exampleFormat) {
    
    
    
    
    this.exampleFormat = exampleFormat;
    return this;
  }

   /**
   * Get exampleFormat
   * @return exampleFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExampleFormat() {
    return exampleFormat;
  }


  public void setExampleFormat(String exampleFormat) {
    
    
    
    this.exampleFormat = exampleFormat;
  }


  public CurrencyFormat decimalDigits(Integer decimalDigits) {
    
    
    
    
    this.decimalDigits = decimalDigits;
    return this;
  }

   /**
   * Get decimalDigits
   * @return decimalDigits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDecimalDigits() {
    return decimalDigits;
  }


  public void setDecimalDigits(Integer decimalDigits) {
    
    
    
    this.decimalDigits = decimalDigits;
  }


  public CurrencyFormat decimalSeparator(String decimalSeparator) {
    
    
    
    
    this.decimalSeparator = decimalSeparator;
    return this;
  }

   /**
   * Get decimalSeparator
   * @return decimalSeparator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDecimalSeparator() {
    return decimalSeparator;
  }


  public void setDecimalSeparator(String decimalSeparator) {
    
    
    
    this.decimalSeparator = decimalSeparator;
  }


  public CurrencyFormat symbolFirst(Boolean symbolFirst) {
    
    
    
    
    this.symbolFirst = symbolFirst;
    return this;
  }

   /**
   * Get symbolFirst
   * @return symbolFirst
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSymbolFirst() {
    return symbolFirst;
  }


  public void setSymbolFirst(Boolean symbolFirst) {
    
    
    
    this.symbolFirst = symbolFirst;
  }


  public CurrencyFormat groupSeparator(String groupSeparator) {
    
    
    
    
    this.groupSeparator = groupSeparator;
    return this;
  }

   /**
   * Get groupSeparator
   * @return groupSeparator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGroupSeparator() {
    return groupSeparator;
  }


  public void setGroupSeparator(String groupSeparator) {
    
    
    
    this.groupSeparator = groupSeparator;
  }


  public CurrencyFormat currencySymbol(String currencySymbol) {
    
    
    
    
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrencySymbol() {
    return currencySymbol;
  }


  public void setCurrencySymbol(String currencySymbol) {
    
    
    
    this.currencySymbol = currencySymbol;
  }


  public CurrencyFormat displaySymbol(Boolean displaySymbol) {
    
    
    
    
    this.displaySymbol = displaySymbol;
    return this;
  }

   /**
   * Get displaySymbol
   * @return displaySymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDisplaySymbol() {
    return displaySymbol;
  }


  public void setDisplaySymbol(Boolean displaySymbol) {
    
    
    
    this.displaySymbol = displaySymbol;
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
   * @return the CurrencyFormat instance itself
   */
  public CurrencyFormat putAdditionalProperty(String key, Object value) {
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
    CurrencyFormat currencyFormat = (CurrencyFormat) o;
    return Objects.equals(this.isoCode, currencyFormat.isoCode) &&
        Objects.equals(this.exampleFormat, currencyFormat.exampleFormat) &&
        Objects.equals(this.decimalDigits, currencyFormat.decimalDigits) &&
        Objects.equals(this.decimalSeparator, currencyFormat.decimalSeparator) &&
        Objects.equals(this.symbolFirst, currencyFormat.symbolFirst) &&
        Objects.equals(this.groupSeparator, currencyFormat.groupSeparator) &&
        Objects.equals(this.currencySymbol, currencyFormat.currencySymbol) &&
        Objects.equals(this.displaySymbol, currencyFormat.displaySymbol)&&
        Objects.equals(this.additionalProperties, currencyFormat.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode, exampleFormat, decimalDigits, decimalSeparator, symbolFirst, groupSeparator, currencySymbol, displaySymbol, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyFormat {\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    exampleFormat: ").append(toIndentedString(exampleFormat)).append("\n");
    sb.append("    decimalDigits: ").append(toIndentedString(decimalDigits)).append("\n");
    sb.append("    decimalSeparator: ").append(toIndentedString(decimalSeparator)).append("\n");
    sb.append("    symbolFirst: ").append(toIndentedString(symbolFirst)).append("\n");
    sb.append("    groupSeparator: ").append(toIndentedString(groupSeparator)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
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
    openapiFields.add("iso_code");
    openapiFields.add("example_format");
    openapiFields.add("decimal_digits");
    openapiFields.add("decimal_separator");
    openapiFields.add("symbol_first");
    openapiFields.add("group_separator");
    openapiFields.add("currency_symbol");
    openapiFields.add("display_symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iso_code");
    openapiRequiredFields.add("example_format");
    openapiRequiredFields.add("decimal_digits");
    openapiRequiredFields.add("decimal_separator");
    openapiRequiredFields.add("symbol_first");
    openapiRequiredFields.add("group_separator");
    openapiRequiredFields.add("currency_symbol");
    openapiRequiredFields.add("display_symbol");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurrencyFormat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurrencyFormat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrencyFormat is not found in the empty JSON string", CurrencyFormat.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CurrencyFormat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("iso_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_code").toString()));
      }
      if (!jsonObj.get("example_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `example_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("example_format").toString()));
      }
      if (!jsonObj.get("decimal_separator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decimal_separator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decimal_separator").toString()));
      }
      if (!jsonObj.get("group_separator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_separator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_separator").toString()));
      }
      if (!jsonObj.get("currency_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrencyFormat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrencyFormat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrencyFormat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrencyFormat.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrencyFormat>() {
           @Override
           public void write(JsonWriter out, CurrencyFormat value) throws IOException {
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
           public CurrencyFormat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CurrencyFormat instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CurrencyFormat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrencyFormat
  * @throws IOException if the JSON string is invalid with respect to CurrencyFormat
  */
  public static CurrencyFormat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrencyFormat.class);
  }

 /**
  * Convert an instance of CurrencyFormat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

