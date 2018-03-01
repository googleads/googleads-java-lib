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
 * ConversionOptimizerEligibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Eligibility data for Campaign to transition to Conversion Optimizer
 */
public class ConversionOptimizerEligibility  implements java.io.Serializable {
    /* If the campaign is eligible to enter conversion optimizer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean eligible;

    /* Reason why a campaign would be rejected for conversion optimizer.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason[] rejectionReasons;

    public ConversionOptimizerEligibility() {
    }

    public ConversionOptimizerEligibility(
           java.lang.Boolean eligible,
           com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason[] rejectionReasons) {
           this.eligible = eligible;
           this.rejectionReasons = rejectionReasons;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("eligible", getEligible())
            .add("rejectionReasons", getRejectionReasons())
            .toString();
    }

    /**
     * Gets the eligible value for this ConversionOptimizerEligibility.
     * 
     * @return eligible   * If the campaign is eligible to enter conversion optimizer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getEligible() {
        return eligible;
    }


    /**
     * Sets the eligible value for this ConversionOptimizerEligibility.
     * 
     * @param eligible   * If the campaign is eligible to enter conversion optimizer.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setEligible(java.lang.Boolean eligible) {
        this.eligible = eligible;
    }


    /**
     * Gets the rejectionReasons value for this ConversionOptimizerEligibility.
     * 
     * @return rejectionReasons   * Reason why a campaign would be rejected for conversion optimizer.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason[] getRejectionReasons() {
        return rejectionReasons;
    }


    /**
     * Sets the rejectionReasons value for this ConversionOptimizerEligibility.
     * 
     * @param rejectionReasons   * Reason why a campaign would be rejected for conversion optimizer.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setRejectionReasons(com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason[] rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason getRejectionReasons(int i) {
        return this.rejectionReasons[i];
    }

    public void setRejectionReasons(int i, com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason _value) {
        this.rejectionReasons[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionOptimizerEligibility)) return false;
        ConversionOptimizerEligibility other = (ConversionOptimizerEligibility) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eligible==null && other.getEligible()==null) || 
             (this.eligible!=null &&
              this.eligible.equals(other.getEligible()))) &&
            ((this.rejectionReasons==null && other.getRejectionReasons()==null) || 
             (this.rejectionReasons!=null &&
              java.util.Arrays.equals(this.rejectionReasons, other.getRejectionReasons())));
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
        if (getEligible() != null) {
            _hashCode += getEligible().hashCode();
        }
        if (getRejectionReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRejectionReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRejectionReasons(), i);
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
        new org.apache.axis.description.TypeDesc(ConversionOptimizerEligibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionOptimizerEligibility"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "eligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rejectionReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionOptimizerEligibility.RejectionReason"));
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
