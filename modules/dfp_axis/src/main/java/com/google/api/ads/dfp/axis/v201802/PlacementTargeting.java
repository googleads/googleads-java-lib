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
 * PlacementTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Specifies what {@link Placement placements} are targeted.
 */
public class PlacementTargeting  implements java.io.Serializable {
    /* IDs of the targeted placements. */
    private long[] targetedPlacementIds;

    public PlacementTargeting() {
    }

    public PlacementTargeting(
           long[] targetedPlacementIds) {
           this.targetedPlacementIds = targetedPlacementIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("targetedPlacementIds", getTargetedPlacementIds())
            .toString();
    }

    /**
     * Gets the targetedPlacementIds value for this PlacementTargeting.
     * 
     * @return targetedPlacementIds   * IDs of the targeted placements.
     */
    public long[] getTargetedPlacementIds() {
        return targetedPlacementIds;
    }


    /**
     * Sets the targetedPlacementIds value for this PlacementTargeting.
     * 
     * @param targetedPlacementIds   * IDs of the targeted placements.
     */
    public void setTargetedPlacementIds(long[] targetedPlacementIds) {
        this.targetedPlacementIds = targetedPlacementIds;
    }

    public long getTargetedPlacementIds(int i) {
        return this.targetedPlacementIds[i];
    }

    public void setTargetedPlacementIds(int i, long _value) {
        this.targetedPlacementIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementTargeting)) return false;
        PlacementTargeting other = (PlacementTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedPlacementIds==null && other.getTargetedPlacementIds()==null) || 
             (this.targetedPlacementIds!=null &&
              java.util.Arrays.equals(this.targetedPlacementIds, other.getTargetedPlacementIds())));
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
        if (getTargetedPlacementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedPlacementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedPlacementIds(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PlacementTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedPlacementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetedPlacementIds"));
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
