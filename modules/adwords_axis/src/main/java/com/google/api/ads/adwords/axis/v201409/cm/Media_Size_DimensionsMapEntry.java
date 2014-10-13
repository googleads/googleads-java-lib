/**
 * Media_Size_DimensionsMapEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * This represents an entry in a map with a key of type Size
 *             and value of type Dimensions.
 */
public class Media_Size_DimensionsMapEntry  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201409.cm.MediaSize key;

    private com.google.api.ads.adwords.axis.v201409.cm.Dimensions value;

    public Media_Size_DimensionsMapEntry() {
    }

    public Media_Size_DimensionsMapEntry(
           com.google.api.ads.adwords.axis.v201409.cm.MediaSize key,
           com.google.api.ads.adwords.axis.v201409.cm.Dimensions value) {
           this.key = key;
           this.value = value;
    }


    /**
     * Gets the key value for this Media_Size_DimensionsMapEntry.
     * 
     * @return key
     */
    public com.google.api.ads.adwords.axis.v201409.cm.MediaSize getKey() {
        return key;
    }


    /**
     * Sets the key value for this Media_Size_DimensionsMapEntry.
     * 
     * @param key
     */
    public void setKey(com.google.api.ads.adwords.axis.v201409.cm.MediaSize key) {
        this.key = key;
    }


    /**
     * Gets the value value for this Media_Size_DimensionsMapEntry.
     * 
     * @return value
     */
    public com.google.api.ads.adwords.axis.v201409.cm.Dimensions getValue() {
        return value;
    }


    /**
     * Sets the value value for this Media_Size_DimensionsMapEntry.
     * 
     * @param value
     */
    public void setValue(com.google.api.ads.adwords.axis.v201409.cm.Dimensions value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Media_Size_DimensionsMapEntry)) return false;
        Media_Size_DimensionsMapEntry other = (Media_Size_DimensionsMapEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Media_Size_DimensionsMapEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Media_Size_DimensionsMapEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Media.Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Dimensions"));
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
