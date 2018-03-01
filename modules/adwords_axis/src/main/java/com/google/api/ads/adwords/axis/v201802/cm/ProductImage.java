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
 * ProductImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents product image specific data.
 */
public class ProductImage  implements java.io.Serializable {
    /* Product image. An image must first be created using the MediaService,
     * and Image.mediaId must be
     *                 populated when creating a {@link "ProductImage"}.
     * Valid image types are GIF, JPEG, and PNG. The
     *                 minimum size is 300x300 and the aspect ratio must
     * be 1:1 (+-1%).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Image productImage;

    /* Description of the product. Maximum display width is 15 characters. */
    private java.lang.String description;

    /* Display-call-to-action of the product image. The DisplayCallToAction.textColor
     * field cannot be
     *                 set when setting this field. */
    private com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction displayCallToAction;

    public ProductImage() {
    }

    public ProductImage(
           com.google.api.ads.adwords.axis.v201802.cm.Image productImage,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction displayCallToAction) {
           this.productImage = productImage;
           this.description = description;
           this.displayCallToAction = displayCallToAction;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("displayCallToAction", getDisplayCallToAction())
            .add("productImage", getProductImage())
            .toString();
    }

    /**
     * Gets the productImage value for this ProductImage.
     * 
     * @return productImage   * Product image. An image must first be created using the MediaService,
     * and Image.mediaId must be
     *                 populated when creating a {@link "ProductImage"}.
     * Valid image types are GIF, JPEG, and PNG. The
     *                 minimum size is 300x300 and the aspect ratio must
     * be 1:1 (+-1%).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getProductImage() {
        return productImage;
    }


    /**
     * Sets the productImage value for this ProductImage.
     * 
     * @param productImage   * Product image. An image must first be created using the MediaService,
     * and Image.mediaId must be
     *                 populated when creating a {@link "ProductImage"}.
     * Valid image types are GIF, JPEG, and PNG. The
     *                 minimum size is 300x300 and the aspect ratio must
     * be 1:1 (+-1%).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setProductImage(com.google.api.ads.adwords.axis.v201802.cm.Image productImage) {
        this.productImage = productImage;
    }


    /**
     * Gets the description value for this ProductImage.
     * 
     * @return description   * Description of the product. Maximum display width is 15 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductImage.
     * 
     * @param description   * Description of the product. Maximum display width is 15 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayCallToAction value for this ProductImage.
     * 
     * @return displayCallToAction   * Display-call-to-action of the product image. The DisplayCallToAction.textColor
     * field cannot be
     *                 set when setting this field.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction getDisplayCallToAction() {
        return displayCallToAction;
    }


    /**
     * Sets the displayCallToAction value for this ProductImage.
     * 
     * @param displayCallToAction   * Display-call-to-action of the product image. The DisplayCallToAction.textColor
     * field cannot be
     *                 set when setting this field.
     */
    public void setDisplayCallToAction(com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction displayCallToAction) {
        this.displayCallToAction = displayCallToAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductImage)) return false;
        ProductImage other = (ProductImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productImage==null && other.getProductImage()==null) || 
             (this.productImage!=null &&
              this.productImage.equals(other.getProductImage()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayCallToAction==null && other.getDisplayCallToAction()==null) || 
             (this.displayCallToAction!=null &&
              this.displayCallToAction.equals(other.getDisplayCallToAction())));
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
        if (getProductImage() != null) {
            _hashCode += getProductImage().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayCallToAction() != null) {
            _hashCode += getDisplayCallToAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "productImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
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
        elemField.setFieldName("displayCallToAction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayCallToAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayCallToAction"));
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
