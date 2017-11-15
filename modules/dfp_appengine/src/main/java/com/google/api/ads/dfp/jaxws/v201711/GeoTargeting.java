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
 *             Provides line items the ability to target geographical locations. By default,
 *             line items target all countries and their subdivisions. With geographical
 *             targeting, you can target line items to specific countries, regions, metro
 *             areas, and cities. You can also exclude the same.
 *             <p>
 *             The following rules apply for geographical targeting:
 *             </p>
 *             <ul>
 *             <li>You cannot target and exclude the same location.</li>
 *             <li>You cannot target a child whose parent has been excluded. For example, if the state
 *             of Illinois has been excluded, then you cannot target Chicago.</li>
 *             <li>You must not target a location if you are also targeting its parent.
 *             For example, if you are targeting New York City, you must not have the state of New
 *             York as one of the targeted locations.</li>
 *             <li>You cannot explicitly define inclusions or exclusions that are already implicit. For example,
 *             if you explicitly include California, you implicitly exclude all other states. You therefore
 *             cannot explicitly exclude Florida, because it is already implicitly excluded. Conversely if you
 *             explicitly exclude Florida, you cannot excplicitly include California.</li>
 *             </ul>
 *           
 * 
 * <p>Java class for GeoTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedLocations" type="{https://www.google.com/apis/ads/publisher/v201711}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludedLocations" type="{https://www.google.com/apis/ads/publisher/v201711}Location" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoTargeting", propOrder = {
    "targetedLocations",
    "excludedLocations"
})
public class GeoTargeting {

    protected List<Location> targetedLocations;
    protected List<Location> excludedLocations;

    /**
     * Gets the value of the targetedLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getTargetedLocations() {
        if (targetedLocations == null) {
            targetedLocations = new ArrayList<Location>();
        }
        return this.targetedLocations;
    }

    /**
     * Gets the value of the excludedLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getExcludedLocations() {
        if (excludedLocations == null) {
            excludedLocations = new ArrayList<Location>();
        }
        return this.excludedLocations;
    }

}
