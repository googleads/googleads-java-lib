
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link ProposalLineItem} objects that match
 *             the given {@link Statement#query}.
 *             
 *             @param proposalLineItemAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter a set of
 *             proposal line items
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performProposalLineItemAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performProposalLineItemAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="proposalLineItemAction" type="{https://www.google.com/apis/ads/publisher/v201311}ProposalLineItemAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201311}Statement" minOccurs="0"/>
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
    "proposalLineItemAction",
    "filterStatement"
})
@XmlRootElement(name = "performProposalLineItemAction")
public class ProposalLineItemServiceInterfaceperformProposalLineItemAction {

    protected ProposalLineItemAction proposalLineItemAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the proposalLineItemAction property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItemAction }
     *     
     */
    public ProposalLineItemAction getProposalLineItemAction() {
        return proposalLineItemAction;
    }

    /**
     * Sets the value of the proposalLineItemAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItemAction }
     *     
     */
    public void setProposalLineItemAction(ProposalLineItemAction value) {
        this.proposalLineItemAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
