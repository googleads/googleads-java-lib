
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors relating to the association of partner companies with inventory units.
 *           
 * 
 * <p>Java class for InventoryUnitPartnerAssociationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUnitPartnerAssociationError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201405}InventoryUnitPartnerAssociationError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUnitPartnerAssociationError", propOrder = {
    "reason"
})
public class InventoryUnitPartnerAssociationError
    extends ApiError
{

    protected InventoryUnitPartnerAssociationErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryUnitPartnerAssociationErrorReason }
     *     
     */
    public InventoryUnitPartnerAssociationErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryUnitPartnerAssociationErrorReason }
     *     
     */
    public void setReason(InventoryUnitPartnerAssociationErrorReason value) {
        this.reason = value;
    }

}
