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
 *             Data used to configure an Affiliate Location Feed populated with the specified chains.
 *           
 * 
 * <p>Java class for AffiliateLocationFeedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliateLocationFeedData">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}SystemFeedGenerationData">
 *       &lt;sequence>
 *         &lt;element name="chains" type="{https://adwords.google.com/api/adwords/cm/v201802}Chain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relationshipType" type="{https://adwords.google.com/api/adwords/cm/v201802}RelationshipType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliateLocationFeedData", propOrder = {
    "chains",
    "relationshipType"
})
public class AffiliateLocationFeedData
    extends SystemFeedGenerationData
{

    protected List<Chain> chains;
    @XmlSchemaType(name = "string")
    protected RelationshipType relationshipType;

    /**
     * Gets the value of the chains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chain }
     * 
     * 
     */
    public List<Chain> getChains() {
        if (chains == null) {
            chains = new ArrayList<Chain>();
        }
        return this.chains;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    public void setRelationshipType(RelationshipType value) {
        this.relationshipType = value;
    }

}
