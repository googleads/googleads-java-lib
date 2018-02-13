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
 * OfflineError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An error that occurs for an internal DFP process that happens in
 * the background. For example,
 *             {@link Proposal} workflows can have background tasks that
 * may have offline errors.
 */
public class OfflineError  implements java.io.Serializable {
    /* The OGNL field path to identify cause of error. */
    private java.lang.String fieldPath;

    /* The data that caused the error. */
    private java.lang.String trigger;

    /* The time when this error occurred. */
    private com.google.api.ads.dfp.axis.v201802.DateTime errorTime;

    /* The error reason represented by a string. */
    private java.lang.String reason;

    public OfflineError() {
    }

    public OfflineError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           com.google.api.ads.dfp.axis.v201802.DateTime errorTime,
           java.lang.String reason) {
           this.fieldPath = fieldPath;
           this.trigger = trigger;
           this.errorTime = errorTime;
           this.reason = reason;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("errorTime", getErrorTime())
            .add("fieldPath", getFieldPath())
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the fieldPath value for this OfflineError.
     * 
     * @return fieldPath   * The OGNL field path to identify cause of error.
     */
    public java.lang.String getFieldPath() {
        return fieldPath;
    }


    /**
     * Sets the fieldPath value for this OfflineError.
     * 
     * @param fieldPath   * The OGNL field path to identify cause of error.
     */
    public void setFieldPath(java.lang.String fieldPath) {
        this.fieldPath = fieldPath;
    }


    /**
     * Gets the trigger value for this OfflineError.
     * 
     * @return trigger   * The data that caused the error.
     */
    public java.lang.String getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this OfflineError.
     * 
     * @param trigger   * The data that caused the error.
     */
    public void setTrigger(java.lang.String trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the errorTime value for this OfflineError.
     * 
     * @return errorTime   * The time when this error occurred.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getErrorTime() {
        return errorTime;
    }


    /**
     * Sets the errorTime value for this OfflineError.
     * 
     * @param errorTime   * The time when this error occurred.
     */
    public void setErrorTime(com.google.api.ads.dfp.axis.v201802.DateTime errorTime) {
        this.errorTime = errorTime;
    }


    /**
     * Gets the reason value for this OfflineError.
     * 
     * @return reason   * The error reason represented by a string.
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this OfflineError.
     * 
     * @param reason   * The error reason represented by a string.
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfflineError)) return false;
        OfflineError other = (OfflineError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldPath==null && other.getFieldPath()==null) || 
             (this.fieldPath!=null &&
              this.fieldPath.equals(other.getFieldPath()))) &&
            ((this.trigger==null && other.getTrigger()==null) || 
             (this.trigger!=null &&
              this.trigger.equals(other.getTrigger()))) &&
            ((this.errorTime==null && other.getErrorTime()==null) || 
             (this.errorTime!=null &&
              this.errorTime.equals(other.getErrorTime()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getFieldPath() != null) {
            _hashCode += getFieldPath().hashCode();
        }
        if (getTrigger() != null) {
            _hashCode += getTrigger().hashCode();
        }
        if (getErrorTime() != null) {
            _hashCode += getErrorTime().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfflineError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "OfflineError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fieldPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "errorTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reason"));
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
