// Copyright 2025 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ProposalPage} of {@link Proposal} objects that satisfy the given {@link
 *             Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th>
 *             <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link Proposal#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code dfpOrderId}</td>
 *             <td>{@link Proposal#dfpOrderId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link Proposal#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link Proposal#status}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code isArchived}</td>
 *             <td>{@link Proposal#isArchived}</td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code approvalStatus}
 *             <div class="constraint">Only applicable for proposals using sales management</div>
 *             </td>
 *             <td>{@link Proposal#approvalStatus}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lastModifiedDateTime}</td>
 *             <td>{@link Proposal#lastModifiedDateTime}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code isProgrammatic}</td>
 *             <td>{@link Proposal#isProgrammatic}</td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code negotiationStatus}
 *             <div class="constraint">Only applicable for programmatic proposals</div>
 *             </td>
 *             <td>{@link ProposalMarketplaceInfo#negotiationStatus}</td>
 *             </tr>
 *             </table>
 *           
 * 
 * <p>Java class for getProposalsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProposalsByStatement"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v202502}Statement" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterStatement"
})
@XmlRootElement(name = "getProposalsByStatement")
public class ProposalServiceInterfacegetProposalsByStatement {

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
