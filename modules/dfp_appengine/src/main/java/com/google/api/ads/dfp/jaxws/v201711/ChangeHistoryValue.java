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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeHistoryValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeHistoryValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}ObjectValue">
 *       &lt;sequence>
 *         &lt;element name="entityType" type="{https://www.google.com/apis/ads/publisher/v201711}ChangeHistoryEntityType" minOccurs="0"/>
 *         &lt;element name="operation" type="{https://www.google.com/apis/ads/publisher/v201711}ChangeHistoryOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeHistoryValue", propOrder = {
    "entityType",
    "operation"
})
public class ChangeHistoryValue
    extends ObjectValue
{

    @XmlSchemaType(name = "string")
    protected ChangeHistoryEntityType entityType;
    @XmlSchemaType(name = "string")
    protected ChangeHistoryOperation operation;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeHistoryEntityType }
     *     
     */
    public ChangeHistoryEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeHistoryEntityType }
     *     
     */
    public void setEntityType(ChangeHistoryEntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeHistoryOperation }
     *     
     */
    public ChangeHistoryOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeHistoryOperation }
     *     
     */
    public void setOperation(ChangeHistoryOperation value) {
        this.operation = value;
    }

}
