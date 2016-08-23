// Copyright 2016 Google Inc. All Rights Reserved.
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
 * Proposal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201608;


/**
 * A {@code Proposal} represents an agreement between an interactive
 * advertising seller and a buyer that specifies the details of an
 *             advertising campaign.
 */
public class Proposal  implements java.io.Serializable {
    /* The unique ID of the {@code Proposal}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* Flag that specifies whether this {@code Proposal} is for programmatic
     * deals.
     *                 This value is default to {@code false}. */
    private java.lang.Boolean isProgrammatic;

    /* The unique ID of corresponding {@link Order}.
     *                 This will be {@code null} if the {@code Proposal}
     * has not been pushed to DFP.
     *                 This attribute is read-only. */
    private java.lang.Long dfpOrderId;

    /* The name of the {@code Proposal}. This value has a maximum
     * length of 255 characters. This value
     *                 is copied to {@link Order#name} when the proposal
     * turns into an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 This attribute is required. */
    private java.lang.String name;

    /* The option to specify whether the {@code Proposal} uses the
     * Net or Gross pricing model.
     *                 This field is optional and defaults to {@link PricingModel#NET}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic guaranteed, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.PricingModel pricingModel;

    /* The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} are eligible to begin serving.
     * This attribute
     *                 is derived from the proposal line item of the proposal
     * which has the earliest
     *                 {@link ProposalLineItem#startDateTime}. This attribute
     * will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have a start time.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201608.DateTime startDateTime;

    /* The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} stop being served. This attribute
     * is derived from the proposal line item of the proposal which has the
     * latest {@link ProposalLineItem#endDateTime}. This attribute will be
     * null,
     *                 if this proposal has no related line items, or none
     * of its line items have an end time.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201608.DateTime endDateTime;

    /* The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this
     *                 {@code Proposal}. The {@link #startDateTime} and {@link
     * #endDateTime} will be
     *                 returned in this time zone. This attribute is optional
     * and defaults to the
     *                 network's time zone.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private java.lang.String timeZoneId;

    /* The status of the {@code Proposal}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201608.ProposalStatus status;

    /* The archival status of the {@code Proposal}.
     *                 This attribute is read-only. */
    private java.lang.Boolean isArchived;

    /* The advertiser, to which this {@code Proposal} belongs, and
     * a set of
     *                 {@link Contact} objects associated with the advertiser.
     * The
     *                 {@link ProposalCompanyAssociation#type} of this attribute
     * should be
     *                 {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is
     *                 required when the proposal turns into an order, and
     * its
     *                 {@link ProposalCompanyAssociation#companyId} will
     * be copied to
     *                 {@link Order#advertiserId}.
     *                 This attribute becomes readonly once the {@code Proposal}
     * has been pushed. */
    private com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation advertiser;

    /* List of agencies and the set of {@link Contact} objects associated
     * with each agency.
     *                 This attribute is optional. A {@code Proposal} only
     * has at most one
     *                 {@link Company} with {@link ProposalCompanyAssociationType#PRIMARY_AGENCY}
     * type,
     *                 but a {@link Company} can appear more than once with
     * different
     *                 {@link ProposalCompanyAssociationType} values. If
     * primary
     *                 agency exists, its {@link ProposalCompanyAssociation#companyId}
     * will be copied to
     *                 {@link Order#agencyId} when the proposal turns into
     * an order.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation[] agencies;

    /* The probability to close this {@code Proposal}. This percentage
     * value is in
     *                 terms of millipercent, and should be multiples of
     * 10 with the range from 0 to
     *                 100000. This attribute is required and will be used
     * to calculate the revenue
     *                 in reporting.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>not
     * using programmatic guaranteed, using sales management.</li></ul></span> */
    private java.lang.Long probabilityOfClose;

    /* The billing cap of this {@code Proposal}. This attribute is
     * optional and
     *                 default value is {@link BillingCap#CAPPED_CUMULATIVE}.
     * Either this attribute
     *                 or {@link #billingSchedule} will be used, according
     * to the {@link #billingSource}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.BillingCap billingCap;

    /* The billing schedule of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSchedule#PRORATED}.
     * Either this attribute
     *                 or {@link #billingCap} will be used, according to
     * the {@link #billingSource}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.BillingSchedule billingSchedule;

    /* The billing source of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSource#THIRD_PARTY_VOLUME}.
     * If the value is
     *                 {@link BillingSource#CONTRACTED}, the {@link #billingSchedule}
     * will be used for
     *                 billing, otherwise the {@link billingCap} will be
     * used.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.BillingSource billingSource;

    /* The billing base of this {@code Proposal}. For example, for
     * a flat fee
     *                 {@link BillingSource#CONTRACTED contracted} {@link
     * #billingSource}, set this to
     *                 {@link BillingBase#REVENUE}. This attribute is optional
     * and defaults to
     *                 {@link BillingBase#VOLUME}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.BillingBase billingBase;

    /* User defined purchase order number for the {@code Proposal}.
     * This attribute is
     *                 optional and has a maximum length of 63 characters.
     * It is copied to
     *                 {@link Order#poNumber} when the proposal turns into
     * an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private java.lang.String poNumber;

    /* Provides any additional notes that may annotate the {@code
     * Proposal}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private java.lang.String internalNotes;

    /* The total budget allocated for all the proposal line items
     * belonging to the
     *                 {@code Proposal}. It supports precision of 2 decimal
     * places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.Money budget;

    /* The primary salesperson who brokered the transaction with the
     * {@link #advertiser}.
     *                 This attribute is required when the proposal turns
     * into an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private com.google.api.ads.dfp.axis.v201608.SalespersonSplit primarySalesperson;

    /* List of secondary salespeople who are responsible for the sales
     * of
     *                 the {@code Proposal} besides primary salesperson.
     *                 This attribute is optional. A proposal could have
     * 8 secondary salespeople at most,
     *                 but must also have a {@link #primarySalesperson} if
     * any secondary salesperson exists.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.SalespersonSplit[] secondarySalespeople;

    /* List of unique IDs of {@link User} objects who are the sales
     * planners of
     *                 the {@code Proposal}. This attribute is optional.
     * A proposal could have
     *                 8 sales planners at most.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private long[] salesPlannerIds;

    /* The unique ID of the {@link User} who is primary trafficker
     * and is responsible for
     *                 trafficking the {@code Proposal}. This attribute is
     * required when the proposal
     *                 turns into an order, and will be copied to {@link
     * Order#primaryTraffickerId} .
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private java.lang.Long primaryTraffickerId;

    /* List of unique IDs of {@link User} objects who are responsible
     * for trafficking
     *                 the {@code Proposal} besides the primary trafficker.
     * This attribute is optional.
     *                 A proposal could have 8 secondary traffickers at most,
     * but must also have a primary
     *                 trafficker if any secondary trafficker exists.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private long[] secondaryTraffickerIds;

    /* {@link User users} who are the seller's contacts. This attribute
     * is optional.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private long[] sellerContactIds;

    /* The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private long[] appliedTeamIds;

    /* The values of the custom fields associated with the {@code
     * Proposal}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private com.google.api.ads.dfp.axis.v201608.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201608.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201608.AppliedLabel[] effectiveAppliedLabels;

    /* The discount applied to the {@code Proposal} according to the
     * {@link #advertiser}.
     *                 The percentage value is stored as millipercents, and
     * must be multiples of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private java.lang.Long advertiserDiscount;

    /* The proposal discount, which will be applied to all
     *                 {@link ProposalLineItem} objects in the {@code Proposal}.
     * The percentage value is stored as millipercents, and must be multiples
     * of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private java.lang.Long proposalDiscount;

    /* The currency code of this {@code Proposal}. This attribute
     * is optional and defaults to
     *                 network's currency code. */
    private java.lang.String currencyCode;

    /* The exchange rate from the {@link #currencyCode} to the
     *                 {@link Network#currencyCode network's currency}. The
     * value is stored as the exchange rate times
     *                 10,000,000,000 truncated to a long. This attribute
     * is assigned by Google when
     *                 first created or updated with {@link #refreshExchangeRate}
     * set to {@code true}. This attribute
     *                 is ignored if the feature is not enabled.
     *                 This attribute is read-only. */
    private java.lang.Long exchangeRate;

