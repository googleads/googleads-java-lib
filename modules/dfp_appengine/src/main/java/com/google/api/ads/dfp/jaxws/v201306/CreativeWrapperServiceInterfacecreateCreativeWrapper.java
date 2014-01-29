
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@code CreativeWrapper}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link CreativeWrapper#labelId}</li>
 *             <li>{@link CreativeWrapper#ordering}</li>
 *             <li>{@link CreativeWrapper#header} or {@link CreativeWrapper#footer}</li>
 *             </ul>
 *             
 *             @param creativeWrapper the creative wrapper to create
 *             @return the creative wrapper with its ID filled in
 *             @throws ApiException
 *           
 * 
 * <p>Java class for createCreativeWrapper element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createCreativeWrapper">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeWrapper" type="{https://www.google.com/apis/ads/publisher/v201306}CreativeWrapper" minOccurs="0"/>
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
@XmlRootElement(name = "createCreativeWrapper")
public class CreativeWrapperServiceInterfacecreateCreativeWrapper {

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
