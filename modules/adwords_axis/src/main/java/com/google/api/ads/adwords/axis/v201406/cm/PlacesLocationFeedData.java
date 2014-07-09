/**
 * PlacesLocationFeedData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;


/**
 * Data used to configure a location feed populated from
 *             Google My Business Locations.
 */
public class PlacesLocationFeedData  extends com.google.api.ads.adwords.axis.v201406.cm.SystemFeedGenerationData  implements java.io.Serializable {
    /* Required authentication token (from OAuth API) for the email. */
    private com.google.api.ads.adwords.axis.v201406.cm.OAuthInfo oAuthInfo;

    /* The email address for the Google My Business location feed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.String emailAddress;

    /* Used to filter Google My Business listings by business name.
     * If businessNameFilter is set,
     *                     only listings with a matching business name are
     * candidates to be sync'd into FeedItems. */
    private java.lang.String businessNameFilter;

    /* Used to filter Google My Business listings by categories. If
     * entries exist in categoryFilters,
     *                     only listings that belong to any of the categories
     * are candidates to be sync'd into FeedItems.
     *                     If no entries exist in categoryFilters, then all
     * listings are candidates for syncing. */
    private java.lang.String[] categoryFilters;

    public PlacesLocationFeedData() {
    }

    public PlacesLocationFeedData(
           java.lang.String systemFeedGenerationDataType,
           com.google.api.ads.adwords.axis.v201406.cm.OAuthInfo oAuthInfo,
           java.lang.String emailAddress,
           java.lang.String businessNameFilter,
           java.lang.String[] categoryFilters) {
        super(
            systemFeedGenerationDataType);
        this.oAuthInfo = oAuthInfo;
        this.emailAddress = emailAddress;
        this.businessNameFilter = businessNameFilter;
        this.categoryFilters = categoryFilters;
    }


    /**
     * Gets the oAuthInfo value for this PlacesLocationFeedData.
     * 
     * @return oAuthInfo   * Required authentication token (from OAuth API) for the email.
     */
    public com.google.api.ads.adwords.axis.v201406.cm.OAuthInfo getOAuthInfo() {
        return oAuthInfo;
    }


    /**
     * Sets the oAuthInfo value for this PlacesLocationFeedData.
     * 
     * @param oAuthInfo   * Required authentication token (from OAuth API) for the email.
     */
    public void setOAuthInfo(com.google.api.ads.adwords.axis.v201406.cm.OAuthInfo oAuthInfo) {
        this.oAuthInfo = oAuthInfo;
    }


    /**
     * Gets the emailAddress value for this PlacesLocationFeedData.
     * 
     * @return emailAddress   * The email address for the Google My Business location feed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this PlacesLocationFeedData.
     * 
     * @param emailAddress   * The email address for the Google My Business location feed.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the businessNameFilter value for this PlacesLocationFeedData.
     * 
     * @return businessNameFilter   * Used to filter Google My Business listings by business name.
     * If businessNameFilter is set,
     *                     only listings with a matching business name are
     * candidates to be sync'd into FeedItems.
     */
    public java.lang.String getBusinessNameFilter() {
        return businessNameFilter;
    }


    /**
     * Sets the businessNameFilter value for this PlacesLocationFeedData.
     * 
     * @param businessNameFilter   * Used to filter Google My Business listings by business name.
     * If businessNameFilter is set,
     *                     only listings with a matching business name are
     * candidates to be sync'd into FeedItems.
     */
    public void setBusinessNameFilter(java.lang.String businessNameFilter) {
        this.businessNameFilter = businessNameFilter;
    }


    /**
     * Gets the categoryFilters value for this PlacesLocationFeedData.
     * 
     * @return categoryFilters   * Used to filter Google My Business listings by categories. If
     * entries exist in categoryFilters,
     *                     only listings that belong to any of the categories
     * are candidates to be sync'd into FeedItems.
     *                     If no entries exist in categoryFilters, then all
     * listings are candidates for syncing.
     */
    public java.lang.String[] getCategoryFilters() {
        return categoryFilters;
    }


    /**
     * Sets the categoryFilters value for this PlacesLocationFeedData.
     * 
     * @param categoryFilters   * Used to filter Google My Business listings by categories. If
     * entries exist in categoryFilters,
     *                     only listings that belong to any of the categories
     * are candidates to be sync'd into FeedItems.
     *                     If no entries exist in categoryFilters, then all
     * listings are candidates for syncing.
     */
    public void setCategoryFilters(java.lang.String[] categoryFilters) {
        this.categoryFilters = categoryFilters;
    }

    public java.lang.String getCategoryFilters(int i) {
        return this.categoryFilters[i];
    }

    public void setCategoryFilters(int i, java.lang.String _value) {
        this.categoryFilters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacesLocationFeedData)) return false;
        PlacesLocationFeedData other = (PlacesLocationFeedData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oAuthInfo==null && other.getOAuthInfo()==null) || 
             (this.oAuthInfo!=null &&
              this.oAuthInfo.equals(other.getOAuthInfo()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.businessNameFilter==null && other.getBusinessNameFilter()==null) || 
             (this.businessNameFilter!=null &&
              this.businessNameFilter.equals(other.getBusinessNameFilter()))) &&
            ((this.categoryFilters==null && other.getCategoryFilters()==null) || 
             (this.categoryFilters!=null &&
              java.util.Arrays.equals(this.categoryFilters, other.getCategoryFilters())));
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
        if (getOAuthInfo() != null) {
            _hashCode += getOAuthInfo().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getBusinessNameFilter() != null) {
            _hashCode += getBusinessNameFilter().hashCode();
        }
        if (getCategoryFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacesLocationFeedData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "PlacesLocationFeedData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OAuthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "oAuthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "OAuthInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessNameFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "businessNameFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "categoryFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
