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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code UserRecordTeamAssociation} represents the association between a
 *             {@link UserRecord} and a {@link Team}.
 *           
 * 
 * <p>Java class for UserRecordTeamAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRecordTeamAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="overriddenTeamAccessType" type="{https://www.google.com/apis/ads/publisher/v201711}TeamAccessType" minOccurs="0"/>
 *         &lt;element name="defaultTeamAccessType" type="{https://www.google.com/apis/ads/publisher/v201711}TeamAccessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRecordTeamAssociation", propOrder = {
    "teamId",
    "overriddenTeamAccessType",
    "defaultTeamAccessType"
})
@XmlSeeAlso({
    UserTeamAssociation.class
})
public abstract class UserRecordTeamAssociation {

    protected Long teamId;
    @XmlSchemaType(name = "string")
    protected TeamAccessType overriddenTeamAccessType;
    @XmlSchemaType(name = "string")
    protected TeamAccessType defaultTeamAccessType;

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTeamId(Long value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the overriddenTeamAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link TeamAccessType }
     *     
     */
    public TeamAccessType getOverriddenTeamAccessType() {
        return overriddenTeamAccessType;
    }

    /**
     * Sets the value of the overriddenTeamAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamAccessType }
     *     
     */
    public void setOverriddenTeamAccessType(TeamAccessType value) {
        this.overriddenTeamAccessType = value;
    }

    /**
     * Gets the value of the defaultTeamAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link TeamAccessType }
     *     
     */
    public TeamAccessType getDefaultTeamAccessType() {
        return defaultTeamAccessType;
    }

    /**
     * Sets the value of the defaultTeamAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamAccessType }
     *     
     */
    public void setDefaultTeamAccessType(TeamAccessType value) {
        this.defaultTeamAccessType = value;
    }

}
