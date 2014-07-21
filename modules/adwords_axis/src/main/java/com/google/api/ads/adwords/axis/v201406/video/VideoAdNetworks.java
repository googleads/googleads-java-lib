/**
 * VideoAdNetworks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents a collection of {@link VideoAdNetwork}s, potentially
 * {@code null}.
 *             
 *             Wrapper around a list of networks which preserves {@code
 * null}
 *             (i.e. not specified) value during grubby serialization/deserialization.
 * Grubby translates lists into repeated fields in the protocol message
 * and,
 *             therefore, cannot restore a {@code null} list.
 */
public class VideoAdNetworks  implements java.io.Serializable {
    /* <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork[] networks;

    public VideoAdNetworks() {
    }

    public VideoAdNetworks(
           com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork[] networks) {
           this.networks = networks;
    }


    /**
     * Gets the networks value for this VideoAdNetworks.
     * 
     * @return networks   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork[] getNetworks() {
        return networks;
    }


    /**
     * Sets the networks value for this VideoAdNetworks.
     * 
     * @param networks   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setNetworks(com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork[] networks) {
        this.networks = networks;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork getNetworks(int i) {
        return this.networks[i];
    }

    public void setNetworks(int i, com.google.api.ads.adwords.axis.v201406.video.VideoAdNetwork _value) {
        this.networks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoAdNetworks)) return false;
        VideoAdNetworks other = (VideoAdNetworks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networks==null && other.getNetworks()==null) || 
             (this.networks!=null &&
              java.util.Arrays.equals(this.networks, other.getNetworks())));
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
        if (getNetworks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworks(), i);
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
        new org.apache.axis.description.TypeDesc(VideoAdNetworks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdNetworks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "networks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdNetwork"));
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
