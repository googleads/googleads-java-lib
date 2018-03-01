// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * BudgetOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.billing;


/**
 * A <a href="https://support.google.com/adwords/answer/2393037">budget
 * order</a>
 *             links an account-wide budget with a {@link BillingAccount}.
 */
public class BudgetOrder  implements java.io.Serializable {
    /* This must be passed as a string with dashes, e.g. "1234-5678-9012-3456".
     * <span class="constraint Selectable">This field can be selected using
     * the value "BillingAccountId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.String billingAccountId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long id;

    /* Enables user to specify meaningful name for a billing account
     * to aid in reconciling monthly invoices.
     *                 
     *                 This name will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BillingAccountName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 80, inclusive, (trimmed).</span> */
    private java.lang.String billingAccountName;

    /* Enables user to enter a value that helps them reference this
     * budget order
     *                 in their monthly invoices.
     *                 
     *                 This number will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "PoNumber".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 80, inclusive, (trimmed).</span> */
    private java.lang.String poNumber;

    /* Enables user to specify meaningful name for referencing this
     * budget order. A default name
     *                 will be provided if none is specified.
     *                 
     *                 This name will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BudgetOrderName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 150, inclusive, (trimmed).</span> */
    private java.lang.String budgetOrderName;

    /* A 12 digit billing ID assigned to the user by Google. This
     * must be passed in
     *                 as a string with dashes, e.g. "1234-5678-9012".
     *                 
     *                 <p>This field is required in an {@code ADD} operation
     * if billingAccountId is not
     *                 specified.
     *                 <p class="note"><b>Note:</b>Starting with v201708,
     * this field is required in any
     *                 {@code ADD} operation that sets or changes the billing
     * account of a client account.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PrimaryBillingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 14, inclusive, (trimmed).</span> */
    private java.lang.String primaryBillingId;

    /* For certain users, a secondary billing ID will be required
     * on mutate.add.
     *                 If this requirement was not communicated to the user,
     * the user may ignore this parameter.
     *                 If specified, this must be passed in as a string with
     * dashes, e.g. "1234-5678-9012".
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SecondaryBillingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 14, inclusive, (trimmed).</span> */
    private java.lang.String secondaryBillingId;

    /* The spending limit in micros. To specify an unlimited budget,
     * set spendingLimit to -1,
     *                 otherwise spendingLimit must be greater than 0. Note
     * that for get requests, the spending limit
     *                 includes any adjustments that have been applied to
     * the budget order. For mutate,
     *                 the spending limit represents the maximum allowed
     * spend prior to considering any adjustments.
     *                 When making mutate requests, make sure to account
     * for any adjustments that may be reported
     *                 in the get value of the spending limit.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SpendingLimit".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money spendingLimit;

    /* The adjustments amount in micros. Adjustments from Google come
     * in the form of credits or
     *                 debits to your budget order. This amount is the net
     * sum of adjustments since the creation
     *                 of the budget order. You can use the adjustments amount
     * to compute your current base
     *                 spendingLimit by subtracting your adjustments from
     * the value returned from spendingLimit
     *                 in get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TotalAdjustments".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money totalAdjustments;

    /* StartDateTime cannot be in the past, it must be on or before
     * "20361231 235959 America/Los_Angeles". StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String startDateTime;

    /* EndDateTime must be on or before "20361231 235959 America/Los_Angeles"
     * or
     *                 must set the same instant as "20371230 235959 America/Los_Angeles"
     * to
     *                 indicate infinite end date. StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String endDateTime;

    /* Contains fields that provide information on the last set of
     * values that
     *                 were passed in through the parent BudgetOrder for
     * mutate.add and
     *                 mutate.set.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastRequest".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequest lastRequest;

    public BudgetOrder() {
    }

    public BudgetOrder(
           java.lang.String billingAccountId,
           java.lang.Long id,
           java.lang.String billingAccountName,
           java.lang.String poNumber,
           java.lang.String budgetOrderName,
           java.lang.String primaryBillingId,
           java.lang.String secondaryBillingId,
           com.google.api.ads.adwords.axis.v201802.cm.Money spendingLimit,
           com.google.api.ads.adwords.axis.v201802.cm.Money totalAdjustments,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequest lastRequest) {
           this.billingAccountId = billingAccountId;
           this.id = id;
           this.billingAccountName = billingAccountName;
           this.poNumber = poNumber;
           this.budgetOrderName = budgetOrderName;
           this.primaryBillingId = primaryBillingId;
           this.secondaryBillingId = secondaryBillingId;
           this.spendingLimit = spendingLimit;
           this.totalAdjustments = totalAdjustments;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.lastRequest = lastRequest;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("billingAccountId", getBillingAccountId())
            .add("billingAccountName", getBillingAccountName())
            .add("budgetOrderName", getBudgetOrderName())
            .add("endDateTime", getEndDateTime())
            .add("id", getId())
            .add("lastRequest", getLastRequest())
            .add("poNumber", getPoNumber())
            .add("primaryBillingId", getPrimaryBillingId())
            .add("secondaryBillingId", getSecondaryBillingId())
            .add("spendingLimit", getSpendingLimit())
            .add("startDateTime", getStartDateTime())
            .add("totalAdjustments", getTotalAdjustments())
            .toString();
    }

    /**
     * Gets the billingAccountId value for this BudgetOrder.
     * 
     * @return billingAccountId   * This must be passed as a string with dashes, e.g. "1234-5678-9012-3456".
     * <span class="constraint Selectable">This field can be selected using
     * the value "BillingAccountId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.String getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this BudgetOrder.
     * 
     * @param billingAccountId   * This must be passed as a string with dashes, e.g. "1234-5678-9012-3456".
     * <span class="constraint Selectable">This field can be selected using
     * the value "BillingAccountId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setBillingAccountId(java.lang.String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the id value for this BudgetOrder.
     * 
     * @return id   * <span class="constraint Selectable">This field can be selected
     * using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BudgetOrder.
     * 
     * @param id   * <span class="constraint Selectable">This field can be selected
     * using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the billingAccountName value for this BudgetOrder.
     * 
     * @return billingAccountName   * Enables user to specify meaningful name for a billing account
     * to aid in reconciling monthly invoices.
     *                 
     *                 This name will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BillingAccountName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 80, inclusive, (trimmed).</span>
     */
    public java.lang.String getBillingAccountName() {
        return billingAccountName;
    }


