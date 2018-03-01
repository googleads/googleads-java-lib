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
 * EntityCountLimitExceeded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Signals that an entity count limit was exceeded for some level.
 * For example, too many criteria for a campaign.
 */
public class EntityCountLimitExceeded  extends com.google.api.ads.adwords.axis.v201802.cm.ApiError  implements java.io.Serializable {
    /* Specifies which level's limit was exceeded. */
    private com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceededReason reason;

    /* Id of the entity whose limit was exceeded. */
    private java.lang.String enclosingId;

    /* The limit which was exceeded. */
    private java.lang.Integer limit;

    /* The account limit type which was exceeded. */
    private java.lang.String accountLimitType;

    /* The count of existing entities. */
    private java.lang.Integer existingCount;

    public EntityCountLimitExceeded() {
    }

    public EntityCountLimitExceeded(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceededReason reason,
           java.lang.String enclosingId,
           java.lang.Integer limit,
           java.lang.String accountLimitType,
           java.lang.Integer existingCount) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.enclosingId = enclosingId;
        this.limit = limit;
        this.accountLimitType = accountLimitType;
        this.existingCount = existingCount;
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
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the reason value for this EntityCountLimitExceeded.
     * 
     * @return reason   * Specifies which level's limit was exceeded.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceededReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this EntityCountLimitExceeded.
     * 
     * @param reason   * Specifies which level's limit was exceeded.
     */
    public void setReason(com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceededReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the enclosingId value for this EntityCountLimitExceeded.
     * 
     * @return enclosingId   * Id of the entity whose limit was exceeded.
     */
    public java.lang.String getEnclosingId() {
        return enclosingId;
    }


    /**
     * Sets the enclosingId value for this EntityCountLimitExceeded.
     * 
     * @param enclosingId   * Id of the entity whose limit was exceeded.
     */
    public void setEnclosingId(java.lang.String enclosingId) {
        this.enclosingId = enclosingId;
    }


    /**
     * Gets the limit value for this EntityCountLimitExceeded.
     * 
     * @return limit   * The limit which was exceeded.
     */
    public java.lang.Integer getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this EntityCountLimitExceeded.
     * 
     * @param limit   * The limit which was exceeded.
     */
    public void setLimit(java.lang.Integer limit) {
        this.limit = limit;
    }


    /**
     * Gets the accountLimitType value for this EntityCountLimitExceeded.
     * 
     * @return accountLimitType   * The account limit type which was exceeded.
     */
    public java.lang.String getAccountLimitType() {
        return accountLimitType;
    }


    /**
     * Sets the accountLimitType value for this EntityCountLimitExceeded.
     * 
     * @param accountLimitType   * The account limit type which was exceeded.
     */
    public void setAccountLimitType(java.lang.String accountLimitType) {
        this.accountLimitType = accountLimitType;
    }


    /**
     * Gets the existingCount value for this EntityCountLimitExceeded.
     * 
     * @return existingCount   * The count of existing entities.
     */
    public java.lang.Integer getExistingCount() {
        return existingCount;
    }


    /**
     * Sets the existingCount value for this EntityCountLimitExceeded.
     * 
     * @param existingCount   * The count of existing entities.
     */
    public void setExistingCount(java.lang.Integer existingCount) {
        this.existingCount = existingCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityCountLimitExceeded)) return false;
        EntityCountLimitExceeded other = (EntityCountLimitExceeded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.enclosingId==null && other.getEnclosingId()==null) || 
             (this.enclosingId!=null &&
              this.enclosingId.equals(other.getEnclosingId()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.accountLimitType==null && other.getAccountLimitType()==null) || 
             (this.accountLimitType!=null &&
              this.accountLimitType.equals(other.getAccountLimitType()))) &&
            ((this.existingCount==null && other.getExistingCount()==null) || 
             (this.existingCount!=null &&
              this.existingCount.equals(other.getExistingCount())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getEnclosingId() != null) {
            _hashCode += getEnclosingId().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getAccountLimitType() != null) {
            _hashCode += getAccountLimitType().hashCode();
        }
        if (getExistingCount() != null) {
            _hashCode += getExistingCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityCountLimitExceeded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityCountLimitExceeded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityCountLimitExceeded.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enclosingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "enclosingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountLimitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "accountLimitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "existingCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
