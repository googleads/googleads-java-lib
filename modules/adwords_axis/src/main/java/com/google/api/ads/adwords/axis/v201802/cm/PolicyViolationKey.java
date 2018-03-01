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
 * PolicyViolationKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Key of the violation. The key is used for referring to a violation
 * when
 *             filing an exemption request.
 */
public class PolicyViolationKey  implements java.io.Serializable {
    /* Unique id of the violated policy.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String policyName;

    /* The text that violates the policy if specified. Otherwise,
     * refers to the
     *                 policy in general (e.g. when requesting to be exempt
     * from the whole
     *                 policy).
     *                 
     *                 May be null for criterion exemptions, in which case
     * this refers to the
     *                 whole policy. Must be specified for ad exemptions. */
    private java.lang.String violatingText;

    public PolicyViolationKey() {
    }

    public PolicyViolationKey(
           java.lang.String policyName,
           java.lang.String violatingText) {
           this.policyName = policyName;
           this.violatingText = violatingText;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("policyName", getPolicyName())
            .add("violatingText", getViolatingText())
            .toString();
    }

    /**
     * Gets the policyName value for this PolicyViolationKey.
     * 
     * @return policyName   * Unique id of the violated policy.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getPolicyName() {
        return policyName;
    }


    /**
     * Sets the policyName value for this PolicyViolationKey.
     * 
     * @param policyName   * Unique id of the violated policy.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setPolicyName(java.lang.String policyName) {
        this.policyName = policyName;
    }


    /**
     * Gets the violatingText value for this PolicyViolationKey.
     * 
     * @return violatingText   * The text that violates the policy if specified. Otherwise,
     * refers to the
     *                 policy in general (e.g. when requesting to be exempt
     * from the whole
     *                 policy).
     *                 
     *                 May be null for criterion exemptions, in which case
     * this refers to the
     *                 whole policy. Must be specified for ad exemptions.
     */
    public java.lang.String getViolatingText() {
        return violatingText;
    }


    /**
     * Sets the violatingText value for this PolicyViolationKey.
     * 
     * @param violatingText   * The text that violates the policy if specified. Otherwise,
     * refers to the
     *                 policy in general (e.g. when requesting to be exempt
     * from the whole
     *                 policy).
     *                 
     *                 May be null for criterion exemptions, in which case
     * this refers to the
     *                 whole policy. Must be specified for ad exemptions.
     */
    public void setViolatingText(java.lang.String violatingText) {
        this.violatingText = violatingText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyViolationKey)) return false;
        PolicyViolationKey other = (PolicyViolationKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyName==null && other.getPolicyName()==null) || 
             (this.policyName!=null &&
              this.policyName.equals(other.getPolicyName()))) &&
            ((this.violatingText==null && other.getViolatingText()==null) || 
             (this.violatingText!=null &&
              this.violatingText.equals(other.getViolatingText())));
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
        if (getPolicyName() != null) {
            _hashCode += getPolicyName().hashCode();
        }
        if (getViolatingText() != null) {
            _hashCode += getViolatingText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyViolationKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "policyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatingText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "violatingText"));
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