    /* Set this field to {@code true} to update the {@link #exchangeRate}
     * to the latest exchange rate
     *                 when updating the proposal. This attribute is optional
     * and defaults to {@code false}. This
     *                 attribute is ignored if the feature is not enabled. */
    private java.lang.Boolean refreshExchangeRate;

    /* The commission for the primary agency of the {@code Proposal}.
     * The percentage value is stored as millipercents, and must be multiples
     * of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private java.lang.Long agencyCommission;

    /* The value added tax (VAT) applied on final cost of the {@code
     * Proposal}.
     *                 The percentage value is stored as millipercents, and
     * must be multiples of 10
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private java.lang.Long valueAddedTax;

    /* Indicates whether the proposal has been sold, i.e., corresponds
     * to whether the status of an
     *                 {@link Order} is {@link OrderStatus#APPROVED} or {@link
     * OrderStatus#PAUSED}.
     *                 This attribute is read-only. */
    private java.lang.Boolean isSold;

    /* The approval status of the {@code Proposal} for the active
     * user or {@code null} if the active
     *                 user has no action needed.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.ProposalApprovalStatus approvalStatus;

    /* The progress report for the workflow applied on the {@code
     * Proposal}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.WorkflowProgress workflowProgress;

    /* The date and time this {@code Proposal} was last modified.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201608.DateTime lastModifiedDateTime;

    /* The list of resources on this {@code Proposal}. This attribute
     * is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.ProposalLink[] resources;

    /* The actual date and time at which the inventory reserved by
     * the {@link Proposal} will expire.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.DateTime actualExpiryTime;

    /* The expected date and time at which the inventory reserved
     * by the {@link Proposal} will expire.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.DateTime expectedExpiryTime;

    /* A predefined third party ad server, which will be used to fill
     * in reconciliation.
     *                 All predefined third party ad servers can be found
     * in the {@code Third_Party_Company}
     *                 PQL table.
     *                 If actual third party ad server is not in the predefined
     * list, this field is set to 0, and
     *                 actual third party ad server name is set in {@code
     * customThirdPartyAdServerName}.
     *                 Third party ad server is optional. By default, this
     * field is 0, and {@code
     *                 customThirdPartyAdServerName} is null which means
     * no third party ad server is specified.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private java.lang.Integer thirdPartyAdServerId;

    /* When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here.
     *                 When {@code thirdPartyAdServerId} is not 0, this field
     * is ignored.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private java.lang.String customThirdPartyAdServerName;

    /* A list of terms and conditions for this {@code Proposal}. This
     * field is optional.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.ProposalTermsAndConditions[] termsAndConditions;

    /* Details describing the most recent proposal retraction.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.RetractionDetails lastRetractionDetails;

    /* The marketplace info of this proposal if it has a corresponding
     * order in Marketplace.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201608.ProposalMarketplaceInfo marketplaceInfo;

    /* Errors that occurred during offline processes. If any errors
     * occur during an offline process,
     *                 such as reserving inventory, this field will be populated
     * with those errors, otherwise this
     *                 field will be null.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201608.OfflineError[] offlineErrors;

    /* Whether errors occured during offline processes.
     *                 This attribute is read-only. */
    private java.lang.Boolean hasOfflineErrors;

    public Proposal() {
    }

    public Proposal(
           java.lang.Long id,
           java.lang.Boolean isProgrammatic,
           java.lang.Long dfpOrderId,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201608.PricingModel pricingModel,
           com.google.api.ads.dfp.axis.v201608.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201608.DateTime endDateTime,
           java.lang.String timeZoneId,
           com.google.api.ads.dfp.axis.v201608.ProposalStatus status,
           java.lang.Boolean isArchived,
           com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation advertiser,
           com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation[] agencies,
           java.lang.Long probabilityOfClose,
           com.google.api.ads.dfp.axis.v201608.BillingCap billingCap,
           com.google.api.ads.dfp.axis.v201608.BillingSchedule billingSchedule,
           com.google.api.ads.dfp.axis.v201608.BillingSource billingSource,
           com.google.api.ads.dfp.axis.v201608.BillingBase billingBase,
           java.lang.String poNumber,
           java.lang.String internalNotes,
           com.google.api.ads.dfp.axis.v201608.Money budget,
           com.google.api.ads.dfp.axis.v201608.SalespersonSplit primarySalesperson,
           com.google.api.ads.dfp.axis.v201608.SalespersonSplit[] secondarySalespeople,
           long[] salesPlannerIds,
           java.lang.Long primaryTraffickerId,
           long[] secondaryTraffickerIds,
           long[] sellerContactIds,
           long[] appliedTeamIds,
           com.google.api.ads.dfp.axis.v201608.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201608.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201608.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Long advertiserDiscount,
           java.lang.Long proposalDiscount,
           java.lang.String currencyCode,
           java.lang.Long exchangeRate,
           java.lang.Boolean refreshExchangeRate,
           java.lang.Long agencyCommission,
           java.lang.Long valueAddedTax,
           java.lang.Boolean isSold,
           com.google.api.ads.dfp.axis.v201608.ProposalApprovalStatus approvalStatus,
           com.google.api.ads.dfp.axis.v201608.WorkflowProgress workflowProgress,
           com.google.api.ads.dfp.axis.v201608.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201608.ProposalLink[] resources,
           com.google.api.ads.dfp.axis.v201608.DateTime actualExpiryTime,
           com.google.api.ads.dfp.axis.v201608.DateTime expectedExpiryTime,
           java.lang.Integer thirdPartyAdServerId,
           java.lang.String customThirdPartyAdServerName,
           com.google.api.ads.dfp.axis.v201608.ProposalTermsAndConditions[] termsAndConditions,
           com.google.api.ads.dfp.axis.v201608.RetractionDetails lastRetractionDetails,
           com.google.api.ads.dfp.axis.v201608.ProposalMarketplaceInfo marketplaceInfo,
           com.google.api.ads.dfp.axis.v201608.OfflineError[] offlineErrors,
           java.lang.Boolean hasOfflineErrors) {
           this.id = id;
           this.isProgrammatic = isProgrammatic;
           this.dfpOrderId = dfpOrderId;
           this.name = name;
           this.pricingModel = pricingModel;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.timeZoneId = timeZoneId;
           this.status = status;
           this.isArchived = isArchived;
           this.advertiser = advertiser;
           this.agencies = agencies;
           this.probabilityOfClose = probabilityOfClose;
           this.billingCap = billingCap;
           this.billingSchedule = billingSchedule;
           this.billingSource = billingSource;
           this.billingBase = billingBase;
           this.poNumber = poNumber;
           this.internalNotes = internalNotes;
           this.budget = budget;
           this.primarySalesperson = primarySalesperson;
           this.secondarySalespeople = secondarySalespeople;
           this.salesPlannerIds = salesPlannerIds;
           this.primaryTraffickerId = primaryTraffickerId;
           this.secondaryTraffickerIds = secondaryTraffickerIds;
           this.sellerContactIds = sellerContactIds;
           this.appliedTeamIds = appliedTeamIds;
           this.customFieldValues = customFieldValues;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.advertiserDiscount = advertiserDiscount;
           this.proposalDiscount = proposalDiscount;
           this.currencyCode = currencyCode;
           this.exchangeRate = exchangeRate;
           this.refreshExchangeRate = refreshExchangeRate;
           this.agencyCommission = agencyCommission;
           this.valueAddedTax = valueAddedTax;
           this.isSold = isSold;
           this.approvalStatus = approvalStatus;
           this.workflowProgress = workflowProgress;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.resources = resources;
           this.actualExpiryTime = actualExpiryTime;
           this.expectedExpiryTime = expectedExpiryTime;
           this.thirdPartyAdServerId = thirdPartyAdServerId;
           this.customThirdPartyAdServerName = customThirdPartyAdServerName;
           this.termsAndConditions = termsAndConditions;
           this.lastRetractionDetails = lastRetractionDetails;
           this.marketplaceInfo = marketplaceInfo;
           this.offlineErrors = offlineErrors;
           this.hasOfflineErrors = hasOfflineErrors;
    }


