
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Interface that has a reason return an associated service error.
 *           
 * 
 * <p>Java class for ApiErrorReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiErrorReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AdErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdError.Reason"/>
 *         &lt;element name="AdExtensionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdExtensionError.Reason"/>
 *         &lt;element name="AdExtensionOverrideErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdExtensionOverrideError.Reason"/>
 *         &lt;element name="AdGroupAdErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupAdError.Reason"/>
 *         &lt;element name="AdGroupCriterionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupCriterionError.Reason"/>
 *         &lt;element name="AdGroupServiceErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupServiceError.Reason"/>
 *         &lt;element name="AdxErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AdxError.Reason"/>
 *         &lt;element name="AuthenticationErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AuthenticationError.Reason"/>
 *         &lt;element name="AuthorizationErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}AuthorizationError.Reason"/>
 *         &lt;element name="BetaErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}BetaError.Reason"/>
 *         &lt;element name="BiddingErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}BiddingError.Reason"/>
 *         &lt;element name="BiddingErrorsReason" type="{https://adwords.google.com/api/adwords/cm/v201402}BiddingErrors.Reason"/>
 *         &lt;element name="BiddingTransitionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}BiddingTransitionError.Reason"/>
 *         &lt;element name="BudgetErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}BudgetError.Reason"/>
 *         &lt;element name="BulkMutateJobErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}BulkMutateJobError.Reason"/>
 *         &lt;element name="CampaignAdExtensionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}CampaignAdExtensionError.Reason"/>
 *         &lt;element name="CampaignCriterionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}CampaignCriterionError.Reason"/>
 *         &lt;element name="CampaignErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}CampaignError.Reason"/>
 *         &lt;element name="ClientTermsErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}ClientTermsError.Reason"/>
 *         &lt;element name="CriterionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}CriterionError.Reason"/>
 *         &lt;element name="DatabaseErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}DatabaseError.Reason"/>
 *         &lt;element name="DateErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}DateError.Reason"/>
 *         &lt;element name="DistinctErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}DistinctError.Reason"/>
 *         &lt;element name="EntityAccessDeniedReason" type="{https://adwords.google.com/api/adwords/cm/v201402}EntityAccessDenied.Reason"/>
 *         &lt;element name="EntityCountLimitExceededReason" type="{https://adwords.google.com/api/adwords/cm/v201402}EntityCountLimitExceeded.Reason"/>
 *         &lt;element name="EntityNotFoundReason" type="{https://adwords.google.com/api/adwords/cm/v201402}EntityNotFound.Reason"/>
 *         &lt;element name="ExperimentErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}ExperimentError.Reason"/>
 *         &lt;element name="FeedItemErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}FeedItemError.Reason"/>
 *         &lt;element name="ForwardCompatibilityErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}ForwardCompatibilityError.Reason"/>
 *         &lt;element name="FunctionErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}FunctionError.Reason"/>
 *         &lt;element name="IdErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}IdError.Reason"/>
 *         &lt;element name="ImageErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}ImageError.Reason"/>
 *         &lt;element name="InternalApiErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}InternalApiError.Reason"/>
 *         &lt;element name="JobErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}JobError.Reason"/>
 *         &lt;element name="MediaErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}MediaError.Reason"/>
 *         &lt;element name="NewEntityCreationErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}NewEntityCreationError.Reason"/>
 *         &lt;element name="NotEmptyErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}NotEmptyError.Reason"/>
 *         &lt;element name="NullErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}NullError.Reason"/>
 *         &lt;element name="OperationAccessDeniedReason" type="{https://adwords.google.com/api/adwords/cm/v201402}OperationAccessDenied.Reason"/>
 *         &lt;element name="OperatorErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}OperatorError.Reason"/>
 *         &lt;element name="PagingErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}PagingError.Reason"/>
 *         &lt;element name="PolicyViolationErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}PolicyViolationError.Reason"/>
 *         &lt;element name="QueryErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}QueryError.Reason"/>
 *         &lt;element name="QuotaCheckErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}QuotaCheckError.Reason"/>
 *         &lt;element name="QuotaErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}QuotaError.Reason"/>
 *         &lt;element name="RangeErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}RangeError.Reason"/>
 *         &lt;element name="RateExceededErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}RateExceededError.Reason"/>
 *         &lt;element name="ReadOnlyErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}ReadOnlyError.Reason"/>
 *         &lt;element name="RegionCodeErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}RegionCodeError.Reason"/>
 *         &lt;element name="RejectedErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}RejectedError.Reason"/>
 *         &lt;element name="RequestErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}RequestError.Reason"/>
 *         &lt;element name="RequiredErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}RequiredError.Reason"/>
 *         &lt;element name="SelectorErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}SelectorError.Reason"/>
 *         &lt;element name="SettingErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}SettingError.Reason"/>
 *         &lt;element name="SizeLimitErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}SizeLimitError.Reason"/>
 *         &lt;element name="StatsQueryErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}StatsQueryError.Reason"/>
 *         &lt;element name="StringLengthErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}StringLengthError.Reason"/>
 *         &lt;element name="TargetErrorReason" type="{https://adwords.google.com/api/adwords/cm/v201402}TargetError.Reason"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiErrorReason", propOrder = {
    "adErrorReason",
    "adExtensionErrorReason",
    "adExtensionOverrideErrorReason",
    "adGroupAdErrorReason",
    "adGroupCriterionErrorReason",
    "adGroupServiceErrorReason",
    "adxErrorReason",
    "authenticationErrorReason",
    "authorizationErrorReason",
    "betaErrorReason",
    "biddingErrorReason",
    "biddingErrorsReason",
    "biddingTransitionErrorReason",
    "budgetErrorReason",
    "bulkMutateJobErrorReason",
    "campaignAdExtensionErrorReason",
    "campaignCriterionErrorReason",
    "campaignErrorReason",
    "clientTermsErrorReason",
    "criterionErrorReason",
    "databaseErrorReason",
    "dateErrorReason",
    "distinctErrorReason",
    "entityAccessDeniedReason",
    "entityCountLimitExceededReason",
    "entityNotFoundReason",
    "experimentErrorReason",
    "feedItemErrorReason",
    "forwardCompatibilityErrorReason",
    "functionErrorReason",
    "idErrorReason",
    "imageErrorReason",
    "internalApiErrorReason",
    "jobErrorReason",
    "mediaErrorReason",
    "newEntityCreationErrorReason",
    "notEmptyErrorReason",
    "nullErrorReason",
    "operationAccessDeniedReason",
    "operatorErrorReason",
    "pagingErrorReason",
    "policyViolationErrorReason",
    "queryErrorReason",
    "quotaCheckErrorReason",
    "quotaErrorReason",
    "rangeErrorReason",
    "rateExceededErrorReason",
    "readOnlyErrorReason",
    "regionCodeErrorReason",
    "rejectedErrorReason",
    "requestErrorReason",
    "requiredErrorReason",
    "selectorErrorReason",
    "settingErrorReason",
    "sizeLimitErrorReason",
    "statsQueryErrorReason",
    "stringLengthErrorReason",
    "targetErrorReason"
})
public class ApiErrorReason {

