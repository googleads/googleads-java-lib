
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base class for AdExtension objects. An AdExtension is an extension to
 *             an existing ad or metadata that will process into an extension.
 *           
 * 
 * <p>Java class for AdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdExtension.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtension", propOrder = {
    "id",
    "adExtensionType"
})
@XmlSeeAlso({
    LocationExtension.class,
    LocationSyncExtension.class
})
public class AdExtension {

    protected Long id;
    @XmlElement(name = "AdExtension.Type")
    protected String adExtensionType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the adExtensionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdExtensionType() {
        return adExtensionType;
    }

    /**
     * Sets the value of the adExtensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdExtensionType(String value) {
        this.adExtensionType = value;
    }

}
