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
import com.konfigthis.client.model.TransactionFlagColor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * ScheduledTransactionSummary
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ScheduledTransactionSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DATE_FIRST = "date_first";
  @SerializedName(SERIALIZED_NAME_DATE_FIRST)
  private LocalDate dateFirst;

  public static final String SERIALIZED_NAME_DATE_NEXT = "date_next";
  @SerializedName(SERIALIZED_NAME_DATE_NEXT)
  private LocalDate dateNext;

  /**
   * Gets or Sets frequency
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
 public enum FrequencyEnum {
    NEVER("never"),
    
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    EVERYOTHERWEEK("everyOtherWeek"),
    
    TWICEAMONTH("twiceAMonth"),
    
    EVERY4WEEKS("every4Weeks"),
    
    MONTHLY("monthly"),
    
    EVERYOTHERMONTH("everyOtherMonth"),
    
    EVERY3MONTHS("every3Months"),
    
    EVERY4MONTHS("every4Months"),
    
    TWICEAYEAR("twiceAYear"),
    
    YEARLY("yearly"),
    
    EVERYOTHERYEAR("everyOtherYear");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_FLAG_COLOR = "flag_color";
  @SerializedName(SERIALIZED_NAME_FLAG_COLOR)
  private TransactionFlagColor flagColor;

  public static final String SERIALIZED_NAME_FLAG_NAME = "flag_name";
  @SerializedName(SERIALIZED_NAME_FLAG_NAME)
  private String flagName;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private UUID accountId;

  public static final String SERIALIZED_NAME_PAYEE_ID = "payee_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_ID)
  private UUID payeeId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private UUID categoryId;

  public static final String SERIALIZED_NAME_TRANSFER_ACCOUNT_ID = "transfer_account_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ACCOUNT_ID)
  private UUID transferAccountId;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public ScheduledTransactionSummary() {
  }

  public ScheduledTransactionSummary id(UUID id) {
    
    
    
    
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


  public ScheduledTransactionSummary dateFirst(LocalDate dateFirst) {
    
    
    
    
    this.dateFirst = dateFirst;
    return this;
  }

   /**
   * The first date for which the Scheduled Transaction was scheduled.
   * @return dateFirst
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The first date for which the Scheduled Transaction was scheduled.")

  public LocalDate getDateFirst() {
    return dateFirst;
  }


  public void setDateFirst(LocalDate dateFirst) {
    
    
    
    this.dateFirst = dateFirst;
  }


  public ScheduledTransactionSummary dateNext(LocalDate dateNext) {
    
    
    
    
    this.dateNext = dateNext;
    return this;
  }

   /**
   * The next date for which the Scheduled Transaction is scheduled.
   * @return dateNext
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The next date for which the Scheduled Transaction is scheduled.")

  public LocalDate getDateNext() {
    return dateNext;
  }


  public void setDateNext(LocalDate dateNext) {
    
    
    
    this.dateNext = dateNext;
  }


  public ScheduledTransactionSummary frequency(FrequencyEnum frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    
    
    
    this.frequency = frequency;
  }


  public ScheduledTransactionSummary amount(Long amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The scheduled transaction amount in milliunits format
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The scheduled transaction amount in milliunits format")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    
    
    
    this.amount = amount;
  }


  public ScheduledTransactionSummary memo(String memo) {
    
    
    
    
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    
    
    
    this.memo = memo;
  }


  public ScheduledTransactionSummary flagColor(TransactionFlagColor flagColor) {
    
    
    
    
    this.flagColor = flagColor;
    return this;
  }

   /**
   * Get flagColor
   * @return flagColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionFlagColor getFlagColor() {
    return flagColor;
  }


  public void setFlagColor(TransactionFlagColor flagColor) {
    
    
    
    this.flagColor = flagColor;
  }


  public ScheduledTransactionSummary flagName(String flagName) {
    
    
    
    
    this.flagName = flagName;
    return this;
  }

   /**
   * The customized name of a transaction flag
   * @return flagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customized name of a transaction flag")

  public String getFlagName() {
    return flagName;
  }


  public void setFlagName(String flagName) {
    
    
    
    this.flagName = flagName;
  }


  public ScheduledTransactionSummary accountId(UUID accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getAccountId() {
    return accountId;
  }


  public void setAccountId(UUID accountId) {
    
    
    
    this.accountId = accountId;
  }


  public ScheduledTransactionSummary payeeId(UUID payeeId) {
    
    
    
    
    this.payeeId = payeeId;
    return this;
  }

   /**
   * Get payeeId
   * @return payeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getPayeeId() {
    return payeeId;
  }


  public void setPayeeId(UUID payeeId) {
    
    
    
    this.payeeId = payeeId;
  }


  public ScheduledTransactionSummary categoryId(UUID categoryId) {
    
    
    
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(UUID categoryId) {
    
    
    
    this.categoryId = categoryId;
  }


  public ScheduledTransactionSummary transferAccountId(UUID transferAccountId) {
    
    
    
    
    this.transferAccountId = transferAccountId;
    return this;
  }

   /**
   * If a transfer, the account_id which the scheduled transaction transfers to
   * @return transferAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If a transfer, the account_id which the scheduled transaction transfers to")

  public UUID getTransferAccountId() {
    return transferAccountId;
  }


  public void setTransferAccountId(UUID transferAccountId) {
    
    
    
    this.transferAccountId = transferAccountId;
  }


  public ScheduledTransactionSummary deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether or not the scheduled transaction has been deleted.  Deleted scheduled transactions will only be included in delta requests.
   * @return deleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not the scheduled transaction has been deleted.  Deleted scheduled transactions will only be included in delta requests.")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    
    
    
    this.deleted = deleted;
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
   * @return the ScheduledTransactionSummary instance itself
   */
  public ScheduledTransactionSummary putAdditionalProperty(String key, Object value) {
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
    ScheduledTransactionSummary scheduledTransactionSummary = (ScheduledTransactionSummary) o;
    return Objects.equals(this.id, scheduledTransactionSummary.id) &&
        Objects.equals(this.dateFirst, scheduledTransactionSummary.dateFirst) &&
        Objects.equals(this.dateNext, scheduledTransactionSummary.dateNext) &&
        Objects.equals(this.frequency, scheduledTransactionSummary.frequency) &&
        Objects.equals(this.amount, scheduledTransactionSummary.amount) &&
        Objects.equals(this.memo, scheduledTransactionSummary.memo) &&
        Objects.equals(this.flagColor, scheduledTransactionSummary.flagColor) &&
        Objects.equals(this.flagName, scheduledTransactionSummary.flagName) &&
        Objects.equals(this.accountId, scheduledTransactionSummary.accountId) &&
        Objects.equals(this.payeeId, scheduledTransactionSummary.payeeId) &&
        Objects.equals(this.categoryId, scheduledTransactionSummary.categoryId) &&
        Objects.equals(this.transferAccountId, scheduledTransactionSummary.transferAccountId) &&
        Objects.equals(this.deleted, scheduledTransactionSummary.deleted)&&
        Objects.equals(this.additionalProperties, scheduledTransactionSummary.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateFirst, dateNext, frequency, amount, memo, flagColor, flagName, accountId, payeeId, categoryId, transferAccountId, deleted, additionalProperties);
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
    sb.append("class ScheduledTransactionSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateFirst: ").append(toIndentedString(dateFirst)).append("\n");
    sb.append("    dateNext: ").append(toIndentedString(dateNext)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    flagColor: ").append(toIndentedString(flagColor)).append("\n");
    sb.append("    flagName: ").append(toIndentedString(flagName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    transferAccountId: ").append(toIndentedString(transferAccountId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
    openapiFields.add("date_first");
    openapiFields.add("date_next");
    openapiFields.add("frequency");
    openapiFields.add("amount");
    openapiFields.add("memo");
    openapiFields.add("flag_color");
    openapiFields.add("flag_name");
    openapiFields.add("account_id");
    openapiFields.add("payee_id");
    openapiFields.add("category_id");
    openapiFields.add("transfer_account_id");
    openapiFields.add("deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("date_first");
    openapiRequiredFields.add("date_next");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("deleted");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduledTransactionSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ScheduledTransactionSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduledTransactionSummary is not found in the empty JSON string", ScheduledTransactionSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScheduledTransactionSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if (!jsonObj.get("memo").isJsonNull() && (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (!jsonObj.get("flag_name").isJsonNull() && (jsonObj.get("flag_name") != null && !jsonObj.get("flag_name").isJsonNull()) && !jsonObj.get("flag_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flag_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flag_name").toString()));
      }
      if (!jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (!jsonObj.get("payee_id").isJsonNull() && (jsonObj.get("payee_id") != null && !jsonObj.get("payee_id").isJsonNull()) && !jsonObj.get("payee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_id").toString()));
      }
      if (!jsonObj.get("category_id").isJsonNull() && (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (!jsonObj.get("transfer_account_id").isJsonNull() && (jsonObj.get("transfer_account_id") != null && !jsonObj.get("transfer_account_id").isJsonNull()) && !jsonObj.get("transfer_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_account_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduledTransactionSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduledTransactionSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduledTransactionSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduledTransactionSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduledTransactionSummary>() {
           @Override
           public void write(JsonWriter out, ScheduledTransactionSummary value) throws IOException {
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
           public ScheduledTransactionSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ScheduledTransactionSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ScheduledTransactionSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduledTransactionSummary
  * @throws IOException if the JSON string is invalid with respect to ScheduledTransactionSummary
  */
  public static ScheduledTransactionSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduledTransactionSummary.class);
  }

 /**
  * Convert an instance of ScheduledTransactionSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
