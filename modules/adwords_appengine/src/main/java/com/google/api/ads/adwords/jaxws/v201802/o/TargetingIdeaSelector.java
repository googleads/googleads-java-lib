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


package com.google.api.ads.adwords.jaxws.v201802.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Paging;


/**
 * 
 *             A descriptor for finding {@link TargetingIdea}s that match the specified criteria.
 *           
 * 
 * <p>Java class for TargetingIdeaSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingIdeaSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchParameters" type="{https://adwords.google.com/api/adwords/o/v201802}SearchParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ideaType" type="{https://adwords.google.com/api/adwords/o/v201802}IdeaType" minOccurs="0"/>
 *         &lt;element name="requestType" type="{https://adwords.google.com/api/adwords/o/v201802}RequestType" minOccurs="0"/>
 *         &lt;element name="requestedAttributeTypes" type="{https://adwords.google.com/api/adwords/o/v201802}AttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://adwords.google.com/api/adwords/cm/v201802}Paging" minOccurs="0"/>
 *         &lt;element name="localeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingIdeaSelector", propOrder = {
    "searchParameters",
    "ideaType",
    "requestType",
    "requestedAttributeTypes",
    "paging",
    "localeCode",
    "currencyCode"
})
public class TargetingIdeaSelector {

    protected List<SearchParameter> searchParameters;
    @XmlSchemaType(name = "string")
    protected IdeaType ideaType;
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    @XmlSchemaType(name = "string")
    protected List<AttributeType> requestedAttributeTypes;
    protected Paging paging;
    protected String localeCode;
    protected String currencyCode;

    /**
     * Gets the value of the searchParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchParameter }
     * 
     * 
     */
    public List<SearchParameter> getSearchParameters() {
        if (searchParameters == null) {
            searchParameters = new ArrayList<SearchParameter>();
        }
        return this.searchParameters;
    }

    /**
     * Gets the value of the ideaType property.
     * 
     * @return
     *     possible object is
     *     {@link IdeaType }
     *     
     */
    public IdeaType getIdeaType() {
        return ideaType;
    }

    /**
     * Sets the value of the ideaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdeaType }
     *     
     */
    public void setIdeaType(IdeaType value) {
        this.ideaType = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestedAttributeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedAttributeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedAttributeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    public List<AttributeType> getRequestedAttributeTypes() {
        if (requestedAttributeTypes == null) {
            requestedAttributeTypes = new ArrayList<AttributeType>();
        }
        return this.requestedAttributeTypes;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the localeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCode() {
        return localeCode;
    }

    /**
     * Sets the value of the localeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCode(String value) {
        this.localeCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
