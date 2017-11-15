// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains statistics such as impressions, clicks delivered and cost
 *             for {@link LineItemCreativeAssociation} objects.
 *           
 * 
 * <p>Java class for LineItemCreativeAssociationStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemCreativeAssociationStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stats" type="{https://www.google.com/apis/ads/publisher/v201711}Stats" minOccurs="0"/>
 *         &lt;element name="creativeSetStats" type="{https://www.google.com/apis/ads/publisher/v201711}Long_StatsMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costInOrderCurrency" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemCreativeAssociationStats", propOrder = {
    "stats",
    "creativeSetStats",
    "costInOrderCurrency"
})
public class LineItemCreativeAssociationStats {

    protected Stats stats;
    protected List<LongStatsMapEntry> creativeSetStats;
    protected Money costInOrderCurrency;

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link Stats }
     *     
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stats }
     *     
     */
    public void setStats(Stats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the creativeSetStats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creativeSetStats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreativeSetStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongStatsMapEntry }
     * 
     * 
     */
    public List<LongStatsMapEntry> getCreativeSetStats() {
        if (creativeSetStats == null) {
            creativeSetStats = new ArrayList<LongStatsMapEntry>();
        }
        return this.creativeSetStats;
    }

    /**
     * Gets the value of the costInOrderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCostInOrderCurrency() {
        return costInOrderCurrency;
    }

    /**
     * Sets the value of the costInOrderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCostInOrderCurrency(Money value) {
        this.costInOrderCurrency = value;
    }

}
