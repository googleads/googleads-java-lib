
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This represents an entry in a map with a key of type ApprovalContext
 *             and value of type ApprovalStatus.
 *           
 * 
 * <p>Java class for ApprovalContext_VideoAd_ApprovalStatusMapEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalContext_VideoAd_ApprovalStatusMapEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/video/v201402}ApprovalContext" minOccurs="0"/>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAd.ApprovalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalContext_VideoAd_ApprovalStatusMapEntry", propOrder = {
    "key",
    "value"
})
public class ApprovalContextVideoAdApprovalStatusMapEntry {

    protected ApprovalContext key;
    protected VideoAdApprovalStatus value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalContext }
     *     
     */
    public ApprovalContext getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalContext }
     *     
     */
    public void setKey(ApprovalContext value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdApprovalStatus }
     *     
     */
    public VideoAdApprovalStatus getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdApprovalStatus }
     *     
     */
    public void setValue(VideoAdApprovalStatus value) {
        this.value = value;
    }

}
