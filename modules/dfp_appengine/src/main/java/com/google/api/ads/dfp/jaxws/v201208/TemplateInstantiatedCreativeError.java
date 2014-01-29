
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with template instantiated creatives.
 *           
 * 
 * <p>Java class for TemplateInstantiatedCreativeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateInstantiatedCreativeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201208}TemplateInstantiatedCreativeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateInstantiatedCreativeError", propOrder = {
    "reason"
})
public class TemplateInstantiatedCreativeError
    extends ApiError
{

    protected TemplateInstantiatedCreativeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateInstantiatedCreativeErrorReason }
     *     
     */
    public TemplateInstantiatedCreativeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateInstantiatedCreativeErrorReason }
     *     
     */
    public void setReason(TemplateInstantiatedCreativeErrorReason value) {
        this.reason = value;
    }

}
