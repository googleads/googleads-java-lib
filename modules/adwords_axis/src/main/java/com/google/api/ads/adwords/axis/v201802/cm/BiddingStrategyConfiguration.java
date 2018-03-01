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
 * BiddingStrategyConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Encapsulates the information about bids and bidding strategies.
 * 
 *             <p class="note"><b>Note:</b> Starting with v201705, bidding
 * strategies can only be set on
 *             campaigns. In earlier versions, bidding strategies can
 * be set on campaigns, ad groups and ad
 *             group criteria.
 *             
 *             <p>A bidding strategy can be set using one of the following:
 * <ul>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingScheme
 * bidding scheme}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyType
 * bidding strategy type}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyId
 * bidding strategy ID} for
 *             flexible bid strategies.</li>
 *             </ul>
 *             <p>If the bidding strategy type is used, then schemes
 * are created using default values.
 *             
 *             <p>Bids can be set only on ad groups and ad group criteria.
 * They cannot be set on campaigns.
 *             Multiple bids can be set at the same time. Only the bids
 * that apply to the effective
 *             bidding strategy will be used. Effective bidding strategy
 * is considered to be the directly
 *             attached strategy or inherited strategy from above level(s)
 * when there is no directly attached
 *             strategy.
 *             
 *             <p>For more information on flexible bidding, visit the
 * <a href="https://support.google.com/adwords/answer/2979071">Help Center</a>.
 */
public class BiddingStrategyConfiguration  implements java.io.Serializable {
    /* Id of the bidding strategy to be associated with the campaign,
     * ad group or ad group criteria. A
     *                 bidding strategy is created using the BiddingStrategyService
     * ADD operation and is assigned a
     *                 BiddingStrategyId. The BiddingStrategyId can be shared
     * across campaigns, ad groups and ad group
     *                 criteria.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span> */
    private java.lang.Long biddingStrategyId;

    /* Name of the bidding strategy. This is applicable only for flexible
     * bidding strategies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String biddingStrategyName;

    /* The type of the bidding strategy to be attached.
     *                 
     *                 <p>For details on portfolio vs. standard availability,
     * see the <a
     *                 href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding
     * guide</a>.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level
     *                 to any value other than {@code BiddingStrategyType.NONE}. */
    private com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType biddingStrategyType;

    /* Indicates where the bidding strategy is associated i.e. campaign,
     * ad group or
     *                 ad group criterion.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategySource biddingStrategySource;

    /* The bidding strategy metadata. Bidding strategy can be associated
     * using the {@linkplain
     *                 BiddingStrategyConfiguration#biddingStrategyType}
     * or the bidding scheme.
     *                 
     *                 <p>For details on portfolio vs. standard availability,
     * see the <a
     *                 href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding
     * guide</a>.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level. */
    private com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme biddingScheme;

    /* Specifies the bids. Bids can be set only on ad groups and ad
     * group criteria.
     *                 Bids cannot be set on campaign.
     *                 
     *                 Default CPC and CPM bid values will be set if they
     * are not provided during {@linkplain AdGroup}
     *                 creation. Default CPC and CPM values are minimal billable
     * amounts in local currencies.
     *                 For example, for US Dollars CPC and CPM default values
     * are $0.01 and $0.01, respectively. */
    private com.google.api.ads.adwords.axis.v201802.cm.Bids[] bids;

    /* The target return on average spend (ROAS). This target can
     * only be set on ad groups. If this
     *                 ad group's effective bidding strategy is a standard
     * {@code TARGET_ROAS} strategy attached to
     *                 the campaign, then the target overrides the target
     * roas specified in the campaign's bidding
     *                 strategy. Otherwise, this value is ignored.
     *                 <span class="constraint InRange">This field must be
     * between 0.01 and 1000.0, inclusive.</span> */
    private java.lang.Double targetRoasOverride;

    public BiddingStrategyConfiguration() {
    }

    public BiddingStrategyConfiguration(
           java.lang.Long biddingStrategyId,
           java.lang.String biddingStrategyName,
           com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType biddingStrategyType,
           com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategySource biddingStrategySource,
           com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme biddingScheme,
           com.google.api.ads.adwords.axis.v201802.cm.Bids[] bids,
           java.lang.Double targetRoasOverride) {
           this.biddingStrategyId = biddingStrategyId;
           this.biddingStrategyName = biddingStrategyName;
           this.biddingStrategyType = biddingStrategyType;
           this.biddingStrategySource = biddingStrategySource;
           this.biddingScheme = biddingScheme;
           this.bids = bids;
           this.targetRoasOverride = targetRoasOverride;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("biddingScheme", getBiddingScheme())
            .add("biddingStrategyId", getBiddingStrategyId())
            .add("biddingStrategyName", getBiddingStrategyName())
            .add("biddingStrategySource", getBiddingStrategySource())
            .add("biddingStrategyType", getBiddingStrategyType())
            .add("bids", getBids())
            .add("targetRoasOverride", getTargetRoasOverride())
            .toString();
    }

