/**
 * OperatingSystemVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;


/**
 * Represents a specific version of an operating system.
 */
public class OperatingSystemVersion  extends com.google.api.ads.dfp.axis.v201602.Technology  implements java.io.Serializable {
    /* The operating system major version. */
    private java.lang.Integer majorVersion;

    /* The operating system minor version. */
    private java.lang.Integer minorVersion;

    /* The operating system micro version. */
    private java.lang.Integer microVersion;

    public OperatingSystemVersion() {
    }

    public OperatingSystemVersion(
           java.lang.Long id,
           java.lang.String name,
           java.lang.Integer majorVersion,
           java.lang.Integer minorVersion,
           java.lang.Integer microVersion) {
        super(
            id,
            name);
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.microVersion = microVersion;
    }


    /**
     * Gets the majorVersion value for this OperatingSystemVersion.
     * 
     * @return majorVersion   * The operating system major version.
     */
    public java.lang.Integer getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this OperatingSystemVersion.
     * 
     * @param majorVersion   * The operating system major version.
     */
    public void setMajorVersion(java.lang.Integer majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this OperatingSystemVersion.
     * 
     * @return minorVersion   * The operating system minor version.
     */
    public java.lang.Integer getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this OperatingSystemVersion.
     * 
     * @param minorVersion   * The operating system minor version.
     */
    public void setMinorVersion(java.lang.Integer minorVersion) {
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the microVersion value for this OperatingSystemVersion.
     * 
     * @return microVersion   * The operating system micro version.
     */
    public java.lang.Integer getMicroVersion() {
        return microVersion;
    }


    /**
     * Sets the microVersion value for this OperatingSystemVersion.
     * 
     * @param microVersion   * The operating system micro version.
     */
    public void setMicroVersion(java.lang.Integer microVersion) {
        this.microVersion = microVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingSystemVersion)) return false;
        OperatingSystemVersion other = (OperatingSystemVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion()))) &&
            ((this.microVersion==null && other.getMicroVersion()==null) || 
             (this.microVersion!=null &&
              this.microVersion.equals(other.getMicroVersion())));
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
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        if (getMicroVersion() != null) {
            _hashCode += getMicroVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingSystemVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "OperatingSystemVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "minorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "microVersion"));
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
