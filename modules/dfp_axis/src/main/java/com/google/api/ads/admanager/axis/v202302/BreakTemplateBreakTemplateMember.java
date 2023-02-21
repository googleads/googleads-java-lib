// Copyright 2023 Google LLC
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
 * BreakTemplateBreakTemplateMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202302;


/**
 * A building block of a pod template.
 */
public class BreakTemplateBreakTemplateMember  implements java.io.Serializable {
    /* The ID of the {@link AdSpot} that has the settings about what
     * kinds of ads can appear in this
     *                 position of the {@link BreakTemplate}. */
    private java.lang.Long adSpotId;

    /* The behavior for how the {@link AdSpot} should be filled in
     * the context of the {@link
     *                 BreakTemplate}. */
    private com.google.api.ads.admanager.axis.v202302.AdSpotFillType adSpotFillType;

    public BreakTemplateBreakTemplateMember() {
    }

    public BreakTemplateBreakTemplateMember(
           java.lang.Long adSpotId,
           com.google.api.ads.admanager.axis.v202302.AdSpotFillType adSpotFillType) {
           this.adSpotId = adSpotId;
           this.adSpotFillType = adSpotFillType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adSpotFillType", getAdSpotFillType())
            .add("adSpotId", getAdSpotId())
            .toString();
    }

    /**
     * Gets the adSpotId value for this BreakTemplateBreakTemplateMember.
     * 
     * @return adSpotId   * The ID of the {@link AdSpot} that has the settings about what
     * kinds of ads can appear in this
     *                 position of the {@link BreakTemplate}.
     */
    public java.lang.Long getAdSpotId() {
        return adSpotId;
    }


    /**
     * Sets the adSpotId value for this BreakTemplateBreakTemplateMember.
     * 
     * @param adSpotId   * The ID of the {@link AdSpot} that has the settings about what
     * kinds of ads can appear in this
     *                 position of the {@link BreakTemplate}.
     */
    public void setAdSpotId(java.lang.Long adSpotId) {
        this.adSpotId = adSpotId;
    }


    /**
     * Gets the adSpotFillType value for this BreakTemplateBreakTemplateMember.
     * 
     * @return adSpotFillType   * The behavior for how the {@link AdSpot} should be filled in
     * the context of the {@link
     *                 BreakTemplate}.
     */
    public com.google.api.ads.admanager.axis.v202302.AdSpotFillType getAdSpotFillType() {
        return adSpotFillType;
    }


    /**
     * Sets the adSpotFillType value for this BreakTemplateBreakTemplateMember.
     * 
     * @param adSpotFillType   * The behavior for how the {@link AdSpot} should be filled in
     * the context of the {@link
     *                 BreakTemplate}.
     */
    public void setAdSpotFillType(com.google.api.ads.admanager.axis.v202302.AdSpotFillType adSpotFillType) {
        this.adSpotFillType = adSpotFillType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BreakTemplateBreakTemplateMember)) return false;
        BreakTemplateBreakTemplateMember other = (BreakTemplateBreakTemplateMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adSpotId==null && other.getAdSpotId()==null) || 
             (this.adSpotId!=null &&
              this.adSpotId.equals(other.getAdSpotId()))) &&
            ((this.adSpotFillType==null && other.getAdSpotFillType()==null) || 
             (this.adSpotFillType!=null &&
              this.adSpotFillType.equals(other.getAdSpotFillType())));
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
        if (getAdSpotId() != null) {
            _hashCode += getAdSpotId().hashCode();
        }
        if (getAdSpotFillType() != null) {
            _hashCode += getAdSpotFillType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BreakTemplateBreakTemplateMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "BreakTemplate.BreakTemplateMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSpotId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "adSpotId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSpotFillType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "adSpotFillType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202302", "AdSpotFillType"));
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
