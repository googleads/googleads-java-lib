/**
 * MobileAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Represents a mobile ad.
 *             
 *             <p>
 *             A mobile ad can contain a click-to-call phone number,
 * a link to a website,
 *             or both.  You specify which features you want by setting
 * certain fields, as
 *             shown in the following table.  For example, to create
 * a click-to-call mobile
 *             ad, set the fields in the <b>Click-to-call</b> column.
 * A hyphen indicates
 *             that you should not set the corresponding field.
 *             </p>
 *             <p>
 *             For more information, see
 *             <a href="//support.google.com/adwords/bin/answer.py?answer=2472720">
 * Create a mobile ad</a>.
 *             </p>
 *             
 *             <table summary="" style="clear: none">
 *             <tr> <th scope="col"> Click-to-call </th>
 *             <th scope="col"> Website       </th>
 *             <th scope="col"> Both          </th></tr>
 *             <tr> <td> headline        <br />
 *             description     <br />
 *             mobileCarriers  <br />
 *             phoneNumber     <br />
 *             countryCode     <br />
 *             businessName    <br />
 *             -               <br />
 *             -               <br />
 *             -               <br />
 *             </td>
 *             <td> headline        <br />
 *             description     <br />
 *             mobileCarriers  <br />
 *             -               <br />
 *             -               <br />
 *             -               <br />
 *             displayUrl      <br />
 *             destinationUrl  <br />
 *             markupLanguages <br />
 *             </td>
 *             <td> headline        <br />
 *             description     <br />
 *             mobileCarriers  <br />
 *             phoneNumber     <br />
 *             countryCode     <br />
 *             businessName    <br />
 *             displayUrl      <br />
 *             destinationUrl  <br />
 *             markupLanguages <br />
 *             </td></tr>
 *             </table>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class MobileAd  extends com.google.api.ads.adwords.axis.v201502.cm.Ad  implements java.io.Serializable {
    /* The headline of the ad. */
    private java.lang.String headline;

    /* The description line. */
    private java.lang.String description;

    /* The list of markup languages to use for the mobile ad. */
    private com.google.api.ads.adwords.axis.v201502.cm.MarkupLanguageType[] markupLanguages;

    /* The list of mobile carriers to use for the mobile ad. Each
     * string
     *                     must be of the form 'CarrierName@CountryCode'.
     * To specify that
     *                     all available carriers are to be used, use the
     * reserved keyword
     *                     'ALLCARRIERS'. See <a
     *                     href="/adwords/api/docs/appendix/mobilecarriers">available
     * mobile carriers</a>. */
    private java.lang.String[] mobileCarriers;

    /* The business name of the mobile ad.
     *                     Must not exceed 20 characters (except for ads
     * targeted
     *                     to Japan, which must not exceed 10 Japanese characters). */
    private java.lang.String businessName;

    /* The country code for the phone number in the click-to-call
     * mobile ad.
     *                     The click-to-call ad will display only in this
     * country.
     *                     This field will be used to verify the phone number
     * format and validate the targeted mobile carriers. */
    private java.lang.String countryCode;

    /* The click-to-call phone number.
     *                     Must not exceed 20 characters. */
    private java.lang.String phoneNumber;

    public MobileAd() {
    }

    public MobileAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201502.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201502.cm.CustomParameters urlCustomParameters,
           java.lang.Long devicePreference,
           java.lang.String adType,
           java.lang.String headline,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201502.cm.MarkupLanguageType[] markupLanguages,
           java.lang.String[] mobileCarriers,
           java.lang.String businessName,
           java.lang.String countryCode,
           java.lang.String phoneNumber) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            devicePreference,
            adType);
        this.headline = headline;
        this.description = description;
        this.markupLanguages = markupLanguages;
        this.mobileCarriers = mobileCarriers;
        this.businessName = businessName;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the headline value for this MobileAd.
     * 
     * @return headline   * The headline of the ad.
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this MobileAd.
     * 
     * @param headline   * The headline of the ad.
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the description value for this MobileAd.
     * 
     * @return description   * The description line.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MobileAd.
     * 
     * @param description   * The description line.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the markupLanguages value for this MobileAd.
     * 
     * @return markupLanguages   * The list of markup languages to use for the mobile ad.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.MarkupLanguageType[] getMarkupLanguages() {
        return markupLanguages;
    }


    /**
     * Sets the markupLanguages value for this MobileAd.
     * 
     * @param markupLanguages   * The list of markup languages to use for the mobile ad.
     */
    public void setMarkupLanguages(com.google.api.ads.adwords.axis.v201502.cm.MarkupLanguageType[] markupLanguages) {
        this.markupLanguages = markupLanguages;
    }

    public com.google.api.ads.adwords.axis.v201502.cm.MarkupLanguageType getMarkupLanguages(int i) {
        return this.markupLanguages[i];
    }

    public void setMarkupLanguages(int i, com.google.api.ads.adwords.axis.v201502.cm.MarkupLanguageType _value) {
        this.markupLanguages[i] = _value;
    }


    /**
     * Gets the mobileCarriers value for this MobileAd.
     * 
     * @return mobileCarriers   * The list of mobile carriers to use for the mobile ad. Each
     * string
     *                     must be of the form 'CarrierName@CountryCode'.
     * To specify that
     *                     all available carriers are to be used, use the
     * reserved keyword
     *                     'ALLCARRIERS'. See <a
     *                     href="/adwords/api/docs/appendix/mobilecarriers">available
     * mobile carriers</a>.
     */
    public java.lang.String[] getMobileCarriers() {
        return mobileCarriers;
    }


    /**
     * Sets the mobileCarriers value for this MobileAd.
     * 
     * @param mobileCarriers   * The list of mobile carriers to use for the mobile ad. Each
     * string
     *                     must be of the form 'CarrierName@CountryCode'.
     * To specify that
     *                     all available carriers are to be used, use the
     * reserved keyword
     *                     'ALLCARRIERS'. See <a
     *                     href="/adwords/api/docs/appendix/mobilecarriers">available
     * mobile carriers</a>.
     */
    public void setMobileCarriers(java.lang.String[] mobileCarriers) {
        this.mobileCarriers = mobileCarriers;
    }

    public java.lang.String getMobileCarriers(int i) {
        return this.mobileCarriers[i];
    }

    public void setMobileCarriers(int i, java.lang.String _value) {
        this.mobileCarriers[i] = _value;
    }


    /**
     * Gets the businessName value for this MobileAd.
     * 
     * @return businessName   * The business name of the mobile ad.
     *                     Must not exceed 20 characters (except for ads
     * targeted
     *                     to Japan, which must not exceed 10 Japanese characters).
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this MobileAd.
     * 
     * @param businessName   * The business name of the mobile ad.
     *                     Must not exceed 20 characters (except for ads
     * targeted
     *                     to Japan, which must not exceed 10 Japanese characters).
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the countryCode value for this MobileAd.
     * 
     * @return countryCode   * The country code for the phone number in the click-to-call
     * mobile ad.
     *                     The click-to-call ad will display only in this
     * country.
     *                     This field will be used to verify the phone number
     * format and validate the targeted mobile carriers.
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this MobileAd.
     * 
     * @param countryCode   * The country code for the phone number in the click-to-call
     * mobile ad.
     *                     The click-to-call ad will display only in this
     * country.
     *                     This field will be used to verify the phone number
     * format and validate the targeted mobile carriers.
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the phoneNumber value for this MobileAd.
     * 
     * @return phoneNumber   * The click-to-call phone number.
     *                     Must not exceed 20 characters.
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this MobileAd.
     * 
     * @param phoneNumber   * The click-to-call phone number.
     *                     Must not exceed 20 characters.
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileAd)) return false;
        MobileAd other = (MobileAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.markupLanguages==null && other.getMarkupLanguages()==null) || 
             (this.markupLanguages!=null &&
              java.util.Arrays.equals(this.markupLanguages, other.getMarkupLanguages()))) &&
            ((this.mobileCarriers==null && other.getMobileCarriers()==null) || 
             (this.mobileCarriers!=null &&
              java.util.Arrays.equals(this.mobileCarriers, other.getMobileCarriers()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber())));
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
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMarkupLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkupLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkupLanguages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobileCarriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobileCarriers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobileCarriers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "MobileAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markupLanguages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "markupLanguages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "MarkupLanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "mobileCarriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "phoneNumber"));
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