    @XmlElement(name = "AdErrorReason")
    protected AdErrorReason adErrorReason;
    @XmlElement(name = "AdExtensionErrorReason")
    protected AdExtensionErrorReason adExtensionErrorReason;
    @XmlElement(name = "AdExtensionOverrideErrorReason")
    protected AdExtensionOverrideErrorReason adExtensionOverrideErrorReason;
    @XmlElement(name = "AdGroupAdErrorReason")
    protected AdGroupAdErrorReason adGroupAdErrorReason;
    @XmlElement(name = "AdGroupCriterionErrorReason")
    protected AdGroupCriterionErrorReason adGroupCriterionErrorReason;
    @XmlElement(name = "AdGroupServiceErrorReason")
    protected AdGroupServiceErrorReason adGroupServiceErrorReason;
    @XmlElement(name = "AdxErrorReason")
    protected AdxErrorReason adxErrorReason;
    @XmlElement(name = "AuthenticationErrorReason")
    protected AuthenticationErrorReason authenticationErrorReason;
    @XmlElement(name = "AuthorizationErrorReason")
    protected AuthorizationErrorReason authorizationErrorReason;
    @XmlElement(name = "BetaErrorReason")
    protected BetaErrorReason betaErrorReason;
    @XmlElement(name = "BiddingErrorReason")
    protected BiddingErrorReason biddingErrorReason;
    @XmlElement(name = "BiddingErrorsReason")
    protected BiddingErrorsReason biddingErrorsReason;
    @XmlElement(name = "BiddingTransitionErrorReason")
    protected BiddingTransitionErrorReason biddingTransitionErrorReason;
    @XmlElement(name = "BudgetErrorReason")
    protected BudgetErrorReason budgetErrorReason;
    @XmlElement(name = "BulkMutateJobErrorReason")
    protected BulkMutateJobErrorReason bulkMutateJobErrorReason;
    @XmlElement(name = "CampaignAdExtensionErrorReason")
    protected CampaignAdExtensionErrorReason campaignAdExtensionErrorReason;
    @XmlElement(name = "CampaignCriterionErrorReason")
    protected CampaignCriterionErrorReason campaignCriterionErrorReason;
    @XmlElement(name = "CampaignErrorReason")
    protected CampaignErrorReason campaignErrorReason;
    @XmlElement(name = "ClientTermsErrorReason")
    protected ClientTermsErrorReason clientTermsErrorReason;
    @XmlElement(name = "CriterionErrorReason")
    protected CriterionErrorReason criterionErrorReason;
    @XmlElement(name = "DatabaseErrorReason")
    protected DatabaseErrorReason databaseErrorReason;
    @XmlElement(name = "DateErrorReason")
    protected DateErrorReason dateErrorReason;
    @XmlElement(name = "DistinctErrorReason")
    protected DistinctErrorReason distinctErrorReason;
    @XmlElement(name = "EntityAccessDeniedReason")
    protected EntityAccessDeniedReason entityAccessDeniedReason;
    @XmlElement(name = "EntityCountLimitExceededReason")
    protected EntityCountLimitExceededReason entityCountLimitExceededReason;
    @XmlElement(name = "EntityNotFoundReason")
    protected EntityNotFoundReason entityNotFoundReason;
    @XmlElement(name = "ExperimentErrorReason")
    protected ExperimentErrorReason experimentErrorReason;
    @XmlElement(name = "FeedItemErrorReason")
    protected FeedItemErrorReason feedItemErrorReason;
    @XmlElement(name = "ForwardCompatibilityErrorReason")
    protected ForwardCompatibilityErrorReason forwardCompatibilityErrorReason;
    @XmlElement(name = "FunctionErrorReason")
    protected FunctionErrorReason functionErrorReason;
    @XmlElement(name = "IdErrorReason")
    protected IdErrorReason idErrorReason;
    @XmlElement(name = "ImageErrorReason")
    protected ImageErrorReason imageErrorReason;
    @XmlElement(name = "InternalApiErrorReason")
    protected InternalApiErrorReason internalApiErrorReason;
    @XmlElement(name = "JobErrorReason")
    protected JobErrorReason jobErrorReason;
    @XmlElement(name = "MediaErrorReason")
    protected MediaErrorReason mediaErrorReason;
    @XmlElement(name = "NewEntityCreationErrorReason")
    protected NewEntityCreationErrorReason newEntityCreationErrorReason;
    @XmlElement(name = "NotEmptyErrorReason")
    protected NotEmptyErrorReason notEmptyErrorReason;
    @XmlElement(name = "NullErrorReason")
    protected NullErrorReason nullErrorReason;
    @XmlElement(name = "OperationAccessDeniedReason")
    protected OperationAccessDeniedReason operationAccessDeniedReason;
    @XmlElement(name = "OperatorErrorReason")
    protected OperatorErrorReason operatorErrorReason;
    @XmlElement(name = "PagingErrorReason")
    protected PagingErrorReason pagingErrorReason;
    @XmlElement(name = "PolicyViolationErrorReason")
    protected PolicyViolationErrorReason policyViolationErrorReason;
    @XmlElement(name = "QueryErrorReason")
    protected QueryErrorReason queryErrorReason;
    @XmlElement(name = "QuotaCheckErrorReason")
    protected QuotaCheckErrorReason quotaCheckErrorReason;
    @XmlElement(name = "QuotaErrorReason")
    protected QuotaErrorReason quotaErrorReason;
    @XmlElement(name = "RangeErrorReason")
    protected RangeErrorReason rangeErrorReason;
    @XmlElement(name = "RateExceededErrorReason")
    protected RateExceededErrorReason rateExceededErrorReason;
    @XmlElement(name = "ReadOnlyErrorReason")
    protected ReadOnlyErrorReason readOnlyErrorReason;
    @XmlElement(name = "RegionCodeErrorReason")
    protected RegionCodeErrorReason regionCodeErrorReason;
    @XmlElement(name = "RejectedErrorReason")
    protected RejectedErrorReason rejectedErrorReason;
    @XmlElement(name = "RequestErrorReason")
    protected RequestErrorReason requestErrorReason;
    @XmlElement(name = "RequiredErrorReason")
    protected RequiredErrorReason requiredErrorReason;
    @XmlElement(name = "SelectorErrorReason")
    protected SelectorErrorReason selectorErrorReason;
    @XmlElement(name = "SettingErrorReason")
    protected SettingErrorReason settingErrorReason;
    @XmlElement(name = "SizeLimitErrorReason")
    protected SizeLimitErrorReason sizeLimitErrorReason;
    @XmlElement(name = "StatsQueryErrorReason")
    protected StatsQueryErrorReason statsQueryErrorReason;
    @XmlElement(name = "StringLengthErrorReason")
    protected StringLengthErrorReason stringLengthErrorReason;
    @XmlElement(name = "TargetErrorReason")
    protected TargetErrorReason targetErrorReason;

