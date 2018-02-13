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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ContentMetadataKeyHierarchyLevel} represents one level in a {@link
 *             ContentMetadataKeyHierarchy}. The level consists of a {@link CustomTargetingKey} and an integer
 *             that represents the level's position in the hierarchy.
 *           
 * 
 * <p>Java class for ContentMetadataKeyHierarchyLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataKeyHierarchyLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customTargetingKeyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hierarchyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataKeyHierarchyLevel", propOrder = {
    "customTargetingKeyId",
    "hierarchyLevel"
})
public class ContentMetadataKeyHierarchyLevel {

    protected Long customTargetingKeyId;
    protected Integer hierarchyLevel;

    /**
     * Gets the value of the customTargetingKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }

    /**
     * Sets the value of the customTargetingKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomTargetingKeyId(Long value) {
        this.customTargetingKeyId = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * Sets the value of the hierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHierarchyLevel(Integer value) {
        this.hierarchyLevel = value;
    }

}
