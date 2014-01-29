
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link CreativeWrapper} uniquely identified by the given
 *             ID.
 *             
 *             @param creativeWrapperId the ID of the creative wrapper, which
 *             must already exist
 *             @return the {@code CreativeWrapper} uniquely identified by the given
 *             ID
 *             @throws ApiException
 *           
 * 
 * <p>Java class for getCreativeWrapper element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCreativeWrapper">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeWrapperId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "creativeWrapperId"
})
@XmlRootElement(name = "getCreativeWrapper")
public class CreativeWrapperServiceInterfacegetCreativeWrapper {

    protected Long creativeWrapperId;

    /**
     * Gets the value of the creativeWrapperId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeWrapperId() {
        return creativeWrapperId;
    }

    /**
     * Sets the value of the creativeWrapperId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeWrapperId(Long value) {
        this.creativeWrapperId = value;
    }

}
