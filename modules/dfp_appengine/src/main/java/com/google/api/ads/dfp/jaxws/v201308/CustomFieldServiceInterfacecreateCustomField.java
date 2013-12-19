
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link CustomField}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link CustomField#name}</li>
 *             <li>{@link CustomField#entityType}</li>
 *             <li>{@link CustomField#dataType}</li>
 *             <li>{@link CustomField#visibility}</li>
 *             </ul>
 *             
 *             @param customField the custom field to create
 *             @return the custom field with its ID filled in
 *           
 * 
 * <p>Java class for createCustomField element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createCustomField">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customField" type="{https://www.google.com/apis/ads/publisher/v201308}CustomField" minOccurs="0"/>
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
@XmlRootElement(name = "createCustomField")
public class CustomFieldServiceInterfacecreateCustomField {

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
