
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
    "trigger",
    "errorString",
    "apiErrorType"
})
@XmlSeeAlso({
    InternalApiError.class,
    OrderError.class,
    CompanyError.class,
    InventoryUnitPartnerAssociationError.class,
    RichMediaStudioCreativeError.class,
    AdUnitAfcSizeError.class,
    ReportError.class,
    AdUnitHierarchyError.class,
    AdUnitCodeError.class,
    RegExError.class,
    NotNullError.class,
    EntityLimitReachedError.class,
    ProposalLineItemActionError.class,
    NullError.class,
    AdUnitTypeError.class,
    InvalidPhoneNumberError.class,
    BillingError.class,
    CreativeError.class,
    RateCardCustomizationError.class,
    StringLengthError.class,
    InvalidColorError.class,
    LineItemCreativeAssociationError.class,
    InvalidUrlError.class,
    ReservationDetailsError.class,
    RateCardError.class,
    SwiffyConversionError.class,
    PoddingError.class,
    AudienceSegmentError.class,
    QuotaError.class,
    PackageError.class,
    RangeError.class,
    ParseError.class,
    StatementError.class,
    ProposalLineItemError.class,
    AdSenseAccountError.class,
    ContentMetadataKeyHierarchyError.class,
    TemplateInstantiatedCreativeError.class,
    ProductActionError.class,
    FeatureError.class,
    PermissionError.class,
    LineItemOperationError.class,
    TeamError.class,
    TokenError.class,
    ProductTemplateError.class,
    CreativeSetError.class,
    ApiVersionError.class,
    ServerError.class,
    FrequencyCapError.class,
    LineItemError.class,
    BaseRateError.class,
    InvalidEmailError.class,
    UserDomainTargetingError.class,
    WorkflowActionError.class,
    ClickTrackingLineItemError.class,
    FileError.class,
    RequiredSizeError.class,
    BaseRateActionError.class,
    AdRulePriorityError.class,
    CustomFieldValueError.class,
    DayPartTargetingError.class,
    GeoTargetingError.class,
    CrossSellError.class,
    RequiredCollectionError.class,
    CreativeAssetMacroError.class,
    CommonError.class,
    TechnologyTargetingError.class,
    CreativeWrapperError.class,
    InventoryTargetingError.class,
    RequiredError.class,
    AuthenticationError.class,
    ExchangeRateError.class,
    InventoryUnitError.class,
    LiveStreamEventDateTimeError.class,
    CompanyCreditStatusError.class,
    PublisherQueryLanguageContextError.class,
    GenericTargetingError.class,
    PackageActionError.class,
    ProposalError.class,
    CollectionSizeError.class,
    ContentPartnerError.class,
    NetworkError.class,
    WorkflowValidationError.class,
    UniqueError.class,
    RequiredNumberError.class,
    PlacementError.class,
    CustomCreativeError.class,
    InventoryUnitSizesError.class,
    ImageError.class,
    LabelEntityAssociationError.class,
    RateCardActionError.class,
    DateTimeRangeTargetingError.class,
    RateCardCustomizationGroupError.class,
    ActivityError.class,
    CreativeTemplateError.class,
    LabelError.class,
    ProductError.class,
    ForecastError.class,
    ProductTemplateActionError.class,
    ContentMetadataTargetingError.class,
    ContactError.class,
    CustomFieldError.class,
    AdRuleFrequencyCapError.class,
    AudienceExtensionError.class,
    PublisherQueryLanguageSyntaxError.class,
    PrecisionError.class,
    TypeError.class,
    ReconciliationImportError.class,
    AdRuleDateError.class,
    ReconciliationError.class,
    ProposalActionError.class,
    AdRuleSlotError.class,
    OrderActionError.class,
    AssetError.class,
    LineItemCreativeAssociationOperationError.class,
    CustomTargetingError.class,
    LineItemFlightDateError.class
})
public abstract class ApiError {

    protected String fieldPath;
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
