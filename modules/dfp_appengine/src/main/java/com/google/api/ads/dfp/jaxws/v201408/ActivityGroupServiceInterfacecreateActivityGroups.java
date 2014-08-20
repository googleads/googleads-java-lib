
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link ActivityGroup} objects.
 *             
 *             @param activityGroups the activity groups to be created.
 *             @return the created activity groups with their IDs filled in.
 *           
 * 
 * <p>Java class for createActivityGroups element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createActivityGroups">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="activityGroups" type="{https://www.google.com/apis/ads/publisher/v201408}ActivityGroup" maxOccurs="unbounded" minOccurs="0"/>
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
    "activityGroups"
})
@XmlRootElement(name = "createActivityGroups")
public class ActivityGroupServiceInterfacecreateActivityGroups {

    protected List<ActivityGroup> activityGroups;

    /**
     * Gets the value of the activityGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityGroup }
     * 
     * 
     */
    public List<ActivityGroup> getActivityGroups() {
        if (activityGroups == null) {
            activityGroups = new ArrayList<ActivityGroup>();
        }
        return this.activityGroups;
    }

}
