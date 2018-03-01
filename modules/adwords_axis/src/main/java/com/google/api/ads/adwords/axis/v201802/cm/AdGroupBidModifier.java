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
 * AdGroupBidModifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an adgroup level bid modifier override for campaign
 * level criterion
 *             bid modifier values.
 */
public class AdGroupBidModifier  implements java.io.Serializable {
    /* The campaign that the criterion is in. */
    private java.lang.Long campaignId;

    /* The adgroup that the bid modifier override is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* The criterion whose bid value is being overridden.
     *                 
     *                 <p>Currently, bid modifier overrides are supported
     * only for platform criterion
     *                 (ID=30000, 30001, 30002) and preferred content criterion
     * (ID = 400).
     *                 The {@linkplain AdGroupBidModifierService#get} method
     * returns all platform and
     *                 preferred content criteria.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion;

    /* The modifier for bids when the criterion matches.
     *                 
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}, with {@code 0.0} reserved
     *                 for opting out of a platform.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private java.lang.Double bidModifier;

    /* ID of the base adgroup from which this draft/trial adgroup
     * bid modifier was created. For
     *                 base adgroups this is equal to the adgroup ID.  If
     * the adgroup was created
     *                 in the draft or trial and has no corresponding base
     * adgroup, this field is null.
     *                 This field is readonly and only returned on get requests.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Long baseAdGroupId;

    /* Bid modifier source.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BidModifierSource bidModifierSource;

    public AdGroupBidModifier() {
    }

    public AdGroupBidModifier(
           java.lang.Long campaignId,
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion,
           java.lang.Double bidModifier,
           java.lang.Long baseAdGroupId,
           com.google.api.ads.adwords.axis.v201802.cm.BidModifierSource bidModifierSource) {
           this.campaignId = campaignId;
           this.adGroupId = adGroupId;
           this.criterion = criterion;
           this.bidModifier = bidModifier;
           this.baseAdGroupId = baseAdGroupId;
           this.bidModifierSource = bidModifierSource;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("baseAdGroupId", getBaseAdGroupId())
            .add("bidModifier", getBidModifier())
            .add("bidModifierSource", getBidModifierSource())
            .add("campaignId", getCampaignId())
            .add("criterion", getCriterion())
            .toString();
    }

    /**
     * Gets the campaignId value for this AdGroupBidModifier.
     * 
     * @return campaignId   * The campaign that the criterion is in.
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdGroupBidModifier.
     * 
     * @param campaignId   * The campaign that the criterion is in.
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adGroupId value for this AdGroupBidModifier.
     * 
     * @return adGroupId   * The adgroup that the bid modifier override is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupBidModifier.
     * 
     * @param adGroupId   * The adgroup that the bid modifier override is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the criterion value for this AdGroupBidModifier.
     * 
     * @return criterion   * The criterion whose bid value is being overridden.
     *                 
     *                 <p>Currently, bid modifier overrides are supported
     * only for platform criterion
     *                 (ID=30000, 30001, 30002) and preferred content criterion
     * (ID = 400).
     *                 The {@linkplain AdGroupBidModifierService#get} method
     * returns all platform and
     *                 preferred content criteria.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this AdGroupBidModifier.
     * 
     * @param criterion   * The criterion whose bid value is being overridden.
     *                 
     *                 <p>Currently, bid modifier overrides are supported
     * only for platform criterion
     *                 (ID=30000, 30001, 30002) and preferred content criterion
     * (ID = 400).
     *                 The {@linkplain AdGroupBidModifierService#get} method
     * returns all platform and
     *                 preferred content criteria.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the bidModifier value for this AdGroupBidModifier.
     * 
     * @return bidModifier   * The modifier for bids when the criterion matches.
     *                 
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}, with {@code 0.0} reserved
     *                 for opting out of a platform.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this AdGroupBidModifier.
     * 
     * @param bidModifier   * The modifier for bids when the criterion matches.
     *                 
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}, with {@code 0.0} reserved
     *                 for opting out of a platform.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }


    /**
     * Gets the baseAdGroupId value for this AdGroupBidModifier.
     * 
     * @return baseAdGroupId   * ID of the base adgroup from which this draft/trial adgroup
     * bid modifier was created. For
     *                 base adgroups this is equal to the adgroup ID.  If
     * the adgroup was created
     *                 in the draft or trial and has no corresponding base
     * adgroup, this field is null.
     *                 This field is readonly and only returned on get requests.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseAdGroupId() {
        return baseAdGroupId;
    }


    /**
     * Sets the baseAdGroupId value for this AdGroupBidModifier.
     * 
     * @param baseAdGroupId   * ID of the base adgroup from which this draft/trial adgroup
     * bid modifier was created. For
     *                 base adgroups this is equal to the adgroup ID.  If
     * the adgroup was created
     *                 in the draft or trial and has no corresponding base
     * adgroup, this field is null.
     *                 This field is readonly and only returned on get requests.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setBaseAdGroupId(java.lang.Long baseAdGroupId) {
        this.baseAdGroupId = baseAdGroupId;
    }


    /**
     * Gets the bidModifierSource value for this AdGroupBidModifier.
     * 
     * @return bidModifierSource   * Bid modifier source.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BidModifierSource getBidModifierSource() {
        return bidModifierSource;
    }


    /**
     * Sets the bidModifierSource value for this AdGroupBidModifier.
     * 
     * @param bidModifierSource   * Bid modifier source.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBidModifierSource(com.google.api.ads.adwords.axis.v201802.cm.BidModifierSource bidModifierSource) {
        this.bidModifierSource = bidModifierSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupBidModifier)) return false;
        AdGroupBidModifier other = (AdGroupBidModifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.criterion==null && other.getCriterion()==null) || 
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) || 
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier()))) &&
            ((this.baseAdGroupId==null && other.getBaseAdGroupId()==null) || 
             (this.baseAdGroupId!=null &&
              this.baseAdGroupId.equals(other.getBaseAdGroupId()))) &&
            ((this.bidModifierSource==null && other.getBidModifierSource()==null) || 
             (this.bidModifierSource!=null &&
              this.bidModifierSource.equals(other.getBidModifierSource())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        if (getBaseAdGroupId() != null) {
            _hashCode += getBaseAdGroupId().hashCode();
        }
        if (getBidModifierSource() != null) {
            _hashCode += getBidModifierSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupBidModifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupBidModifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion"));
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
        elemField.setFieldName("baseAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseAdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidModifierSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidModifierSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidModifierSource"));
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
