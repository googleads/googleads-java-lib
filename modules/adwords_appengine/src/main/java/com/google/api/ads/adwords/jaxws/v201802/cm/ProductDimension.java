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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Dimension by which to subdivide or filter products.
 *           
 * 
 * <p>Java class for ProductDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDimension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductDimension.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDimension", propOrder = {
    "productDimensionType"
})
@XmlSeeAlso({
    ProductBiddingCategory.class,
    UnknownProductDimension.class,
    ProductChannel.class,
    ProductCanonicalCondition.class,
    ProductCustomAttribute.class,
    ProductTypeFull.class,
    ProductType.class,
    ProductChannelExclusivity.class,
    ProductAdwordsLabels.class,
    ProductLegacyCondition.class,
    ProductAdwordsGrouping.class,
    ProductOfferId.class,
    ProductBrand.class
})
public abstract class ProductDimension {

    @XmlElement(name = "ProductDimension.Type")
    protected String productDimensionType;

    /**
     * Gets the value of the productDimensionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDimensionType() {
        return productDimensionType;
    }

    /**
     * Sets the value of the productDimensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDimensionType(String value) {
        this.productDimensionType = value;
    }

}
