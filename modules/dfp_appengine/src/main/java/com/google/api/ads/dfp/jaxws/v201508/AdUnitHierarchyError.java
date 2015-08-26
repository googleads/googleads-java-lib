
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Caused by creating an {@link AdUnit} object with an invalid hierarchy.
 *           
 * 
 * <p>Java class for AdUnitHierarchyError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnitHierarchyError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201508}AdUnitHierarchyError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnitHierarchyError", propOrder = {
    "reason"
})
public class AdUnitHierarchyError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdUnitHierarchyErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitHierarchyErrorReason }
     *     
     */
    public AdUnitHierarchyErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitHierarchyErrorReason }
     *     
     */
    public void setReason(AdUnitHierarchyErrorReason value) {
        this.reason = value;
    }

}
