
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists errors relating to {@link AdUnit#refreshRate}.
 *           
 * 
 * <p>Java class for InventoryUnitRefreshRateError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUnitRefreshRateError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201505}InventoryUnitRefreshRateError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUnitRefreshRateError", propOrder = {
    "reason"
})
public class InventoryUnitRefreshRateError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected InventoryUnitRefreshRateErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryUnitRefreshRateErrorReason }
     *     
     */
    public InventoryUnitRefreshRateErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryUnitRefreshRateErrorReason }
     *     
     */
    public void setReason(InventoryUnitRefreshRateErrorReason value) {
        this.reason = value;
    }

}
