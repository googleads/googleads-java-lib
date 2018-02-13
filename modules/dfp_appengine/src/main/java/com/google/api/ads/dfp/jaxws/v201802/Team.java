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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Team} defines a grouping of users and what entities they have access
 *             to. Users are added to teams with {@link UserTeamAssociation} objects.
 *           
 * 
 * <p>Java class for Team complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Team">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}TeamStatus" minOccurs="0"/>
 *         &lt;element name="hasAllCompanies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasAllInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teamAccessType" type="{https://www.google.com/apis/ads/publisher/v201802}TeamAccessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Team", propOrder = {
    "id",
    "name",
    "description",
    "status",
    "hasAllCompanies",
    "hasAllInventory",
    "teamAccessType"
})
public class Team {

    protected Long id;
    protected String name;
    protected String description;
    @XmlSchemaType(name = "string")
    protected TeamStatus status;
    protected Boolean hasAllCompanies;
    protected Boolean hasAllInventory;
    @XmlSchemaType(name = "string")
    protected TeamAccessType teamAccessType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TeamStatus }
     *     
     */
    public TeamStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamStatus }
     *     
     */
    public void setStatus(TeamStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the hasAllCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAllCompanies() {
        return hasAllCompanies;
    }

    /**
     * Sets the value of the hasAllCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAllCompanies(Boolean value) {
        this.hasAllCompanies = value;
    }

    /**
     * Gets the value of the hasAllInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAllInventory() {
        return hasAllInventory;
    }

    /**
     * Sets the value of the hasAllInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAllInventory(Boolean value) {
        this.hasAllInventory = value;
    }

    /**
     * Gets the value of the teamAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link TeamAccessType }
     *     
     */
    public TeamAccessType getTeamAccessType() {
        return teamAccessType;
    }

    /**
     * Sets the value of the teamAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamAccessType }
     *     
     */
    public void setTeamAccessType(TeamAccessType value) {
        this.teamAccessType = value;
    }

}
