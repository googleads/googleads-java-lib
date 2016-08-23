// Copyright 2016 Google Inc. All Rights Reserved.
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
 * LegacyDfpMobileCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;


/**
 * A mobile {@code Creative} that isn't supported by Google DFP, but
 * was
 *             migrated from DART. Creatives of this type cannot be created
 * or modified.
 */
public class LegacyDfpMobileCreative  extends com.google.api.ads.dfp.axis.v201605.HasDestinationUrlCreative  implements java.io.Serializable {
    public LegacyDfpMobileCreative() {
    }

    public LegacyDfpMobileCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201605.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201605.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201605.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201605.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201605.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201605.DestinationUrlType destinationUrlType) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            destinationUrl,
            destinationUrlType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LegacyDfpMobileCreative)) return false;
        LegacyDfpMobileCreative other = (LegacyDfpMobileCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LegacyDfpMobileCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "LegacyDfpMobileCreative"));
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
