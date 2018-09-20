// Copyright 2018 Google LLC
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
 * CustomAffinityToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.rm;


/**
 * A token of custom affinity audience. A token can be a keyword or
 * placement. It is immutable, that
 *             is, it can only be created or removed but not changed.
 */
public class CustomAffinityToken  implements java.io.Serializable {
    /* CustomAffinityId can be a dummy value when token is ADDed together
     * with CustomAffinity.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long customAffinityId;

    /* The ID of this custom affinity token. In REMOVE operation,
     * this field or [type, parameter]
     *                 pair is required.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long customAffinityTokenId;

    /* The type of custom affinity token, KEYWORD or URL.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.rm.CustomAffinityTokenTokenType tokenType;

    /* Keyword when token type is KEYWORD or URL string when token
     * type is URL.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span> */
    private java.lang.String parameter;

    public CustomAffinityToken() {
    }

    public CustomAffinityToken(
           java.lang.Long customAffinityId,
           java.lang.Long customAffinityTokenId,
           com.google.api.ads.adwords.axis.v201809.rm.CustomAffinityTokenTokenType tokenType,
           java.lang.String parameter) {
           this.customAffinityId = customAffinityId;
           this.customAffinityTokenId = customAffinityTokenId;
           this.tokenType = tokenType;
           this.parameter = parameter;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customAffinityId", getCustomAffinityId())
            .add("customAffinityTokenId", getCustomAffinityTokenId())
            .add("parameter", getParameter())
            .add("tokenType", getTokenType())
            .toString();
    }

    /**
     * Gets the customAffinityId value for this CustomAffinityToken.
     * 
     * @return customAffinityId   * CustomAffinityId can be a dummy value when token is ADDed together
     * with CustomAffinity.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getCustomAffinityId() {
        return customAffinityId;
    }


    /**
     * Sets the customAffinityId value for this CustomAffinityToken.
     * 
     * @param customAffinityId   * CustomAffinityId can be a dummy value when token is ADDed together
     * with CustomAffinity.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCustomAffinityId(java.lang.Long customAffinityId) {
        this.customAffinityId = customAffinityId;
    }


    /**
     * Gets the customAffinityTokenId value for this CustomAffinityToken.
     * 
     * @return customAffinityTokenId   * The ID of this custom affinity token. In REMOVE operation,
     * this field or [type, parameter]
     *                 pair is required.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getCustomAffinityTokenId() {
        return customAffinityTokenId;
    }


    /**
     * Sets the customAffinityTokenId value for this CustomAffinityToken.
     * 
     * @param customAffinityTokenId   * The ID of this custom affinity token. In REMOVE operation,
     * this field or [type, parameter]
     *                 pair is required.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setCustomAffinityTokenId(java.lang.Long customAffinityTokenId) {
        this.customAffinityTokenId = customAffinityTokenId;
    }


    /**
     * Gets the tokenType value for this CustomAffinityToken.
     * 
     * @return tokenType   * The type of custom affinity token, KEYWORD or URL.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.rm.CustomAffinityTokenTokenType getTokenType() {
        return tokenType;
    }


    /**
     * Sets the tokenType value for this CustomAffinityToken.
     * 
     * @param tokenType   * The type of custom affinity token, KEYWORD or URL.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setTokenType(com.google.api.ads.adwords.axis.v201809.rm.CustomAffinityTokenTokenType tokenType) {
        this.tokenType = tokenType;
    }


    /**
     * Gets the parameter value for this CustomAffinityToken.
     * 
     * @return parameter   * Keyword when token type is KEYWORD or URL string when token
     * type is URL.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public java.lang.String getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this CustomAffinityToken.
     * 
     * @param parameter   * Keyword when token type is KEYWORD or URL string when token
     * type is URL.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty, (trimmed).</span>
     */
    public void setParameter(java.lang.String parameter) {
        this.parameter = parameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomAffinityToken)) return false;
        CustomAffinityToken other = (CustomAffinityToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customAffinityId==null && other.getCustomAffinityId()==null) || 
             (this.customAffinityId!=null &&
              this.customAffinityId.equals(other.getCustomAffinityId()))) &&
            ((this.customAffinityTokenId==null && other.getCustomAffinityTokenId()==null) || 
             (this.customAffinityTokenId!=null &&
              this.customAffinityTokenId.equals(other.getCustomAffinityTokenId()))) &&
            ((this.tokenType==null && other.getTokenType()==null) || 
             (this.tokenType!=null &&
              this.tokenType.equals(other.getTokenType()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter())));
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
        if (getCustomAffinityId() != null) {
            _hashCode += getCustomAffinityId().hashCode();
        }
        if (getCustomAffinityTokenId() != null) {
            _hashCode += getCustomAffinityTokenId().hashCode();
        }
        if (getTokenType() != null) {
            _hashCode += getTokenType().hashCode();
        }
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomAffinityToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201809", "CustomAffinityToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAffinityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201809", "customAffinityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAffinityTokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201809", "customAffinityTokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201809", "tokenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201809", "CustomAffinityToken.TokenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201809", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
