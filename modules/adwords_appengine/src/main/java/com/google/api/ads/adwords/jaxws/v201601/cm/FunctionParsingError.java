
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error resulting from a failure to parse the textual representation of a function.
 *           
 * 
 * <p>Java class for FunctionParsingError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionParsingError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201601}FunctionParsingError.Reason" minOccurs="0"/>
 *         &lt;element name="offendingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offendingTextIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionParsingError", propOrder = {
    "reason",
    "offendingText",
    "offendingTextIndex"
})
public class FunctionParsingError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected FunctionParsingErrorReason reason;
    protected String offendingText;
    protected Integer offendingTextIndex;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionParsingErrorReason }
     *     
     */
    public FunctionParsingErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionParsingErrorReason }
     *     
     */
    public void setReason(FunctionParsingErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the offendingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffendingText() {
        return offendingText;
    }

    /**
     * Sets the value of the offendingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffendingText(String value) {
        this.offendingText = value;
    }

    /**
     * Gets the value of the offendingTextIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffendingTextIndex() {
        return offendingTextIndex;
    }

    /**
     * Sets the value of the offendingTextIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffendingTextIndex(Integer value) {
        this.offendingTextIndex = value;
    }

}
