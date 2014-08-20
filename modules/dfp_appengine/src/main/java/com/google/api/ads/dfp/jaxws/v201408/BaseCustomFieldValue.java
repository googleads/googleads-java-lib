
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The value of a {@link CustomField} for a particular entity.
 *           
 * 
 * <p>Java class for BaseCustomFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseCustomFieldValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customFieldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BaseCustomFieldValue.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCustomFieldValue", propOrder = {
    "customFieldId",
    "baseCustomFieldValueType"
})
@XmlSeeAlso({
    DropDownCustomFieldValue.class,
    CustomFieldValue.class
})
public abstract class BaseCustomFieldValue {

    protected Long customFieldId;
    @XmlElement(name = "BaseCustomFieldValue.Type")
    protected String baseCustomFieldValueType;

    /**
     * Gets the value of the customFieldId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomFieldId() {
        return customFieldId;
    }

    /**
     * Sets the value of the customFieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomFieldId(Long value) {
        this.customFieldId = value;
    }

    /**
     * Gets the value of the baseCustomFieldValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCustomFieldValueType() {
        return baseCustomFieldValueType;
    }

    /**
     * Sets the value of the baseCustomFieldValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCustomFieldValueType(String value) {
        this.baseCustomFieldValueType = value;
    }

}
