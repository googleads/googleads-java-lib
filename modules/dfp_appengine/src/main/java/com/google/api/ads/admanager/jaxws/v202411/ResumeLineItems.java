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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for resuming {@link LineItem} objects.
 *           
 * 
 * <p>Java class for ResumeLineItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResumeLineItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202411}LineItemAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="skipInventoryCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResumeLineItems", propOrder = {
    "skipInventoryCheck"
})
@XmlSeeAlso({
    ResumeAndOverbookLineItems.class
})
public class ResumeLineItems
    extends LineItemAction
{

    protected Boolean skipInventoryCheck;

    /**
     * Gets the value of the skipInventoryCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipInventoryCheck() {
        return skipInventoryCheck;
    }

    /**
     * Sets the value of the skipInventoryCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipInventoryCheck(Boolean value) {
        this.skipInventoryCheck = value;
    }

}
