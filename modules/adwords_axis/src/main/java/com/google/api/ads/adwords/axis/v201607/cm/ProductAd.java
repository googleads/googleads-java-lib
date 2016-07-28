/**
 * ProductAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * Represents a product ad (known as a <a href=
 *             "//support.google.com/adwords/answer/2456103">product
 *             listing ad</a> in the AdWords user interface). A product
 * ad displays
 *             product data (managed using the Google Merchant Center)
 * that is
 *             pulled from the Google base product feed specified in
 * the parent campaign's
 *             {@linkplain ShoppingSetting shopping setting}.
 *             
 *             <p class="caution"><b>Caution:</b> Product ads do not
 * use {@link #url url},
 *             {@link #finalUrls finalUrls}, {@link #finalMobileUrls
 * finalMobileUrls},
 *             {@link #finalAppUrls finalAppUrls}, or {@link #displayUrl
 * displayUrl};
 *             setting these fields on a product ad will cause an error.
 * {@link #urlCustomParameters urlCustomParameters} and
 *             {@link #trackingUrlTemplate trackingUrlTemplate} can be
 * set, but it is not
 *             recommended, as they will not be used; they should be
 * set at the ad group or
 *             campaign level instead.</p>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class ProductAd  extends com.google.api.ads.adwords.axis.v201607.cm.Ad  implements java.io.Serializable {
    public ProductAd() {
    }

    public ProductAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201607.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201607.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201607.cm.AdType type,
           java.lang.Long devicePreference,
           java.lang.String adType) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            type,
            devicePreference,
            adType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductAd)) return false;
        ProductAd other = (ProductAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "ProductAd"));
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
