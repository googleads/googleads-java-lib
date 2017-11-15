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
 *             Gets a {@link ReconciliationReportRowPage} of {@link ReconciliationReportRow} objects that
 *             satisfy the given {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciliationReportId}</td>
 *             <td>{@link ReconciliationReportRow#reconciliationReportId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code advertiserId}</td>
 *             <td>{@link ReconciliationReportRow#advertiserId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code orderId}</td>
 *             <td>{@link ReconciliationReportRow#orderId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lineItemId}</td>
 *             <td>{@link ReconciliationReportRow#lineItemId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalLineItemId}</td>
 *             <td>{@link ReconciliationReportRow#proposalLineItemId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code creativeId}</td>
 *             <td>{@link ReconciliationReportRow#creativeId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lineItemCostType}</td>
 *             <td>{@link ReconciliationReportRow#lineItemCostType}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code dfpClicks}</td>
 *             <td>{@link ReconciliationReportRow#dfpClicks}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code dfpImpressions}</td>
 *             <td>{@link ReconciliationReportRow#dfpImpressions}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code dfpLineItemDays}</td>
 *             <td>{@link ReconciliationReportRow#dfpLineItemDays}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code thirdPartyClicks}</td>
 *             <td>{@link ReconciliationReportRow#thirdPartyClicks}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code thirdPartyImpressions}</td>
 *             <td>{@link ReconciliationReportRow#thirdPartyImpressions}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code thirdPartyLineItemDays}</td>
 *             <td>{@link ReconciliationReportRow#thirdPartyLineItemDays}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code manualClicks}</td>
 *             <td>{@link ReconciliationReportRow#manualClicks}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code manualImpressions}</td>
 *             <td>{@link ReconciliationReportRow#manualImpressions}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code manualLineItemDays}</td>
 *             <td>{@link ReconciliationReportRow#manualLineItemDays}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciledClicks}</td>
 *             <td>{@link ReconciliationReportRow#reconciledClicks}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciledImpressions}</td>
 *             <td>{@link ReconciliationReportRow#reconciledImpressions}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciledLineItemDays}</td>
 *             <td>{@link ReconciliationReportRow#reconciledLineItemDays}</td>
 *             </tr>
 *             </table>
 *             
 *             The {@code reconciliationReportId} field is required and can only be combined with an
 *             {@code AND} to other conditions. Furthermore, the results may only belong to
 *             one {@link ReconciliationReport}.
 *             
 *             @param filterStatement a Publisher Query Language statement used to
 *             filter a set of reconciliation report rows
 *             @return the reconciliation report rows that match the given filter
 *           
 * 
 * <p>Java class for getReconciliationReportRowsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReconciliationReportRowsByStatement">
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
@XmlRootElement(name = "getReconciliationReportRowsByStatement")
public class ReconciliationReportRowServiceInterfacegetReconciliationReportRowsByStatement {

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
