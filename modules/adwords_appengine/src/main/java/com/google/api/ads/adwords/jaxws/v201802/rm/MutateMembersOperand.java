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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operand containing user list id and members to be added or removed.
 *           
 * 
 * <p>Java class for MutateMembersOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutateMembersOperand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userListId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="removeAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="membersList" type="{https://adwords.google.com/api/adwords/rm/v201802}Member" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateMembersOperand", propOrder = {
    "userListId",
    "removeAll",
    "membersList"
})
public class MutateMembersOperand {

    protected Long userListId;
    protected Boolean removeAll;
    protected List<Member> membersList;

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
     * Gets the value of the removeAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAll() {
        return removeAll;
    }

    /**
     * Sets the value of the removeAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAll(Boolean value) {
        this.removeAll = value;
    }

    /**
     * Gets the value of the membersList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membersList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembersList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Member }
     * 
     * 
     */
    public List<Member> getMembersList() {
        if (membersList == null) {
            membersList = new ArrayList<Member>();
        }
        return this.membersList;
    }

}
