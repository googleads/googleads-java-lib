
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A rate customization applied to custom criteria targeting.
 *           
 * 
 * <p>Java class for CustomTargetingRateCardFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTargetingRateCardFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201311}RateCardFeature">
 *       &lt;sequence>
 *         &lt;element name="customTargetingKeyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customTargetingValueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTargetingRateCardFeature", propOrder = {
    "customTargetingKeyId",
    "customTargetingValueId"
})
public class CustomTargetingRateCardFeature
    extends RateCardFeature
{

    protected Long customTargetingKeyId;
    protected Long customTargetingValueId;

    /**
     * Gets the value of the customTargetingKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }

    /**
     * Sets the value of the customTargetingKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomTargetingKeyId(Long value) {
        this.customTargetingKeyId = value;
    }

    /**
     * Gets the value of the customTargetingValueId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomTargetingValueId() {
        return customTargetingValueId;
    }

    /**
     * Sets the value of the customTargetingValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomTargetingValueId(Long value) {
        this.customTargetingValueId = value;
    }

}