    /**
     * Gets the value of the adErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdErrorReason }
     *     
     */
    public AdErrorReason getAdErrorReason() {
        return adErrorReason;
    }

    /**
     * Sets the value of the adErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdErrorReason }
     *     
     */
    public void setAdErrorReason(AdErrorReason value) {
        this.adErrorReason = value;
    }

    /**
     * Gets the value of the adExtensionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionErrorReason }
     *     
     */
    public AdExtensionErrorReason getAdExtensionErrorReason() {
        return adExtensionErrorReason;
    }

    /**
     * Sets the value of the adExtensionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionErrorReason }
     *     
     */
    public void setAdExtensionErrorReason(AdExtensionErrorReason value) {
        this.adExtensionErrorReason = value;
    }

    /**
     * Gets the value of the adExtensionOverrideErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionOverrideErrorReason }
     *     
     */
    public AdExtensionOverrideErrorReason getAdExtensionOverrideErrorReason() {
        return adExtensionOverrideErrorReason;
    }

    /**
     * Sets the value of the adExtensionOverrideErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionOverrideErrorReason }
     *     
     */
    public void setAdExtensionOverrideErrorReason(AdExtensionOverrideErrorReason value) {
        this.adExtensionOverrideErrorReason = value;
    }

    /**
     * Gets the value of the adGroupAdErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAdErrorReason }
     *     
     */
    public AdGroupAdErrorReason getAdGroupAdErrorReason() {
        return adGroupAdErrorReason;
    }

