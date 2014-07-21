/**
 * BidsByFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents bids per format.
 */
public class BidsByFormat  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoBidMapEntry[] bidsByFormat;

    public BidsByFormat() {
    }

    public BidsByFormat(
           com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoBidMapEntry[] bidsByFormat) {
           this.bidsByFormat = bidsByFormat;
    }


    /**
     * Gets the bidsByFormat value for this BidsByFormat.
     * 
     * @return bidsByFormat
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoBidMapEntry[] getBidsByFormat() {
        return bidsByFormat;
    }


    /**
     * Sets the bidsByFormat value for this BidsByFormat.
     * 
     * @param bidsByFormat
     */
    public void setBidsByFormat(com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoBidMapEntry[] bidsByFormat) {
        this.bidsByFormat = bidsByFormat;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoBidMapEntry getBidsByFormat(int i) {
        return this.bidsByFormat[i];
    }

    public void setBidsByFormat(int i, com.google.api.ads.adwords.axis.v201406.video.VideoAdDisplayFormat_VideoBidMapEntry _value) {
        this.bidsByFormat[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidsByFormat)) return false;
        BidsByFormat other = (BidsByFormat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bidsByFormat==null && other.getBidsByFormat()==null) || 
             (this.bidsByFormat!=null &&
              java.util.Arrays.equals(this.bidsByFormat, other.getBidsByFormat())));
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
        if (getBidsByFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBidsByFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidsByFormat(), i);
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
        new org.apache.axis.description.TypeDesc(BidsByFormat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "BidsByFormat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidsByFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "bidsByFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdDisplayFormat_VideoBidMapEntry"));
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
