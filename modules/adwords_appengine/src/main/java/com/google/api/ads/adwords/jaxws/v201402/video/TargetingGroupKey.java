
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A SegmentKey for segmenting by TargetingGroup.
 *           
 * 
 * <p>Java class for TargetingGroupKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetingGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetingGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupKey", propOrder = {
    "targetingGroupId",
    "targetingGroupName"
})
public class TargetingGroupKey {

    protected Long targetingGroupId;
    protected String targetingGroupName;

    /**
     * Gets the value of the targetingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetingGroupId() {
        return targetingGroupId;
    }

    /**
     * Sets the value of the targetingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetingGroupId(Long value) {
        this.targetingGroupId = value;
    }

    /**
     * Gets the value of the targetingGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetingGroupName() {
        return targetingGroupName;
    }

    /**
     * Sets the value of the targetingGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetingGroupName(String value) {
        this.targetingGroupName = value;
    }

}
