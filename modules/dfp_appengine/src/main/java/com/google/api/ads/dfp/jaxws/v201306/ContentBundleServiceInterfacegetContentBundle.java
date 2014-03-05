
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ContentBundle} uniquely identified by the given ID.
 *             
 *             @param contentBundleId the ID of the content bundle, which must already exist
 *             @return the {@code ContentBundle} uniquely identified by the given ID
 *             @throws ApiException if there were errors, such as invalid ID
 *           
 * 
 * <p>Java class for getContentBundle element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getContentBundle">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="contentBundleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "contentBundleId"
})
@XmlRootElement(name = "getContentBundle")
public class ContentBundleServiceInterfacegetContentBundle {

    protected Long contentBundleId;

    /**
     * Gets the value of the contentBundleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContentBundleId() {
        return contentBundleId;
    }

    /**
     * Sets the value of the contentBundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContentBundleId(Long value) {
        this.contentBundleId = value;
    }

}
