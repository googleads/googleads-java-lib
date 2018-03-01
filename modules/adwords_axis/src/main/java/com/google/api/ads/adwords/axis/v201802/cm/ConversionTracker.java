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
 * ConversionTracker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * An abstract Conversion base class.
 */
public abstract class ConversionTracker  implements java.io.Serializable {
    /* ID of this conversion tracker, {@code null} when creating a
     * new one.
     *                 
     *                 <p>There are some system-defined conversion trackers
     * that are available
     *                 for all customers to use.  See {@link ConversionTrackerService#mutate}
     * for
     *                 more information about how to modify these types.
     *                 <ul>
     *                 <li>179 - Calls from Ads</li>
     *                 <li>214 - Android Downloads</li>
     *                 <li>239 - Store Visits</li>
     *                 </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long id;

    /* The ID of the original conversion type on which this ConversionType
     * is based.
     *                 This is used to facilitate a connection between an
     * existing shared conversion type
     *                 (e.g. Calls from ads) and an advertiser-specific conversion
     * type. This may only be specified
     *                 for ADD operations, and can never be modified once
     * a ConversionType is created.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "OriginalConversionTypeId".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API for the following {@link Operator}s:
     * SET.</span> */
    private java.lang.Long originalConversionTypeId;

    /* Name of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String name;

    /* Status of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerStatus status;

    /* The category of conversion that is being tracked.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerCategory category;

    /* The event snippet that works with the global site tag to track
     * actions that should be counted
     *                 as conversions. Returns an empty string if the conversion
     * tracker does not use snippets.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GoogleEventSnippet".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String googleEventSnippet;

    /* The global site tag that adds visitors to your basic remarketing
     * lists and sets new cookies on
     *                 your domain, which will store information about the
     * ad click that brought a user to your
     *                 website. Returns an empty string if the conversion
     * tracker does not use snippets.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GoogleGlobalSiteTag".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String googleGlobalSiteTag;

    /* The status of the data-driven attribution model for the conversion
     * type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DataDrivenModelStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.DataDrivenModelStatus dataDrivenModelStatus;

    /* The external customer ID of the conversion type owner, or 0
     * if this is a system-defined
     *                 conversion type. Only the conversion type owner may
     * edit properties of the conversion type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionTypeOwnerCustomerId".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Long conversionTypeOwnerCustomerId;

    /* Lookback window for view-through conversions in days. This
     * is the length of
     *                 time in which a conversion without a click can be
     * attributed to an
     *                 impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewthroughLookbackWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint InRange">This field must be between 1 and
     * 30, inclusive.</span> */
    private java.lang.Integer viewthroughLookbackWindow;

    /* The click-through conversion (ctc) lookback window is the maximum
     * number of days between
     *                 the time a conversion event happens and the previous
     * corresponding ad click.
     *                 
     *                 <p>Conversion events that occur more than this many
     * days after the click are ignored.
     *                 
     *                 <p>This field is only editable for Adwords Conversions
     * and Upload Conversions, but has a system
     *                 defined default for other types of conversions. The
     * allowed range of values for this window
     *                 depends on the type of conversion and may expand,
     * but 1-90 days is the currently allowed
     *                 range.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CtcLookbackWindow".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Integer ctcLookbackWindow;

    /* How to count events for this conversion tracker.
     *                 If countingType is MANY_PER_CLICK, then all conversion
     * events are counted.
     *                 If countingType is ONE_PER_CLICK, then only the first
     * conversion event of this type
     *                 following a given click will be counted.
     *                 More information is available at https://support.google.com/adwords/answer/3438531
     * <span class="constraint Selectable">This field can be selected using
     * the value "CountingType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConversionDeduplicationMode countingType;

    /* The value to use when the tag for this conversion tracker sends
     * conversion events without
     *                 values. This value is applied on the server side,
     * and is applicable to all ConversionTracker
     *                 subclasses.
     *                 <p>
     *                 See also the corresponding {@link ConversionTracker#defaultRevenueCurrencyCode},
     * and see
     *                 {@link ConversionTracker#alwaysUseDefaultRevenueValue}
     * for details about when this value is
     *                 used.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DefaultRevenueValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 1000000000000, inclusive.</span> */
    private java.lang.Double defaultRevenueValue;

