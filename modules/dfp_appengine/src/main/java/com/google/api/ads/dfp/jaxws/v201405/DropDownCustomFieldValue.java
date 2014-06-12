
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CustomFieldValue} for a {@link CustomField} that has a {@link CustomField#dataType}
 *             of {@link CustomFieldDataType#DROP_DOWN}
 *           
 * 
 * <p>Java class for DropDownCustomFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DropDownCustomFieldValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}BaseCustomFieldValue">
 *       &lt;sequence>
 *         &lt;element name="customFieldOptionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DropDownCustomFieldValue", propOrder = {
    "customFieldOptionId"
})
public class DropDownCustomFieldValue
    extends BaseCustomFieldValue
{

    protected Long customFieldOptionId;

    /**
     * Gets the value of the customFieldOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomFieldOptionId() {
        return customFieldOptionId;
    }

    /**
     * Sets the value of the customFieldOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomFieldOptionId(Long value) {
        this.customFieldOptionId = value;
    }

}
