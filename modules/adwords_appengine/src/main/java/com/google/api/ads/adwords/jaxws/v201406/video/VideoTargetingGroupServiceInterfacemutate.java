
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies the given list of operations, i.e. Add or Set.
 *             ADD - Creates the given TargetingGroup. Each TargetingGroup must reference the campaignId of
 *             an existing campaign.
 *             SET - Updates the given TargetingGroup.
 *             <p>
 *             Note: TargetingGroupOperation does not support the REMOVE operator. To
 *             remove a targeting group, set its status to REMOVED.
 *             @param operations A list of unique operations.
 *             The same targeting group name cannot be specified in more than one operation.
 *             @return The list of updated targeting groups, returned in the same order as the
 *             operations list.
 *             @throws ApiException if problems occurred while updating targeting group information.
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
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroupOperation" maxOccurs="unbounded" minOccurs="0"/>
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
public class VideoTargetingGroupServiceInterfacemutate {

    protected List<TargetingGroupOperation> operations;

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
     * {@link TargetingGroupOperation }
     * 
     * 
     */
    public List<TargetingGroupOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<TargetingGroupOperation>();
        }
        return this.operations;
    }

}