    /* The currency code to use when the tag for this conversion tracker
     * sends conversion events
     *                 without currency codes. This code is applied on the
     * server side, and is applicable to all
     *                 ConversionTracker subclasses. It must be a valid ISO4217
     * 3-character code, such as USD.
     *                 <p>
     *                 This code is used if the code in the tag is not supplied
     * or is unsupported, or if
     *                 {@link ConversionTracker#alwaysUseDefaultRevenueValue}
     * is set to true. If this default code is
     *                 not set the currency code of the account is used as
     * the default code.
     *                 <p>
     *                 Set the default code to XXX in order to specify that
     * this conversion type does not have units
     *                 of a currency (that is, it is unitless). In this case
     * no currency conversion will occur even if
     *                 a currency code is set in the tag.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DefaultRevenueCurrencyCode".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String defaultRevenueCurrencyCode;

    /* Controls whether conversion event values and currency codes
     * are taken from the tag snippet or
     *                 from {@link ConversionTracker#defaultRevenueValue}
     * and
     *                 {@link ConversionTracker#defaultRevenueCurrencyCode}.
     * If alwaysUseDefaultRevenueValue is true,
     *                 then conversion events will always use defaultRevenueValue
     * and defaultRevenueCurrencyCode, even
     *                 if the tag has supplied a value and/or code when reporting
     * the conversion event.  If
     *                 alwaysUseDefaultRevenueValue is false, then defaultRevenueValue
     * and defaultRevenueCurrencyCode
     *                 are only used if the tag does not supply a value,
     * or the tag's value is unparseable.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AlwaysUseDefaultRevenueValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean alwaysUseDefaultRevenueValue;

    /* Whether this conversion tracker should be excluded from the
     * "Conversions" columns in reports.
     *                 <p>
     *                 If true, the conversion tracker will not be counted
     * towards Conversions.
     *                 If false, it will be counted in Conversions. This
     * is the default.</p>
     *                 
     *                 Either way, conversions will still be counted in the
     * "AllConversions" columns in reports.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExcludeFromBidding".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean excludeFromBidding;

    /* Attribution models describing how to distribute credit for
     * a particular conversion across
     *                 potentially many prior interactions. See https://support.google.com/adwords/answer/6259715
     * for
     *                 more information about attribution modeling in AdWords.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributionModelType".</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AttributionModelType attributionModelType;

    /* The date of the most recent ad click that led to a conversion
     * of this conversion type.
     *                 
     *                 <p>This date is in the <b>advertiser's defined time
     * zone</b>.</p>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MostRecentConversionDate".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String mostRecentConversionDate;

    /* The last time a conversion tag for this conversion type successfully
     * fired and was seen by
     *                 AdWords. This firing event may not have been the result
     * of an attributable conversion
     *                 (ex: because the tag was fired from a browser that
     * did not previously click an ad from the
     *                 appropriate advertiser).
     *                 
     *                 <p>This datetime is in <b>UTC</b>, not the advertiser's
     * time zone.</p>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastReceivedRequestTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String lastReceivedRequestTime;

    /* Indicates that this instance is a subtype of ConversionTracker.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String conversionTrackerType;

    public ConversionTracker() {
    }

    public ConversionTracker(
           java.lang.Long id,
           java.lang.Long originalConversionTypeId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerCategory category,
           java.lang.String googleEventSnippet,
           java.lang.String googleGlobalSiteTag,
           com.google.api.ads.adwords.axis.v201802.cm.DataDrivenModelStatus dataDrivenModelStatus,
           java.lang.Long conversionTypeOwnerCustomerId,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Integer ctcLookbackWindow,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionDeduplicationMode countingType,
           java.lang.Double defaultRevenueValue,
           java.lang.String defaultRevenueCurrencyCode,
           java.lang.Boolean alwaysUseDefaultRevenueValue,
           java.lang.Boolean excludeFromBidding,
           com.google.api.ads.adwords.axis.v201802.cm.AttributionModelType attributionModelType,
           java.lang.String mostRecentConversionDate,
           java.lang.String lastReceivedRequestTime,
           java.lang.String conversionTrackerType) {
           this.id = id;
           this.originalConversionTypeId = originalConversionTypeId;
           this.name = name;
           this.status = status;
           this.category = category;
           this.googleEventSnippet = googleEventSnippet;
           this.googleGlobalSiteTag = googleGlobalSiteTag;
           this.dataDrivenModelStatus = dataDrivenModelStatus;
           this.conversionTypeOwnerCustomerId = conversionTypeOwnerCustomerId;
           this.viewthroughLookbackWindow = viewthroughLookbackWindow;
           this.ctcLookbackWindow = ctcLookbackWindow;
           this.countingType = countingType;
           this.defaultRevenueValue = defaultRevenueValue;
           this.defaultRevenueCurrencyCode = defaultRevenueCurrencyCode;
           this.alwaysUseDefaultRevenueValue = alwaysUseDefaultRevenueValue;
           this.excludeFromBidding = excludeFromBidding;
           this.attributionModelType = attributionModelType;
           this.mostRecentConversionDate = mostRecentConversionDate;
           this.lastReceivedRequestTime = lastReceivedRequestTime;
           this.conversionTrackerType = conversionTrackerType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("alwaysUseDefaultRevenueValue", getAlwaysUseDefaultRevenueValue())
            .add("attributionModelType", getAttributionModelType())
            .add("category", getCategory())
            .add("conversionTrackerType", getConversionTrackerType())
            .add("conversionTypeOwnerCustomerId", getConversionTypeOwnerCustomerId())
            .add("countingType", getCountingType())
            .add("ctcLookbackWindow", getCtcLookbackWindow())
            .add("dataDrivenModelStatus", getDataDrivenModelStatus())
            .add("defaultRevenueCurrencyCode", getDefaultRevenueCurrencyCode())
            .add("defaultRevenueValue", getDefaultRevenueValue())
            .add("excludeFromBidding", getExcludeFromBidding())
            .add("googleEventSnippet", getGoogleEventSnippet())
            .add("googleGlobalSiteTag", getGoogleGlobalSiteTag())
            .add("id", getId())
            .add("lastReceivedRequestTime", getLastReceivedRequestTime())
            .add("mostRecentConversionDate", getMostRecentConversionDate())
            .add("name", getName())
            .add("originalConversionTypeId", getOriginalConversionTypeId())
            .add("status", getStatus())
            .add("viewthroughLookbackWindow", getViewthroughLookbackWindow())
            .toString();
    }

    /**
     * Gets the id value for this ConversionTracker.
     * 
     * @return id   * ID of this conversion tracker, {@code null} when creating a
     * new one.
     *                 
     *                 <p>There are some system-defined conversion trackers
     * that are available
     *                 for all customers to use.  See {@link ConversionTrackerService#mutate}
     * for
     *                 more information about how to modify these types.
     *                 <ul>
     *                 <li>179 - Calls from Ads</li>
     *                 <li>214 - Android Downloads</li>
     *                 <li>239 - Store Visits</li>
     *                 </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ConversionTracker.
     * 
     * @param id   * ID of this conversion tracker, {@code null} when creating a
     * new one.
     *                 
     *                 <p>There are some system-defined conversion trackers
     * that are available
     *                 for all customers to use.  See {@link ConversionTrackerService#mutate}
     * for
     *                 more information about how to modify these types.
     *                 <ul>
     *                 <li>179 - Calls from Ads</li>
     *                 <li>214 - Android Downloads</li>
     *                 <li>239 - Store Visits</li>
     *                 </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the originalConversionTypeId value for this ConversionTracker.
     * 
     * @return originalConversionTypeId   * The ID of the original conversion type on which this ConversionType
     * is based.
     *                 This is used to facilitate a connection between an
     * existing shared conversion type
     *                 (e.g. Calls from ads) and an advertiser-specific conversion
     * type. This may only be specified
     *                 for ADD operations, and can never be modified once
     * a ConversionType is created.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "OriginalConversionTypeId".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API for the following {@link Operator}s:
     * SET.</span>
     */
    public java.lang.Long getOriginalConversionTypeId() {
        return originalConversionTypeId;
    }


