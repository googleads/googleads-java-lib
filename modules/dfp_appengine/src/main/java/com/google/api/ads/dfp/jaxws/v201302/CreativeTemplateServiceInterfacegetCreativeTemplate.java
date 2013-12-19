
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link CreativeTemplate} uniquely identified by the given ID.
 *             
 *             @param creativeTemplateId the ID of the creative template, which must already exist
 *             @return the {@code CreativeTemplate} uniquely identified by the given ID
 *           
 * 
 * <p>Java class for getCreativeTemplate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCreativeTemplate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "creativeTemplateId"
})
@XmlRootElement(name = "getCreativeTemplate")
public class CreativeTemplateServiceInterfacegetCreativeTemplate {

    protected Long creativeTemplateId;

    /**
     * Gets the value of the creativeTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeTemplateId() {
        return creativeTemplateId;
    }

    /**
     * Sets the value of the creativeTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeTemplateId(Long value) {
        this.creativeTemplateId = value;
    }

}
