
package com.google.api.ads.dfp.jaxws.v201411;

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
    PackageActionError.class,
    TemplateInstantiatedCreativeError.class,
    PublisherQueryLanguageContextError.class,
    ContentMetadataTargetingError.class,
    CustomFieldError.class,
    AdSenseAccountError.class,
    CreativeTemplateError.class,
    ActivityError.class,
    ForecastError.class,
    DateTimeRangeTargetingError.class,
    GenericTargetingError.class,
    ServerError.class,
    PrecisionError.class,
    AdRuleFrequencyCapError.class,
    UserDomainTargetingError.class,
    CustomCreativeError.class,
    RequiredSizeError.class,
    RequiredCollectionError.class,
    ProposalLineItemActionError.class,
    ContentPartnerError.class,
    CompanyCreditStatusError.class,
    ContactError.class,
    QuotaError.class,
    WorkflowActionError.class,
    CreativeWrapperError.class,
    ClickTrackingLineItemError.class,
    ParseError.class,
    AdRuleDateError.class,
    TeamError.class,
    LiveStreamEventActionError.class,
    ProgrammaticError.class,
    CompanyError.class,
    TypeError.class,
    ContentMetadataKeyHierarchyError.class,
    InvalidPhoneNumberError.class,
    AdRuleSlotError.class,
    InventoryUnitPartnerAssociationError.class,
    FrequencyCapError.class,
    ProductError.class,
    CreativeAssetMacroError.class,
    AdUnitHierarchyError.class,
    ImageError.class,
    StatementError.class,
    PoddingError.class,
    AuthenticationError.class,
    ReservationDetailsError.class,
    InternalApiError.class,
    CreativeError.class,
    LineItemFlightDateError.class,
    PublisherQueryLanguageSyntaxError.class,
    NotNullError.class,
    WorkflowRequestError.class,
    AdRulePriorityError.class,
    TechnologyTargetingError.class,
    BaseRateError.class,
    AudienceExtensionError.class,
    RangeError.class,
    BillingError.class,
    LineItemCreativeAssociationOperationError.class,
    ExchangeRateError.class,
    AvailableBillingError.class,
    LineItemCreativeAssociationError.class,
    ProductActionError.class,
    PlacementError.class,
    ProposalActionError.class,
    SwiffyConversionError.class,
    LabelError.class,
    NullError.class,
    ApiVersionError.class,
    ProductTemplateError.class,
    StringLengthError.class,
    CollectionSizeError.class,
    InvalidEmailError.class,
    FeatureError.class,
    GrpSettingsError.class,
    TokenError.class,
    RequiredError.class,
    OrderActionError.class,
    OrderError.class,
    CrossSellError.class,
    InventoryTargetingError.class,
    DayPartTargetingError.class,
    LineItemOperationError.class,
    CustomTargetingError.class,
    WorkflowValidationError.class,
    AssetError.class,
    CreativeSetError.class,
    InvalidUrlError.class,
    EntityChildrenLimitReachedError.class,
    ReconciliationImportError.class,
    CustomFieldValueError.class,
    RichMediaStudioCreativeError.class,
    LineItemError.class,
    AdUnitTypeError.class,
    InventoryUnitError.class,
    ReconciliationError.class,
    InvalidColorError.class,
    InventoryUnitSizesError.class,
    ProposalLineItemError.class,
    PackageError.class,
    CommonError.class,
    AudienceSegmentError.class,
    GeoTargetingError.class,
    FileError.class,
    ProductTemplateActionError.class,
    ReportError.class,
    LiveStreamEventDateTimeError.class,
    AdUnitCodeError.class,
    EntityLimitReachedError.class,
    RequiredNumberError.class,
    ProposalError.class,
    LineItemActivityAssociationError.class,
    PremiumRateError.class,
    AdUnitAfcSizeError.class,
    RegExError.class,
    UniqueError.class,
    PermissionError.class,
    AdExclusionRuleError.class,
    BaseRateActionError.class,
    NetworkError.class,
    InventoryUnitRefreshRateError.class,
    RateCardActionError.class,
    LabelEntityAssociationError.class,
    RateCardError.class
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
