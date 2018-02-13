// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets an {@link ReconciliationOrderReportPage} of {@link ReconciliationOrderReport} objects
 *             that satisfy the given {@link Statement#query}.
 *             The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciliationReportId}</td>
 *             <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ReconciliationOrderReport#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code orderId}</td>
 *             <td>{@link ReconciliationOrderReport#orderId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalId}</td>
 *             <td>{@link ReconciliationOrderReport#proposalId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link ReconciliationOrderReport#status}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code submissionDateTime}</td>
 *             <td>{@link ReconciliationOrderReport#submissionDateTime}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code submitterId}</td>
 *             <td>{@link ReconciliationOrderReport#submitterId}</td>
 *             </tr>
 *             </table>
 *             
 *             The {@code reconciliationReportId} field is required and can only be combined with an
 *             {@code AND} to other conditions. Furthermore, the results may only belong to
 *             one {@link ReconciliationReport}.
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of reconciliation order reports.
 *             @return the reconciliation order reports that match the given filter.
 *           
 * 
 * <p>Java class for getReconciliationOrderReportsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReconciliationOrderReportsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201802}Statement" minOccurs="0"/>
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
@XmlRootElement(name = "getReconciliationOrderReportsByStatement")
public class ReconciliationOrderReportServiceInterfacegetReconciliationOrderReportsByStatement {

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
