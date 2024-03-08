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
 * NewTransaction
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewTransaction {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private UUID accountId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_PAYEE_ID = "payee_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_ID)
  private UUID payeeId;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private UUID categoryId;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_CLEARED = "cleared";
  @SerializedName(SERIALIZED_NAME_CLEARED)
  private TransactionClearedStatus cleared;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_FLAG_COLOR = "flag_color";
  @SerializedName(SERIALIZED_NAME_FLAG_COLOR)
  private TransactionFlagColor flagColor;

  public static final String SERIALIZED_NAME_SUBTRANSACTIONS = "subtransactions";
  @SerializedName(SERIALIZED_NAME_SUBTRANSACTIONS)
  private List<SaveSubTransaction> subtransactions = null;

  public static final String SERIALIZED_NAME_IMPORT_ID = "import_id";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private String importId;

  public NewTransaction() {
  }

  public NewTransaction accountId(UUID accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAccountId() {
    return accountId;
  }


  public void setAccountId(UUID accountId) {
    
    
    
    this.accountId = accountId;
  }


  public NewTransaction date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * The transaction date in ISO format (e.g. 2016-12-01).  Future dates (scheduled transactions) are not permitted.  Split transaction dates cannot be changed and if a different date is supplied it will be ignored.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction date in ISO format (e.g. 2016-12-01).  Future dates (scheduled transactions) are not permitted.  Split transaction dates cannot be changed and if a different date is supplied it will be ignored.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public NewTransaction amount(Long amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount in milliunits format.  Split transaction amounts cannot be changed and if a different amount is supplied it will be ignored.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction amount in milliunits format.  Split transaction amounts cannot be changed and if a different amount is supplied it will be ignored.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    
    
    
    this.amount = amount;
  }


  public NewTransaction payeeId(UUID payeeId) {
    
    
    
    
    this.payeeId = payeeId;
    return this;
  }

   /**
   * The payee for the transaction.  To create a transfer between two accounts, use the account transfer payee pointing to the target account.  Account transfer payees are specified as &#x60;tranfer_payee_id&#x60; on the account resource.
   * @return payeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payee for the transaction.  To create a transfer between two accounts, use the account transfer payee pointing to the target account.  Account transfer payees are specified as `tranfer_payee_id` on the account resource.")

  public UUID getPayeeId() {
    return payeeId;
  }


  public void setPayeeId(UUID payeeId) {
    
    
    
    this.payeeId = payeeId;
  }


  public NewTransaction payeeName(String payeeName) {
    
    
    
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * The payee name.  If a &#x60;payee_name&#x60; value is provided and &#x60;payee_id&#x60; has a null value, the &#x60;payee_name&#x60; value will be used to resolve the payee by either (1) a matching payee rename rule (only if &#x60;import_id&#x60; is also specified) or (2) a payee with the same name or (3) creation of a new payee.
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payee name.  If a `payee_name` value is provided and `payee_id` has a null value, the `payee_name` value will be used to resolve the payee by either (1) a matching payee rename rule (only if `import_id` is also specified) or (2) a payee with the same name or (3) creation of a new payee.")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    
    
    
    this.payeeName = payeeName;
  }


  public NewTransaction categoryId(UUID categoryId) {
    
    
    
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The category for the transaction.  To configure a split transaction, you can specify null for &#x60;category_id&#x60; and provide a &#x60;subtransactions&#x60; array as part of the transaction object.  If an existing transaction is a split, the &#x60;category_id&#x60; cannot be changed.  Credit Card Payment categories are not permitted and will be ignored if supplied.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category for the transaction.  To configure a split transaction, you can specify null for `category_id` and provide a `subtransactions` array as part of the transaction object.  If an existing transaction is a split, the `category_id` cannot be changed.  Credit Card Payment categories are not permitted and will be ignored if supplied.")

  public UUID getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(UUID categoryId) {
    
    
    
    this.categoryId = categoryId;
  }


  public NewTransaction memo(String memo) {
    
    
    
    
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


  public NewTransaction cleared(TransactionClearedStatus cleared) {
    
    
    
    
    this.cleared = cleared;
    return this;
  }

   /**
   * Get cleared
   * @return cleared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionClearedStatus getCleared() {
    return cleared;
  }


  public void setCleared(TransactionClearedStatus cleared) {
    
    
    
    this.cleared = cleared;
  }


  public NewTransaction approved(Boolean approved) {
    
    
    
    
    this.approved = approved;
    return this;
  }

   /**
   * Whether or not the transaction is approved.  If not supplied, transaction will be unapproved by default.
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the transaction is approved.  If not supplied, transaction will be unapproved by default.")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    
    
    
    this.approved = approved;
  }


  public NewTransaction flagColor(TransactionFlagColor flagColor) {
    
    
    
    
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


  public NewTransaction subtransactions(List<SaveSubTransaction> subtransactions) {
    
    
    
    
    this.subtransactions = subtransactions;
    return this;
  }

  public NewTransaction addSubtransactionsItem(SaveSubTransaction subtransactionsItem) {
    if (this.subtransactions == null) {
      this.subtransactions = new ArrayList<>();
    }
    this.subtransactions.add(subtransactionsItem);
    return this;
  }

   /**
   * An array of subtransactions to configure a transaction as a split. Updating &#x60;subtransactions&#x60; on an existing split transaction is not supported.
   * @return subtransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of subtransactions to configure a transaction as a split. Updating `subtransactions` on an existing split transaction is not supported.")

  public List<SaveSubTransaction> getSubtransactions() {
    return subtransactions;
  }


  public void setSubtransactions(List<SaveSubTransaction> subtransactions) {
    
    
    
    this.subtransactions = subtransactions;
  }


  public NewTransaction importId(String importId) {
    
    
    
    
    this.importId = importId;
    return this;
  }

   /**
   * If specified, a new transaction will be assigned this &#x60;import_id&#x60; and considered \&quot;imported\&quot;.  We will also attempt to match this imported transaction to an existing \&quot;user-entered\&quot; transaction on the same account, with the same amount, and with a date +/-10 days from the imported transaction date.&lt;br&gt;&lt;br&gt;Transactions imported through File Based Import or Direct Import (not through the API) are assigned an import_id in the format: &#39;YNAB:[milliunit_amount]:[iso_date]:[occurrence]&#39;. For example, a transaction dated 2015-12-30 in the amount of -$294.23 USD would have an import_id of &#39;YNAB:-294230:2015-12-30:1&#39;.  If a second transaction on the same account was imported and had the same date and same amount, its import_id would be &#39;YNAB:-294230:2015-12-30:2&#39;.  Using a consistent format will prevent duplicates through Direct Import and File Based Import.&lt;br&gt;&lt;br&gt;If import_id is omitted or specified as null, the transaction will be treated as a \&quot;user-entered\&quot; transaction. As such, it will be eligible to be matched against transactions later being imported (via DI, FBI, or API).
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, a new transaction will be assigned this `import_id` and considered \"imported\".  We will also attempt to match this imported transaction to an existing \"user-entered\" transaction on the same account, with the same amount, and with a date +/-10 days from the imported transaction date.<br><br>Transactions imported through File Based Import or Direct Import (not through the API) are assigned an import_id in the format: 'YNAB:[milliunit_amount]:[iso_date]:[occurrence]'. For example, a transaction dated 2015-12-30 in the amount of -$294.23 USD would have an import_id of 'YNAB:-294230:2015-12-30:1'.  If a second transaction on the same account was imported and had the same date and same amount, its import_id would be 'YNAB:-294230:2015-12-30:2'.  Using a consistent format will prevent duplicates through Direct Import and File Based Import.<br><br>If import_id is omitted or specified as null, the transaction will be treated as a \"user-entered\" transaction. As such, it will be eligible to be matched against transactions later being imported (via DI, FBI, or API).")

  public String getImportId() {
    return importId;
  }


  public void setImportId(String importId) {
    
    
    
    this.importId = importId;
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
   * @return the NewTransaction instance itself
   */
  public NewTransaction putAdditionalProperty(String key, Object value) {
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
    NewTransaction newTransaction = (NewTransaction) o;
    return Objects.equals(this.accountId, newTransaction.accountId) &&
        Objects.equals(this.date, newTransaction.date) &&
        Objects.equals(this.amount, newTransaction.amount) &&
        Objects.equals(this.payeeId, newTransaction.payeeId) &&
        Objects.equals(this.payeeName, newTransaction.payeeName) &&
        Objects.equals(this.categoryId, newTransaction.categoryId) &&
        Objects.equals(this.memo, newTransaction.memo) &&
        Objects.equals(this.cleared, newTransaction.cleared) &&
        Objects.equals(this.approved, newTransaction.approved) &&
        Objects.equals(this.flagColor, newTransaction.flagColor) &&
        Objects.equals(this.subtransactions, newTransaction.subtransactions) &&
        Objects.equals(this.importId, newTransaction.importId)&&
        Objects.equals(this.additionalProperties, newTransaction.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, date, amount, payeeId, payeeName, categoryId, memo, cleared, approved, flagColor, subtransactions, importId, additionalProperties);
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
    sb.append("class NewTransaction {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    flagColor: ").append(toIndentedString(flagColor)).append("\n");
    sb.append("    subtransactions: ").append(toIndentedString(subtransactions)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("date");
    openapiFields.add("amount");
    openapiFields.add("payee_id");
    openapiFields.add("payee_name");
    openapiFields.add("category_id");
    openapiFields.add("memo");
    openapiFields.add("cleared");
    openapiFields.add("approved");
    openapiFields.add("flag_color");
    openapiFields.add("subtransactions");
    openapiFields.add("import_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewTransaction is not found in the empty JSON string", NewTransaction.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (!jsonObj.get("payee_id").isJsonNull() && (jsonObj.get("payee_id") != null && !jsonObj.get("payee_id").isJsonNull()) && !jsonObj.get("payee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_id").toString()));
      }
      if (!jsonObj.get("payee_name").isJsonNull() && (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonNull()) && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (!jsonObj.get("category_id").isJsonNull() && (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (!jsonObj.get("memo").isJsonNull() && (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("subtransactions") != null && !jsonObj.get("subtransactions").isJsonNull()) {
        JsonArray jsonArraysubtransactions = jsonObj.getAsJsonArray("subtransactions");
        if (jsonArraysubtransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subtransactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subtransactions` to be an array in the JSON string but got `%s`", jsonObj.get("subtransactions").toString()));
          }

          // validate the optional field `subtransactions` (array)
          for (int i = 0; i < jsonArraysubtransactions.size(); i++) {
            SaveSubTransaction.validateJsonObject(jsonArraysubtransactions.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("import_id").isJsonNull() && (jsonObj.get("import_id") != null && !jsonObj.get("import_id").isJsonNull()) && !jsonObj.get("import_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<NewTransaction>() {
           @Override
           public void write(JsonWriter out, NewTransaction value) throws IOException {
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
           public NewTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewTransaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NewTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewTransaction
  * @throws IOException if the JSON string is invalid with respect to NewTransaction
  */
  public static NewTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewTransaction.class);
  }

 /**
  * Convert an instance of NewTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
