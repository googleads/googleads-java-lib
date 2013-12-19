/**
 * InStreamMediaFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class InStreamMediaFile  extends com.google.api.ads.dfa.axis.v1_20.Base  implements java.io.Serializable {
    private double bitrate;

    private float fileSize;

    private int height;

    private java.lang.String mimeType;

    private boolean pickedToServe;

    private int width;

    public InStreamMediaFile() {
    }

    public InStreamMediaFile(
           long id,
           java.lang.String name,
           double bitrate,
           float fileSize,
           int height,
           java.lang.String mimeType,
           boolean pickedToServe,
           int width) {
        super(
            id,
            name);
        this.bitrate = bitrate;
        this.fileSize = fileSize;
        this.height = height;
        this.mimeType = mimeType;
        this.pickedToServe = pickedToServe;
        this.width = width;
    }


    /**
     * Gets the bitrate value for this InStreamMediaFile.
     * 
     * @return bitrate
     */
    public double getBitrate() {
        return bitrate;
    }


    /**
     * Sets the bitrate value for this InStreamMediaFile.
     * 
     * @param bitrate
     */
    public void setBitrate(double bitrate) {
        this.bitrate = bitrate;
    }


    /**
     * Gets the fileSize value for this InStreamMediaFile.
     * 
     * @return fileSize
     */
    public float getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this InStreamMediaFile.
     * 
     * @param fileSize
     */
    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the height value for this InStreamMediaFile.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this InStreamMediaFile.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the mimeType value for this InStreamMediaFile.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this InStreamMediaFile.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the pickedToServe value for this InStreamMediaFile.
     * 
     * @return pickedToServe
     */
    public boolean isPickedToServe() {
        return pickedToServe;
    }


    /**
     * Sets the pickedToServe value for this InStreamMediaFile.
     * 
     * @param pickedToServe
     */
    public void setPickedToServe(boolean pickedToServe) {
        this.pickedToServe = pickedToServe;
    }


    /**
     * Gets the width value for this InStreamMediaFile.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this InStreamMediaFile.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamMediaFile)) return false;
        InStreamMediaFile other = (InStreamMediaFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.bitrate == other.getBitrate() &&
            this.fileSize == other.getFileSize() &&
            this.height == other.getHeight() &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            this.pickedToServe == other.isPickedToServe() &&
            this.width == other.getWidth();
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
        _hashCode += new Double(getBitrate()).hashCode();
        _hashCode += new Float(getFileSize()).hashCode();
        _hashCode += getHeight();
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        _hashCode += (isPickedToServe() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamMediaFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamMediaFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitrate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bitrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickedToServe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickedToServe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
