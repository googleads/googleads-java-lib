
package com.google.api.ads.adwords.jaxws.v201402.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.ApiError;


/**
 * 
 *             Errors associated with the size of the given collection being
 *             out of bounds.
 *           
 * 
 * <p>Java class for CollectionSizeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionSizeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/rm/v201402}CollectionSizeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionSizeError", propOrder = {
    "reason"
})
public class CollectionSizeError
    extends ApiError
{

    protected CollectionSizeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionSizeErrorReason }
     *     
     */
    public CollectionSizeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionSizeErrorReason }
     *     
     */
    public void setReason(CollectionSizeErrorReason value) {
        this.reason = value;
    }

}
