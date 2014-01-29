
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all inventory errors caused by associating a line item with a targeting
 *             expression.
 *           
 * 
 * <p>Java class for InventoryTargetingError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryTargetingError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201306}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201306}InventoryTargetingError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryTargetingError", propOrder = {
    "reason"
})
public class InventoryTargetingError
    extends ApiError
{

    protected InventoryTargetingErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTargetingErrorReason }
     *     
     */
    public InventoryTargetingErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTargetingErrorReason }
     *     
     */
    public void setReason(InventoryTargetingErrorReason value) {
        this.reason = value;
    }

}
