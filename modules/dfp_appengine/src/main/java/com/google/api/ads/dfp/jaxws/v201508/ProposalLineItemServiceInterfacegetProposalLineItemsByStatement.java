
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ProposalLineItemPage} of {@link ProposalLineItem} objects
 *             that satisfy the given {@link Statement#query}.  The following fields are supported for
 *             filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ProposalLineItem#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link ProposalLineItem#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalId}</td>
 *             <td>{@link ProposalLineItem#proposalId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code isArchived}</td>
 *             <td>{@link ProposalLineItem#isArchived}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lastModifiedDateTime}</td>
 *             <td>{@link ProposalLineItem#lastModifiedDateTime}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code useThirdPartyAdServerFromProposal}</td>
 *             <td>{@link ProposalLineItem#useThirdPartyAdServerFromProposal}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code thirdPartyAdServerId}</td>
 *             <td>{@link ProposalLineItem#thirdPartyAdServerId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code customThirdPartyAdServerName}</td>
 *             <td>{@link ProposalLineItem#customThirdPartyAdServerName}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of proposal line items
 *             @return the proposal line items that match the given filter
 *           
 * 
 * <p>Java class for getProposalLineItemsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProposalLineItemsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201508}Statement" minOccurs="0"/>
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
    "filterStatement"
})
@XmlRootElement(name = "getProposalLineItemsByStatement")
public class ProposalLineItemServiceInterfacegetProposalLineItemsByStatement {

    protected Statement filterStatement;

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
