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
 * CompanySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Settings for a {@link Company}.
 */
public class CompanySettings  implements java.io.Serializable {
    /* Default billing cap for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or
     *                 {@link BillingSource} is {@link BillingSource#CONTRACTED}.
     * It is allowed that all of the BillingCap, BillingSchedule, BillingSource
     * are null when the company has no setting about these values. */
    private com.google.api.ads.dfp.axis.v201802.BillingCap billingCap;

    /* Default billing schedule for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or
     *                 {@link BillingSource} is not {@link BillingSource#CONTRACTED}.
     * It is allowed that all of the BillingCap, BillingSchedule, BillingSource
     * are null when the company has no setting about these values. */
    private com.google.api.ads.dfp.axis.v201802.BillingSchedule billingSchedule;

    /* Default billing source for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled.
     *                 It is allowed that all of the BillingCap, BillingSchedule,
     * BillingSource
     *                 are null when the company has no setting about these
     * values. */
    private com.google.api.ads.dfp.axis.v201802.BillingSource billingSource;

    /* Default advertiser discount for {@link Proposal proposals}
     * created by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000). */
    private java.lang.Long advertiserDiscount;

    /* Default value added tax for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000). */
    private java.lang.Long valueAddedTax;

    /* Default agency commission for {@link Proposal proposals} associated
     * with the {@link Company}
     *                 of type {@link Company.Type#AGENCY} in DFP Sales Manager.
     * Return null if the default billing setting feature is disabled or
     * the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000). */
    private java.lang.Long agencyCommission;

    public CompanySettings() {
    }

    public CompanySettings(
           com.google.api.ads.dfp.axis.v201802.BillingCap billingCap,
           com.google.api.ads.dfp.axis.v201802.BillingSchedule billingSchedule,
           com.google.api.ads.dfp.axis.v201802.BillingSource billingSource,
           java.lang.Long advertiserDiscount,
           java.lang.Long valueAddedTax,
           java.lang.Long agencyCommission) {
           this.billingCap = billingCap;
           this.billingSchedule = billingSchedule;
           this.billingSource = billingSource;
           this.advertiserDiscount = advertiserDiscount;
           this.valueAddedTax = valueAddedTax;
           this.agencyCommission = agencyCommission;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserDiscount", getAdvertiserDiscount())
            .add("agencyCommission", getAgencyCommission())
            .add("billingCap", getBillingCap())
            .add("billingSchedule", getBillingSchedule())
            .add("billingSource", getBillingSource())
            .add("valueAddedTax", getValueAddedTax())
            .toString();
    }

    /**
     * Gets the billingCap value for this CompanySettings.
     * 
     * @return billingCap   * Default billing cap for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or
     *                 {@link BillingSource} is {@link BillingSource#CONTRACTED}.
     * It is allowed that all of the BillingCap, BillingSchedule, BillingSource
     * are null when the company has no setting about these values.
     */
    public com.google.api.ads.dfp.axis.v201802.BillingCap getBillingCap() {
        return billingCap;
    }


    /**
     * Sets the billingCap value for this CompanySettings.
     * 
     * @param billingCap   * Default billing cap for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or
     *                 {@link BillingSource} is {@link BillingSource#CONTRACTED}.
     * It is allowed that all of the BillingCap, BillingSchedule, BillingSource
     * are null when the company has no setting about these values.
     */
    public void setBillingCap(com.google.api.ads.dfp.axis.v201802.BillingCap billingCap) {
        this.billingCap = billingCap;
    }


