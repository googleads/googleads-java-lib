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
 * RuleBasedFirstPartyAudienceSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@link RuleBasedFirstPartyAudienceSegment} is a {@link FirstPartyAudienceSegment}
 * owned by the
 *             publisher network. It contains a rule.
 */
public class RuleBasedFirstPartyAudienceSegment  extends com.google.api.ads.dfp.axis.v201802.RuleBasedFirstPartyAudienceSegmentSummary  implements java.io.Serializable {
    /* Specifies the rule of the segment which determines user's eligibility
     * criteria to be part of
     *                     the segment. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.FirstPartyAudienceSegmentRule rule;

    public RuleBasedFirstPartyAudienceSegment() {
    }

    public RuleBasedFirstPartyAudienceSegment(
           java.lang.Long id,
           java.lang.String name,
           long[] categoryIds,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentStatus status,
           java.lang.Long size,
           java.lang.Long mobileWebSize,
           java.lang.Long idfaSize,
           java.lang.Long adIdSize,
           java.lang.Long ppidSize,
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentType type,
           java.lang.Integer pageViews,
           java.lang.Integer recencyDays,
           java.lang.Integer membershipExpirationDays,
           com.google.api.ads.dfp.axis.v201802.FirstPartyAudienceSegmentRule rule) {
        super(
            id,
            name,
            categoryIds,
            description,
            status,
            size,
            mobileWebSize,
            idfaSize,
            adIdSize,
            ppidSize,
            dataProvider,
            type,
            pageViews,
            recencyDays,
            membershipExpirationDays);
        this.rule = rule;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adIdSize", getAdIdSize())
            .add("categoryIds", getCategoryIds())
            .add("dataProvider", getDataProvider())
            .add("description", getDescription())
            .add("id", getId())
            .add("idfaSize", getIdfaSize())
            .add("membershipExpirationDays", getMembershipExpirationDays())
            .add("mobileWebSize", getMobileWebSize())
            .add("name", getName())
            .add("pageViews", getPageViews())
            .add("ppidSize", getPpidSize())
            .add("recencyDays", getRecencyDays())
            .add("rule", getRule())
            .add("size", getSize())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the rule value for this RuleBasedFirstPartyAudienceSegment.
     * 
     * @return rule   * Specifies the rule of the segment which determines user's eligibility
     * criteria to be part of
     *                     the segment. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.FirstPartyAudienceSegmentRule getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this RuleBasedFirstPartyAudienceSegment.
     * 
     * @param rule   * Specifies the rule of the segment which determines user's eligibility
     * criteria to be part of
     *                     the segment. This attribute is required.
     */
    public void setRule(com.google.api.ads.dfp.axis.v201802.FirstPartyAudienceSegmentRule rule) {
        this.rule = rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleBasedFirstPartyAudienceSegment)) return false;
        RuleBasedFirstPartyAudienceSegment other = (RuleBasedFirstPartyAudienceSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule())));
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
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleBasedFirstPartyAudienceSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RuleBasedFirstPartyAudienceSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FirstPartyAudienceSegmentRule"));
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