    /**
     * Sets the originalConversionTypeId value for this ConversionTracker.
     * 
     * @param originalConversionTypeId   * The ID of the original conversion type on which this ConversionType
     * is based.
     *                 This is used to facilitate a connection between an
     * existing shared conversion type
     *                 (e.g. Calls from ads) and an advertiser-specific conversion
     * type. This may only be specified
     *                 for ADD operations, and can never be modified once
     * a ConversionType is created.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "OriginalConversionTypeId".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API for the following {@link Operator}s:
     * SET.</span>
     */
    public void setOriginalConversionTypeId(java.lang.Long originalConversionTypeId) {
        this.originalConversionTypeId = originalConversionTypeId;
    }


    /**
     * Gets the name value for this ConversionTracker.
     * 
     * @return name   * Name of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConversionTracker.
     * 
     * @param name   * Name of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ConversionTracker.
     * 
     * @return status   * Status of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConversionTracker.
     * 
     * @param status   * Status of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerStatus status) {
        this.status = status;
    }


    /**
     * Gets the category value for this ConversionTracker.
     * 
     * @return category   * The category of conversion that is being tracked.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ConversionTracker.
     * 
     * @param category   * The category of conversion that is being tracked.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCategory(com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerCategory category) {
        this.category = category;
    }


    /**
     * Gets the googleEventSnippet value for this ConversionTracker.
     * 
     * @return googleEventSnippet   * The event snippet that works with the global site tag to track
     * actions that should be counted
     *                 as conversions. Returns an empty string if the conversion
     * tracker does not use snippets.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GoogleEventSnippet".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getGoogleEventSnippet() {
        return googleEventSnippet;
    }


    /**
     * Sets the googleEventSnippet value for this ConversionTracker.
     * 
     * @param googleEventSnippet   * The event snippet that works with the global site tag to track
     * actions that should be counted
     *                 as conversions. Returns an empty string if the conversion
     * tracker does not use snippets.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GoogleEventSnippet".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setGoogleEventSnippet(java.lang.String googleEventSnippet) {
        this.googleEventSnippet = googleEventSnippet;
    }


    /**
     * Gets the googleGlobalSiteTag value for this ConversionTracker.
     * 
     * @return googleGlobalSiteTag   * The global site tag that adds visitors to your basic remarketing
     * lists and sets new cookies on
     *                 your domain, which will store information about the
     * ad click that brought a user to your
     *                 website. Returns an empty string if the conversion
     * tracker does not use snippets.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GoogleGlobalSiteTag".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getGoogleGlobalSiteTag() {
        return googleGlobalSiteTag;
    }


    /**
     * Sets the googleGlobalSiteTag value for this ConversionTracker.
     * 
     * @param googleGlobalSiteTag   * The global site tag that adds visitors to your basic remarketing
     * lists and sets new cookies on
     *                 your domain, which will store information about the
     * ad click that brought a user to your
     *                 website. Returns an empty string if the conversion
     * tracker does not use snippets.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "GoogleGlobalSiteTag".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setGoogleGlobalSiteTag(java.lang.String googleGlobalSiteTag) {
        this.googleGlobalSiteTag = googleGlobalSiteTag;
    }


    /**
     * Gets the dataDrivenModelStatus value for this ConversionTracker.
     * 
     * @return dataDrivenModelStatus   * The status of the data-driven attribution model for the conversion
     * type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DataDrivenModelStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DataDrivenModelStatus getDataDrivenModelStatus() {
        return dataDrivenModelStatus;
    }


    /**
     * Sets the dataDrivenModelStatus value for this ConversionTracker.
     * 
     * @param dataDrivenModelStatus   * The status of the data-driven attribution model for the conversion
     * type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DataDrivenModelStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDataDrivenModelStatus(com.google.api.ads.adwords.axis.v201802.cm.DataDrivenModelStatus dataDrivenModelStatus) {
        this.dataDrivenModelStatus = dataDrivenModelStatus;
    }


    /**
     * Gets the conversionTypeOwnerCustomerId value for this ConversionTracker.
     * 
     * @return conversionTypeOwnerCustomerId   * The external customer ID of the conversion type owner, or 0
     * if this is a system-defined
     *                 conversion type. Only the conversion type owner may
     * edit properties of the conversion type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionTypeOwnerCustomerId".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Long getConversionTypeOwnerCustomerId() {
        return conversionTypeOwnerCustomerId;
    }


    /**
     * Sets the conversionTypeOwnerCustomerId value for this ConversionTracker.
     * 
     * @param conversionTypeOwnerCustomerId   * The external customer ID of the conversion type owner, or 0
     * if this is a system-defined
     *                 conversion type. Only the conversion type owner may
     * edit properties of the conversion type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionTypeOwnerCustomerId".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setConversionTypeOwnerCustomerId(java.lang.Long conversionTypeOwnerCustomerId) {
        this.conversionTypeOwnerCustomerId = conversionTypeOwnerCustomerId;
    }


    /**
     * Gets the viewthroughLookbackWindow value for this ConversionTracker.
     * 
     * @return viewthroughLookbackWindow   * Lookback window for view-through conversions in days. This
     * is the length of
     *                 time in which a conversion without a click can be
     * attributed to an
     *                 impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewthroughLookbackWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint InRange">This field must be between 1 and
     * 30, inclusive.</span>
     */
    public java.lang.Integer getViewthroughLookbackWindow() {
        return viewthroughLookbackWindow;
    }


