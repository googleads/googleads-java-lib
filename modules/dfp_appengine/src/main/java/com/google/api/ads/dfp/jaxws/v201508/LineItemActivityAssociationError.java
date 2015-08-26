
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors specific to associating activities to line items.
 *           
 * 
 * <p>Java class for LineItemActivityAssociationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemActivityAssociationError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201508}LineItemActivityAssociationError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemActivityAssociationError", propOrder = {
    "reason"
})
public class LineItemActivityAssociationError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected LineItemActivityAssociationErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemActivityAssociationErrorReason }
     *     
     */
    public LineItemActivityAssociationErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemActivityAssociationErrorReason }
     *     
     */
    public void setReason(LineItemActivityAssociationErrorReason value) {
        this.reason = value;
    }

}
