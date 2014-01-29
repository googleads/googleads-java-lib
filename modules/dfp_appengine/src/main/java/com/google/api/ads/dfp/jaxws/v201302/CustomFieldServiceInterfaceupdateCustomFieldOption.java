
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link CustomFieldOption}.
 *             
 *             @param customFieldOption the custom field option to update
 *             @return the updated customFieldOption
 *           
 * 
 * <p>Java class for updateCustomFieldOption element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateCustomFieldOption">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customFieldOption" type="{https://www.google.com/apis/ads/publisher/v201302}CustomFieldOption" minOccurs="0"/>
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
    "customFieldOption"
})
@XmlRootElement(name = "updateCustomFieldOption")
public class CustomFieldServiceInterfaceupdateCustomFieldOption {

    protected CustomFieldOption customFieldOption;

    /**
     * Gets the value of the customFieldOption property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldOption }
     *     
     */
    public CustomFieldOption getCustomFieldOption() {
        return customFieldOption;
    }

    /**
     * Sets the value of the customFieldOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldOption }
     *     
     */
    public void setCustomFieldOption(CustomFieldOption value) {
        this.customFieldOption = value;
    }

}
