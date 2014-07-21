
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the operating system criterion used for campaign scheduling.
 *             This criterion is immutable
 *           
 * 
 * <p>Java class for MobileAppCategoryVideoCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileAppCategoryVideoCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201406}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="mobileAppCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileAppCategoryVideoCriterion", propOrder = {
    "mobileAppCategoryId"
})
public class MobileAppCategoryVideoCriterion
    extends BaseCriterion
{

    protected Integer mobileAppCategoryId;

    /**
     * Gets the value of the mobileAppCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMobileAppCategoryId() {
        return mobileAppCategoryId;
    }

    /**
     * Sets the value of the mobileAppCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMobileAppCategoryId(Integer value) {
        this.mobileAppCategoryId = value;
    }

}
