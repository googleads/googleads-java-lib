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
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Location;


/**
 * 
 *             A {@link SearchParameter} used to indicate the locations being targeted.
 *             This can be used, for example, to search for {@code KEYWORD}
 *             {@link IdeaType}s that are best for Japan and Los Angeles.
 *             
 *             <p>This parameter replaces the {@code CountryTargetSearchParameter}.</p>
 *             
 *             <p>See the
 *             <a href="https://developers.google.com/adwords/api/docs/appendix/geotargeting">Geographical
 *             Targeting</a> page for the complete list of supported geo target types for this service.</p>
 *             
 *             <p>The service allows up to 10 locations to be targeted for KEYWORD requests and 50 locations
 *             for PLACEMENT requests.</p>
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for LocationSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="locations" type="{https://adwords.google.com/api/adwords/cm/v201802}Location" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSearchParameter", propOrder = {
    "locations"
})
public class LocationSearchParameter
    extends SearchParameter
{

    protected List<Location> locations;

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocations() {
        if (locations == null) {
            locations = new ArrayList<Location>();
        }
        return this.locations;
    }

}
