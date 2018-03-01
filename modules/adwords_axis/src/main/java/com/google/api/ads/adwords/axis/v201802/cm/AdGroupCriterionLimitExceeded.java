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
 * AdGroupCriterionLimitExceeded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Signals that too many criteria were added to some ad group.
 */
public class AdGroupCriterionLimitExceeded  extends com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceeded  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLimitExceededCriteriaLimitType limitType;

    public AdGroupCriterionLimitExceeded() {
    }

    public AdGroupCriterionLimitExceeded(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceededReason reason,
           java.lang.String enclosingId,
           java.lang.Integer limit,
           java.lang.String accountLimitType,
           java.lang.Integer existingCount,
           com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLimitExceededCriteriaLimitType limitType) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType,
            reason,
            enclosingId,
            limit,
            accountLimitType,
            existingCount);
        this.limitType = limitType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accountLimitType", getAccountLimitType())
            .add("apiErrorType", getApiErrorType())
            .add("enclosingId", getEnclosingId())
            .add("errorString", getErrorString())
            .add("existingCount", getExistingCount())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("limit", getLimit())
            .add("limitType", getLimitType())
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the limitType value for this AdGroupCriterionLimitExceeded.
     * 
     * @return limitType
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLimitExceededCriteriaLimitType getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this AdGroupCriterionLimitExceeded.
     * 
     * @param limitType
     */
    public void setLimitType(com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLimitExceededCriteriaLimitType limitType) {
        this.limitType = limitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupCriterionLimitExceeded)) return false;
        AdGroupCriterionLimitExceeded other = (AdGroupCriterionLimitExceeded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType())));
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
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupCriterionLimitExceeded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLimitExceeded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLimitExceeded.CriteriaLimitType"));
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