    /**
     * Sets the value of the adGroupAdErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAdErrorReason }
     *     
     */
    public void setAdGroupAdErrorReason(AdGroupAdErrorReason value) {
        this.adGroupAdErrorReason = value;
    }

    /**
     * Gets the value of the adGroupCriterionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterionErrorReason }
     *     
     */
    public AdGroupCriterionErrorReason getAdGroupCriterionErrorReason() {
        return adGroupCriterionErrorReason;
    }

    /**
     * Sets the value of the adGroupCriterionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterionErrorReason }
     *     
     */
    public void setAdGroupCriterionErrorReason(AdGroupCriterionErrorReason value) {
        this.adGroupCriterionErrorReason = value;
    }

    /**
     * Gets the value of the adGroupServiceErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupServiceErrorReason }
     *     
     */
    public AdGroupServiceErrorReason getAdGroupServiceErrorReason() {
        return adGroupServiceErrorReason;
    }

    /**
     * Sets the value of the adGroupServiceErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupServiceErrorReason }
     *     
     */
    public void setAdGroupServiceErrorReason(AdGroupServiceErrorReason value) {
        this.adGroupServiceErrorReason = value;
    }

    /**
     * Gets the value of the adxErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AdxErrorReason }
     *     
     */
    public AdxErrorReason getAdxErrorReason() {
        return adxErrorReason;
    }

    /**
     * Sets the value of the adxErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdxErrorReason }
     *     
     */
    public void setAdxErrorReason(AdxErrorReason value) {
        this.adxErrorReason = value;
    }

    /**
     * Gets the value of the authenticationErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationErrorReason }
     *     
     */
    public AuthenticationErrorReason getAuthenticationErrorReason() {
        return authenticationErrorReason;
    }

    /**
     * Sets the value of the authenticationErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationErrorReason }
     *     
     */
    public void setAuthenticationErrorReason(AuthenticationErrorReason value) {
        this.authenticationErrorReason = value;
    }

    /**
     * Gets the value of the authorizationErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationErrorReason }
     *     
     */
    public AuthorizationErrorReason getAuthorizationErrorReason() {
        return authorizationErrorReason;
    }

    /**
     * Sets the value of the authorizationErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationErrorReason }
     *     
     */
    public void setAuthorizationErrorReason(AuthorizationErrorReason value) {
        this.authorizationErrorReason = value;
    }

    /**
     * Gets the value of the betaErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link BetaErrorReason }
     *     
     */
    public BetaErrorReason getBetaErrorReason() {
        return betaErrorReason;
    }

    /**
     * Sets the value of the betaErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetaErrorReason }
     *     
     */
    public void setBetaErrorReason(BetaErrorReason value) {
        this.betaErrorReason = value;
    }

    /**
     * Gets the value of the biddingErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingErrorReason }
     *     
     */
    public BiddingErrorReason getBiddingErrorReason() {
        return biddingErrorReason;
    }

    /**
     * Sets the value of the biddingErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingErrorReason }
     *     
     */
    public void setBiddingErrorReason(BiddingErrorReason value) {
        this.biddingErrorReason = value;
    }

    /**
     * Gets the value of the biddingErrorsReason property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingErrorsReason }
     *     
     */
    public BiddingErrorsReason getBiddingErrorsReason() {
        return biddingErrorsReason;
    }

    /**
     * Sets the value of the biddingErrorsReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingErrorsReason }
     *     
     */
    public void setBiddingErrorsReason(BiddingErrorsReason value) {
        this.biddingErrorsReason = value;
    }