    /**
     * Sets the billingAccountName value for this BudgetOrder.
     * 
     * @param billingAccountName   * Enables user to specify meaningful name for a billing account
     * to aid in reconciling monthly invoices.
     *                 
     *                 This name will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BillingAccountName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 80, inclusive, (trimmed).</span>
     */
    public void setBillingAccountName(java.lang.String billingAccountName) {
        this.billingAccountName = billingAccountName;
    }


    /**
     * Gets the poNumber value for this BudgetOrder.
     * 
     * @return poNumber   * Enables user to enter a value that helps them reference this
     * budget order
     *                 in their monthly invoices.
     *                 
     *                 This number will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "PoNumber".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 80, inclusive, (trimmed).</span>
     */
    public java.lang.String getPoNumber() {
        return poNumber;
    }


    /**
     * Sets the poNumber value for this BudgetOrder.
     * 
     * @param poNumber   * Enables user to enter a value that helps them reference this
     * budget order
     *                 in their monthly invoices.
     *                 
     *                 This number will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "PoNumber".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 80, inclusive, (trimmed).</span>
     */
    public void setPoNumber(java.lang.String poNumber) {
        this.poNumber = poNumber;
    }


    /**
     * Gets the budgetOrderName value for this BudgetOrder.
     * 
     * @return budgetOrderName   * Enables user to specify meaningful name for referencing this
     * budget order. A default name
     *                 will be provided if none is specified.
     *                 
     *                 This name will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BudgetOrderName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 150, inclusive, (trimmed).</span>
     */
    public java.lang.String getBudgetOrderName() {
        return budgetOrderName;
    }


    /**
     * Sets the budgetOrderName value for this BudgetOrder.
     * 
     * @param budgetOrderName   * Enables user to specify meaningful name for referencing this
     * budget order. A default name
     *                 will be provided if none is specified.
     *                 
     *                 This name will be printed in the monthly invoices.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BudgetOrderName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 150, inclusive, (trimmed).</span>
     */
    public void setBudgetOrderName(java.lang.String budgetOrderName) {
        this.budgetOrderName = budgetOrderName;
    }


    /**
     * Gets the primaryBillingId value for this BudgetOrder.
     * 
     * @return primaryBillingId   * A 12 digit billing ID assigned to the user by Google. This
     * must be passed in
     *                 as a string with dashes, e.g. "1234-5678-9012".
     *                 
     *                 <p>This field is required in an {@code ADD} operation
     * if billingAccountId is not
     *                 specified.
     *                 <p class="note"><b>Note:</b>Starting with v201708,
     * this field is required in any
     *                 {@code ADD} operation that sets or changes the billing
     * account of a client account.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PrimaryBillingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 14, inclusive, (trimmed).</span>
     */
    public java.lang.String getPrimaryBillingId() {
        return primaryBillingId;
    }


