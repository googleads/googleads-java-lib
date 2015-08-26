/**
 * RichMediaExitEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaExitEvent  extends com.google.api.ads.dfa.axis.v1_20.RichMediaEventBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.RichMediaExitWindowProperties exitWindowProperties;

    private java.lang.String target;

    private java.lang.String url;

    public RichMediaExitEvent() {
    }

    public RichMediaExitEvent(
           long id,
           java.lang.String name,
           java.lang.String description,
           long metEventId,
           java.lang.String mode,
           long parentAssetId,
           java.lang.String type,
           com.google.api.ads.dfa.axis.v1_20.RichMediaExitWindowProperties exitWindowProperties,
           java.lang.String target,
           java.lang.String url) {
        super(
            id,
            name,
            description,
            metEventId,
            mode,
            parentAssetId,
            type);
        this.exitWindowProperties = exitWindowProperties;
        this.target = target;
        this.url = url;
    }


    /**
     * Gets the exitWindowProperties value for this RichMediaExitEvent.
     * 
     * @return exitWindowProperties
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaExitWindowProperties getExitWindowProperties() {
        return exitWindowProperties;
    }


    /**
     * Sets the exitWindowProperties value for this RichMediaExitEvent.
     * 
     * @param exitWindowProperties
     */
    public void setExitWindowProperties(com.google.api.ads.dfa.axis.v1_20.RichMediaExitWindowProperties exitWindowProperties) {
        this.exitWindowProperties = exitWindowProperties;
    }


    /**
     * Gets the target value for this RichMediaExitEvent.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this RichMediaExitEvent.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the url value for this RichMediaExitEvent.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this RichMediaExitEvent.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaExitEvent)) return false;
        RichMediaExitEvent other = (RichMediaExitEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exitWindowProperties==null && other.getExitWindowProperties()==null) || 
             (this.exitWindowProperties!=null &&
              this.exitWindowProperties.equals(other.getExitWindowProperties()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getExitWindowProperties() != null) {
            _hashCode += getExitWindowProperties().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaExitEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitWindowProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exitWindowProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitWindowProperties"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
