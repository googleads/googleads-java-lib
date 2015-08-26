/**
 * WidgetImageUploadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class WidgetImageUploadRequest  implements java.io.Serializable {
    private long campaign;

    private byte[] filedata;

    private java.lang.String filename;

    private long network;

    private boolean networkWidgetImageUpload;

    private java.lang.String profile;

    public WidgetImageUploadRequest() {
    }

    public WidgetImageUploadRequest(
           long campaign,
           byte[] filedata,
           java.lang.String filename,
           long network,
           boolean networkWidgetImageUpload,
           java.lang.String profile) {
           this.campaign = campaign;
           this.filedata = filedata;
           this.filename = filename;
           this.network = network;
           this.networkWidgetImageUpload = networkWidgetImageUpload;
           this.profile = profile;
    }


    /**
     * Gets the campaign value for this WidgetImageUploadRequest.
     * 
     * @return campaign
     */
    public long getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this WidgetImageUploadRequest.
     * 
     * @param campaign
     */
    public void setCampaign(long campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the filedata value for this WidgetImageUploadRequest.
     * 
     * @return filedata
     */
    public byte[] getFiledata() {
        return filedata;
    }


    /**
     * Sets the filedata value for this WidgetImageUploadRequest.
     * 
     * @param filedata
     */
    public void setFiledata(byte[] filedata) {
        this.filedata = filedata;
    }


    /**
     * Gets the filename value for this WidgetImageUploadRequest.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this WidgetImageUploadRequest.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the network value for this WidgetImageUploadRequest.
     * 
     * @return network
     */
    public long getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this WidgetImageUploadRequest.
     * 
     * @param network
     */
    public void setNetwork(long network) {
        this.network = network;
    }


    /**
     * Gets the networkWidgetImageUpload value for this WidgetImageUploadRequest.
     * 
     * @return networkWidgetImageUpload
     */
    public boolean isNetworkWidgetImageUpload() {
        return networkWidgetImageUpload;
    }


    /**
     * Sets the networkWidgetImageUpload value for this WidgetImageUploadRequest.
     * 
     * @param networkWidgetImageUpload
     */
    public void setNetworkWidgetImageUpload(boolean networkWidgetImageUpload) {
        this.networkWidgetImageUpload = networkWidgetImageUpload;
    }


    /**
     * Gets the profile value for this WidgetImageUploadRequest.
     * 
     * @return profile
     */
    public java.lang.String getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this WidgetImageUploadRequest.
     * 
     * @param profile
     */
    public void setProfile(java.lang.String profile) {
        this.profile = profile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetImageUploadRequest)) return false;
        WidgetImageUploadRequest other = (WidgetImageUploadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.campaign == other.getCampaign() &&
            ((this.filedata==null && other.getFiledata()==null) || 
             (this.filedata!=null &&
              java.util.Arrays.equals(this.filedata, other.getFiledata()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            this.network == other.getNetwork() &&
            this.networkWidgetImageUpload == other.isNetworkWidgetImageUpload() &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile())));
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
        _hashCode += new Long(getCampaign()).hashCode();
        if (getFiledata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiledata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiledata(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        _hashCode += new Long(getNetwork()).hashCode();
        _hashCode += (isNetworkWidgetImageUpload() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetImageUploadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "WidgetImageUploadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filedata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filedata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkWidgetImageUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkWidgetImageUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
