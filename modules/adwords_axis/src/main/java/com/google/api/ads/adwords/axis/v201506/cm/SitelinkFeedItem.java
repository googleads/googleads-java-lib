/**
 * SitelinkFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Represents a sitelink extension.
 */
public class SitelinkFeedItem  extends com.google.api.ads.adwords.axis.v201506.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* URL display text for the sitelink.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span> */
    private java.lang.String sitelinkText;

    /* Destination URL for the sitelink.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 2076, inclusive.</span> */
    private java.lang.String sitelinkUrl;

    /* First line of the description for the sitelink. To clear this
     * field, set its value to the empty
     *                     string. If this value is set, sitelinkLine3 must
     * also be set.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 35, inclusive.</span> */
    private java.lang.String sitelinkLine2;

    /* Second line of the description for the sitelink. To clear this
     * field, set its value to the
     *                     empty string. If this value is set, sitelinkLine2
     * must also be set.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 35, inclusive.</span> */
    private java.lang.String sitelinkLine3;

    /* A list of possible final URLs after all cross domain redirects. */
    private com.google.api.ads.adwords.axis.v201506.cm.UrlList sitelinkFinalUrls;

    /* A list of possible final mobile URLs after all cross domain
     * redirects. */
    private com.google.api.ads.adwords.axis.v201506.cm.UrlList sitelinkFinalMobileUrls;

    /* URL template for constructing a tracking URL. To clear this
     * field, set its value to the empty
     *                     string. */
    private java.lang.String sitelinkTrackingUrlTemplate;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201506.cm.CustomParameters sitelinkUrlCustomParameters;

    public SitelinkFeedItem() {
    }

    public SitelinkFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201506.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           java.lang.String sitelinkText,
           java.lang.String sitelinkUrl,
           java.lang.String sitelinkLine2,
           java.lang.String sitelinkLine3,
           com.google.api.ads.adwords.axis.v201506.cm.UrlList sitelinkFinalUrls,
           com.google.api.ads.adwords.axis.v201506.cm.UrlList sitelinkFinalMobileUrls,
           java.lang.String sitelinkTrackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201506.cm.CustomParameters sitelinkUrlCustomParameters) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            policyData,
            extensionFeedItemType);
        this.sitelinkText = sitelinkText;
        this.sitelinkUrl = sitelinkUrl;
        this.sitelinkLine2 = sitelinkLine2;
        this.sitelinkLine3 = sitelinkLine3;
        this.sitelinkFinalUrls = sitelinkFinalUrls;
        this.sitelinkFinalMobileUrls = sitelinkFinalMobileUrls;
        this.sitelinkTrackingUrlTemplate = sitelinkTrackingUrlTemplate;
        this.sitelinkUrlCustomParameters = sitelinkUrlCustomParameters;
    }


    /**
     * Gets the sitelinkText value for this SitelinkFeedItem.
     * 
     * @return sitelinkText   * URL display text for the sitelink.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span>
     */
    public java.lang.String getSitelinkText() {
        return sitelinkText;
    }


    /**
     * Sets the sitelinkText value for this SitelinkFeedItem.
     * 
     * @param sitelinkText   * URL display text for the sitelink.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span>
     */
    public void setSitelinkText(java.lang.String sitelinkText) {
        this.sitelinkText = sitelinkText;
    }


    /**
     * Gets the sitelinkUrl value for this SitelinkFeedItem.
     * 
     * @return sitelinkUrl   * Destination URL for the sitelink.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 2076, inclusive.</span>
     */
    public java.lang.String getSitelinkUrl() {
        return sitelinkUrl;
    }


    /**
     * Sets the sitelinkUrl value for this SitelinkFeedItem.
     * 
     * @param sitelinkUrl   * Destination URL for the sitelink.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 2076, inclusive.</span>
     */
    public void setSitelinkUrl(java.lang.String sitelinkUrl) {
        this.sitelinkUrl = sitelinkUrl;
    }


    /**
     * Gets the sitelinkLine2 value for this SitelinkFeedItem.
     * 
     * @return sitelinkLine2   * First line of the description for the sitelink. To clear this
     * field, set its value to the empty
     *                     string. If this value is set, sitelinkLine3 must
     * also be set.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 35, inclusive.</span>
     */
    public java.lang.String getSitelinkLine2() {
        return sitelinkLine2;
    }


    /**
     * Sets the sitelinkLine2 value for this SitelinkFeedItem.
     * 
     * @param sitelinkLine2   * First line of the description for the sitelink. To clear this
     * field, set its value to the empty
     *                     string. If this value is set, sitelinkLine3 must
     * also be set.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 35, inclusive.</span>
     */
    public void setSitelinkLine2(java.lang.String sitelinkLine2) {
        this.sitelinkLine2 = sitelinkLine2;
    }


    /**
     * Gets the sitelinkLine3 value for this SitelinkFeedItem.
     * 
     * @return sitelinkLine3   * Second line of the description for the sitelink. To clear this
     * field, set its value to the
     *                     empty string. If this value is set, sitelinkLine2
     * must also be set.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 35, inclusive.</span>
     */
    public java.lang.String getSitelinkLine3() {
        return sitelinkLine3;
    }


    /**
     * Sets the sitelinkLine3 value for this SitelinkFeedItem.
     * 
     * @param sitelinkLine3   * Second line of the description for the sitelink. To clear this
     * field, set its value to the
     *                     empty string. If this value is set, sitelinkLine2
     * must also be set.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 0 and 35, inclusive.</span>
     */
    public void setSitelinkLine3(java.lang.String sitelinkLine3) {
        this.sitelinkLine3 = sitelinkLine3;
    }


    /**
     * Gets the sitelinkFinalUrls value for this SitelinkFeedItem.
     * 
     * @return sitelinkFinalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.UrlList getSitelinkFinalUrls() {
        return sitelinkFinalUrls;
    }


    /**
     * Sets the sitelinkFinalUrls value for this SitelinkFeedItem.
     * 
     * @param sitelinkFinalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public void setSitelinkFinalUrls(com.google.api.ads.adwords.axis.v201506.cm.UrlList sitelinkFinalUrls) {
        this.sitelinkFinalUrls = sitelinkFinalUrls;
    }


    /**
     * Gets the sitelinkFinalMobileUrls value for this SitelinkFeedItem.
     * 
     * @return sitelinkFinalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.UrlList getSitelinkFinalMobileUrls() {
        return sitelinkFinalMobileUrls;
    }


    /**
     * Sets the sitelinkFinalMobileUrls value for this SitelinkFeedItem.
     * 
     * @param sitelinkFinalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public void setSitelinkFinalMobileUrls(com.google.api.ads.adwords.axis.v201506.cm.UrlList sitelinkFinalMobileUrls) {
        this.sitelinkFinalMobileUrls = sitelinkFinalMobileUrls;
    }


    /**
     * Gets the sitelinkTrackingUrlTemplate value for this SitelinkFeedItem.
     * 
     * @return sitelinkTrackingUrlTemplate   * URL template for constructing a tracking URL. To clear this
     * field, set its value to the empty
     *                     string.
     */
    public java.lang.String getSitelinkTrackingUrlTemplate() {
        return sitelinkTrackingUrlTemplate;
    }


    /**
     * Sets the sitelinkTrackingUrlTemplate value for this SitelinkFeedItem.
     * 
     * @param sitelinkTrackingUrlTemplate   * URL template for constructing a tracking URL. To clear this
     * field, set its value to the empty
     *                     string.
     */
    public void setSitelinkTrackingUrlTemplate(java.lang.String sitelinkTrackingUrlTemplate) {
        this.sitelinkTrackingUrlTemplate = sitelinkTrackingUrlTemplate;
    }


    /**
     * Gets the sitelinkUrlCustomParameters value for this SitelinkFeedItem.
     * 
     * @return sitelinkUrlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.CustomParameters getSitelinkUrlCustomParameters() {
        return sitelinkUrlCustomParameters;
    }


    /**
     * Sets the sitelinkUrlCustomParameters value for this SitelinkFeedItem.
     * 
     * @param sitelinkUrlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                     trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setSitelinkUrlCustomParameters(com.google.api.ads.adwords.axis.v201506.cm.CustomParameters sitelinkUrlCustomParameters) {
        this.sitelinkUrlCustomParameters = sitelinkUrlCustomParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SitelinkFeedItem)) return false;
        SitelinkFeedItem other = (SitelinkFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sitelinkText==null && other.getSitelinkText()==null) || 
             (this.sitelinkText!=null &&
              this.sitelinkText.equals(other.getSitelinkText()))) &&
            ((this.sitelinkUrl==null && other.getSitelinkUrl()==null) || 
             (this.sitelinkUrl!=null &&
              this.sitelinkUrl.equals(other.getSitelinkUrl()))) &&
            ((this.sitelinkLine2==null && other.getSitelinkLine2()==null) || 
             (this.sitelinkLine2!=null &&
              this.sitelinkLine2.equals(other.getSitelinkLine2()))) &&
            ((this.sitelinkLine3==null && other.getSitelinkLine3()==null) || 
             (this.sitelinkLine3!=null &&
              this.sitelinkLine3.equals(other.getSitelinkLine3()))) &&
            ((this.sitelinkFinalUrls==null && other.getSitelinkFinalUrls()==null) || 
             (this.sitelinkFinalUrls!=null &&
              this.sitelinkFinalUrls.equals(other.getSitelinkFinalUrls()))) &&
            ((this.sitelinkFinalMobileUrls==null && other.getSitelinkFinalMobileUrls()==null) || 
             (this.sitelinkFinalMobileUrls!=null &&
              this.sitelinkFinalMobileUrls.equals(other.getSitelinkFinalMobileUrls()))) &&
            ((this.sitelinkTrackingUrlTemplate==null && other.getSitelinkTrackingUrlTemplate()==null) || 
             (this.sitelinkTrackingUrlTemplate!=null &&
              this.sitelinkTrackingUrlTemplate.equals(other.getSitelinkTrackingUrlTemplate()))) &&
            ((this.sitelinkUrlCustomParameters==null && other.getSitelinkUrlCustomParameters()==null) || 
             (this.sitelinkUrlCustomParameters!=null &&
              this.sitelinkUrlCustomParameters.equals(other.getSitelinkUrlCustomParameters())));
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
        if (getSitelinkText() != null) {
            _hashCode += getSitelinkText().hashCode();
        }
        if (getSitelinkUrl() != null) {
            _hashCode += getSitelinkUrl().hashCode();
        }
        if (getSitelinkLine2() != null) {
            _hashCode += getSitelinkLine2().hashCode();
        }
        if (getSitelinkLine3() != null) {
            _hashCode += getSitelinkLine3().hashCode();
        }
        if (getSitelinkFinalUrls() != null) {
            _hashCode += getSitelinkFinalUrls().hashCode();
        }
        if (getSitelinkFinalMobileUrls() != null) {
            _hashCode += getSitelinkFinalMobileUrls().hashCode();
        }
        if (getSitelinkTrackingUrlTemplate() != null) {
            _hashCode += getSitelinkTrackingUrlTemplate().hashCode();
        }
        if (getSitelinkUrlCustomParameters() != null) {
            _hashCode += getSitelinkUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SitelinkFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "SitelinkFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkFinalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkFinalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkFinalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkFinalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkTrackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkTrackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitelinkUrlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "sitelinkUrlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "CustomParameters"));
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
