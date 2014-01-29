
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link CreativeSet} uniquely identified by the given ID.
 *             
 *             @param creativeSetId the ID of the creative set, which must already exist
 *             @return the {@code CreativeSet} uniquely identified by the given ID
 *           
 * 
 * <p>Java class for getCreativeSet element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCreativeSet">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "creativeSetId"
})
@XmlRootElement(name = "getCreativeSet")
public class CreativeSetServiceInterfacegetCreativeSet {

    protected Long creativeSetId;

    /**
     * Gets the value of the creativeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeSetId() {
        return creativeSetId;
    }

    /**
     * Sets the value of the creativeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeSetId(Long value) {
        this.creativeSetId = value;
    }

}
