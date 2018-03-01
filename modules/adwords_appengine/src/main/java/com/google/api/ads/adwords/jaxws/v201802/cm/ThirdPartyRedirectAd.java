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
 *             Data associated with rich media extension attributes.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ThirdPartyRedirectAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyRedirectAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}RichMediaAd">
 *       &lt;sequence>
 *         &lt;element name="isCookieTargeted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isUserInterestTargeted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isTagged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="videoTypes" type="{https://adwords.google.com/api/adwords/cm/v201802}VideoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expandingDirections" type="{https://adwords.google.com/api/adwords/cm/v201802}ThirdPartyRedirectAd.ExpandingDirection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyRedirectAd", propOrder = {
    "isCookieTargeted",
    "isUserInterestTargeted",
    "isTagged",
    "videoTypes",
    "expandingDirections"
})
public class ThirdPartyRedirectAd
    extends RichMediaAd
{

    protected Boolean isCookieTargeted;
    protected Boolean isUserInterestTargeted;
    protected Boolean isTagged;
    @XmlSchemaType(name = "string")
    protected List<VideoType> videoTypes;
    @XmlSchemaType(name = "string")
    protected List<ThirdPartyRedirectAdExpandingDirection> expandingDirections;

    /**
     * Gets the value of the isCookieTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCookieTargeted() {
        return isCookieTargeted;
    }

    /**
     * Sets the value of the isCookieTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCookieTargeted(Boolean value) {
        this.isCookieTargeted = value;
    }

    /**
     * Gets the value of the isUserInterestTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserInterestTargeted() {
        return isUserInterestTargeted;
    }

    /**
     * Sets the value of the isUserInterestTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserInterestTargeted(Boolean value) {
        this.isUserInterestTargeted = value;
    }

    /**
     * Gets the value of the isTagged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTagged() {
        return isTagged;
    }

    /**
     * Sets the value of the isTagged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTagged(Boolean value) {
        this.isTagged = value;
    }

    /**
     * Gets the value of the videoTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoType }
     * 
     * 
     */
    public List<VideoType> getVideoTypes() {
        if (videoTypes == null) {
            videoTypes = new ArrayList<VideoType>();
        }
        return this.videoTypes;
    }

    /**
     * Gets the value of the expandingDirections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expandingDirections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpandingDirections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyRedirectAdExpandingDirection }
     * 
     * 
     */
    public List<ThirdPartyRedirectAdExpandingDirection> getExpandingDirections() {
        if (expandingDirections == null) {
            expandingDirections = new ArrayList<ThirdPartyRedirectAdExpandingDirection>();
        }
        return this.expandingDirections;
    }

}
