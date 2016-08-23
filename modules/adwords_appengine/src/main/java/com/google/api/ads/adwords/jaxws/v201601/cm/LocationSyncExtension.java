// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Local business center(LBC) sync extension that ties a LBC account with a campaign.
 *           
 * 
 * <p>Java class for LocationSyncExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSyncExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oAuthInfo" type="{https://adwords.google.com/api/adwords/cm/v201601}OAuthInfo" minOccurs="0"/>
 *         &lt;element name="iconMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shouldSyncUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSyncExtension", propOrder = {
    "email",
    "oAuthInfo",
    "iconMediaId",
    "shouldSyncUrl"
})
public class LocationSyncExtension
    extends AdExtension
{

    protected String email;
    protected OAuthInfo oAuthInfo;
    protected Long iconMediaId;
    protected Boolean shouldSyncUrl;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the oAuthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OAuthInfo }
     *     
     */
    public OAuthInfo getOAuthInfo() {
        return oAuthInfo;
    }

    /**
     * Sets the value of the oAuthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAuthInfo }
     *     
     */
    public void setOAuthInfo(OAuthInfo value) {
        this.oAuthInfo = value;
    }

    /**
     * Gets the value of the iconMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIconMediaId() {
        return iconMediaId;
    }

    /**
     * Sets the value of the iconMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIconMediaId(Long value) {
        this.iconMediaId = value;
    }

    /**
     * Gets the value of the shouldSyncUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldSyncUrl() {
        return shouldSyncUrl;
    }

    /**
     * Sets the value of the shouldSyncUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldSyncUrl(Boolean value) {
        this.shouldSyncUrl = value;
    }

}
