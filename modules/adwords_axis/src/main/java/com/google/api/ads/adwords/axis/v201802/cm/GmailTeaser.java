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
 * GmailTeaser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents Gmail teaser specific data.
 */
public class GmailTeaser  implements java.io.Serializable {
    /* Headline of the teaser. Maximum display width is 25 characters.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.String headline;

    /* Description of the teaser. Maximum display width is 90 characters.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.String description;

    /* Business name of the advertiser. Maximum display width is 20
     * characters.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String businessName;

    /* Required. Logo image. An image must first be created using
     * the MediaService, and Image.mediaId
     *                 must be populated when creating a {@link "GmailTeaser"}.
     * Valid image types are GIF, JPEG, and
     *                 PNG. The minimum size is 144x144 and the aspect ratio
     * must be 1:1 (+-1%). Required. */
    private com.google.api.ads.adwords.axis.v201802.cm.Image logoImage;

    public GmailTeaser() {
    }

    public GmailTeaser(
           java.lang.String headline,
           java.lang.String description,
           java.lang.String businessName,
           com.google.api.ads.adwords.axis.v201802.cm.Image logoImage) {
           this.headline = headline;
           this.description = description;
           this.businessName = businessName;
           this.logoImage = logoImage;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("businessName", getBusinessName())
            .add("description", getDescription())
            .add("headline", getHeadline())
            .add("logoImage", getLogoImage())
            .toString();
    }

    /**
     * Gets the headline value for this GmailTeaser.
     * 
     * @return headline   * Headline of the teaser. Maximum display width is 25 characters.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this GmailTeaser.
     * 
     * @param headline   * Headline of the teaser. Maximum display width is 25 characters.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the description value for this GmailTeaser.
     * 
     * @return description   * Description of the teaser. Maximum display width is 90 characters.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GmailTeaser.
     * 
     * @param description   * Description of the teaser. Maximum display width is 90 characters.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the businessName value for this GmailTeaser.
     * 
     * @return businessName   * Business name of the advertiser. Maximum display width is 20
     * characters.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this GmailTeaser.
     * 
     * @param businessName   * Business name of the advertiser. Maximum display width is 20
     * characters.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the logoImage value for this GmailTeaser.
     * 
     * @return logoImage   * Required. Logo image. An image must first be created using
     * the MediaService, and Image.mediaId
     *                 must be populated when creating a {@link "GmailTeaser"}.
     * Valid image types are GIF, JPEG, and
     *                 PNG. The minimum size is 144x144 and the aspect ratio
     * must be 1:1 (+-1%). Required.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getLogoImage() {
        return logoImage;
    }


    /**
     * Sets the logoImage value for this GmailTeaser.
     * 
     * @param logoImage   * Required. Logo image. An image must first be created using
     * the MediaService, and Image.mediaId
     *                 must be populated when creating a {@link "GmailTeaser"}.
     * Valid image types are GIF, JPEG, and
     *                 PNG. The minimum size is 144x144 and the aspect ratio
     * must be 1:1 (+-1%). Required.
     */
    public void setLogoImage(com.google.api.ads.adwords.axis.v201802.cm.Image logoImage) {
        this.logoImage = logoImage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GmailTeaser)) return false;
        GmailTeaser other = (GmailTeaser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.logoImage==null && other.getLogoImage()==null) || 
             (this.logoImage!=null &&
              this.logoImage.equals(other.getLogoImage())));
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
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getLogoImage() != null) {
            _hashCode += getLogoImage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GmailTeaser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GmailTeaser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "logoImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
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
