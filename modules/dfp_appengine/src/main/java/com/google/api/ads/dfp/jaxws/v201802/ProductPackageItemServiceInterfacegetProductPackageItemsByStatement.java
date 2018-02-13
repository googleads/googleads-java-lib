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
 *             Gets a {@link ProductPackageItemPage} of {@code ProductPackageItem} objects
 *             that satisfy the filtering criteria specified by given {@link Statement#query}.
 *             The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ProductPackageItem#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productPackageId}</td>
 *             <td>{@link ProductPackageItem#productPackageId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productId}</td>
 *             <td>{@link ProductPackageItem#productId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productTemplateId}</td>
 *             <td>{@link ProductPackageItem#productTemplateId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code mandatory}</td>
 *             <td>{@link ProductPackageItem#mandatory}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code archived}</td>
 *             <td>{@link ProductPackageItem#archived}</td>
 *             </tr>
 *             </table>
 *             
 *             @param statement a Publisher Query Language statement which specifies the
 *             filtering criteria over product packages
 *             @return the product package items that match the given statement
 *           
 * 
 * <p>Java class for getProductPackageItemsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProductPackageItemsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201802}Statement" minOccurs="0"/>
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
@XmlRootElement(name = "getProductPackageItemsByStatement")
public class ProductPackageItemServiceInterfacegetProductPackageItemsByStatement {

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
