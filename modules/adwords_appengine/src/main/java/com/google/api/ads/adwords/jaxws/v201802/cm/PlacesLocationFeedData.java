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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data used to configure a location feed populated from
 *             Google My Business Locations.
 *           
 * 
 * <p>Java class for PlacesLocationFeedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacesLocationFeedData">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}SystemFeedGenerationData">
 *       &lt;sequence>
 *         &lt;element name="oAuthInfo" type="{https://adwords.google.com/api/adwords/cm/v201802}OAuthInfo" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessAccountIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryFilters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="labelFilters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacesLocationFeedData", propOrder = {
    "oAuthInfo",
    "emailAddress",
    "businessAccountIdentifier",
    "businessNameFilter",
    "categoryFilters",
    "labelFilters"
})
public class PlacesLocationFeedData
    extends SystemFeedGenerationData
{

    protected OAuthInfo oAuthInfo;
    protected String emailAddress;
    protected String businessAccountIdentifier;
    protected String businessNameFilter;
    protected List<String> categoryFilters;
    protected List<String> labelFilters;

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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the businessAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAccountIdentifier() {
        return businessAccountIdentifier;
    }

    /**
     * Sets the value of the businessAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAccountIdentifier(String value) {
        this.businessAccountIdentifier = value;
    }

    /**
     * Gets the value of the businessNameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameFilter() {
        return businessNameFilter;
    }

    /**
     * Sets the value of the businessNameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameFilter(String value) {
        this.businessNameFilter = value;
    }

    /**
     * Gets the value of the categoryFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryFilters() {
        if (categoryFilters == null) {
            categoryFilters = new ArrayList<String>();
        }
        return this.categoryFilters;
    }

    /**
     * Gets the value of the labelFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLabelFilters() {
        if (labelFilters == null) {
            labelFilters = new ArrayList<String>();
        }
        return this.labelFilters;
    }

}
