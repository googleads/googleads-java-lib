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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a list of {@link CriterionBidLandscape}s for the campaign criteria specified in the
 *             selector. In the result, the returned {@link LandscapePoint}s are grouped into
 *             {@link CriterionBidLandscape}s by their campaign id and criterion id, and numberResults
 *             of paging limits the total number of {@link LandscapePoint}s instead of number of
 *             {@link CriterionBidLandscape}s.
 *             
 *             @param serviceSelector Selects the entities to return bid landscapes for.
 *             @return A list of bid landscapes.
 *             @throws ApiException when there is at least one error with the request.
 *           
 * 
 * <p>Java class for getCampaignCriterionBidLandscape element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCampaignCriterionBidLandscape">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="serviceSelector" type="{https://adwords.google.com/api/adwords/cm/v201802}Selector" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceSelector"
})
@XmlRootElement(name = "getCampaignCriterionBidLandscape")
public class DataServiceInterfacegetCampaignCriterionBidLandscape {

    protected Selector serviceSelector;

    /**
     * Gets the value of the serviceSelector property.
     * 
     * @return
     *     possible object is
     *     {@link Selector }
     *     
     */
    public Selector getServiceSelector() {
        return serviceSelector;
    }

    /**
     * Sets the value of the serviceSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selector }
     *     
     */
    public void setServiceSelector(Selector value) {
        this.serviceSelector = value;
    }

}
