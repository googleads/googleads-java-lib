// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ApiError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldPathElements" type="{https://www.google.com/apis/ads/publisher/v202311}FieldPathElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiError", propOrder = {
    "fieldPath",
    "fieldPathElements",
    "trigger",
    "errorString"
})
@XmlSeeAlso({
    AdSenseAccountError.class,
    AdUnitCodeError.class,
    AdUnitHierarchyError.class,
    ApiVersionError.class,
    AuthenticationError.class,
    CollectionSizeError.class,
    CommonError.class,
    CompanyError.class,
    CreativeWrapperError.class,
    CrossSellError.class,
    EntityChildrenLimitReachedError.class,
    EntityLimitReachedError.class,
    FeatureError.class,
    FrequencyCapError.class,
    InternalApiError.class,
    InvalidColorError.class,
    InvalidUrlError.class,
    InventoryUnitError.class,
    InventoryUnitRefreshRateError.class,
    InventoryUnitSizesError.class,
    LabelEntityAssociationError.class,
    NotNullError.class,
    NullError.class,
    ParseError.class,
    PermissionError.class,
    PublisherQueryLanguageContextError.class,
    PublisherQueryLanguageSyntaxError.class,
    QuotaError.class,
    RangeError.class,
    RegExError.class,
    RequiredCollectionError.class,
    RequiredError.class,
    RequiredNumberError.class,
    ServerError.class,
    StatementError.class,
    StringFormatError.class,
    StringLengthError.class,
    TeamError.class,
    TypeError.class,
    UniqueError.class,
    CompanyCreditStatusError.class,
    CustomFieldValueError.class,
    ExchangeSignupApiError.class,
    InvalidEmailError.class,
    InventoryClientApiError.class,
    NetworkError.class,
    SiteError.class,
    AssetError.class,
    AudienceExtensionError.class,
    ClickTrackingLineItemError.class,
    CreativeError.class,
    CurrencyCodeError.class,
    CustomTargetingError.class,
    DateTimeRangeTargetingError.class,
    DayPartTargetingError.class,
    ForecastError.class,
    GenericTargetingError.class,
    GeoTargetingError.class,
    GrpSettingsError.class,
    ImageError.class,
    InventoryTargetingError.class,
    LineItemActivityAssociationError.class,
    LineItemCreativeAssociationError.class,
    LineItemError.class,
    LineItemFlightDateError.class,
    LineItemOperationError.class,
    MobileApplicationTargetingError.class,
    OrderActionError.class,
    OrderError.class,
    PrecisionError.class,
    ProgrammaticError.class,
    RequestPlatformTargetingError.class,
    RequiredSizeError.class,
    ReservationDetailsError.class,
    AudienceSegmentError.class,
    SetTopBoxLineItemError.class,
    TechnologyTargetingError.class,
    TemplateInstantiatedCreativeError.class,
    TimeZoneError.class,
    TranscodingError.class,
    UserDomainTargetingError.class,
    VideoPositionTargetingError.class,
    CreativeAssetMacroError.class,
    CreativePreviewError.class,
    CreativeSetError.class,
    CreativeTemplateError.class,
    CreativeTemplateOperationError.class,
    CustomCreativeError.class,
    FileError.class,
    HtmlBundleProcessorError.class,
    InvalidPhoneNumberError.class,
    LineItemCreativeAssociationOperationError.class,
    RichMediaStudioCreativeError.class,
    SetTopBoxCreativeError.class,
    SwiffyConversionError.class,
    TokenError.class,
    PlacementError.class,
    ReportError.class,
    DateError.class,
    LiveStreamEventSlateError.class,
    RequestError.class,
    UrlError.class,
    DealError.class,
    ExchangeRateError.class,
    LabelError.class,
    CustomFieldError.class,
    ActivityError.class,
    AdRuleDateError.class,
    AdRuleError.class,
    AdRuleFrequencyCapError.class,
    AdRulePriorityError.class,
    AdRuleSlotError.class,
    AdRuleTargetingError.class,
    PoddingError.class,
    ContentFilterError.class,
    ContactError.class,
    BillingError.class,
    ProposalActionError.class,
    ProposalError.class,
    ProposalLineItemError.class,
    ProposalLineItemMakegoodError.class,
    ProposalLineItemProgrammaticError.class,
    PreferredDealError.class,
    ProposalLineItemActionError.class,
    AdBreakMarkupError.class,
    LiveStreamEventActionError.class,
    LiveStreamEventCdnSettingsError.class,
    LiveStreamEventConditioningError.class,
    LiveStreamEventCustomAssetKeyError.class,
    LiveStreamEventDateTimeError.class,
    LiveStreamEventDvrWindowError.class,
    LiveStreamEventPrerollSettingsError.class,
    VideoAdTagError.class,
    MobileApplicationActionError.class,
    MobileApplicationError.class,
    NativeStyleError.class,
    CdnConfigurationError.class,
    DaiAuthenticationKeyActionError.class,
    ForecastAdjustmentError.class,
    TrafficForecastSegmentError.class,
    MetadataMergeSpecError.class,
    SamSessionError.class,
    DaiEncodingProfileAdMatchingError.class,
    DaiEncodingProfileContainerSettingsError.class,
    DaiEncodingProfileNameError.class,
    DaiEncodingProfileUpdateError.class,
    DaiEncodingProfileVariantSettingsError.class,
    DistinctError.class,
    IdError.class,
    YieldError.class,
    SegmentPopulationError.class
})
public abstract class ApiError {

    protected String fieldPath;
    protected List<FieldPathElement> fieldPathElements;
    protected String trigger;
    protected String errorString;

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

}
