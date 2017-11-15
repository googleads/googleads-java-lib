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
 *             Gets a {@link CustomTargetingValuePage} of {@link CustomTargetingValue}
 *             objects that satisfy the given {@link Statement#query}.
 *             <p>
 *             The {@code WHERE} clause in the {@link Statement#query} must always contain
 *             {@link CustomTargetingValue#customTargetingKeyId} as one of its columns in
 *             a way that it is AND'ed with the rest of the query. So, if you want to
 *             retrieve values for a known set of key ids, valid {@link Statement#query}
 *             would look like:
 *             </p>
 *             <ol>
 *             <li>
 *             "WHERE customTargetingKeyId IN ('17','18','19')" retrieves all values that
 *             are associated with keys having ids 17, 18, 19.
 *             </li>
 *             <li>
 *             "WHERE customTargetingKeyId = '17' AND name = 'red'" retrieves values that
 *             are associated with keys having id 17 and value name is 'red'.
 *             </li>
 *             </ol>
 *             </p>
 *             <p>
 *             The following fields are supported for filtering:
 *             </p>
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th>
 *             <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link CustomTargetingValue#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code customTargetingKeyId}</td>
 *             <td>{@link CustomTargetingValue#customTargetingKeyId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link CustomTargetingValue#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code displayName}</td>
 *             <td>{@link CustomTargetingValue#displayName}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code matchType}</td>
 *             <td>{@link CustomTargetingValue#matchType}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of custom targeting values
 *             @return the custom targeting values that match the given filter
 *           
 * 
 * <p>Java class for getCustomTargetingValuesByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCustomTargetingValuesByStatement">
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
@XmlRootElement(name = "getCustomTargetingValuesByStatement")
public class CustomTargetingServiceInterfacegetCustomTargetingValuesByStatement {

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
