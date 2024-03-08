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
import com.konfigthis.client.model.AccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
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
 * Account
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Account {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccountType type;

  public static final String SERIALIZED_NAME_ON_BUDGET = "on_budget";
  @SerializedName(SERIALIZED_NAME_ON_BUDGET)
  private Boolean onBudget;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance;

  public static final String SERIALIZED_NAME_CLEARED_BALANCE = "cleared_balance";
  @SerializedName(SERIALIZED_NAME_CLEARED_BALANCE)
  private Long clearedBalance;

  public static final String SERIALIZED_NAME_UNCLEARED_BALANCE = "uncleared_balance";
  @SerializedName(SERIALIZED_NAME_UNCLEARED_BALANCE)
  private Long unclearedBalance;

  public static final String SERIALIZED_NAME_TRANSFER_PAYEE_ID = "transfer_payee_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_PAYEE_ID)
  private UUID transferPayeeId;

  public static final String SERIALIZED_NAME_DIRECT_IMPORT_LINKED = "direct_import_linked";
  @SerializedName(SERIALIZED_NAME_DIRECT_IMPORT_LINKED)
  private Boolean directImportLinked;

  public static final String SERIALIZED_NAME_DIRECT_IMPORT_IN_ERROR = "direct_import_in_error";
  @SerializedName(SERIALIZED_NAME_DIRECT_IMPORT_IN_ERROR)
  private Boolean directImportInError;

  public static final String SERIALIZED_NAME_LAST_RECONCILED_AT = "last_reconciled_at";
  @SerializedName(SERIALIZED_NAME_LAST_RECONCILED_AT)
  private OffsetDateTime lastReconciledAt;

  public static final String SERIALIZED_NAME_DEBT_ORIGINAL_BALANCE = "debt_original_balance";
  @SerializedName(SERIALIZED_NAME_DEBT_ORIGINAL_BALANCE)
  private Long debtOriginalBalance;

  public static final String SERIALIZED_NAME_DEBT_INTEREST_RATES = "debt_interest_rates";
  @SerializedName(SERIALIZED_NAME_DEBT_INTEREST_RATES)
  private Map<String, Long> debtInterestRates = null;

  public static final String SERIALIZED_NAME_DEBT_MINIMUM_PAYMENTS = "debt_minimum_payments";
  @SerializedName(SERIALIZED_NAME_DEBT_MINIMUM_PAYMENTS)
  private Map<String, Long> debtMinimumPayments = null;

  public static final String SERIALIZED_NAME_DEBT_ESCROW_AMOUNTS = "debt_escrow_amounts";
  @SerializedName(SERIALIZED_NAME_DEBT_ESCROW_AMOUNTS)
  private Map<String, Long> debtEscrowAmounts = null;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public Account() {
  }

  public Account id(UUID id) {
    
    
    
    
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


  public Account name(String name) {
    
    
    
    
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


  public Account type(AccountType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountType getType() {
    return type;
  }


  public void setType(AccountType type) {
    
    
    
    this.type = type;
  }


  public Account onBudget(Boolean onBudget) {
    
    
    
    
    this.onBudget = onBudget;
    return this;
  }

   /**
   * Whether this account is on budget or not
   * @return onBudget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether this account is on budget or not")

  public Boolean getOnBudget() {
    return onBudget;
  }


  public void setOnBudget(Boolean onBudget) {
    
    
    
    this.onBudget = onBudget;
  }


  public Account closed(Boolean closed) {
    
    
    
    
    this.closed = closed;
    return this;
  }

   /**
   * Whether this account is closed or not
   * @return closed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether this account is closed or not")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    
    
    
    this.closed = closed;
  }


  public Account note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
  }


  public Account balance(Long balance) {
    
    
    
    
    this.balance = balance;
    return this;
  }

   /**
   * The current balance of the account in milliunits format
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current balance of the account in milliunits format")

  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    
    
    
    this.balance = balance;
  }


  public Account clearedBalance(Long clearedBalance) {
    
    
    
    
    this.clearedBalance = clearedBalance;
    return this;
  }

   /**
   * The current cleared balance of the account in milliunits format
   * @return clearedBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current cleared balance of the account in milliunits format")

  public Long getClearedBalance() {
    return clearedBalance;
  }


  public void setClearedBalance(Long clearedBalance) {
    
    
    
    this.clearedBalance = clearedBalance;
  }


  public Account unclearedBalance(Long unclearedBalance) {
    
    
    
    
    this.unclearedBalance = unclearedBalance;
    return this;
  }

   /**
   * The current uncleared balance of the account in milliunits format
   * @return unclearedBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current uncleared balance of the account in milliunits format")

  public Long getUnclearedBalance() {
    return unclearedBalance;
  }


  public void setUnclearedBalance(Long unclearedBalance) {
    
    
    
    this.unclearedBalance = unclearedBalance;
  }


  public Account transferPayeeId(UUID transferPayeeId) {
    
    
    
    
    this.transferPayeeId = transferPayeeId;
    return this;
  }

   /**
   * The payee id which should be used when transferring to this account
   * @return transferPayeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The payee id which should be used when transferring to this account")

  public UUID getTransferPayeeId() {
    return transferPayeeId;
  }


  public void setTransferPayeeId(UUID transferPayeeId) {
    
    
    
    this.transferPayeeId = transferPayeeId;
  }


  public Account directImportLinked(Boolean directImportLinked) {
    
    
    
    
    this.directImportLinked = directImportLinked;
    return this;
  }

   /**
   * Whether or not the account is linked to a financial institution for automatic transaction import.
   * @return directImportLinked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the account is linked to a financial institution for automatic transaction import.")

  public Boolean getDirectImportLinked() {
    return directImportLinked;
  }


  public void setDirectImportLinked(Boolean directImportLinked) {
    
    
    
    this.directImportLinked = directImportLinked;
  }


  public Account directImportInError(Boolean directImportInError) {
    
    
    
    
    this.directImportInError = directImportInError;
    return this;
  }

   /**
   * If an account linked to a financial institution (direct_import_linked&#x3D;true) and the linked connection is not in a healthy state, this will be true.
   * @return directImportInError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If an account linked to a financial institution (direct_import_linked=true) and the linked connection is not in a healthy state, this will be true.")

  public Boolean getDirectImportInError() {
    return directImportInError;
  }


  public void setDirectImportInError(Boolean directImportInError) {
    
    
    
    this.directImportInError = directImportInError;
  }


  public Account lastReconciledAt(OffsetDateTime lastReconciledAt) {
    
    
    
    
    this.lastReconciledAt = lastReconciledAt;
    return this;
  }

   /**
   * A date/time specifying when the account was last reconciled.
   * @return lastReconciledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A date/time specifying when the account was last reconciled.")

  public OffsetDateTime getLastReconciledAt() {
    return lastReconciledAt;
  }


  public void setLastReconciledAt(OffsetDateTime lastReconciledAt) {
    
    
    
    this.lastReconciledAt = lastReconciledAt;
  }


  public Account debtOriginalBalance(Long debtOriginalBalance) {
    
    
    
    
    this.debtOriginalBalance = debtOriginalBalance;
    return this;
  }

   /**
   * The original debt/loan account balance, specified in milliunits format.
   * @return debtOriginalBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original debt/loan account balance, specified in milliunits format.")

  public Long getDebtOriginalBalance() {
    return debtOriginalBalance;
  }


  public void setDebtOriginalBalance(Long debtOriginalBalance) {
    
    
    
    this.debtOriginalBalance = debtOriginalBalance;
  }


  public Account debtInterestRates(Map<String, Long> debtInterestRates) {
    
    
    
    
    this.debtInterestRates = debtInterestRates;
    return this;
  }

  public Account putDebtInterestRatesItem(String key, Long debtInterestRatesItem) {
    if (this.debtInterestRates == null) {
      this.debtInterestRates = new HashMap<>();
    }
    this.debtInterestRates.put(key, debtInterestRatesItem);
    return this;
  }

   /**
   * Get debtInterestRates
   * @return debtInterestRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Long> getDebtInterestRates() {
    return debtInterestRates;
  }


  public void setDebtInterestRates(Map<String, Long> debtInterestRates) {
    
    
    
    this.debtInterestRates = debtInterestRates;
  }


  public Account debtMinimumPayments(Map<String, Long> debtMinimumPayments) {
    
    
    
    
    this.debtMinimumPayments = debtMinimumPayments;
    return this;
  }

  public Account putDebtMinimumPaymentsItem(String key, Long debtMinimumPaymentsItem) {
    if (this.debtMinimumPayments == null) {
      this.debtMinimumPayments = new HashMap<>();
    }
    this.debtMinimumPayments.put(key, debtMinimumPaymentsItem);
    return this;
  }

   /**
   * Get debtMinimumPayments
   * @return debtMinimumPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Long> getDebtMinimumPayments() {
    return debtMinimumPayments;
  }


  public void setDebtMinimumPayments(Map<String, Long> debtMinimumPayments) {
    
    
    
    this.debtMinimumPayments = debtMinimumPayments;
  }


  public Account debtEscrowAmounts(Map<String, Long> debtEscrowAmounts) {
    
    
    
    
    this.debtEscrowAmounts = debtEscrowAmounts;
    return this;
  }

  public Account putDebtEscrowAmountsItem(String key, Long debtEscrowAmountsItem) {
    if (this.debtEscrowAmounts == null) {
      this.debtEscrowAmounts = new HashMap<>();
    }
    this.debtEscrowAmounts.put(key, debtEscrowAmountsItem);
    return this;
  }

   /**
   * Get debtEscrowAmounts
   * @return debtEscrowAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Long> getDebtEscrowAmounts() {
    return debtEscrowAmounts;
  }


  public void setDebtEscrowAmounts(Map<String, Long> debtEscrowAmounts) {
    
    
    
    this.debtEscrowAmounts = debtEscrowAmounts;
  }


  public Account deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether or not the account has been deleted.  Deleted accounts will only be included in delta requests.
   * @return deleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not the account has been deleted.  Deleted accounts will only be included in delta requests.")

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
   * @return the Account instance itself
   */
  public Account putAdditionalProperty(String key, Object value) {
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
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.onBudget, account.onBudget) &&
        Objects.equals(this.closed, account.closed) &&
        Objects.equals(this.note, account.note) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.clearedBalance, account.clearedBalance) &&
        Objects.equals(this.unclearedBalance, account.unclearedBalance) &&
        Objects.equals(this.transferPayeeId, account.transferPayeeId) &&
        Objects.equals(this.directImportLinked, account.directImportLinked) &&
        Objects.equals(this.directImportInError, account.directImportInError) &&
        Objects.equals(this.lastReconciledAt, account.lastReconciledAt) &&
        Objects.equals(this.debtOriginalBalance, account.debtOriginalBalance) &&
        Objects.equals(this.debtInterestRates, account.debtInterestRates) &&
        Objects.equals(this.debtMinimumPayments, account.debtMinimumPayments) &&
        Objects.equals(this.debtEscrowAmounts, account.debtEscrowAmounts) &&
        Objects.equals(this.deleted, account.deleted)&&
        Objects.equals(this.additionalProperties, account.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, onBudget, closed, note, balance, clearedBalance, unclearedBalance, transferPayeeId, directImportLinked, directImportInError, lastReconciledAt, debtOriginalBalance, debtInterestRates, debtMinimumPayments, debtEscrowAmounts, deleted, additionalProperties);
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
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    onBudget: ").append(toIndentedString(onBudget)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    clearedBalance: ").append(toIndentedString(clearedBalance)).append("\n");
    sb.append("    unclearedBalance: ").append(toIndentedString(unclearedBalance)).append("\n");
    sb.append("    transferPayeeId: ").append(toIndentedString(transferPayeeId)).append("\n");
    sb.append("    directImportLinked: ").append(toIndentedString(directImportLinked)).append("\n");
    sb.append("    directImportInError: ").append(toIndentedString(directImportInError)).append("\n");
    sb.append("    lastReconciledAt: ").append(toIndentedString(lastReconciledAt)).append("\n");
    sb.append("    debtOriginalBalance: ").append(toIndentedString(debtOriginalBalance)).append("\n");
    sb.append("    debtInterestRates: ").append(toIndentedString(debtInterestRates)).append("\n");
    sb.append("    debtMinimumPayments: ").append(toIndentedString(debtMinimumPayments)).append("\n");
    sb.append("    debtEscrowAmounts: ").append(toIndentedString(debtEscrowAmounts)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("on_budget");
    openapiFields.add("closed");
    openapiFields.add("note");
    openapiFields.add("balance");
    openapiFields.add("cleared_balance");
    openapiFields.add("uncleared_balance");
    openapiFields.add("transfer_payee_id");
    openapiFields.add("direct_import_linked");
    openapiFields.add("direct_import_in_error");
    openapiFields.add("last_reconciled_at");
    openapiFields.add("debt_original_balance");
    openapiFields.add("debt_interest_rates");
    openapiFields.add("debt_minimum_payments");
    openapiFields.add("debt_escrow_amounts");
    openapiFields.add("deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("on_budget");
    openapiRequiredFields.add("closed");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("cleared_balance");
    openapiRequiredFields.add("uncleared_balance");
    openapiRequiredFields.add("transfer_payee_id");
    openapiRequiredFields.add("deleted");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
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
      if (!jsonObj.get("note").isJsonNull() && (jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (!jsonObj.get("transfer_payee_id").isJsonNull() && !jsonObj.get("transfer_payee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_payee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_payee_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
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
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Account instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

