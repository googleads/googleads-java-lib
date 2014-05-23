
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A key for referencing approval statuses for sub-components of this ad.
 *           
 * 
 * <p>Java class for ApprovalContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovalContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetingScope" type="{https://adwords.google.com/api/adwords/video/v201402}TargetingScope" minOccurs="0"/>
 *         &lt;element name="destinationType" type="{https://adwords.google.com/api/adwords/video/v201402}DestinationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalContext", propOrder = {
    "targetingScope",
    "destinationType"
})
public class ApprovalContext {

    protected TargetingScope targetingScope;
    protected DestinationType destinationType;

    /**
     * Gets the value of the targetingScope property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingScope }
     *     
     */
    public TargetingScope getTargetingScope() {
        return targetingScope;
    }

    /**
     * Sets the value of the targetingScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingScope }
     *     
     */
    public void setTargetingScope(TargetingScope value) {
        this.targetingScope = value;
    }

    /**
     * Gets the value of the destinationType property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * Sets the value of the destinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setDestinationType(DestinationType value) {
        this.destinationType = value;
    }

}
