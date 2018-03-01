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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Class that holds user list member identifiers. The following types of member
 *             identifier are supported:
 *             
 *             <ul>
 *             <li>Contact info (email, phone number, address)
 *             <li>Mobile advertising ID
 *             <li>User IDs generated and assigned by advertiser
 *             </ul>
 *             
 *             A list can be uploaded with only one type of data and once uploaded will not
 *             accept any other ID types.
 *           
 * 
 * <p>Java class for Member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hashedEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hashedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressInfo" type="{https://adwords.google.com/api/adwords/rm/v201802}AddressInfo" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Member", propOrder = {
    "hashedEmail",
    "mobileId",
    "hashedPhoneNumber",
    "addressInfo",
    "userId"
})
public class Member {

    protected String hashedEmail;
    protected String mobileId;
    protected String hashedPhoneNumber;
    protected AddressInfo addressInfo;
    protected String userId;

    /**
     * Gets the value of the hashedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedEmail() {
        return hashedEmail;
    }

    /**
     * Sets the value of the hashedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedEmail(String value) {
        this.hashedEmail = value;
    }

    /**
     * Gets the value of the mobileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileId() {
        return mobileId;
    }

    /**
     * Sets the value of the mobileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileId(String value) {
        this.mobileId = value;
    }

    /**
     * Gets the value of the hashedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedPhoneNumber() {
        return hashedPhoneNumber;
    }

    /**
     * Sets the value of the hashedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedPhoneNumber(String value) {
        this.hashedPhoneNumber = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
