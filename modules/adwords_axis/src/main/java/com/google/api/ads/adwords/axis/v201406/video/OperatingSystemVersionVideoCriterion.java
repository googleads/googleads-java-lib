/**
 * OperatingSystemVersionVideoCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents the operating system criterion used for campaign scheduling.
 * This criterion is immutable
 */
public class OperatingSystemVersionVideoCriterion  extends com.google.api.ads.adwords.axis.v201406.video.BaseCriterion  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Integer osMajorVersion;

    private java.lang.Integer osMinorVersion;

    private com.google.api.ads.adwords.axis.v201406.video.OperatingSystemVersionOperatorType operatorType;

    private java.lang.Long operatingSystemId;

    private java.lang.Boolean obsolete;

    public OperatingSystemVersionVideoCriterion() {
    }

    public OperatingSystemVersionVideoCriterion(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           java.lang.String name,
           java.lang.Integer osMajorVersion,
           java.lang.Integer osMinorVersion,
           com.google.api.ads.adwords.axis.v201406.video.OperatingSystemVersionOperatorType operatorType,
           java.lang.Long operatingSystemId,
           java.lang.Boolean obsolete) {
        super(
            id,
            baseCriterionType);
        this.name = name;
        this.osMajorVersion = osMajorVersion;
        this.osMinorVersion = osMinorVersion;
        this.operatorType = operatorType;
        this.operatingSystemId = operatingSystemId;
        this.obsolete = obsolete;
    }


    /**
     * Gets the name value for this OperatingSystemVersionVideoCriterion.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OperatingSystemVersionVideoCriterion.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the osMajorVersion value for this OperatingSystemVersionVideoCriterion.
     * 
     * @return osMajorVersion
     */
    public java.lang.Integer getOsMajorVersion() {
        return osMajorVersion;
    }


    /**
     * Sets the osMajorVersion value for this OperatingSystemVersionVideoCriterion.
     * 
     * @param osMajorVersion
     */
    public void setOsMajorVersion(java.lang.Integer osMajorVersion) {
        this.osMajorVersion = osMajorVersion;
    }


    /**
     * Gets the osMinorVersion value for this OperatingSystemVersionVideoCriterion.
     * 
     * @return osMinorVersion
     */
    public java.lang.Integer getOsMinorVersion() {
        return osMinorVersion;
    }


    /**
     * Sets the osMinorVersion value for this OperatingSystemVersionVideoCriterion.
     * 
     * @param osMinorVersion
     */
    public void setOsMinorVersion(java.lang.Integer osMinorVersion) {
        this.osMinorVersion = osMinorVersion;
    }


    /**
     * Gets the operatorType value for this OperatingSystemVersionVideoCriterion.
     * 
     * @return operatorType
     */
    public com.google.api.ads.adwords.axis.v201406.video.OperatingSystemVersionOperatorType getOperatorType() {
        return operatorType;
    }


    /**
     * Sets the operatorType value for this OperatingSystemVersionVideoCriterion.
     * 
     * @param operatorType
     */
    public void setOperatorType(com.google.api.ads.adwords.axis.v201406.video.OperatingSystemVersionOperatorType operatorType) {
        this.operatorType = operatorType;
    }


    /**
     * Gets the operatingSystemId value for this OperatingSystemVersionVideoCriterion.
     * 
     * @return operatingSystemId
     */
    public java.lang.Long getOperatingSystemId() {
        return operatingSystemId;
    }


    /**
     * Sets the operatingSystemId value for this OperatingSystemVersionVideoCriterion.
     * 
     * @param operatingSystemId
     */
    public void setOperatingSystemId(java.lang.Long operatingSystemId) {
        this.operatingSystemId = operatingSystemId;
    }


    /**
     * Gets the obsolete value for this OperatingSystemVersionVideoCriterion.
     * 
     * @return obsolete
     */
    public java.lang.Boolean getObsolete() {
        return obsolete;
    }


    /**
     * Sets the obsolete value for this OperatingSystemVersionVideoCriterion.
     * 
     * @param obsolete
     */
    public void setObsolete(java.lang.Boolean obsolete) {
        this.obsolete = obsolete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingSystemVersionVideoCriterion)) return false;
        OperatingSystemVersionVideoCriterion other = (OperatingSystemVersionVideoCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.osMajorVersion==null && other.getOsMajorVersion()==null) || 
             (this.osMajorVersion!=null &&
              this.osMajorVersion.equals(other.getOsMajorVersion()))) &&
            ((this.osMinorVersion==null && other.getOsMinorVersion()==null) || 
             (this.osMinorVersion!=null &&
              this.osMinorVersion.equals(other.getOsMinorVersion()))) &&
            ((this.operatorType==null && other.getOperatorType()==null) || 
             (this.operatorType!=null &&
              this.operatorType.equals(other.getOperatorType()))) &&
            ((this.operatingSystemId==null && other.getOperatingSystemId()==null) || 
             (this.operatingSystemId!=null &&
              this.operatingSystemId.equals(other.getOperatingSystemId()))) &&
            ((this.obsolete==null && other.getObsolete()==null) || 
             (this.obsolete!=null &&
              this.obsolete.equals(other.getObsolete())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOsMajorVersion() != null) {
            _hashCode += getOsMajorVersion().hashCode();
        }
        if (getOsMinorVersion() != null) {
            _hashCode += getOsMinorVersion().hashCode();
        }
        if (getOperatorType() != null) {
            _hashCode += getOperatorType().hashCode();
        }
        if (getOperatingSystemId() != null) {
            _hashCode += getOperatingSystemId().hashCode();
        }
        if (getObsolete() != null) {
            _hashCode += getObsolete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingSystemVersionVideoCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "OperatingSystemVersionVideoCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMajorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "osMajorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMinorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "osMinorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "operatorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "OperatingSystemVersion.OperatorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "operatingSystemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsolete");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "obsolete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
