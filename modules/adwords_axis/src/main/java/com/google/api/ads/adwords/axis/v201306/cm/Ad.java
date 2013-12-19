/**
 * Ad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * The base class of all ad types. To update basic ad fields,
 *             you can construct an {@code Ad} object (instead of
 *             the ad's concrete type) with the appropriate fields set.
 * <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 */
public class Ad  implements java.io.Serializable {
    /* ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.Long id;

    /* Destination URL.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Url".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.String url;

    /* Visible URL.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DisplayUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String displayUrl;

    /* The device preference for the ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DevicePreference".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long devicePreference;

    /* List of disapproval reasons.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DisapprovalReasons".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String[] disapprovalReasons;

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
           java.lang.Long devicePreference,
           java.lang.String[] disapprovalReasons,
           java.lang.String adType) {
           this.id = id;
           this.url = url;
           this.displayUrl = displayUrl;
           this.devicePreference = devicePreference;
           this.disapprovalReasons = disapprovalReasons;
           this.adType = adType;
    }


    /**
     * Gets the id value for this Ad.
     * 
     * @return id   * ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Ad.
     * 
     * @param id   * ID of this ad. This field is ignored when creating
     *                 ads using {@code AdGroupAdService}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the url value for this Ad.
     * 
     * @return url   * Destination URL.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Url".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Ad.
     * 
     * @param url   * Destination URL.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Url".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the displayUrl value for this Ad.
     * 
     * @return displayUrl   * Visible URL.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DisplayUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDisplayUrl() {
        return displayUrl;
    }


    /**
     * Sets the displayUrl value for this Ad.
     * 
     * @param displayUrl   * Visible URL.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DisplayUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDisplayUrl(java.lang.String displayUrl) {
        this.displayUrl = displayUrl;
    }


    /**
     * Gets the devicePreference value for this Ad.
     * 
     * @return devicePreference   * The device preference for the ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DevicePreference".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this Ad.
     * 
     * @param devicePreference   * The device preference for the ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DevicePreference".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDevicePreference(java.lang.Long devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the disapprovalReasons value for this Ad.
     * 
     * @return disapprovalReasons   * List of disapproval reasons.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DisapprovalReasons".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this Ad.
     * 
     * @param disapprovalReasons   * List of disapproval reasons.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DisapprovalReasons".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setDisapprovalReasons(java.lang.String[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public java.lang.String getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, java.lang.String _value) {
        this.disapprovalReasons[i] = _value;
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
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons()))) &&
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
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisapprovalReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Ad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "displayUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "devicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Ad.Type"));
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
