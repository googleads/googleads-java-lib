
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link Proposal}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link Proposal#name}</li>
 *             </ul>
 *             
 *             @param proposal the proposal to create
 *             @return the created proposal with its ID filled in
 *           
 * 
 * <p>Java class for createProposal element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createProposal">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposal" type="{https://www.google.com/apis/ads/publisher/v201306}Proposal" minOccurs="0"/>
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
    "proposal"
})
@XmlRootElement(name = "createProposal")
public class ProposalServiceInterfacecreateProposal {

    protected Proposal proposal;

    /**
     * Gets the value of the proposal property.
     * 
     * @return
     *     possible object is
     *     {@link Proposal }
     *     
     */
    public Proposal getProposal() {
        return proposal;
    }

    /**
     * Sets the value of the proposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal }
     *     
     */
    public void setProposal(Proposal value) {
        this.proposal = value;
    }

}
