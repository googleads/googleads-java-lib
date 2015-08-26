
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code Stats} contains trafficking statistics for {@link LineItem} and
 *             {@link LineItemCreativeAssociation} objects
 *           
 * 
 * <p>Java class for Stats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="impressionsDelivered" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clicksDelivered" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoCompletionsDelivered" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoStartsDelivered" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stats", propOrder = {
    "impressionsDelivered",
    "clicksDelivered",
    "videoCompletionsDelivered",
    "videoStartsDelivered"
})
public class Stats {

    protected Long impressionsDelivered;
    protected Long clicksDelivered;
    protected Long videoCompletionsDelivered;
    protected Long videoStartsDelivered;

    /**
     * Gets the value of the impressionsDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressionsDelivered() {
        return impressionsDelivered;
    }

    /**
     * Sets the value of the impressionsDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressionsDelivered(Long value) {
        this.impressionsDelivered = value;
    }

    /**
     * Gets the value of the clicksDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClicksDelivered() {
        return clicksDelivered;
    }

    /**
     * Sets the value of the clicksDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClicksDelivered(Long value) {
        this.clicksDelivered = value;
    }

    /**
     * Gets the value of the videoCompletionsDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoCompletionsDelivered() {
        return videoCompletionsDelivered;
    }

    /**
     * Sets the value of the videoCompletionsDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoCompletionsDelivered(Long value) {
        this.videoCompletionsDelivered = value;
    }

    /**
     * Gets the value of the videoStartsDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoStartsDelivered() {
        return videoStartsDelivered;
    }

    /**
     * Sets the value of the videoStartsDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoStartsDelivered(Long value) {
        this.videoStartsDelivered = value;
    }

}
