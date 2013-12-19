
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ActivityGroup} uniquely identified by the given ID.
 *             
 *             @param activityGroupId the ID of the activity group, which must already exist.
 *             @return the {@code ActivityGroup} uniquely identified by the given ID.
 *           
 * 
 * <p>Java class for getActivityGroup element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getActivityGroup">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="activityGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "activityGroupId"
})
@XmlRootElement(name = "getActivityGroup")
public class ActivityGroupServiceInterfacegetActivityGroup {

    protected Integer activityGroupId;

    /**
     * Gets the value of the activityGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityGroupId() {
        return activityGroupId;
    }

    /**
     * Sets the value of the activityGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityGroupId(Integer value) {
        this.activityGroupId = value;
    }

}
