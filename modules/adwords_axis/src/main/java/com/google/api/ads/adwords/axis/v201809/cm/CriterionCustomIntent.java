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
 * CriterionCustomIntent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * A Custom Intent criterion.
 *             <p>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class CriterionCustomIntent  extends com.google.api.ads.adwords.axis.v201809.cm.Criterion  implements java.io.Serializable {
    /* ID of the custom intent.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 1.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Long customIntentId;

    public CriterionCustomIntent() {
    }

    public CriterionCustomIntent(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201809.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.Long customIntentId) {
        super(
            id,
            type,
            criterionType);
        this.customIntentId = customIntentId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("customIntentId", getCustomIntentId())
            .add("id", getId())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the customIntentId value for this CriterionCustomIntent.
     * 
     * @return customIntentId   * ID of the custom intent.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 1.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Long getCustomIntentId() {
        return customIntentId;
    }


    /**
     * Sets the customIntentId value for this CriterionCustomIntent.
     * 
     * @param customIntentId   * ID of the custom intent.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 1.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setCustomIntentId(java.lang.Long customIntentId) {
        this.customIntentId = customIntentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriterionCustomIntent)) return false;
        CriterionCustomIntent other = (CriterionCustomIntent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customIntentId==null && other.getCustomIntentId()==null) || 
             (this.customIntentId!=null &&
              this.customIntentId.equals(other.getCustomIntentId())));
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
        if (getCustomIntentId() != null) {
            _hashCode += getCustomIntentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriterionCustomIntent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionCustomIntent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customIntentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "customIntentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
