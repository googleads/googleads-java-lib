/**
 * ExpressSoapHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.express;


/**
 * {@link SoapHeader} for AdWords Express services.
 */
public class ExpressSoapHeader  extends com.google.api.ads.adwords.axis.v201402.cm.SoapHeader  implements java.io.Serializable {
    /* Adwords Express business Id */
    private java.lang.Long expressBusinessId;

    /* Google+ page ID of the Google My Business page
     *                     See <a href="https://support.google.com/business/answer/4569085#direct">Link
     * your Google+ page
     *                     to your website</a> for help identifying your
     * page ID. */
    private java.lang.String pageId;

    public ExpressSoapHeader() {
    }

    public ExpressSoapHeader(
           java.lang.String clientCustomerId,
           java.lang.String developerToken,
           java.lang.String userAgent,
           java.lang.Boolean validateOnly,
           java.lang.Boolean partialFailure,
           java.lang.Long expressBusinessId,
           java.lang.String pageId) {
        super(
            clientCustomerId,
            developerToken,
            userAgent,
            validateOnly,
            partialFailure);
        this.expressBusinessId = expressBusinessId;
        this.pageId = pageId;
    }


    /**
     * Gets the expressBusinessId value for this ExpressSoapHeader.
     * 
     * @return expressBusinessId   * Adwords Express business Id
     */
    public java.lang.Long getExpressBusinessId() {
        return expressBusinessId;
    }


    /**
     * Sets the expressBusinessId value for this ExpressSoapHeader.
     * 
     * @param expressBusinessId   * Adwords Express business Id
     */
    public void setExpressBusinessId(java.lang.Long expressBusinessId) {
        this.expressBusinessId = expressBusinessId;
    }


    /**
     * Gets the pageId value for this ExpressSoapHeader.
     * 
     * @return pageId   * Google+ page ID of the Google My Business page
     *                     See <a href="https://support.google.com/business/answer/4569085#direct">Link
     * your Google+ page
     *                     to your website</a> for help identifying your
     * page ID.
     */
    public java.lang.String getPageId() {
        return pageId;
    }


    /**
     * Sets the pageId value for this ExpressSoapHeader.
     * 
     * @param pageId   * Google+ page ID of the Google My Business page
     *                     See <a href="https://support.google.com/business/answer/4569085#direct">Link
     * your Google+ page
     *                     to your website</a> for help identifying your
     * page ID.
     */
    public void setPageId(java.lang.String pageId) {
        this.pageId = pageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpressSoapHeader)) return false;
        ExpressSoapHeader other = (ExpressSoapHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expressBusinessId==null && other.getExpressBusinessId()==null) || 
             (this.expressBusinessId!=null &&
              this.expressBusinessId.equals(other.getExpressBusinessId()))) &&
            ((this.pageId==null && other.getPageId()==null) || 
             (this.pageId!=null &&
              this.pageId.equals(other.getPageId())));
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
        if (getExpressBusinessId() != null) {
            _hashCode += getExpressBusinessId().hashCode();
        }
        if (getPageId() != null) {
            _hashCode += getPageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressSoapHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201402", "ExpressSoapHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressBusinessId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201402", "expressBusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201402", "pageId"));
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
