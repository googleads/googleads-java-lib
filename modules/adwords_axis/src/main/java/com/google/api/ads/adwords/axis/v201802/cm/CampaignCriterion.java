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
 * CampaignCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a campaign level criterion.
 */
public class CampaignCriterion  implements java.io.Serializable {
    /* The campaign that the criterion is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long campaignId;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.Boolean isNegative;

    /* The criterion part of the campaign criterion.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion;

    /* The modifier for bids when the criterion matches.
     *
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}, with {@code 0.0} reserved
     *                 for opting out of platform criterion.
     *                 <p>To clear an existing bid modifier, specify {@code
     * -1.0} (invalid for initial {@code ADD}
     *                 operations). */
    private java.lang.Double bidModifier;

    /* The status for criteria. */
    private com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionCampaignCriterionStatus campaignCriterionStatus;

    /* ID of the base campaign from which this draft/trial campaign
     * criterion was created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    private com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* Indicates that this instance is a subtype of CampaignCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String campaignCriterionType;

    public CampaignCriterion() {
    }

    public CampaignCriterion(
           java.lang.Long campaignId,
           java.lang.Boolean isNegative,
           com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion,
           java.lang.Double bidModifier,
           com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionCampaignCriterionStatus campaignCriterionStatus,
           java.lang.Long baseCampaignId,
           com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] forwardCompatibilityMap,
           java.lang.String campaignCriterionType) {
           this.campaignId = campaignId;
           this.isNegative = isNegative;
           this.criterion = criterion;
           this.bidModifier = bidModifier;
           this.campaignCriterionStatus = campaignCriterionStatus;
           this.baseCampaignId = baseCampaignId;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.campaignCriterionType = campaignCriterionType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("baseCampaignId", getBaseCampaignId())
            .add("bidModifier", getBidModifier())
            .add("campaignCriterionStatus", getCampaignCriterionStatus())
            .add("campaignCriterionType", getCampaignCriterionType())
            .add("campaignId", getCampaignId())
            .add("criterion", getCriterion())
            .add("forwardCompatibilityMap", getForwardCompatibilityMap())
            .add("isNegative", getIsNegative())
            .toString();
    }

    /**
     * Gets the campaignId value for this CampaignCriterion.
     *
     * @return campaignId   * The campaign that the criterion is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignCriterion.
     *
     * @param campaignId   * The campaign that the criterion is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the isNegative value for this CampaignCriterion.
     *
     * @return isNegative   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsNegative() {
        return isNegative;
    }


    /**
     * Sets the isNegative value for this CampaignCriterion.
     *
     * @param isNegative   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setIsNegative(java.lang.Boolean isNegative) {
        this.isNegative = isNegative;
    }


    /**
     * Gets the criterion value for this CampaignCriterion.
     *
     * @return criterion   * The criterion part of the campaign criterion.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this CampaignCriterion.
     *
     * @param criterion   * The criterion part of the campaign criterion.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the bidModifier value for this CampaignCriterion.
     *
     * @return bidModifier   * The modifier for bids when the criterion matches.
     *
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}, with {@code 0.0} reserved
     *                 for opting out of platform criterion.
     *                 <p>To clear an existing bid modifier, specify {@code
     * -1.0} (invalid for initial {@code ADD}
     *                 operations).
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this CampaignCriterion.
     *
     * @param bidModifier   * The modifier for bids when the criterion matches.
     *
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}, with {@code 0.0} reserved
     *                 for opting out of platform criterion.
     *                 <p>To clear an existing bid modifier, specify {@code
     * -1.0} (invalid for initial {@code ADD}
     *                 operations).
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }


    /**
     * Gets the campaignCriterionStatus value for this CampaignCriterion.
     *
     * @return campaignCriterionStatus   * The status for criteria.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionCampaignCriterionStatus getCampaignCriterionStatus() {
        return campaignCriterionStatus;
    }


    /**
     * Sets the campaignCriterionStatus value for this CampaignCriterion.
     *
     * @param campaignCriterionStatus   * The status for criteria.
     */
    public void setCampaignCriterionStatus(com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionCampaignCriterionStatus campaignCriterionStatus) {
        this.campaignCriterionStatus = campaignCriterionStatus;
    }


    /**
     * Gets the baseCampaignId value for this CampaignCriterion.
     *
     * @return baseCampaignId   * ID of the base campaign from which this draft/trial campaign
     * criterion was created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this CampaignCriterion.
     *
     * @param baseCampaignId   * ID of the base campaign from which this draft/trial campaign
     * criterion was created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    public com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the campaignCriterionType value for this CampaignCriterion.
     *
     * @return campaignCriterionType   * Indicates that this instance is a subtype of CampaignCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getCampaignCriterionType() {
        return campaignCriterionType;
    }


    /**
     * Sets the campaignCriterionType value for this CampaignCriterion.
     *
     * @param campaignCriterionType   * Indicates that this instance is a subtype of CampaignCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setCampaignCriterionType(java.lang.String campaignCriterionType) {
        this.campaignCriterionType = campaignCriterionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignCriterion)) return false;
        CampaignCriterion other = (CampaignCriterion) obj;
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
            ((this.isNegative==null && other.getIsNegative()==null) ||
             (this.isNegative!=null &&
              this.isNegative.equals(other.getIsNegative()))) &&
            ((this.criterion==null && other.getCriterion()==null) ||
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) ||
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier()))) &&
            ((this.campaignCriterionStatus==null && other.getCampaignCriterionStatus()==null) ||
             (this.campaignCriterionStatus!=null &&
              this.campaignCriterionStatus.equals(other.getCampaignCriterionStatus()))) &&
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) ||
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) ||
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.campaignCriterionType==null && other.getCampaignCriterionType()==null) ||
             (this.campaignCriterionType!=null &&
              this.campaignCriterionType.equals(other.getCampaignCriterionType())));
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
        if (getIsNegative() != null) {
            _hashCode += getIsNegative().hashCode();
        }
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        if (getCampaignCriterionStatus() != null) {
            _hashCode += getCampaignCriterionStatus().hashCode();
        }
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignCriterionType() != null) {
            _hashCode += getCampaignCriterionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNegative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isNegative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("campaignCriterionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignCriterionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterion.CampaignCriterionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignCriterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterion.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
