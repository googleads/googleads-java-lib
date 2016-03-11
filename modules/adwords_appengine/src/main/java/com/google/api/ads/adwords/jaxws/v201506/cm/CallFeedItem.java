
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a Call extension.
 *           
 * 
 * <p>Java class for CallFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="callPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callConversionType" type="{https://adwords.google.com/api/adwords/cm/v201506}CallConversionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallFeedItem", propOrder = {
    "callPhoneNumber",
    "callCountryCode",
    "callTracking",
    "callOnly",
    "callConversionType"
})
public class CallFeedItem
    extends ExtensionFeedItem
{

    protected String callPhoneNumber;
    protected String callCountryCode;
    protected Boolean callTracking;
    protected Boolean callOnly;
    protected CallConversionType callConversionType;

    /**
     * Gets the value of the callPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPhoneNumber() {
        return callPhoneNumber;
    }

    /**
     * Sets the value of the callPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPhoneNumber(String value) {
        this.callPhoneNumber = value;
    }

    /**
     * Gets the value of the callCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCountryCode() {
        return callCountryCode;
    }

    /**
     * Sets the value of the callCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCountryCode(String value) {
        this.callCountryCode = value;
    }

    /**
     * Gets the value of the callTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallTracking() {
        return callTracking;
    }

    /**
     * Sets the value of the callTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallTracking(Boolean value) {
        this.callTracking = value;
    }

    /**
     * Gets the value of the callOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallOnly() {
        return callOnly;
    }

    /**
     * Sets the value of the callOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallOnly(Boolean value) {
        this.callOnly = value;
    }

    /**
     * Gets the value of the callConversionType property.
     * 
     * @return
     *     possible object is
     *     {@link CallConversionType }
     *     
     */
    public CallConversionType getCallConversionType() {
        return callConversionType;
    }

    /**
     * Sets the value of the callConversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallConversionType }
     *     
     */
    public void setCallConversionType(CallConversionType value) {
        this.callConversionType = value;
    }

}
