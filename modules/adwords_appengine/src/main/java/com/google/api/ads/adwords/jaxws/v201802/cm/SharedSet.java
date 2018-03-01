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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             SharedSets are used for sharing entities across multiple campaigns
 *             under the same account.
 *           
 * 
 * <p>Java class for SharedSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sharedSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201802}SharedSetType" minOccurs="0"/>
 *         &lt;element name="memberCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="referenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}SharedSet.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedSet", propOrder = {
    "sharedSetId",
    "name",
    "type",
    "memberCount",
    "referenceCount",
    "status"
})
public class SharedSet {

    protected Long sharedSetId;
    protected String name;
    @XmlSchemaType(name = "string")
    protected SharedSetType type;
    protected Integer memberCount;
    protected Integer referenceCount;
    @XmlSchemaType(name = "string")
    protected SharedSetStatus status;

    /**
     * Gets the value of the sharedSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedSetId() {
        return sharedSetId;
    }

    /**
     * Sets the value of the sharedSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedSetId(Long value) {
        this.sharedSetId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SharedSetType }
     *     
     */
    public SharedSetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedSetType }
     *     
     */
    public void setType(SharedSetType value) {
        this.type = value;
    }

    /**
     * Gets the value of the memberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     * Sets the value of the memberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberCount(Integer value) {
        this.memberCount = value;
    }

    /**
     * Gets the value of the referenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }

    /**
     * Sets the value of the referenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceCount(Integer value) {
        this.referenceCount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SharedSetStatus }
     *     
     */
    public SharedSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedSetStatus }
     *     
     */
    public void setStatus(SharedSetStatus value) {
        this.status = value;
    }

}
