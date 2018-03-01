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
 * TargetOutrankShareBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Target Outrank Share bidding strategy is an automated bidding strategy
 * which automatically sets
 *             bids so that the customer's ads appear above a specified
 * competitors' ads for a specified target
 *             fraction of the advertiser's eligible impressions on Google.com.
 * <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 */
public class TargetOutrankShareBiddingScheme  extends com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme  implements java.io.Serializable {
    /* Specifies the target fraction (in micros) of auctions where
     * the advertiser should outrank the
     *                     competitor. The advertiser outranks the competitor
     * in an auction if either the advertiser
     *                     appears above the competitor in the search results,
     * or appears in the search results when the
     *                     competitor does not.
     *                     <span class="constraint InRange">This field must
     * be between 1 and 1000000, inclusive.</span> */
    private java.lang.Integer targetOutrankShare;

    /* Competitor's visible domain URL. */
    private java.lang.String competitorDomain;

    /* Ceiling on max CPC bids. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money maxCpcBidCeiling;

    /* Controls whether the strategy always follows bid estimate changes,
     * or only increases. If false,
     *                     always sets a keyword's new bid to the estimate
     * that will meet the target. If true, only
     *                     updates a keyword's bid if the current bid estimate
     * is greater than the current bid. */
    private java.lang.Boolean bidChangesForRaisesOnly;

    /* Controls whether the strategy is allowed to raise bids on keywords
     * with lower-range quality
     *                     scores. */
    private java.lang.Boolean raiseBidWhenLowQualityScore;

    public TargetOutrankShareBiddingScheme() {
    }

    public TargetOutrankShareBiddingScheme(
           java.lang.String biddingSchemeType,
           java.lang.Integer targetOutrankShare,
           java.lang.String competitorDomain,
           com.google.api.ads.adwords.axis.v201802.cm.Money maxCpcBidCeiling,
           java.lang.Boolean bidChangesForRaisesOnly,
           java.lang.Boolean raiseBidWhenLowQualityScore) {
        super(
            biddingSchemeType);
        this.targetOutrankShare = targetOutrankShare;
        this.competitorDomain = competitorDomain;
        this.maxCpcBidCeiling = maxCpcBidCeiling;
        this.bidChangesForRaisesOnly = bidChangesForRaisesOnly;
        this.raiseBidWhenLowQualityScore = raiseBidWhenLowQualityScore;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bidChangesForRaisesOnly", getBidChangesForRaisesOnly())
            .add("biddingSchemeType", getBiddingSchemeType())
            .add("competitorDomain", getCompetitorDomain())
            .add("maxCpcBidCeiling", getMaxCpcBidCeiling())
            .add("raiseBidWhenLowQualityScore", getRaiseBidWhenLowQualityScore())
            .add("targetOutrankShare", getTargetOutrankShare())
            .toString();
    }

    /**
     * Gets the targetOutrankShare value for this TargetOutrankShareBiddingScheme.
     * 
     * @return targetOutrankShare   * Specifies the target fraction (in micros) of auctions where
     * the advertiser should outrank the
     *                     competitor. The advertiser outranks the competitor
     * in an auction if either the advertiser
     *                     appears above the competitor in the search results,
     * or appears in the search results when the
     *                     competitor does not.
     *                     <span class="constraint InRange">This field must
     * be between 1 and 1000000, inclusive.</span>
     */
    public java.lang.Integer getTargetOutrankShare() {
        return targetOutrankShare;
    }


    /**
     * Sets the targetOutrankShare value for this TargetOutrankShareBiddingScheme.
     * 
     * @param targetOutrankShare   * Specifies the target fraction (in micros) of auctions where
     * the advertiser should outrank the
     *                     competitor. The advertiser outranks the competitor
     * in an auction if either the advertiser
     *                     appears above the competitor in the search results,
     * or appears in the search results when the
     *                     competitor does not.
     *                     <span class="constraint InRange">This field must
     * be between 1 and 1000000, inclusive.</span>
     */
    public void setTargetOutrankShare(java.lang.Integer targetOutrankShare) {
        this.targetOutrankShare = targetOutrankShare;
    }


    /**
     * Gets the competitorDomain value for this TargetOutrankShareBiddingScheme.
     * 
     * @return competitorDomain   * Competitor's visible domain URL.
     */
    public java.lang.String getCompetitorDomain() {
        return competitorDomain;
    }


    /**
     * Sets the competitorDomain value for this TargetOutrankShareBiddingScheme.
     * 
     * @param competitorDomain   * Competitor's visible domain URL.
     */
    public void setCompetitorDomain(java.lang.String competitorDomain) {
        this.competitorDomain = competitorDomain;
    }


