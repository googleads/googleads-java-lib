
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with product packages rate card associations.
 *           
 * 
 * <p>Java class for ProductPackageRateCardAssociationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPackageRateCardAssociationError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201605}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201605}ProductPackageRateCardAssociationError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPackageRateCardAssociationError", propOrder = {
    "reason"
})
public class ProductPackageRateCardAssociationError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected ProductPackageRateCardAssociationErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPackageRateCardAssociationErrorReason }
     *     
     */
    public ProductPackageRateCardAssociationErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPackageRateCardAssociationErrorReason }
     *     
     */
    public void setReason(ProductPackageRateCardAssociationErrorReason value) {
        this.reason = value;
    }

}
