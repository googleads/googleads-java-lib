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
 *             UserList - represents a user list that is defined by the advertiser to be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for CriterionUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="userListId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userListMembershipStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}CriterionUserList.MembershipStatus" minOccurs="0"/>
 *         &lt;element name="userListEligibleForSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userListEligibleForDisplay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionUserList", propOrder = {
    "userListId",
    "userListName",
    "userListMembershipStatus",
    "userListEligibleForSearch",
    "userListEligibleForDisplay"
})
public class CriterionUserList
    extends Criterion
{

    protected Long userListId;
    protected String userListName;
    @XmlSchemaType(name = "string")
    protected CriterionUserListMembershipStatus userListMembershipStatus;
    protected Boolean userListEligibleForSearch;
    protected Boolean userListEligibleForDisplay;

    /**
     * Gets the value of the userListId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserListId() {
        return userListId;
    }

    /**
     * Sets the value of the userListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserListId(Long value) {
        this.userListId = value;
    }

    /**
     * Gets the value of the userListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListName() {
        return userListName;
    }

    /**
     * Sets the value of the userListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListName(String value) {
        this.userListName = value;
    }

    /**
     * Gets the value of the userListMembershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionUserListMembershipStatus }
     *     
     */
    public CriterionUserListMembershipStatus getUserListMembershipStatus() {
        return userListMembershipStatus;
    }

    /**
     * Sets the value of the userListMembershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionUserListMembershipStatus }
     *     
     */
    public void setUserListMembershipStatus(CriterionUserListMembershipStatus value) {
        this.userListMembershipStatus = value;
    }

    /**
     * Gets the value of the userListEligibleForSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserListEligibleForSearch() {
        return userListEligibleForSearch;
    }

    /**
     * Sets the value of the userListEligibleForSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserListEligibleForSearch(Boolean value) {
        this.userListEligibleForSearch = value;
    }

    /**
     * Gets the value of the userListEligibleForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserListEligibleForDisplay() {
        return userListEligibleForDisplay;
    }

    /**
     * Sets the value of the userListEligibleForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserListEligibleForDisplay(Boolean value) {
        this.userListEligibleForDisplay = value;
    }

}
