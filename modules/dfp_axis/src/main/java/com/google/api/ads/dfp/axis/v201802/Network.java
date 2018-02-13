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
 * Network.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * {@code Network} represents a network.
 */
public class Network  implements java.io.Serializable {
    /* The unique ID of the {@code Network}. This value is readonly
     * and is assigned
     *                 by Google. */
    private java.lang.Long id;

    /* The display name of the network. */
    private java.lang.String displayName;

    /* The network code. If the current login has access to multiple
     * networks,
     *                 then the network code must be provided in the SOAP
     * request headers for all
     *                 requests. Otherwise, it is optional to provide the
     * network code in the SOAP
     *                 headers. This field is read-only. */
    private java.lang.String networkCode;

    /* The property code. This field is read-only. */
    private java.lang.String propertyCode;

    /* The time zone associated with the delivery of orders and reporting.
     * This
     *                 field is read-only. */
    private java.lang.String timeZone;

    /* The primary currency code. This field is read-only. */
    private java.lang.String currencyCode;

    /* Currencies that can be used as an alternative to the {@link
     * Network#currencyCode} for
     *                 trafficking {@link LineItem line items}. */
    private java.lang.String[] secondaryCurrencyCodes;

    /* The {@link AdUnit#id} of the top most ad unit to which descendant
     * ad units
     *                 can be added. Should be used for the {@link AdUnit#parentId}
     * when first
     *                 building inventory hierarchy. This field is read-only. */
    private java.lang.String effectiveRootAdUnitId;

    /* Whether this is a test network.  This field is read-only. */
    private java.lang.Boolean isTest;

    public Network() {
    }

    public Network(
           java.lang.Long id,
           java.lang.String displayName,
           java.lang.String networkCode,
           java.lang.String propertyCode,
           java.lang.String timeZone,
           java.lang.String currencyCode,
           java.lang.String[] secondaryCurrencyCodes,
           java.lang.String effectiveRootAdUnitId,
           java.lang.Boolean isTest) {
           this.id = id;
           this.displayName = displayName;
           this.networkCode = networkCode;
           this.propertyCode = propertyCode;
           this.timeZone = timeZone;
           this.currencyCode = currencyCode;
           this.secondaryCurrencyCodes = secondaryCurrencyCodes;
           this.effectiveRootAdUnitId = effectiveRootAdUnitId;
           this.isTest = isTest;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("currencyCode", getCurrencyCode())
            .add("displayName", getDisplayName())
            .add("effectiveRootAdUnitId", getEffectiveRootAdUnitId())
            .add("id", getId())
            .add("isTest", getIsTest())
            .add("networkCode", getNetworkCode())
            .add("propertyCode", getPropertyCode())
            .add("secondaryCurrencyCodes", getSecondaryCurrencyCodes())
            .add("timeZone", getTimeZone())
            .toString();
    }

    /**
     * Gets the id value for this Network.
     * 
     * @return id   * The unique ID of the {@code Network}. This value is readonly
     * and is assigned
     *                 by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Network.
     * 
     * @param id   * The unique ID of the {@code Network}. This value is readonly
     * and is assigned
     *                 by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the displayName value for this Network.
     * 
     * @return displayName   * The display name of the network.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this Network.
     * 
     * @param displayName   * The display name of the network.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the networkCode value for this Network.
     * 
     * @return networkCode   * The network code. If the current login has access to multiple
     * networks,
     *                 then the network code must be provided in the SOAP
     * request headers for all
     *                 requests. Otherwise, it is optional to provide the
     * network code in the SOAP
     *                 headers. This field is read-only.
     */
    public java.lang.String getNetworkCode() {
        return networkCode;
    }


    /**
     * Sets the networkCode value for this Network.
     * 
     * @param networkCode   * The network code. If the current login has access to multiple
     * networks,
     *                 then the network code must be provided in the SOAP
     * request headers for all
     *                 requests. Otherwise, it is optional to provide the
     * network code in the SOAP
     *                 headers. This field is read-only.
     */
    public void setNetworkCode(java.lang.String networkCode) {
        this.networkCode = networkCode;
    }


    /**
     * Gets the propertyCode value for this Network.
     * 
     * @return propertyCode   * The property code. This field is read-only.
     */
    public java.lang.String getPropertyCode() {
        return propertyCode;
    }


    /**
     * Sets the propertyCode value for this Network.
     * 
     * @param propertyCode   * The property code. This field is read-only.
     */
    public void setPropertyCode(java.lang.String propertyCode) {
        this.propertyCode = propertyCode;
    }