    /**
     * Gets the value of the biddingTransitionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingTransitionErrorReason }
     *     
     */
    public BiddingTransitionErrorReason getBiddingTransitionErrorReason() {
        return biddingTransitionErrorReason;
    }

    /**
     * Sets the value of the biddingTransitionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingTransitionErrorReason }
     *     
     */
    public void setBiddingTransitionErrorReason(BiddingTransitionErrorReason value) {
        this.biddingTransitionErrorReason = value;
    }

    /**
     * Gets the value of the budgetErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetErrorReason }
     *     
     */
    public BudgetErrorReason getBudgetErrorReason() {
        return budgetErrorReason;
    }

    /**
     * Sets the value of the budgetErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetErrorReason }
     *     
     */
    public void setBudgetErrorReason(BudgetErrorReason value) {
        this.budgetErrorReason = value;
    }

    /**
     * Gets the value of the bulkMutateJobErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link BulkMutateJobErrorReason }
     *     
     */
    public BulkMutateJobErrorReason getBulkMutateJobErrorReason() {
        return bulkMutateJobErrorReason;
    }

    /**
     * Sets the value of the bulkMutateJobErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkMutateJobErrorReason }
     *     
     */
    public void setBulkMutateJobErrorReason(BulkMutateJobErrorReason value) {
        this.bulkMutateJobErrorReason = value;
    }

    /**
     * Gets the value of the campaignAdExtensionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAdExtensionErrorReason }
     *     
     */
    public CampaignAdExtensionErrorReason getCampaignAdExtensionErrorReason() {
        return campaignAdExtensionErrorReason;
    }

    /**
     * Sets the value of the campaignAdExtensionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAdExtensionErrorReason }
     *     
     */
    public void setCampaignAdExtensionErrorReason(CampaignAdExtensionErrorReason value) {
        this.campaignAdExtensionErrorReason = value;
    }

    /**
     * Gets the value of the campaignCriterionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignCriterionErrorReason }
     *     
     */
    public CampaignCriterionErrorReason getCampaignCriterionErrorReason() {
        return campaignCriterionErrorReason;
    }

    /**
     * Sets the value of the campaignCriterionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignCriterionErrorReason }
     *     
     */
    public void setCampaignCriterionErrorReason(CampaignCriterionErrorReason value) {
        this.campaignCriterionErrorReason = value;
    }

    /**
     * Gets the value of the campaignErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignErrorReason }
     *     
     */
    public CampaignErrorReason getCampaignErrorReason() {
        return campaignErrorReason;
    }

    /**
     * Sets the value of the campaignErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignErrorReason }
     *     
     */
    public void setCampaignErrorReason(CampaignErrorReason value) {
        this.campaignErrorReason = value;
    }

    /**
     * Gets the value of the clientTermsErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTermsErrorReason }
     *     
     */
    public ClientTermsErrorReason getClientTermsErrorReason() {
        return clientTermsErrorReason;
    }

    /**
     * Sets the value of the clientTermsErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTermsErrorReason }
     *     
     */
    public void setClientTermsErrorReason(ClientTermsErrorReason value) {
        this.clientTermsErrorReason = value;
    }

    /**
     * Gets the value of the criterionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionErrorReason }
     *     
     */
    public CriterionErrorReason getCriterionErrorReason() {
        return criterionErrorReason;
    }

    /**
     * Sets the value of the criterionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionErrorReason }
     *     
     */
    public void setCriterionErrorReason(CriterionErrorReason value) {
        this.criterionErrorReason = value;
    }

    /**
     * Gets the value of the databaseErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseErrorReason }
     *     
     */
    public DatabaseErrorReason getDatabaseErrorReason() {
        return databaseErrorReason;
    }

    /**
     * Sets the value of the databaseErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseErrorReason }
     *     
     */
    public void setDatabaseErrorReason(DatabaseErrorReason value) {
        this.databaseErrorReason = value;
    }

    /**
     * Gets the value of the dateErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link DateErrorReason }
     *     
     */
    public DateErrorReason getDateErrorReason() {
        return dateErrorReason;
    }

    /**
     * Sets the value of the dateErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateErrorReason }
     *     
     */
    public void setDateErrorReason(DateErrorReason value) {
        this.dateErrorReason = value;
    }

    /**
     * Gets the value of the distinctErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link DistinctErrorReason }
     *     
     */
    public DistinctErrorReason getDistinctErrorReason() {
        return distinctErrorReason;
    }

    /**
     * Sets the value of the distinctErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinctErrorReason }
     *     
     */
    public void setDistinctErrorReason(DistinctErrorReason value) {
        this.distinctErrorReason = value;
    }

