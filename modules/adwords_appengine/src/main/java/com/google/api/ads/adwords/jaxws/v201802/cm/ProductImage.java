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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents product image specific data.
 *           
 * 
 * <p>Java class for ProductImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayCallToAction" type="{https://adwords.google.com/api/adwords/cm/v201802}DisplayCallToAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductImage", propOrder = {
    "productImage",
    "description",
    "displayCallToAction"
})
public class ProductImage {

    protected Image productImage;
    protected String description;
    protected DisplayCallToAction displayCallToAction;

    /**
     * Gets the value of the productImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getProductImage() {
        return productImage;
    }

    /**
     * Sets the value of the productImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setProductImage(Image value) {
        this.productImage = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayCallToAction property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayCallToAction }
     *     
     */
    public DisplayCallToAction getDisplayCallToAction() {
        return displayCallToAction;
    }

    /**
     * Sets the value of the displayCallToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayCallToAction }
     *     
     */
    public void setDisplayCallToAction(DisplayCallToAction value) {
        this.displayCallToAction = value;
    }

}
