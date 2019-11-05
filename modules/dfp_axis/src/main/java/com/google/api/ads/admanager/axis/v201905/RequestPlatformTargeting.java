// Copyright 2019 Google LLC
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
 * RequestPlatformTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201905;


/**
 * Provides line items the ability to target the platform that requests
 * and renders the ad.
 *             
 *             <p>The following rules apply for {@link RequestPlatformTargeting}
 * 
 *             <ul>
 *             <li>{@link RequestPlatformTargeting} must be specified
 * for video line items. Empty values for
 *             {@link RequestPlatformTargeting#targetedRequestPlatforms}
 * mean that all request platforms
 *             will be targeted.
 *             <li>{@link RequestPlatformTargeting} is read-only and
 * assigned by Google for non-video line
 *             items.
 *             <li>{@link RequestPlatformTargeting} is read-only and
 * assigned by Google for line items
 *             generated from proposal line items.
 *             <li>{@link RequestPlatformTargeting} is assigned by Google
 * for video line items created and
 *             updated through external API requests when the RESPECT_EXTERNAL_API_RPT_TARGETING
 * publisher
 *             feature is off.
 *             </ul>
 */
public class RequestPlatformTargeting  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v201905.RequestPlatform[] targetedRequestPlatforms;

    public RequestPlatformTargeting() {
    }

    public RequestPlatformTargeting(
           com.google.api.ads.admanager.axis.v201905.RequestPlatform[] targetedRequestPlatforms) {
           this.targetedRequestPlatforms = targetedRequestPlatforms;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("targetedRequestPlatforms", getTargetedRequestPlatforms())
            .toString();
    }

    /**
     * Gets the targetedRequestPlatforms value for this RequestPlatformTargeting.
     * 
     * @return targetedRequestPlatforms
     */
    public com.google.api.ads.admanager.axis.v201905.RequestPlatform[] getTargetedRequestPlatforms() {
        return targetedRequestPlatforms;
    }


    /**
     * Sets the targetedRequestPlatforms value for this RequestPlatformTargeting.
     * 
     * @param targetedRequestPlatforms
     */
    public void setTargetedRequestPlatforms(com.google.api.ads.admanager.axis.v201905.RequestPlatform[] targetedRequestPlatforms) {
        this.targetedRequestPlatforms = targetedRequestPlatforms;
    }

    public com.google.api.ads.admanager.axis.v201905.RequestPlatform getTargetedRequestPlatforms(int i) {
        return this.targetedRequestPlatforms[i];
    }

    public void setTargetedRequestPlatforms(int i, com.google.api.ads.admanager.axis.v201905.RequestPlatform _value) {
        this.targetedRequestPlatforms[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestPlatformTargeting)) return false;
        RequestPlatformTargeting other = (RequestPlatformTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedRequestPlatforms==null && other.getTargetedRequestPlatforms()==null) || 
             (this.targetedRequestPlatforms!=null &&
              java.util.Arrays.equals(this.targetedRequestPlatforms, other.getTargetedRequestPlatforms())));
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
        if (getTargetedRequestPlatforms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedRequestPlatforms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedRequestPlatforms(), i);
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
        new org.apache.axis.description.TypeDesc(RequestPlatformTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "RequestPlatformTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedRequestPlatforms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "targetedRequestPlatforms"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "RequestPlatform"));
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
