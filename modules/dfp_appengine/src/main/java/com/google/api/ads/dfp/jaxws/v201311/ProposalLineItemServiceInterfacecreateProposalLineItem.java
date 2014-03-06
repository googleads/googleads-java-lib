
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link ProposalLineItem}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link ProposalLineItem#proposalId}</li>
 *             <li>{@link ProposalLineItem#rateCardId}</li>
 *             <li>{@link ProposalLineItem#productId}</li>
 *             <li>{@link ProposalLineItem#name}</li>
 *             <li>{@link ProposalLineItem#startDateTime}</li>
 *             <li>{@link ProposalLineItem#endDateTime}</li>
 *             </ul>
 *             
 *             @param proposalLineItem the proposal line item to create
 *             @return the created proposal line item with its ID filled in
 *           
 * 
 * <p>Java class for createProposalLineItem element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createProposalLineItem">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposalLineItem" type="{https://www.google.com/apis/ads/publisher/v201311}ProposalLineItem" minOccurs="0"/>
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
    "proposalLineItem"
})
@XmlRootElement(name = "createProposalLineItem")
public class ProposalLineItemServiceInterfacecreateProposalLineItem {

    protected ProposalLineItem proposalLineItem;

    /**
     * Gets the value of the proposalLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItem }
     *     
     */
    public ProposalLineItem getProposalLineItem() {
        return proposalLineItem;
    }

    /**
     * Sets the value of the proposalLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItem }
     *     
     */
    public void setProposalLineItem(ProposalLineItem value) {
        this.proposalLineItem = value;
    }

}