    /**
     * Sets the viewthroughLookbackWindow value for this ConversionTracker.
     * 
     * @param viewthroughLookbackWindow   * Lookback window for view-through conversions in days. This
     * is the length of
     *                 time in which a conversion without a click can be
     * attributed to an
     *                 impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewthroughLookbackWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint InRange">This field must be between 1 and
     * 30, inclusive.</span>
     */
    public void setViewthroughLookbackWindow(java.lang.Integer viewthroughLookbackWindow) {
        this.viewthroughLookbackWindow = viewthroughLookbackWindow;
    }


    /**
     * Gets the ctcLookbackWindow value for this ConversionTracker.
     * 
     * @return ctcLookbackWindow   * The click-through conversion (ctc) lookback window is the maximum
     * number of days between
     *                 the time a conversion event happens and the previous
     * corresponding ad click.
     *                 
     *                 <p>Conversion events that occur more than this many
     * days after the click are ignored.
     *                 
     *                 <p>This field is only editable for Adwords Conversions
     * and Upload Conversions, but has a system
     *                 defined default for other types of conversions. The
     * allowed range of values for this window
     *                 depends on the type of conversion and may expand,
     * but 1-90 days is the currently allowed
     *                 range.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CtcLookbackWindow".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Integer getCtcLookbackWindow() {
        return ctcLookbackWindow;
    }


    /**
     * Sets the ctcLookbackWindow value for this ConversionTracker.
     * 
     * @param ctcLookbackWindow   * The click-through conversion (ctc) lookback window is the maximum
     * number of days between
     *                 the time a conversion event happens and the previous
     * corresponding ad click.
     *                 
     *                 <p>Conversion events that occur more than this many
     * days after the click are ignored.
     *                 
     *                 <p>This field is only editable for Adwords Conversions
     * and Upload Conversions, but has a system
     *                 defined default for other types of conversions. The
     * allowed range of values for this window
     *                 depends on the type of conversion and may expand,
     * but 1-90 days is the currently allowed
     *                 range.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CtcLookbackWindow".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCtcLookbackWindow(java.lang.Integer ctcLookbackWindow) {
        this.ctcLookbackWindow = ctcLookbackWindow;
    }


    /**
     * Gets the countingType value for this ConversionTracker.
     * 
     * @return countingType   * How to count events for this conversion tracker.
     *                 If countingType is MANY_PER_CLICK, then all conversion
     * events are counted.
     *                 If countingType is ONE_PER_CLICK, then only the first
     * conversion event of this type
     *                 following a given click will be counted.
     *                 More information is available at https://support.google.com/adwords/answer/3438531
     * <span class="constraint Selectable">This field can be selected using
     * the value "CountingType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionDeduplicationMode getCountingType() {
        return countingType;
    }


    /**
     * Sets the countingType value for this ConversionTracker.
     * 
     * @param countingType   * How to count events for this conversion tracker.
     *                 If countingType is MANY_PER_CLICK, then all conversion
     * events are counted.
     *                 If countingType is ONE_PER_CLICK, then only the first
     * conversion event of this type
     *                 following a given click will be counted.
     *                 More information is available at https://support.google.com/adwords/answer/3438531
     * <span class="constraint Selectable">This field can be selected using
     * the value "CountingType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setCountingType(com.google.api.ads.adwords.axis.v201802.cm.ConversionDeduplicationMode countingType) {
        this.countingType = countingType;
    }


    /**
     * Gets the defaultRevenueValue value for this ConversionTracker.
     * 
     * @return defaultRevenueValue   * The value to use when the tag for this conversion tracker sends
     * conversion events without
     *                 values. This value is applied on the server side,
     * and is applicable to all ConversionTracker
     *                 subclasses.
     *                 <p>
     *                 See also the corresponding {@link ConversionTracker#defaultRevenueCurrencyCode},
     * and see
     *                 {@link ConversionTracker#alwaysUseDefaultRevenueValue}
     * for details about when this value is
     *                 used.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DefaultRevenueValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 1000000000000, inclusive.</span>
     */
    public java.lang.Double getDefaultRevenueValue() {
        return defaultRevenueValue;
    }


