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
 * ImageDimensionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Information about an image asset in specfic dimensions, either
 * original or resized.
 */
public class ImageDimensionInfo  implements java.io.Serializable {
    /* Height of the image.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageHeight".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer imageHeight;

    /* Width of the image.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageWidth".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer imageWidth;

    /* URL pointing to the image in the specified height & width.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageFullSizeUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String imageUrl;

    public ImageDimensionInfo() {
    }

    public ImageDimensionInfo(
           java.lang.Integer imageHeight,
           java.lang.Integer imageWidth,
           java.lang.String imageUrl) {
           this.imageHeight = imageHeight;
           this.imageWidth = imageWidth;
           this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("imageHeight", getImageHeight())
            .add("imageUrl", getImageUrl())
            .add("imageWidth", getImageWidth())
            .toString();
    }

    /**
     * Gets the imageHeight value for this ImageDimensionInfo.
     * 
     * @return imageHeight   * Height of the image.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageHeight".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getImageHeight() {
        return imageHeight;
    }


    /**
     * Sets the imageHeight value for this ImageDimensionInfo.
     * 
     * @param imageHeight   * Height of the image.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageHeight".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setImageHeight(java.lang.Integer imageHeight) {
        this.imageHeight = imageHeight;
    }


    /**
     * Gets the imageWidth value for this ImageDimensionInfo.
     * 
     * @return imageWidth   * Width of the image.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageWidth".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getImageWidth() {
        return imageWidth;
    }


    /**
     * Sets the imageWidth value for this ImageDimensionInfo.
     * 
     * @param imageWidth   * Width of the image.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageWidth".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setImageWidth(java.lang.Integer imageWidth) {
        this.imageWidth = imageWidth;
    }


    /**
     * Gets the imageUrl value for this ImageDimensionInfo.
     * 
     * @return imageUrl   * URL pointing to the image in the specified height & width.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageFullSizeUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this ImageDimensionInfo.
     * 
     * @param imageUrl   * URL pointing to the image in the specified height & width.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ImageFullSizeUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageDimensionInfo)) return false;
        ImageDimensionInfo other = (ImageDimensionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imageHeight==null && other.getImageHeight()==null) || 
             (this.imageHeight!=null &&
              this.imageHeight.equals(other.getImageHeight()))) &&
            ((this.imageWidth==null && other.getImageWidth()==null) || 
             (this.imageWidth!=null &&
              this.imageWidth.equals(other.getImageWidth()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl())));
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
        if (getImageHeight() != null) {
            _hashCode += getImageHeight().hashCode();
        }
        if (getImageWidth() != null) {
            _hashCode += getImageWidth().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageDimensionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ImageDimensionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "imageHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "imageWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "imageUrl"));
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
