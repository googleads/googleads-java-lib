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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CustomCriteria} object is used to perform custom criteria targeting
 *             on custom targeting keys of type {@link CustomTargetingKey.Type#PREDEFINED}
 *             or {@link CustomTargetingKey.Type#FREEFORM}.
 *           
 * 
 * <p>Java class for CustomCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}CustomCriteriaLeaf">
 *       &lt;sequence>
 *         &lt;element name="keyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valueIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{https://www.google.com/apis/ads/publisher/v201711}CustomCriteria.ComparisonOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomCriteria", propOrder = {
    "keyId",
    "valueIds",
    "operator"
})
public class CustomCriteria
    extends CustomCriteriaLeaf
{

    protected Long keyId;
    @XmlElement(type = Long.class)
    protected List<Long> valueIds;
    @XmlSchemaType(name = "string")
    protected CustomCriteriaComparisonOperator operator;

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyId(Long value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the valueIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getValueIds() {
        if (valueIds == null) {
            valueIds = new ArrayList<Long>();
        }
        return this.valueIds;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCriteriaComparisonOperator }
     *     
     */
    public CustomCriteriaComparisonOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCriteriaComparisonOperator }
     *     
     */
    public void setOperator(CustomCriteriaComparisonOperator value) {
        this.operator = value;
    }

}
