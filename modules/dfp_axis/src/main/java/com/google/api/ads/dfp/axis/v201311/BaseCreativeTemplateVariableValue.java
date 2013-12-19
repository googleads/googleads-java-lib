/**
 * BaseCreativeTemplateVariableValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A base class for storing values of the {@link CreativeTemplateVariable}.
 */
public abstract class BaseCreativeTemplateVariableValue  implements java.io.Serializable {
    /* A uniqueName of the {@link CreativeTemplateVariable}. */
    private java.lang.String uniqueName;

    /* Indicates that this instance is a subtype of BaseCreativeTemplateVariableValue.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String baseCreativeTemplateVariableValueType;

    public BaseCreativeTemplateVariableValue() {
    }

    public BaseCreativeTemplateVariableValue(
           java.lang.String uniqueName,
           java.lang.String baseCreativeTemplateVariableValueType) {
           this.uniqueName = uniqueName;
           this.baseCreativeTemplateVariableValueType = baseCreativeTemplateVariableValueType;
    }


    /**
     * Gets the uniqueName value for this BaseCreativeTemplateVariableValue.
     * 
     * @return uniqueName   * A uniqueName of the {@link CreativeTemplateVariable}.
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this BaseCreativeTemplateVariableValue.
     * 
     * @param uniqueName   * A uniqueName of the {@link CreativeTemplateVariable}.
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the baseCreativeTemplateVariableValueType value for this BaseCreativeTemplateVariableValue.
     * 
     * @return baseCreativeTemplateVariableValueType   * Indicates that this instance is a subtype of BaseCreativeTemplateVariableValue.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getBaseCreativeTemplateVariableValueType() {
        return baseCreativeTemplateVariableValueType;
    }


    /**
     * Sets the baseCreativeTemplateVariableValueType value for this BaseCreativeTemplateVariableValue.
     * 
     * @param baseCreativeTemplateVariableValueType   * Indicates that this instance is a subtype of BaseCreativeTemplateVariableValue.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setBaseCreativeTemplateVariableValueType(java.lang.String baseCreativeTemplateVariableValueType) {
        this.baseCreativeTemplateVariableValueType = baseCreativeTemplateVariableValueType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseCreativeTemplateVariableValue)) return false;
        BaseCreativeTemplateVariableValue other = (BaseCreativeTemplateVariableValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.baseCreativeTemplateVariableValueType==null && other.getBaseCreativeTemplateVariableValueType()==null) || 
             (this.baseCreativeTemplateVariableValueType!=null &&
              this.baseCreativeTemplateVariableValueType.equals(other.getBaseCreativeTemplateVariableValueType())));
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
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getBaseCreativeTemplateVariableValueType() != null) {
            _hashCode += getBaseCreativeTemplateVariableValueType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseCreativeTemplateVariableValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "BaseCreativeTemplateVariableValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "uniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCreativeTemplateVariableValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "BaseCreativeTemplateVariableValue.Type"));
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
