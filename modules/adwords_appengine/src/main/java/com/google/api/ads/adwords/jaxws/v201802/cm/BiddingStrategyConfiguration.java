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
 *             Encapsulates the information about bids and bidding strategies.
 *             
 *             <p class="note"><b>Note:</b> Starting with v201705, bidding strategies can only be set on
 *             campaigns. In earlier versions, bidding strategies can be set on campaigns, ad groups and ad
 *             group criteria.
 *             
 *             <p>A bidding strategy can be set using one of the following:
 *             <ul>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingScheme bidding scheme}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyType bidding strategy type}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyId bidding strategy ID} for
 *             flexible bid strategies.</li>
 *             </ul>
 *             <p>If the bidding strategy type is used, then schemes are created using default values.
 *             
 *             <p>Bids can be set only on ad groups and ad group criteria. They cannot be set on campaigns.
 *             Multiple bids can be set at the same time. Only the bids that apply to the effective
 *             bidding strategy will be used. Effective bidding strategy is considered to be the directly
 *             attached strategy or inherited strategy from above level(s) when there is no directly attached
 *             strategy.
 *             
 *             <p>For more information on flexible bidding, visit the
 *             <a href="https://support.google.com/adwords/answer/2979071">Help Center</a>.
 *           
 * 
 * <p>Java class for BiddingStrategyConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingStrategyConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biddingStrategyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="biddingStrategyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biddingStrategyType" type="{https://adwords.google.com/api/adwords/cm/v201802}BiddingStrategyType" minOccurs="0"/>
 *         &lt;element name="biddingStrategySource" type="{https://adwords.google.com/api/adwords/cm/v201802}BiddingStrategySource" minOccurs="0"/>
 *         &lt;element name="biddingScheme" type="{https://adwords.google.com/api/adwords/cm/v201802}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="bids" type="{https://adwords.google.com/api/adwords/cm/v201802}Bids" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetRoasOverride" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingStrategyConfiguration", propOrder = {
    "biddingStrategyId",
    "biddingStrategyName",
    "biddingStrategyType",
    "biddingStrategySource",
    "biddingScheme",
    "bids",
    "targetRoasOverride"
})
public class BiddingStrategyConfiguration {

    protected Long biddingStrategyId;
    protected String biddingStrategyName;
    @XmlSchemaType(name = "string")
    protected BiddingStrategyType biddingStrategyType;
    @XmlSchemaType(name = "string")
    protected BiddingStrategySource biddingStrategySource;
    protected BiddingScheme biddingScheme;
    protected List<Bids> bids;
    protected Double targetRoasOverride;

    /**
     * Gets the value of the biddingStrategyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBiddingStrategyId() {
        return biddingStrategyId;
    }

    /**
     * Sets the value of the biddingStrategyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBiddingStrategyId(Long value) {
        this.biddingStrategyId = value;
    }

    /**
     * Gets the value of the biddingStrategyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiddingStrategyName() {
        return biddingStrategyName;
    }

    /**
     * Sets the value of the biddingStrategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiddingStrategyName(String value) {
        this.biddingStrategyName = value;
    }

    /**
     * Gets the value of the biddingStrategyType property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyType }
     *     
     */
    public BiddingStrategyType getBiddingStrategyType() {
        return biddingStrategyType;
    }

    /**
     * Sets the value of the biddingStrategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyType }
     *     
     */
    public void setBiddingStrategyType(BiddingStrategyType value) {
        this.biddingStrategyType = value;
    }

    /**
     * Gets the value of the biddingStrategySource property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategySource }
     *     
     */
    public BiddingStrategySource getBiddingStrategySource() {
        return biddingStrategySource;
    }

    /**
     * Sets the value of the biddingStrategySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategySource }
     *     
     */
    public void setBiddingStrategySource(BiddingStrategySource value) {
        this.biddingStrategySource = value;
    }

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the bids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bids }
     * 
     * 
     */
    public List<Bids> getBids() {
        if (bids == null) {
            bids = new ArrayList<Bids>();
        }
        return this.bids;
    }

    /**
     * Gets the value of the targetRoasOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetRoasOverride() {
        return targetRoasOverride;
    }

    /**
     * Sets the value of the targetRoasOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetRoasOverride(Double value) {
        this.targetRoasOverride = value;
    }

}
