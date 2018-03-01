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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a UserList object that is sent over the wire.
 *             This is a list of users an account may target.
 *           
 * 
 * <p>Java class for UserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/rm/v201802}UserListMembershipStatus" minOccurs="0"/>
 *         &lt;element name="integrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessReason" type="{https://adwords.google.com/api/adwords/rm/v201802}AccessReason" minOccurs="0"/>
 *         &lt;element name="accountUserListStatus" type="{https://adwords.google.com/api/adwords/rm/v201802}AccountUserListStatus" minOccurs="0"/>
 *         &lt;element name="membershipLifeSpan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sizeRange" type="{https://adwords.google.com/api/adwords/rm/v201802}SizeRange" minOccurs="0"/>
 *         &lt;element name="sizeForSearch" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sizeRangeForSearch" type="{https://adwords.google.com/api/adwords/rm/v201802}SizeRange" minOccurs="0"/>
 *         &lt;element name="listType" type="{https://adwords.google.com/api/adwords/rm/v201802}UserListType" minOccurs="0"/>
 *         &lt;element name="isEligibleForSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEligibleForDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="closingReason" type="{https://adwords.google.com/api/adwords/rm/v201802}UserListClosingReason" minOccurs="0"/>
 *         &lt;element name="UserList.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserList", propOrder = {
    "id",
    "isReadOnly",
    "name",
    "description",
    "status",
    "integrationCode",
    "accessReason",
    "accountUserListStatus",
    "membershipLifeSpan",
    "size",
    "sizeRange",
    "sizeForSearch",
    "sizeRangeForSearch",
    "listType",
    "isEligibleForSearch",
    "isEligibleForDisplay",
    "closingReason",
    "userListType"
})
@XmlSeeAlso({
    SimilarUserList.class,
    LogicalUserList.class,
    BasicUserList.class,
    RuleBasedUserList.class,
    CrmBasedUserList.class
})
public class UserList {

    protected Long id;
    protected Boolean isReadOnly;
    protected String name;
    protected String description;
    @XmlSchemaType(name = "string")
    protected UserListMembershipStatus status;
    protected String integrationCode;
    @XmlSchemaType(name = "string")
    protected AccessReason accessReason;
    @XmlSchemaType(name = "string")
    protected AccountUserListStatus accountUserListStatus;
    protected Long membershipLifeSpan;
    protected Long size;
    @XmlSchemaType(name = "string")
    protected SizeRange sizeRange;
    protected Long sizeForSearch;
    @XmlSchemaType(name = "string")
    protected SizeRange sizeRangeForSearch;
    @XmlSchemaType(name = "string")
    protected UserListType listType;
    protected Boolean isEligibleForSearch;
    protected Boolean isEligibleForDisplay;
    @XmlSchemaType(name = "string")
    protected UserListClosingReason closingReason;
    @XmlElement(name = "UserList.Type")
    protected String userListType;

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
     * Gets the value of the isReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
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
     *     {@link UserListMembershipStatus }
     *     
     */
    public UserListMembershipStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListMembershipStatus }
     *     
     */
    public void setStatus(UserListMembershipStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the integrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationCode() {
        return integrationCode;
    }

    /**
     * Sets the value of the integrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationCode(String value) {
        this.integrationCode = value;
    }

    /**
     * Gets the value of the accessReason property.
     * 
     * @return
     *     possible object is
     *     {@link AccessReason }
     *     
     */
    public AccessReason getAccessReason() {
        return accessReason;
    }

    /**
     * Sets the value of the accessReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessReason }
     *     
     */
    public void setAccessReason(AccessReason value) {
        this.accessReason = value;
    }

    /**
     * Gets the value of the accountUserListStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUserListStatus }
     *     
     */
    public AccountUserListStatus getAccountUserListStatus() {
        return accountUserListStatus;
    }

    /**
     * Sets the value of the accountUserListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUserListStatus }
     *     
     */
    public void setAccountUserListStatus(AccountUserListStatus value) {
        this.accountUserListStatus = value;
    }

    /**
     * Gets the value of the membershipLifeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMembershipLifeSpan() {
        return membershipLifeSpan;
    }

    /**
     * Sets the value of the membershipLifeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMembershipLifeSpan(Long value) {
        this.membershipLifeSpan = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the sizeRange property.
     * 
     * @return
     *     possible object is
     *     {@link SizeRange }
     *     
     */
    public SizeRange getSizeRange() {
        return sizeRange;
    }

    /**
     * Sets the value of the sizeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeRange }
     *     
     */
    public void setSizeRange(SizeRange value) {
        this.sizeRange = value;
    }

    /**
     * Gets the value of the sizeForSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSizeForSearch() {
        return sizeForSearch;
    }

    /**
     * Sets the value of the sizeForSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSizeForSearch(Long value) {
        this.sizeForSearch = value;
    }

    /**
     * Gets the value of the sizeRangeForSearch property.
     * 
     * @return
     *     possible object is
     *     {@link SizeRange }
     *     
     */
    public SizeRange getSizeRangeForSearch() {
        return sizeRangeForSearch;
    }

    /**
     * Sets the value of the sizeRangeForSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeRange }
     *     
     */
    public void setSizeRangeForSearch(SizeRange value) {
        this.sizeRangeForSearch = value;
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link UserListType }
     *     
     */
    public UserListType getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListType }
     *     
     */
    public void setListType(UserListType value) {
        this.listType = value;
    }

    /**
     * Gets the value of the isEligibleForSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForSearch() {
        return isEligibleForSearch;
    }

    /**
     * Sets the value of the isEligibleForSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForSearch(Boolean value) {
        this.isEligibleForSearch = value;
    }

    /**
     * Gets the value of the isEligibleForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForDisplay() {
        return isEligibleForDisplay;
    }

    /**
     * Sets the value of the isEligibleForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForDisplay(Boolean value) {
        this.isEligibleForDisplay = value;
    }

    /**
     * Gets the value of the closingReason property.
     * 
     * @return
     *     possible object is
     *     {@link UserListClosingReason }
     *     
     */
    public UserListClosingReason getClosingReason() {
        return closingReason;
    }

    /**
     * Sets the value of the closingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListClosingReason }
     *     
     */
    public void setClosingReason(UserListClosingReason value) {
        this.closingReason = value;
    }

    /**
     * Gets the value of the userListType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListType() {
        return userListType;
    }

    /**
     * Sets the value of the userListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListType(String value) {
        this.userListType = value;
    }

}