    /**
     * Gets the biddingStrategyId value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategyId   * Id of the bidding strategy to be associated with the campaign,
     * ad group or ad group criteria. A
     *                 bidding strategy is created using the BiddingStrategyService
     * ADD operation and is assigned a
     *                 BiddingStrategyId. The BiddingStrategyId can be shared
     * across campaigns, ad groups and ad group
     *                 criteria.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     */
    public java.lang.Long getBiddingStrategyId() {
        return biddingStrategyId;
    }


    /**
     * Sets the biddingStrategyId value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategyId   * Id of the bidding strategy to be associated with the campaign,
     * ad group or ad group criteria. A
     *                 bidding strategy is created using the BiddingStrategyService
     * ADD operation and is assigned a
     *                 BiddingStrategyId. The BiddingStrategyId can be shared
     * across campaigns, ad groups and ad group
     *                 criteria.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     */
    public void setBiddingStrategyId(java.lang.Long biddingStrategyId) {
        this.biddingStrategyId = biddingStrategyId;
    }


    /**
     * Gets the biddingStrategyName value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategyName   * Name of the bidding strategy. This is applicable only for flexible
     * bidding strategies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getBiddingStrategyName() {
        return biddingStrategyName;
    }


    /**
     * Sets the biddingStrategyName value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategyName   * Name of the bidding strategy. This is applicable only for flexible
     * bidding strategies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBiddingStrategyName(java.lang.String biddingStrategyName) {
        this.biddingStrategyName = biddingStrategyName;
    }


    /**
     * Gets the biddingStrategyType value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategyType   * The type of the bidding strategy to be attached.
     *                 
     *                 <p>For details on portfolio vs. standard availability,
     * see the <a
     *                 href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding
     * guide</a>.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level
     *                 to any value other than {@code BiddingStrategyType.NONE}.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType getBiddingStrategyType() {
        return biddingStrategyType;
    }


    /**
     * Sets the biddingStrategyType value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategyType   * The type of the bidding strategy to be attached.
     *                 
     *                 <p>For details on portfolio vs. standard availability,
     * see the <a
     *                 href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding
     * guide</a>.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level
     *                 to any value other than {@code BiddingStrategyType.NONE}.
     */
    public void setBiddingStrategyType(com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType biddingStrategyType) {
        this.biddingStrategyType = biddingStrategyType;
    }


    /**
     * Gets the biddingStrategySource value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategySource   * Indicates where the bidding strategy is associated i.e. campaign,
     * ad group or
     *                 ad group criterion.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategySource getBiddingStrategySource() {
        return biddingStrategySource;
    }


    /**
     * Sets the biddingStrategySource value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategySource   * Indicates where the bidding strategy is associated i.e. campaign,
     * ad group or
     *                 ad group criterion.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBiddingStrategySource(com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategySource biddingStrategySource) {
        this.biddingStrategySource = biddingStrategySource;
    }


    /**
     * Gets the biddingScheme value for this BiddingStrategyConfiguration.
     * 
     * @return biddingScheme   * The bidding strategy metadata. Bidding strategy can be associated
     * using the {@linkplain
     *                 BiddingStrategyConfiguration#biddingStrategyType}
     * or the bidding scheme.
     *                 
     *                 <p>For details on portfolio vs. standard availability,
     * see the <a
     *                 href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding
     * guide</a>.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }


    /**
     * Sets the biddingScheme value for this BiddingStrategyConfiguration.
     * 
     * @param biddingScheme   * The bidding strategy metadata. Bidding strategy can be associated
     * using the {@linkplain
     *                 BiddingStrategyConfiguration#biddingStrategyType}
     * or the bidding scheme.
     *                 
     *                 <p>For details on portfolio vs. standard availability,
     * see the <a
     *                 href="https://developers.google.com/adwords/api/docs/guides/bidding">bidding
     * guide</a>.
     *                 
     *                 <p>Starting with v201705, this field cannot be set
     * at the ad group or ad group criterion level.
     */
    public void setBiddingScheme(com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme biddingScheme) {
        this.biddingScheme = biddingScheme;
    }