    /**
     * Sets the primaryBillingId value for this BudgetOrder.
     * 
     * @param primaryBillingId   * A 12 digit billing ID assigned to the user by Google. This
     * must be passed in
     *                 as a string with dashes, e.g. "1234-5678-9012".
     *                 
     *                 <p>This field is required in an {@code ADD} operation
     * if billingAccountId is not
     *                 specified.
     *                 <p class="note"><b>Note:</b>Starting with v201708,
     * this field is required in any
     *                 {@code ADD} operation that sets or changes the billing
     * account of a client account.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PrimaryBillingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 14, inclusive, (trimmed).</span>
     */
    public void setPrimaryBillingId(java.lang.String primaryBillingId) {
        this.primaryBillingId = primaryBillingId;
    }


    /**
     * Gets the secondaryBillingId value for this BudgetOrder.
     * 
     * @return secondaryBillingId   * For certain users, a secondary billing ID will be required
     * on mutate.add.
     *                 If this requirement was not communicated to the user,
     * the user may ignore this parameter.
     *                 If specified, this must be passed in as a string with
     * dashes, e.g. "1234-5678-9012".
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SecondaryBillingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 14, inclusive, (trimmed).</span>
     */
    public java.lang.String getSecondaryBillingId() {
        return secondaryBillingId;
    }


    /**
     * Sets the secondaryBillingId value for this BudgetOrder.
     * 
     * @param secondaryBillingId   * For certain users, a secondary billing ID will be required
     * on mutate.add.
     *                 If this requirement was not communicated to the user,
     * the user may ignore this parameter.
     *                 If specified, this must be passed in as a string with
     * dashes, e.g. "1234-5678-9012".
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SecondaryBillingId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 14, inclusive, (trimmed).</span>
     */
    public void setSecondaryBillingId(java.lang.String secondaryBillingId) {
        this.secondaryBillingId = secondaryBillingId;
    }


