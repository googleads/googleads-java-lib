
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies the adgroup the request context must match in order for
 *             the feed item to be considered eligible for serving (aka the targeted adgroup).
 *             E.g., if the below adgroup targeting is set to adgroup = X, then the feed
 *             item can only serve under adgroup X.
 *           
 * 
 * <p>Java class for FeedItemAdGroupTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemAdGroupTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetingAdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemAdGroupTargeting", propOrder = {
    "targetingAdGroupId"
})
public class FeedItemAdGroupTargeting {

    @XmlElement(name = "TargetingAdGroupId")
    protected Long targetingAdGroupId;

    /**
     * Gets the value of the targetingAdGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetingAdGroupId() {
        return targetingAdGroupId;
    }

    /**
     * Sets the value of the targetingAdGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetingAdGroupId(Long value) {
        this.targetingAdGroupId = value;
    }

}
