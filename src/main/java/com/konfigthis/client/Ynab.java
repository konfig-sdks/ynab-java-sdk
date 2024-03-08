package com.konfigthis.client;

import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.BudgetsApi;
import com.konfigthis.client.api.CategoriesApi;
import com.konfigthis.client.api.MonthsApi;
import com.konfigthis.client.api.PayeeLocationsApi;
import com.konfigthis.client.api.PayeesApi;
import com.konfigthis.client.api.ScheduledTransactionsApi;
import com.konfigthis.client.api.TransactionsApi;
import com.konfigthis.client.api.UserApi;

public class Ynab {
    private ApiClient apiClient;
    public final AccountsApi accounts;
    public final BudgetsApi budgets;
    public final CategoriesApi categories;
    public final MonthsApi months;
    public final PayeeLocationsApi payeeLocations;
    public final PayeesApi payees;
    public final ScheduledTransactionsApi scheduledTransactions;
    public final TransactionsApi transactions;
    public final UserApi user;

    public Ynab() {
        this(null);
    }

    public Ynab(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accounts = new AccountsApi(this.apiClient);
        this.budgets = new BudgetsApi(this.apiClient);
        this.categories = new CategoriesApi(this.apiClient);
        this.months = new MonthsApi(this.apiClient);
        this.payeeLocations = new PayeeLocationsApi(this.apiClient);
        this.payees = new PayeesApi(this.apiClient);
        this.scheduledTransactions = new ScheduledTransactionsApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
    }

}
