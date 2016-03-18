
package com.google.api.ads.adwords.jaxws.v201506.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Information specific to the instream ad format. Instream ads are video ads
 *             which play as part of the delivery of video content, either before, during,
 *             or after the content itself.
 *           
 * 
 * <p>Java class for InStreamAdInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InStreamAdInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxAdDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minAdDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="medianAdDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="preRollPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="midRollPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="postRollPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InStreamAdInfo", propOrder = {
    "maxAdDuration",
    "minAdDuration",
    "medianAdDuration",
    "preRollPercent",
    "midRollPercent",
    "postRollPercent"
})
public class InStreamAdInfo {

    protected Integer maxAdDuration;
    protected Integer minAdDuration;
    protected Integer medianAdDuration;
    protected Double preRollPercent;
    protected Double midRollPercent;
    protected Double postRollPercent;

    /**
     * Gets the value of the maxAdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdDuration() {
        return maxAdDuration;
    }

    /**
     * Sets the value of the maxAdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdDuration(Integer value) {
        this.maxAdDuration = value;
    }

    /**
     * Gets the value of the minAdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAdDuration() {
        return minAdDuration;
    }

    /**
     * Sets the value of the minAdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAdDuration(Integer value) {
        this.minAdDuration = value;
    }

    /**
     * Gets the value of the medianAdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedianAdDuration() {
        return medianAdDuration;
    }

    /**
     * Sets the value of the medianAdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedianAdDuration(Integer value) {
        this.medianAdDuration = value;
    }

    /**
     * Gets the value of the preRollPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreRollPercent() {
        return preRollPercent;
    }

    /**
     * Sets the value of the preRollPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreRollPercent(Double value) {
        this.preRollPercent = value;
    }

    /**
     * Gets the value of the midRollPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMidRollPercent() {
        return midRollPercent;
    }

    /**
     * Sets the value of the midRollPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMidRollPercent(Double value) {
        this.midRollPercent = value;
    }

    /**
     * Gets the value of the postRollPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostRollPercent() {
        return postRollPercent;
    }

    /**
     * Sets the value of the postRollPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostRollPercent(Double value) {
        this.postRollPercent = value;
    }

}
