
package com.google.api.ads.dfp.jaxws.v201306;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for approving {@link Proposal} objects.
 *           
 * 
 * <p>Java class for ApproveProposals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproveProposals">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201306}ProposalAction">
 *       &lt;sequence>
 *         &lt;element name="workflowActionIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproveProposals", propOrder = {
    "workflowActionIds"
})
public class ApproveProposals
    extends ProposalAction
{

    @XmlElement(type = Long.class)
    protected List<Long> workflowActionIds;

    /**
     * Gets the value of the workflowActionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowActionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowActionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getWorkflowActionIds() {
        if (workflowActionIds == null) {
            workflowActionIds = new ArrayList<Long>();
        }
        return this.workflowActionIds;
    }

}