    /**
     * Gets the id value for this Proposal.
     * 
     * @return id   * The unique ID of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Proposal.
     * 
     * @param id   * The unique ID of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isProgrammatic value for this Proposal.
     * 
     * @return isProgrammatic   * Flag that specifies whether this {@code Proposal} is for programmatic
     * deals.
     *                 This value is default to {@code false}.
     */
    public java.lang.Boolean getIsProgrammatic() {
        return isProgrammatic;
    }


    /**
     * Sets the isProgrammatic value for this Proposal.
     * 
     * @param isProgrammatic   * Flag that specifies whether this {@code Proposal} is for programmatic
     * deals.
     *                 This value is default to {@code false}.
     */
    public void setIsProgrammatic(java.lang.Boolean isProgrammatic) {
        this.isProgrammatic = isProgrammatic;
    }


    /**
     * Gets the dfpOrderId value for this Proposal.
     * 
     * @return dfpOrderId   * The unique ID of corresponding {@link Order}.
     *                 This will be {@code null} if the {@code Proposal}
     * has not been pushed to DFP.
     *                 This attribute is read-only.
     */
    public java.lang.Long getDfpOrderId() {
        return dfpOrderId;
    }


    /**
     * Sets the dfpOrderId value for this Proposal.
     * 
     * @param dfpOrderId   * The unique ID of corresponding {@link Order}.
     *                 This will be {@code null} if the {@code Proposal}
     * has not been pushed to DFP.
     *                 This attribute is read-only.
     */
    public void setDfpOrderId(java.lang.Long dfpOrderId) {
        this.dfpOrderId = dfpOrderId;
    }


