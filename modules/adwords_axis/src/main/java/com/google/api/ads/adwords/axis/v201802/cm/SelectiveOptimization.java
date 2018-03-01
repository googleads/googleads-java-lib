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
 * SelectiveOptimization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Selected set of conversion types for optimizing campaigns. For
 * e.g. For universal app campaigns,
 *             these are the set of in-app actions to optimize the campaign
 * towards.
 */
public class SelectiveOptimization  implements java.io.Serializable {
    /* The selected conversion ids for selective optimization. */
    private long[] conversionTypeIds;

    /* The selected conversion ids ops for selective optimization. */
    private com.google.api.ads.adwords.axis.v201802.cm.ListOperations conversionTypeIdsOps;

    public SelectiveOptimization() {
    }

    public SelectiveOptimization(
           long[] conversionTypeIds,
           com.google.api.ads.adwords.axis.v201802.cm.ListOperations conversionTypeIdsOps) {
           this.conversionTypeIds = conversionTypeIds;
           this.conversionTypeIdsOps = conversionTypeIdsOps;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("conversionTypeIds", getConversionTypeIds())
            .add("conversionTypeIdsOps", getConversionTypeIdsOps())
            .toString();
    }

    /**
     * Gets the conversionTypeIds value for this SelectiveOptimization.
     * 
     * @return conversionTypeIds   * The selected conversion ids for selective optimization.
     */
    public long[] getConversionTypeIds() {
        return conversionTypeIds;
    }


    /**
     * Sets the conversionTypeIds value for this SelectiveOptimization.
     * 
     * @param conversionTypeIds   * The selected conversion ids for selective optimization.
     */
    public void setConversionTypeIds(long[] conversionTypeIds) {
        this.conversionTypeIds = conversionTypeIds;
    }

    public long getConversionTypeIds(int i) {
        return this.conversionTypeIds[i];
    }

    public void setConversionTypeIds(int i, long _value) {
        this.conversionTypeIds[i] = _value;
    }


    /**
     * Gets the conversionTypeIdsOps value for this SelectiveOptimization.
     * 
     * @return conversionTypeIdsOps   * The selected conversion ids ops for selective optimization.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ListOperations getConversionTypeIdsOps() {
        return conversionTypeIdsOps;
    }


    /**
     * Sets the conversionTypeIdsOps value for this SelectiveOptimization.
     * 
     * @param conversionTypeIdsOps   * The selected conversion ids ops for selective optimization.
     */
    public void setConversionTypeIdsOps(com.google.api.ads.adwords.axis.v201802.cm.ListOperations conversionTypeIdsOps) {
        this.conversionTypeIdsOps = conversionTypeIdsOps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SelectiveOptimization)) return false;
        SelectiveOptimization other = (SelectiveOptimization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conversionTypeIds==null && other.getConversionTypeIds()==null) || 
             (this.conversionTypeIds!=null &&
              java.util.Arrays.equals(this.conversionTypeIds, other.getConversionTypeIds()))) &&
            ((this.conversionTypeIdsOps==null && other.getConversionTypeIdsOps()==null) || 
             (this.conversionTypeIdsOps!=null &&
              this.conversionTypeIdsOps.equals(other.getConversionTypeIdsOps())));
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
        if (getConversionTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionTypeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConversionTypeIdsOps() != null) {
            _hashCode += getConversionTypeIdsOps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SelectiveOptimization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SelectiveOptimization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeIdsOps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "conversionTypeIdsOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations"));
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
