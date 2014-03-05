/**
 * CreativeUploadSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeUploadSession  extends com.google.api.ads.dfa.axis.v1_19.CreativeUploadSessionSummary  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.CreativeSaveRequest[] creativeSaveRequests;

    private com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileCount fileCount;

    private int status;

    private com.google.api.ads.dfa.axis.v1_19.CreativeUploadFile[] uploadedFiles;

    public CreativeUploadSession() {
    }

    public CreativeUploadSession(
           long advertiserId,
           long campaignId,
           long creativeUploadId,
           com.google.api.ads.dfa.axis.v1_19.CreativeSaveRequest[] creativeSaveRequests,
           com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileCount fileCount,
           int status,
           com.google.api.ads.dfa.axis.v1_19.CreativeUploadFile[] uploadedFiles) {
        super(
            advertiserId,
            campaignId,
            creativeUploadId);
        this.creativeSaveRequests = creativeSaveRequests;
        this.fileCount = fileCount;
        this.status = status;
        this.uploadedFiles = uploadedFiles;
    }


    /**
     * Gets the creativeSaveRequests value for this CreativeUploadSession.
     * 
     * @return creativeSaveRequests
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeSaveRequest[] getCreativeSaveRequests() {
        return creativeSaveRequests;
    }


    /**
     * Sets the creativeSaveRequests value for this CreativeUploadSession.
     * 
     * @param creativeSaveRequests
     */
    public void setCreativeSaveRequests(com.google.api.ads.dfa.axis.v1_19.CreativeSaveRequest[] creativeSaveRequests) {
        this.creativeSaveRequests = creativeSaveRequests;
    }


    /**
     * Gets the fileCount value for this CreativeUploadSession.
     * 
     * @return fileCount
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileCount getFileCount() {
        return fileCount;
    }


    /**
     * Sets the fileCount value for this CreativeUploadSession.
     * 
     * @param fileCount
     */
    public void setFileCount(com.google.api.ads.dfa.axis.v1_19.CreativeUploadFileCount fileCount) {
        this.fileCount = fileCount;
    }


    /**
     * Gets the status value for this CreativeUploadSession.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreativeUploadSession.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the uploadedFiles value for this CreativeUploadSession.
     * 
     * @return uploadedFiles
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeUploadFile[] getUploadedFiles() {
        return uploadedFiles;
    }


    /**
     * Sets the uploadedFiles value for this CreativeUploadSession.
     * 
     * @param uploadedFiles
     */
    public void setUploadedFiles(com.google.api.ads.dfa.axis.v1_19.CreativeUploadFile[] uploadedFiles) {
        this.uploadedFiles = uploadedFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeUploadSession)) return false;
        CreativeUploadSession other = (CreativeUploadSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creativeSaveRequests==null && other.getCreativeSaveRequests()==null) || 
             (this.creativeSaveRequests!=null &&
              java.util.Arrays.equals(this.creativeSaveRequests, other.getCreativeSaveRequests()))) &&
            ((this.fileCount==null && other.getFileCount()==null) || 
             (this.fileCount!=null &&
              this.fileCount.equals(other.getFileCount()))) &&
            this.status == other.getStatus() &&
            ((this.uploadedFiles==null && other.getUploadedFiles()==null) || 
             (this.uploadedFiles!=null &&
              java.util.Arrays.equals(this.uploadedFiles, other.getUploadedFiles())));
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
        if (getCreativeSaveRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeSaveRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeSaveRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileCount() != null) {
            _hashCode += getFileCount().hashCode();
        }
        _hashCode += getStatus();
        if (getUploadedFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUploadedFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUploadedFiles(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeUploadSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeUploadSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeSaveRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeSaveRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeSaveRequest"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeUploadFileCount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeUploadFile"));
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
