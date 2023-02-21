// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link LineItemPage} of {@link LineItem} objects that satisfy the given {@link
 *             Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tbody>
 *             <tr>
 *             <th>PQL property</th>
 *             <th>Entity property</th>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code CostType}
 *             </td>
 *             <td>
 *             {@link LineItem#costType}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code CreationDateTime}
 *             </td>
 *             <td>
 *             {@link LineItem#creationDateTime}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code DeliveryRateType}
 *             </td>
 *             <td>
 *             {@link LineItem#deliveryRateType}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code EndDateTime}
 *             </td>
 *             <td>
 *             {@link LineItem#endDateTime}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code ExternalId}
 *             </td>
 *             <td>
 *             {@link LineItem#externalId}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code Id}
 *             </td>
 *             <td>
 *             {@link LineItem#id}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code IsMissingCreatives}
 *             </td>
 *             <td>
 *             {@link LineItem#isMissingCreatives}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code IsSetTopBoxEnabled}
 *             </td>
 *             <td>
 *             {@link LineItem#isSetTopBoxEnabled}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code LastModifiedDateTime}
 *             </td>
 *             <td>
 *             {@link LineItem#lastModifiedDateTime}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code LineItemType}
 *             </td>
 *             <td>
 *             {@link LineItem#lineItemType}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code Name}
 *             </td>
 *             <td>
 *             {@link LineItem#name}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code OrderId}
 *             </td>
 *             <td>
 *             {@link LineItem#orderId}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code StartDateTime}
 *             </td>
 *             <td>
 *             {@link LineItem#startDateTime}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code Status}
 *             </td>
 *             <td>
 *             {@link LineItem#status}
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             {@code UnitsBought}
 *             </td>
 *             <td>
 *             {@link LineItem#unitsBought}
 *             </td>
 *             </tr>
 *             </tbody>
 *             </table>
 *           
 * 
 * <p>Java class for getLineItemsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getLineItemsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v202208}Statement" minOccurs="0"/>
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
@XmlRootElement(name = "getLineItemsByStatement")
public class LineItemServiceInterfacegetLineItemsByStatement {

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
