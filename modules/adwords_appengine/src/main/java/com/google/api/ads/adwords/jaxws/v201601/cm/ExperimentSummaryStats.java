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
 *             Contains how many changes were made associated with an experiment at
 *             the adgroup, critieria and creative levels
 *           
 * 
 * <p>Java class for ExperimentSummaryStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperimentSummaryStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adGroupsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adGroupCriteriaCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adGroupAdsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperimentSummaryStats", propOrder = {
    "adGroupsCount",
    "adGroupCriteriaCount",
    "adGroupAdsCount"
})
public class ExperimentSummaryStats {

    protected Integer adGroupsCount;
    protected Integer adGroupCriteriaCount;
    protected Integer adGroupAdsCount;

    /**
     * Gets the value of the adGroupsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdGroupsCount() {
        return adGroupsCount;
    }

    /**
     * Sets the value of the adGroupsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdGroupsCount(Integer value) {
        this.adGroupsCount = value;
    }

    /**
     * Gets the value of the adGroupCriteriaCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdGroupCriteriaCount() {
        return adGroupCriteriaCount;
    }

    /**
     * Sets the value of the adGroupCriteriaCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdGroupCriteriaCount(Integer value) {
        this.adGroupCriteriaCount = value;
    }

    /**
     * Gets the value of the adGroupAdsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdGroupAdsCount() {
        return adGroupAdsCount;
    }

    /**
     * Sets the value of the adGroupAdsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdGroupAdsCount(Integer value) {
        this.adGroupAdsCount = value;
    }

}
