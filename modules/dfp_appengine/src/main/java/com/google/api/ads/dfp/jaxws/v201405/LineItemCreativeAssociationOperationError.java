
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors for executing operations on
 *             line item-to-creative associations
 *           
 * 
 * <p>Java class for LineItemCreativeAssociationOperationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemCreativeAssociationOperationError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201405}LineItemCreativeAssociationOperationError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemCreativeAssociationOperationError", propOrder = {
    "reason"
})
public class LineItemCreativeAssociationOperationError
    extends ApiError
{

    protected LineItemCreativeAssociationOperationErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemCreativeAssociationOperationErrorReason }
     *     
     */
    public LineItemCreativeAssociationOperationErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemCreativeAssociationOperationErrorReason }
     *     
     */
    public void setReason(LineItemCreativeAssociationOperationErrorReason value) {
        this.reason = value;
    }

}
