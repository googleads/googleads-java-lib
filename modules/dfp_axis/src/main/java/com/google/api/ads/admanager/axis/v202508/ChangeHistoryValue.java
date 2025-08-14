// Copyright 2025 Google LLC
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
 * ChangeHistoryValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;


/**
 * This class is unused. It exists only to provide reference documentation
 * of the possible values
 *             for {@link ChangeHistoryEntityType type} and {@link ChangeHistoryOperation}.
 */
public class ChangeHistoryValue  extends com.google.api.ads.admanager.axis.v202508.ObjectValue  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202508.ChangeHistoryEntityType entityType;

    private com.google.api.ads.admanager.axis.v202508.ChangeHistoryOperation operation;

    public ChangeHistoryValue() {
    }

    public ChangeHistoryValue(
           com.google.api.ads.admanager.axis.v202508.ChangeHistoryEntityType entityType,
           com.google.api.ads.admanager.axis.v202508.ChangeHistoryOperation operation) {
        this.entityType = entityType;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("entityType", getEntityType())
            .add("operation", getOperation())
            .toString();
    }

    /**
     * Gets the entityType value for this ChangeHistoryValue.
     * 
     * @return entityType
     */
    public com.google.api.ads.admanager.axis.v202508.ChangeHistoryEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this ChangeHistoryValue.
     * 
     * @param entityType
     */
    public void setEntityType(com.google.api.ads.admanager.axis.v202508.ChangeHistoryEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the operation value for this ChangeHistoryValue.
     * 
     * @return operation
     */
    public com.google.api.ads.admanager.axis.v202508.ChangeHistoryOperation getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this ChangeHistoryValue.
     * 
     * @param operation
     */
    public void setOperation(com.google.api.ads.admanager.axis.v202508.ChangeHistoryOperation operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeHistoryValue)) return false;
        ChangeHistoryValue other = (ChangeHistoryValue) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeHistoryValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ChangeHistoryValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ChangeHistoryEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ChangeHistoryOperation"));
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
