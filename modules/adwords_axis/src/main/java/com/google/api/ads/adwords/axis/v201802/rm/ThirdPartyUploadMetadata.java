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
 * ThirdPartyUploadMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Metadata for a Third party Store Sales upload.
 *             Note: This is a whitelisted only product. Please contact
 * your Google business development
 *             representative for details on upload configuration.
 */
public class ThirdPartyUploadMetadata  extends com.google.api.ads.adwords.axis.v201802.rm.StoreSalesUploadCommonMetadata  implements java.io.Serializable {
    /* Advertiser upload time to partner.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String advertiserUploadTime;

    /* The fraction of transactions that are valid. Invalid transactions
     * may include invalid format,
     *                     values. Range (0.0 to 1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Double validTransactionRate;

    /* The fraction of valid transactions that are matched to an external
     * user id on the partner side.
     *                     Range (0.0 to 1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Double partnerMatchRate;

    /* The fraction of valid transactions that are uploaded by the
     * partner to Google. Range (0.0 to
     *                     1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Double partnerUploadRate;

    /* Indicates the version of partnerIds to be used for uploads.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.String bridgeMapVersionId;

    /* The ID of the third party partner uploading the transaction
     * feed.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Integer partnerId;

    public ThirdPartyUploadMetadata() {
    }

    public ThirdPartyUploadMetadata(
           java.lang.Double loyaltyRate,
           java.lang.Double transactionUploadRate,
           java.lang.String storeSalesUploadCommonMetadataType,
           java.lang.String advertiserUploadTime,
           java.lang.Double validTransactionRate,
           java.lang.Double partnerMatchRate,
           java.lang.Double partnerUploadRate,
           java.lang.String bridgeMapVersionId,
           java.lang.Integer partnerId) {
        super(
            loyaltyRate,
            transactionUploadRate,
            storeSalesUploadCommonMetadataType);
        this.advertiserUploadTime = advertiserUploadTime;
        this.validTransactionRate = validTransactionRate;
        this.partnerMatchRate = partnerMatchRate;
        this.partnerUploadRate = partnerUploadRate;
        this.bridgeMapVersionId = bridgeMapVersionId;
        this.partnerId = partnerId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserUploadTime", getAdvertiserUploadTime())
            .add("bridgeMapVersionId", getBridgeMapVersionId())
            .add("loyaltyRate", getLoyaltyRate())
            .add("partnerId", getPartnerId())
            .add("partnerMatchRate", getPartnerMatchRate())
            .add("partnerUploadRate", getPartnerUploadRate())
            .add("storeSalesUploadCommonMetadataType", getStoreSalesUploadCommonMetadataType())
            .add("transactionUploadRate", getTransactionUploadRate())
            .add("validTransactionRate", getValidTransactionRate())
            .toString();
    }

    /**
     * Gets the advertiserUploadTime value for this ThirdPartyUploadMetadata.
     * 
     * @return advertiserUploadTime   * Advertiser upload time to partner.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getAdvertiserUploadTime() {
        return advertiserUploadTime;
    }


    /**
     * Sets the advertiserUploadTime value for this ThirdPartyUploadMetadata.
     * 
     * @param advertiserUploadTime   * Advertiser upload time to partner.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setAdvertiserUploadTime(java.lang.String advertiserUploadTime) {
        this.advertiserUploadTime = advertiserUploadTime;
    }


    /**
     * Gets the validTransactionRate value for this ThirdPartyUploadMetadata.
     * 
     * @return validTransactionRate   * The fraction of transactions that are valid. Invalid transactions
     * may include invalid format,
     *                     values. Range (0.0 to 1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Double getValidTransactionRate() {
        return validTransactionRate;
    }


    /**
     * Sets the validTransactionRate value for this ThirdPartyUploadMetadata.
     * 
     * @param validTransactionRate   * The fraction of transactions that are valid. Invalid transactions
     * may include invalid format,
     *                     values. Range (0.0 to 1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setValidTransactionRate(java.lang.Double validTransactionRate) {
        this.validTransactionRate = validTransactionRate;
    }


    /**
     * Gets the partnerMatchRate value for this ThirdPartyUploadMetadata.
     * 
     * @return partnerMatchRate   * The fraction of valid transactions that are matched to an external
     * user id on the partner side.
     *                     Range (0.0 to 1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Double getPartnerMatchRate() {
        return partnerMatchRate;
    }


    /**
     * Sets the partnerMatchRate value for this ThirdPartyUploadMetadata.
     * 
     * @param partnerMatchRate   * The fraction of valid transactions that are matched to an external
     * user id on the partner side.
     *                     Range (0.0 to 1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setPartnerMatchRate(java.lang.Double partnerMatchRate) {
        this.partnerMatchRate = partnerMatchRate;
    }


    /**
     * Gets the partnerUploadRate value for this ThirdPartyUploadMetadata.
     * 
     * @return partnerUploadRate   * The fraction of valid transactions that are uploaded by the
     * partner to Google. Range (0.0 to
     *                     1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Double getPartnerUploadRate() {
        return partnerUploadRate;
    }


    /**
     * Sets the partnerUploadRate value for this ThirdPartyUploadMetadata.
     * 
     * @param partnerUploadRate   * The fraction of valid transactions that are uploaded by the
     * partner to Google. Range (0.0 to
     *                     1.0]
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setPartnerUploadRate(java.lang.Double partnerUploadRate) {
        this.partnerUploadRate = partnerUploadRate;
    }


    /**
     * Gets the bridgeMapVersionId value for this ThirdPartyUploadMetadata.
     * 
     * @return bridgeMapVersionId   * Indicates the version of partnerIds to be used for uploads.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.String getBridgeMapVersionId() {
        return bridgeMapVersionId;
    }


    /**
     * Sets the bridgeMapVersionId value for this ThirdPartyUploadMetadata.
     * 
     * @param bridgeMapVersionId   * Indicates the version of partnerIds to be used for uploads.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setBridgeMapVersionId(java.lang.String bridgeMapVersionId) {
        this.bridgeMapVersionId = bridgeMapVersionId;
    }


    /**
     * Gets the partnerId value for this ThirdPartyUploadMetadata.
     * 
     * @return partnerId   * The ID of the third party partner uploading the transaction
     * feed.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Integer getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this ThirdPartyUploadMetadata.
     * 
     * @param partnerId   * The ID of the third party partner uploading the transaction
     * feed.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setPartnerId(java.lang.Integer partnerId) {
        this.partnerId = partnerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyUploadMetadata)) return false;
        ThirdPartyUploadMetadata other = (ThirdPartyUploadMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advertiserUploadTime==null && other.getAdvertiserUploadTime()==null) || 
             (this.advertiserUploadTime!=null &&
              this.advertiserUploadTime.equals(other.getAdvertiserUploadTime()))) &&
            ((this.validTransactionRate==null && other.getValidTransactionRate()==null) || 
             (this.validTransactionRate!=null &&
              this.validTransactionRate.equals(other.getValidTransactionRate()))) &&
            ((this.partnerMatchRate==null && other.getPartnerMatchRate()==null) || 
             (this.partnerMatchRate!=null &&
              this.partnerMatchRate.equals(other.getPartnerMatchRate()))) &&
            ((this.partnerUploadRate==null && other.getPartnerUploadRate()==null) || 
             (this.partnerUploadRate!=null &&
              this.partnerUploadRate.equals(other.getPartnerUploadRate()))) &&
            ((this.bridgeMapVersionId==null && other.getBridgeMapVersionId()==null) || 
             (this.bridgeMapVersionId!=null &&
              this.bridgeMapVersionId.equals(other.getBridgeMapVersionId()))) &&
            ((this.partnerId==null && other.getPartnerId()==null) || 
             (this.partnerId!=null &&
              this.partnerId.equals(other.getPartnerId())));
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
        if (getAdvertiserUploadTime() != null) {
            _hashCode += getAdvertiserUploadTime().hashCode();
        }
        if (getValidTransactionRate() != null) {
            _hashCode += getValidTransactionRate().hashCode();
        }
        if (getPartnerMatchRate() != null) {
            _hashCode += getPartnerMatchRate().hashCode();
        }
        if (getPartnerUploadRate() != null) {
            _hashCode += getPartnerUploadRate().hashCode();
        }
        if (getBridgeMapVersionId() != null) {
            _hashCode += getBridgeMapVersionId().hashCode();
        }
        if (getPartnerId() != null) {
            _hashCode += getPartnerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyUploadMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "ThirdPartyUploadMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserUploadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "advertiserUploadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTransactionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "validTransactionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerMatchRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "partnerMatchRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerUploadRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "partnerUploadRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeMapVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "bridgeMapVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "partnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
