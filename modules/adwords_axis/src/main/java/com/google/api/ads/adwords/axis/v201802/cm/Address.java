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
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Structure to specify an address location.
 */
public class Address  implements java.io.Serializable {
    /* Street address line 1; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String streetAddress;

    /* Street address line 2; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String streetAddress2;

    /* Name of the city; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String cityName;

    /* Province or state code; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String provinceCode;

    /* Province or state name; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String provinceName;

    /* Postal code; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String postalCode;

    /* Country code; <code>null</code> if unknown. */
    private java.lang.String countryCode;

    public Address() {
    }

    public Address(
           java.lang.String streetAddress,
           java.lang.String streetAddress2,
           java.lang.String cityName,
           java.lang.String provinceCode,
           java.lang.String provinceName,
           java.lang.String postalCode,
           java.lang.String countryCode) {
           this.streetAddress = streetAddress;
           this.streetAddress2 = streetAddress2;
           this.cityName = cityName;
           this.provinceCode = provinceCode;
           this.provinceName = provinceName;
           this.postalCode = postalCode;
           this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("cityName", getCityName())
            .add("countryCode", getCountryCode())
            .add("postalCode", getPostalCode())
            .add("provinceCode", getProvinceCode())
            .add("provinceName", getProvinceName())
            .add("streetAddress", getStreetAddress())
            .add("streetAddress2", getStreetAddress2())
            .toString();
    }

    /**
     * Gets the streetAddress value for this Address.
     * 
     * @return streetAddress   * Street address line 1; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getStreetAddress() {
        return streetAddress;
    }


    /**
     * Sets the streetAddress value for this Address.
     * 
     * @param streetAddress   * Street address line 1; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setStreetAddress(java.lang.String streetAddress) {
        this.streetAddress = streetAddress;
    }


    /**
     * Gets the streetAddress2 value for this Address.
     * 
     * @return streetAddress2   * Street address line 2; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getStreetAddress2() {
        return streetAddress2;
    }


    /**
     * Sets the streetAddress2 value for this Address.
     * 
     * @param streetAddress2   * Street address line 2; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setStreetAddress2(java.lang.String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }


    /**
     * Gets the cityName value for this Address.
     * 
     * @return cityName   * Name of the city; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this Address.
     * 
     * @param cityName   * Name of the city; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the provinceCode value for this Address.
     * 
     * @return provinceCode   * Province or state code; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getProvinceCode() {
        return provinceCode;
    }


    /**
     * Sets the provinceCode value for this Address.
     * 
     * @param provinceCode   * Province or state code; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setProvinceCode(java.lang.String provinceCode) {
        this.provinceCode = provinceCode;
    }


    /**
     * Gets the provinceName value for this Address.
     * 
     * @return provinceName   * Province or state name; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getProvinceName() {
        return provinceName;
    }


    /**
     * Sets the provinceName value for this Address.
     * 
     * @param provinceName   * Province or state name; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setProvinceName(java.lang.String provinceName) {
        this.provinceName = provinceName;
    }


    /**
     * Gets the postalCode value for this Address.
     * 
     * @return postalCode   * Postal code; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Address.
     * 
     * @param postalCode   * Postal code; <code>null</code> if unknown.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the countryCode value for this Address.
     * 
     * @return countryCode   * Country code; <code>null</code> if unknown.
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this Address.
     * 
     * @param countryCode   * Country code; <code>null</code> if unknown.
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.streetAddress==null && other.getStreetAddress()==null) || 
             (this.streetAddress!=null &&
              this.streetAddress.equals(other.getStreetAddress()))) &&
            ((this.streetAddress2==null && other.getStreetAddress2()==null) || 
             (this.streetAddress2!=null &&
              this.streetAddress2.equals(other.getStreetAddress2()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.provinceCode==null && other.getProvinceCode()==null) || 
             (this.provinceCode!=null &&
              this.provinceCode.equals(other.getProvinceCode()))) &&
            ((this.provinceName==null && other.getProvinceName()==null) || 
             (this.provinceName!=null &&
              this.provinceName.equals(other.getProvinceName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode())));
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
        if (getStreetAddress() != null) {
            _hashCode += getStreetAddress().hashCode();
        }
        if (getStreetAddress2() != null) {
            _hashCode += getStreetAddress2().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getProvinceCode() != null) {
            _hashCode += getProvinceCode().hashCode();
        }
        if (getProvinceName() != null) {
            _hashCode += getProvinceName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "streetAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "streetAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "provinceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "provinceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "countryCode"));
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