    /**
     * Gets the timeZone value for this Network.
     * 
     * @return timeZone   * The time zone associated with the delivery of orders and reporting.
     * This
     *                 field is read-only.
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this Network.
     * 
     * @param timeZone   * The time zone associated with the delivery of orders and reporting.
     * This
     *                 field is read-only.
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the currencyCode value for this Network.
     * 
     * @return currencyCode   * The primary currency code. This field is read-only.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Network.
     * 
     * @param currencyCode   * The primary currency code. This field is read-only.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the secondaryCurrencyCodes value for this Network.
     * 
     * @return secondaryCurrencyCodes   * Currencies that can be used as an alternative to the {@link
     * Network#currencyCode} for
     *                 trafficking {@link LineItem line items}.
     */
    public java.lang.String[] getSecondaryCurrencyCodes() {
        return secondaryCurrencyCodes;
    }


    /**
     * Sets the secondaryCurrencyCodes value for this Network.
     * 
     * @param secondaryCurrencyCodes   * Currencies that can be used as an alternative to the {@link
     * Network#currencyCode} for
     *                 trafficking {@link LineItem line items}.
     */
    public void setSecondaryCurrencyCodes(java.lang.String[] secondaryCurrencyCodes) {
        this.secondaryCurrencyCodes = secondaryCurrencyCodes;
    }

    public java.lang.String getSecondaryCurrencyCodes(int i) {
        return this.secondaryCurrencyCodes[i];
    }

    public void setSecondaryCurrencyCodes(int i, java.lang.String _value) {
        this.secondaryCurrencyCodes[i] = _value;
    }


    /**
     * Gets the effectiveRootAdUnitId value for this Network.
     * 
     * @return effectiveRootAdUnitId   * The {@link AdUnit#id} of the top most ad unit to which descendant
     * ad units
     *                 can be added. Should be used for the {@link AdUnit#parentId}
     * when first
     *                 building inventory hierarchy. This field is read-only.
     */
    public java.lang.String getEffectiveRootAdUnitId() {
        return effectiveRootAdUnitId;
    }


    /**
     * Sets the effectiveRootAdUnitId value for this Network.
     * 
     * @param effectiveRootAdUnitId   * The {@link AdUnit#id} of the top most ad unit to which descendant
     * ad units
     *                 can be added. Should be used for the {@link AdUnit#parentId}
     * when first
     *                 building inventory hierarchy. This field is read-only.
     */
    public void setEffectiveRootAdUnitId(java.lang.String effectiveRootAdUnitId) {
        this.effectiveRootAdUnitId = effectiveRootAdUnitId;
    }


    /**
     * Gets the isTest value for this Network.
     * 
     * @return isTest   * Whether this is a test network.  This field is read-only.
     */
    public java.lang.Boolean getIsTest() {
        return isTest;
    }


    /**
     * Sets the isTest value for this Network.
     * 
     * @param isTest   * Whether this is a test network.  This field is read-only.
     */
    public void setIsTest(java.lang.Boolean isTest) {
        this.isTest = isTest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Network)) return false;
        Network other = (Network) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.networkCode==null && other.getNetworkCode()==null) || 
             (this.networkCode!=null &&
              this.networkCode.equals(other.getNetworkCode()))) &&
            ((this.propertyCode==null && other.getPropertyCode()==null) || 
             (this.propertyCode!=null &&
              this.propertyCode.equals(other.getPropertyCode()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.secondaryCurrencyCodes==null && other.getSecondaryCurrencyCodes()==null) || 
             (this.secondaryCurrencyCodes!=null &&
              java.util.Arrays.equals(this.secondaryCurrencyCodes, other.getSecondaryCurrencyCodes()))) &&
            ((this.effectiveRootAdUnitId==null && other.getEffectiveRootAdUnitId()==null) || 
             (this.effectiveRootAdUnitId!=null &&
              this.effectiveRootAdUnitId.equals(other.getEffectiveRootAdUnitId()))) &&
            ((this.isTest==null && other.getIsTest()==null) || 
             (this.isTest!=null &&
              this.isTest.equals(other.getIsTest())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getNetworkCode() != null) {
            _hashCode += getNetworkCode().hashCode();
        }
        if (getPropertyCode() != null) {
            _hashCode += getPropertyCode().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getSecondaryCurrencyCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryCurrencyCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryCurrencyCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveRootAdUnitId() != null) {
            _hashCode += getEffectiveRootAdUnitId().hashCode();
        }
        if (getIsTest() != null) {
            _hashCode += getIsTest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Network.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Network"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "networkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "propertyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryCurrencyCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "secondaryCurrencyCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRootAdUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "effectiveRootAdUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isTest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