    /**
     * Sets the defaultRevenueValue value for this ConversionTracker.
     * 
     * @param defaultRevenueValue   * The value to use when the tag for this conversion tracker sends
     * conversion events without
     *                 values. This value is applied on the server side,
     * and is applicable to all ConversionTracker
     *                 subclasses.
     *                 <p>
     *                 See also the corresponding {@link ConversionTracker#defaultRevenueCurrencyCode},
     * and see
     *                 {@link ConversionTracker#alwaysUseDefaultRevenueValue}
     * for details about when this value is
     *                 used.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DefaultRevenueValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 1000000000000, inclusive.</span>
     */
    public void setDefaultRevenueValue(java.lang.Double defaultRevenueValue) {
        this.defaultRevenueValue = defaultRevenueValue;
    }


    /**
     * Gets the defaultRevenueCurrencyCode value for this ConversionTracker.
     * 
     * @return defaultRevenueCurrencyCode   * The currency code to use when the tag for this conversion tracker
     * sends conversion events
     *                 without currency codes. This code is applied on the
     * server side, and is applicable to all
     *                 ConversionTracker subclasses. It must be a valid ISO4217
     * 3-character code, such as USD.
     *                 <p>
     *                 This code is used if the code in the tag is not supplied
     * or is unsupported, or if
     *                 {@link ConversionTracker#alwaysUseDefaultRevenueValue}
     * is set to true. If this default code is
     *                 not set the currency code of the account is used as
     * the default code.
     *                 <p>
     *                 Set the default code to XXX in order to specify that
     * this conversion type does not have units
     *                 of a currency (that is, it is unitless). In this case
     * no currency conversion will occur even if
     *                 a currency code is set in the tag.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DefaultRevenueCurrencyCode".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDefaultRevenueCurrencyCode() {
        return defaultRevenueCurrencyCode;
    }


    /**
     * Sets the defaultRevenueCurrencyCode value for this ConversionTracker.
     * 
     * @param defaultRevenueCurrencyCode   * The currency code to use when the tag for this conversion tracker
     * sends conversion events
     *                 without currency codes. This code is applied on the
     * server side, and is applicable to all
     *                 ConversionTracker subclasses. It must be a valid ISO4217
     * 3-character code, such as USD.
     *                 <p>
     *                 This code is used if the code in the tag is not supplied
     * or is unsupported, or if
     *                 {@link ConversionTracker#alwaysUseDefaultRevenueValue}
     * is set to true. If this default code is
     *                 not set the currency code of the account is used as
     * the default code.
     *                 <p>
     *                 Set the default code to XXX in order to specify that
     * this conversion type does not have units
     *                 of a currency (that is, it is unitless). In this case
     * no currency conversion will occur even if
     *                 a currency code is set in the tag.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DefaultRevenueCurrencyCode".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setDefaultRevenueCurrencyCode(java.lang.String defaultRevenueCurrencyCode) {
        this.defaultRevenueCurrencyCode = defaultRevenueCurrencyCode;
    }


    /**
     * Gets the alwaysUseDefaultRevenueValue value for this ConversionTracker.
     * 
     * @return alwaysUseDefaultRevenueValue   * Controls whether conversion event values and currency codes
     * are taken from the tag snippet or
     *                 from {@link ConversionTracker#defaultRevenueValue}
     * and
     *                 {@link ConversionTracker#defaultRevenueCurrencyCode}.
     * If alwaysUseDefaultRevenueValue is true,
     *                 then conversion events will always use defaultRevenueValue
     * and defaultRevenueCurrencyCode, even
     *                 if the tag has supplied a value and/or code when reporting
     * the conversion event.  If
     *                 alwaysUseDefaultRevenueValue is false, then defaultRevenueValue
     * and defaultRevenueCurrencyCode
     *                 are only used if the tag does not supply a value,
     * or the tag's value is unparseable.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AlwaysUseDefaultRevenueValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getAlwaysUseDefaultRevenueValue() {
        return alwaysUseDefaultRevenueValue;
    }


    /**
     * Sets the alwaysUseDefaultRevenueValue value for this ConversionTracker.
     * 
     * @param alwaysUseDefaultRevenueValue   * Controls whether conversion event values and currency codes
     * are taken from the tag snippet or
     *                 from {@link ConversionTracker#defaultRevenueValue}
     * and
     *                 {@link ConversionTracker#defaultRevenueCurrencyCode}.
     * If alwaysUseDefaultRevenueValue is true,
     *                 then conversion events will always use defaultRevenueValue
     * and defaultRevenueCurrencyCode, even
     *                 if the tag has supplied a value and/or code when reporting
     * the conversion event.  If
     *                 alwaysUseDefaultRevenueValue is false, then defaultRevenueValue
     * and defaultRevenueCurrencyCode
     *                 are only used if the tag does not supply a value,
     * or the tag's value is unparseable.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AlwaysUseDefaultRevenueValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setAlwaysUseDefaultRevenueValue(java.lang.Boolean alwaysUseDefaultRevenueValue) {
        this.alwaysUseDefaultRevenueValue = alwaysUseDefaultRevenueValue;
    }


    /**
     * Gets the excludeFromBidding value for this ConversionTracker.
     * 
     * @return excludeFromBidding   * Whether this conversion tracker should be excluded from the
     * "Conversions" columns in reports.
     *                 <p>
     *                 If true, the conversion tracker will not be counted
     * towards Conversions.
     *                 If false, it will be counted in Conversions. This
     * is the default.</p>
     *                 
     *                 Either way, conversions will still be counted in the
     * "AllConversions" columns in reports.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExcludeFromBidding".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getExcludeFromBidding() {
        return excludeFromBidding;
    }


    /**
     * Sets the excludeFromBidding value for this ConversionTracker.
     * 
     * @param excludeFromBidding   * Whether this conversion tracker should be excluded from the
     * "Conversions" columns in reports.
     *                 <p>
     *                 If true, the conversion tracker will not be counted
     * towards Conversions.
     *                 If false, it will be counted in Conversions. This
     * is the default.</p>
     *                 
     *                 Either way, conversions will still be counted in the
     * "AllConversions" columns in reports.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExcludeFromBidding".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setExcludeFromBidding(java.lang.Boolean excludeFromBidding) {
        this.excludeFromBidding = excludeFromBidding;
    }


    /**
     * Gets the attributionModelType value for this ConversionTracker.
     * 
     * @return attributionModelType   * Attribution models describing how to distribute credit for
     * a particular conversion across
     *                 potentially many prior interactions. See https://support.google.com/adwords/answer/6259715
     * for
     *                 more information about attribution modeling in AdWords.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributionModelType".</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AttributionModelType getAttributionModelType() {
        return attributionModelType;
    }


    /**
     * Sets the attributionModelType value for this ConversionTracker.
     * 
     * @param attributionModelType   * Attribution models describing how to distribute credit for
     * a particular conversion across
     *                 potentially many prior interactions. See https://support.google.com/adwords/answer/6259715
     * for
     *                 more information about attribution modeling in AdWords.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributionModelType".</span>
     */
    public void setAttributionModelType(com.google.api.ads.adwords.axis.v201802.cm.AttributionModelType attributionModelType) {
        this.attributionModelType = attributionModelType;
    }


