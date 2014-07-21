
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An association between a VideoAd and a TargetingGroup, with a mutable
 *             for a status for that association.
 *           
 * 
 * <p>Java class for TargetingGroupAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetingGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroupAssociation.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupAssociation", propOrder = {
    "targetingGroupId",
    "status"
})
public class TargetingGroupAssociation {

    protected Long targetingGroupId;
    protected TargetingGroupAssociationStatus status;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupAssociationStatus }
     *     
     */
    public TargetingGroupAssociationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupAssociationStatus }
     *     
     */
    public void setStatus(TargetingGroupAssociationStatus value) {
        this.status = value;
    }

}
