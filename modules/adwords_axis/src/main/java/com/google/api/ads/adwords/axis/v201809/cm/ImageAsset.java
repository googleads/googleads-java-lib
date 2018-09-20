// Copyright 2018 Google LLC
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
 * ImageAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents an image asset.
 */
public class ImageAsset  extends com.google.api.ads.adwords.axis.v201809.cm.Asset  implements java.io.Serializable {
    /* The raw data of an image. Mutate only field. */
    private byte[] imageData;

    /* File size of the image.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ImageFileSize".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Long imageFileSize;

    /* The mime type of the image.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ImageMimeType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.MediaMimeType imageMimeType;

    /* Information specific to the image in its original, "full" size
     * dimensions.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.ImageDimensionInfo fullSizeInfo;

    public ImageAsset() {
    }

    public ImageAsset(
           java.lang.Long assetId,
           java.lang.String assetName,
           com.google.api.ads.adwords.axis.v201809.cm.AssetType assetSubtype,
           com.google.api.ads.adwords.axis.v201809.cm.AssetStatus assetStatus,
           java.lang.String assetType,
           byte[] imageData,
           java.lang.Long imageFileSize,
           com.google.api.ads.adwords.axis.v201809.cm.MediaMimeType imageMimeType,
           com.google.api.ads.adwords.axis.v201809.cm.ImageDimensionInfo fullSizeInfo) {
        super(
            assetId,
            assetName,
            assetSubtype,
            assetStatus,
            assetType);
        this.imageData = imageData;
        this.imageFileSize = imageFileSize;
        this.imageMimeType = imageMimeType;
        this.fullSizeInfo = fullSizeInfo;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("assetId", getAssetId())
            .add("assetName", getAssetName())
            .add("assetStatus", getAssetStatus())
            .add("assetSubtype", getAssetSubtype())
            .add("assetType", getAssetType())
            .add("fullSizeInfo", getFullSizeInfo())
            .add("imageData", getImageData())
            .add("imageFileSize", getImageFileSize())
            .add("imageMimeType", getImageMimeType())
            .toString();
    }

    /**
     * Gets the imageData value for this ImageAsset.
     * 
     * @return imageData   * The raw data of an image. Mutate only field.
     */
    public byte[] getImageData() {
        return imageData;
    }


    /**
     * Sets the imageData value for this ImageAsset.
     * 
     * @param imageData   * The raw data of an image. Mutate only field.
     */
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }


    /**
     * Gets the imageFileSize value for this ImageAsset.
     * 
     * @return imageFileSize   * File size of the image.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ImageFileSize".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getImageFileSize() {
        return imageFileSize;
    }


    /**
     * Sets the imageFileSize value for this ImageAsset.
     * 
     * @param imageFileSize   * File size of the image.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ImageFileSize".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setImageFileSize(java.lang.Long imageFileSize) {
        this.imageFileSize = imageFileSize;
    }


    /**
     * Gets the imageMimeType value for this ImageAsset.
     * 
     * @return imageMimeType   * The mime type of the image.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ImageMimeType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.MediaMimeType getImageMimeType() {
        return imageMimeType;
    }


    /**
     * Sets the imageMimeType value for this ImageAsset.
     * 
     * @param imageMimeType   * The mime type of the image.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ImageMimeType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setImageMimeType(com.google.api.ads.adwords.axis.v201809.cm.MediaMimeType imageMimeType) {
        this.imageMimeType = imageMimeType;
    }


    /**
     * Gets the fullSizeInfo value for this ImageAsset.
     * 
     * @return fullSizeInfo   * Information specific to the image in its original, "full" size
     * dimensions.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.ImageDimensionInfo getFullSizeInfo() {
        return fullSizeInfo;
    }


    /**
     * Sets the fullSizeInfo value for this ImageAsset.
     * 
     * @param fullSizeInfo   * Information specific to the image in its original, "full" size
     * dimensions.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setFullSizeInfo(com.google.api.ads.adwords.axis.v201809.cm.ImageDimensionInfo fullSizeInfo) {
        this.fullSizeInfo = fullSizeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageAsset)) return false;
        ImageAsset other = (ImageAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.imageData==null && other.getImageData()==null) || 
             (this.imageData!=null &&
              java.util.Arrays.equals(this.imageData, other.getImageData()))) &&
            ((this.imageFileSize==null && other.getImageFileSize()==null) || 
             (this.imageFileSize!=null &&
              this.imageFileSize.equals(other.getImageFileSize()))) &&
            ((this.imageMimeType==null && other.getImageMimeType()==null) || 
             (this.imageMimeType!=null &&
              this.imageMimeType.equals(other.getImageMimeType()))) &&
            ((this.fullSizeInfo==null && other.getFullSizeInfo()==null) || 
             (this.fullSizeInfo!=null &&
              this.fullSizeInfo.equals(other.getFullSizeInfo())));
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
        if (getImageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImageFileSize() != null) {
            _hashCode += getImageFileSize().hashCode();
        }
        if (getImageMimeType() != null) {
            _hashCode += getImageMimeType().hashCode();
        }
        if (getFullSizeInfo() != null) {
            _hashCode += getFullSizeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ImageAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "imageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "imageFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageMimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "imageMimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MediaMimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullSizeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "fullSizeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ImageDimensionInfo"));
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
