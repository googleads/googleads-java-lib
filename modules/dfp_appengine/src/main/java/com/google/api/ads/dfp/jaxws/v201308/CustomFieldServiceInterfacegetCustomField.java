
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link CustomField} uniquely identified by the given ID.
 *             
 *             @param customFieldId the ID of the custom field, which must already exist
 *             @return the {@code CustomField} uniquely identified by the given ID
 *           
 * 
 * <p>Java class for getCustomField element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCustomField">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customFieldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customFieldId"
})
@XmlRootElement(name = "getCustomField")
public class CustomFieldServiceInterfacegetCustomField {

    protected Long customFieldId;

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

}
