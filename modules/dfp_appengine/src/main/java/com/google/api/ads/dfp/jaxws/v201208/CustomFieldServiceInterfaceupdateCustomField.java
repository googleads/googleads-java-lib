
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link CustomField}.
 *             
 *             @param customField the custom field to update
 *             @return the updated customField
 *           
 * 
 * <p>Java class for updateCustomField element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateCustomField">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customField" type="{https://www.google.com/apis/ads/publisher/v201208}CustomField" minOccurs="0"/>
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
    "customField"
})
@XmlRootElement(name = "updateCustomField")
public class CustomFieldServiceInterfaceupdateCustomField {

    protected CustomField customField;

    /**
     * Gets the value of the customField property.
     * 
     * @return
     *     possible object is
     *     {@link CustomField }
     *     
     */
    public CustomField getCustomField() {
        return customField;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setCustomField(CustomField value) {
        this.customField = value;
    }

}
