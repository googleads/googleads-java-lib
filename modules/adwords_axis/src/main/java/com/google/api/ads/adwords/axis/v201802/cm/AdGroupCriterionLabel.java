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
 * AdGroupCriterionLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Manages the labels associated with an AdGroupCriterion.
 */
public class AdGroupCriterionLabel  implements java.io.Serializable {
    /* The id of the adgroup containing the criterion that the label
     * is applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span> */
    private java.lang.Long adGroupId;

    /* The id of the criterion that the label is applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span> */
    private java.lang.Long criterionId;

    /* The id of an existing label to be applied to the adgroup criterion.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span> */
    private java.lang.Long labelId;

    public AdGroupCriterionLabel() {
    }

    public AdGroupCriterionLabel(
           java.lang.Long adGroupId,
           java.lang.Long criterionId,
           java.lang.Long labelId) {
           this.adGroupId = adGroupId;
           this.criterionId = criterionId;
           this.labelId = labelId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("criterionId", getCriterionId())
            .add("labelId", getLabelId())
            .toString();
    }

    /**
     * Gets the adGroupId value for this AdGroupCriterionLabel.
     * 
     * @return adGroupId   * The id of the adgroup containing the criterion that the label
     * is applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupCriterionLabel.
     * 
     * @param adGroupId   * The id of the adgroup containing the criterion that the label
     * is applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the criterionId value for this AdGroupCriterionLabel.
     * 
     * @return criterionId   * The id of the criterion that the label is applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public java.lang.Long getCriterionId() {
        return criterionId;
    }


    /**
     * Sets the criterionId value for this AdGroupCriterionLabel.
     * 
     * @param criterionId   * The id of the criterion that the label is applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public void setCriterionId(java.lang.Long criterionId) {
        this.criterionId = criterionId;
    }


    /**
     * Gets the labelId value for this AdGroupCriterionLabel.
     * 
     * @return labelId   * The id of an existing label to be applied to the adgroup criterion.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span>
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this AdGroupCriterionLabel.
     * 
     * @param labelId   * The id of an existing label to be applied to the adgroup criterion.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span>
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupCriterionLabel)) return false;
        AdGroupCriterionLabel other = (AdGroupCriterionLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.criterionId==null && other.getCriterionId()==null) || 
             (this.criterionId!=null &&
              this.criterionId.equals(other.getCriterionId()))) &&
            ((this.labelId==null && other.getLabelId()==null) || 
             (this.labelId!=null &&
              this.labelId.equals(other.getLabelId())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCriterionId() != null) {
            _hashCode += getCriterionId().hashCode();
        }
        if (getLabelId() != null) {
            _hashCode += getLabelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupCriterionLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "labelId"));
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
