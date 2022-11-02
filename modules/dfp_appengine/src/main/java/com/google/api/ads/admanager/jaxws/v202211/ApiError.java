// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

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
 * &lt;complexType name="ApiError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldPathElements" type="{https://www.google.com/apis/ads/publisher/v202211}FieldPathElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "errorString"
})
@XmlSeeAlso({
    AdBreakMarkupError.class,
    AdRuleTargetingError.class,
    TemplateInstantiatedCreativeError.class,
    PublisherQueryLanguageContextError.class,
    DistinctError.class,
    CustomFieldError.class,
    AdSenseAccountError.class,
    CreativeTemplateError.class,
    ActivityError.class,
    CurrencyCodeError.class,
    ForecastError.class,
    DateTimeRangeTargetingError.class,
    GenericTargetingError.class,
    ServerError.class,
    DaiEncodingProfileNameError.class,
    PrecisionError.class,
    NativeStyleError.class,
    AdRuleFrequencyCapError.class,
    SiteError.class,
    UserDomainTargetingError.class,
    CustomCreativeError.class,
    RequiredSizeError.class,
    RequiredCollectionError.class,
    ProposalLineItemActionError.class,
    LiveStreamEventCustomAssetKeyError.class,
    CompanyCreditStatusError.class,
    TrafficForecastSegmentError.class,
    ContactError.class,
    ContentFilterError.class,
    RequestPlatformTargetingError.class,
    QuotaError.class,
    CreativeWrapperError.class,
    IdError.class,
    ClickTrackingLineItemError.class,
    ParseError.class,
    MobileApplicationActionError.class,
    SetTopBoxCreativeError.class,
    DateError.class,
    AdRuleDateError.class,
    TeamError.class,
    LiveStreamEventActionError.class,
    SamSessionError.class,
    ProgrammaticError.class,
    CompanyError.class,
    TypeError.class,
    InvalidPhoneNumberError.class,
    MobileApplicationTargetingError.class,
    TimeZoneError.class,
    AdRuleSlotError.class,
    FrequencyCapError.class,
    DaiEncodingProfileUpdateError.class,
    DaiEncodingProfileVariantSettingsError.class,
    CreativeAssetMacroError.class,
    RequestError.class,
    AdUnitHierarchyError.class,
    ImageError.class,
    StatementError.class,
    PoddingError.class,
    AuthenticationError.class,
    ReservationDetailsError.class,
    MobileApplicationError.class,
    InternalApiError.class,
    CreativeError.class,
    LineItemFlightDateError.class,
    PublisherQueryLanguageSyntaxError.class,
    CdnConfigurationError.class,
    HtmlBundleProcessorError.class,
    NotNullError.class,
    AdRulePriorityError.class,
    TechnologyTargetingError.class,
    ForecastAdjustmentError.class,
    DaiEncodingProfileContainerSettingsError.class,
    AudienceExtensionError.class,
    LiveStreamEventDvrWindowError.class,
    RangeError.class,
    MetadataMergeSpecError.class,
    BillingError.class,
    InventoryClientApiError.class,
    LineItemCreativeAssociationOperationError.class,
    TranscodingError.class,
    LiveStreamEventCdnSettingsError.class,
    ExchangeRateError.class,
    LineItemCreativeAssociationError.class,
    PreferredDealError.class,
    DaiAuthenticationKeyActionError.class,
    PlacementError.class,
    ProposalActionError.class,
    SwiffyConversionError.class,
    LabelError.class,
    NullError.class,
    ApiVersionError.class,
    StringLengthError.class,
    CollectionSizeError.class,
    InvalidEmailError.class,
    FeatureError.class,
    GrpSettingsError.class,
    TokenError.class,
    RequiredError.class,
    OrderActionError.class,
    LiveStreamEventSlateError.class,
    OrderError.class,
    CrossSellError.class,
    InventoryTargetingError.class,
    DayPartTargetingError.class,
    LineItemOperationError.class,
    CustomTargetingError.class,
    DaiEncodingProfileAdMatchingError.class,
    AssetError.class,
    CreativeSetError.class,
    InvalidUrlError.class,
    DealError.class,
    EntityChildrenLimitReachedError.class,
    CustomFieldValueError.class,
    RichMediaStudioCreativeError.class,
    LineItemError.class,
    UrlError.class,
    InventoryUnitError.class,
    InvalidColorError.class,
    CreativePreviewError.class,
    InventoryUnitSizesError.class,
    StringFormatError.class,
    ProposalLineItemError.class,
    CommonError.class,
    AudienceSegmentError.class,
    GeoTargetingError.class,
    FileError.class,
    ReportError.class,
    LiveStreamEventDateTimeError.class,
    ProposalLineItemProgrammaticError.class,
    AdUnitCodeError.class,
    SetTopBoxLineItemError.class,
    EntityLimitReachedError.class,
    RequiredNumberError.class,
    ProposalError.class,
    LineItemActivityAssociationError.class,
    RegExError.class,
    UniqueError.class,
    PermissionError.class,
    ExchangeSignupApiError.class,
    ProposalLineItemMakegoodError.class,
    VideoPositionTargetingError.class,
    AdRuleError.class,
    CreativeTemplateOperationError.class,
    YieldError.class,
    NetworkError.class,
    InventoryUnitRefreshRateError.class,
    LabelEntityAssociationError.class,
    VideoAdTagError.class
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
