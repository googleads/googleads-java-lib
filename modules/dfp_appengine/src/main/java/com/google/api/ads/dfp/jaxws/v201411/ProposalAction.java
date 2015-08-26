
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link Proposal} objects.
 *           
 * 
 * <p>Java class for ProposalAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProposalAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalAction", propOrder = {
    "proposalActionType"
})
@XmlSeeAlso({
    UnarchiveProposals.class,
    RetractProposals.class,
    SubmitProposalsForApproval.class,
    ArchiveProposals.class
})
public abstract class ProposalAction {

    @XmlElement(name = "ProposalAction.Type")
    protected String proposalActionType;

    /**
     * Gets the value of the proposalActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalActionType() {
        return proposalActionType;
    }

    /**
     * Sets the value of the proposalActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalActionType(String value) {
        this.proposalActionType = value;
    }

}
