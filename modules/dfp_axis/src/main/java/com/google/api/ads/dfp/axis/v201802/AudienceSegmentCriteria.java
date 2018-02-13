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
 * AudienceSegmentCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An {@link AudienceSegmentCriteria} object is used to target {@link
 * AudienceSegment} objects.
 */
public class AudienceSegmentCriteria  extends com.google.api.ads.dfp.axis.v201802.CustomCriteriaLeaf  implements java.io.Serializable {
    /* The comparison operator. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.AudienceSegmentCriteriaComparisonOperator operator;

    /* The ids of {@link AudienceSegment} objects used to target audience
     * segments. This attribute is
     *                     required. */
    private long[] audienceSegmentIds;

    public AudienceSegmentCriteria() {
    }

    public AudienceSegmentCriteria(
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentCriteriaComparisonOperator operator,
           long[] audienceSegmentIds) {
        this.operator = operator;
        this.audienceSegmentIds = audienceSegmentIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("audienceSegmentIds", getAudienceSegmentIds())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operator value for this AudienceSegmentCriteria.
     * 
     * @return operator   * The comparison operator. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.AudienceSegmentCriteriaComparisonOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this AudienceSegmentCriteria.
     * 
     * @param operator   * The comparison operator. This attribute is required.
     */
    public void setOperator(com.google.api.ads.dfp.axis.v201802.AudienceSegmentCriteriaComparisonOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the audienceSegmentIds value for this AudienceSegmentCriteria.
     * 
     * @return audienceSegmentIds   * The ids of {@link AudienceSegment} objects used to target audience
     * segments. This attribute is
     *                     required.
     */
    public long[] getAudienceSegmentIds() {
        return audienceSegmentIds;
    }


    /**
     * Sets the audienceSegmentIds value for this AudienceSegmentCriteria.
     * 
     * @param audienceSegmentIds   * The ids of {@link AudienceSegment} objects used to target audience
     * segments. This attribute is
     *                     required.
     */
    public void setAudienceSegmentIds(long[] audienceSegmentIds) {
        this.audienceSegmentIds = audienceSegmentIds;
    }

    public long getAudienceSegmentIds(int i) {
        return this.audienceSegmentIds[i];
    }

    public void setAudienceSegmentIds(int i, long _value) {
        this.audienceSegmentIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceSegmentCriteria)) return false;
        AudienceSegmentCriteria other = (AudienceSegmentCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.audienceSegmentIds==null && other.getAudienceSegmentIds()==null) || 
             (this.audienceSegmentIds!=null &&
              java.util.Arrays.equals(this.audienceSegmentIds, other.getAudienceSegmentIds())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getAudienceSegmentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudienceSegmentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceSegmentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudienceSegmentCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AudienceSegmentCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AudienceSegmentCriteria.ComparisonOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegmentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "audienceSegmentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