    /**
     * Gets the value of the entityAccessDeniedReason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAccessDeniedReason }
     *     
     */
    public EntityAccessDeniedReason getEntityAccessDeniedReason() {
        return entityAccessDeniedReason;
    }

    /**
     * Sets the value of the entityAccessDeniedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAccessDeniedReason }
     *     
     */
    public void setEntityAccessDeniedReason(EntityAccessDeniedReason value) {
        this.entityAccessDeniedReason = value;
    }

    /**
     * Gets the value of the entityCountLimitExceededReason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCountLimitExceededReason }
     *     
     */
    public EntityCountLimitExceededReason getEntityCountLimitExceededReason() {
        return entityCountLimitExceededReason;
    }

    /**
     * Sets the value of the entityCountLimitExceededReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCountLimitExceededReason }
     *     
     */
    public void setEntityCountLimitExceededReason(EntityCountLimitExceededReason value) {
        this.entityCountLimitExceededReason = value;
    }

    /**
     * Gets the value of the entityNotFoundReason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNotFoundReason }
     *     
     */
    public EntityNotFoundReason getEntityNotFoundReason() {
        return entityNotFoundReason;
    }

    /**
     * Sets the value of the entityNotFoundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNotFoundReason }
     *     
     */
    public void setEntityNotFoundReason(EntityNotFoundReason value) {
        this.entityNotFoundReason = value;
    }

    /**
     * Gets the value of the experimentErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentErrorReason }
     *     
     */
    public ExperimentErrorReason getExperimentErrorReason() {
        return experimentErrorReason;
    }

    /**
     * Sets the value of the experimentErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentErrorReason }
     *     
     */
    public void setExperimentErrorReason(ExperimentErrorReason value) {
        this.experimentErrorReason = value;
    }

    /**
     * Gets the value of the feedItemErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemErrorReason }
     *     
     */
    public FeedItemErrorReason getFeedItemErrorReason() {
        return feedItemErrorReason;
    }

    /**
     * Sets the value of the feedItemErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemErrorReason }
     *     
     */
    public void setFeedItemErrorReason(FeedItemErrorReason value) {
        this.feedItemErrorReason = value;
    }

    /**
     * Gets the value of the forwardCompatibilityErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardCompatibilityErrorReason }
     *     
     */
    public ForwardCompatibilityErrorReason getForwardCompatibilityErrorReason() {
        return forwardCompatibilityErrorReason;
    }

    /**
     * Sets the value of the forwardCompatibilityErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardCompatibilityErrorReason }
     *     
     */
    public void setForwardCompatibilityErrorReason(ForwardCompatibilityErrorReason value) {
        this.forwardCompatibilityErrorReason = value;
    }

    /**
     * Gets the value of the functionErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionErrorReason }
     *     
     */
    public FunctionErrorReason getFunctionErrorReason() {
        return functionErrorReason;
    }

    /**
     * Sets the value of the functionErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionErrorReason }
     *     
     */
    public void setFunctionErrorReason(FunctionErrorReason value) {
        this.functionErrorReason = value;
    }

    /**
     * Gets the value of the idErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link IdErrorReason }
     *     
     */
    public IdErrorReason getIdErrorReason() {
        return idErrorReason;
    }

    /**
     * Sets the value of the idErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdErrorReason }
     *     
     */
    public void setIdErrorReason(IdErrorReason value) {
        this.idErrorReason = value;
    }

    /**
     * Gets the value of the imageErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link ImageErrorReason }
     *     
     */
    public ImageErrorReason getImageErrorReason() {
        return imageErrorReason;
    }

    /**
     * Sets the value of the imageErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageErrorReason }
     *     
     */
    public void setImageErrorReason(ImageErrorReason value) {
        this.imageErrorReason = value;
    }

    /**
     * Gets the value of the internalApiErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link InternalApiErrorReason }
     *     
     */
    public InternalApiErrorReason getInternalApiErrorReason() {
        return internalApiErrorReason;
    }

    /**
     * Sets the value of the internalApiErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalApiErrorReason }
     *     
     */
    public void setInternalApiErrorReason(InternalApiErrorReason value) {
        this.internalApiErrorReason = value;
    }

    /**
     * Gets the value of the jobErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link JobErrorReason }
     *     
     */
    public JobErrorReason getJobErrorReason() {
        return jobErrorReason;
    }

    /**
     * Sets the value of the jobErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobErrorReason }
     *     
     */
    public void setJobErrorReason(JobErrorReason value) {
        this.jobErrorReason = value;
    }

    /**
     * Gets the value of the mediaErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link MediaErrorReason }
     *     
     */
    public MediaErrorReason getMediaErrorReason() {
        return mediaErrorReason;
    }

    /**
     * Sets the value of the mediaErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaErrorReason }
     *     
     */
    public void setMediaErrorReason(MediaErrorReason value) {
        this.mediaErrorReason = value;
    }

