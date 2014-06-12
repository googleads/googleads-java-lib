/**
 * MobileExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Represents a phone extension.
 *             
 *             <p>This type of ad extension attaches a phone number
 *             to a text ad, which lets customers call the advertiser
 * directly from the ad.
 *             Phone extensions will appear as clickable phone numbers
 * beneath the main text ad,
 *             and will be visible to high-end mobile device users who
 * access google.com search,
 *             Voice search, Google Mobile App, or Google Maps for Mobile
 * from their phone.
 *             </p>
 *             <p>Learn more about
 *             <a href="//support.google.com/adwords/bin/answer.py?answer=2453991">
 * phone extensions</a>.
 *             </p>
 */
public class MobileExtension  extends com.google.api.ads.adwords.axis.v201309.cm.AdExtension  implements java.io.Serializable {
    /* Advertiser's phone number to append to the ad.
     *                     This is typically the E.164 representation (e.g.,
     * "+16502530000").
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PhoneNumber".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be at least 3.</span> */
    private java.lang.String phoneNumber;

    /* Two-character country code (e.g. "US") of the advertiser's
     * phone number.
     *                     See the list of <a href="/adwords/api/docs/appendix/geotargeting">
     * available country codes</a>.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 2 and 2, inclusive.</span> */
    private java.lang.String countryCode;

    /* Indicates whether this represents a call tracking extension. */
    private java.lang.Boolean isCallTrackingEnabled;

    /* Indicates whether the extended ad should be call only, where
     * the phone number
     *                     will be displayed and the URL will not. This affects
     * search and display ads
     *                     in high end mobile devices (e.g. iPhone and Android
     * phones). */
    private java.lang.Boolean isCallOnly;

    public MobileExtension() {
    }

    public MobileExtension(
           java.lang.Long id,
           java.lang.String adExtensionType,
           java.lang.String phoneNumber,
           java.lang.String countryCode,
           java.lang.Boolean isCallTrackingEnabled,
           java.lang.Boolean isCallOnly) {
        super(
            id,
            adExtensionType);
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.isCallTrackingEnabled = isCallTrackingEnabled;
        this.isCallOnly = isCallOnly;
    }


    /**
     * Gets the phoneNumber value for this MobileExtension.
     * 
     * @return phoneNumber   * Advertiser's phone number to append to the ad.
     *                     This is typically the E.164 representation (e.g.,
     * "+16502530000").
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PhoneNumber".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be at least 3.</span>
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this MobileExtension.
     * 
     * @param phoneNumber   * Advertiser's phone number to append to the ad.
     *                     This is typically the E.164 representation (e.g.,
     * "+16502530000").
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PhoneNumber".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be at least 3.</span>
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the countryCode value for this MobileExtension.
     * 
     * @return countryCode   * Two-character country code (e.g. "US") of the advertiser's
     * phone number.
     *                     See the list of <a href="/adwords/api/docs/appendix/geotargeting">
     * available country codes</a>.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 2 and 2, inclusive.</span>
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this MobileExtension.
     * 
     * @param countryCode   * Two-character country code (e.g. "US") of the advertiser's
     * phone number.
     *                     See the list of <a href="/adwords/api/docs/appendix/geotargeting">
     * available country codes</a>.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     *                     <span class="constraint StringLength">The length
     * of this string should be between 2 and 2, inclusive.</span>
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the isCallTrackingEnabled value for this MobileExtension.
     * 
     * @return isCallTrackingEnabled   * Indicates whether this represents a call tracking extension.
     */
    public java.lang.Boolean getIsCallTrackingEnabled() {
        return isCallTrackingEnabled;
    }


    /**
     * Sets the isCallTrackingEnabled value for this MobileExtension.
     * 
     * @param isCallTrackingEnabled   * Indicates whether this represents a call tracking extension.
     */
    public void setIsCallTrackingEnabled(java.lang.Boolean isCallTrackingEnabled) {
        this.isCallTrackingEnabled = isCallTrackingEnabled;
    }


    /**
     * Gets the isCallOnly value for this MobileExtension.
     * 
     * @return isCallOnly   * Indicates whether the extended ad should be call only, where
     * the phone number
     *                     will be displayed and the URL will not. This affects
     * search and display ads
     *                     in high end mobile devices (e.g. iPhone and Android
     * phones).
     */
    public java.lang.Boolean getIsCallOnly() {
        return isCallOnly;
    }


    /**
     * Sets the isCallOnly value for this MobileExtension.
     * 
     * @param isCallOnly   * Indicates whether the extended ad should be call only, where
     * the phone number
     *                     will be displayed and the URL will not. This affects
     * search and display ads
     *                     in high end mobile devices (e.g. iPhone and Android
     * phones).
     */
    public void setIsCallOnly(java.lang.Boolean isCallOnly) {
        this.isCallOnly = isCallOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileExtension)) return false;
        MobileExtension other = (MobileExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.isCallTrackingEnabled==null && other.getIsCallTrackingEnabled()==null) || 
             (this.isCallTrackingEnabled!=null &&
              this.isCallTrackingEnabled.equals(other.getIsCallTrackingEnabled()))) &&
            ((this.isCallOnly==null && other.getIsCallOnly()==null) || 
             (this.isCallOnly!=null &&
              this.isCallOnly.equals(other.getIsCallOnly())));
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getIsCallTrackingEnabled() != null) {
            _hashCode += getIsCallTrackingEnabled().hashCode();
        }
        if (getIsCallOnly() != null) {
            _hashCode += getIsCallOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "MobileExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallTrackingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isCallTrackingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCallOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isCallOnly"));
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
