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
 * ThirdPartyDataDeclaration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;


/**
 * Represents a set of declarations about what (if any) third party
 * companies are associated with a
 *             given creative.
 *             
 *             <p>This can be set at the network level, as a default
 * for all creatives, or overridden for a
 *             particular creative.
 */
public class ThirdPartyDataDeclaration  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202508.DeclarationType declarationType;

    private long[] thirdPartyCompanyIds;

    public ThirdPartyDataDeclaration() {
    }

    public ThirdPartyDataDeclaration(
           com.google.api.ads.admanager.axis.v202508.DeclarationType declarationType,
           long[] thirdPartyCompanyIds) {
           this.declarationType = declarationType;
           this.thirdPartyCompanyIds = thirdPartyCompanyIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("declarationType", getDeclarationType())
            .add("thirdPartyCompanyIds", getThirdPartyCompanyIds())
            .toString();
    }

    /**
     * Gets the declarationType value for this ThirdPartyDataDeclaration.
     * 
     * @return declarationType
     */
    public com.google.api.ads.admanager.axis.v202508.DeclarationType getDeclarationType() {
        return declarationType;
    }


    /**
     * Sets the declarationType value for this ThirdPartyDataDeclaration.
     * 
     * @param declarationType
     */
    public void setDeclarationType(com.google.api.ads.admanager.axis.v202508.DeclarationType declarationType) {
        this.declarationType = declarationType;
    }


    /**
     * Gets the thirdPartyCompanyIds value for this ThirdPartyDataDeclaration.
     * 
     * @return thirdPartyCompanyIds
     */
    public long[] getThirdPartyCompanyIds() {
        return thirdPartyCompanyIds;
    }


    /**
     * Sets the thirdPartyCompanyIds value for this ThirdPartyDataDeclaration.
     * 
     * @param thirdPartyCompanyIds
     */
    public void setThirdPartyCompanyIds(long[] thirdPartyCompanyIds) {
        this.thirdPartyCompanyIds = thirdPartyCompanyIds;
    }

    public long getThirdPartyCompanyIds(int i) {
        return this.thirdPartyCompanyIds[i];
    }

    public void setThirdPartyCompanyIds(int i, long _value) {
        this.thirdPartyCompanyIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyDataDeclaration)) return false;
        ThirdPartyDataDeclaration other = (ThirdPartyDataDeclaration) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.declarationType==null && other.getDeclarationType()==null) || 
             (this.declarationType!=null &&
              this.declarationType.equals(other.getDeclarationType()))) &&
            ((this.thirdPartyCompanyIds==null && other.getThirdPartyCompanyIds()==null) || 
             (this.thirdPartyCompanyIds!=null &&
              java.util.Arrays.equals(this.thirdPartyCompanyIds, other.getThirdPartyCompanyIds())));
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
        if (getDeclarationType() != null) {
            _hashCode += getDeclarationType().hashCode();
        }
        if (getThirdPartyCompanyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThirdPartyCompanyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThirdPartyCompanyIds(), i);
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
        new org.apache.axis.description.TypeDesc(ThirdPartyDataDeclaration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ThirdPartyDataDeclaration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declarationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "declarationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "DeclarationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCompanyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "thirdPartyCompanyIds"));
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
