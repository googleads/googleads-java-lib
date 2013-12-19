/**
 * FeedItemAttributeError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Contains validation error details for a set of feed attributes.
 */
public class FeedItemAttributeError  implements java.io.Serializable {
    /* Contains the set of feed attribute ids whose attributes together
     * triggered the error.
     *                 Null or empty field means error code does not apply
     * to a specific set of attributes. */
    private long[] feedAttributeIds;

    /* Validation error code. */
    private java.lang.Integer validationErrorCode;

    public FeedItemAttributeError() {
    }

    public FeedItemAttributeError(
           long[] feedAttributeIds,
           java.lang.Integer validationErrorCode) {
           this.feedAttributeIds = feedAttributeIds;
           this.validationErrorCode = validationErrorCode;
    }


    /**
     * Gets the feedAttributeIds value for this FeedItemAttributeError.
     * 
     * @return feedAttributeIds   * Contains the set of feed attribute ids whose attributes together
     * triggered the error.
     *                 Null or empty field means error code does not apply
     * to a specific set of attributes.
     */
    public long[] getFeedAttributeIds() {
        return feedAttributeIds;
    }


    /**
     * Sets the feedAttributeIds value for this FeedItemAttributeError.
     * 
     * @param feedAttributeIds   * Contains the set of feed attribute ids whose attributes together
     * triggered the error.
     *                 Null or empty field means error code does not apply
     * to a specific set of attributes.
     */
    public void setFeedAttributeIds(long[] feedAttributeIds) {
        this.feedAttributeIds = feedAttributeIds;
    }

    public long getFeedAttributeIds(int i) {
        return this.feedAttributeIds[i];
    }

    public void setFeedAttributeIds(int i, long _value) {
        this.feedAttributeIds[i] = _value;
    }


    /**
     * Gets the validationErrorCode value for this FeedItemAttributeError.
     * 
     * @return validationErrorCode   * Validation error code.
     */
    public java.lang.Integer getValidationErrorCode() {
        return validationErrorCode;
    }


    /**
     * Sets the validationErrorCode value for this FeedItemAttributeError.
     * 
     * @param validationErrorCode   * Validation error code.
     */
    public void setValidationErrorCode(java.lang.Integer validationErrorCode) {
        this.validationErrorCode = validationErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemAttributeError)) return false;
        FeedItemAttributeError other = (FeedItemAttributeError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedAttributeIds==null && other.getFeedAttributeIds()==null) || 
             (this.feedAttributeIds!=null &&
              java.util.Arrays.equals(this.feedAttributeIds, other.getFeedAttributeIds()))) &&
            ((this.validationErrorCode==null && other.getValidationErrorCode()==null) || 
             (this.validationErrorCode!=null &&
              this.validationErrorCode.equals(other.getValidationErrorCode())));
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
        if (getFeedAttributeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedAttributeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedAttributeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidationErrorCode() != null) {
            _hashCode += getValidationErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemAttributeError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemAttributeError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "feedAttributeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "validationErrorCode"));
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
