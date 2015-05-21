
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An AdMob backfill creative.
 *           
 * 
 * <p>Java class for AdMobBackfillCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdMobBackfillCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201502}BaseDynamicAllocationCreative">
 *       &lt;sequence>
 *         &lt;element name="additionalParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201502}LockedOrientation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdMobBackfillCreative", propOrder = {
    "additionalParameters",
    "publisherId",
    "lockedOrientation"
})
public class AdMobBackfillCreative
    extends BaseDynamicAllocationCreative
{

    protected String additionalParameters;
    protected String publisherId;
    protected LockedOrientation lockedOrientation;

    /**
     * Gets the value of the additionalParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * Sets the value of the additionalParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalParameters(String value) {
        this.additionalParameters = value;
    }

    /**
     * Gets the value of the publisherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherId(String value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the lockedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LockedOrientation }
     *     
     */
    public LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }

    /**
     * Sets the value of the lockedOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockedOrientation }
     *     
     */
    public void setLockedOrientation(LockedOrientation value) {
        this.lockedOrientation = value;
    }

}
