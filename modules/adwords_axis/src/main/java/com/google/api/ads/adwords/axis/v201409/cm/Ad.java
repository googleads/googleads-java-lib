/**
 * Ad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * The base class of all ad types. To update basic ad fields,
 *             you can construct an {@code Ad} object (instead of
 *             the ad's concrete type) with the appropriate fields set.
 * <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 */
public class Ad  implements java.io.Serializable {
    /* ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}. */
    private java.lang.Long id;

    /* Destination URL. */
    private java.lang.String url;

    /* Visible URL. */
    private java.lang.String displayUrl;

    /* A list of possible final URLs after all cross domain redirects. */
    private java.lang.String[] finalUrls;

    /* A list of possible final mobile URLs after all cross domain
     * redirects. */
    private java.lang.String[] finalMobileUrls;

    /* A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                 installed. */
    private com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] finalAppUrls;

    /* URL template for constructing a tracking URL. */
    private java.lang.String trackingUrlTemplate;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201409.cm.CustomParameters urlCustomParameters;

    /* The device preference for the ad. */
    private java.lang.Long devicePreference;

    /* Indicates that this instance is a subtype of Ad.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String adType;

    public Ad() {
    }

    public Ad(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201409.cm.CustomParameters urlCustomParameters,
           java.lang.Long devicePreference,
           java.lang.String adType) {
           this.id = id;
           this.url = url;
           this.displayUrl = displayUrl;
           this.finalUrls = finalUrls;
           this.finalMobileUrls = finalMobileUrls;
           this.finalAppUrls = finalAppUrls;
           this.trackingUrlTemplate = trackingUrlTemplate;
           this.urlCustomParameters = urlCustomParameters;
           this.devicePreference = devicePreference;
           this.adType = adType;
    }


    /**
     * Gets the id value for this Ad.
     * 
     * @return id   * ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Ad.
     * 
     * @param id   * ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the url value for this Ad.
     * 
     * @return url   * Destination URL.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Ad.
     * 
     * @param url   * Destination URL.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the displayUrl value for this Ad.
     * 
     * @return displayUrl   * Visible URL.
     */
    public java.lang.String getDisplayUrl() {
        return displayUrl;
    }


    /**
     * Sets the displayUrl value for this Ad.
     * 
     * @param displayUrl   * Visible URL.
     */
    public void setDisplayUrl(java.lang.String displayUrl) {
        this.displayUrl = displayUrl;
    }


    /**
     * Gets the finalUrls value for this Ad.
     * 
     * @return finalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public java.lang.String[] getFinalUrls() {
        return finalUrls;
    }


    /**
     * Sets the finalUrls value for this Ad.
     * 
     * @param finalUrls   * A list of possible final URLs after all cross domain redirects.
     */
    public void setFinalUrls(java.lang.String[] finalUrls) {
        this.finalUrls = finalUrls;
    }

    public java.lang.String getFinalUrls(int i) {
        return this.finalUrls[i];
    }

    public void setFinalUrls(int i, java.lang.String _value) {
        this.finalUrls[i] = _value;
    }


    /**
     * Gets the finalMobileUrls value for this Ad.
     * 
     * @return finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public java.lang.String[] getFinalMobileUrls() {
        return finalMobileUrls;
    }


    /**
     * Sets the finalMobileUrls value for this Ad.
     * 
     * @param finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public void setFinalMobileUrls(java.lang.String[] finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }

    public java.lang.String getFinalMobileUrls(int i) {
        return this.finalMobileUrls[i];
    }

    public void setFinalMobileUrls(int i, java.lang.String _value) {
        this.finalMobileUrls[i] = _value;
    }


    /**
     * Gets the finalAppUrls value for this Ad.
     * 
     * @return finalAppUrls   * A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                 installed.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] getFinalAppUrls() {
        return finalAppUrls;
    }


    /**
     * Sets the finalAppUrls value for this Ad.
     * 
     * @param finalAppUrls   * A list of final app URLs that will be used on mobile if the
     * user has the specific app
     *                 installed.
     */
    public void setFinalAppUrls(com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] finalAppUrls) {
        this.finalAppUrls = finalAppUrls;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.AppUrl getFinalAppUrls(int i) {
        return this.finalAppUrls[i];
    }

    public void setFinalAppUrls(int i, com.google.api.ads.adwords.axis.v201409.cm.AppUrl _value) {
        this.finalAppUrls[i] = _value;
    }


    /**
     * Gets the trackingUrlTemplate value for this Ad.
     * 
     * @return trackingUrlTemplate   * URL template for constructing a tracking URL.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this Ad.
     * 
     * @param trackingUrlTemplate   * URL template for constructing a tracking URL.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the urlCustomParameters value for this Ad.
     * 
     * @return urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201409.cm.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }


    /**
     * Sets the urlCustomParameters value for this Ad.
     * 
     * @param urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setUrlCustomParameters(com.google.api.ads.adwords.axis.v201409.cm.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }


    /**
     * Gets the devicePreference value for this Ad.
     * 
     * @return devicePreference   * The device preference for the ad.
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this Ad.
     * 
     * @param devicePreference   * The device preference for the ad.
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the adType value for this Ad.
     * 
     * @return adType   * Indicates that this instance is a subtype of Ad.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getAdType() {
        return adType;
    }


    /**
     * Sets the adType value for this Ad.
     * 
     * @param adType   * Indicates that this instance is a subtype of Ad.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setAdType(java.lang.String adType) {
        this.adType = adType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ad)) return false;
        Ad other = (Ad) obj;
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
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.displayUrl==null && other.getDisplayUrl()==null) || 
             (this.displayUrl!=null &&
              this.displayUrl.equals(other.getDisplayUrl()))) &&
            ((this.finalUrls==null && other.getFinalUrls()==null) || 
             (this.finalUrls!=null &&
              java.util.Arrays.equals(this.finalUrls, other.getFinalUrls()))) &&
            ((this.finalMobileUrls==null && other.getFinalMobileUrls()==null) || 
             (this.finalMobileUrls!=null &&
              java.util.Arrays.equals(this.finalMobileUrls, other.getFinalMobileUrls()))) &&
            ((this.finalAppUrls==null && other.getFinalAppUrls()==null) || 
             (this.finalAppUrls!=null &&
              java.util.Arrays.equals(this.finalAppUrls, other.getFinalAppUrls()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.urlCustomParameters==null && other.getUrlCustomParameters()==null) || 
             (this.urlCustomParameters!=null &&
              this.urlCustomParameters.equals(other.getUrlCustomParameters()))) &&
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.adType==null && other.getAdType()==null) || 
             (this.adType!=null &&
              this.adType.equals(other.getAdType())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDisplayUrl() != null) {
            _hashCode += getDisplayUrl().hashCode();
        }
        if (getFinalUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalMobileUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalMobileUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalMobileUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinalAppUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinalAppUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinalAppUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getAdType() != null) {
            _hashCode += getAdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Ad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "displayUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "finalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "finalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalAppUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "finalAppUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AppUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "urlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "CustomParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "devicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "Ad.Type"));
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
