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
 * MediaLocationSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Configuration that associates a media location with a security
 * policy and the authentication
 *             credentials needed to access the content.
 */
public class MediaLocationSettings  implements java.io.Serializable {
    /* The name of the media location. This value is read-only and
     * is assigned by Google. */
    private java.lang.String name;

    /* The url prefix of the media location. This value is required
     * for a valid media location. */
    private java.lang.String urlPrefix;

    /* The security policy and authentication credentials needed to
     * access the content in this media
     *                 location. This value is required for a valid media
     * location. */
    private com.google.api.ads.dfp.axis.v201802.SecurityPolicySettings securityPolicy;

    public MediaLocationSettings() {
    }

    public MediaLocationSettings(
           java.lang.String name,
           java.lang.String urlPrefix,
           com.google.api.ads.dfp.axis.v201802.SecurityPolicySettings securityPolicy) {
           this.name = name;
           this.urlPrefix = urlPrefix;
           this.securityPolicy = securityPolicy;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("name", getName())
            .add("securityPolicy", getSecurityPolicy())
            .add("urlPrefix", getUrlPrefix())
            .toString();
    }

    /**
     * Gets the name value for this MediaLocationSettings.
     * 
     * @return name   * The name of the media location. This value is read-only and
     * is assigned by Google.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MediaLocationSettings.
     * 
     * @param name   * The name of the media location. This value is read-only and
     * is assigned by Google.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the urlPrefix value for this MediaLocationSettings.
     * 
     * @return urlPrefix   * The url prefix of the media location. This value is required
     * for a valid media location.
     */
    public java.lang.String getUrlPrefix() {
        return urlPrefix;
    }


    /**
     * Sets the urlPrefix value for this MediaLocationSettings.
     * 
     * @param urlPrefix   * The url prefix of the media location. This value is required
     * for a valid media location.
     */
    public void setUrlPrefix(java.lang.String urlPrefix) {
        this.urlPrefix = urlPrefix;
    }


    /**
     * Gets the securityPolicy value for this MediaLocationSettings.
     * 
     * @return securityPolicy   * The security policy and authentication credentials needed to
     * access the content in this media
     *                 location. This value is required for a valid media
     * location.
     */
    public com.google.api.ads.dfp.axis.v201802.SecurityPolicySettings getSecurityPolicy() {
        return securityPolicy;
    }


    /**
     * Sets the securityPolicy value for this MediaLocationSettings.
     * 
     * @param securityPolicy   * The security policy and authentication credentials needed to
     * access the content in this media
     *                 location. This value is required for a valid media
     * location.
     */
    public void setSecurityPolicy(com.google.api.ads.dfp.axis.v201802.SecurityPolicySettings securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaLocationSettings)) return false;
        MediaLocationSettings other = (MediaLocationSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.urlPrefix==null && other.getUrlPrefix()==null) || 
             (this.urlPrefix!=null &&
              this.urlPrefix.equals(other.getUrlPrefix()))) &&
            ((this.securityPolicy==null && other.getSecurityPolicy()==null) || 
             (this.securityPolicy!=null &&
              this.securityPolicy.equals(other.getSecurityPolicy())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUrlPrefix() != null) {
            _hashCode += getUrlPrefix().hashCode();
        }
        if (getSecurityPolicy() != null) {
            _hashCode += getSecurityPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MediaLocationSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MediaLocationSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "urlPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "securityPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SecurityPolicySettings"));
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
