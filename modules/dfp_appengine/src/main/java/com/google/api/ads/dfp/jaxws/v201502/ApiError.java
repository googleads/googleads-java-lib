
package com.google.api.ads.dfp.jaxws.v201502;

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
    "trigger",
    "errorString"
})
@XmlSeeAlso({
    InventoryUnitPartnerAssociationError.class,
    RichMediaStudioCreativeError.class,
    AdUnitAfcSizeError.class,
    ReportError.class,
    AdUnitHierarchyError.class,
    PremiumRateError.class,
    NullError.class,
    InvalidPhoneNumberError.class,
    StringLengthError.class,
    InvalidColorError.class,
    RateCardError.class,
    PoddingError.class,
    AudienceSegmentError.class,
    QuotaError.class,
    LiveStreamEventActionError.class,
    RangeError.class,
    ParseError.class,
    ProposalLineItemError.class,
    ProductActionError.class,
    FeatureError.class,
    PermissionError.class,
    SetTopBoxLineItemError.class,
    TeamError.class,
    TokenError.class,
    ProductTemplateError.class,
    InventoryUnitRefreshRateError.class,
    CreativeSetError.class,
    ProductPackageItemError.class,
    ServerError.class,
    FrequencyCapError.class,
    ClickTrackingLineItemError.class,
    RequiredSizeError.class,
    AdRulePriorityError.class,
    CreativeAssetMacroError.class,
    WorkflowRequestError.class,
    CreativeWrapperError.class,
    InventoryTargetingError.class,
    ProductPackageRateCardAssociationError.class,
    CompanyCreditStatusError.class,
    GenericTargetingError.class,
    ProposalError.class,
    CollectionSizeError.class,
    NetworkError.class,
    CustomCreativeError.class,
    SetTopBoxCreativeError.class,
    InventoryUnitSizesError.class,
    ImageError.class,
    RateCardActionError.class,
    LineItemActivityAssociationError.class,
    LabelError.class,
    ProductError.class,
    ForecastError.class,
    ProductTemplateActionError.class,
    ContentMetadataTargetingError.class,
    ContactError.class,
    CustomFieldError.class,
    PublisherQueryLanguageSyntaxError.class,
    PrecisionError.class,
    AdRuleDateError.class,
    ProposalActionError.class,
    OrderActionError.class,
    AdRuleSlotError.class,
    AssetError.class,
    CustomTargetingError.class,
    EntityChildrenLimitReachedError.class,
    LineItemFlightDateError.class,
    InternalApiError.class,
    OrderError.class,
    CompanyError.class,
    AdUnitCodeError.class,
    CreativePreviewError.class,
    RegExError.class,
    NotNullError.class,
    EntityLimitReachedError.class,
    ProposalLineItemActionError.class,
    AdUnitTypeError.class,
    BillingError.class,
    CreativeError.class,
    LineItemCreativeAssociationError.class,
    InvalidUrlError.class,
    ReservationDetailsError.class,
    SwiffyConversionError.class,
    PackageError.class,
    StatementError.class,
    AdSenseAccountError.class,
    ContentMetadataKeyHierarchyError.class,
    TemplateInstantiatedCreativeError.class,
    GrpSettingsError.class,
    LineItemOperationError.class,
    ApiVersionError.class,
    LineItemError.class,
    BaseRateError.class,
    InvalidEmailError.class,
    UserDomainTargetingError.class,
    WorkflowActionError.class,
    ProductPackageItemActionError.class,
    FileError.class,
    AvailableBillingError.class,
    BaseRateActionError.class,
    CustomFieldValueError.class,
    DayPartTargetingError.class,
    GeoTargetingError.class,
    CrossSellError.class,
    RequiredCollectionError.class,
    AdExclusionRuleError.class,
    CommonError.class,
    TechnologyTargetingError.class,
    RequiredError.class,
    AuthenticationError.class,
    ExchangeRateError.class,
    InventoryUnitError.class,
    LiveStreamEventDateTimeError.class,
    PublisherQueryLanguageContextError.class,
    PackageActionError.class,
    ContentPartnerError.class,
    UniqueError.class,
    WorkflowValidationError.class,
    RequiredNumberError.class,
    PlacementError.class,
    LabelEntityAssociationError.class,
    TimeZoneError.class,
    DateTimeRangeTargetingError.class,
    ActivityError.class,
    ProgrammaticError.class,
    CreativeTemplateError.class,
    ProductPackageActionError.class,
    AdRuleFrequencyCapError.class,
    AudienceExtensionError.class,
    TypeError.class,
    ReconciliationImportError.class,
    ReconciliationError.class,
    LineItemCreativeAssociationOperationError.class
})
public abstract class ApiError {

    protected String fieldPath;
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
