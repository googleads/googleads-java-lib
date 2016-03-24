
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Configuration data allowing feed items to be populated for a system feed.
 *           
 * 
 * <p>Java class for SystemFeedGenerationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemFeedGenerationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemFeedGenerationData.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemFeedGenerationData", propOrder = {
    "systemFeedGenerationDataType"
})
@XmlSeeAlso({
    PlacesLocationFeedData.class
})
public class SystemFeedGenerationData {

    @XmlElement(name = "SystemFeedGenerationData.Type")
    protected String systemFeedGenerationDataType;

    /**
     * Gets the value of the systemFeedGenerationDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemFeedGenerationDataType() {
        return systemFeedGenerationDataType;
    }

    /**
     * Sets the value of the systemFeedGenerationDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemFeedGenerationDataType(String value) {
        this.systemFeedGenerationDataType = value;
    }

}
