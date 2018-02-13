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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code SuggestedAdUnit} represents a suggestion for a new ad unit, based on an ad tag that has
 *             been served at least ten times in the past week, but which does not correspond to a defined ad
 *             unit. This type is read-only.
 *           
 * 
 * <p>Java class for SuggestedAdUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedAdUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRequests" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentPath" type="{https://www.google.com/apis/ads/publisher/v201802}AdUnitParent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetWindow" type="{https://www.google.com/apis/ads/publisher/v201802}AdUnit.TargetWindow" minOccurs="0"/>
 *         &lt;element name="targetPlatform" type="{https://www.google.com/apis/ads/publisher/v201802}TargetPlatform" minOccurs="0"/>
 *         &lt;element name="suggestedAdUnitSizes" type="{https://www.google.com/apis/ads/publisher/v201802}AdUnitSize" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestedAdUnit", propOrder = {
    "id",
    "numRequests",
    "path",
    "parentPath",
    "targetWindow",
    "targetPlatform",
    "suggestedAdUnitSizes"
})
public class SuggestedAdUnit {

    protected String id;
    protected Long numRequests;
    protected List<String> path;
    protected List<AdUnitParent> parentPath;
    @XmlSchemaType(name = "string")
    protected AdUnitTargetWindow targetWindow;
    @XmlSchemaType(name = "string")
    protected TargetPlatform targetPlatform;
    protected List<AdUnitSize> suggestedAdUnitSizes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the numRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRequests() {
        return numRequests;
    }

    /**
     * Sets the value of the numRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRequests(Long value) {
        this.numRequests = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPath() {
        if (path == null) {
            path = new ArrayList<String>();
        }
        return this.path;
    }

    /**
     * Gets the value of the parentPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitParent }
     * 
     * 
     */
    public List<AdUnitParent> getParentPath() {
        if (parentPath == null) {
            parentPath = new ArrayList<AdUnitParent>();
        }
        return this.parentPath;
    }

    /**
     * Gets the value of the targetWindow property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitTargetWindow }
     *     
     */
    public AdUnitTargetWindow getTargetWindow() {
        return targetWindow;
    }

    /**
     * Sets the value of the targetWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitTargetWindow }
     *     
     */
    public void setTargetWindow(AdUnitTargetWindow value) {
        this.targetWindow = value;
    }

    /**
     * Gets the value of the targetPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link TargetPlatform }
     *     
     */
    public TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }

    /**
     * Sets the value of the targetPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPlatform }
     *     
     */
    public void setTargetPlatform(TargetPlatform value) {
        this.targetPlatform = value;
    }

    /**
     * Gets the value of the suggestedAdUnitSizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedAdUnitSizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedAdUnitSizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitSize }
     * 
     * 
     */
    public List<AdUnitSize> getSuggestedAdUnitSizes() {
        if (suggestedAdUnitSizes == null) {
            suggestedAdUnitSizes = new ArrayList<AdUnitSize>();
        }
        return this.suggestedAdUnitSizes;
    }

}
