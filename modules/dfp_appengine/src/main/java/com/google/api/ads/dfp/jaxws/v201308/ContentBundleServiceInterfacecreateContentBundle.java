
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link ContentBundle}.
 *             
 *             These fields are required:
 *             <ul>
 *             <li>{@link ContentBundle#name}</li>
 *             <li>{@link ContentBundle#description}<li>
 *             </ul>
 *             
 *             @param contentBundle the content bundle to create
 *             @return the content bundle with its ID filled in
 *           
 * 
 * <p>Java class for createContentBundle element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createContentBundle">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="contentBundle" type="{https://www.google.com/apis/ads/publisher/v201308}ContentBundle" minOccurs="0"/>
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
    "contentBundle"
})
@XmlRootElement(name = "createContentBundle")
public class ContentBundleServiceInterfacecreateContentBundle {

    protected ContentBundle contentBundle;

    /**
     * Gets the value of the contentBundle property.
     * 
     * @return
     *     possible object is
     *     {@link ContentBundle }
     *     
     */
    public ContentBundle getContentBundle() {
        return contentBundle;
    }

    /**
     * Sets the value of the contentBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentBundle }
     *     
     */
    public void setContentBundle(ContentBundle value) {
        this.contentBundle = value;
    }

}