    /**
     * Gets the bids value for this BiddingStrategyConfiguration.
     * 
     * @return bids   * Specifies the bids. Bids can be set only on ad groups and ad
     * group criteria.
     *                 Bids cannot be set on campaign.
     *                 
     *                 Default CPC and CPM bid values will be set if they
     * are not provided during {@linkplain AdGroup}
     *                 creation. Default CPC and CPM values are minimal billable
     * amounts in local currencies.
     *                 For example, for US Dollars CPC and CPM default values
     * are $0.01 and $0.01, respectively.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Bids[] getBids() {
        return bids;
    }


    /**
     * Sets the bids value for this BiddingStrategyConfiguration.
     * 
     * @param bids   * Specifies the bids. Bids can be set only on ad groups and ad
     * group criteria.
     *                 Bids cannot be set on campaign.
     *                 
     *                 Default CPC and CPM bid values will be set if they
     * are not provided during {@linkplain AdGroup}
     *                 creation. Default CPC and CPM values are minimal billable
     * amounts in local currencies.
     *                 For example, for US Dollars CPC and CPM default values
     * are $0.01 and $0.01, respectively.
     */
    public void setBids(com.google.api.ads.adwords.axis.v201802.cm.Bids[] bids) {
        this.bids = bids;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Bids getBids(int i) {
        return this.bids[i];
    }

    public void setBids(int i, com.google.api.ads.adwords.axis.v201802.cm.Bids _value) {
        this.bids[i] = _value;
    }


    /**
     * Gets the targetRoasOverride value for this BiddingStrategyConfiguration.
     * 
     * @return targetRoasOverride   * The target return on average spend (ROAS). This target can
     * only be set on ad groups. If this
     *                 ad group's effective bidding strategy is a standard
     * {@code TARGET_ROAS} strategy attached to
     *                 the campaign, then the target overrides the target
     * roas specified in the campaign's bidding
     *                 strategy. Otherwise, this value is ignored.
     *                 <span class="constraint InRange">This field must be
     * between 0.01 and 1000.0, inclusive.</span>
     */
    public java.lang.Double getTargetRoasOverride() {
        return targetRoasOverride;
    }


    /**
     * Sets the targetRoasOverride value for this BiddingStrategyConfiguration.
     * 
     * @param targetRoasOverride   * The target return on average spend (ROAS). This target can
     * only be set on ad groups. If this
     *                 ad group's effective bidding strategy is a standard
     * {@code TARGET_ROAS} strategy attached to
     *                 the campaign, then the target overrides the target
     * roas specified in the campaign's bidding
     *                 strategy. Otherwise, this value is ignored.
     *                 <span class="constraint InRange">This field must be
     * between 0.01 and 1000.0, inclusive.</span>
     */
    public void setTargetRoasOverride(java.lang.Double targetRoasOverride) {
        this.targetRoasOverride = targetRoasOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddingStrategyConfiguration)) return false;
        BiddingStrategyConfiguration other = (BiddingStrategyConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biddingStrategyId==null && other.getBiddingStrategyId()==null) || 
             (this.biddingStrategyId!=null &&
              this.biddingStrategyId.equals(other.getBiddingStrategyId()))) &&
            ((this.biddingStrategyName==null && other.getBiddingStrategyName()==null) || 
             (this.biddingStrategyName!=null &&
              this.biddingStrategyName.equals(other.getBiddingStrategyName()))) &&
            ((this.biddingStrategyType==null && other.getBiddingStrategyType()==null) || 
             (this.biddingStrategyType!=null &&
              this.biddingStrategyType.equals(other.getBiddingStrategyType()))) &&
            ((this.biddingStrategySource==null && other.getBiddingStrategySource()==null) || 
             (this.biddingStrategySource!=null &&
              this.biddingStrategySource.equals(other.getBiddingStrategySource()))) &&
            ((this.biddingScheme==null && other.getBiddingScheme()==null) || 
             (this.biddingScheme!=null &&
              this.biddingScheme.equals(other.getBiddingScheme()))) &&
            ((this.bids==null && other.getBids()==null) || 
             (this.bids!=null &&
              java.util.Arrays.equals(this.bids, other.getBids()))) &&
            ((this.targetRoasOverride==null && other.getTargetRoasOverride()==null) || 
             (this.targetRoasOverride!=null &&
              this.targetRoasOverride.equals(other.getTargetRoasOverride())));
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
        if (getBiddingStrategyId() != null) {
            _hashCode += getBiddingStrategyId().hashCode();
        }
        if (getBiddingStrategyName() != null) {
            _hashCode += getBiddingStrategyName().hashCode();
        }
        if (getBiddingStrategyType() != null) {
            _hashCode += getBiddingStrategyType().hashCode();
        }
        if (getBiddingStrategySource() != null) {
            _hashCode += getBiddingStrategySource().hashCode();
        }
        if (getBiddingScheme() != null) {
            _hashCode += getBiddingScheme().hashCode();
        }
        if (getBids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetRoasOverride() != null) {
            _hashCode += getTargetRoasOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiddingStrategyConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingStrategyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingStrategyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingStrategyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategySource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingStrategySource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategySource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingScheme"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bids"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Bids"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRoasOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetRoasOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
