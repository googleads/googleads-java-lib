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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             SimilarUserList is a list of users which are similar to users from another UserList.
 *             These lists are readonly and automatically created by google.
 *           
 * 
 * <p>Java class for SimilarUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimilarUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201802}UserList">
 *       &lt;sequence>
 *         &lt;element name="seedUserListId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seedUserListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seedUserListDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seedUserListStatus" type="{https://adwords.google.com/api/adwords/rm/v201802}UserListMembershipStatus" minOccurs="0"/>
 *         &lt;element name="seedListSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimilarUserList", propOrder = {
    "seedUserListId",
    "seedUserListName",
    "seedUserListDescription",
    "seedUserListStatus",
    "seedListSize"
})
public class SimilarUserList
    extends UserList
{

    protected Long seedUserListId;
    protected String seedUserListName;
    protected String seedUserListDescription;
    @XmlSchemaType(name = "string")
    protected UserListMembershipStatus seedUserListStatus;
    protected Long seedListSize;

    /**
     * Gets the value of the seedUserListId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeedUserListId() {
        return seedUserListId;
    }

    /**
     * Sets the value of the seedUserListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeedUserListId(Long value) {
        this.seedUserListId = value;
    }

    /**
     * Gets the value of the seedUserListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeedUserListName() {
        return seedUserListName;
    }

    /**
     * Sets the value of the seedUserListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedUserListName(String value) {
        this.seedUserListName = value;
    }

    /**
     * Gets the value of the seedUserListDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeedUserListDescription() {
        return seedUserListDescription;
    }

    /**
     * Sets the value of the seedUserListDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedUserListDescription(String value) {
        this.seedUserListDescription = value;
    }

    /**
     * Gets the value of the seedUserListStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserListMembershipStatus }
     *     
     */
    public UserListMembershipStatus getSeedUserListStatus() {
        return seedUserListStatus;
    }

    /**
     * Sets the value of the seedUserListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListMembershipStatus }
     *     
     */
    public void setSeedUserListStatus(UserListMembershipStatus value) {
        this.seedUserListStatus = value;
    }

    /**
     * Gets the value of the seedListSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeedListSize() {
        return seedListSize;
    }

    /**
     * Sets the value of the seedListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeedListSize(Long value) {
        this.seedListSize = value;
    }

}
