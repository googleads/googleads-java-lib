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

/**
 * PageOnePromotedBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Page-One Promoted bidding scheme, which sets max cpc bids to
 *             target impressions on page one or page one promoted slots
 * on google.com.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class PageOnePromotedBiddingScheme  extends com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme  implements java.io.Serializable {
    /* Specifies the strategy goal: where impressions are desired
     * to be shown on
     *                     search result pages. */
    private com.google.api.ads.adwords.axis.v201802.cm.PageOnePromotedBiddingSchemeStrategyGoal strategyGoal;

    /* Strategy maximum bid limit in advertiser local currency micro
     * units.
     *                     This upper limit applies to all keywords managed
     * by the strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money bidCeiling;

    /* Bid Multiplier to be applied to the relevant bid estimate (depending
     * on the strategyGoal)
     *                     in determining a keyword's new max cpc bid.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private java.lang.Double bidModifier;

    /* Controls whether the strategy always follows bid estimate changes,
     * or only
     *                     increases. If false, always set a keyword's new
     * bid to the current bid estimate.
     *                     If true, only updates a keyword's bid if the current
     * bid estimate is
     *                     greater than the current bid. */
    private java.lang.Boolean bidChangesForRaisesOnly;

    /* Controls whether the strategy is allowed to raise bids when
     * the throttling rate
     *                     of the budget it is serving out of rises above
     * a threshold. */
    private java.lang.Boolean raiseBidWhenBudgetConstrained;

    /* Controls whether the strategy is allowed to raise bids on keywords
     * with lower-range
     *                     quality scores. */
    private java.lang.Boolean raiseBidWhenLowQualityScore;

    public PageOnePromotedBiddingScheme() {
    }

    public PageOnePromotedBiddingScheme(
           java.lang.String biddingSchemeType,
           com.google.api.ads.adwords.axis.v201802.cm.PageOnePromotedBiddingSchemeStrategyGoal strategyGoal,
           com.google.api.ads.adwords.axis.v201802.cm.Money bidCeiling,
           java.lang.Double bidModifier,
           java.lang.Boolean bidChangesForRaisesOnly,
           java.lang.Boolean raiseBidWhenBudgetConstrained,
           java.lang.Boolean raiseBidWhenLowQualityScore) {
        super(
            biddingSchemeType);
        this.strategyGoal = strategyGoal;
        this.bidCeiling = bidCeiling;
        this.bidModifier = bidModifier;
        this.bidChangesForRaisesOnly = bidChangesForRaisesOnly;
        this.raiseBidWhenBudgetConstrained = raiseBidWhenBudgetConstrained;
        this.raiseBidWhenLowQualityScore = raiseBidWhenLowQualityScore;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bidCeiling", getBidCeiling())
            .add("bidChangesForRaisesOnly", getBidChangesForRaisesOnly())
            .add("bidModifier", getBidModifier())
            .add("biddingSchemeType", getBiddingSchemeType())
            .add("raiseBidWhenBudgetConstrained", getRaiseBidWhenBudgetConstrained())
            .add("raiseBidWhenLowQualityScore", getRaiseBidWhenLowQualityScore())
            .add("strategyGoal", getStrategyGoal())
            .toString();
    }

    /**
     * Gets the strategyGoal value for this PageOnePromotedBiddingScheme.
     * 
     * @return strategyGoal   * Specifies the strategy goal: where impressions are desired
     * to be shown on
     *                     search result pages.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PageOnePromotedBiddingSchemeStrategyGoal getStrategyGoal() {
        return strategyGoal;
    }


    /**
     * Sets the strategyGoal value for this PageOnePromotedBiddingScheme.
     * 
     * @param strategyGoal   * Specifies the strategy goal: where impressions are desired
     * to be shown on
     *                     search result pages.
     */
    public void setStrategyGoal(com.google.api.ads.adwords.axis.v201802.cm.PageOnePromotedBiddingSchemeStrategyGoal strategyGoal) {
        this.strategyGoal = strategyGoal;
    }


    /**
     * Gets the bidCeiling value for this PageOnePromotedBiddingScheme.
     * 
     * @return bidCeiling   * Strategy maximum bid limit in advertiser local currency micro
     * units.
     *                     This upper limit applies to all keywords managed
     * by the strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getBidCeiling() {
        return bidCeiling;
    }


    /**
     * Sets the bidCeiling value for this PageOnePromotedBiddingScheme.
     * 
     * @param bidCeiling   * Strategy maximum bid limit in advertiser local currency micro
     * units.
     *                     This upper limit applies to all keywords managed
     * by the strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setBidCeiling(com.google.api.ads.adwords.axis.v201802.cm.Money bidCeiling) {
        this.bidCeiling = bidCeiling;
    }


    /**
     * Gets the bidModifier value for this PageOnePromotedBiddingScheme.
     * 
     * @return bidModifier   * Bid Multiplier to be applied to the relevant bid estimate (depending
     * on the strategyGoal)
     *                     in determining a keyword's new max cpc bid.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this PageOnePromotedBiddingScheme.
     * 
     * @param bidModifier   * Bid Multiplier to be applied to the relevant bid estimate (depending
     * on the strategyGoal)
     *                     in determining a keyword's new max cpc bid.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }


    /**
     * Gets the bidChangesForRaisesOnly value for this PageOnePromotedBiddingScheme.
     * 
     * @return bidChangesForRaisesOnly   * Controls whether the strategy always follows bid estimate changes,
     * or only
     *                     increases. If false, always set a keyword's new
     * bid to the current bid estimate.
     *                     If true, only updates a keyword's bid if the current
     * bid estimate is
     *                     greater than the current bid.
     */
    public java.lang.Boolean getBidChangesForRaisesOnly() {
        return bidChangesForRaisesOnly;
    }


    /**
     * Sets the bidChangesForRaisesOnly value for this PageOnePromotedBiddingScheme.
     * 
     * @param bidChangesForRaisesOnly   * Controls whether the strategy always follows bid estimate changes,
     * or only
     *                     increases. If false, always set a keyword's new
     * bid to the current bid estimate.
     *                     If true, only updates a keyword's bid if the current
     * bid estimate is
     *                     greater than the current bid.
     */
    public void setBidChangesForRaisesOnly(java.lang.Boolean bidChangesForRaisesOnly) {
        this.bidChangesForRaisesOnly = bidChangesForRaisesOnly;
    }


    /**
     * Gets the raiseBidWhenBudgetConstrained value for this PageOnePromotedBiddingScheme.
     * 
     * @return raiseBidWhenBudgetConstrained   * Controls whether the strategy is allowed to raise bids when
     * the throttling rate
     *                     of the budget it is serving out of rises above
     * a threshold.
     */
    public java.lang.Boolean getRaiseBidWhenBudgetConstrained() {
        return raiseBidWhenBudgetConstrained;
    }


    /**
     * Sets the raiseBidWhenBudgetConstrained value for this PageOnePromotedBiddingScheme.
     * 
     * @param raiseBidWhenBudgetConstrained   * Controls whether the strategy is allowed to raise bids when
     * the throttling rate
     *                     of the budget it is serving out of rises above
     * a threshold.
     */
    public void setRaiseBidWhenBudgetConstrained(java.lang.Boolean raiseBidWhenBudgetConstrained) {
        this.raiseBidWhenBudgetConstrained = raiseBidWhenBudgetConstrained;
    }


    /**
     * Gets the raiseBidWhenLowQualityScore value for this PageOnePromotedBiddingScheme.
     * 
     * @return raiseBidWhenLowQualityScore   * Controls whether the strategy is allowed to raise bids on keywords
     * with lower-range
     *                     quality scores.
     */
    public java.lang.Boolean getRaiseBidWhenLowQualityScore() {
        return raiseBidWhenLowQualityScore;
    }


    /**
     * Sets the raiseBidWhenLowQualityScore value for this PageOnePromotedBiddingScheme.
     * 
     * @param raiseBidWhenLowQualityScore   * Controls whether the strategy is allowed to raise bids on keywords
     * with lower-range
     *                     quality scores.
     */
    public void setRaiseBidWhenLowQualityScore(java.lang.Boolean raiseBidWhenLowQualityScore) {
        this.raiseBidWhenLowQualityScore = raiseBidWhenLowQualityScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageOnePromotedBiddingScheme)) return false;
        PageOnePromotedBiddingScheme other = (PageOnePromotedBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.strategyGoal==null && other.getStrategyGoal()==null) || 
             (this.strategyGoal!=null &&
              this.strategyGoal.equals(other.getStrategyGoal()))) &&
            ((this.bidCeiling==null && other.getBidCeiling()==null) || 
             (this.bidCeiling!=null &&
              this.bidCeiling.equals(other.getBidCeiling()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) || 
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier()))) &&
            ((this.bidChangesForRaisesOnly==null && other.getBidChangesForRaisesOnly()==null) || 
             (this.bidChangesForRaisesOnly!=null &&
              this.bidChangesForRaisesOnly.equals(other.getBidChangesForRaisesOnly()))) &&
            ((this.raiseBidWhenBudgetConstrained==null && other.getRaiseBidWhenBudgetConstrained()==null) || 
             (this.raiseBidWhenBudgetConstrained!=null &&
              this.raiseBidWhenBudgetConstrained.equals(other.getRaiseBidWhenBudgetConstrained()))) &&
            ((this.raiseBidWhenLowQualityScore==null && other.getRaiseBidWhenLowQualityScore()==null) || 
             (this.raiseBidWhenLowQualityScore!=null &&
              this.raiseBidWhenLowQualityScore.equals(other.getRaiseBidWhenLowQualityScore())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getStrategyGoal() != null) {
            _hashCode += getStrategyGoal().hashCode();
        }
        if (getBidCeiling() != null) {
            _hashCode += getBidCeiling().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        if (getBidChangesForRaisesOnly() != null) {
            _hashCode += getBidChangesForRaisesOnly().hashCode();
        }
        if (getRaiseBidWhenBudgetConstrained() != null) {
            _hashCode += getRaiseBidWhenBudgetConstrained().hashCode();
        }
        if (getRaiseBidWhenLowQualityScore() != null) {
            _hashCode += getRaiseBidWhenLowQualityScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageOnePromotedBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PageOnePromotedBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strategyGoal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "strategyGoal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PageOnePromotedBiddingScheme.StrategyGoal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidCeiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidCeiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidChangesForRaisesOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidChangesForRaisesOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiseBidWhenBudgetConstrained");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "raiseBidWhenBudgetConstrained"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiseBidWhenLowQualityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "raiseBidWhenLowQualityScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
