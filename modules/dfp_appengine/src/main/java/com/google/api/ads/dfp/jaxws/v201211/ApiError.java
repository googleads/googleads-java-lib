
package com.google.api.ads.dfp.jaxws.v201211;

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
    NullError.class,
    AdUnitTypeError.class,
    CreativeError.class,
    StringLengthError.class,
    InvalidColorError.class,
    LineItemCreativeAssociationError.class,
    InvalidUrlError.class,
    ReservationDetailsError.class,
    QuotaError.class,
    RangeError.class,
    ParseError.class,
    StatementError.class,
    AdSenseAccountError.class,
    TemplateInstantiatedCreativeError.class,
    FeatureError.class,
    PermissionError.class,
    LineItemOperationError.class,
    TeamError.class,
    CreativeSetError.class,
    ApiVersionError.class,
    ServerError.class,
    FrequencyCapError.class,
    LineItemError.class,
    InvalidEmailError.class,
    UserDomainTargetingError.class,
    ClickTrackingLineItemError.class,
    FileError.class,
    RequiredSizeError.class,
    CustomFieldValueError.class,
    DayPartTargetingError.class,
    GeoTargetingError.class,
    RequiredCollectionError.class,
    CreativeAssetMacroError.class,
    CommonError.class,
    TechnologyTargetingError.class,
    CreativeWrapperError.class,
    InventoryTargetingError.class,
    RequiredError.class,
    AuthenticationError.class,
    InventoryUnitError.class,
    CompanyCreditStatusError.class,
    PublisherQueryLanguageContextError.class,
    GenericTargetingError.class,
    ContentPartnerError.class,
    UniqueError.class,
    RequiredNumberError.class,
    PlacementError.class,
    CustomCreativeError.class,
    InventoryUnitSizesError.class,
    ImageError.class,
    LabelEntityAssociationError.class,
    DateTimeRangeTargetingError.class,
    CreativeTemplateError.class,
    LabelError.class,
    ForecastError.class,
    CustomFieldError.class,
    AudienceExtensionError.class,
    PublisherQueryLanguageSyntaxError.class,
    TypeError.class,
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
