// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ContactPage} of {@link Contact} objects that satisfy the given {@link
 *             Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link Contact#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code email}</td>
 *             <td>{@link Contact#email}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link Contact#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code comment}</td>
 *             <td>{@link Contact#comment}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code companyId}</td>
 *             <td>{@link Contact#companyId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code title}</td>
 *             <td>{@link Contact#title}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code cellPhone}</td>
 *             <td>{@link Contact#cellPhone}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code workPhone}</td>
 *             <td>{@link Contact#workPhone}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code faxPhone}</td>
 *             <td>{@link Contact#faxPhone}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link Contact#status}</td>
 *             </tr>
 *             </table>
 *           
 * 
 * <p>Java class for getContactsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getContactsByStatement"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v202408}Statement" minOccurs="0"/&gt;
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
    "statement"
})
@XmlRootElement(name = "getContactsByStatement")
public class ContactServiceInterfacegetContactsByStatement {

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
