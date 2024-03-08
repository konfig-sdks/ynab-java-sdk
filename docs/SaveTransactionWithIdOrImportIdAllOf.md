

# SaveTransactionWithIdOrImportIdAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | If specified, this id will be used to lookup a transaction by its &#x60;id&#x60; for the purpose of updating the transaction itself. If not specified, an &#x60;import_id&#x60; should be supplied. |  [optional] |
|**importId** | **String** | If specified, this id will be used to lookup a transaction by its &#x60;import_id&#x60; for the purpose of updating the transaction itself. If not specified, an &#x60;id&#x60; should be supplied.  You may not provide both an &#x60;id&#x60; and an &#x60;import_id&#x60; and updating an &#x60;import_id&#x60; on an existing transaction is not allowed. |  [optional] |



