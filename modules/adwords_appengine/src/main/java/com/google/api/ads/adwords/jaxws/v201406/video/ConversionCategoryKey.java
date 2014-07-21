
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Segment key for conversion category.
 *           
 * 
 * <p>Java class for ConversionCategoryKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionCategoryKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionCategory" type="{https://adwords.google.com/api/adwords/video/v201406}ConversionCategoryKey.ConversionCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionCategoryKey", propOrder = {
    "conversionCategory"
})
public class ConversionCategoryKey {

    protected ConversionCategoryKeyConversionCategory conversionCategory;

    /**
     * Gets the value of the conversionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionCategoryKeyConversionCategory }
     *     
     */
    public ConversionCategoryKeyConversionCategory getConversionCategory() {
        return conversionCategory;
    }

    /**
     * Sets the value of the conversionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionCategoryKeyConversionCategory }
     *     
     */
    public void setConversionCategory(ConversionCategoryKeyConversionCategory value) {
        this.conversionCategory = value;
    }

}
