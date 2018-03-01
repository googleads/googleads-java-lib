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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a collection of settings related to ads geotargeting.
 *             
 *             <p>AdWords ads can be geotargeted using <b>Location of Presence</b> (<b>LOP</b>),
 *             <b>Area of Interest</b> (<b>AOI</b>), or both. LOP is the physical location
 *             of the user performing the search; AOI is the geographical region
 *             in which the searcher is interested. For example, if a user in
 *             New York City performs a search "hotels california", their LOP
 *             is New York City and their AOI is California.
 *             
 *             <p>Additionally, ads can be <b>positively</b> or <b>negatively</b> geotargeted.
 *             An ad that is positively geotargeted to New York City only appears
 *             to users whose location is related (via AOI or LOP) to New York City. An ad
 *             that is negatively geotargeted to New York City appears for <i>all</i>
 *             users <i>except</i> those whose location is related to New York City. Ads can
 *             only be negatively geotargeted if a positive geotargeting is also supplied, and
 *             the negatively geotargeted region must be contained within the positive
 *             region.
 *             
 *             <p>Geotargeting settings allow ads to be targeted in the following way:
 *             <ul>
 *             <li> Positively geotargeted using solely AOI, solely LOP, or either.
 *             <li> Negatively geotargeted using solely LOP, or both.
 *             </ul>
 *             
 *             <p>This setting applies only to ads shown on the search network, and does
 *             not affect ads shown on the Google Display Network.
 *           
 * 
 * <p>Java class for GeoTargetTypeSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoTargetTypeSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Setting">
 *       &lt;sequence>
 *         &lt;element name="positiveGeoTargetType" type="{https://adwords.google.com/api/adwords/cm/v201802}GeoTargetTypeSetting.PositiveGeoTargetType" minOccurs="0"/>
 *         &lt;element name="negativeGeoTargetType" type="{https://adwords.google.com/api/adwords/cm/v201802}GeoTargetTypeSetting.NegativeGeoTargetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoTargetTypeSetting", propOrder = {
    "positiveGeoTargetType",
    "negativeGeoTargetType"
})
public class GeoTargetTypeSetting
    extends Setting
{

    @XmlSchemaType(name = "string")
    protected GeoTargetTypeSettingPositiveGeoTargetType positiveGeoTargetType;
    @XmlSchemaType(name = "string")
    protected GeoTargetTypeSettingNegativeGeoTargetType negativeGeoTargetType;

    /**
     * Gets the value of the positiveGeoTargetType property.
     * 
     * @return
     *     possible object is
     *     {@link GeoTargetTypeSettingPositiveGeoTargetType }
     *     
     */
    public GeoTargetTypeSettingPositiveGeoTargetType getPositiveGeoTargetType() {
        return positiveGeoTargetType;
    }

    /**
     * Sets the value of the positiveGeoTargetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTargetTypeSettingPositiveGeoTargetType }
     *     
     */
    public void setPositiveGeoTargetType(GeoTargetTypeSettingPositiveGeoTargetType value) {
        this.positiveGeoTargetType = value;
    }

    /**
     * Gets the value of the negativeGeoTargetType property.
     * 
     * @return
     *     possible object is
     *     {@link GeoTargetTypeSettingNegativeGeoTargetType }
     *     
     */
    public GeoTargetTypeSettingNegativeGeoTargetType getNegativeGeoTargetType() {
        return negativeGeoTargetType;
    }

    /**
     * Sets the value of the negativeGeoTargetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoTargetTypeSettingNegativeGeoTargetType }
     *     
     */
    public void setNegativeGeoTargetType(GeoTargetTypeSettingNegativeGeoTargetType value) {
        this.negativeGeoTargetType = value;
    }

}
