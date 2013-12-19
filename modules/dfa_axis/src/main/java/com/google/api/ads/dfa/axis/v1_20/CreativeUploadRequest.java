/**
 * CreativeUploadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeUploadRequest  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary creativeUploadSessionSummary;

    private com.google.api.ads.dfa.axis.v1_20.RawFile[] rawFiles;

    public CreativeUploadRequest() {
    }

    public CreativeUploadRequest(
           com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary creativeUploadSessionSummary,
           com.google.api.ads.dfa.axis.v1_20.RawFile[] rawFiles) {
           this.creativeUploadSessionSummary = creativeUploadSessionSummary;
           this.rawFiles = rawFiles;
    }


    /**
     * Gets the creativeUploadSessionSummary value for this CreativeUploadRequest.
     * 
     * @return creativeUploadSessionSummary
     */
    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary getCreativeUploadSessionSummary() {
        return creativeUploadSessionSummary;
    }


    /**
     * Sets the creativeUploadSessionSummary value for this CreativeUploadRequest.
     * 
     * @param creativeUploadSessionSummary
     */
    public void setCreativeUploadSessionSummary(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary creativeUploadSessionSummary) {
        this.creativeUploadSessionSummary = creativeUploadSessionSummary;
    }


    /**
     * Gets the rawFiles value for this CreativeUploadRequest.
     * 
     * @return rawFiles
     */
    public com.google.api.ads.dfa.axis.v1_20.RawFile[] getRawFiles() {
        return rawFiles;
    }


    /**
     * Sets the rawFiles value for this CreativeUploadRequest.
     * 
     * @param rawFiles
     */
    public void setRawFiles(com.google.api.ads.dfa.axis.v1_20.RawFile[] rawFiles) {
        this.rawFiles = rawFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeUploadRequest)) return false;
        CreativeUploadRequest other = (CreativeUploadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creativeUploadSessionSummary==null && other.getCreativeUploadSessionSummary()==null) || 
             (this.creativeUploadSessionSummary!=null &&
              this.creativeUploadSessionSummary.equals(other.getCreativeUploadSessionSummary()))) &&
            ((this.rawFiles==null && other.getRawFiles()==null) || 
             (this.rawFiles!=null &&
              java.util.Arrays.equals(this.rawFiles, other.getRawFiles())));
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
        if (getCreativeUploadSessionSummary() != null) {
            _hashCode += getCreativeUploadSessionSummary().hashCode();
        }
        if (getRawFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRawFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRawFiles(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeUploadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeUploadSessionSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeUploadSessionSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSessionSummary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rawFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RawFile"));
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
