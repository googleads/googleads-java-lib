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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.billing.BudgetOrderError;
import com.google.api.ads.adwords.jaxws.v201802.billing.CustomerOrderLineError;
import com.google.api.ads.adwords.jaxws.v201802.ch.CustomerSyncError;
import com.google.api.ads.adwords.jaxws.v201802.mcm.CustomerError;
import com.google.api.ads.adwords.jaxws.v201802.mcm.LabelServiceError;
import com.google.api.ads.adwords.jaxws.v201802.mcm.ManagedCustomerServiceError;
import com.google.api.ads.adwords.jaxws.v201802.o.TargetingIdeaError;
import com.google.api.ads.adwords.jaxws.v201802.o.TrafficEstimatorError;
import com.google.api.ads.adwords.jaxws.v201802.rm.MutateMembersError;
import com.google.api.ads.adwords.jaxws.v201802.rm.OfflineDataUploadError;
import com.google.api.ads.adwords.jaxws.v201802.rm.UserListError;


/**
 * 
 *             The API error base class that provides details about an error that occurred
 *             while processing a service request.
 *             
 *             <p>The OGNL field path is provided for parsers to identify the request data
 *             element that may have caused the error.</p>
 *           
 * 
 * <p>Java class for ApiError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldPathElements" type="{https://adwords.google.com/api/adwords/cm/v201802}FieldPathElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApiError.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiError", propOrder = {
    "fieldPath",
    "fieldPathElements",
    "trigger",
    "errorString",
    "apiErrorType"
})
@XmlSeeAlso({
    UserListError.class,
    OfflineDataUploadError.class,
    MutateMembersError.class,
    com.google.api.ads.adwords.jaxws.v201802.rm.CurrencyCodeError.class,
    CustomerError.class,
    LabelServiceError.class,
    ManagedCustomerServiceError.class,
    com.google.api.ads.adwords.jaxws.v201802.mcm.CurrencyCodeError.class,
    TargetingIdeaError.class,
    TrafficEstimatorError.class,
    com.google.api.ads.adwords.jaxws.v201802.o.CurrencyCodeError.class,
    BudgetOrderError.class,
    CustomerOrderLineError.class,
    CustomerSyncError.class,
    FeedItemTargetError.class,
    DataError.class,
    OfflineConversionError.class,
    ReportDefinitionError.class,
    MultiplierError.class,
    NotEmptyError.class,
    DistinctError.class,
    AdCustomizerFeedError.class,
    RateExceededError.class,
    LocationCriterionServiceError.class,
    FunctionError.class,
    com.google.api.ads.adwords.jaxws.v201802.cm.CurrencyCodeError.class,
    TaskExecutionError.class,
    LabelError.class,
    CampaignSharedSetError.class,
    NullError.class,
    AdxError.class,
    StringLengthError.class,
    AdGroupServiceError.class,
    CollectionSizeError.class,
    SharedSetError.class,
    SelectorError.class,
    FeedItemError.class,
    CampaignCriterionError.class,
    RejectedError.class,
    MediaBundleError.class,
    AdGroupCriterionError.class,
    SharedCriterionError.class,
    EntityNotFound.class,
    EntityAccessDenied.class,
    FunctionParsingError.class,
    RequiredError.class,
    CampaignGroupPerformanceTargetError.class,
    CampaignFeedError.class,
    QueryError.class,
    OfflineCallConversionError.class,
    CriterionError.class,
    ReadOnlyError.class,
    BiddingStrategyError.class,
    PagingError.class,
    UrlError.class,
    CustomerNegativeCriterionError.class,
    CampaignPreferenceError.class,
    MediaError.class,
    ExtensionSettingError.class,
    IdError.class,
    PerformanceTargetError.class,
    TrialError.class,
    StringFormatError.class,
    DateError.class,
    BiddingErrors.class,
    BudgetError.class,
    ClientTermsError.class,
    AdSharingError.class,
    CustomerFeedError.class,
    AudioError.class,
    OperationAccessDenied.class,
    NotWhitelistedError.class,
    AdCustomizerError.class,
    SettingError.class,
    VideoError.class,
    AdError.class,
    SizeLimitError.class,
    AppPostbackUrlError.class,
    PolicyViolationError.class,
    OperatorError.class,
    RequestError.class,
    CampaignBidModifierError.class,
    FeedMappingError.class,
    FeedError.class,
    BatchJobProcessingError.class,
    ListError.class,
    CampaignGroupError.class,
    ImageError.class,
    DraftError.class,
    NewEntityCreationError.class,
    EntityCountLimitExceeded.class,
    CampaignError.class,
    StatsQueryError.class,
    AuthenticationError.class,
    ConversionTrackingError.class,
    AuthorizationError.class,
    InternalApiError.class,
    AdGroupFeedError.class,
    DateRangeError.class,
    AdGroupAdError.class,
    FeedAttributeReferenceError.class,
    ForwardCompatibilityError.class,
    QuotaCheckError.class,
    RegionCodeError.class,
    BatchJobError.class,
    AdParamError.class,
    RangeError.class,
    DatabaseError.class
})
public abstract class ApiError {

    protected String fieldPath;
    protected List<FieldPathElement> fieldPathElements;
    protected String trigger;
    protected String errorString;
    @XmlElement(name = "ApiError.Type")
    protected String apiErrorType;

    /**
     * Gets the value of the fieldPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldPath() {
        return fieldPath;
    }

    /**
     * Sets the value of the fieldPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldPath(String value) {
        this.fieldPath = value;
    }

    /**
     * Gets the value of the fieldPathElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldPathElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldPathElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldPathElement }
     * 
     * 
     */
    public List<FieldPathElement> getFieldPathElements() {
        if (fieldPathElements == null) {
            fieldPathElements = new ArrayList<FieldPathElement>();
        }
        return this.fieldPathElements;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

    /**
     * Gets the value of the apiErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiErrorType() {
        return apiErrorType;
    }

    /**
     * Sets the value of the apiErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiErrorType(String value) {
        this.apiErrorType = value;
    }

}
