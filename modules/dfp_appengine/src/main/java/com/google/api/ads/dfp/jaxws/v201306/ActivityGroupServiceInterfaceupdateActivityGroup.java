
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ActivityGroup}.
 *             
 *             @param activityGroup the activity group to update.
 *             @return the updated activity group.
 *           
 * 
 * <p>Java class for updateActivityGroup element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateActivityGroup">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="activityGroup" type="{https://www.google.com/apis/ads/publisher/v201306}ActivityGroup" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activityGroup"
})
@XmlRootElement(name = "updateActivityGroup")
public class ActivityGroupServiceInterfaceupdateActivityGroup {

    protected ActivityGroup activityGroup;

    /**
     * Gets the value of the activityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityGroup }
     *     
     */
    public ActivityGroup getActivityGroup() {
        return activityGroup;
    }

    /**
     * Sets the value of the activityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityGroup }
     *     
     */
    public void setActivityGroup(ActivityGroup value) {
        this.activityGroup = value;
    }

}
