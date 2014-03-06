
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link ProposalLineItem} objects.
 *           
 * 
 * <p>Java class for ProposalLineItemAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProposalLineItemAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemAction", propOrder = {
    "proposalLineItemActionType"
})
@XmlSeeAlso({
    UnarchiveProposalLineItems.class,
    ArchiveProposalLineItems.class
})
public abstract class ProposalLineItemAction {

    @XmlElement(name = "ProposalLineItemAction.Type")
    protected String proposalLineItemActionType;

    /**
     * Gets the value of the proposalLineItemActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalLineItemActionType() {
        return proposalLineItemActionType;
    }

    /**
     * Sets the value of the proposalLineItemActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalLineItemActionType(String value) {
        this.proposalLineItemActionType = value;
    }

}
