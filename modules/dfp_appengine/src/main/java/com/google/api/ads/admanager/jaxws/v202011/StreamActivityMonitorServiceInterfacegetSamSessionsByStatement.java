// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the logging information for a DAI session. A DAI session can be identified by it's
 *             session id or debug key. The session ID must be registered via the {@code
 *             registerSessionsForMonitoring} method before it can be accessed. There may be some delay before
 *             the session is available.
 *             
 *             <p>The number of sessions requested is limited to 25. The following fields are supported for
 *             filtering:
 *             
 *             <table>
 *             <tbody>
 *             <tr>
 *             <th>Entity property</th>
 *             <th>PQL filter</th>
 *             </tr>
 *             <tr>
 *             <td>
 *             Session id
 *             </td>
 *             <td>
 *             'sessionId'
 *             </td>
 *             </tr>
 *             <tr>
 *             <td>
 *             Debug key
 *             </td>
 *             <td>
 *             'debugKey"
 *             </td>
 *             </tr>
 *             </tbody>
 *             </table>
 *             
 *             @param statement PQL specifying the sessionId or debugKey to fetch logging information for.
 *             Only '=' and 'IN' expressions are supported.
 *             @throws ApiException if there is an error while fetching the logging information or if there is
 *             no SAM session is associated with any of the {@code sessionIds}.
 *           
 * 
 * <p>Java class for getSamSessionsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getSamSessionsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v202011}Statement" minOccurs="0"/>
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
    "statement"
})
@XmlRootElement(name = "getSamSessionsByStatement")
public class StreamActivityMonitorServiceInterfacegetSamSessionsByStatement {

    protected Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
