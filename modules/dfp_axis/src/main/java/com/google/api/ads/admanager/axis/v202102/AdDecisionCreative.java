// Copyright 2021 Google LLC
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
 * AdDecisionCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202102;

public class AdDecisionCreative  implements java.io.Serializable {
    private java.lang.Integer sequence;

    private java.lang.Long slateDurationMills;

    private java.lang.Long creativeDurationMills;

    private com.google.api.ads.admanager.axis.v202102.CreativeTranscode creativeTranscode;

    private com.google.api.ads.admanager.axis.v202102.SamError samError;

    private java.lang.Boolean isTranscoded;

    public AdDecisionCreative() {
    }

    public AdDecisionCreative(
           java.lang.Integer sequence,
           java.lang.Long slateDurationMills,
           java.lang.Long creativeDurationMills,
           com.google.api.ads.admanager.axis.v202102.CreativeTranscode creativeTranscode,
           com.google.api.ads.admanager.axis.v202102.SamError samError,
           java.lang.Boolean isTranscoded) {
           this.sequence = sequence;
           this.slateDurationMills = slateDurationMills;
           this.creativeDurationMills = creativeDurationMills;
           this.creativeTranscode = creativeTranscode;
           this.samError = samError;
           this.isTranscoded = isTranscoded;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creativeDurationMills", getCreativeDurationMills())
            .add("creativeTranscode", getCreativeTranscode())
            .add("isTranscoded", getIsTranscoded())
            .add("samError", getSamError())
            .add("sequence", getSequence())
            .add("slateDurationMills", getSlateDurationMills())
            .toString();
    }

    /**
     * Gets the sequence value for this AdDecisionCreative.
     * 
     * @return sequence
     */
    public java.lang.Integer getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this AdDecisionCreative.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.Integer sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the slateDurationMills value for this AdDecisionCreative.
     * 
     * @return slateDurationMills
     */
    public java.lang.Long getSlateDurationMills() {
        return slateDurationMills;
    }


    /**
     * Sets the slateDurationMills value for this AdDecisionCreative.
     * 
     * @param slateDurationMills
     */
    public void setSlateDurationMills(java.lang.Long slateDurationMills) {
        this.slateDurationMills = slateDurationMills;
    }


    /**
     * Gets the creativeDurationMills value for this AdDecisionCreative.
     * 
     * @return creativeDurationMills
     */
    public java.lang.Long getCreativeDurationMills() {
        return creativeDurationMills;
    }


    /**
     * Sets the creativeDurationMills value for this AdDecisionCreative.
     * 
     * @param creativeDurationMills
     */
    public void setCreativeDurationMills(java.lang.Long creativeDurationMills) {
        this.creativeDurationMills = creativeDurationMills;
    }


    /**
     * Gets the creativeTranscode value for this AdDecisionCreative.
     * 
     * @return creativeTranscode
     */
    public com.google.api.ads.admanager.axis.v202102.CreativeTranscode getCreativeTranscode() {
        return creativeTranscode;
    }


    /**
     * Sets the creativeTranscode value for this AdDecisionCreative.
     * 
     * @param creativeTranscode
     */
    public void setCreativeTranscode(com.google.api.ads.admanager.axis.v202102.CreativeTranscode creativeTranscode) {
        this.creativeTranscode = creativeTranscode;
    }


    /**
     * Gets the samError value for this AdDecisionCreative.
     * 
     * @return samError
     */
    public com.google.api.ads.admanager.axis.v202102.SamError getSamError() {
        return samError;
    }


    /**
     * Sets the samError value for this AdDecisionCreative.
     * 
     * @param samError
     */
    public void setSamError(com.google.api.ads.admanager.axis.v202102.SamError samError) {
        this.samError = samError;
    }


    /**
     * Gets the isTranscoded value for this AdDecisionCreative.
     * 
     * @return isTranscoded
     */
    public java.lang.Boolean getIsTranscoded() {
        return isTranscoded;
    }


    /**
     * Sets the isTranscoded value for this AdDecisionCreative.
     * 
     * @param isTranscoded
     */
    public void setIsTranscoded(java.lang.Boolean isTranscoded) {
        this.isTranscoded = isTranscoded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdDecisionCreative)) return false;
        AdDecisionCreative other = (AdDecisionCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.slateDurationMills==null && other.getSlateDurationMills()==null) || 
             (this.slateDurationMills!=null &&
              this.slateDurationMills.equals(other.getSlateDurationMills()))) &&
            ((this.creativeDurationMills==null && other.getCreativeDurationMills()==null) || 
             (this.creativeDurationMills!=null &&
              this.creativeDurationMills.equals(other.getCreativeDurationMills()))) &&
            ((this.creativeTranscode==null && other.getCreativeTranscode()==null) || 
             (this.creativeTranscode!=null &&
              this.creativeTranscode.equals(other.getCreativeTranscode()))) &&
            ((this.samError==null && other.getSamError()==null) || 
             (this.samError!=null &&
              this.samError.equals(other.getSamError()))) &&
            ((this.isTranscoded==null && other.getIsTranscoded()==null) || 
             (this.isTranscoded!=null &&
              this.isTranscoded.equals(other.getIsTranscoded())));
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
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getSlateDurationMills() != null) {
            _hashCode += getSlateDurationMills().hashCode();
        }
        if (getCreativeDurationMills() != null) {
            _hashCode += getCreativeDurationMills().hashCode();
        }
        if (getCreativeTranscode() != null) {
            _hashCode += getCreativeTranscode().hashCode();
        }
        if (getSamError() != null) {
            _hashCode += getSamError().hashCode();
        }
        if (getIsTranscoded() != null) {
            _hashCode += getIsTranscoded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdDecisionCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "AdDecisionCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slateDurationMills");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "slateDurationMills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeDurationMills");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "creativeDurationMills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeTranscode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "creativeTranscode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "CreativeTranscode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "samError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "SamError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTranscoded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202102", "isTranscoded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
