
package com.google.api.ads.dfp.jaxws.v201408;

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
    ExchangeRateError.class,
    AvailableBillingError.class,
    LineItemCreativeAssociationError.class,
    PackageActionError.class,
    TemplateInstantiatedCreativeError.class,
    PublisherQueryLanguageContextError.class,
    ContentMetadataTargetingError.class,
    ProductActionError.class,
    CustomFieldError.class,
    AdSenseAccountError.class,
    CreativeTemplateError.class,
    PlacementError.class,
    ProposalActionError.class,
    SwiffyConversionError.class,
    ActivityError.class,
    ForecastError.class,
    LabelError.class,
    NullError.class,
    DateTimeRangeTargetingError.class,
    ApiVersionError.class,
    ProductTemplateError.class,
    StringLengthError.class,
    CollectionSizeError.class,
    GenericTargetingError.class,
    ServerError.class,
    PrecisionError.class,
    InvalidEmailError.class,
    FeatureError.class,
    GrpSettingsError.class,
    TokenError.class,
    AdRuleFrequencyCapError.class,
    RequiredError.class,
    OrderActionError.class,
    UserDomainTargetingError.class,
    OrderError.class,
    CustomCreativeError.class,
    RequiredSizeError.class,
    CrossSellError.class,
    RequiredCollectionError.class,
    InventoryTargetingError.class,
    ProposalLineItemActionError.class,
    DayPartTargetingError.class,
    LineItemOperationError.class,
    CustomTargetingError.class,
    ContentPartnerError.class,
    WorkflowValidationError.class,
    AssetError.class,
    CreativeSetError.class,
    InvalidUrlError.class,
    EntityChildrenLimitReachedError.class,
    CompanyCreditStatusError.class,
    ReconciliationImportError.class,
    CustomFieldValueError.class,
    RichMediaStudioCreativeError.class,
    LineItemError.class,
    ContactError.class,
    AdUnitTypeError.class,
    InventoryUnitError.class,
    QuotaError.class,
    ReconciliationError.class,
    WorkflowActionError.class,
    InvalidColorError.class,
    CreativeWrapperError.class,
    ClickTrackingLineItemError.class,
    ParseError.class,
    InventoryUnitSizesError.class,
    ProposalLineItemError.class,
    PackageError.class,
    CommonError.class,
    AudienceSegmentError.class,
    AdRuleDateError.class,
    TeamError.class,
    GeoTargetingError.class,
    LiveStreamEventActionError.class,
    ProgrammaticError.class,
    CompanyError.class,
    TypeError.class,
    ContentMetadataKeyHierarchyError.class,
    FileError.class,
    InvalidPhoneNumberError.class,
    ProductTemplateActionError.class,
    ReportError.class,
    LiveStreamEventDateTimeError.class,
    AdRuleSlotError.class,
    AdUnitCodeError.class,
    EntityLimitReachedError.class,
    InventoryUnitPartnerAssociationError.class,
    FrequencyCapError.class,
    RequiredNumberError.class,
    ProposalError.class,
    ProductError.class,
    PremiumRateError.class,
    CreativeAssetMacroError.class,
    AdUnitHierarchyError.class,
    AdUnitAfcSizeError.class,
    ImageError.class,
    StatementError.class,
    RegExError.class,
    PoddingError.class,
    UniqueError.class,
    AuthenticationError.class,
    PermissionError.class,
    ReservationDetailsError.class,
    InternalApiError.class,
    CreativeError.class,
    LineItemFlightDateError.class,
    PublisherQueryLanguageSyntaxError.class,
    BaseRateActionError.class,
    NotNullError.class,
    WorkflowRequestError.class,
    AdRulePriorityError.class,
    TechnologyTargetingError.class,
    NetworkError.class,
    BaseRateError.class,
    RateCardActionError.class,
    AudienceExtensionError.class,
    RangeError.class,
    LabelEntityAssociationError.class,
    BillingError.class,
    RateCardError.class,
    LineItemCreativeAssociationOperationError.class
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