    /**
     * Gets the mostRecentConversionDate value for this ConversionTracker.
     * 
     * @return mostRecentConversionDate   * The date of the most recent ad click that led to a conversion
     * of this conversion type.
     *                 
     *                 <p>This date is in the <b>advertiser's defined time
     * zone</b>.</p>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MostRecentConversionDate".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getMostRecentConversionDate() {
        return mostRecentConversionDate;
    }


    /**
     * Sets the mostRecentConversionDate value for this ConversionTracker.
     * 
     * @param mostRecentConversionDate   * The date of the most recent ad click that led to a conversion
     * of this conversion type.
     *                 
     *                 <p>This date is in the <b>advertiser's defined time
     * zone</b>.</p>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MostRecentConversionDate".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMostRecentConversionDate(java.lang.String mostRecentConversionDate) {
        this.mostRecentConversionDate = mostRecentConversionDate;
    }


    /**
     * Gets the lastReceivedRequestTime value for this ConversionTracker.
     * 
     * @return lastReceivedRequestTime   * The last time a conversion tag for this conversion type successfully
     * fired and was seen by
     *                 AdWords. This firing event may not have been the result
     * of an attributable conversion
     *                 (ex: because the tag was fired from a browser that
     * did not previously click an ad from the
     *                 appropriate advertiser).
     *                 
     *                 <p>This datetime is in <b>UTC</b>, not the advertiser's
     * time zone.</p>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastReceivedRequestTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getLastReceivedRequestTime() {
        return lastReceivedRequestTime;
    }


    /**
     * Sets the lastReceivedRequestTime value for this ConversionTracker.
     * 
     * @param lastReceivedRequestTime   * The last time a conversion tag for this conversion type successfully
     * fired and was seen by
     *                 AdWords. This firing event may not have been the result
     * of an attributable conversion
     *                 (ex: because the tag was fired from a browser that
     * did not previously click an ad from the
     *                 appropriate advertiser).
     *                 
     *                 <p>This datetime is in <b>UTC</b>, not the advertiser's
     * time zone.</p>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastReceivedRequestTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setLastReceivedRequestTime(java.lang.String lastReceivedRequestTime) {
        this.lastReceivedRequestTime = lastReceivedRequestTime;
    }


    /**
     * Gets the conversionTrackerType value for this ConversionTracker.
     * 
     * @return conversionTrackerType   * Indicates that this instance is a subtype of ConversionTracker.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getConversionTrackerType() {
        return conversionTrackerType;
    }


    /**
     * Sets the conversionTrackerType value for this ConversionTracker.
     * 
     * @param conversionTrackerType   * Indicates that this instance is a subtype of ConversionTracker.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setConversionTrackerType(java.lang.String conversionTrackerType) {
        this.conversionTrackerType = conversionTrackerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionTracker)) return false;
        ConversionTracker other = (ConversionTracker) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.originalConversionTypeId==null && other.getOriginalConversionTypeId()==null) || 
             (this.originalConversionTypeId!=null &&
              this.originalConversionTypeId.equals(other.getOriginalConversionTypeId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.googleEventSnippet==null && other.getGoogleEventSnippet()==null) || 
             (this.googleEventSnippet!=null &&
              this.googleEventSnippet.equals(other.getGoogleEventSnippet()))) &&
            ((this.googleGlobalSiteTag==null && other.getGoogleGlobalSiteTag()==null) || 
             (this.googleGlobalSiteTag!=null &&
              this.googleGlobalSiteTag.equals(other.getGoogleGlobalSiteTag()))) &&
            ((this.dataDrivenModelStatus==null && other.getDataDrivenModelStatus()==null) || 
             (this.dataDrivenModelStatus!=null &&
              this.dataDrivenModelStatus.equals(other.getDataDrivenModelStatus()))) &&
            ((this.conversionTypeOwnerCustomerId==null && other.getConversionTypeOwnerCustomerId()==null) || 
             (this.conversionTypeOwnerCustomerId!=null &&
              this.conversionTypeOwnerCustomerId.equals(other.getConversionTypeOwnerCustomerId()))) &&
            ((this.viewthroughLookbackWindow==null && other.getViewthroughLookbackWindow()==null) || 
             (this.viewthroughLookbackWindow!=null &&
              this.viewthroughLookbackWindow.equals(other.getViewthroughLookbackWindow()))) &&
            ((this.ctcLookbackWindow==null && other.getCtcLookbackWindow()==null) || 
             (this.ctcLookbackWindow!=null &&
              this.ctcLookbackWindow.equals(other.getCtcLookbackWindow()))) &&
            ((this.countingType==null && other.getCountingType()==null) || 
             (this.countingType!=null &&
              this.countingType.equals(other.getCountingType()))) &&
            ((this.defaultRevenueValue==null && other.getDefaultRevenueValue()==null) || 
             (this.defaultRevenueValue!=null &&
              this.defaultRevenueValue.equals(other.getDefaultRevenueValue()))) &&
            ((this.defaultRevenueCurrencyCode==null && other.getDefaultRevenueCurrencyCode()==null) || 
             (this.defaultRevenueCurrencyCode!=null &&
              this.defaultRevenueCurrencyCode.equals(other.getDefaultRevenueCurrencyCode()))) &&
            ((this.alwaysUseDefaultRevenueValue==null && other.getAlwaysUseDefaultRevenueValue()==null) || 
             (this.alwaysUseDefaultRevenueValue!=null &&
              this.alwaysUseDefaultRevenueValue.equals(other.getAlwaysUseDefaultRevenueValue()))) &&
            ((this.excludeFromBidding==null && other.getExcludeFromBidding()==null) || 
             (this.excludeFromBidding!=null &&
              this.excludeFromBidding.equals(other.getExcludeFromBidding()))) &&
            ((this.attributionModelType==null && other.getAttributionModelType()==null) || 
             (this.attributionModelType!=null &&
              this.attributionModelType.equals(other.getAttributionModelType()))) &&
            ((this.mostRecentConversionDate==null && other.getMostRecentConversionDate()==null) || 
             (this.mostRecentConversionDate!=null &&
              this.mostRecentConversionDate.equals(other.getMostRecentConversionDate()))) &&
            ((this.lastReceivedRequestTime==null && other.getLastReceivedRequestTime()==null) || 
             (this.lastReceivedRequestTime!=null &&
              this.lastReceivedRequestTime.equals(other.getLastReceivedRequestTime()))) &&
            ((this.conversionTrackerType==null && other.getConversionTrackerType()==null) || 
             (this.conversionTrackerType!=null &&
              this.conversionTrackerType.equals(other.getConversionTrackerType())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOriginalConversionTypeId() != null) {
            _hashCode += getOriginalConversionTypeId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getGoogleEventSnippet() != null) {
            _hashCode += getGoogleEventSnippet().hashCode();
        }
        if (getGoogleGlobalSiteTag() != null) {
            _hashCode += getGoogleGlobalSiteTag().hashCode();
        }
        if (getDataDrivenModelStatus() != null) {
            _hashCode += getDataDrivenModelStatus().hashCode();
        }
        if (getConversionTypeOwnerCustomerId() != null) {
            _hashCode += getConversionTypeOwnerCustomerId().hashCode();
        }
        if (getViewthroughLookbackWindow() != null) {
            _hashCode += getViewthroughLookbackWindow().hashCode();
        }
        if (getCtcLookbackWindow() != null) {
            _hashCode += getCtcLookbackWindow().hashCode();
        }
        if (getCountingType() != null) {
            _hashCode += getCountingType().hashCode();
        }
        if (getDefaultRevenueValue() != null) {
            _hashCode += getDefaultRevenueValue().hashCode();
        }
        if (getDefaultRevenueCurrencyCode() != null) {
            _hashCode += getDefaultRevenueCurrencyCode().hashCode();
        }
        if (getAlwaysUseDefaultRevenueValue() != null) {
            _hashCode += getAlwaysUseDefaultRevenueValue().hashCode();
        }
        if (getExcludeFromBidding() != null) {
            _hashCode += getExcludeFromBidding().hashCode();
        }
        if (getAttributionModelType() != null) {
            _hashCode += getAttributionModelType().hashCode();
        }
        if (getMostRecentConversionDate() != null) {
            _hashCode += getMostRecentConversionDate().hashCode();
        }
        if (getLastReceivedRequestTime() != null) {
            _hashCode += getLastReceivedRequestTime().hashCode();
        }
        if (getConversionTrackerType() != null) {
            _hashCode += getConversionTrackerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTracker.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionTracker"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalConversionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "originalConversionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionTracker.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionTracker.Category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleEventSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "googleEventSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleGlobalSiteTag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "googleGlobalSiteTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDrivenModelStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "dataDrivenModelStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DataDrivenModelStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeOwnerCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionTypeOwnerCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewthroughLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "viewthroughLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctcLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ctcLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "countingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionDeduplicationMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRevenueValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "defaultRevenueValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRevenueCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "defaultRevenueCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alwaysUseDefaultRevenueValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "alwaysUseDefaultRevenueValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromBidding");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "excludeFromBidding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributionModelType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "attributionModelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AttributionModelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mostRecentConversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mostRecentConversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReceivedRequestTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "lastReceivedRequestTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTrackerType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionTracker.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
