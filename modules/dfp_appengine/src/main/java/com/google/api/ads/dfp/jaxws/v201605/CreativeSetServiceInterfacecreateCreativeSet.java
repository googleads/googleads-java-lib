
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link CreativeSet}.
 *             
 *             @param creativeSet the creative set to create
 *             @return the creative set with its ID filled in
 *           
 * 
 * <p>Java class for createCreativeSet element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createCreativeSet">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeSet" type="{https://www.google.com/apis/ads/publisher/v201605}CreativeSet" minOccurs="0"/>
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
    "creativeSet"
})
@XmlRootElement(name = "createCreativeSet")
public class CreativeSetServiceInterfacecreateCreativeSet {

    protected CreativeSet creativeSet;

    /**
     * Gets the value of the creativeSet property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeSet }
     *     
     */
    public CreativeSet getCreativeSet() {
        return creativeSet;
    }

    /**
     * Sets the value of the creativeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeSet }
     *     
     */
    public void setCreativeSet(CreativeSet value) {
        this.creativeSet = value;
    }

}
