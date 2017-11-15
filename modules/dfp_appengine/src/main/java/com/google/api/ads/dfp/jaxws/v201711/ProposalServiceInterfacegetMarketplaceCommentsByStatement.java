// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link MarketplaceCommentPage} of {@link MarketplaceComment} objects that satisfy the
 *             given {@link Statement#query}. This method only returns comments already sent to Marketplace,
 *             local draft {@link ProposalMarketplaceInfo#marketplaceComment} are not included. The following
 *             fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th>
 *             <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalId}</td>
 *             <td>{@link MarketplaceComment#proposalId}</td>
 *             </tr>
 *             </table>
 *             
 *             The query must specify a {@code proposalId}, and only supports a subset of PQL syntax:<br>
 *             <code>[WHERE <condition> {AND <condition> ...}]</code><br>
 *             <code>[ORDER BY <property> [ASC | DESC]]</code><br>
 *             <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET <offset>}]</code><br>
 *             
 *             <p><code><condition></code><br>
 *             &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <value></code><br>
 *             <code><condition> := <property> IN <list></code><br>
 *             Only supports {@code ORDER BY} {@link MarketplaceComment#creationTime}.
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter a set of marketplace
 *             comments
 *             @return the marketplace comments that match the given filter
 *           
 * 
 * <p>Java class for getMarketplaceCommentsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getMarketplaceCommentsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201711}Statement" minOccurs="0"/>
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
@XmlRootElement(name = "getMarketplaceCommentsByStatement")
public class ProposalServiceInterfacegetMarketplaceCommentsByStatement {

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
