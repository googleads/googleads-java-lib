/**
 * TargetingGroupKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * A SegmentKey for segmenting by TargetingGroup.
 */
public class TargetingGroupKey  implements java.io.Serializable {
    private java.lang.Long targetingGroupId;

    private java.lang.String targetingGroupName;

    public TargetingGroupKey() {
    }

    public TargetingGroupKey(
           java.lang.Long targetingGroupId,
           java.lang.String targetingGroupName) {
           this.targetingGroupId = targetingGroupId;
           this.targetingGroupName = targetingGroupName;
    }


    /**
     * Gets the targetingGroupId value for this TargetingGroupKey.
     * 
     * @return targetingGroupId
     */
    public java.lang.Long getTargetingGroupId() {
        return targetingGroupId;
    }


    /**
     * Sets the targetingGroupId value for this TargetingGroupKey.
     * 
     * @param targetingGroupId
     */
    public void setTargetingGroupId(java.lang.Long targetingGroupId) {
        this.targetingGroupId = targetingGroupId;
    }


    /**
     * Gets the targetingGroupName value for this TargetingGroupKey.
     * 
     * @return targetingGroupName
     */
    public java.lang.String getTargetingGroupName() {
        return targetingGroupName;
    }


    /**
     * Sets the targetingGroupName value for this TargetingGroupKey.
     * 
     * @param targetingGroupName
     */
    public void setTargetingGroupName(java.lang.String targetingGroupName) {
        this.targetingGroupName = targetingGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingGroupKey)) return false;
        TargetingGroupKey other = (TargetingGroupKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingGroupId==null && other.getTargetingGroupId()==null) || 
             (this.targetingGroupId!=null &&
              this.targetingGroupId.equals(other.getTargetingGroupId()))) &&
            ((this.targetingGroupName==null && other.getTargetingGroupName()==null) || 
             (this.targetingGroupName!=null &&
              this.targetingGroupName.equals(other.getTargetingGroupName())));
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
        if (getTargetingGroupId() != null) {
            _hashCode += getTargetingGroupId().hashCode();
        }
        if (getTargetingGroupName() != null) {
            _hashCode += getTargetingGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingGroupKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "targetingGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "targetingGroupName"));
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