    /**
     * Gets the maxCpcBidCeiling value for this TargetOutrankShareBiddingScheme.
     * 
     * @return maxCpcBidCeiling   * Ceiling on max CPC bids.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getMaxCpcBidCeiling() {
        return maxCpcBidCeiling;
    }


    /**
     * Sets the maxCpcBidCeiling value for this TargetOutrankShareBiddingScheme.
     * 
     * @param maxCpcBidCeiling   * Ceiling on max CPC bids.
     */
    public void setMaxCpcBidCeiling(com.google.api.ads.adwords.axis.v201802.cm.Money maxCpcBidCeiling) {
        this.maxCpcBidCeiling = maxCpcBidCeiling;
    }


    /**
     * Gets the bidChangesForRaisesOnly value for this TargetOutrankShareBiddingScheme.
     * 
     * @return bidChangesForRaisesOnly   * Controls whether the strategy always follows bid estimate changes,
     * or only increases. If false,
     *                     always sets a keyword's new bid to the estimate
     * that will meet the target. If true, only
     *                     updates a keyword's bid if the current bid estimate
     * is greater than the current bid.
     */
    public java.lang.Boolean getBidChangesForRaisesOnly() {
        return bidChangesForRaisesOnly;
    }


    /**
     * Sets the bidChangesForRaisesOnly value for this TargetOutrankShareBiddingScheme.
     * 
     * @param bidChangesForRaisesOnly   * Controls whether the strategy always follows bid estimate changes,
     * or only increases. If false,
     *                     always sets a keyword's new bid to the estimate
     * that will meet the target. If true, only
     *                     updates a keyword's bid if the current bid estimate
     * is greater than the current bid.
     */
    public void setBidChangesForRaisesOnly(java.lang.Boolean bidChangesForRaisesOnly) {
        this.bidChangesForRaisesOnly = bidChangesForRaisesOnly;
    }


    /**
     * Gets the raiseBidWhenLowQualityScore value for this TargetOutrankShareBiddingScheme.
     * 
     * @return raiseBidWhenLowQualityScore   * Controls whether the strategy is allowed to raise bids on keywords
     * with lower-range quality
     *                     scores.
     */
    public java.lang.Boolean getRaiseBidWhenLowQualityScore() {
        return raiseBidWhenLowQualityScore;
    }


    /**
     * Sets the raiseBidWhenLowQualityScore value for this TargetOutrankShareBiddingScheme.
     * 
     * @param raiseBidWhenLowQualityScore   * Controls whether the strategy is allowed to raise bids on keywords
     * with lower-range quality
     *                     scores.
     */
    public void setRaiseBidWhenLowQualityScore(java.lang.Boolean raiseBidWhenLowQualityScore) {
        this.raiseBidWhenLowQualityScore = raiseBidWhenLowQualityScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetOutrankShareBiddingScheme)) return false;
        TargetOutrankShareBiddingScheme other = (TargetOutrankShareBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetOutrankShare==null && other.getTargetOutrankShare()==null) || 
             (this.targetOutrankShare!=null &&
              this.targetOutrankShare.equals(other.getTargetOutrankShare()))) &&
            ((this.competitorDomain==null && other.getCompetitorDomain()==null) || 
             (this.competitorDomain!=null &&
              this.competitorDomain.equals(other.getCompetitorDomain()))) &&
            ((this.maxCpcBidCeiling==null && other.getMaxCpcBidCeiling()==null) || 
             (this.maxCpcBidCeiling!=null &&
              this.maxCpcBidCeiling.equals(other.getMaxCpcBidCeiling()))) &&
            ((this.bidChangesForRaisesOnly==null && other.getBidChangesForRaisesOnly()==null) || 
             (this.bidChangesForRaisesOnly!=null &&
              this.bidChangesForRaisesOnly.equals(other.getBidChangesForRaisesOnly()))) &&
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
        if (getTargetOutrankShare() != null) {
            _hashCode += getTargetOutrankShare().hashCode();
        }
        if (getCompetitorDomain() != null) {
            _hashCode += getCompetitorDomain().hashCode();
        }
        if (getMaxCpcBidCeiling() != null) {
            _hashCode += getMaxCpcBidCeiling().hashCode();
        }
        if (getBidChangesForRaisesOnly() != null) {
            _hashCode += getBidChangesForRaisesOnly().hashCode();
        }
        if (getRaiseBidWhenLowQualityScore() != null) {
            _hashCode += getRaiseBidWhenLowQualityScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetOutrankShareBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetOutrankShareBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOutrankShare");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetOutrankShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitorDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "competitorDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpcBidCeiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "maxCpcBidCeiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
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
