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
 * ApiErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * Interface that has a reason return an associated service error.
 */
public class ApiErrorReason  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201601.cm.AdCustomizerErrorReason adCustomizerErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AdErrorReason adErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AdExtensionErrorReason adExtensionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AdGroupAdErrorReason adGroupAdErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionErrorReason adGroupCriterionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AdGroupServiceErrorReason adGroupServiceErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AdxErrorReason adxErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AuthenticationErrorReason authenticationErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.AuthorizationErrorReason authorizationErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.BetaErrorReason betaErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorReason biddingErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorsReason biddingErrorsReason;

    private com.google.api.ads.adwords.axis.v201601.cm.BiddingTransitionErrorReason biddingTransitionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.BudgetErrorReason budgetErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.BulkMutateJobErrorReason bulkMutateJobErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.CampaignAdExtensionErrorReason campaignAdExtensionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.CampaignCriterionErrorReason campaignCriterionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.CampaignErrorReason campaignErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.ClientTermsErrorReason clientTermsErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.CollectionSizeErrorReason collectionSizeErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.CriterionErrorReason criterionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.DatabaseErrorReason databaseErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.DateErrorReason dateErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.DateRangeErrorReason dateRangeErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.DistinctErrorReason distinctErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.EntityAccessDeniedReason entityAccessDeniedReason;

    private com.google.api.ads.adwords.axis.v201601.cm.EntityCountLimitExceededReason entityCountLimitExceededReason;

    private com.google.api.ads.adwords.axis.v201601.cm.EntityNotFoundReason entityNotFoundReason;

    private com.google.api.ads.adwords.axis.v201601.cm.ExperimentErrorReason experimentErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.FeedAttributeReferenceErrorReason feedAttributeReferenceErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.FeedItemErrorReason feedItemErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.ForwardCompatibilityErrorReason forwardCompatibilityErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.FunctionErrorReason functionErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.FunctionParsingErrorReason functionParsingErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.IdErrorReason idErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.ImageErrorReason imageErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.InternalApiErrorReason internalApiErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.JobErrorReason jobErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.MediaBundleErrorReason mediaBundleErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.MediaErrorReason mediaErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.MultiplierErrorReason multiplierErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.NewEntityCreationErrorReason newEntityCreationErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.NotEmptyErrorReason notEmptyErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.NullErrorReason nullErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.OperationAccessDeniedReason operationAccessDeniedReason;

    private com.google.api.ads.adwords.axis.v201601.cm.OperatorErrorReason operatorErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.PagingErrorReason pagingErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.PolicyViolationErrorReason policyViolationErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.QueryErrorReason queryErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.QuotaCheckErrorReason quotaCheckErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.RangeErrorReason rangeErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.RateExceededErrorReason rateExceededErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.ReadOnlyErrorReason readOnlyErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.RegionCodeErrorReason regionCodeErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.RejectedErrorReason rejectedErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.RequestErrorReason requestErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.RequiredErrorReason requiredErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.SelectorErrorReason selectorErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.SettingErrorReason settingErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.SizeLimitErrorReason sizeLimitErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.StatsQueryErrorReason statsQueryErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.StringFormatErrorReason stringFormatErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.StringLengthErrorReason stringLengthErrorReason;

    private com.google.api.ads.adwords.axis.v201601.cm.UrlErrorReason urlErrorReason;

    public ApiErrorReason() {
    }

    public ApiErrorReason(
           com.google.api.ads.adwords.axis.v201601.cm.AdCustomizerErrorReason adCustomizerErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AdErrorReason adErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AdExtensionErrorReason adExtensionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AdGroupAdErrorReason adGroupAdErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionErrorReason adGroupCriterionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AdGroupServiceErrorReason adGroupServiceErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AdxErrorReason adxErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AuthenticationErrorReason authenticationErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.AuthorizationErrorReason authorizationErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.BetaErrorReason betaErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorReason biddingErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorsReason biddingErrorsReason,
           com.google.api.ads.adwords.axis.v201601.cm.BiddingTransitionErrorReason biddingTransitionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.BudgetErrorReason budgetErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.BulkMutateJobErrorReason bulkMutateJobErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.CampaignAdExtensionErrorReason campaignAdExtensionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.CampaignCriterionErrorReason campaignCriterionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.CampaignErrorReason campaignErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.ClientTermsErrorReason clientTermsErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.CollectionSizeErrorReason collectionSizeErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.CriterionErrorReason criterionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.DatabaseErrorReason databaseErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.DateErrorReason dateErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.DateRangeErrorReason dateRangeErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.DistinctErrorReason distinctErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.EntityAccessDeniedReason entityAccessDeniedReason,
           com.google.api.ads.adwords.axis.v201601.cm.EntityCountLimitExceededReason entityCountLimitExceededReason,
           com.google.api.ads.adwords.axis.v201601.cm.EntityNotFoundReason entityNotFoundReason,
           com.google.api.ads.adwords.axis.v201601.cm.ExperimentErrorReason experimentErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.FeedAttributeReferenceErrorReason feedAttributeReferenceErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemErrorReason feedItemErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.ForwardCompatibilityErrorReason forwardCompatibilityErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.FunctionErrorReason functionErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.FunctionParsingErrorReason functionParsingErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.IdErrorReason idErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.ImageErrorReason imageErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.InternalApiErrorReason internalApiErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.JobErrorReason jobErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.MediaBundleErrorReason mediaBundleErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.MediaErrorReason mediaErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.MultiplierErrorReason multiplierErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.NewEntityCreationErrorReason newEntityCreationErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.NotEmptyErrorReason notEmptyErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.NullErrorReason nullErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.OperationAccessDeniedReason operationAccessDeniedReason,
           com.google.api.ads.adwords.axis.v201601.cm.OperatorErrorReason operatorErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.PagingErrorReason pagingErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.PolicyViolationErrorReason policyViolationErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.QueryErrorReason queryErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.QuotaCheckErrorReason quotaCheckErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.RangeErrorReason rangeErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.RateExceededErrorReason rateExceededErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.ReadOnlyErrorReason readOnlyErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.RegionCodeErrorReason regionCodeErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.RejectedErrorReason rejectedErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.RequestErrorReason requestErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.RequiredErrorReason requiredErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.SelectorErrorReason selectorErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.SettingErrorReason settingErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.SizeLimitErrorReason sizeLimitErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.StatsQueryErrorReason statsQueryErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.StringFormatErrorReason stringFormatErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.StringLengthErrorReason stringLengthErrorReason,
           com.google.api.ads.adwords.axis.v201601.cm.UrlErrorReason urlErrorReason) {
           this.adCustomizerErrorReason = adCustomizerErrorReason;
           this.adErrorReason = adErrorReason;
           this.adExtensionErrorReason = adExtensionErrorReason;
           this.adGroupAdErrorReason = adGroupAdErrorReason;
           this.adGroupCriterionErrorReason = adGroupCriterionErrorReason;
           this.adGroupServiceErrorReason = adGroupServiceErrorReason;
           this.adxErrorReason = adxErrorReason;
           this.authenticationErrorReason = authenticationErrorReason;
           this.authorizationErrorReason = authorizationErrorReason;
           this.betaErrorReason = betaErrorReason;
           this.biddingErrorReason = biddingErrorReason;
           this.biddingErrorsReason = biddingErrorsReason;
           this.biddingTransitionErrorReason = biddingTransitionErrorReason;
           this.budgetErrorReason = budgetErrorReason;
           this.bulkMutateJobErrorReason = bulkMutateJobErrorReason;
           this.campaignAdExtensionErrorReason = campaignAdExtensionErrorReason;
           this.campaignCriterionErrorReason = campaignCriterionErrorReason;
           this.campaignErrorReason = campaignErrorReason;
           this.clientTermsErrorReason = clientTermsErrorReason;
           this.collectionSizeErrorReason = collectionSizeErrorReason;
           this.criterionErrorReason = criterionErrorReason;
           this.databaseErrorReason = databaseErrorReason;
           this.dateErrorReason = dateErrorReason;
           this.dateRangeErrorReason = dateRangeErrorReason;
           this.distinctErrorReason = distinctErrorReason;
           this.entityAccessDeniedReason = entityAccessDeniedReason;
           this.entityCountLimitExceededReason = entityCountLimitExceededReason;
           this.entityNotFoundReason = entityNotFoundReason;
           this.experimentErrorReason = experimentErrorReason;
           this.feedAttributeReferenceErrorReason = feedAttributeReferenceErrorReason;
           this.feedItemErrorReason = feedItemErrorReason;
           this.forwardCompatibilityErrorReason = forwardCompatibilityErrorReason;
           this.functionErrorReason = functionErrorReason;
           this.functionParsingErrorReason = functionParsingErrorReason;
           this.idErrorReason = idErrorReason;
           this.imageErrorReason = imageErrorReason;
           this.internalApiErrorReason = internalApiErrorReason;
           this.jobErrorReason = jobErrorReason;
           this.mediaBundleErrorReason = mediaBundleErrorReason;
           this.mediaErrorReason = mediaErrorReason;
           this.multiplierErrorReason = multiplierErrorReason;
           this.newEntityCreationErrorReason = newEntityCreationErrorReason;
           this.notEmptyErrorReason = notEmptyErrorReason;
           this.nullErrorReason = nullErrorReason;
           this.operationAccessDeniedReason = operationAccessDeniedReason;
           this.operatorErrorReason = operatorErrorReason;
           this.pagingErrorReason = pagingErrorReason;
           this.policyViolationErrorReason = policyViolationErrorReason;
           this.queryErrorReason = queryErrorReason;
           this.quotaCheckErrorReason = quotaCheckErrorReason;
           this.rangeErrorReason = rangeErrorReason;
           this.rateExceededErrorReason = rateExceededErrorReason;
           this.readOnlyErrorReason = readOnlyErrorReason;
           this.regionCodeErrorReason = regionCodeErrorReason;
           this.rejectedErrorReason = rejectedErrorReason;
           this.requestErrorReason = requestErrorReason;
           this.requiredErrorReason = requiredErrorReason;
           this.selectorErrorReason = selectorErrorReason;
           this.settingErrorReason = settingErrorReason;
           this.sizeLimitErrorReason = sizeLimitErrorReason;
           this.statsQueryErrorReason = statsQueryErrorReason;
           this.stringFormatErrorReason = stringFormatErrorReason;
           this.stringLengthErrorReason = stringLengthErrorReason;
           this.urlErrorReason = urlErrorReason;
    }


    /**
     * Gets the adCustomizerErrorReason value for this ApiErrorReason.
     * 
     * @return adCustomizerErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdCustomizerErrorReason getAdCustomizerErrorReason() {
        return adCustomizerErrorReason;
    }


    /**
     * Sets the adCustomizerErrorReason value for this ApiErrorReason.
     * 
     * @param adCustomizerErrorReason
     */
    public void setAdCustomizerErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdCustomizerErrorReason adCustomizerErrorReason) {
        this.adCustomizerErrorReason = adCustomizerErrorReason;
    }


    /**
     * Gets the adErrorReason value for this ApiErrorReason.
     * 
     * @return adErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdErrorReason getAdErrorReason() {
        return adErrorReason;
    }


    /**
     * Sets the adErrorReason value for this ApiErrorReason.
     * 
     * @param adErrorReason
     */
    public void setAdErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdErrorReason adErrorReason) {
        this.adErrorReason = adErrorReason;
    }


    /**
     * Gets the adExtensionErrorReason value for this ApiErrorReason.
     * 
     * @return adExtensionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdExtensionErrorReason getAdExtensionErrorReason() {
        return adExtensionErrorReason;
    }


    /**
     * Sets the adExtensionErrorReason value for this ApiErrorReason.
     * 
     * @param adExtensionErrorReason
     */
    public void setAdExtensionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdExtensionErrorReason adExtensionErrorReason) {
        this.adExtensionErrorReason = adExtensionErrorReason;
    }


    /**
     * Gets the adGroupAdErrorReason value for this ApiErrorReason.
     * 
     * @return adGroupAdErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdGroupAdErrorReason getAdGroupAdErrorReason() {
        return adGroupAdErrorReason;
    }


    /**
     * Sets the adGroupAdErrorReason value for this ApiErrorReason.
     * 
     * @param adGroupAdErrorReason
     */
    public void setAdGroupAdErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdGroupAdErrorReason adGroupAdErrorReason) {
        this.adGroupAdErrorReason = adGroupAdErrorReason;
    }


    /**
     * Gets the adGroupCriterionErrorReason value for this ApiErrorReason.
     * 
     * @return adGroupCriterionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionErrorReason getAdGroupCriterionErrorReason() {
        return adGroupCriterionErrorReason;
    }


    /**
     * Sets the adGroupCriterionErrorReason value for this ApiErrorReason.
     * 
     * @param adGroupCriterionErrorReason
     */
    public void setAdGroupCriterionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionErrorReason adGroupCriterionErrorReason) {
        this.adGroupCriterionErrorReason = adGroupCriterionErrorReason;
    }


    /**
     * Gets the adGroupServiceErrorReason value for this ApiErrorReason.
     * 
     * @return adGroupServiceErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdGroupServiceErrorReason getAdGroupServiceErrorReason() {
        return adGroupServiceErrorReason;
    }


    /**
     * Sets the adGroupServiceErrorReason value for this ApiErrorReason.
     * 
     * @param adGroupServiceErrorReason
     */
    public void setAdGroupServiceErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdGroupServiceErrorReason adGroupServiceErrorReason) {
        this.adGroupServiceErrorReason = adGroupServiceErrorReason;
    }


    /**
     * Gets the adxErrorReason value for this ApiErrorReason.
     * 
     * @return adxErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdxErrorReason getAdxErrorReason() {
        return adxErrorReason;
    }


    /**
     * Sets the adxErrorReason value for this ApiErrorReason.
     * 
     * @param adxErrorReason
     */
    public void setAdxErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AdxErrorReason adxErrorReason) {
        this.adxErrorReason = adxErrorReason;
    }


    /**
     * Gets the authenticationErrorReason value for this ApiErrorReason.
     * 
     * @return authenticationErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AuthenticationErrorReason getAuthenticationErrorReason() {
        return authenticationErrorReason;
    }


    /**
     * Sets the authenticationErrorReason value for this ApiErrorReason.
     * 
     * @param authenticationErrorReason
     */
    public void setAuthenticationErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AuthenticationErrorReason authenticationErrorReason) {
        this.authenticationErrorReason = authenticationErrorReason;
    }


    /**
     * Gets the authorizationErrorReason value for this ApiErrorReason.
     * 
     * @return authorizationErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AuthorizationErrorReason getAuthorizationErrorReason() {
        return authorizationErrorReason;
    }


    /**
     * Sets the authorizationErrorReason value for this ApiErrorReason.
     * 
     * @param authorizationErrorReason
     */
    public void setAuthorizationErrorReason(com.google.api.ads.adwords.axis.v201601.cm.AuthorizationErrorReason authorizationErrorReason) {
        this.authorizationErrorReason = authorizationErrorReason;
    }


    /**
     * Gets the betaErrorReason value for this ApiErrorReason.
     * 
     * @return betaErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BetaErrorReason getBetaErrorReason() {
        return betaErrorReason;
    }


    /**
     * Sets the betaErrorReason value for this ApiErrorReason.
     * 
     * @param betaErrorReason
     */
    public void setBetaErrorReason(com.google.api.ads.adwords.axis.v201601.cm.BetaErrorReason betaErrorReason) {
        this.betaErrorReason = betaErrorReason;
    }


    /**
     * Gets the biddingErrorReason value for this ApiErrorReason.
     * 
     * @return biddingErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorReason getBiddingErrorReason() {
        return biddingErrorReason;
    }


    /**
     * Sets the biddingErrorReason value for this ApiErrorReason.
     * 
     * @param biddingErrorReason
     */
    public void setBiddingErrorReason(com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorReason biddingErrorReason) {
        this.biddingErrorReason = biddingErrorReason;
    }


    /**
     * Gets the biddingErrorsReason value for this ApiErrorReason.
     * 
     * @return biddingErrorsReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorsReason getBiddingErrorsReason() {
        return biddingErrorsReason;
    }


    /**
     * Sets the biddingErrorsReason value for this ApiErrorReason.
     * 
     * @param biddingErrorsReason
     */
    public void setBiddingErrorsReason(com.google.api.ads.adwords.axis.v201601.cm.BiddingErrorsReason biddingErrorsReason) {
        this.biddingErrorsReason = biddingErrorsReason;
    }


    /**
     * Gets the biddingTransitionErrorReason value for this ApiErrorReason.
     * 
     * @return biddingTransitionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BiddingTransitionErrorReason getBiddingTransitionErrorReason() {
        return biddingTransitionErrorReason;
    }


    /**
     * Sets the biddingTransitionErrorReason value for this ApiErrorReason.
     * 
     * @param biddingTransitionErrorReason
     */
    public void setBiddingTransitionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.BiddingTransitionErrorReason biddingTransitionErrorReason) {
        this.biddingTransitionErrorReason = biddingTransitionErrorReason;
    }


    /**
     * Gets the budgetErrorReason value for this ApiErrorReason.
     * 
     * @return budgetErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BudgetErrorReason getBudgetErrorReason() {
        return budgetErrorReason;
    }


    /**
     * Sets the budgetErrorReason value for this ApiErrorReason.
     * 
     * @param budgetErrorReason
     */
    public void setBudgetErrorReason(com.google.api.ads.adwords.axis.v201601.cm.BudgetErrorReason budgetErrorReason) {
        this.budgetErrorReason = budgetErrorReason;
    }


    /**
     * Gets the bulkMutateJobErrorReason value for this ApiErrorReason.
     * 
     * @return bulkMutateJobErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.BulkMutateJobErrorReason getBulkMutateJobErrorReason() {
        return bulkMutateJobErrorReason;
    }


    /**
     * Sets the bulkMutateJobErrorReason value for this ApiErrorReason.
     * 
     * @param bulkMutateJobErrorReason
     */
    public void setBulkMutateJobErrorReason(com.google.api.ads.adwords.axis.v201601.cm.BulkMutateJobErrorReason bulkMutateJobErrorReason) {
        this.bulkMutateJobErrorReason = bulkMutateJobErrorReason;
    }


    /**
     * Gets the campaignAdExtensionErrorReason value for this ApiErrorReason.
     * 
     * @return campaignAdExtensionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignAdExtensionErrorReason getCampaignAdExtensionErrorReason() {
        return campaignAdExtensionErrorReason;
    }


    /**
     * Sets the campaignAdExtensionErrorReason value for this ApiErrorReason.
     * 
     * @param campaignAdExtensionErrorReason
     */
    public void setCampaignAdExtensionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.CampaignAdExtensionErrorReason campaignAdExtensionErrorReason) {
        this.campaignAdExtensionErrorReason = campaignAdExtensionErrorReason;
    }


    /**
     * Gets the campaignCriterionErrorReason value for this ApiErrorReason.
     * 
     * @return campaignCriterionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignCriterionErrorReason getCampaignCriterionErrorReason() {
        return campaignCriterionErrorReason;
    }


    /**
     * Sets the campaignCriterionErrorReason value for this ApiErrorReason.
     * 
     * @param campaignCriterionErrorReason
     */
    public void setCampaignCriterionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.CampaignCriterionErrorReason campaignCriterionErrorReason) {
        this.campaignCriterionErrorReason = campaignCriterionErrorReason;
    }


    /**
     * Gets the campaignErrorReason value for this ApiErrorReason.
     * 
     * @return campaignErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignErrorReason getCampaignErrorReason() {
        return campaignErrorReason;
    }


    /**
     * Sets the campaignErrorReason value for this ApiErrorReason.
     * 
     * @param campaignErrorReason
     */
    public void setCampaignErrorReason(com.google.api.ads.adwords.axis.v201601.cm.CampaignErrorReason campaignErrorReason) {
        this.campaignErrorReason = campaignErrorReason;
    }


    /**
     * Gets the clientTermsErrorReason value for this ApiErrorReason.
     * 
     * @return clientTermsErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ClientTermsErrorReason getClientTermsErrorReason() {
        return clientTermsErrorReason;
    }


    /**
     * Sets the clientTermsErrorReason value for this ApiErrorReason.
     * 
     * @param clientTermsErrorReason
     */
    public void setClientTermsErrorReason(com.google.api.ads.adwords.axis.v201601.cm.ClientTermsErrorReason clientTermsErrorReason) {
        this.clientTermsErrorReason = clientTermsErrorReason;
    }


    /**
     * Gets the collectionSizeErrorReason value for this ApiErrorReason.
     * 
     * @return collectionSizeErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CollectionSizeErrorReason getCollectionSizeErrorReason() {
        return collectionSizeErrorReason;
    }


    /**
     * Sets the collectionSizeErrorReason value for this ApiErrorReason.
     * 
     * @param collectionSizeErrorReason
     */
    public void setCollectionSizeErrorReason(com.google.api.ads.adwords.axis.v201601.cm.CollectionSizeErrorReason collectionSizeErrorReason) {
        this.collectionSizeErrorReason = collectionSizeErrorReason;
    }


    /**
     * Gets the criterionErrorReason value for this ApiErrorReason.
     * 
     * @return criterionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CriterionErrorReason getCriterionErrorReason() {
        return criterionErrorReason;
    }


    /**
     * Sets the criterionErrorReason value for this ApiErrorReason.
     * 
     * @param criterionErrorReason
     */
    public void setCriterionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.CriterionErrorReason criterionErrorReason) {
        this.criterionErrorReason = criterionErrorReason;
    }


    /**
     * Gets the databaseErrorReason value for this ApiErrorReason.
     * 
     * @return databaseErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.DatabaseErrorReason getDatabaseErrorReason() {
        return databaseErrorReason;
    }


    /**
     * Sets the databaseErrorReason value for this ApiErrorReason.
     * 
     * @param databaseErrorReason
     */
    public void setDatabaseErrorReason(com.google.api.ads.adwords.axis.v201601.cm.DatabaseErrorReason databaseErrorReason) {
        this.databaseErrorReason = databaseErrorReason;
    }


    /**
     * Gets the dateErrorReason value for this ApiErrorReason.
     * 
     * @return dateErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.DateErrorReason getDateErrorReason() {
        return dateErrorReason;
    }


    /**
     * Sets the dateErrorReason value for this ApiErrorReason.
     * 
     * @param dateErrorReason
     */
    public void setDateErrorReason(com.google.api.ads.adwords.axis.v201601.cm.DateErrorReason dateErrorReason) {
        this.dateErrorReason = dateErrorReason;
    }


    /**
     * Gets the dateRangeErrorReason value for this ApiErrorReason.
     * 
     * @return dateRangeErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.DateRangeErrorReason getDateRangeErrorReason() {
        return dateRangeErrorReason;
    }


    /**
     * Sets the dateRangeErrorReason value for this ApiErrorReason.
     * 
     * @param dateRangeErrorReason
     */
    public void setDateRangeErrorReason(com.google.api.ads.adwords.axis.v201601.cm.DateRangeErrorReason dateRangeErrorReason) {
        this.dateRangeErrorReason = dateRangeErrorReason;
    }


    /**
     * Gets the distinctErrorReason value for this ApiErrorReason.
     * 
     * @return distinctErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.DistinctErrorReason getDistinctErrorReason() {
        return distinctErrorReason;
    }


    /**
     * Sets the distinctErrorReason value for this ApiErrorReason.
     * 
     * @param distinctErrorReason
     */
    public void setDistinctErrorReason(com.google.api.ads.adwords.axis.v201601.cm.DistinctErrorReason distinctErrorReason) {
        this.distinctErrorReason = distinctErrorReason;
    }


    /**
     * Gets the entityAccessDeniedReason value for this ApiErrorReason.
     * 
     * @return entityAccessDeniedReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.EntityAccessDeniedReason getEntityAccessDeniedReason() {
        return entityAccessDeniedReason;
    }


    /**
     * Sets the entityAccessDeniedReason value for this ApiErrorReason.
     * 
     * @param entityAccessDeniedReason
     */
    public void setEntityAccessDeniedReason(com.google.api.ads.adwords.axis.v201601.cm.EntityAccessDeniedReason entityAccessDeniedReason) {
        this.entityAccessDeniedReason = entityAccessDeniedReason;
    }


    /**
     * Gets the entityCountLimitExceededReason value for this ApiErrorReason.
     * 
     * @return entityCountLimitExceededReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.EntityCountLimitExceededReason getEntityCountLimitExceededReason() {
        return entityCountLimitExceededReason;
    }


    /**
     * Sets the entityCountLimitExceededReason value for this ApiErrorReason.
     * 
     * @param entityCountLimitExceededReason
     */
    public void setEntityCountLimitExceededReason(com.google.api.ads.adwords.axis.v201601.cm.EntityCountLimitExceededReason entityCountLimitExceededReason) {
        this.entityCountLimitExceededReason = entityCountLimitExceededReason;
    }


    /**
     * Gets the entityNotFoundReason value for this ApiErrorReason.
     * 
     * @return entityNotFoundReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.EntityNotFoundReason getEntityNotFoundReason() {
        return entityNotFoundReason;
    }


    /**
     * Sets the entityNotFoundReason value for this ApiErrorReason.
     * 
     * @param entityNotFoundReason
     */
    public void setEntityNotFoundReason(com.google.api.ads.adwords.axis.v201601.cm.EntityNotFoundReason entityNotFoundReason) {
        this.entityNotFoundReason = entityNotFoundReason;
    }


    /**
     * Gets the experimentErrorReason value for this ApiErrorReason.
     * 
     * @return experimentErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ExperimentErrorReason getExperimentErrorReason() {
        return experimentErrorReason;
    }


    /**
     * Sets the experimentErrorReason value for this ApiErrorReason.
     * 
     * @param experimentErrorReason
     */
    public void setExperimentErrorReason(com.google.api.ads.adwords.axis.v201601.cm.ExperimentErrorReason experimentErrorReason) {
        this.experimentErrorReason = experimentErrorReason;
    }


    /**
     * Gets the feedAttributeReferenceErrorReason value for this ApiErrorReason.
     * 
     * @return feedAttributeReferenceErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.FeedAttributeReferenceErrorReason getFeedAttributeReferenceErrorReason() {
        return feedAttributeReferenceErrorReason;
    }


    /**
     * Sets the feedAttributeReferenceErrorReason value for this ApiErrorReason.
     * 
     * @param feedAttributeReferenceErrorReason
     */
    public void setFeedAttributeReferenceErrorReason(com.google.api.ads.adwords.axis.v201601.cm.FeedAttributeReferenceErrorReason feedAttributeReferenceErrorReason) {
        this.feedAttributeReferenceErrorReason = feedAttributeReferenceErrorReason;
    }


    /**
     * Gets the feedItemErrorReason value for this ApiErrorReason.
     * 
     * @return feedItemErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.FeedItemErrorReason getFeedItemErrorReason() {
        return feedItemErrorReason;
    }


    /**
     * Sets the feedItemErrorReason value for this ApiErrorReason.
     * 
     * @param feedItemErrorReason
     */
    public void setFeedItemErrorReason(com.google.api.ads.adwords.axis.v201601.cm.FeedItemErrorReason feedItemErrorReason) {
        this.feedItemErrorReason = feedItemErrorReason;
    }


    /**
     * Gets the forwardCompatibilityErrorReason value for this ApiErrorReason.
     * 
     * @return forwardCompatibilityErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ForwardCompatibilityErrorReason getForwardCompatibilityErrorReason() {
        return forwardCompatibilityErrorReason;
    }


    /**
     * Sets the forwardCompatibilityErrorReason value for this ApiErrorReason.
     * 
     * @param forwardCompatibilityErrorReason
     */
    public void setForwardCompatibilityErrorReason(com.google.api.ads.adwords.axis.v201601.cm.ForwardCompatibilityErrorReason forwardCompatibilityErrorReason) {
        this.forwardCompatibilityErrorReason = forwardCompatibilityErrorReason;
    }


    /**
     * Gets the functionErrorReason value for this ApiErrorReason.
     * 
     * @return functionErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.FunctionErrorReason getFunctionErrorReason() {
        return functionErrorReason;
    }


    /**
     * Sets the functionErrorReason value for this ApiErrorReason.
     * 
     * @param functionErrorReason
     */
    public void setFunctionErrorReason(com.google.api.ads.adwords.axis.v201601.cm.FunctionErrorReason functionErrorReason) {
        this.functionErrorReason = functionErrorReason;
    }


    /**
     * Gets the functionParsingErrorReason value for this ApiErrorReason.
     * 
     * @return functionParsingErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.FunctionParsingErrorReason getFunctionParsingErrorReason() {
        return functionParsingErrorReason;
    }


    /**
     * Sets the functionParsingErrorReason value for this ApiErrorReason.
     * 
     * @param functionParsingErrorReason
     */
    public void setFunctionParsingErrorReason(com.google.api.ads.adwords.axis.v201601.cm.FunctionParsingErrorReason functionParsingErrorReason) {
        this.functionParsingErrorReason = functionParsingErrorReason;
    }


    /**
     * Gets the idErrorReason value for this ApiErrorReason.
     * 
     * @return idErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.IdErrorReason getIdErrorReason() {
        return idErrorReason;
    }


    /**
     * Sets the idErrorReason value for this ApiErrorReason.
     * 
     * @param idErrorReason
     */
    public void setIdErrorReason(com.google.api.ads.adwords.axis.v201601.cm.IdErrorReason idErrorReason) {
        this.idErrorReason = idErrorReason;
    }


    /**
     * Gets the imageErrorReason value for this ApiErrorReason.
     * 
     * @return imageErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ImageErrorReason getImageErrorReason() {
        return imageErrorReason;
    }


    /**
     * Sets the imageErrorReason value for this ApiErrorReason.
     * 
     * @param imageErrorReason
     */
    public void setImageErrorReason(com.google.api.ads.adwords.axis.v201601.cm.ImageErrorReason imageErrorReason) {
        this.imageErrorReason = imageErrorReason;
    }


    /**
     * Gets the internalApiErrorReason value for this ApiErrorReason.
     * 
     * @return internalApiErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.InternalApiErrorReason getInternalApiErrorReason() {
        return internalApiErrorReason;
    }


    /**
     * Sets the internalApiErrorReason value for this ApiErrorReason.
     * 
     * @param internalApiErrorReason
     */
    public void setInternalApiErrorReason(com.google.api.ads.adwords.axis.v201601.cm.InternalApiErrorReason internalApiErrorReason) {
        this.internalApiErrorReason = internalApiErrorReason;
    }


    /**
     * Gets the jobErrorReason value for this ApiErrorReason.
     * 
     * @return jobErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.JobErrorReason getJobErrorReason() {
        return jobErrorReason;
    }


    /**
     * Sets the jobErrorReason value for this ApiErrorReason.
     * 
     * @param jobErrorReason
     */
    public void setJobErrorReason(com.google.api.ads.adwords.axis.v201601.cm.JobErrorReason jobErrorReason) {
        this.jobErrorReason = jobErrorReason;
    }


    /**
     * Gets the mediaBundleErrorReason value for this ApiErrorReason.
     * 
     * @return mediaBundleErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.MediaBundleErrorReason getMediaBundleErrorReason() {
        return mediaBundleErrorReason;
    }


    /**
     * Sets the mediaBundleErrorReason value for this ApiErrorReason.
     * 
     * @param mediaBundleErrorReason
     */
    public void setMediaBundleErrorReason(com.google.api.ads.adwords.axis.v201601.cm.MediaBundleErrorReason mediaBundleErrorReason) {
        this.mediaBundleErrorReason = mediaBundleErrorReason;
    }


    /**
     * Gets the mediaErrorReason value for this ApiErrorReason.
     * 
     * @return mediaErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.MediaErrorReason getMediaErrorReason() {
        return mediaErrorReason;
    }


    /**
     * Sets the mediaErrorReason value for this ApiErrorReason.
     * 
     * @param mediaErrorReason
     */
    public void setMediaErrorReason(com.google.api.ads.adwords.axis.v201601.cm.MediaErrorReason mediaErrorReason) {
        this.mediaErrorReason = mediaErrorReason;
    }


    /**
     * Gets the multiplierErrorReason value for this ApiErrorReason.
     * 
     * @return multiplierErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.MultiplierErrorReason getMultiplierErrorReason() {
        return multiplierErrorReason;
    }


    /**
     * Sets the multiplierErrorReason value for this ApiErrorReason.
     * 
     * @param multiplierErrorReason
     */
    public void setMultiplierErrorReason(com.google.api.ads.adwords.axis.v201601.cm.MultiplierErrorReason multiplierErrorReason) {
        this.multiplierErrorReason = multiplierErrorReason;
    }


    /**
     * Gets the newEntityCreationErrorReason value for this ApiErrorReason.
     * 
     * @return newEntityCreationErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.NewEntityCreationErrorReason getNewEntityCreationErrorReason() {
        return newEntityCreationErrorReason;
    }


    /**
     * Sets the newEntityCreationErrorReason value for this ApiErrorReason.
     * 
     * @param newEntityCreationErrorReason
     */
    public void setNewEntityCreationErrorReason(com.google.api.ads.adwords.axis.v201601.cm.NewEntityCreationErrorReason newEntityCreationErrorReason) {
        this.newEntityCreationErrorReason = newEntityCreationErrorReason;
    }


    /**
     * Gets the notEmptyErrorReason value for this ApiErrorReason.
     * 
     * @return notEmptyErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.NotEmptyErrorReason getNotEmptyErrorReason() {
        return notEmptyErrorReason;
    }


    /**
     * Sets the notEmptyErrorReason value for this ApiErrorReason.
     * 
     * @param notEmptyErrorReason
     */
    public void setNotEmptyErrorReason(com.google.api.ads.adwords.axis.v201601.cm.NotEmptyErrorReason notEmptyErrorReason) {
        this.notEmptyErrorReason = notEmptyErrorReason;
    }


    /**
     * Gets the nullErrorReason value for this ApiErrorReason.
     * 
     * @return nullErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.NullErrorReason getNullErrorReason() {
        return nullErrorReason;
    }


    /**
     * Sets the nullErrorReason value for this ApiErrorReason.
     * 
     * @param nullErrorReason
     */
    public void setNullErrorReason(com.google.api.ads.adwords.axis.v201601.cm.NullErrorReason nullErrorReason) {
        this.nullErrorReason = nullErrorReason;
    }


    /**
     * Gets the operationAccessDeniedReason value for this ApiErrorReason.
     * 
     * @return operationAccessDeniedReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.OperationAccessDeniedReason getOperationAccessDeniedReason() {
        return operationAccessDeniedReason;
    }


    /**
     * Sets the operationAccessDeniedReason value for this ApiErrorReason.
     * 
     * @param operationAccessDeniedReason
     */
    public void setOperationAccessDeniedReason(com.google.api.ads.adwords.axis.v201601.cm.OperationAccessDeniedReason operationAccessDeniedReason) {
        this.operationAccessDeniedReason = operationAccessDeniedReason;
    }


    /**
     * Gets the operatorErrorReason value for this ApiErrorReason.
     * 
     * @return operatorErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.OperatorErrorReason getOperatorErrorReason() {
        return operatorErrorReason;
    }


    /**
     * Sets the operatorErrorReason value for this ApiErrorReason.
     * 
     * @param operatorErrorReason
     */
    public void setOperatorErrorReason(com.google.api.ads.adwords.axis.v201601.cm.OperatorErrorReason operatorErrorReason) {
        this.operatorErrorReason = operatorErrorReason;
    }


    /**
     * Gets the pagingErrorReason value for this ApiErrorReason.
     * 
     * @return pagingErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.PagingErrorReason getPagingErrorReason() {
        return pagingErrorReason;
    }


    /**
     * Sets the pagingErrorReason value for this ApiErrorReason.
     * 
     * @param pagingErrorReason
     */
    public void setPagingErrorReason(com.google.api.ads.adwords.axis.v201601.cm.PagingErrorReason pagingErrorReason) {
        this.pagingErrorReason = pagingErrorReason;
    }


    /**
     * Gets the policyViolationErrorReason value for this ApiErrorReason.
     * 
     * @return policyViolationErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.PolicyViolationErrorReason getPolicyViolationErrorReason() {
        return policyViolationErrorReason;
    }


    /**
     * Sets the policyViolationErrorReason value for this ApiErrorReason.
     * 
     * @param policyViolationErrorReason
     */
    public void setPolicyViolationErrorReason(com.google.api.ads.adwords.axis.v201601.cm.PolicyViolationErrorReason policyViolationErrorReason) {
        this.policyViolationErrorReason = policyViolationErrorReason;
    }


    /**
     * Gets the queryErrorReason value for this ApiErrorReason.
     * 
     * @return queryErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.QueryErrorReason getQueryErrorReason() {
        return queryErrorReason;
    }


    /**
     * Sets the queryErrorReason value for this ApiErrorReason.
     * 
     * @param queryErrorReason
     */
    public void setQueryErrorReason(com.google.api.ads.adwords.axis.v201601.cm.QueryErrorReason queryErrorReason) {
        this.queryErrorReason = queryErrorReason;
    }


    /**
     * Gets the quotaCheckErrorReason value for this ApiErrorReason.
     * 
     * @return quotaCheckErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.QuotaCheckErrorReason getQuotaCheckErrorReason() {
        return quotaCheckErrorReason;
    }


    /**
     * Sets the quotaCheckErrorReason value for this ApiErrorReason.
     * 
     * @param quotaCheckErrorReason
     */
    public void setQuotaCheckErrorReason(com.google.api.ads.adwords.axis.v201601.cm.QuotaCheckErrorReason quotaCheckErrorReason) {
        this.quotaCheckErrorReason = quotaCheckErrorReason;
    }


    /**
     * Gets the rangeErrorReason value for this ApiErrorReason.
     * 
     * @return rangeErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.RangeErrorReason getRangeErrorReason() {
        return rangeErrorReason;
    }


    /**
     * Sets the rangeErrorReason value for this ApiErrorReason.
     * 
     * @param rangeErrorReason
     */
    public void setRangeErrorReason(com.google.api.ads.adwords.axis.v201601.cm.RangeErrorReason rangeErrorReason) {
        this.rangeErrorReason = rangeErrorReason;
    }


    /**
     * Gets the rateExceededErrorReason value for this ApiErrorReason.
     * 
     * @return rateExceededErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.RateExceededErrorReason getRateExceededErrorReason() {
        return rateExceededErrorReason;
    }


    /**
     * Sets the rateExceededErrorReason value for this ApiErrorReason.
     * 
     * @param rateExceededErrorReason
     */
    public void setRateExceededErrorReason(com.google.api.ads.adwords.axis.v201601.cm.RateExceededErrorReason rateExceededErrorReason) {
        this.rateExceededErrorReason = rateExceededErrorReason;
    }


    /**
     * Gets the readOnlyErrorReason value for this ApiErrorReason.
     * 
     * @return readOnlyErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ReadOnlyErrorReason getReadOnlyErrorReason() {
        return readOnlyErrorReason;
    }


    /**
     * Sets the readOnlyErrorReason value for this ApiErrorReason.
     * 
     * @param readOnlyErrorReason
     */
    public void setReadOnlyErrorReason(com.google.api.ads.adwords.axis.v201601.cm.ReadOnlyErrorReason readOnlyErrorReason) {
        this.readOnlyErrorReason = readOnlyErrorReason;
    }


    /**
     * Gets the regionCodeErrorReason value for this ApiErrorReason.
     * 
     * @return regionCodeErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.RegionCodeErrorReason getRegionCodeErrorReason() {
        return regionCodeErrorReason;
    }


    /**
     * Sets the regionCodeErrorReason value for this ApiErrorReason.
     * 
     * @param regionCodeErrorReason
     */
    public void setRegionCodeErrorReason(com.google.api.ads.adwords.axis.v201601.cm.RegionCodeErrorReason regionCodeErrorReason) {
        this.regionCodeErrorReason = regionCodeErrorReason;
    }


    /**
     * Gets the rejectedErrorReason value for this ApiErrorReason.
     * 
     * @return rejectedErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.RejectedErrorReason getRejectedErrorReason() {
        return rejectedErrorReason;
    }


    /**
     * Sets the rejectedErrorReason value for this ApiErrorReason.
     * 
     * @param rejectedErrorReason
     */
    public void setRejectedErrorReason(com.google.api.ads.adwords.axis.v201601.cm.RejectedErrorReason rejectedErrorReason) {
        this.rejectedErrorReason = rejectedErrorReason;
    }


    /**
     * Gets the requestErrorReason value for this ApiErrorReason.
     * 
     * @return requestErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.RequestErrorReason getRequestErrorReason() {
        return requestErrorReason;
    }


    /**
     * Sets the requestErrorReason value for this ApiErrorReason.
     * 
     * @param requestErrorReason
     */
    public void setRequestErrorReason(com.google.api.ads.adwords.axis.v201601.cm.RequestErrorReason requestErrorReason) {
        this.requestErrorReason = requestErrorReason;
    }


    /**
     * Gets the requiredErrorReason value for this ApiErrorReason.
     * 
     * @return requiredErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.RequiredErrorReason getRequiredErrorReason() {
        return requiredErrorReason;
    }


    /**
     * Sets the requiredErrorReason value for this ApiErrorReason.
     * 
     * @param requiredErrorReason
     */
    public void setRequiredErrorReason(com.google.api.ads.adwords.axis.v201601.cm.RequiredErrorReason requiredErrorReason) {
        this.requiredErrorReason = requiredErrorReason;
    }


    /**
     * Gets the selectorErrorReason value for this ApiErrorReason.
     * 
     * @return selectorErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.SelectorErrorReason getSelectorErrorReason() {
        return selectorErrorReason;
    }


    /**
     * Sets the selectorErrorReason value for this ApiErrorReason.
     * 
     * @param selectorErrorReason
     */
    public void setSelectorErrorReason(com.google.api.ads.adwords.axis.v201601.cm.SelectorErrorReason selectorErrorReason) {
        this.selectorErrorReason = selectorErrorReason;
    }


    /**
     * Gets the settingErrorReason value for this ApiErrorReason.
     * 
     * @return settingErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.SettingErrorReason getSettingErrorReason() {
        return settingErrorReason;
    }


    /**
     * Sets the settingErrorReason value for this ApiErrorReason.
     * 
     * @param settingErrorReason
     */
    public void setSettingErrorReason(com.google.api.ads.adwords.axis.v201601.cm.SettingErrorReason settingErrorReason) {
        this.settingErrorReason = settingErrorReason;
    }


    /**
     * Gets the sizeLimitErrorReason value for this ApiErrorReason.
     * 
     * @return sizeLimitErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.SizeLimitErrorReason getSizeLimitErrorReason() {
        return sizeLimitErrorReason;
    }


    /**
     * Sets the sizeLimitErrorReason value for this ApiErrorReason.
     * 
     * @param sizeLimitErrorReason
     */
    public void setSizeLimitErrorReason(com.google.api.ads.adwords.axis.v201601.cm.SizeLimitErrorReason sizeLimitErrorReason) {
        this.sizeLimitErrorReason = sizeLimitErrorReason;
    }


    /**
     * Gets the statsQueryErrorReason value for this ApiErrorReason.
     * 
     * @return statsQueryErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.StatsQueryErrorReason getStatsQueryErrorReason() {
        return statsQueryErrorReason;
    }


    /**
     * Sets the statsQueryErrorReason value for this ApiErrorReason.
     * 
     * @param statsQueryErrorReason
     */
    public void setStatsQueryErrorReason(com.google.api.ads.adwords.axis.v201601.cm.StatsQueryErrorReason statsQueryErrorReason) {
        this.statsQueryErrorReason = statsQueryErrorReason;
    }


    /**
     * Gets the stringFormatErrorReason value for this ApiErrorReason.
     * 
     * @return stringFormatErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.StringFormatErrorReason getStringFormatErrorReason() {
        return stringFormatErrorReason;
    }


    /**
     * Sets the stringFormatErrorReason value for this ApiErrorReason.
     * 
     * @param stringFormatErrorReason
     */
    public void setStringFormatErrorReason(com.google.api.ads.adwords.axis.v201601.cm.StringFormatErrorReason stringFormatErrorReason) {
        this.stringFormatErrorReason = stringFormatErrorReason;
    }


    /**
     * Gets the stringLengthErrorReason value for this ApiErrorReason.
     * 
     * @return stringLengthErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.StringLengthErrorReason getStringLengthErrorReason() {
        return stringLengthErrorReason;
    }


    /**
     * Sets the stringLengthErrorReason value for this ApiErrorReason.
     * 
     * @param stringLengthErrorReason
     */
    public void setStringLengthErrorReason(com.google.api.ads.adwords.axis.v201601.cm.StringLengthErrorReason stringLengthErrorReason) {
        this.stringLengthErrorReason = stringLengthErrorReason;
    }


    /**
     * Gets the urlErrorReason value for this ApiErrorReason.
     * 
     * @return urlErrorReason
     */
    public com.google.api.ads.adwords.axis.v201601.cm.UrlErrorReason getUrlErrorReason() {
        return urlErrorReason;
    }


    /**
     * Sets the urlErrorReason value for this ApiErrorReason.
     * 
     * @param urlErrorReason
     */
    public void setUrlErrorReason(com.google.api.ads.adwords.axis.v201601.cm.UrlErrorReason urlErrorReason) {
        this.urlErrorReason = urlErrorReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiErrorReason)) return false;
        ApiErrorReason other = (ApiErrorReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adCustomizerErrorReason==null && other.getAdCustomizerErrorReason()==null) || 
             (this.adCustomizerErrorReason!=null &&
              this.adCustomizerErrorReason.equals(other.getAdCustomizerErrorReason()))) &&
            ((this.adErrorReason==null && other.getAdErrorReason()==null) || 
             (this.adErrorReason!=null &&
              this.adErrorReason.equals(other.getAdErrorReason()))) &&
            ((this.adExtensionErrorReason==null && other.getAdExtensionErrorReason()==null) || 
             (this.adExtensionErrorReason!=null &&
              this.adExtensionErrorReason.equals(other.getAdExtensionErrorReason()))) &&
            ((this.adGroupAdErrorReason==null && other.getAdGroupAdErrorReason()==null) || 
             (this.adGroupAdErrorReason!=null &&
              this.adGroupAdErrorReason.equals(other.getAdGroupAdErrorReason()))) &&
            ((this.adGroupCriterionErrorReason==null && other.getAdGroupCriterionErrorReason()==null) || 
             (this.adGroupCriterionErrorReason!=null &&
              this.adGroupCriterionErrorReason.equals(other.getAdGroupCriterionErrorReason()))) &&
            ((this.adGroupServiceErrorReason==null && other.getAdGroupServiceErrorReason()==null) || 
             (this.adGroupServiceErrorReason!=null &&
              this.adGroupServiceErrorReason.equals(other.getAdGroupServiceErrorReason()))) &&
            ((this.adxErrorReason==null && other.getAdxErrorReason()==null) || 
             (this.adxErrorReason!=null &&
              this.adxErrorReason.equals(other.getAdxErrorReason()))) &&
            ((this.authenticationErrorReason==null && other.getAuthenticationErrorReason()==null) || 
             (this.authenticationErrorReason!=null &&
              this.authenticationErrorReason.equals(other.getAuthenticationErrorReason()))) &&
            ((this.authorizationErrorReason==null && other.getAuthorizationErrorReason()==null) || 
             (this.authorizationErrorReason!=null &&
              this.authorizationErrorReason.equals(other.getAuthorizationErrorReason()))) &&
            ((this.betaErrorReason==null && other.getBetaErrorReason()==null) || 
             (this.betaErrorReason!=null &&
              this.betaErrorReason.equals(other.getBetaErrorReason()))) &&
            ((this.biddingErrorReason==null && other.getBiddingErrorReason()==null) || 
             (this.biddingErrorReason!=null &&
              this.biddingErrorReason.equals(other.getBiddingErrorReason()))) &&
            ((this.biddingErrorsReason==null && other.getBiddingErrorsReason()==null) || 
             (this.biddingErrorsReason!=null &&
              this.biddingErrorsReason.equals(other.getBiddingErrorsReason()))) &&
            ((this.biddingTransitionErrorReason==null && other.getBiddingTransitionErrorReason()==null) || 
             (this.biddingTransitionErrorReason!=null &&
              this.biddingTransitionErrorReason.equals(other.getBiddingTransitionErrorReason()))) &&
            ((this.budgetErrorReason==null && other.getBudgetErrorReason()==null) || 
             (this.budgetErrorReason!=null &&
              this.budgetErrorReason.equals(other.getBudgetErrorReason()))) &&
            ((this.bulkMutateJobErrorReason==null && other.getBulkMutateJobErrorReason()==null) || 
             (this.bulkMutateJobErrorReason!=null &&
              this.bulkMutateJobErrorReason.equals(other.getBulkMutateJobErrorReason()))) &&
            ((this.campaignAdExtensionErrorReason==null && other.getCampaignAdExtensionErrorReason()==null) || 
             (this.campaignAdExtensionErrorReason!=null &&
              this.campaignAdExtensionErrorReason.equals(other.getCampaignAdExtensionErrorReason()))) &&
            ((this.campaignCriterionErrorReason==null && other.getCampaignCriterionErrorReason()==null) || 
             (this.campaignCriterionErrorReason!=null &&
              this.campaignCriterionErrorReason.equals(other.getCampaignCriterionErrorReason()))) &&
            ((this.campaignErrorReason==null && other.getCampaignErrorReason()==null) || 
             (this.campaignErrorReason!=null &&
              this.campaignErrorReason.equals(other.getCampaignErrorReason()))) &&
            ((this.clientTermsErrorReason==null && other.getClientTermsErrorReason()==null) || 
             (this.clientTermsErrorReason!=null &&
              this.clientTermsErrorReason.equals(other.getClientTermsErrorReason()))) &&
            ((this.collectionSizeErrorReason==null && other.getCollectionSizeErrorReason()==null) || 
             (this.collectionSizeErrorReason!=null &&
              this.collectionSizeErrorReason.equals(other.getCollectionSizeErrorReason()))) &&
            ((this.criterionErrorReason==null && other.getCriterionErrorReason()==null) || 
             (this.criterionErrorReason!=null &&
              this.criterionErrorReason.equals(other.getCriterionErrorReason()))) &&
            ((this.databaseErrorReason==null && other.getDatabaseErrorReason()==null) || 
             (this.databaseErrorReason!=null &&
              this.databaseErrorReason.equals(other.getDatabaseErrorReason()))) &&
            ((this.dateErrorReason==null && other.getDateErrorReason()==null) || 
             (this.dateErrorReason!=null &&
              this.dateErrorReason.equals(other.getDateErrorReason()))) &&
            ((this.dateRangeErrorReason==null && other.getDateRangeErrorReason()==null) || 
             (this.dateRangeErrorReason!=null &&
              this.dateRangeErrorReason.equals(other.getDateRangeErrorReason()))) &&
            ((this.distinctErrorReason==null && other.getDistinctErrorReason()==null) || 
             (this.distinctErrorReason!=null &&
              this.distinctErrorReason.equals(other.getDistinctErrorReason()))) &&
            ((this.entityAccessDeniedReason==null && other.getEntityAccessDeniedReason()==null) || 
             (this.entityAccessDeniedReason!=null &&
              this.entityAccessDeniedReason.equals(other.getEntityAccessDeniedReason()))) &&
            ((this.entityCountLimitExceededReason==null && other.getEntityCountLimitExceededReason()==null) || 
             (this.entityCountLimitExceededReason!=null &&
              this.entityCountLimitExceededReason.equals(other.getEntityCountLimitExceededReason()))) &&
            ((this.entityNotFoundReason==null && other.getEntityNotFoundReason()==null) || 
             (this.entityNotFoundReason!=null &&
              this.entityNotFoundReason.equals(other.getEntityNotFoundReason()))) &&
            ((this.experimentErrorReason==null && other.getExperimentErrorReason()==null) || 
             (this.experimentErrorReason!=null &&
              this.experimentErrorReason.equals(other.getExperimentErrorReason()))) &&
            ((this.feedAttributeReferenceErrorReason==null && other.getFeedAttributeReferenceErrorReason()==null) || 
             (this.feedAttributeReferenceErrorReason!=null &&
              this.feedAttributeReferenceErrorReason.equals(other.getFeedAttributeReferenceErrorReason()))) &&
            ((this.feedItemErrorReason==null && other.getFeedItemErrorReason()==null) || 
             (this.feedItemErrorReason!=null &&
              this.feedItemErrorReason.equals(other.getFeedItemErrorReason()))) &&
            ((this.forwardCompatibilityErrorReason==null && other.getForwardCompatibilityErrorReason()==null) || 
             (this.forwardCompatibilityErrorReason!=null &&
              this.forwardCompatibilityErrorReason.equals(other.getForwardCompatibilityErrorReason()))) &&
            ((this.functionErrorReason==null && other.getFunctionErrorReason()==null) || 
             (this.functionErrorReason!=null &&
              this.functionErrorReason.equals(other.getFunctionErrorReason()))) &&
            ((this.functionParsingErrorReason==null && other.getFunctionParsingErrorReason()==null) || 
             (this.functionParsingErrorReason!=null &&
              this.functionParsingErrorReason.equals(other.getFunctionParsingErrorReason()))) &&
            ((this.idErrorReason==null && other.getIdErrorReason()==null) || 
             (this.idErrorReason!=null &&
              this.idErrorReason.equals(other.getIdErrorReason()))) &&
            ((this.imageErrorReason==null && other.getImageErrorReason()==null) || 
             (this.imageErrorReason!=null &&
              this.imageErrorReason.equals(other.getImageErrorReason()))) &&
            ((this.internalApiErrorReason==null && other.getInternalApiErrorReason()==null) || 
             (this.internalApiErrorReason!=null &&
              this.internalApiErrorReason.equals(other.getInternalApiErrorReason()))) &&
            ((this.jobErrorReason==null && other.getJobErrorReason()==null) || 
             (this.jobErrorReason!=null &&
              this.jobErrorReason.equals(other.getJobErrorReason()))) &&
            ((this.mediaBundleErrorReason==null && other.getMediaBundleErrorReason()==null) || 
             (this.mediaBundleErrorReason!=null &&
              this.mediaBundleErrorReason.equals(other.getMediaBundleErrorReason()))) &&
            ((this.mediaErrorReason==null && other.getMediaErrorReason()==null) || 
             (this.mediaErrorReason!=null &&
              this.mediaErrorReason.equals(other.getMediaErrorReason()))) &&
            ((this.multiplierErrorReason==null && other.getMultiplierErrorReason()==null) || 
             (this.multiplierErrorReason!=null &&
              this.multiplierErrorReason.equals(other.getMultiplierErrorReason()))) &&
            ((this.newEntityCreationErrorReason==null && other.getNewEntityCreationErrorReason()==null) || 
             (this.newEntityCreationErrorReason!=null &&
              this.newEntityCreationErrorReason.equals(other.getNewEntityCreationErrorReason()))) &&
            ((this.notEmptyErrorReason==null && other.getNotEmptyErrorReason()==null) || 
             (this.notEmptyErrorReason!=null &&
              this.notEmptyErrorReason.equals(other.getNotEmptyErrorReason()))) &&
            ((this.nullErrorReason==null && other.getNullErrorReason()==null) || 
             (this.nullErrorReason!=null &&
              this.nullErrorReason.equals(other.getNullErrorReason()))) &&
            ((this.operationAccessDeniedReason==null && other.getOperationAccessDeniedReason()==null) || 
             (this.operationAccessDeniedReason!=null &&
              this.operationAccessDeniedReason.equals(other.getOperationAccessDeniedReason()))) &&
            ((this.operatorErrorReason==null && other.getOperatorErrorReason()==null) || 
             (this.operatorErrorReason!=null &&
              this.operatorErrorReason.equals(other.getOperatorErrorReason()))) &&
            ((this.pagingErrorReason==null && other.getPagingErrorReason()==null) || 
             (this.pagingErrorReason!=null &&
              this.pagingErrorReason.equals(other.getPagingErrorReason()))) &&
            ((this.policyViolationErrorReason==null && other.getPolicyViolationErrorReason()==null) || 
             (this.policyViolationErrorReason!=null &&
              this.policyViolationErrorReason.equals(other.getPolicyViolationErrorReason()))) &&
            ((this.queryErrorReason==null && other.getQueryErrorReason()==null) || 
             (this.queryErrorReason!=null &&
              this.queryErrorReason.equals(other.getQueryErrorReason()))) &&
            ((this.quotaCheckErrorReason==null && other.getQuotaCheckErrorReason()==null) || 
             (this.quotaCheckErrorReason!=null &&
              this.quotaCheckErrorReason.equals(other.getQuotaCheckErrorReason()))) &&
            ((this.rangeErrorReason==null && other.getRangeErrorReason()==null) || 
             (this.rangeErrorReason!=null &&
              this.rangeErrorReason.equals(other.getRangeErrorReason()))) &&
            ((this.rateExceededErrorReason==null && other.getRateExceededErrorReason()==null) || 
             (this.rateExceededErrorReason!=null &&
              this.rateExceededErrorReason.equals(other.getRateExceededErrorReason()))) &&
            ((this.readOnlyErrorReason==null && other.getReadOnlyErrorReason()==null) || 
             (this.readOnlyErrorReason!=null &&
              this.readOnlyErrorReason.equals(other.getReadOnlyErrorReason()))) &&
            ((this.regionCodeErrorReason==null && other.getRegionCodeErrorReason()==null) || 
             (this.regionCodeErrorReason!=null &&
              this.regionCodeErrorReason.equals(other.getRegionCodeErrorReason()))) &&
            ((this.rejectedErrorReason==null && other.getRejectedErrorReason()==null) || 
             (this.rejectedErrorReason!=null &&
              this.rejectedErrorReason.equals(other.getRejectedErrorReason()))) &&
            ((this.requestErrorReason==null && other.getRequestErrorReason()==null) || 
             (this.requestErrorReason!=null &&
              this.requestErrorReason.equals(other.getRequestErrorReason()))) &&
            ((this.requiredErrorReason==null && other.getRequiredErrorReason()==null) || 
             (this.requiredErrorReason!=null &&
              this.requiredErrorReason.equals(other.getRequiredErrorReason()))) &&
            ((this.selectorErrorReason==null && other.getSelectorErrorReason()==null) || 
             (this.selectorErrorReason!=null &&
              this.selectorErrorReason.equals(other.getSelectorErrorReason()))) &&
            ((this.settingErrorReason==null && other.getSettingErrorReason()==null) || 
             (this.settingErrorReason!=null &&
              this.settingErrorReason.equals(other.getSettingErrorReason()))) &&
            ((this.sizeLimitErrorReason==null && other.getSizeLimitErrorReason()==null) || 
             (this.sizeLimitErrorReason!=null &&
              this.sizeLimitErrorReason.equals(other.getSizeLimitErrorReason()))) &&
            ((this.statsQueryErrorReason==null && other.getStatsQueryErrorReason()==null) || 
             (this.statsQueryErrorReason!=null &&
              this.statsQueryErrorReason.equals(other.getStatsQueryErrorReason()))) &&
            ((this.stringFormatErrorReason==null && other.getStringFormatErrorReason()==null) || 
             (this.stringFormatErrorReason!=null &&
              this.stringFormatErrorReason.equals(other.getStringFormatErrorReason()))) &&
            ((this.stringLengthErrorReason==null && other.getStringLengthErrorReason()==null) || 
             (this.stringLengthErrorReason!=null &&
              this.stringLengthErrorReason.equals(other.getStringLengthErrorReason()))) &&
            ((this.urlErrorReason==null && other.getUrlErrorReason()==null) || 
             (this.urlErrorReason!=null &&
              this.urlErrorReason.equals(other.getUrlErrorReason())));
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
        if (getAdCustomizerErrorReason() != null) {
            _hashCode += getAdCustomizerErrorReason().hashCode();
        }
        if (getAdErrorReason() != null) {
            _hashCode += getAdErrorReason().hashCode();
        }
        if (getAdExtensionErrorReason() != null) {
            _hashCode += getAdExtensionErrorReason().hashCode();
        }
        if (getAdGroupAdErrorReason() != null) {
            _hashCode += getAdGroupAdErrorReason().hashCode();
        }
        if (getAdGroupCriterionErrorReason() != null) {
            _hashCode += getAdGroupCriterionErrorReason().hashCode();
        }
        if (getAdGroupServiceErrorReason() != null) {
            _hashCode += getAdGroupServiceErrorReason().hashCode();
        }
        if (getAdxErrorReason() != null) {
            _hashCode += getAdxErrorReason().hashCode();
        }
        if (getAuthenticationErrorReason() != null) {
            _hashCode += getAuthenticationErrorReason().hashCode();
        }
        if (getAuthorizationErrorReason() != null) {
            _hashCode += getAuthorizationErrorReason().hashCode();
        }
        if (getBetaErrorReason() != null) {
            _hashCode += getBetaErrorReason().hashCode();
        }
        if (getBiddingErrorReason() != null) {
            _hashCode += getBiddingErrorReason().hashCode();
        }
        if (getBiddingErrorsReason() != null) {
            _hashCode += getBiddingErrorsReason().hashCode();
        }
        if (getBiddingTransitionErrorReason() != null) {
            _hashCode += getBiddingTransitionErrorReason().hashCode();
        }
        if (getBudgetErrorReason() != null) {
            _hashCode += getBudgetErrorReason().hashCode();
        }
        if (getBulkMutateJobErrorReason() != null) {
            _hashCode += getBulkMutateJobErrorReason().hashCode();
        }
        if (getCampaignAdExtensionErrorReason() != null) {
            _hashCode += getCampaignAdExtensionErrorReason().hashCode();
        }
        if (getCampaignCriterionErrorReason() != null) {
            _hashCode += getCampaignCriterionErrorReason().hashCode();
        }
        if (getCampaignErrorReason() != null) {
            _hashCode += getCampaignErrorReason().hashCode();
        }
        if (getClientTermsErrorReason() != null) {
            _hashCode += getClientTermsErrorReason().hashCode();
        }
        if (getCollectionSizeErrorReason() != null) {
            _hashCode += getCollectionSizeErrorReason().hashCode();
        }
        if (getCriterionErrorReason() != null) {
            _hashCode += getCriterionErrorReason().hashCode();
        }
        if (getDatabaseErrorReason() != null) {
            _hashCode += getDatabaseErrorReason().hashCode();
        }
        if (getDateErrorReason() != null) {
            _hashCode += getDateErrorReason().hashCode();
        }
        if (getDateRangeErrorReason() != null) {
            _hashCode += getDateRangeErrorReason().hashCode();
        }
        if (getDistinctErrorReason() != null) {
            _hashCode += getDistinctErrorReason().hashCode();
        }
        if (getEntityAccessDeniedReason() != null) {
            _hashCode += getEntityAccessDeniedReason().hashCode();
        }
        if (getEntityCountLimitExceededReason() != null) {
            _hashCode += getEntityCountLimitExceededReason().hashCode();
        }
        if (getEntityNotFoundReason() != null) {
            _hashCode += getEntityNotFoundReason().hashCode();
        }
        if (getExperimentErrorReason() != null) {
            _hashCode += getExperimentErrorReason().hashCode();
        }
        if (getFeedAttributeReferenceErrorReason() != null) {
            _hashCode += getFeedAttributeReferenceErrorReason().hashCode();
        }
        if (getFeedItemErrorReason() != null) {
            _hashCode += getFeedItemErrorReason().hashCode();
        }
        if (getForwardCompatibilityErrorReason() != null) {
            _hashCode += getForwardCompatibilityErrorReason().hashCode();
        }
        if (getFunctionErrorReason() != null) {
            _hashCode += getFunctionErrorReason().hashCode();
        }
        if (getFunctionParsingErrorReason() != null) {
            _hashCode += getFunctionParsingErrorReason().hashCode();
        }
        if (getIdErrorReason() != null) {
            _hashCode += getIdErrorReason().hashCode();
        }
        if (getImageErrorReason() != null) {
            _hashCode += getImageErrorReason().hashCode();
        }
        if (getInternalApiErrorReason() != null) {
            _hashCode += getInternalApiErrorReason().hashCode();
        }
        if (getJobErrorReason() != null) {
            _hashCode += getJobErrorReason().hashCode();
        }
        if (getMediaBundleErrorReason() != null) {
            _hashCode += getMediaBundleErrorReason().hashCode();
        }
        if (getMediaErrorReason() != null) {
            _hashCode += getMediaErrorReason().hashCode();
        }
        if (getMultiplierErrorReason() != null) {
            _hashCode += getMultiplierErrorReason().hashCode();
        }
        if (getNewEntityCreationErrorReason() != null) {
            _hashCode += getNewEntityCreationErrorReason().hashCode();
        }
        if (getNotEmptyErrorReason() != null) {
            _hashCode += getNotEmptyErrorReason().hashCode();
        }
        if (getNullErrorReason() != null) {
            _hashCode += getNullErrorReason().hashCode();
        }
        if (getOperationAccessDeniedReason() != null) {
            _hashCode += getOperationAccessDeniedReason().hashCode();
        }
        if (getOperatorErrorReason() != null) {
            _hashCode += getOperatorErrorReason().hashCode();
        }
        if (getPagingErrorReason() != null) {
            _hashCode += getPagingErrorReason().hashCode();
        }
        if (getPolicyViolationErrorReason() != null) {
            _hashCode += getPolicyViolationErrorReason().hashCode();
        }
        if (getQueryErrorReason() != null) {
            _hashCode += getQueryErrorReason().hashCode();
        }
        if (getQuotaCheckErrorReason() != null) {
            _hashCode += getQuotaCheckErrorReason().hashCode();
        }
        if (getRangeErrorReason() != null) {
            _hashCode += getRangeErrorReason().hashCode();
        }
        if (getRateExceededErrorReason() != null) {
            _hashCode += getRateExceededErrorReason().hashCode();
        }
        if (getReadOnlyErrorReason() != null) {
            _hashCode += getReadOnlyErrorReason().hashCode();
        }
        if (getRegionCodeErrorReason() != null) {
            _hashCode += getRegionCodeErrorReason().hashCode();
        }
        if (getRejectedErrorReason() != null) {
            _hashCode += getRejectedErrorReason().hashCode();
        }
        if (getRequestErrorReason() != null) {
            _hashCode += getRequestErrorReason().hashCode();
        }
        if (getRequiredErrorReason() != null) {
            _hashCode += getRequiredErrorReason().hashCode();
        }
        if (getSelectorErrorReason() != null) {
            _hashCode += getSelectorErrorReason().hashCode();
        }
        if (getSettingErrorReason() != null) {
            _hashCode += getSettingErrorReason().hashCode();
        }
        if (getSizeLimitErrorReason() != null) {
            _hashCode += getSizeLimitErrorReason().hashCode();
        }
        if (getStatsQueryErrorReason() != null) {
            _hashCode += getStatsQueryErrorReason().hashCode();
        }
        if (getStringFormatErrorReason() != null) {
            _hashCode += getStringFormatErrorReason().hashCode();
        }
        if (getStringLengthErrorReason() != null) {
            _hashCode += getStringLengthErrorReason().hashCode();
        }
        if (getUrlErrorReason() != null) {
            _hashCode += getUrlErrorReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiErrorReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApiErrorReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adCustomizerErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdCustomizerErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdCustomizerError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdExtensionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdExtensionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupAdErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupAdErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupAdError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupCriterionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupCriterionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupCriterionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupServiceErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupServiceErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdGroupServiceError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adxErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdxErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AdxError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthenticationErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthenticationError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthorizationErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthorizationError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betaErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BetaErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BetaError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingErrorsReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingErrorsReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingErrors.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingTransitionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingTransitionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BiddingTransitionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BudgetErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BudgetError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkMutateJobErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BulkMutateJobErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "BulkMutateJobError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignAdExtensionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignAdExtensionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignAdExtensionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignCriterionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignCriterionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignCriterionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CampaignError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTermsErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ClientTermsErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ClientTermsError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionSizeErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CollectionSizeErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CollectionSizeError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CriterionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CriterionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DatabaseErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DatabaseError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateRangeErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateRangeError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distinctErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DistinctErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DistinctError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityAccessDeniedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "EntityAccessDeniedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "EntityAccessDenied.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCountLimitExceededReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "EntityCountLimitExceededReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "EntityCountLimitExceeded.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNotFoundReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "EntityNotFoundReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "EntityNotFound.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ExperimentErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ExperimentError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeReferenceErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FeedAttributeReferenceErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FeedAttributeReferenceError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FeedItemErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FeedItemError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ForwardCompatibilityErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ForwardCompatibilityError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FunctionErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FunctionError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionParsingErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FunctionParsingErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "FunctionParsingError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "IdErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "IdError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ImageErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ImageError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalApiErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "InternalApiErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "InternalApiError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "JobErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "JobError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaBundleErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MediaBundleErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MediaBundleError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MediaErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MediaError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplierErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MultiplierErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MultiplierError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEntityCreationErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NewEntityCreationErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NewEntityCreationError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notEmptyErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NotEmptyErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NotEmptyError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nullErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NullErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NullError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationAccessDeniedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperationAccessDeniedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperationAccessDenied.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperatorErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperatorError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagingErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "PagingErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "PagingError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyViolationErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "PolicyViolationErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "PolicyViolationError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QueryErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QueryError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaCheckErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QuotaCheckErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QuotaCheckError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RangeErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RangeError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateExceededErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RateExceededErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RateExceededError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnlyErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ReadOnlyErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ReadOnlyError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCodeErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RegionCodeErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RegionCodeError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectedErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RejectedErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RejectedError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequestErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequestError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequiredErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequiredError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SelectorErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SelectorError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SettingErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SettingError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeLimitErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SizeLimitErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SizeLimitError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsQueryErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StatsQueryErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StatsQueryError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringFormatErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StringFormatErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StringFormatError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringLengthErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StringLengthErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StringLengthError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlErrorReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "UrlErrorReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "UrlError.Reason"));
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
