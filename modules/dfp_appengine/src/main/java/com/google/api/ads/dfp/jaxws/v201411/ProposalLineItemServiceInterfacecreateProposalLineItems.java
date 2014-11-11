
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link ProposalLineItem} objects.
 *             
 *             For each proposal line item, the following fields are required:
 *             <ul>
 *             <li>{@link ProposalLineItem#proposalId}</li>
 *             <li>{@link ProposalLineItem#rateCardId}</li>
 *             <li>{@link ProposalLineItem#productId}</li>
 *             <li>{@link ProposalLineItem#name}</li>
 *             <li>{@link ProposalLineItem#startDateTime}</li>
 *             <li>{@link ProposalLineItem#endDateTime}</li>
 *             </ul>
 *             
 *             @param proposalLineItems the proposal line items to create
 *             @return the created proposal line items with their IDs filled in
 *           
 * 
 * <p>Java class for createProposalLineItems element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createProposalLineItems">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposalLineItems" type="{https://www.google.com/apis/ads/publisher/v201411}ProposalLineItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "proposalLineItems"
})
@XmlRootElement(name = "createProposalLineItems")
public class ProposalLineItemServiceInterfacecreateProposalLineItems {

    protected List<ProposalLineItem> proposalLineItems;

    /**
     * Gets the value of the proposalLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proposalLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProposalLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposalLineItem }
     * 
     * 
     */
    public List<ProposalLineItem> getProposalLineItems() {
        if (proposalLineItems == null) {
            proposalLineItems = new ArrayList<ProposalLineItem>();
        }
        return this.proposalLineItems;
    }

}
