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
 * PolicyViolationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents violations of a single policy by some text in a field.
 * 
 *             Violations of a single policy by the same string in multiple
 * places
 *             within a field is reported in one instance of this class
 * and only one
 *             exemption needs to be filed.
 *             Violations of a single policy by two different strings
 * is reported
 *             as two separate instances of this class.
 *             
 *             e.g. If 'ACME' violates 'capitalization' and occurs twice
 * in a text ad it
 *             would be represented by one instance. If the ad also contains
 * 'INC' which
 *             also violates 'capitalization' it would be represented
 * in a separate
 *             instance.
 */
public class PolicyViolationError  extends com.google.api.ads.adwords.axis.v201802.cm.ApiError  implements java.io.Serializable {
    /* Unique identifier for the violation. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationKey key;

    /* Name of policy suitable for display to users. In the user's
     * preferred
     *                     language. */
    private java.lang.String externalPolicyName;

    /* Url with writeup about the policy. */
    private java.lang.String externalPolicyUrl;

    /* Localized description of the violation. */
    private java.lang.String externalPolicyDescription;

    /* Whether user can file an exemption request for this violation. */
    private java.lang.Boolean isExemptable;

    /* Lists the parts that violate the policy. */
    private com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart[] violatingParts;

    public PolicyViolationError() {
    }

    public PolicyViolationError(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationKey key,
           java.lang.String externalPolicyName,
           java.lang.String externalPolicyUrl,
           java.lang.String externalPolicyDescription,
           java.lang.Boolean isExemptable,
           com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart[] violatingParts) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.key = key;
        this.externalPolicyName = externalPolicyName;
        this.externalPolicyUrl = externalPolicyUrl;
        this.externalPolicyDescription = externalPolicyDescription;
        this.isExemptable = isExemptable;
        this.violatingParts = violatingParts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("apiErrorType", getApiErrorType())
            .add("errorString", getErrorString())
            .add("externalPolicyDescription", getExternalPolicyDescription())
            .add("externalPolicyName", getExternalPolicyName())
            .add("externalPolicyUrl", getExternalPolicyUrl())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("isExemptable", getIsExemptable())
            .add("key", getKey())
            .add("trigger", getTrigger())
            .add("violatingParts", getViolatingParts())
            .toString();
    }

    /**
     * Gets the key value for this PolicyViolationError.
     * 
     * @return key   * Unique identifier for the violation.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this PolicyViolationError.
     * 
     * @param key   * Unique identifier for the violation.
     */
    public void setKey(com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationKey key) {
        this.key = key;
    }


    /**
     * Gets the externalPolicyName value for this PolicyViolationError.
     * 
     * @return externalPolicyName   * Name of policy suitable for display to users. In the user's
     * preferred
     *                     language.
     */
    public java.lang.String getExternalPolicyName() {
        return externalPolicyName;
    }


    /**
     * Sets the externalPolicyName value for this PolicyViolationError.
     * 
     * @param externalPolicyName   * Name of policy suitable for display to users. In the user's
     * preferred
     *                     language.
     */
    public void setExternalPolicyName(java.lang.String externalPolicyName) {
        this.externalPolicyName = externalPolicyName;
    }


    /**
     * Gets the externalPolicyUrl value for this PolicyViolationError.
     * 
     * @return externalPolicyUrl   * Url with writeup about the policy.
     */
    public java.lang.String getExternalPolicyUrl() {
        return externalPolicyUrl;
    }


    /**
     * Sets the externalPolicyUrl value for this PolicyViolationError.
     * 
     * @param externalPolicyUrl   * Url with writeup about the policy.
     */
    public void setExternalPolicyUrl(java.lang.String externalPolicyUrl) {
        this.externalPolicyUrl = externalPolicyUrl;
    }


    /**
     * Gets the externalPolicyDescription value for this PolicyViolationError.
     * 
     * @return externalPolicyDescription   * Localized description of the violation.
     */
    public java.lang.String getExternalPolicyDescription() {
        return externalPolicyDescription;
    }


    /**
     * Sets the externalPolicyDescription value for this PolicyViolationError.
     * 
     * @param externalPolicyDescription   * Localized description of the violation.
     */
    public void setExternalPolicyDescription(java.lang.String externalPolicyDescription) {
        this.externalPolicyDescription = externalPolicyDescription;
    }


    /**
     * Gets the isExemptable value for this PolicyViolationError.
     * 
     * @return isExemptable   * Whether user can file an exemption request for this violation.
     */
    public java.lang.Boolean getIsExemptable() {
        return isExemptable;
    }


    /**
     * Sets the isExemptable value for this PolicyViolationError.
     * 
     * @param isExemptable   * Whether user can file an exemption request for this violation.
     */
    public void setIsExemptable(java.lang.Boolean isExemptable) {
        this.isExemptable = isExemptable;
    }


    /**
     * Gets the violatingParts value for this PolicyViolationError.
     * 
     * @return violatingParts   * Lists the parts that violate the policy.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart[] getViolatingParts() {
        return violatingParts;
    }


    /**
     * Sets the violatingParts value for this PolicyViolationError.
     * 
     * @param violatingParts   * Lists the parts that violate the policy.
     */
    public void setViolatingParts(com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart[] violatingParts) {
        this.violatingParts = violatingParts;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart getViolatingParts(int i) {
        return this.violatingParts[i];
    }

    public void setViolatingParts(int i, com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart _value) {
        this.violatingParts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyViolationError)) return false;
        PolicyViolationError other = (PolicyViolationError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.externalPolicyName==null && other.getExternalPolicyName()==null) || 
             (this.externalPolicyName!=null &&
              this.externalPolicyName.equals(other.getExternalPolicyName()))) &&
            ((this.externalPolicyUrl==null && other.getExternalPolicyUrl()==null) || 
             (this.externalPolicyUrl!=null &&
              this.externalPolicyUrl.equals(other.getExternalPolicyUrl()))) &&
            ((this.externalPolicyDescription==null && other.getExternalPolicyDescription()==null) || 
             (this.externalPolicyDescription!=null &&
              this.externalPolicyDescription.equals(other.getExternalPolicyDescription()))) &&
            ((this.isExemptable==null && other.getIsExemptable()==null) || 
             (this.isExemptable!=null &&
              this.isExemptable.equals(other.getIsExemptable()))) &&
            ((this.violatingParts==null && other.getViolatingParts()==null) || 
             (this.violatingParts!=null &&
              java.util.Arrays.equals(this.violatingParts, other.getViolatingParts())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getExternalPolicyName() != null) {
            _hashCode += getExternalPolicyName().hashCode();
        }
        if (getExternalPolicyUrl() != null) {
            _hashCode += getExternalPolicyUrl().hashCode();
        }
        if (getExternalPolicyDescription() != null) {
            _hashCode += getExternalPolicyDescription().hashCode();
        }
        if (getIsExemptable() != null) {
            _hashCode += getIsExemptable().hashCode();
        }
        if (getViolatingParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViolatingParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViolatingParts(), i);
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
        new org.apache.axis.description.TypeDesc(PolicyViolationError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPolicyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "externalPolicyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPolicyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "externalPolicyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPolicyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "externalPolicyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExemptable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isExemptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatingParts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "violatingParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationError.Part"));
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