    /**
     * Gets the value of the newEntityCreationErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link NewEntityCreationErrorReason }
     *     
     */
    public NewEntityCreationErrorReason getNewEntityCreationErrorReason() {
        return newEntityCreationErrorReason;
    }

    /**
     * Sets the value of the newEntityCreationErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewEntityCreationErrorReason }
     *     
     */
    public void setNewEntityCreationErrorReason(NewEntityCreationErrorReason value) {
        this.newEntityCreationErrorReason = value;
    }

    /**
     * Gets the value of the notEmptyErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link NotEmptyErrorReason }
     *     
     */
    public NotEmptyErrorReason getNotEmptyErrorReason() {
        return notEmptyErrorReason;
    }

    /**
     * Sets the value of the notEmptyErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotEmptyErrorReason }
     *     
     */
    public void setNotEmptyErrorReason(NotEmptyErrorReason value) {
        this.notEmptyErrorReason = value;
    }

    /**
     * Gets the value of the nullErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link NullErrorReason }
     *     
     */
    public NullErrorReason getNullErrorReason() {
        return nullErrorReason;
    }

    /**
     * Sets the value of the nullErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullErrorReason }
     *     
     */
    public void setNullErrorReason(NullErrorReason value) {
        this.nullErrorReason = value;
    }

    /**
     * Gets the value of the operationAccessDeniedReason property.
     * 
     * @return
     *     possible object is
     *     {@link OperationAccessDeniedReason }
     *     
     */
    public OperationAccessDeniedReason getOperationAccessDeniedReason() {
        return operationAccessDeniedReason;
    }

    /**
     * Sets the value of the operationAccessDeniedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationAccessDeniedReason }
     *     
     */
    public void setOperationAccessDeniedReason(OperationAccessDeniedReason value) {
        this.operationAccessDeniedReason = value;
    }

    /**
     * Gets the value of the operatorErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorErrorReason }
     *     
     */
    public OperatorErrorReason getOperatorErrorReason() {
        return operatorErrorReason;
    }

    /**
     * Sets the value of the operatorErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorErrorReason }
     *     
     */
    public void setOperatorErrorReason(OperatorErrorReason value) {
        this.operatorErrorReason = value;
    }

    /**
     * Gets the value of the pagingErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link PagingErrorReason }
     *     
     */
    public PagingErrorReason getPagingErrorReason() {
        return pagingErrorReason;
    }

    /**
     * Sets the value of the pagingErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingErrorReason }
     *     
     */
    public void setPagingErrorReason(PagingErrorReason value) {
        this.pagingErrorReason = value;
    }

    /**
     * Gets the value of the policyViolationErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyViolationErrorReason }
     *     
     */
    public PolicyViolationErrorReason getPolicyViolationErrorReason() {
        return policyViolationErrorReason;
    }

    /**
     * Sets the value of the policyViolationErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyViolationErrorReason }
     *     
     */
    public void setPolicyViolationErrorReason(PolicyViolationErrorReason value) {
        this.policyViolationErrorReason = value;
    }

    /**
     * Gets the value of the queryErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryErrorReason }
     *     
     */
    public QueryErrorReason getQueryErrorReason() {
        return queryErrorReason;
    }

    /**
     * Sets the value of the queryErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryErrorReason }
     *     
     */
    public void setQueryErrorReason(QueryErrorReason value) {
        this.queryErrorReason = value;
    }

    /**
     * Gets the value of the quotaCheckErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaCheckErrorReason }
     *     
     */
    public QuotaCheckErrorReason getQuotaCheckErrorReason() {
        return quotaCheckErrorReason;
    }

    /**
     * Sets the value of the quotaCheckErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaCheckErrorReason }
     *     
     */
    public void setQuotaCheckErrorReason(QuotaCheckErrorReason value) {
        this.quotaCheckErrorReason = value;
    }

    /**
     * Gets the value of the quotaErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaErrorReason }
     *     
     */
    public QuotaErrorReason getQuotaErrorReason() {
        return quotaErrorReason;
    }

    /**
     * Sets the value of the quotaErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaErrorReason }
     *     
     */
    public void setQuotaErrorReason(QuotaErrorReason value) {
        this.quotaErrorReason = value;
    }

    /**
     * Gets the value of the rangeErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link RangeErrorReason }
     *     
     */
    public RangeErrorReason getRangeErrorReason() {
        return rangeErrorReason;
    }

    /**
     * Sets the value of the rangeErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeErrorReason }
     *     
     */
    public void setRangeErrorReason(RangeErrorReason value) {
        this.rangeErrorReason = value;
    }

