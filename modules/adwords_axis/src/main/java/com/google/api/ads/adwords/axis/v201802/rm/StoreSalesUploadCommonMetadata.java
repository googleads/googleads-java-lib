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
 * StoreSalesUploadCommonMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Common metadata for Store Sales uploads.
 */
public abstract class StoreSalesUploadCommonMetadata  implements java.io.Serializable {
    /* This is the fraction of overall sales which you can associate
     * with a customer loyalty program.
     *                 The fraction needs to be between 0 and 1 (excluding
     * 0).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Double loyaltyRate;

    /* This is the ratio of sales you?re uploading compared to the
     * overall sales that you can
     *                 associate with a customer. The fraction needs to be
     * between 0 and 1. For example, if you upload
     *                 half the sales that you are able to associate with
     * a customer, your Transaction Upload Rate
     *                 would be 0.5 (excluding 0).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Double transactionUploadRate;

    /* Indicates that this instance is a subtype of StoreSalesUploadCommonMetadata.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String storeSalesUploadCommonMetadataType;

    public StoreSalesUploadCommonMetadata() {
    }

    public StoreSalesUploadCommonMetadata(
           java.lang.Double loyaltyRate,
           java.lang.Double transactionUploadRate,
           java.lang.String storeSalesUploadCommonMetadataType) {
           this.loyaltyRate = loyaltyRate;
           this.transactionUploadRate = transactionUploadRate;
           this.storeSalesUploadCommonMetadataType = storeSalesUploadCommonMetadataType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("loyaltyRate", getLoyaltyRate())
            .add("storeSalesUploadCommonMetadataType", getStoreSalesUploadCommonMetadataType())
            .add("transactionUploadRate", getTransactionUploadRate())
            .toString();
    }

    /**
     * Gets the loyaltyRate value for this StoreSalesUploadCommonMetadata.
     * 
     * @return loyaltyRate   * This is the fraction of overall sales which you can associate
     * with a customer loyalty program.
     *                 The fraction needs to be between 0 and 1 (excluding
     * 0).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Double getLoyaltyRate() {
        return loyaltyRate;
    }


    /**
     * Sets the loyaltyRate value for this StoreSalesUploadCommonMetadata.
     * 
     * @param loyaltyRate   * This is the fraction of overall sales which you can associate
     * with a customer loyalty program.
     *                 The fraction needs to be between 0 and 1 (excluding
     * 0).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setLoyaltyRate(java.lang.Double loyaltyRate) {
        this.loyaltyRate = loyaltyRate;
    }


    /**
     * Gets the transactionUploadRate value for this StoreSalesUploadCommonMetadata.
     * 
     * @return transactionUploadRate   * This is the ratio of sales you?re uploading compared to the
     * overall sales that you can
     *                 associate with a customer. The fraction needs to be
     * between 0 and 1. For example, if you upload
     *                 half the sales that you are able to associate with
     * a customer, your Transaction Upload Rate
     *                 would be 0.5 (excluding 0).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Double getTransactionUploadRate() {
        return transactionUploadRate;
    }


    /**
     * Sets the transactionUploadRate value for this StoreSalesUploadCommonMetadata.
     * 
     * @param transactionUploadRate   * This is the ratio of sales you?re uploading compared to the
     * overall sales that you can
     *                 associate with a customer. The fraction needs to be
     * between 0 and 1. For example, if you upload
     *                 half the sales that you are able to associate with
     * a customer, your Transaction Upload Rate
     *                 would be 0.5 (excluding 0).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTransactionUploadRate(java.lang.Double transactionUploadRate) {
        this.transactionUploadRate = transactionUploadRate;
    }


    /**
     * Gets the storeSalesUploadCommonMetadataType value for this StoreSalesUploadCommonMetadata.
     * 
     * @return storeSalesUploadCommonMetadataType   * Indicates that this instance is a subtype of StoreSalesUploadCommonMetadata.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getStoreSalesUploadCommonMetadataType() {
        return storeSalesUploadCommonMetadataType;
    }


    /**
     * Sets the storeSalesUploadCommonMetadataType value for this StoreSalesUploadCommonMetadata.
     * 
     * @param storeSalesUploadCommonMetadataType   * Indicates that this instance is a subtype of StoreSalesUploadCommonMetadata.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setStoreSalesUploadCommonMetadataType(java.lang.String storeSalesUploadCommonMetadataType) {
        this.storeSalesUploadCommonMetadataType = storeSalesUploadCommonMetadataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreSalesUploadCommonMetadata)) return false;
        StoreSalesUploadCommonMetadata other = (StoreSalesUploadCommonMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loyaltyRate==null && other.getLoyaltyRate()==null) || 
             (this.loyaltyRate!=null &&
              this.loyaltyRate.equals(other.getLoyaltyRate()))) &&
            ((this.transactionUploadRate==null && other.getTransactionUploadRate()==null) || 
             (this.transactionUploadRate!=null &&
              this.transactionUploadRate.equals(other.getTransactionUploadRate()))) &&
            ((this.storeSalesUploadCommonMetadataType==null && other.getStoreSalesUploadCommonMetadataType()==null) || 
             (this.storeSalesUploadCommonMetadataType!=null &&
              this.storeSalesUploadCommonMetadataType.equals(other.getStoreSalesUploadCommonMetadataType())));
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
        if (getLoyaltyRate() != null) {
            _hashCode += getLoyaltyRate().hashCode();
        }
        if (getTransactionUploadRate() != null) {
            _hashCode += getTransactionUploadRate().hashCode();
        }
        if (getStoreSalesUploadCommonMetadataType() != null) {
            _hashCode += getStoreSalesUploadCommonMetadataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreSalesUploadCommonMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "StoreSalesUploadCommonMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loyaltyRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "loyaltyRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionUploadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "transactionUploadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeSalesUploadCommonMetadataType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "StoreSalesUploadCommonMetadata.Type"));
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
