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
 * KeywordEstimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents the traffic estimate result for a single keyword.
 */
public class KeywordEstimate  extends com.google.api.ads.adwords.axis.v201802.o.Estimate  implements java.io.Serializable {
    /* The existing criterionId for this keyword, if any.
     *                     
     *                     This will not be returned if this is a new keyword. */
    private java.lang.Long criterionId;

    /* The lower bound on the estimated stats.
     *                     
     *                     <p>This is not a guarantee that actual performance
     * will never be lower than
     *                     these stats. */
    private com.google.api.ads.adwords.axis.v201802.o.StatsEstimate min;

    /* The upper bound on the estimated stats.
     *                     
     *                     <p>This is not a guarantee that actual performance
     * will never be higher than
     *                     these stats. */
    private com.google.api.ads.adwords.axis.v201802.o.StatsEstimate max;

    public KeywordEstimate() {
    }

    public KeywordEstimate(
           java.lang.String estimateType,
           java.lang.Long criterionId,
           com.google.api.ads.adwords.axis.v201802.o.StatsEstimate min,
           com.google.api.ads.adwords.axis.v201802.o.StatsEstimate max) {
        super(
            estimateType);
        this.criterionId = criterionId;
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionId", getCriterionId())
            .add("estimateType", getEstimateType())
            .add("max", getMax())
            .add("min", getMin())
            .toString();
    }

    /**
     * Gets the criterionId value for this KeywordEstimate.
     * 
     * @return criterionId   * The existing criterionId for this keyword, if any.
     *                     
     *                     This will not be returned if this is a new keyword.
     */
    public java.lang.Long getCriterionId() {
        return criterionId;
    }


    /**
     * Sets the criterionId value for this KeywordEstimate.
     * 
     * @param criterionId   * The existing criterionId for this keyword, if any.
     *                     
     *                     This will not be returned if this is a new keyword.
     */
    public void setCriterionId(java.lang.Long criterionId) {
        this.criterionId = criterionId;
    }


    /**
     * Gets the min value for this KeywordEstimate.
     * 
     * @return min   * The lower bound on the estimated stats.
     *                     
     *                     <p>This is not a guarantee that actual performance
     * will never be lower than
     *                     these stats.
     */
    public com.google.api.ads.adwords.axis.v201802.o.StatsEstimate getMin() {
        return min;
    }


    /**
     * Sets the min value for this KeywordEstimate.
     * 
     * @param min   * The lower bound on the estimated stats.
     *                     
     *                     <p>This is not a guarantee that actual performance
     * will never be lower than
     *                     these stats.
     */
    public void setMin(com.google.api.ads.adwords.axis.v201802.o.StatsEstimate min) {
        this.min = min;
    }


    /**
     * Gets the max value for this KeywordEstimate.
     * 
     * @return max   * The upper bound on the estimated stats.
     *                     
     *                     <p>This is not a guarantee that actual performance
     * will never be higher than
     *                     these stats.
     */
    public com.google.api.ads.adwords.axis.v201802.o.StatsEstimate getMax() {
        return max;
    }


    /**
     * Sets the max value for this KeywordEstimate.
     * 
     * @param max   * The upper bound on the estimated stats.
     *                     
     *                     <p>This is not a guarantee that actual performance
     * will never be higher than
     *                     these stats.
     */
    public void setMax(com.google.api.ads.adwords.axis.v201802.o.StatsEstimate max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordEstimate)) return false;
        KeywordEstimate other = (KeywordEstimate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criterionId==null && other.getCriterionId()==null) || 
             (this.criterionId!=null &&
              this.criterionId.equals(other.getCriterionId()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax())));
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
        if (getCriterionId() != null) {
            _hashCode += getCriterionId().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordEstimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "KeywordEstimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "criterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "StatsEstimate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "StatsEstimate"));
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
