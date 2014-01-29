/**
 * Network.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


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

    /* The {@link AdUnit#id} of the top most ad unit to which descendant
     * ad units
     *                 can be added. Should be used for the {@link AdUnit#parentId}
     * when first
     *                 building inventory hierarchy. This field is read-only. */
    private java.lang.String effectiveRootAdUnitId;

    /* The ID of the {@code CustomTargetingKey} that is used to categorize
     * video
     *                 content in DFP.
     *                 
     *                 Values of this {@link CustomTargetingKey} can be used
     * as part of the
     *                 {@link Targeting#contentTargeting} for targeting line
     * items to video
     *                 categories.
     *                 
     *                 Additionally, you can use the values of this key with
     * the
     *                 {@link ContentService} to search for all {@code Content}
     * that are
     *                 associated to a particular key/value combination. */
    private java.lang.Long contentBrowseCustomTargetingKeyId;

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
           java.lang.String effectiveRootAdUnitId,
           java.lang.Long contentBrowseCustomTargetingKeyId,
           java.lang.Boolean isTest) {
           this.id = id;
           this.displayName = displayName;
           this.networkCode = networkCode;
           this.propertyCode = propertyCode;
           this.timeZone = timeZone;
           this.currencyCode = currencyCode;
           this.effectiveRootAdUnitId = effectiveRootAdUnitId;
           this.contentBrowseCustomTargetingKeyId = contentBrowseCustomTargetingKeyId;
           this.isTest = isTest;
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
     * Gets the contentBrowseCustomTargetingKeyId value for this Network.
     * 
     * @return contentBrowseCustomTargetingKeyId   * The ID of the {@code CustomTargetingKey} that is used to categorize
     * video
     *                 content in DFP.
     *                 
     *                 Values of this {@link CustomTargetingKey} can be used
     * as part of the
     *                 {@link Targeting#contentTargeting} for targeting line
     * items to video
     *                 categories.
     *                 
     *                 Additionally, you can use the values of this key with
     * the
     *                 {@link ContentService} to search for all {@code Content}
     * that are
     *                 associated to a particular key/value combination.
     */
    public java.lang.Long getContentBrowseCustomTargetingKeyId() {
        return contentBrowseCustomTargetingKeyId;
    }


    /**
     * Sets the contentBrowseCustomTargetingKeyId value for this Network.
     * 
     * @param contentBrowseCustomTargetingKeyId   * The ID of the {@code CustomTargetingKey} that is used to categorize
     * video
     *                 content in DFP.
     *                 
     *                 Values of this {@link CustomTargetingKey} can be used
     * as part of the
     *                 {@link Targeting#contentTargeting} for targeting line
     * items to video
     *                 categories.
     *                 
     *                 Additionally, you can use the values of this key with
     * the
     *                 {@link ContentService} to search for all {@code Content}
     * that are
     *                 associated to a particular key/value combination.
     */
    public void setContentBrowseCustomTargetingKeyId(java.lang.Long contentBrowseCustomTargetingKeyId) {
        this.contentBrowseCustomTargetingKeyId = contentBrowseCustomTargetingKeyId;
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
            ((this.effectiveRootAdUnitId==null && other.getEffectiveRootAdUnitId()==null) || 
             (this.effectiveRootAdUnitId!=null &&
              this.effectiveRootAdUnitId.equals(other.getEffectiveRootAdUnitId()))) &&
            ((this.contentBrowseCustomTargetingKeyId==null && other.getContentBrowseCustomTargetingKeyId()==null) || 
             (this.contentBrowseCustomTargetingKeyId!=null &&
              this.contentBrowseCustomTargetingKeyId.equals(other.getContentBrowseCustomTargetingKeyId()))) &&
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
        if (getEffectiveRootAdUnitId() != null) {
            _hashCode += getEffectiveRootAdUnitId().hashCode();
        }
        if (getContentBrowseCustomTargetingKeyId() != null) {
            _hashCode += getContentBrowseCustomTargetingKeyId().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Network"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "networkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "propertyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRootAdUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "effectiveRootAdUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentBrowseCustomTargetingKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "contentBrowseCustomTargetingKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "isTest"));
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
