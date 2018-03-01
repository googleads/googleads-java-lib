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
 * MediaBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a ZIP archive media the content of which contains HTML5
 * assets.
 */
public class MediaBundle  extends com.google.api.ads.adwords.axis.v201802.cm.Media  implements java.io.Serializable {
    /* Raw zipped data. */
    private byte[] data;

    /* URL pointing to the data for the MediaBundle data.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String mediaBundleUrl;

    /* Entry in the ZIP archive used to display the <code>MediaBundle</code>
     * in an
     *                     <code>Ad</code>. This field can only be set and
     * returned when the <code>MediaBundle</code> is
     *                     used with the <code>AdGroupAdService</code>. If
     * this field is set when calling
     *                     <code>MediaService</code>, an error will be returned.
     * 
     *                     <p>To use a <code>MediaBundle</code> that was
     * created with the <code>MediaService</code> in
     *                     an <code>Ad</code>, create a bundle and set the
     * <code>mediaId</code> and
     *                     <code>entryPoint</code> fields. */
    private java.lang.String entryPoint;

    public MediaBundle() {
    }

    public MediaBundle(
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
           byte[] data,
           java.lang.String mediaBundleUrl,
           java.lang.String entryPoint) {
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
        this.mediaBundleUrl = mediaBundleUrl;
        this.entryPoint = entryPoint;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creationTime", getCreationTime())
            .add("data", getData())
            .add("dimensions", getDimensions())
            .add("entryPoint", getEntryPoint())
            .add("fileSize", getFileSize())
            .add("mediaBundleUrl", getMediaBundleUrl())
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
     * Gets the data value for this MediaBundle.
     * 
     * @return data   * Raw zipped data.
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this MediaBundle.
     * 
     * @param data   * Raw zipped data.
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the mediaBundleUrl value for this MediaBundle.
     * 
     * @return mediaBundleUrl   * URL pointing to the data for the MediaBundle data.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getMediaBundleUrl() {
        return mediaBundleUrl;
    }


    /**
     * Sets the mediaBundleUrl value for this MediaBundle.
     * 
     * @param mediaBundleUrl   * URL pointing to the data for the MediaBundle data.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setMediaBundleUrl(java.lang.String mediaBundleUrl) {
        this.mediaBundleUrl = mediaBundleUrl;
    }


    /**
     * Gets the entryPoint value for this MediaBundle.
     * 
     * @return entryPoint   * Entry in the ZIP archive used to display the <code>MediaBundle</code>
     * in an
     *                     <code>Ad</code>. This field can only be set and
     * returned when the <code>MediaBundle</code> is
     *                     used with the <code>AdGroupAdService</code>. If
     * this field is set when calling
     *                     <code>MediaService</code>, an error will be returned.
     * 
     *                     <p>To use a <code>MediaBundle</code> that was
     * created with the <code>MediaService</code> in
     *                     an <code>Ad</code>, create a bundle and set the
     * <code>mediaId</code> and
     *                     <code>entryPoint</code> fields.
     */
    public java.lang.String getEntryPoint() {
        return entryPoint;
    }


    /**
     * Sets the entryPoint value for this MediaBundle.
     * 
     * @param entryPoint   * Entry in the ZIP archive used to display the <code>MediaBundle</code>
     * in an
     *                     <code>Ad</code>. This field can only be set and
     * returned when the <code>MediaBundle</code> is
     *                     used with the <code>AdGroupAdService</code>. If
     * this field is set when calling
     *                     <code>MediaService</code>, an error will be returned.
     * 
     *                     <p>To use a <code>MediaBundle</code> that was
     * created with the <code>MediaService</code> in
     *                     an <code>Ad</code>, create a bundle and set the
     * <code>mediaId</code> and
     *                     <code>entryPoint</code> fields.
     */
    public void setEntryPoint(java.lang.String entryPoint) {
        this.entryPoint = entryPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MediaBundle)) return false;
        MediaBundle other = (MediaBundle) obj;
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
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.mediaBundleUrl==null && other.getMediaBundleUrl()==null) || 
             (this.mediaBundleUrl!=null &&
              this.mediaBundleUrl.equals(other.getMediaBundleUrl()))) &&
            ((this.entryPoint==null && other.getEntryPoint()==null) || 
             (this.entryPoint!=null &&
              this.entryPoint.equals(other.getEntryPoint())));
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
        if (getMediaBundleUrl() != null) {
            _hashCode += getMediaBundleUrl().hashCode();
        }
        if (getEntryPoint() != null) {
            _hashCode += getEntryPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MediaBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaBundleUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mediaBundleUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "entryPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