    /**
     * Gets the value of the rateExceededErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link RateExceededErrorReason }
     *     
     */
    public RateExceededErrorReason getRateExceededErrorReason() {
        return rateExceededErrorReason;
    }

    /**
     * Sets the value of the rateExceededErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateExceededErrorReason }
     *     
     */
    public void setRateExceededErrorReason(RateExceededErrorReason value) {
        this.rateExceededErrorReason = value;
    }

    /**
     * Gets the value of the readOnlyErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReadOnlyErrorReason }
     *     
     */
    public ReadOnlyErrorReason getReadOnlyErrorReason() {
        return readOnlyErrorReason;
    }

    /**
     * Sets the value of the readOnlyErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadOnlyErrorReason }
     *     
     */
    public void setReadOnlyErrorReason(ReadOnlyErrorReason value) {
        this.readOnlyErrorReason = value;
    }

    /**
     * Gets the value of the regionCodeErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeErrorReason }
     *     
     */
    public RegionCodeErrorReason getRegionCodeErrorReason() {
        return regionCodeErrorReason;
    }

    /**
     * Sets the value of the regionCodeErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeErrorReason }
     *     
     */
    public void setRegionCodeErrorReason(RegionCodeErrorReason value) {
        this.regionCodeErrorReason = value;
    }

    /**
     * Gets the value of the rejectedErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedErrorReason }
     *     
     */
    public RejectedErrorReason getRejectedErrorReason() {
        return rejectedErrorReason;
    }

    /**
     * Sets the value of the rejectedErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedErrorReason }
     *     
     */
    public void setRejectedErrorReason(RejectedErrorReason value) {
        this.rejectedErrorReason = value;
    }

    /**
     * Gets the value of the requestErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorReason }
     *     
     */
    public RequestErrorReason getRequestErrorReason() {
        return requestErrorReason;
    }

    /**
     * Sets the value of the requestErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorReason }
     *     
     */
    public void setRequestErrorReason(RequestErrorReason value) {
        this.requestErrorReason = value;
    }

    /**
     * Gets the value of the requiredErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredErrorReason }
     *     
     */
    public RequiredErrorReason getRequiredErrorReason() {
        return requiredErrorReason;
    }

    /**
     * Sets the value of the requiredErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredErrorReason }
     *     
     */
    public void setRequiredErrorReason(RequiredErrorReason value) {
        this.requiredErrorReason = value;
    }

    /**
     * Gets the value of the selectorErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link SelectorErrorReason }
     *     
     */
    public SelectorErrorReason getSelectorErrorReason() {
        return selectorErrorReason;
    }

    /**
     * Sets the value of the selectorErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectorErrorReason }
     *     
     */
    public void setSelectorErrorReason(SelectorErrorReason value) {
        this.selectorErrorReason = value;
    }

    /**
     * Gets the value of the settingErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link SettingErrorReason }
     *     
     */
    public SettingErrorReason getSettingErrorReason() {
        return settingErrorReason;
    }

    /**
     * Sets the value of the settingErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettingErrorReason }
     *     
     */
    public void setSettingErrorReason(SettingErrorReason value) {
        this.settingErrorReason = value;
    }

    /**
     * Gets the value of the sizeLimitErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link SizeLimitErrorReason }
     *     
     */
    public SizeLimitErrorReason getSizeLimitErrorReason() {
        return sizeLimitErrorReason;
    }

    /**
     * Sets the value of the sizeLimitErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeLimitErrorReason }
     *     
     */
    public void setSizeLimitErrorReason(SizeLimitErrorReason value) {
        this.sizeLimitErrorReason = value;
    }

    /**
     * Gets the value of the statsQueryErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link StatsQueryErrorReason }
     *     
     */
    public StatsQueryErrorReason getStatsQueryErrorReason() {
        return statsQueryErrorReason;
    }

    /**
     * Sets the value of the statsQueryErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsQueryErrorReason }
     *     
     */
    public void setStatsQueryErrorReason(StatsQueryErrorReason value) {
        this.statsQueryErrorReason = value;
    }

    /**
     * Gets the value of the stringLengthErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link StringLengthErrorReason }
     *     
     */
    public StringLengthErrorReason getStringLengthErrorReason() {
        return stringLengthErrorReason;
    }

    /**
     * Sets the value of the stringLengthErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringLengthErrorReason }
     *     
     */
    public void setStringLengthErrorReason(StringLengthErrorReason value) {
        this.stringLengthErrorReason = value;
    }

    /**
     * Gets the value of the targetErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link TargetErrorReason }
     *     
     */
    public TargetErrorReason getTargetErrorReason() {
        return targetErrorReason;
    }

    /**
     * Sets the value of the targetErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetErrorReason }
     *     
     */
    public void setTargetErrorReason(TargetErrorReason value) {
        this.targetErrorReason = value;
    }

}
