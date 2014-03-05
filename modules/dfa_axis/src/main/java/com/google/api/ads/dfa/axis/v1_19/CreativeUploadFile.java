/**
 * CreativeUploadFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeUploadFile  extends com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileSummary  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.Dimensions dimensions;

    private java.lang.String errorMessage;

    private long fileLength;

    private boolean flashFile;

    private com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileSummary[] matchedFiles;

    public CreativeUploadFile() {
    }

    public CreativeUploadFile(
           long id,
           java.lang.String name,
           java.lang.String sourcePath,
           com.google.api.ads.dfa.axis.v1_19.Dimensions dimensions,
           java.lang.String errorMessage,
           long fileLength,
           boolean flashFile,
           com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileSummary[] matchedFiles) {
        super(
            id,
            name,
            sourcePath);
        this.dimensions = dimensions;
        this.errorMessage = errorMessage;
        this.fileLength = fileLength;
        this.flashFile = flashFile;
        this.matchedFiles = matchedFiles;
    }


    /**
     * Gets the dimensions value for this CreativeUploadFile.
     * 
     * @return dimensions
     */
    public com.google.api.ads.dfa.axis.v1_19.Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this CreativeUploadFile.
     * 
     * @param dimensions
     */
    public void setDimensions(com.google.api.ads.dfa.axis.v1_19.Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the errorMessage value for this CreativeUploadFile.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this CreativeUploadFile.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the fileLength value for this CreativeUploadFile.
     * 
     * @return fileLength
     */
    public long getFileLength() {
        return fileLength;
    }


    /**
     * Sets the fileLength value for this CreativeUploadFile.
     * 
     * @param fileLength
     */
    public void setFileLength(long fileLength) {
        this.fileLength = fileLength;
    }


    /**
     * Gets the flashFile value for this CreativeUploadFile.
     * 
     * @return flashFile
     */
    public boolean isFlashFile() {
        return flashFile;
    }


    /**
     * Sets the flashFile value for this CreativeUploadFile.
     * 
     * @param flashFile
     */
    public void setFlashFile(boolean flashFile) {
        this.flashFile = flashFile;
    }


    /**
     * Gets the matchedFiles value for this CreativeUploadFile.
     * 
     * @return matchedFiles
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileSummary[] getMatchedFiles() {
        return matchedFiles;
    }


    /**
     * Sets the matchedFiles value for this CreativeUploadFile.
     * 
     * @param matchedFiles
     */
    public void setMatchedFiles(com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileSummary[] matchedFiles) {
        this.matchedFiles = matchedFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeUploadFile)) return false;
        CreativeUploadFile other = (CreativeUploadFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            this.fileLength == other.getFileLength() &&
            this.flashFile == other.isFlashFile() &&
            ((this.matchedFiles==null && other.getMatchedFiles()==null) || 
             (this.matchedFiles!=null &&
              java.util.Arrays.equals(this.matchedFiles, other.getMatchedFiles())));
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
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        _hashCode += new Long(getFileLength()).hashCode();
        _hashCode += (isFlashFile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMatchedFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchedFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchedFiles(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeUploadFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeUploadFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Dimensions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeUploadFileSummary"));
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
