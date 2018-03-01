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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents Location criterion.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="locationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetingStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}LocationTargetingStatus" minOccurs="0"/>
 *         &lt;element name="parentLocations" type="{https://adwords.google.com/api/adwords/cm/v201802}Location" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "locationName",
    "displayType",
    "targetingStatus",
    "parentLocations"
})
public class Location
    extends Criterion
{

    protected String locationName;
    protected String displayType;
    @XmlSchemaType(name = "string")
    protected LocationTargetingStatus targetingStatus;
    protected List<Location> parentLocations;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the targetingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTargetingStatus }
     *     
     */
    public LocationTargetingStatus getTargetingStatus() {
        return targetingStatus;
    }

    /**
     * Sets the value of the targetingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTargetingStatus }
     *     
     */
    public void setTargetingStatus(LocationTargetingStatus value) {
        this.targetingStatus = value;
    }

    /**
     * Gets the value of the parentLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getParentLocations() {
        if (parentLocations == null) {
            parentLocations = new ArrayList<Location>();
        }
        return this.parentLocations;
    }

}
