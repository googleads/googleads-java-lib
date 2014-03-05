
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion type that receives conversions by having them uploaded
 *             through the OfflineConversionFeedService.
 *             
 *             After successfully creating a new UploadConversion, send the name of this conversion type
 *             along with your conversion details to the OfflineConversionFeedService
 *             to attribute those conversions to this conversion type.
 *           
 * 
 * <p>Java class for UploadConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="userRevenueValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadConversion", propOrder = {
    "userRevenueValue"
})
public class UploadConversion
    extends ConversionTracker
{

    protected String userRevenueValue;

    /**
     * Gets the value of the userRevenueValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRevenueValue() {
        return userRevenueValue;
    }

    /**
     * Sets the value of the userRevenueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRevenueValue(String value) {
        this.userRevenueValue = value;
    }

}
