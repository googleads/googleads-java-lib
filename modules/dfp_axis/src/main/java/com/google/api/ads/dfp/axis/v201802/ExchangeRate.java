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
 * ExchangeRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An {@code ExchangeRate} represents a currency which is one of the
 * {@link Network#secondaryCurrencyCodes}, and the latest exchange rate
 * between this currency and
 *             {@link Network#currencyCode}.
 */
public class ExchangeRate  implements java.io.Serializable {
    /* The ID of the {@code ExchangeRate}. This attribute is readonly
     * and is assigned by Google when
     *                 an exchange rate is created. */
    private java.lang.Long id;

    /* The currency code that the {@link #exchangeRate} is related
     * to. The {@link #exchangeRate} is
     *                 between {@link #currencyCode} and {@link Network#currencyCode}.
     * This attribute is required for
     *                 creation and then is readonly. */
    private java.lang.String currencyCode;

    /* The refresh rate at which the exchange rate is updated. This
     * attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.ExchangeRateRefreshRate refreshRate;

    /* The direction that the {@link #exchangeRate} is in. It determines
     * whether the
     *                 {@link #exchangeRate} is from {@link #currencyCode}
     * to {@link Network#currencyCode}, or from
     *                 {@link Network#currencyCode} to {@link #currencyCode}.
     * This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.ExchangeRateDirection direction;

    /* The latest exchange rate at the {@link #refreshRate} and in
     * the {@link #direction}. The value
     *                 is stored as the exchange rate times 10,000,000,000
     * truncated to a long. When the
     *                 {@link #refreshRate} is {@link ExchangeRateRefreshRate#FIXED},
     * this attribute is required. When
     *                 it is not, this attribute is readonly and is assigned
     * by Google with the exchange rate for the
     *                 latest time period. */
    private java.lang.Long exchangeRate;

    public ExchangeRate() {
    }

    public ExchangeRate(
           java.lang.Long id,
           java.lang.String currencyCode,
           com.google.api.ads.dfp.axis.v201802.ExchangeRateRefreshRate refreshRate,
           com.google.api.ads.dfp.axis.v201802.ExchangeRateDirection direction,
           java.lang.Long exchangeRate) {
           this.id = id;
           this.currencyCode = currencyCode;
           this.refreshRate = refreshRate;
           this.direction = direction;
           this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("currencyCode", getCurrencyCode())
            .add("direction", getDirection())
            .add("exchangeRate", getExchangeRate())
            .add("id", getId())
            .add("refreshRate", getRefreshRate())
            .toString();
    }

    /**
     * Gets the id value for this ExchangeRate.
     * 
     * @return id   * The ID of the {@code ExchangeRate}. This attribute is readonly
     * and is assigned by Google when
     *                 an exchange rate is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ExchangeRate.
     * 
     * @param id   * The ID of the {@code ExchangeRate}. This attribute is readonly
     * and is assigned by Google when
     *                 an exchange rate is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the currencyCode value for this ExchangeRate.
     * 
     * @return currencyCode   * The currency code that the {@link #exchangeRate} is related
     * to. The {@link #exchangeRate} is
     *                 between {@link #currencyCode} and {@link Network#currencyCode}.
     * This attribute is required for
     *                 creation and then is readonly.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ExchangeRate.
     * 
     * @param currencyCode   * The currency code that the {@link #exchangeRate} is related
     * to. The {@link #exchangeRate} is
     *                 between {@link #currencyCode} and {@link Network#currencyCode}.
     * This attribute is required for
     *                 creation and then is readonly.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the refreshRate value for this ExchangeRate.
     * 
     * @return refreshRate   * The refresh rate at which the exchange rate is updated. This
     * attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.ExchangeRateRefreshRate getRefreshRate() {
        return refreshRate;
    }


    /**
     * Sets the refreshRate value for this ExchangeRate.
     * 
     * @param refreshRate   * The refresh rate at which the exchange rate is updated. This
     * attribute is required.
     */
    public void setRefreshRate(com.google.api.ads.dfp.axis.v201802.ExchangeRateRefreshRate refreshRate) {
        this.refreshRate = refreshRate;
    }


    /**
     * Gets the direction value for this ExchangeRate.
     * 
     * @return direction   * The direction that the {@link #exchangeRate} is in. It determines
     * whether the
     *                 {@link #exchangeRate} is from {@link #currencyCode}
     * to {@link Network#currencyCode}, or from
     *                 {@link Network#currencyCode} to {@link #currencyCode}.
     * This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.ExchangeRateDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this ExchangeRate.
     * 
     * @param direction   * The direction that the {@link #exchangeRate} is in. It determines
     * whether the
     *                 {@link #exchangeRate} is from {@link #currencyCode}
     * to {@link Network#currencyCode}, or from
     *                 {@link Network#currencyCode} to {@link #currencyCode}.
     * This attribute is required.
     */
    public void setDirection(com.google.api.ads.dfp.axis.v201802.ExchangeRateDirection direction) {
        this.direction = direction;
    }


    /**
     * Gets the exchangeRate value for this ExchangeRate.
     * 
     * @return exchangeRate   * The latest exchange rate at the {@link #refreshRate} and in
     * the {@link #direction}. The value
     *                 is stored as the exchange rate times 10,000,000,000
     * truncated to a long. When the
     *                 {@link #refreshRate} is {@link ExchangeRateRefreshRate#FIXED},
     * this attribute is required. When
     *                 it is not, this attribute is readonly and is assigned
     * by Google with the exchange rate for the
     *                 latest time period.
     */
    public java.lang.Long getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this ExchangeRate.
     * 
     * @param exchangeRate   * The latest exchange rate at the {@link #refreshRate} and in
     * the {@link #direction}. The value
     *                 is stored as the exchange rate times 10,000,000,000
     * truncated to a long. When the
     *                 {@link #refreshRate} is {@link ExchangeRateRefreshRate#FIXED},
     * this attribute is required. When
     *                 it is not, this attribute is readonly and is assigned
     * by Google with the exchange rate for the
     *                 latest time period.
     */
    public void setExchangeRate(java.lang.Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeRate)) return false;
        ExchangeRate other = (ExchangeRate) obj;
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
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.refreshRate==null && other.getRefreshRate()==null) || 
             (this.refreshRate!=null &&
              this.refreshRate.equals(other.getRefreshRate()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getRefreshRate() != null) {
            _hashCode += getRefreshRate().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ExchangeRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("refreshRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "refreshRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ExchangeRateRefreshRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ExchangeRateDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "exchangeRate"));
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
