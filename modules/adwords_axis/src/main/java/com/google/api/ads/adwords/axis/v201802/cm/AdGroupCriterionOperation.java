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
 * AdGroupCriterionOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Operation (add, remove and set) on adgroup criteria.
 *             
 *             <p>If you try to ADD a criterion that already exists,
 * it will be treated as a SET operation
 *             on the existing criterion.
 */
public class AdGroupCriterionOperation  extends com.google.api.ads.adwords.axis.v201802.cm.Operation  implements java.io.Serializable {
    /* The adgroup criterion being operated on.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion operand;

    /* List of exemption requests for policy violations flagged by
     * this criterion.
     *                     
     *                     <p>Only set this field when adding criteria that
     * trigger policy violations
     *                     for which you wish to get exemptions for. */
    private com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest[] exemptionRequests;

    public AdGroupCriterionOperation() {
    }

    public AdGroupCriterionOperation(
           com.google.api.ads.adwords.axis.v201802.cm.Operator operator,
           java.lang.String operationType,
           com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion operand,
           com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest[] exemptionRequests) {
        super(
            operator,
            operationType);
        this.operand = operand;
        this.exemptionRequests = exemptionRequests;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("exemptionRequests", getExemptionRequests())
            .add("operand", getOperand())
            .add("operationType", getOperationType())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operand value for this AdGroupCriterionOperation.
     * 
     * @return operand   * The adgroup criterion being operated on.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this AdGroupCriterionOperation.
     * 
     * @param operand   * The adgroup criterion being operated on.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setOperand(com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion operand) {
        this.operand = operand;
    }


    /**
     * Gets the exemptionRequests value for this AdGroupCriterionOperation.
     * 
     * @return exemptionRequests   * List of exemption requests for policy violations flagged by
     * this criterion.
     *                     
     *                     <p>Only set this field when adding criteria that
     * trigger policy violations
     *                     for which you wish to get exemptions for.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest[] getExemptionRequests() {
        return exemptionRequests;
    }


    /**
     * Sets the exemptionRequests value for this AdGroupCriterionOperation.
     * 
     * @param exemptionRequests   * List of exemption requests for policy violations flagged by
     * this criterion.
     *                     
     *                     <p>Only set this field when adding criteria that
     * trigger policy violations
     *                     for which you wish to get exemptions for.
     */
    public void setExemptionRequests(com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest[] exemptionRequests) {
        this.exemptionRequests = exemptionRequests;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest getExemptionRequests(int i) {
        return this.exemptionRequests[i];
    }

    public void setExemptionRequests(int i, com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest _value) {
        this.exemptionRequests[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupCriterionOperation)) return false;
        AdGroupCriterionOperation other = (AdGroupCriterionOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand()))) &&
            ((this.exemptionRequests==null && other.getExemptionRequests()==null) || 
             (this.exemptionRequests!=null &&
              java.util.Arrays.equals(this.exemptionRequests, other.getExemptionRequests())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        if (getExemptionRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptionRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptionRequests(), i);
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
        new org.apache.axis.description.TypeDesc(AdGroupCriterionOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptionRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "exemptionRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExemptionRequest"));
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
