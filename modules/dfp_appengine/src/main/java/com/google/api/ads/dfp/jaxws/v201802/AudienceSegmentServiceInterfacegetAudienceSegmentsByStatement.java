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
 *             Gets an {@link AudienceSegmentPage} of {@link AudienceSegment} objects that satisfy the given
 *             {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th>
 *             <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link AudienceSegment#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link AudienceSegment#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link AudienceSegment#status}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code type}</td>
 *             <td>{@link AudienceSegment#type}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code size}</td>
 *             <td>{@link AudienceSegment#size}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code dataProviderName}</td>
 *             <td>{@link AudienceSegmentDataProvider#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code approvalStatus}</td>
 *             <td>{@link ThirdPartyAudienceSegment#approvalStatus}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code cost}</td>
 *             <td>{@link ThirdPartyAudienceSegment#cost}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code startDateTime}</td>
 *             <td>{@link ThirdPartyAudienceSegment#startDateTime}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code endDateTime}</td>
 *             <td>{@link ThirdPartyAudienceSegment#endDateTime}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter a set of audience
 *             segments
 *             @return the audience segments that match the given filter
 *           
 * 
 * <p>Java class for getAudienceSegmentsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getAudienceSegmentsByStatement">
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
@XmlRootElement(name = "getAudienceSegmentsByStatement")
public class AudienceSegmentServiceInterfacegetAudienceSegmentsByStatement {

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
