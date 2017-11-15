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
 *             Performs actions on {@link ProductPackageItem} objects that satisfy the given
 *             {@link Statement#query}.
 *             
 *             @param productPackageItemAction the action to perform
 *             @param statement a Publisher Query Language statement used to filter
 *             a set of product package items
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performProductPackageItemAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performProductPackageItemAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productPackageItemAction" type="{https://www.google.com/apis/ads/publisher/v201711}ProductPackageItemAction" minOccurs="0"/>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201711}Statement" minOccurs="0"/>
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
    "productPackageItemAction",
    "statement"
})
@XmlRootElement(name = "performProductPackageItemAction")
public class ProductPackageItemServiceInterfaceperformProductPackageItemAction {

    protected ProductPackageItemAction productPackageItemAction;
    protected Statement statement;

    /**
     * Gets the value of the productPackageItemAction property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPackageItemAction }
     *     
     */
    public ProductPackageItemAction getProductPackageItemAction() {
        return productPackageItemAction;
    }

    /**
     * Sets the value of the productPackageItemAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPackageItemAction }
     *     
     */
    public void setProductPackageItemAction(ProductPackageItemAction value) {
        this.productPackageItemAction = value;
    }

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
