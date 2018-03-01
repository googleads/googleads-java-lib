// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Image.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Encapsulates an Image media. For {@code SET},{@code REMOVE} operations
 * in
 *             MediaService, use {@code mediaId}.
 */
public class Image  extends com.google.api.ads.adwords.axis.v201802.cm.Media  implements java.io.Serializable {
    /* Raw image data. */
    private byte[] data;

    public Image() {
    }

    public Image(
           java.lang.Long mediaId,
           com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType type,
           java.lang.Long referenceId,
           com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry[] dimensions,
           com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry[] urls,
           com.google.api.ads.adwords.axis.v201802.cm.MediaMimeType mimeType,
           java.lang.String sourceUrl,
           java.lang.String name,
           java.lang.Long fileSize,
           java.lang.String creationTime,
           java.lang.String mediaType,
           byte[] data) {
        super(
            mediaId,
            type,
            referenceId,
            dimensions,
            urls,
            mimeType,
            sourceUrl,
            name,
            fileSize,
            creationTime,
            mediaType);
        this.data = data;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creationTime", getCreationTime())
            .add("data", getData())
            .add("dimensions", getDimensions())
            .add("fileSize", getFileSize())
            .add("mediaId", getMediaId())
            .add("mediaType", getMediaType())
            .add("mimeType", getMimeType())
            .add("name", getName())
            .add("referenceId", getReferenceId())
            .add("sourceUrl", getSourceUrl())
            .add("type", getType())
            .add("urls", getUrls())
            .toString();
    }

    /**
     * Gets the data value for this Image.
     * 
     * @return data   * Raw image data.
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this Image.
     * 
     * @param data   * Raw image data.
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Image)) return false;
        Image other = (Image) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData())));
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
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
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
        new org.apache.axis.description.TypeDesc(Image.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
