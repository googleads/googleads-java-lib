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
 *             A biddable (positive) criterion in an adgroup.
 *           
 * 
 * <p>Java class for BiddableAdGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddableAdGroupCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}AdGroupCriterion">
 *       &lt;sequence>
 *         &lt;element name="userStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}UserStatus" minOccurs="0"/>
 *         &lt;element name="systemServingStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}SystemServingStatus" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}ApprovalStatus" minOccurs="0"/>
 *         &lt;element name="disapprovalReasons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstPageCpc" type="{https://adwords.google.com/api/adwords/cm/v201802}Bid" minOccurs="0"/>
 *         &lt;element name="topOfPageCpc" type="{https://adwords.google.com/api/adwords/cm/v201802}Bid" minOccurs="0"/>
 *         &lt;element name="firstPositionCpc" type="{https://adwords.google.com/api/adwords/cm/v201802}Bid" minOccurs="0"/>
 *         &lt;element name="qualityInfo" type="{https://adwords.google.com/api/adwords/cm/v201802}QualityInfo" minOccurs="0"/>
 *         &lt;element name="biddingStrategyConfiguration" type="{https://adwords.google.com/api/adwords/cm/v201802}BiddingStrategyConfiguration" minOccurs="0"/>
 *         &lt;element name="bidModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="finalUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="finalMobileUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="finalAppUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}AppUrlList" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201802}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddableAdGroupCriterion", propOrder = {
    "userStatus",
    "systemServingStatus",
    "approvalStatus",
    "disapprovalReasons",
    "destinationUrl",
    "firstPageCpc",
    "topOfPageCpc",
    "firstPositionCpc",
    "qualityInfo",
    "biddingStrategyConfiguration",
    "bidModifier",
    "finalUrls",
    "finalMobileUrls",
    "finalAppUrls",
    "trackingUrlTemplate",
    "finalUrlSuffix",
    "urlCustomParameters"
})
public class BiddableAdGroupCriterion
    extends AdGroupCriterion
{

    @XmlSchemaType(name = "string")
    protected UserStatus userStatus;
    @XmlSchemaType(name = "string")
    protected SystemServingStatus systemServingStatus;
    @XmlSchemaType(name = "string")
    protected ApprovalStatus approvalStatus;
    protected List<String> disapprovalReasons;
    protected String destinationUrl;
    protected Bid firstPageCpc;
    protected Bid topOfPageCpc;
    protected Bid firstPositionCpc;
    protected QualityInfo qualityInfo;
    protected BiddingStrategyConfiguration biddingStrategyConfiguration;
    protected Double bidModifier;
    protected UrlList finalUrls;
    protected UrlList finalMobileUrls;
    protected AppUrlList finalAppUrls;
    protected String trackingUrlTemplate;
    protected String finalUrlSuffix;
    protected CustomParameters urlCustomParameters;

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatus }
     *     
     */
    public UserStatus getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatus }
     *     
     */
    public void setUserStatus(UserStatus value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the systemServingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServingStatus }
     *     
     */
    public SystemServingStatus getSystemServingStatus() {
        return systemServingStatus;
    }

    /**
     * Sets the value of the systemServingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServingStatus }
     *     
     */
    public void setSystemServingStatus(SystemServingStatus value) {
        this.systemServingStatus = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalStatus }
     *     
     */
    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalStatus }
     *     
     */
    public void setApprovalStatus(ApprovalStatus value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the disapprovalReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disapprovalReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisapprovalReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisapprovalReasons() {
        if (disapprovalReasons == null) {
            disapprovalReasons = new ArrayList<String>();
        }
        return this.disapprovalReasons;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the firstPageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getFirstPageCpc() {
        return firstPageCpc;
    }

    /**
     * Sets the value of the firstPageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setFirstPageCpc(Bid value) {
        this.firstPageCpc = value;
    }

    /**
     * Gets the value of the topOfPageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getTopOfPageCpc() {
        return topOfPageCpc;
    }

    /**
     * Sets the value of the topOfPageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setTopOfPageCpc(Bid value) {
        this.topOfPageCpc = value;
    }

    /**
     * Gets the value of the firstPositionCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getFirstPositionCpc() {
        return firstPositionCpc;
    }

    /**
     * Sets the value of the firstPositionCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setFirstPositionCpc(Bid value) {
        this.firstPositionCpc = value;
    }

    /**
     * Gets the value of the qualityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualityInfo }
     *     
     */
    public QualityInfo getQualityInfo() {
        return qualityInfo;
    }

    /**
     * Sets the value of the qualityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityInfo }
     *     
     */
    public void setQualityInfo(QualityInfo value) {
        this.qualityInfo = value;
    }

    /**
     * Gets the value of the biddingStrategyConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }

    /**
     * Sets the value of the biddingStrategyConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public void setBiddingStrategyConfiguration(BiddingStrategyConfiguration value) {
        this.biddingStrategyConfiguration = value;
    }

    /**
     * Gets the value of the bidModifier property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBidModifier() {
        return bidModifier;
    }

    /**
     * Sets the value of the bidModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBidModifier(Double value) {
        this.bidModifier = value;
    }

    /**
     * Gets the value of the finalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the value of the finalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setFinalUrls(UrlList value) {
        this.finalUrls = value;
    }

    /**
     * Gets the value of the finalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the value of the finalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setFinalMobileUrls(UrlList value) {
        this.finalMobileUrls = value;
    }

    /**
     * Gets the value of the finalAppUrls property.
     * 
     * @return
     *     possible object is
     *     {@link AppUrlList }
     *     
     */
    public AppUrlList getFinalAppUrls() {
        return finalAppUrls;
    }

    /**
     * Sets the value of the finalAppUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppUrlList }
     *     
     */
    public void setFinalAppUrls(AppUrlList value) {
        this.finalAppUrls = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the finalUrlSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }

    /**
     * Sets the value of the finalUrlSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalUrlSuffix(String value) {
        this.finalUrlSuffix = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

}
