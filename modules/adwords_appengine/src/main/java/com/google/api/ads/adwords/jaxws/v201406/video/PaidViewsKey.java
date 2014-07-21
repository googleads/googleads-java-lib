
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A SegmentKey for paid vs non-paid segmentation.
 *           
 * 
 * <p>Java class for PaidViewsKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaidViewsKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paidViews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaidViewsKey", propOrder = {
    "paidViews"
})
public class PaidViewsKey {

    protected Boolean paidViews;

    /**
     * Gets the value of the paidViews property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaidViews() {
        return paidViews;
    }

    /**
     * Sets the value of the paidViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaidViews(Boolean value) {
        this.paidViews = value;
    }

}