    /**
     * Gets the billingSchedule value for this CompanySettings.
     * 
     * @return billingSchedule   * Default billing schedule for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or
     *                 {@link BillingSource} is not {@link BillingSource#CONTRACTED}.
     * It is allowed that all of the BillingCap, BillingSchedule, BillingSource
     * are null when the company has no setting about these values.
     */
    public com.google.api.ads.dfp.axis.v201802.BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this CompanySettings.
     * 
     * @param billingSchedule   * Default billing schedule for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or
     *                 {@link BillingSource} is not {@link BillingSource#CONTRACTED}.
     * It is allowed that all of the BillingCap, BillingSchedule, BillingSource
     * are null when the company has no setting about these values.
     */
    public void setBillingSchedule(com.google.api.ads.dfp.axis.v201802.BillingSchedule billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the billingSource value for this CompanySettings.
     * 
     * @return billingSource   * Default billing source for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled.
     *                 It is allowed that all of the BillingCap, BillingSchedule,
     * BillingSource
     *                 are null when the company has no setting about these
     * values.
     */
    public com.google.api.ads.dfp.axis.v201802.BillingSource getBillingSource() {
        return billingSource;
    }


    /**
     * Sets the billingSource value for this CompanySettings.
     * 
     * @param billingSource   * Default billing source for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled.
     *                 It is allowed that all of the BillingCap, BillingSchedule,
     * BillingSource
     *                 are null when the company has no setting about these
     * values.
     */
    public void setBillingSource(com.google.api.ads.dfp.axis.v201802.BillingSource billingSource) {
        this.billingSource = billingSource;
    }


    /**
     * Gets the advertiserDiscount value for this CompanySettings.
     * 
     * @return advertiserDiscount   * Default advertiser discount for {@link Proposal proposals}
     * created by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000).
     */
    public java.lang.Long getAdvertiserDiscount() {
        return advertiserDiscount;
    }


    /**
     * Sets the advertiserDiscount value for this CompanySettings.
     * 
     * @param advertiserDiscount   * Default advertiser discount for {@link Proposal proposals}
     * created by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000).
     */
    public void setAdvertiserDiscount(java.lang.Long advertiserDiscount) {
        this.advertiserDiscount = advertiserDiscount;
    }


    /**
     * Gets the valueAddedTax value for this CompanySettings.
     * 
     * @return valueAddedTax   * Default value added tax for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000).
     */
    public java.lang.Long getValueAddedTax() {
        return valueAddedTax;
    }


    /**
     * Sets the valueAddedTax value for this CompanySettings.
     * 
     * @param valueAddedTax   * Default value added tax for {@link Proposal proposals} created
     * by the {@link Company}
     *                 of type {@link Company.Type#ADVERTISER} in DFP Sales
     * Manager.
     *                 Return null if default billing setting feature is
     * disabled or the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000).
     */
    public void setValueAddedTax(java.lang.Long valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }


    /**
     * Gets the agencyCommission value for this CompanySettings.
     * 
     * @return agencyCommission   * Default agency commission for {@link Proposal proposals} associated
     * with the {@link Company}
     *                 of type {@link Company.Type#AGENCY} in DFP Sales Manager.
     * Return null if the default billing setting feature is disabled or
     * the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000).
     */
    public java.lang.Long getAgencyCommission() {
        return agencyCommission;
    }


    /**
     * Sets the agencyCommission value for this CompanySettings.
     * 
     * @param agencyCommission   * Default agency commission for {@link Proposal proposals} associated
     * with the {@link Company}
     *                 of type {@link Company.Type#AGENCY} in DFP Sales Manager.
     * Return null if the default billing setting feature is disabled or
     * the company
     *                 has no setting on this value.
     *                 It presents in millipercentage (values 0 to 100000).
     */
    public void setAgencyCommission(java.lang.Long agencyCommission) {
        this.agencyCommission = agencyCommission;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanySettings)) return false;
        CompanySettings other = (CompanySettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingCap==null && other.getBillingCap()==null) || 
             (this.billingCap!=null &&
              this.billingCap.equals(other.getBillingCap()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.billingSource==null && other.getBillingSource()==null) || 
             (this.billingSource!=null &&
              this.billingSource.equals(other.getBillingSource()))) &&
            ((this.advertiserDiscount==null && other.getAdvertiserDiscount()==null) || 
             (this.advertiserDiscount!=null &&
              this.advertiserDiscount.equals(other.getAdvertiserDiscount()))) &&
            ((this.valueAddedTax==null && other.getValueAddedTax()==null) || 
             (this.valueAddedTax!=null &&
              this.valueAddedTax.equals(other.getValueAddedTax()))) &&
            ((this.agencyCommission==null && other.getAgencyCommission()==null) || 
             (this.agencyCommission!=null &&
              this.agencyCommission.equals(other.getAgencyCommission())));
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
        if (getBillingCap() != null) {
            _hashCode += getBillingCap().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getBillingSource() != null) {
            _hashCode += getBillingSource().hashCode();
        }
        if (getAdvertiserDiscount() != null) {
            _hashCode += getAdvertiserDiscount().hashCode();
        }
        if (getValueAddedTax() != null) {
            _hashCode += getValueAddedTax().hashCode();
        }
        if (getAgencyCommission() != null) {
            _hashCode += getAgencyCommission().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanySettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanySettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "advertiserDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueAddedTax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "valueAddedTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "agencyCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
