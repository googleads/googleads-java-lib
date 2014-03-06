
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ProposalLineItem}.
 *             
 *             @param proposalLineItem the proposal line item to update
 *             @return the updated proposal line item
 *           
 * 
 * <p>Java class for updateProposalLineItem element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateProposalLineItem">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposalLineItem" type="{https://www.google.com/apis/ads/publisher/v201308}ProposalLineItem" minOccurs="0"/>
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
@XmlRootElement(name = "updateProposalLineItem")
public class ProposalLineItemServiceInterfaceupdateProposalLineItem {

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
