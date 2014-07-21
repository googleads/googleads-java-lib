/**
 * ApprovalContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * A key for referencing approval statuses for sub-components of this
 * ad.
 */
public class ApprovalContext  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201406.video.TargetingScope targetingScope;

    private com.google.api.ads.adwords.axis.v201406.video.DestinationType destinationType;

    public ApprovalContext() {
    }

    public ApprovalContext(
           com.google.api.ads.adwords.axis.v201406.video.TargetingScope targetingScope,
           com.google.api.ads.adwords.axis.v201406.video.DestinationType destinationType) {
           this.targetingScope = targetingScope;
           this.destinationType = destinationType;
    }


    /**
     * Gets the targetingScope value for this ApprovalContext.
     * 
     * @return targetingScope
     */
    public com.google.api.ads.adwords.axis.v201406.video.TargetingScope getTargetingScope() {
        return targetingScope;
    }


    /**
     * Sets the targetingScope value for this ApprovalContext.
     * 
     * @param targetingScope
     */
    public void setTargetingScope(com.google.api.ads.adwords.axis.v201406.video.TargetingScope targetingScope) {
        this.targetingScope = targetingScope;
    }


    /**
     * Gets the destinationType value for this ApprovalContext.
     * 
     * @return destinationType
     */
    public com.google.api.ads.adwords.axis.v201406.video.DestinationType getDestinationType() {
        return destinationType;
    }


    /**
     * Sets the destinationType value for this ApprovalContext.
     * 
     * @param destinationType
     */
    public void setDestinationType(com.google.api.ads.adwords.axis.v201406.video.DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApprovalContext)) return false;
        ApprovalContext other = (ApprovalContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingScope==null && other.getTargetingScope()==null) || 
             (this.targetingScope!=null &&
              this.targetingScope.equals(other.getTargetingScope()))) &&
            ((this.destinationType==null && other.getDestinationType()==null) || 
             (this.destinationType!=null &&
              this.destinationType.equals(other.getDestinationType())));
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
        if (getTargetingScope() != null) {
            _hashCode += getTargetingScope().hashCode();
        }
        if (getDestinationType() != null) {
            _hashCode += getDestinationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApprovalContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ApprovalContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "targetingScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "destinationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "DestinationType"));
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