    /**
     * Gets the spendingLimit value for this BudgetOrder.
     * 
     * @return spendingLimit   * The spending limit in micros. To specify an unlimited budget,
     * set spendingLimit to -1,
     *                 otherwise spendingLimit must be greater than 0. Note
     * that for get requests, the spending limit
     *                 includes any adjustments that have been applied to
     * the budget order. For mutate,
     *                 the spending limit represents the maximum allowed
     * spend prior to considering any adjustments.
     *                 When making mutate requests, make sure to account
     * for any adjustments that may be reported
     *                 in the get value of the spending limit.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SpendingLimit".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getSpendingLimit() {
        return spendingLimit;
    }


    /**
     * Sets the spendingLimit value for this BudgetOrder.
     * 
     * @param spendingLimit   * The spending limit in micros. To specify an unlimited budget,
     * set spendingLimit to -1,
     *                 otherwise spendingLimit must be greater than 0. Note
     * that for get requests, the spending limit
     *                 includes any adjustments that have been applied to
     * the budget order. For mutate,
     *                 the spending limit represents the maximum allowed
     * spend prior to considering any adjustments.
     *                 When making mutate requests, make sure to account
     * for any adjustments that may be reported
     *                 in the get value of the spending limit.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SpendingLimit".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setSpendingLimit(com.google.api.ads.adwords.axis.v201802.cm.Money spendingLimit) {
        this.spendingLimit = spendingLimit;
    }


    /**
     * Gets the totalAdjustments value for this BudgetOrder.
     * 
     * @return totalAdjustments   * The adjustments amount in micros. Adjustments from Google come
     * in the form of credits or
     *                 debits to your budget order. This amount is the net
     * sum of adjustments since the creation
     *                 of the budget order. You can use the adjustments amount
     * to compute your current base
     *                 spendingLimit by subtracting your adjustments from
     * the value returned from spendingLimit
     *                 in get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TotalAdjustments".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getTotalAdjustments() {
        return totalAdjustments;
    }


    /**
     * Sets the totalAdjustments value for this BudgetOrder.
     * 
     * @param totalAdjustments   * The adjustments amount in micros. Adjustments from Google come
     * in the form of credits or
     *                 debits to your budget order. This amount is the net
     * sum of adjustments since the creation
     *                 of the budget order. You can use the adjustments amount
     * to compute your current base
     *                 spendingLimit by subtracting your adjustments from
     * the value returned from spendingLimit
     *                 in get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TotalAdjustments".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTotalAdjustments(com.google.api.ads.adwords.axis.v201802.cm.Money totalAdjustments) {
        this.totalAdjustments = totalAdjustments;
    }


    /**
     * Gets the startDateTime value for this BudgetOrder.
     * 
     * @return startDateTime   * StartDateTime cannot be in the past, it must be on or before
     * "20361231 235959 America/Los_Angeles". StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this BudgetOrder.
     * 
     * @param startDateTime   * StartDateTime cannot be in the past, it must be on or before
     * "20361231 235959 America/Los_Angeles". StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this BudgetOrder.
     * 
     * @return endDateTime   * EndDateTime must be on or before "20361231 235959 America/Los_Angeles"
     * or
     *                 must set the same instant as "20371230 235959 America/Los_Angeles"
     * to
     *                 indicate infinite end date. StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this BudgetOrder.
     * 
     * @param endDateTime   * EndDateTime must be on or before "20361231 235959 America/Los_Angeles"
     * or
     *                 must set the same instant as "20371230 235959 America/Los_Angeles"
     * to
     *                 indicate infinite end date. StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the lastRequest value for this BudgetOrder.
     * 
     * @return lastRequest   * Contains fields that provide information on the last set of
     * values that
     *                 were passed in through the parent BudgetOrder for
     * mutate.add and
     *                 mutate.set.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastRequest".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequest getLastRequest() {
        return lastRequest;
    }


    /**
     * Sets the lastRequest value for this BudgetOrder.
     * 
     * @param lastRequest   * Contains fields that provide information on the last set of
     * values that
     *                 were passed in through the parent BudgetOrder for
     * mutate.add and
     *                 mutate.set.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastRequest".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setLastRequest(com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequest lastRequest) {
        this.lastRequest = lastRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetOrder)) return false;
        BudgetOrder other = (BudgetOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAccountId==null && other.getBillingAccountId()==null) || 
             (this.billingAccountId!=null &&
              this.billingAccountId.equals(other.getBillingAccountId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.billingAccountName==null && other.getBillingAccountName()==null) || 
             (this.billingAccountName!=null &&
              this.billingAccountName.equals(other.getBillingAccountName()))) &&
            ((this.poNumber==null && other.getPoNumber()==null) || 
             (this.poNumber!=null &&
              this.poNumber.equals(other.getPoNumber()))) &&
            ((this.budgetOrderName==null && other.getBudgetOrderName()==null) || 
             (this.budgetOrderName!=null &&
              this.budgetOrderName.equals(other.getBudgetOrderName()))) &&
            ((this.primaryBillingId==null && other.getPrimaryBillingId()==null) || 
             (this.primaryBillingId!=null &&
              this.primaryBillingId.equals(other.getPrimaryBillingId()))) &&
            ((this.secondaryBillingId==null && other.getSecondaryBillingId()==null) || 
             (this.secondaryBillingId!=null &&
              this.secondaryBillingId.equals(other.getSecondaryBillingId()))) &&
            ((this.spendingLimit==null && other.getSpendingLimit()==null) || 
             (this.spendingLimit!=null &&
              this.spendingLimit.equals(other.getSpendingLimit()))) &&
            ((this.totalAdjustments==null && other.getTotalAdjustments()==null) || 
             (this.totalAdjustments!=null &&
              this.totalAdjustments.equals(other.getTotalAdjustments()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.lastRequest==null && other.getLastRequest()==null) || 
             (this.lastRequest!=null &&
              this.lastRequest.equals(other.getLastRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBillingAccountId() != null) {
            _hashCode += getBillingAccountId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getBillingAccountName() != null) {
            _hashCode += getBillingAccountName().hashCode();
        }
        if (getPoNumber() != null) {
            _hashCode += getPoNumber().hashCode();
        }
        if (getBudgetOrderName() != null) {
            _hashCode += getBudgetOrderName().hashCode();
        }
        if (getPrimaryBillingId() != null) {
            _hashCode += getPrimaryBillingId().hashCode();
        }
        if (getSecondaryBillingId() != null) {
            _hashCode += getSecondaryBillingId().hashCode();
        }
        if (getSpendingLimit() != null) {
            _hashCode += getSpendingLimit().hashCode();
        }
        if (getTotalAdjustments() != null) {
            _hashCode += getTotalAdjustments().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getLastRequest() != null) {
            _hashCode += getLastRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "BudgetOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "billingAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "billingAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "poNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetOrderName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "budgetOrderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryBillingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "primaryBillingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryBillingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "secondaryBillingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendingLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "spendingLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAdjustments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "totalAdjustments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "lastRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "BudgetOrderRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
