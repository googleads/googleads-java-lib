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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates a list of {@link ReconciliationLineItemReport} objects which belong to same
 *             {@link ReconciliationReport}.
 *             
 *             @param reconciliationLineItemReports a list of
 *             {@link ReconciliationLineItemReport reconciliation line item reports} to update
 *             @return the updated {@link ReconciliationLineItemReport} objects
 *           
 * 
 * <p>Java class for updateReconciliationLineItemReports element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateReconciliationLineItemReports">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reconciliationLineItemReports" type="{https://www.google.com/apis/ads/publisher/v201711}ReconciliationLineItemReport" maxOccurs="unbounded" minOccurs="0"/>
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
    "reconciliationLineItemReports"
})
@XmlRootElement(name = "updateReconciliationLineItemReports")
public class ReconciliationLineItemReportServiceInterfaceupdateReconciliationLineItemReports {

    protected List<ReconciliationLineItemReport> reconciliationLineItemReports;

    /**
     * Gets the value of the reconciliationLineItemReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reconciliationLineItemReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReconciliationLineItemReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationLineItemReport }
     * 
     * 
     */
    public List<ReconciliationLineItemReport> getReconciliationLineItemReports() {
        if (reconciliationLineItemReports == null) {
            reconciliationLineItemReports = new ArrayList<ReconciliationLineItemReport>();
        }
        return this.reconciliationLineItemReports;
    }

}
