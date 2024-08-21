// Copyright 2024 Google LLC
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
 * CmsMetadataCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public class CmsMetadataCriteria  extends com.google.api.ads.admanager.axis.v202408.CustomCriteriaLeaf  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202408.CmsMetadataCriteriaComparisonOperator operator;

    private long[] cmsMetadataValueIds;

    public CmsMetadataCriteria() {
    }

    public CmsMetadataCriteria(
           com.google.api.ads.admanager.axis.v202408.CmsMetadataCriteriaComparisonOperator operator,
           long[] cmsMetadataValueIds) {
        this.operator = operator;
        this.cmsMetadataValueIds = cmsMetadataValueIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("cmsMetadataValueIds", getCmsMetadataValueIds())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operator value for this CmsMetadataCriteria.
     * 
     * @return operator
     */
    public com.google.api.ads.admanager.axis.v202408.CmsMetadataCriteriaComparisonOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this CmsMetadataCriteria.
     * 
     * @param operator
     */
    public void setOperator(com.google.api.ads.admanager.axis.v202408.CmsMetadataCriteriaComparisonOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the cmsMetadataValueIds value for this CmsMetadataCriteria.
     * 
     * @return cmsMetadataValueIds
     */
    public long[] getCmsMetadataValueIds() {
        return cmsMetadataValueIds;
    }


    /**
     * Sets the cmsMetadataValueIds value for this CmsMetadataCriteria.
     * 
     * @param cmsMetadataValueIds
     */
    public void setCmsMetadataValueIds(long[] cmsMetadataValueIds) {
        this.cmsMetadataValueIds = cmsMetadataValueIds;
    }

    public long getCmsMetadataValueIds(int i) {
        return this.cmsMetadataValueIds[i];
    }

    public void setCmsMetadataValueIds(int i, long _value) {
        this.cmsMetadataValueIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmsMetadataCriteria)) return false;
        CmsMetadataCriteria other = (CmsMetadataCriteria) obj;
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
            ((this.cmsMetadataValueIds==null && other.getCmsMetadataValueIds()==null) || 
             (this.cmsMetadataValueIds!=null &&
              java.util.Arrays.equals(this.cmsMetadataValueIds, other.getCmsMetadataValueIds())));
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
        if (getCmsMetadataValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmsMetadataValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmsMetadataValueIds(), i);
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
        new org.apache.axis.description.TypeDesc(CmsMetadataCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CmsMetadataCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CmsMetadataCriteria.ComparisonOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsMetadataValueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "cmsMetadataValueIds"));
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
