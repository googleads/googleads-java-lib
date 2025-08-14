// Copyright 2025 Google LLC
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
 * CustomCriteriaSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public class CustomCriteriaSet  extends com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode  implements java.io.Serializable {
    /* <span class="constraint Required">This attribute is required.</span> */
    private com.google.api.ads.admanager.axis.v202508.CustomCriteriaSetLogicalOperator logicalOperator;

    private com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode[] children;

    public CustomCriteriaSet() {
    }

    public CustomCriteriaSet(
           com.google.api.ads.admanager.axis.v202508.CustomCriteriaSetLogicalOperator logicalOperator,
           com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode[] children) {
        this.logicalOperator = logicalOperator;
        this.children = children;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            // Only include length of children to avoid overly verbose output
            .add("children.length", getChildren() == null ? 0 : getChildren().length)
            .add("logicalOperator", getLogicalOperator())
            .toString();
    }

    /**
     * Gets the logicalOperator value for this CustomCriteriaSet.
     * 
     * @return logicalOperator   * <span class="constraint Required">This attribute is required.</span>
     */
    public com.google.api.ads.admanager.axis.v202508.CustomCriteriaSetLogicalOperator getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this CustomCriteriaSet.
     * 
     * @param logicalOperator   * <span class="constraint Required">This attribute is required.</span>
     */
    public void setLogicalOperator(com.google.api.ads.admanager.axis.v202508.CustomCriteriaSetLogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the children value for this CustomCriteriaSet.
     * 
     * @return children
     */
    public com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this CustomCriteriaSet.
     * 
     * @param children
     */
    public void setChildren(com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode[] children) {
        this.children = children;
    }

    public com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.google.api.ads.admanager.axis.v202508.CustomCriteriaNode _value) {
        this.children[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCriteriaSet)) return false;
        CustomCriteriaSet other = (CustomCriteriaSet) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logicalOperator==null && other.getLogicalOperator()==null) || 
             (this.logicalOperator!=null &&
              this.logicalOperator.equals(other.getLogicalOperator()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren())));
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
        if (getLogicalOperator() != null) {
            _hashCode += getLogicalOperator().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
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
        new org.apache.axis.description.TypeDesc(CustomCriteriaSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "CustomCriteriaSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "CustomCriteriaSet.LogicalOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "CustomCriteriaNode"));
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
