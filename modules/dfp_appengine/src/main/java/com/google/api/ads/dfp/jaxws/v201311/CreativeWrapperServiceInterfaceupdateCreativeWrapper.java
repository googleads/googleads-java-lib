
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@code CreativeWrapper}.
 *             
 *             @param creativeWrapper the creative wrapper to update
 *             @return the updated creative wrapper
 *             @throws ApiException
 *           
 * 
 * <p>Java class for updateCreativeWrapper element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateCreativeWrapper">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeWrapper" type="{https://www.google.com/apis/ads/publisher/v201311}CreativeWrapper" minOccurs="0"/>
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
    "creativeWrapper"
})
@XmlRootElement(name = "updateCreativeWrapper")
public class CreativeWrapperServiceInterfaceupdateCreativeWrapper {

    protected CreativeWrapper creativeWrapper;

    /**
     * Gets the value of the creativeWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapper }
     *     
     */
    public CreativeWrapper getCreativeWrapper() {
        return creativeWrapper;
    }

    /**
     * Sets the value of the creativeWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapper }
     *     
     */
    public void setCreativeWrapper(CreativeWrapper value) {
        this.creativeWrapper = value;
    }

}
