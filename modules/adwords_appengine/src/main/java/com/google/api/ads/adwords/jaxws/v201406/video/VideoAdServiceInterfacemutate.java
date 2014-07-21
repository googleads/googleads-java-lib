
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies the given list operations, i.e. Add or Set.
 *             ADD - Creates the given VideoAds.  Each VideoAd must reference the campaignId of
 *             an existing campaign.  Associations with one or more TargetingGroups must be
 *             specified before the ad can serve, but these can be optionally omitted and applied later.
 *             SET - Updates the VideoAds. Attributes of VideoAds are immutable, only statuses
 *             and TargetingGroupAssocations can be modified.
 *             
 *             @param operations The operations to apply.
 *             @return The VideoAds as they appear after the operations have been applied.
 *           
 * 
 * <p>Java class for mutate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/video/v201406}VideoAdOperation" maxOccurs="unbounded" minOccurs="0"/>
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
    "operations"
})
@XmlRootElement(name = "mutate")
public class VideoAdServiceInterfacemutate {

    protected List<VideoAdOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoAdOperation }
     * 
     * 
     */
    public List<VideoAdOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<VideoAdOperation>();
        }
        return this.operations;
    }

}
