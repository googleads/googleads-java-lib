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
 * CustomCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@link CustomCriteria} object is used to perform custom criteria
 * targeting
 *             on custom targeting keys of type {@link CustomTargetingKey.Type#PREDEFINED}
 * or {@link CustomTargetingKey.Type#FREEFORM}.
 */
public class CustomCriteria  extends com.google.api.ads.dfp.axis.v201802.CustomCriteriaLeaf  implements java.io.Serializable {
    /* The {@link CustomTargetingKey#id} of the {@link CustomTargetingKey}
     * object
     *                     that was created using {@link CustomTargetingService}.
     * This attribute is
     *                     required. */
    private java.lang.Long keyId;

    /* The ids of {@link CustomTargetingValue} objects to target the
     * custom
     *                     targeting key with id {@link CustomCriteria#keyId}.
     * This attribute is
     *                     required. */
    private long[] valueIds;

    /* The comparison operator. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.CustomCriteriaComparisonOperator operator;

    public CustomCriteria() {
    }

    public CustomCriteria(
           java.lang.Long keyId,
           long[] valueIds,
           com.google.api.ads.dfp.axis.v201802.CustomCriteriaComparisonOperator operator) {
        this.keyId = keyId;
        this.valueIds = valueIds;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("keyId", getKeyId())
            .add("operator", getOperator())
            .add("valueIds", getValueIds())
            .toString();
    }

    /**
     * Gets the keyId value for this CustomCriteria.
     * 
     * @return keyId   * The {@link CustomTargetingKey#id} of the {@link CustomTargetingKey}
     * object
     *                     that was created using {@link CustomTargetingService}.
     * This attribute is
     *                     required.
     */
    public java.lang.Long getKeyId() {
        return keyId;
    }


    /**
     * Sets the keyId value for this CustomCriteria.
     * 
     * @param keyId   * The {@link CustomTargetingKey#id} of the {@link CustomTargetingKey}
     * object
     *                     that was created using {@link CustomTargetingService}.
     * This attribute is
     *                     required.
     */
    public void setKeyId(java.lang.Long keyId) {
        this.keyId = keyId;
    }


    /**
     * Gets the valueIds value for this CustomCriteria.
     * 
     * @return valueIds   * The ids of {@link CustomTargetingValue} objects to target the
     * custom
     *                     targeting key with id {@link CustomCriteria#keyId}.
     * This attribute is
     *                     required.
     */
    public long[] getValueIds() {
        return valueIds;
    }


    /**
     * Sets the valueIds value for this CustomCriteria.
     * 
     * @param valueIds   * The ids of {@link CustomTargetingValue} objects to target the
     * custom
     *                     targeting key with id {@link CustomCriteria#keyId}.
     * This attribute is
     *                     required.
     */
    public void setValueIds(long[] valueIds) {
        this.valueIds = valueIds;
    }

    public long getValueIds(int i) {
        return this.valueIds[i];
    }

    public void setValueIds(int i, long _value) {
        this.valueIds[i] = _value;
    }


    /**
     * Gets the operator value for this CustomCriteria.
     * 
     * @return operator   * The comparison operator. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.CustomCriteriaComparisonOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this CustomCriteria.
     * 
     * @param operator   * The comparison operator. This attribute is required.
     */
    public void setOperator(com.google.api.ads.dfp.axis.v201802.CustomCriteriaComparisonOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCriteria)) return false;
        CustomCriteria other = (CustomCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyId==null && other.getKeyId()==null) || 
             (this.keyId!=null &&
              this.keyId.equals(other.getKeyId()))) &&
            ((this.valueIds==null && other.getValueIds()==null) || 
             (this.valueIds!=null &&
              java.util.Arrays.equals(this.valueIds, other.getValueIds()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getKeyId() != null) {
            _hashCode += getKeyId().hashCode();
        }
        if (getValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "keyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "valueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomCriteria.ComparisonOperator"));
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
