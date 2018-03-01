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
 * Media.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents some kind of media.
 */
public class Media  implements java.io.Serializable {
    /* ID of this media object.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long mediaId;

    /* Type of media object. Required when using {@link MediaService#upload}
     * to upload a new media
     *                 file. MEDIA_BUNDLE, ICON, IMAGE, and DYNAMIC_IMAGE
     * are the supported MediaTypes to upload.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType type;

    /* Media reference ID key.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private java.lang.Long referenceId;

    /* Various dimension sizes for the media. Only applies to image
     * media (and video media for
     *                 video thumbnails). */
    private com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry[] dimensions;

    /* URLs pointing to the resized media for the given sizes. Only
     * applies to image media.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry[] urls;

    /* The mime type of the media.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.MediaMimeType mimeType;

    /* The URL of where the original media was downloaded from (or
     * a file name).
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private java.lang.String sourceUrl;

    /* The name of the media. The name can be used by clients to
     *                 help identify previously uploaded media. */
    private java.lang.String name;

    /* The size of the media file in bytes.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private java.lang.Long fileSize;

    /* Media creation date in the format YYYY-MM-DD HH:MM:SS+TZ.
     *                 This is not updatable and not specifiable.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private java.lang.String creationTime;

    /* Indicates that this instance is a subtype of Media.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String mediaType;

    public Media() {
    }

    public Media(
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
           java.lang.String mediaType) {
           this.mediaId = mediaId;
           this.type = type;
           this.referenceId = referenceId;
           this.dimensions = dimensions;
           this.urls = urls;
           this.mimeType = mimeType;
           this.sourceUrl = sourceUrl;
           this.name = name;
           this.fileSize = fileSize;
           this.creationTime = creationTime;
           this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creationTime", getCreationTime())
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
     * Gets the mediaId value for this Media.
     * 
     * @return mediaId   * ID of this media object.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getMediaId() {
        return mediaId;
    }


    /**
     * Sets the mediaId value for this Media.
     * 
     * @param mediaId   * ID of this media object.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setMediaId(java.lang.Long mediaId) {
        this.mediaId = mediaId;
    }


    /**
     * Gets the type value for this Media.
     * 
     * @return type   * Type of media object. Required when using {@link MediaService#upload}
     * to upload a new media
     *                 file. MEDIA_BUNDLE, ICON, IMAGE, and DYNAMIC_IMAGE
     * are the supported MediaTypes to upload.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType getType() {
        return type;
    }


    /**
     * Sets the type value for this Media.
     * 
     * @param type   * Type of media object. Required when using {@link MediaService#upload}
     * to upload a new media
     *                 file. MEDIA_BUNDLE, ICON, IMAGE, and DYNAMIC_IMAGE
     * are the supported MediaTypes to upload.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType type) {
        this.type = type;
    }


    /**
     * Gets the referenceId value for this Media.
     * 
     * @return referenceId   * Media reference ID key.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public java.lang.Long getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this Media.
     * 
     * @param referenceId   * Media reference ID key.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setReferenceId(java.lang.Long referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the dimensions value for this Media.
     * 
     * @return dimensions   * Various dimension sizes for the media. Only applies to image
     * media (and video media for
     *                 video thumbnails).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry[] getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this Media.
     * 
     * @param dimensions   * Various dimension sizes for the media. Only applies to image
     * media (and video media for
     *                 video thumbnails).
     */
    public void setDimensions(com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry _value) {
        this.dimensions[i] = _value;
    }


    /**
     * Gets the urls value for this Media.
     * 
     * @return urls   * URLs pointing to the resized media for the given sizes. Only
     * applies to image media.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry[] getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this Media.
     * 
     * @param urls   * URLs pointing to the resized media for the given sizes. Only
     * applies to image media.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setUrls(com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry[] urls) {
        this.urls = urls;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry getUrls(int i) {
        return this.urls[i];
    }

    public void setUrls(int i, com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry _value) {
        this.urls[i] = _value;
    }


    /**
     * Gets the mimeType value for this Media.
     * 
     * @return mimeType   * The mime type of the media.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MediaMimeType getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this Media.
     * 
     * @param mimeType   * The mime type of the media.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setMimeType(com.google.api.ads.adwords.axis.v201802.cm.MediaMimeType mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the sourceUrl value for this Media.
     * 
     * @return sourceUrl   * The URL of where the original media was downloaded from (or
     * a file name).
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public java.lang.String getSourceUrl() {
        return sourceUrl;
    }


    /**
     * Sets the sourceUrl value for this Media.
     * 
     * @param sourceUrl   * The URL of where the original media was downloaded from (or
     * a file name).
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setSourceUrl(java.lang.String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }


    /**
     * Gets the name value for this Media.
     * 
     * @return name   * The name of the media. The name can be used by clients to
     *                 help identify previously uploaded media.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Media.
     * 
     * @param name   * The name of the media. The name can be used by clients to
     *                 help identify previously uploaded media.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the fileSize value for this Media.
     * 
     * @return fileSize   * The size of the media file in bytes.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this Media.
     * 
     * @param fileSize   * The size of the media file in bytes.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the creationTime value for this Media.
     * 
     * @return creationTime   * Media creation date in the format YYYY-MM-DD HH:MM:SS+TZ.
     *                 This is not updatable and not specifiable.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public java.lang.String getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this Media.
     * 
     * @param creationTime   * Media creation date in the format YYYY-MM-DD HH:MM:SS+TZ.
     *                 This is not updatable and not specifiable.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setCreationTime(java.lang.String creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the mediaType value for this Media.
     * 
     * @return mediaType   * Indicates that this instance is a subtype of Media.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this Media.
     * 
     * @param mediaType   * Indicates that this instance is a subtype of Media.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Media)) return false;
        Media other = (Media) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mediaId==null && other.getMediaId()==null) || 
             (this.mediaId!=null &&
              this.mediaId.equals(other.getMediaId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              java.util.Arrays.equals(this.dimensions, other.getDimensions()))) &&
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              java.util.Arrays.equals(this.urls, other.getUrls()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.sourceUrl==null && other.getSourceUrl()==null) || 
             (this.sourceUrl!=null &&
              this.sourceUrl.equals(other.getSourceUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType())));
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
        if (getMediaId() != null) {
            _hashCode += getMediaId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getSourceUrl() != null) {
            _hashCode += getSourceUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Media.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.MediaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media_Size_DimensionsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media_Size_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.MimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "sourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.Type"));
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