    /**
     * Gets the name value for this Proposal.
     * 
     * @return name   * The name of the {@code Proposal}. This value has a maximum
     * length of 255 characters. This value
     *                 is copied to {@link Order#name} when the proposal
     * turns into an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 This attribute is required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Proposal.
     * 
     * @param name   * The name of the {@code Proposal}. This value has a maximum
     * length of 255 characters. This value
     *                 is copied to {@link Order#name} when the proposal
     * turns into an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 This attribute is required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pricingModel value for this Proposal.
     * 
     * @return pricingModel   * The option to specify whether the {@code Proposal} uses the
     * Net or Gross pricing model.
     *                 This field is optional and defaults to {@link PricingModel#NET}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic guaranteed, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.PricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this Proposal.
     * 
     * @param pricingModel   * The option to specify whether the {@code Proposal} uses the
     * Net or Gross pricing model.
     *                 This field is optional and defaults to {@link PricingModel#NET}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic guaranteed, using sales management.</li></ul></span>
     */
    public void setPricingModel(com.google.api.ads.dfp.axis.v201608.PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the startDateTime value for this Proposal.
     * 
     * @return startDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} are eligible to begin serving.
     * This attribute
     *                 is derived from the proposal line item of the proposal
     * which has the earliest
     *                 {@link ProposalLineItem#startDateTime}. This attribute
     * will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have a start time.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201608.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Proposal.
     * 
     * @param startDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} are eligible to begin serving.
     * This attribute
     *                 is derived from the proposal line item of the proposal
     * which has the earliest
     *                 {@link ProposalLineItem#startDateTime}. This attribute
     * will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have a start time.
     *                 This attribute is read-only.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201608.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Proposal.
     * 
     * @return endDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} stop being served. This attribute
     * is derived from the proposal line item of the proposal which has the
     * latest {@link ProposalLineItem#endDateTime}. This attribute will be
     * null,
     *                 if this proposal has no related line items, or none
     * of its line items have an end time.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201608.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Proposal.
     * 
     * @param endDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} stop being served. This attribute
     * is derived from the proposal line item of the proposal which has the
     * latest {@link ProposalLineItem#endDateTime}. This attribute will be
     * null,
     *                 if this proposal has no related line items, or none
     * of its line items have an end time.
     *                 This attribute is read-only.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201608.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the timeZoneId value for this Proposal.
     * 
     * @return timeZoneId   * The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this
     *                 {@code Proposal}. The {@link #startDateTime} and {@link
     * #endDateTime} will be
     *                 returned in this time zone. This attribute is optional
     * and defaults to the
     *                 network's time zone.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public java.lang.String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this Proposal.
     * 
     * @param timeZoneId   * The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this
     *                 {@code Proposal}. The {@link #startDateTime} and {@link
     * #endDateTime} will be
     *                 returned in this time zone. This attribute is optional
     * and defaults to the
     *                 network's time zone.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the status value for this Proposal.
     * 
     * @return status   * The status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Proposal.
     * 
     * @param status   * The status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201608.ProposalStatus status) {
        this.status = status;
    }


    /**
     * Gets the isArchived value for this Proposal.
     * 
     * @return isArchived   * The archival status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Proposal.
     * 
     * @param isArchived   * The archival status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the advertiser value for this Proposal.
     * 
     * @return advertiser   * The advertiser, to which this {@code Proposal} belongs, and
     * a set of
     *                 {@link Contact} objects associated with the advertiser.
     * The
     *                 {@link ProposalCompanyAssociation#type} of this attribute
     * should be
     *                 {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is
     *                 required when the proposal turns into an order, and
     * its
     *                 {@link ProposalCompanyAssociation#companyId} will
     * be copied to
     *                 {@link Order#advertiserId}.
     *                 This attribute becomes readonly once the {@code Proposal}
     * has been pushed.
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation getAdvertiser() {
        return advertiser;
    }


    /**
     * Sets the advertiser value for this Proposal.
     * 
     * @param advertiser   * The advertiser, to which this {@code Proposal} belongs, and
     * a set of
     *                 {@link Contact} objects associated with the advertiser.
     * The
     *                 {@link ProposalCompanyAssociation#type} of this attribute
     * should be
     *                 {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is
     *                 required when the proposal turns into an order, and
     * its
     *                 {@link ProposalCompanyAssociation#companyId} will
     * be copied to
     *                 {@link Order#advertiserId}.
     *                 This attribute becomes readonly once the {@code Proposal}
     * has been pushed.
     */
    public void setAdvertiser(com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation advertiser) {
        this.advertiser = advertiser;
    }


    /**
     * Gets the agencies value for this Proposal.
     * 
     * @return agencies   * List of agencies and the set of {@link Contact} objects associated
     * with each agency.
     *                 This attribute is optional. A {@code Proposal} only
     * has at most one
     *                 {@link Company} with {@link ProposalCompanyAssociationType#PRIMARY_AGENCY}
     * type,
     *                 but a {@link Company} can appear more than once with
     * different
     *                 {@link ProposalCompanyAssociationType} values. If
     * primary
     *                 agency exists, its {@link ProposalCompanyAssociation#companyId}
     * will be copied to
     *                 {@link Order#agencyId} when the proposal turns into
     * an order.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation[] getAgencies() {
        return agencies;
    }


    /**
     * Sets the agencies value for this Proposal.
     * 
     * @param agencies   * List of agencies and the set of {@link Contact} objects associated
     * with each agency.
     *                 This attribute is optional. A {@code Proposal} only
     * has at most one
     *                 {@link Company} with {@link ProposalCompanyAssociationType#PRIMARY_AGENCY}
     * type,
     *                 but a {@link Company} can appear more than once with
     * different
     *                 {@link ProposalCompanyAssociationType} values. If
     * primary
     *                 agency exists, its {@link ProposalCompanyAssociation#companyId}
     * will be copied to
     *                 {@link Order#agencyId} when the proposal turns into
     * an order.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setAgencies(com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation[] agencies) {
        this.agencies = agencies;
    }

    public com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation getAgencies(int i) {
        return this.agencies[i];
    }

    public void setAgencies(int i, com.google.api.ads.dfp.axis.v201608.ProposalCompanyAssociation _value) {
        this.agencies[i] = _value;
    }


    /**
     * Gets the probabilityOfClose value for this Proposal.
     * 
     * @return probabilityOfClose   * The probability to close this {@code Proposal}. This percentage
     * value is in
     *                 terms of millipercent, and should be multiples of
     * 10 with the range from 0 to
     *                 100000. This attribute is required and will be used
     * to calculate the revenue
     *                 in reporting.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>not
     * using programmatic guaranteed, using sales management.</li></ul></span>
     */
    public java.lang.Long getProbabilityOfClose() {
        return probabilityOfClose;
    }


    /**
     * Sets the probabilityOfClose value for this Proposal.
     * 
     * @param probabilityOfClose   * The probability to close this {@code Proposal}. This percentage
     * value is in
     *                 terms of millipercent, and should be multiples of
     * 10 with the range from 0 to
     *                 100000. This attribute is required and will be used
     * to calculate the revenue
     *                 in reporting.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>not
     * using programmatic guaranteed, using sales management.</li></ul></span>
     */
    public void setProbabilityOfClose(java.lang.Long probabilityOfClose) {
        this.probabilityOfClose = probabilityOfClose;
    }


    /**
     * Gets the billingCap value for this Proposal.
     * 
     * @return billingCap   * The billing cap of this {@code Proposal}. This attribute is
     * optional and
     *                 default value is {@link BillingCap#CAPPED_CUMULATIVE}.
     * Either this attribute
     *                 or {@link #billingSchedule} will be used, according
     * to the {@link #billingSource}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.BillingCap getBillingCap() {
        return billingCap;
    }


    /**
     * Sets the billingCap value for this Proposal.
     * 
     * @param billingCap   * The billing cap of this {@code Proposal}. This attribute is
     * optional and
     *                 default value is {@link BillingCap#CAPPED_CUMULATIVE}.
     * Either this attribute
     *                 or {@link #billingSchedule} will be used, according
     * to the {@link #billingSource}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setBillingCap(com.google.api.ads.dfp.axis.v201608.BillingCap billingCap) {
        this.billingCap = billingCap;
    }


    /**
     * Gets the billingSchedule value for this Proposal.
     * 
     * @return billingSchedule   * The billing schedule of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSchedule#PRORATED}.
     * Either this attribute
     *                 or {@link #billingCap} will be used, according to
     * the {@link #billingSource}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this Proposal.
     * 
     * @param billingSchedule   * The billing schedule of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSchedule#PRORATED}.
     * Either this attribute
     *                 or {@link #billingCap} will be used, according to
     * the {@link #billingSource}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setBillingSchedule(com.google.api.ads.dfp.axis.v201608.BillingSchedule billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the billingSource value for this Proposal.
     * 
     * @return billingSource   * The billing source of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSource#THIRD_PARTY_VOLUME}.
     * If the value is
     *                 {@link BillingSource#CONTRACTED}, the {@link #billingSchedule}
     * will be used for
     *                 billing, otherwise the {@link billingCap} will be
     * used.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.BillingSource getBillingSource() {
        return billingSource;
    }


    /**
     * Sets the billingSource value for this Proposal.
     * 
     * @param billingSource   * The billing source of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSource#THIRD_PARTY_VOLUME}.
     * If the value is
     *                 {@link BillingSource#CONTRACTED}, the {@link #billingSchedule}
     * will be used for
     *                 billing, otherwise the {@link billingCap} will be
     * used.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setBillingSource(com.google.api.ads.dfp.axis.v201608.BillingSource billingSource) {
        this.billingSource = billingSource;
    }


    /**
     * Gets the billingBase value for this Proposal.
     * 
     * @return billingBase   * The billing base of this {@code Proposal}. For example, for
     * a flat fee
     *                 {@link BillingSource#CONTRACTED contracted} {@link
     * #billingSource}, set this to
     *                 {@link BillingBase#REVENUE}. This attribute is optional
     * and defaults to
     *                 {@link BillingBase#VOLUME}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.BillingBase getBillingBase() {
        return billingBase;
    }


    /**
     * Sets the billingBase value for this Proposal.
     * 
     * @param billingBase   * The billing base of this {@code Proposal}. For example, for
     * a flat fee
     *                 {@link BillingSource#CONTRACTED contracted} {@link
     * #billingSource}, set this to
     *                 {@link BillingBase#REVENUE}. This attribute is optional
     * and defaults to
     *                 {@link BillingBase#VOLUME}.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setBillingBase(com.google.api.ads.dfp.axis.v201608.BillingBase billingBase) {
        this.billingBase = billingBase;
    }


    /**
     * Gets the poNumber value for this Proposal.
     * 
     * @return poNumber   * User defined purchase order number for the {@code Proposal}.
     * This attribute is
     *                 optional and has a maximum length of 63 characters.
     * It is copied to
     *                 {@link Order#poNumber} when the proposal turns into
     * an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public java.lang.String getPoNumber() {
        return poNumber;
    }


    /**
     * Sets the poNumber value for this Proposal.
     * 
     * @param poNumber   * User defined purchase order number for the {@code Proposal}.
     * This attribute is
     *                 optional and has a maximum length of 63 characters.
     * It is copied to
     *                 {@link Order#poNumber} when the proposal turns into
     * an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setPoNumber(java.lang.String poNumber) {
        this.poNumber = poNumber;
    }


    /**
     * Gets the internalNotes value for this Proposal.
     * 
     * @return internalNotes   * Provides any additional notes that may annotate the {@code
     * Proposal}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public java.lang.String getInternalNotes() {
        return internalNotes;
    }


    /**
     * Sets the internalNotes value for this Proposal.
     * 
     * @param internalNotes   * Provides any additional notes that may annotate the {@code
     * Proposal}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setInternalNotes(java.lang.String internalNotes) {
        this.internalNotes = internalNotes;
    }


    /**
     * Gets the budget value for this Proposal.
     * 
     * @return budget   * The total budget allocated for all the proposal line items
     * belonging to the
     *                 {@code Proposal}. It supports precision of 2 decimal
     * places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this Proposal.
     * 
     * @param budget   * The total budget allocated for all the proposal line items
     * belonging to the
     *                 {@code Proposal}. It supports precision of 2 decimal
     * places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setBudget(com.google.api.ads.dfp.axis.v201608.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the primarySalesperson value for this Proposal.
     * 
     * @return primarySalesperson   * The primary salesperson who brokered the transaction with the
     * {@link #advertiser}.
     *                 This attribute is required when the proposal turns
     * into an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public com.google.api.ads.dfp.axis.v201608.SalespersonSplit getPrimarySalesperson() {
        return primarySalesperson;
    }


    /**
     * Sets the primarySalesperson value for this Proposal.
     * 
     * @param primarySalesperson   * The primary salesperson who brokered the transaction with the
     * {@link #advertiser}.
     *                 This attribute is required when the proposal turns
     * into an order.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setPrimarySalesperson(com.google.api.ads.dfp.axis.v201608.SalespersonSplit primarySalesperson) {
        this.primarySalesperson = primarySalesperson;
    }


    /**
     * Gets the secondarySalespeople value for this Proposal.
     * 
     * @return secondarySalespeople   * List of secondary salespeople who are responsible for the sales
     * of
     *                 the {@code Proposal} besides primary salesperson.
     *                 This attribute is optional. A proposal could have
     * 8 secondary salespeople at most,
     *                 but must also have a {@link #primarySalesperson} if
     * any secondary salesperson exists.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.SalespersonSplit[] getSecondarySalespeople() {
        return secondarySalespeople;
    }


    /**
     * Sets the secondarySalespeople value for this Proposal.
     * 
     * @param secondarySalespeople   * List of secondary salespeople who are responsible for the sales
     * of
     *                 the {@code Proposal} besides primary salesperson.
     *                 This attribute is optional. A proposal could have
     * 8 secondary salespeople at most,
     *                 but must also have a {@link #primarySalesperson} if
     * any secondary salesperson exists.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setSecondarySalespeople(com.google.api.ads.dfp.axis.v201608.SalespersonSplit[] secondarySalespeople) {
        this.secondarySalespeople = secondarySalespeople;
    }

    public com.google.api.ads.dfp.axis.v201608.SalespersonSplit getSecondarySalespeople(int i) {
        return this.secondarySalespeople[i];
    }

    public void setSecondarySalespeople(int i, com.google.api.ads.dfp.axis.v201608.SalespersonSplit _value) {
        this.secondarySalespeople[i] = _value;
    }


    /**
     * Gets the salesPlannerIds value for this Proposal.
     * 
     * @return salesPlannerIds   * List of unique IDs of {@link User} objects who are the sales
     * planners of
     *                 the {@code Proposal}. This attribute is optional.
     * A proposal could have
     *                 8 sales planners at most.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public long[] getSalesPlannerIds() {
        return salesPlannerIds;
    }


    /**
     * Sets the salesPlannerIds value for this Proposal.
     * 
     * @param salesPlannerIds   * List of unique IDs of {@link User} objects who are the sales
     * planners of
     *                 the {@code Proposal}. This attribute is optional.
     * A proposal could have
     *                 8 sales planners at most.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setSalesPlannerIds(long[] salesPlannerIds) {
        this.salesPlannerIds = salesPlannerIds;
    }

    public long getSalesPlannerIds(int i) {
        return this.salesPlannerIds[i];
    }

    public void setSalesPlannerIds(int i, long _value) {
        this.salesPlannerIds[i] = _value;
    }


    /**
     * Gets the primaryTraffickerId value for this Proposal.
     * 
     * @return primaryTraffickerId   * The unique ID of the {@link User} who is primary trafficker
     * and is responsible for
     *                 trafficking the {@code Proposal}. This attribute is
     * required when the proposal
     *                 turns into an order, and will be copied to {@link
     * Order#primaryTraffickerId} .
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public java.lang.Long getPrimaryTraffickerId() {
        return primaryTraffickerId;
    }


    /**
     * Sets the primaryTraffickerId value for this Proposal.
     * 
     * @param primaryTraffickerId   * The unique ID of the {@link User} who is primary trafficker
     * and is responsible for
     *                 trafficking the {@code Proposal}. This attribute is
     * required when the proposal
     *                 turns into an order, and will be copied to {@link
     * Order#primaryTraffickerId} .
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setPrimaryTraffickerId(java.lang.Long primaryTraffickerId) {
        this.primaryTraffickerId = primaryTraffickerId;
    }


    /**
     * Gets the secondaryTraffickerIds value for this Proposal.
     * 
     * @return secondaryTraffickerIds   * List of unique IDs of {@link User} objects who are responsible
     * for trafficking
     *                 the {@code Proposal} besides the primary trafficker.
     * This attribute is optional.
     *                 A proposal could have 8 secondary traffickers at most,
     * but must also have a primary
     *                 trafficker if any secondary trafficker exists.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public long[] getSecondaryTraffickerIds() {
        return secondaryTraffickerIds;
    }


    /**
     * Sets the secondaryTraffickerIds value for this Proposal.
     * 
     * @param secondaryTraffickerIds   * List of unique IDs of {@link User} objects who are responsible
     * for trafficking
     *                 the {@code Proposal} besides the primary trafficker.
     * This attribute is optional.
     *                 A proposal could have 8 secondary traffickers at most,
     * but must also have a primary
     *                 trafficker if any secondary trafficker exists.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setSecondaryTraffickerIds(long[] secondaryTraffickerIds) {
        this.secondaryTraffickerIds = secondaryTraffickerIds;
    }

    public long getSecondaryTraffickerIds(int i) {
        return this.secondaryTraffickerIds[i];
    }

    public void setSecondaryTraffickerIds(int i, long _value) {
        this.secondaryTraffickerIds[i] = _value;
    }


    /**
     * Gets the sellerContactIds value for this Proposal.
     * 
     * @return sellerContactIds   * {@link User users} who are the seller's contacts. This attribute
     * is optional.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public long[] getSellerContactIds() {
        return sellerContactIds;
    }


    /**
     * Sets the sellerContactIds value for this Proposal.
     * 
     * @param sellerContactIds   * {@link User users} who are the seller's contacts. This attribute
     * is optional.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public void setSellerContactIds(long[] sellerContactIds) {
        this.sellerContactIds = sellerContactIds;
    }

    public long getSellerContactIds(int i) {
        return this.sellerContactIds[i];
    }

    public void setSellerContactIds(int i, long _value) {
        this.sellerContactIds[i] = _value;
    }


    /**
     * Gets the appliedTeamIds value for this Proposal.
     * 
     * @return appliedTeamIds   * The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public long[] getAppliedTeamIds() {
        return appliedTeamIds;
    }


    /**
     * Sets the appliedTeamIds value for this Proposal.
     * 
     * @param appliedTeamIds   * The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setAppliedTeamIds(long[] appliedTeamIds) {
        this.appliedTeamIds = appliedTeamIds;
    }

    public long getAppliedTeamIds(int i) {
        return this.appliedTeamIds[i];
    }

    public void setAppliedTeamIds(int i, long _value) {
        this.appliedTeamIds[i] = _value;
    }


    /**
     * Gets the customFieldValues value for this Proposal.
     * 
     * @return customFieldValues   * The values of the custom fields associated with the {@code
     * Proposal}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public com.google.api.ads.dfp.axis.v201608.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this Proposal.
     * 
     * @param customFieldValues   * The values of the custom fields associated with the {@code
     * Proposal}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201608.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201608.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201608.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this Proposal.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201608.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this Proposal.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201608.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201608.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201608.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this Proposal.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201608.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this Proposal.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201608.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201608.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201608.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the advertiserDiscount value for this Proposal.
     * 
     * @return advertiserDiscount   * The discount applied to the {@code Proposal} according to the
     * {@link #advertiser}.
     *                 The percentage value is stored as millipercents, and
     * must be multiples of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public java.lang.Long getAdvertiserDiscount() {
        return advertiserDiscount;
    }


    /**
     * Sets the advertiserDiscount value for this Proposal.
     * 
     * @param advertiserDiscount   * The discount applied to the {@code Proposal} according to the
     * {@link #advertiser}.
     *                 The percentage value is stored as millipercents, and
     * must be multiples of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setAdvertiserDiscount(java.lang.Long advertiserDiscount) {
        this.advertiserDiscount = advertiserDiscount;
    }


    /**
     * Gets the proposalDiscount value for this Proposal.
     * 
     * @return proposalDiscount   * The proposal discount, which will be applied to all
     *                 {@link ProposalLineItem} objects in the {@code Proposal}.
     * The percentage value is stored as millipercents, and must be multiples
     * of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public java.lang.Long getProposalDiscount() {
        return proposalDiscount;
    }


    /**
     * Sets the proposalDiscount value for this Proposal.
     * 
     * @param proposalDiscount   * The proposal discount, which will be applied to all
     *                 {@link ProposalLineItem} objects in the {@code Proposal}.
     * The percentage value is stored as millipercents, and must be multiples
     * of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setProposalDiscount(java.lang.Long proposalDiscount) {
        this.proposalDiscount = proposalDiscount;
    }


    /**
     * Gets the currencyCode value for this Proposal.
     * 
     * @return currencyCode   * The currency code of this {@code Proposal}. This attribute
     * is optional and defaults to
     *                 network's currency code.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Proposal.
     * 
     * @param currencyCode   * The currency code of this {@code Proposal}. This attribute
     * is optional and defaults to
     *                 network's currency code.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the exchangeRate value for this Proposal.
     * 
     * @return exchangeRate   * The exchange rate from the {@link #currencyCode} to the
     *                 {@link Network#currencyCode network's currency}. The
     * value is stored as the exchange rate times
     *                 10,000,000,000 truncated to a long. This attribute
     * is assigned by Google when
     *                 first created or updated with {@link #refreshExchangeRate}
     * set to {@code true}. This attribute
     *                 is ignored if the feature is not enabled.
     *                 This attribute is read-only.
     */
    public java.lang.Long getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Proposal.
     * 
     * @param exchangeRate   * The exchange rate from the {@link #currencyCode} to the
     *                 {@link Network#currencyCode network's currency}. The
     * value is stored as the exchange rate times
     *                 10,000,000,000 truncated to a long. This attribute
     * is assigned by Google when
     *                 first created or updated with {@link #refreshExchangeRate}
     * set to {@code true}. This attribute
     *                 is ignored if the feature is not enabled.
     *                 This attribute is read-only.
     */
    public void setExchangeRate(java.lang.Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the refreshExchangeRate value for this Proposal.
     * 
     * @return refreshExchangeRate   * Set this field to {@code true} to update the {@link #exchangeRate}
     * to the latest exchange rate
     *                 when updating the proposal. This attribute is optional
     * and defaults to {@code false}. This
     *                 attribute is ignored if the feature is not enabled.
     */
    public java.lang.Boolean getRefreshExchangeRate() {
        return refreshExchangeRate;
    }


    /**
     * Sets the refreshExchangeRate value for this Proposal.
     * 
     * @param refreshExchangeRate   * Set this field to {@code true} to update the {@link #exchangeRate}
     * to the latest exchange rate
     *                 when updating the proposal. This attribute is optional
     * and defaults to {@code false}. This
     *                 attribute is ignored if the feature is not enabled.
     */
    public void setRefreshExchangeRate(java.lang.Boolean refreshExchangeRate) {
        this.refreshExchangeRate = refreshExchangeRate;
    }


    /**
     * Gets the agencyCommission value for this Proposal.
     * 
     * @return agencyCommission   * The commission for the primary agency of the {@code Proposal}.
     * The percentage value is stored as millipercents, and must be multiples
     * of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public java.lang.Long getAgencyCommission() {
        return agencyCommission;
    }


    /**
     * Sets the agencyCommission value for this Proposal.
     * 
     * @param agencyCommission   * The commission for the primary agency of the {@code Proposal}.
     * The percentage value is stored as millipercents, and must be multiples
     * of 10
     *                 with the range from 0 to 99990. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setAgencyCommission(java.lang.Long agencyCommission) {
        this.agencyCommission = agencyCommission;
    }


    /**
     * Gets the valueAddedTax value for this Proposal.
     * 
     * @return valueAddedTax   * The value added tax (VAT) applied on final cost of the {@code
     * Proposal}.
     *                 The percentage value is stored as millipercents, and
     * must be multiples of 10
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public java.lang.Long getValueAddedTax() {
        return valueAddedTax;
    }


    /**
     * Sets the valueAddedTax value for this Proposal.
     * 
     * @param valueAddedTax   * The value added tax (VAT) applied on final cost of the {@code
     * Proposal}.
     *                 The percentage value is stored as millipercents, and
     * must be multiples of 10
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setValueAddedTax(java.lang.Long valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }


    /**
     * Gets the isSold value for this Proposal.
     * 
     * @return isSold   * Indicates whether the proposal has been sold, i.e., corresponds
     * to whether the status of an
     *                 {@link Order} is {@link OrderStatus#APPROVED} or {@link
     * OrderStatus#PAUSED}.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsSold() {
        return isSold;
    }


    /**
     * Sets the isSold value for this Proposal.
     * 
     * @param isSold   * Indicates whether the proposal has been sold, i.e., corresponds
     * to whether the status of an
     *                 {@link Order} is {@link OrderStatus#APPROVED} or {@link
     * OrderStatus#PAUSED}.
     *                 This attribute is read-only.
     */
    public void setIsSold(java.lang.Boolean isSold) {
        this.isSold = isSold;
    }


    /**
     * Gets the approvalStatus value for this Proposal.
     * 
     * @return approvalStatus   * The approval status of the {@code Proposal} for the active
     * user or {@code null} if the active
     *                 user has no action needed.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this Proposal.
     * 
     * @param approvalStatus   * The approval status of the {@code Proposal} for the active
     * user or {@code null} if the active
     *                 user has no action needed.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setApprovalStatus(com.google.api.ads.dfp.axis.v201608.ProposalApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the workflowProgress value for this Proposal.
     * 
     * @return workflowProgress   * The progress report for the workflow applied on the {@code
     * Proposal}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.WorkflowProgress getWorkflowProgress() {
        return workflowProgress;
    }


    /**
     * Sets the workflowProgress value for this Proposal.
     * 
     * @param workflowProgress   * The progress report for the workflow applied on the {@code
     * Proposal}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setWorkflowProgress(com.google.api.ads.dfp.axis.v201608.WorkflowProgress workflowProgress) {
        this.workflowProgress = workflowProgress;
    }


    /**
     * Gets the lastModifiedDateTime value for this Proposal.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code Proposal} was last modified.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201608.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Proposal.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code Proposal} was last modified.
     *                 This attribute is read-only.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201608.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the resources value for this Proposal.
     * 
     * @return resources   * The list of resources on this {@code Proposal}. This attribute
     * is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalLink[] getResources() {
        return resources;
    }


    /**
     * Sets the resources value for this Proposal.
     * 
     * @param resources   * The list of resources on this {@code Proposal}. This attribute
     * is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setResources(com.google.api.ads.dfp.axis.v201608.ProposalLink[] resources) {
        this.resources = resources;
    }

    public com.google.api.ads.dfp.axis.v201608.ProposalLink getResources(int i) {
        return this.resources[i];
    }

    public void setResources(int i, com.google.api.ads.dfp.axis.v201608.ProposalLink _value) {
        this.resources[i] = _value;
    }


    /**
     * Gets the actualExpiryTime value for this Proposal.
     * 
     * @return actualExpiryTime   * The actual date and time at which the inventory reserved by
     * the {@link Proposal} will expire.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.DateTime getActualExpiryTime() {
        return actualExpiryTime;
    }


    /**
     * Sets the actualExpiryTime value for this Proposal.
     * 
     * @param actualExpiryTime   * The actual date and time at which the inventory reserved by
     * the {@link Proposal} will expire.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setActualExpiryTime(com.google.api.ads.dfp.axis.v201608.DateTime actualExpiryTime) {
        this.actualExpiryTime = actualExpiryTime;
    }


    /**
     * Gets the expectedExpiryTime value for this Proposal.
     * 
     * @return expectedExpiryTime   * The expected date and time at which the inventory reserved
     * by the {@link Proposal} will expire.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.DateTime getExpectedExpiryTime() {
        return expectedExpiryTime;
    }


    /**
     * Sets the expectedExpiryTime value for this Proposal.
     * 
     * @param expectedExpiryTime   * The expected date and time at which the inventory reserved
     * by the {@link Proposal} will expire.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setExpectedExpiryTime(com.google.api.ads.dfp.axis.v201608.DateTime expectedExpiryTime) {
        this.expectedExpiryTime = expectedExpiryTime;
    }


    /**
     * Gets the thirdPartyAdServerId value for this Proposal.
     * 
     * @return thirdPartyAdServerId   * A predefined third party ad server, which will be used to fill
     * in reconciliation.
     *                 All predefined third party ad servers can be found
     * in the {@code Third_Party_Company}
     *                 PQL table.
     *                 If actual third party ad server is not in the predefined
     * list, this field is set to 0, and
     *                 actual third party ad server name is set in {@code
     * customThirdPartyAdServerName}.
     *                 Third party ad server is optional. By default, this
     * field is 0, and {@code
     *                 customThirdPartyAdServerName} is null which means
     * no third party ad server is specified.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public java.lang.Integer getThirdPartyAdServerId() {
        return thirdPartyAdServerId;
    }


    /**
     * Sets the thirdPartyAdServerId value for this Proposal.
     * 
     * @param thirdPartyAdServerId   * A predefined third party ad server, which will be used to fill
     * in reconciliation.
     *                 All predefined third party ad servers can be found
     * in the {@code Third_Party_Company}
     *                 PQL table.
     *                 If actual third party ad server is not in the predefined
     * list, this field is set to 0, and
     *                 actual third party ad server name is set in {@code
     * customThirdPartyAdServerName}.
     *                 Third party ad server is optional. By default, this
     * field is 0, and {@code
     *                 customThirdPartyAdServerName} is null which means
     * no third party ad server is specified.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setThirdPartyAdServerId(java.lang.Integer thirdPartyAdServerId) {
        this.thirdPartyAdServerId = thirdPartyAdServerId;
    }


    /**
     * Gets the customThirdPartyAdServerName value for this Proposal.
     * 
     * @return customThirdPartyAdServerName   * When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here.
     *                 When {@code thirdPartyAdServerId} is not 0, this field
     * is ignored.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public java.lang.String getCustomThirdPartyAdServerName() {
        return customThirdPartyAdServerName;
    }


    /**
     * Sets the customThirdPartyAdServerName value for this Proposal.
     * 
     * @param customThirdPartyAdServerName   * When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here.
     *                 When {@code thirdPartyAdServerId} is not 0, this field
     * is ignored.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setCustomThirdPartyAdServerName(java.lang.String customThirdPartyAdServerName) {
        this.customThirdPartyAdServerName = customThirdPartyAdServerName;
    }


    /**
     * Gets the termsAndConditions value for this Proposal.
     * 
     * @return termsAndConditions   * A list of terms and conditions for this {@code Proposal}. This
     * field is optional.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalTermsAndConditions[] getTermsAndConditions() {
        return termsAndConditions;
    }


    /**
     * Sets the termsAndConditions value for this Proposal.
     * 
     * @param termsAndConditions   * A list of terms and conditions for this {@code Proposal}. This
     * field is optional.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic guaranteed, using
     * sales management.</li></ul></span>
     */
    public void setTermsAndConditions(com.google.api.ads.dfp.axis.v201608.ProposalTermsAndConditions[] termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public com.google.api.ads.dfp.axis.v201608.ProposalTermsAndConditions getTermsAndConditions(int i) {
        return this.termsAndConditions[i];
    }

    public void setTermsAndConditions(int i, com.google.api.ads.dfp.axis.v201608.ProposalTermsAndConditions _value) {
        this.termsAndConditions[i] = _value;
    }


    /**
     * Gets the lastRetractionDetails value for this Proposal.
     * 
     * @return lastRetractionDetails   * Details describing the most recent proposal retraction.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.RetractionDetails getLastRetractionDetails() {
        return lastRetractionDetails;
    }


    /**
     * Sets the lastRetractionDetails value for this Proposal.
     * 
     * @param lastRetractionDetails   * Details describing the most recent proposal retraction.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setLastRetractionDetails(com.google.api.ads.dfp.axis.v201608.RetractionDetails lastRetractionDetails) {
        this.lastRetractionDetails = lastRetractionDetails;
    }


    /**
     * Gets the marketplaceInfo value for this Proposal.
     * 
     * @return marketplaceInfo   * The marketplace info of this proposal if it has a corresponding
     * order in Marketplace.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201608.ProposalMarketplaceInfo getMarketplaceInfo() {
        return marketplaceInfo;
    }


    /**
     * Sets the marketplaceInfo value for this Proposal.
     * 
     * @param marketplaceInfo   * The marketplace info of this proposal if it has a corresponding
     * order in Marketplace.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public void setMarketplaceInfo(com.google.api.ads.dfp.axis.v201608.ProposalMarketplaceInfo marketplaceInfo) {
        this.marketplaceInfo = marketplaceInfo;
    }


    /**
     * Gets the offlineErrors value for this Proposal.
     * 
     * @return offlineErrors   * Errors that occurred during offline processes. If any errors
     * occur during an offline process,
     *                 such as reserving inventory, this field will be populated
     * with those errors, otherwise this
     *                 field will be null.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201608.OfflineError[] getOfflineErrors() {
        return offlineErrors;
    }


    /**
     * Sets the offlineErrors value for this Proposal.
     * 
     * @param offlineErrors   * Errors that occurred during offline processes. If any errors
     * occur during an offline process,
     *                 such as reserving inventory, this field will be populated
     * with those errors, otherwise this
     *                 field will be null.
     *                 This attribute is read-only.
     */
    public void setOfflineErrors(com.google.api.ads.dfp.axis.v201608.OfflineError[] offlineErrors) {
        this.offlineErrors = offlineErrors;
    }

    public com.google.api.ads.dfp.axis.v201608.OfflineError getOfflineErrors(int i) {
        return this.offlineErrors[i];
    }

    public void setOfflineErrors(int i, com.google.api.ads.dfp.axis.v201608.OfflineError _value) {
        this.offlineErrors[i] = _value;
    }


    /**
     * Gets the hasOfflineErrors value for this Proposal.
     * 
     * @return hasOfflineErrors   * Whether errors occured during offline processes.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getHasOfflineErrors() {
        return hasOfflineErrors;
    }


    /**
     * Sets the hasOfflineErrors value for this Proposal.
     * 
     * @param hasOfflineErrors   * Whether errors occured during offline processes.
     *                 This attribute is read-only.
     */
    public void setHasOfflineErrors(java.lang.Boolean hasOfflineErrors) {
        this.hasOfflineErrors = hasOfflineErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proposal)) return false;
        Proposal other = (Proposal) obj;
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
            ((this.isProgrammatic==null && other.getIsProgrammatic()==null) || 
             (this.isProgrammatic!=null &&
              this.isProgrammatic.equals(other.getIsProgrammatic()))) &&
            ((this.dfpOrderId==null && other.getDfpOrderId()==null) || 
             (this.dfpOrderId!=null &&
              this.dfpOrderId.equals(other.getDfpOrderId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.advertiser==null && other.getAdvertiser()==null) || 
             (this.advertiser!=null &&
              this.advertiser.equals(other.getAdvertiser()))) &&
            ((this.agencies==null && other.getAgencies()==null) || 
             (this.agencies!=null &&
              java.util.Arrays.equals(this.agencies, other.getAgencies()))) &&
            ((this.probabilityOfClose==null && other.getProbabilityOfClose()==null) || 
             (this.probabilityOfClose!=null &&
              this.probabilityOfClose.equals(other.getProbabilityOfClose()))) &&
            ((this.billingCap==null && other.getBillingCap()==null) || 
             (this.billingCap!=null &&
              this.billingCap.equals(other.getBillingCap()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.billingSource==null && other.getBillingSource()==null) || 
             (this.billingSource!=null &&
              this.billingSource.equals(other.getBillingSource()))) &&
            ((this.billingBase==null && other.getBillingBase()==null) || 
             (this.billingBase!=null &&
              this.billingBase.equals(other.getBillingBase()))) &&
            ((this.poNumber==null && other.getPoNumber()==null) || 
             (this.poNumber!=null &&
              this.poNumber.equals(other.getPoNumber()))) &&
            ((this.internalNotes==null && other.getInternalNotes()==null) || 
             (this.internalNotes!=null &&
              this.internalNotes.equals(other.getInternalNotes()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.primarySalesperson==null && other.getPrimarySalesperson()==null) || 
             (this.primarySalesperson!=null &&
              this.primarySalesperson.equals(other.getPrimarySalesperson()))) &&
            ((this.secondarySalespeople==null && other.getSecondarySalespeople()==null) || 
             (this.secondarySalespeople!=null &&
              java.util.Arrays.equals(this.secondarySalespeople, other.getSecondarySalespeople()))) &&
            ((this.salesPlannerIds==null && other.getSalesPlannerIds()==null) || 
             (this.salesPlannerIds!=null &&
              java.util.Arrays.equals(this.salesPlannerIds, other.getSalesPlannerIds()))) &&
            ((this.primaryTraffickerId==null && other.getPrimaryTraffickerId()==null) || 
             (this.primaryTraffickerId!=null &&
              this.primaryTraffickerId.equals(other.getPrimaryTraffickerId()))) &&
            ((this.secondaryTraffickerIds==null && other.getSecondaryTraffickerIds()==null) || 
             (this.secondaryTraffickerIds!=null &&
              java.util.Arrays.equals(this.secondaryTraffickerIds, other.getSecondaryTraffickerIds()))) &&
            ((this.sellerContactIds==null && other.getSellerContactIds()==null) || 
             (this.sellerContactIds!=null &&
              java.util.Arrays.equals(this.sellerContactIds, other.getSellerContactIds()))) &&
            ((this.appliedTeamIds==null && other.getAppliedTeamIds()==null) || 
             (this.appliedTeamIds!=null &&
              java.util.Arrays.equals(this.appliedTeamIds, other.getAppliedTeamIds()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.advertiserDiscount==null && other.getAdvertiserDiscount()==null) || 
             (this.advertiserDiscount!=null &&
              this.advertiserDiscount.equals(other.getAdvertiserDiscount()))) &&
            ((this.proposalDiscount==null && other.getProposalDiscount()==null) || 
             (this.proposalDiscount!=null &&
              this.proposalDiscount.equals(other.getProposalDiscount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.refreshExchangeRate==null && other.getRefreshExchangeRate()==null) || 
             (this.refreshExchangeRate!=null &&
              this.refreshExchangeRate.equals(other.getRefreshExchangeRate()))) &&
            ((this.agencyCommission==null && other.getAgencyCommission()==null) || 
             (this.agencyCommission!=null &&
              this.agencyCommission.equals(other.getAgencyCommission()))) &&
            ((this.valueAddedTax==null && other.getValueAddedTax()==null) || 
             (this.valueAddedTax!=null &&
              this.valueAddedTax.equals(other.getValueAddedTax()))) &&
            ((this.isSold==null && other.getIsSold()==null) || 
             (this.isSold!=null &&
              this.isSold.equals(other.getIsSold()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.workflowProgress==null && other.getWorkflowProgress()==null) || 
             (this.workflowProgress!=null &&
              this.workflowProgress.equals(other.getWorkflowProgress()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.resources==null && other.getResources()==null) || 
             (this.resources!=null &&
              java.util.Arrays.equals(this.resources, other.getResources()))) &&
            ((this.actualExpiryTime==null && other.getActualExpiryTime()==null) || 
             (this.actualExpiryTime!=null &&
              this.actualExpiryTime.equals(other.getActualExpiryTime()))) &&
            ((this.expectedExpiryTime==null && other.getExpectedExpiryTime()==null) || 
             (this.expectedExpiryTime!=null &&
              this.expectedExpiryTime.equals(other.getExpectedExpiryTime()))) &&
            ((this.thirdPartyAdServerId==null && other.getThirdPartyAdServerId()==null) || 
             (this.thirdPartyAdServerId!=null &&
              this.thirdPartyAdServerId.equals(other.getThirdPartyAdServerId()))) &&
            ((this.customThirdPartyAdServerName==null && other.getCustomThirdPartyAdServerName()==null) || 
             (this.customThirdPartyAdServerName!=null &&
              this.customThirdPartyAdServerName.equals(other.getCustomThirdPartyAdServerName()))) &&
            ((this.termsAndConditions==null && other.getTermsAndConditions()==null) || 
             (this.termsAndConditions!=null &&
              java.util.Arrays.equals(this.termsAndConditions, other.getTermsAndConditions()))) &&
            ((this.lastRetractionDetails==null && other.getLastRetractionDetails()==null) || 
             (this.lastRetractionDetails!=null &&
              this.lastRetractionDetails.equals(other.getLastRetractionDetails()))) &&
            ((this.marketplaceInfo==null && other.getMarketplaceInfo()==null) || 
             (this.marketplaceInfo!=null &&
              this.marketplaceInfo.equals(other.getMarketplaceInfo()))) &&
            ((this.offlineErrors==null && other.getOfflineErrors()==null) || 
             (this.offlineErrors!=null &&
              java.util.Arrays.equals(this.offlineErrors, other.getOfflineErrors()))) &&
            ((this.hasOfflineErrors==null && other.getHasOfflineErrors()==null) || 
             (this.hasOfflineErrors!=null &&
              this.hasOfflineErrors.equals(other.getHasOfflineErrors())));
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
        if (getIsProgrammatic() != null) {
            _hashCode += getIsProgrammatic().hashCode();
        }
        if (getDfpOrderId() != null) {
            _hashCode += getDfpOrderId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getAdvertiser() != null) {
            _hashCode += getAdvertiser().hashCode();
        }
        if (getAgencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProbabilityOfClose() != null) {
            _hashCode += getProbabilityOfClose().hashCode();
        }
        if (getBillingCap() != null) {
            _hashCode += getBillingCap().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getBillingSource() != null) {
            _hashCode += getBillingSource().hashCode();
        }
        if (getBillingBase() != null) {
            _hashCode += getBillingBase().hashCode();
        }
        if (getPoNumber() != null) {
            _hashCode += getPoNumber().hashCode();
        }
        if (getInternalNotes() != null) {
            _hashCode += getInternalNotes().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getPrimarySalesperson() != null) {
            _hashCode += getPrimarySalesperson().hashCode();
        }
        if (getSecondarySalespeople() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondarySalespeople());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondarySalespeople(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesPlannerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesPlannerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesPlannerIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryTraffickerId() != null) {
            _hashCode += getPrimaryTraffickerId().hashCode();
        }
        if (getSecondaryTraffickerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryTraffickerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryTraffickerIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellerContactIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellerContactIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellerContactIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdvertiserDiscount() != null) {
            _hashCode += getAdvertiserDiscount().hashCode();
        }
        if (getProposalDiscount() != null) {
            _hashCode += getProposalDiscount().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getRefreshExchangeRate() != null) {
            _hashCode += getRefreshExchangeRate().hashCode();
        }
        if (getAgencyCommission() != null) {
            _hashCode += getAgencyCommission().hashCode();
        }
        if (getValueAddedTax() != null) {
            _hashCode += getValueAddedTax().hashCode();
        }
        if (getIsSold() != null) {
            _hashCode += getIsSold().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getWorkflowProgress() != null) {
            _hashCode += getWorkflowProgress().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualExpiryTime() != null) {
            _hashCode += getActualExpiryTime().hashCode();
        }
        if (getExpectedExpiryTime() != null) {
            _hashCode += getExpectedExpiryTime().hashCode();
        }
        if (getThirdPartyAdServerId() != null) {
            _hashCode += getThirdPartyAdServerId().hashCode();
        }
        if (getCustomThirdPartyAdServerName() != null) {
            _hashCode += getCustomThirdPartyAdServerName().hashCode();
        }
        if (getTermsAndConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTermsAndConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTermsAndConditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastRetractionDetails() != null) {
            _hashCode += getLastRetractionDetails().hashCode();
        }
        if (getMarketplaceInfo() != null) {
            _hashCode += getMarketplaceInfo().hashCode();
        }
        if (getOfflineErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfflineErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfflineErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasOfflineErrors() != null) {
            _hashCode += getHasOfflineErrors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proposal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "Proposal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProgrammatic");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "isProgrammatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "dfpOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "pricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "PricingModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "timeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "advertiser"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalCompanyAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "agencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalCompanyAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probabilityOfClose");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "probabilityOfClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "billingCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "BillingCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "BillingSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "billingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "BillingSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingBase");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "billingBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "BillingBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "poNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "internalNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySalesperson");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "primarySalesperson"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "SalespersonSplit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySalespeople");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "secondarySalespeople"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "SalespersonSplit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesPlannerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "salesPlannerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryTraffickerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "primaryTraffickerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryTraffickerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "secondaryTraffickerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerContactIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "sellerContactIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "appliedTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "advertiserDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "proposalDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "refreshExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "agencyCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueAddedTax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "valueAddedTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "isSold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "workflowProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "WorkflowProgress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resources");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "resources"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualExpiryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "actualExpiryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedExpiryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "expectedExpiryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAdServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "thirdPartyAdServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customThirdPartyAdServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "customThirdPartyAdServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "termsAndConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalTermsAndConditions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRetractionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "lastRetractionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "RetractionDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "marketplaceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "ProposalMarketplaceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "offlineErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "OfflineError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOfflineErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201608", "hasOfflineErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
