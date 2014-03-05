/**
 * DoubleComparisonOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.o;


/**
 * Object representing double comparison operations. This is usually
 * used within
 *             a particular
 *             {@link com.google.ads.api.services.targetingideas.search.SearchParameter}
 * to
 *             specify the valid values requested for the specific
 *             {@link com.google.ads.api.services.common.optimization.attributes.Attribute}.
 */
public class DoubleComparisonOperation  implements java.io.Serializable {
    /* The minimum value of elements returned by this operation (inclusive). */
    private java.lang.Double minimum;

    /* The maximum value of elements returned by this operation (inclusive). */
    private java.lang.Double maximum;

    public DoubleComparisonOperation() {
    }

    public DoubleComparisonOperation(
           java.lang.Double minimum,
           java.lang.Double maximum) {
           this.minimum = minimum;
           this.maximum = maximum;
    }


    /**
     * Gets the minimum value for this DoubleComparisonOperation.
     * 
     * @return minimum   * The minimum value of elements returned by this operation (inclusive).
     */
    public java.lang.Double getMinimum() {
        return minimum;
    }


    /**
     * Sets the minimum value for this DoubleComparisonOperation.
     * 
     * @param minimum   * The minimum value of elements returned by this operation (inclusive).
     */
    public void setMinimum(java.lang.Double minimum) {
        this.minimum = minimum;
    }


    /**
     * Gets the maximum value for this DoubleComparisonOperation.
     * 
     * @return maximum   * The maximum value of elements returned by this operation (inclusive).
     */
    public java.lang.Double getMaximum() {
        return maximum;
    }


    /**
     * Sets the maximum value for this DoubleComparisonOperation.
     * 
     * @param maximum   * The maximum value of elements returned by this operation (inclusive).
     */
    public void setMaximum(java.lang.Double maximum) {
        this.maximum = maximum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoubleComparisonOperation)) return false;
        DoubleComparisonOperation other = (DoubleComparisonOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minimum==null && other.getMinimum()==null) || 
             (this.minimum!=null &&
              this.minimum.equals(other.getMinimum()))) &&
            ((this.maximum==null && other.getMaximum()==null) || 
             (this.maximum!=null &&
              this.maximum.equals(other.getMaximum())));
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
        if (getMinimum() != null) {
            _hashCode += getMinimum().hashCode();
        }
        if (getMaximum() != null) {
            _hashCode += getMaximum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoubleComparisonOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201309", "DoubleComparisonOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201309", "minimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201309", "maximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
