/**
 * InStreamAdSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.o;


/**
 * Placement request/response object which provides details about
 * instream
 *             ad types, options, and other available configuration variables.
 */
public class InStreamAdSpec  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201406.o.InStreamAdSpecInStreamType[] inStreamTypes;

    private long[] durations;

    public InStreamAdSpec() {
    }

    public InStreamAdSpec(
           com.google.api.ads.adwords.axis.v201406.o.InStreamAdSpecInStreamType[] inStreamTypes,
           long[] durations) {
           this.inStreamTypes = inStreamTypes;
           this.durations = durations;
    }


    /**
     * Gets the inStreamTypes value for this InStreamAdSpec.
     * 
     * @return inStreamTypes
     */
    public com.google.api.ads.adwords.axis.v201406.o.InStreamAdSpecInStreamType[] getInStreamTypes() {
        return inStreamTypes;
    }


    /**
     * Sets the inStreamTypes value for this InStreamAdSpec.
     * 
     * @param inStreamTypes
     */
    public void setInStreamTypes(com.google.api.ads.adwords.axis.v201406.o.InStreamAdSpecInStreamType[] inStreamTypes) {
        this.inStreamTypes = inStreamTypes;
    }

    public com.google.api.ads.adwords.axis.v201406.o.InStreamAdSpecInStreamType getInStreamTypes(int i) {
        return this.inStreamTypes[i];
    }

    public void setInStreamTypes(int i, com.google.api.ads.adwords.axis.v201406.o.InStreamAdSpecInStreamType _value) {
        this.inStreamTypes[i] = _value;
    }


    /**
     * Gets the durations value for this InStreamAdSpec.
     * 
     * @return durations
     */
    public long[] getDurations() {
        return durations;
    }


    /**
     * Sets the durations value for this InStreamAdSpec.
     * 
     * @param durations
     */
    public void setDurations(long[] durations) {
        this.durations = durations;
    }

    public long getDurations(int i) {
        return this.durations[i];
    }

    public void setDurations(int i, long _value) {
        this.durations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamAdSpec)) return false;
        InStreamAdSpec other = (InStreamAdSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inStreamTypes==null && other.getInStreamTypes()==null) || 
             (this.inStreamTypes!=null &&
              java.util.Arrays.equals(this.inStreamTypes, other.getInStreamTypes()))) &&
            ((this.durations==null && other.getDurations()==null) || 
             (this.durations!=null &&
              java.util.Arrays.equals(this.durations, other.getDurations())));
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
        if (getInStreamTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInStreamTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInStreamTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDurations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamAdSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "InStreamAdSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inStreamTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "inStreamTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "InStreamAdSpec.InStreamType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "durations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
