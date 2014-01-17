/**
 * CreativeSaveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeSaveRequest  implements java.io.Serializable {
    private long creativeId;

    private java.lang.String errorMessage;

    private com.google.api.ads.dfa.axis.v1_19.FlashFile flashFile;

    private com.google.api.ads.dfa.axis.v1_19.ImageFile imageFile;

    public CreativeSaveRequest() {
    }

    public CreativeSaveRequest(
           long creativeId,
           java.lang.String errorMessage,
           com.google.api.ads.dfa.axis.v1_19.FlashFile flashFile,
           com.google.api.ads.dfa.axis.v1_19.ImageFile imageFile) {
           this.creativeId = creativeId;
           this.errorMessage = errorMessage;
           this.flashFile = flashFile;
           this.imageFile = imageFile;
    }


    /**
     * Gets the creativeId value for this CreativeSaveRequest.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeSaveRequest.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the errorMessage value for this CreativeSaveRequest.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this CreativeSaveRequest.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the flashFile value for this CreativeSaveRequest.
     * 
     * @return flashFile
     */
    public com.google.api.ads.dfa.axis.v1_19.FlashFile getFlashFile() {
        return flashFile;
    }


    /**
     * Sets the flashFile value for this CreativeSaveRequest.
     * 
     * @param flashFile
     */
    public void setFlashFile(com.google.api.ads.dfa.axis.v1_19.FlashFile flashFile) {
        this.flashFile = flashFile;
    }


    /**
     * Gets the imageFile value for this CreativeSaveRequest.
     * 
     * @return imageFile
     */
    public com.google.api.ads.dfa.axis.v1_19.ImageFile getImageFile() {
        return imageFile;
    }


    /**
     * Sets the imageFile value for this CreativeSaveRequest.
     * 
     * @param imageFile
     */
    public void setImageFile(com.google.api.ads.dfa.axis.v1_19.ImageFile imageFile) {
        this.imageFile = imageFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeSaveRequest)) return false;
        CreativeSaveRequest other = (CreativeSaveRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.creativeId == other.getCreativeId() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.flashFile==null && other.getFlashFile()==null) || 
             (this.flashFile!=null &&
              this.flashFile.equals(other.getFlashFile()))) &&
            ((this.imageFile==null && other.getImageFile()==null) || 
             (this.imageFile!=null &&
              this.imageFile.equals(other.getImageFile())));
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
        _hashCode += new Long(getCreativeId()).hashCode();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getFlashFile() != null) {
            _hashCode += getFlashFile().hashCode();
        }
        if (getImageFile() != null) {
            _hashCode += getImageFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeSaveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeSaveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FlashFile"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ImageFile"));
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
