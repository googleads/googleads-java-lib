
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ProposalLineItem} uniquely identified by the given ID.
 *             
 *             @param proposalLineItemId the ID of the proposal line item, which must already exist
 *             @return the proposal line item uniquely identified by the given ID
 *           
 * 
 * <p>Java class for getProposalLineItem element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProposalLineItem">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposalLineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "proposalLineItemId"
})
@XmlRootElement(name = "getProposalLineItem")
public class ProposalLineItemServiceInterfacegetProposalLineItem {

    protected Long proposalLineItemId;

    /**
     * Gets the value of the proposalLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalLineItemId() {
        return proposalLineItemId;
    }

    /**
     * Sets the value of the proposalLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalLineItemId(Long value) {
        this.proposalLineItemId = value;
    }

}
