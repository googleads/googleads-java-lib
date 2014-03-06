/**
 * CmsContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * Contains information about {@link Content} from the CMS it was
 * ingested from.
 */
public class CmsContent  implements java.io.Serializable {
    /* The display name of the CMS this content is in. This attribute
     * is read-only. */
    private java.lang.String displayName;

    /* The ID of the {@link Content} in the CMS. This attribute is
     * read-only. */
    private java.lang.String cmsContentId;

    public CmsContent() {
    }

    public CmsContent(
           java.lang.String displayName,
           java.lang.String cmsContentId) {
           this.displayName = displayName;
           this.cmsContentId = cmsContentId;
    }


    /**
     * Gets the displayName value for this CmsContent.
     * 
     * @return displayName   * The display name of the CMS this content is in. This attribute
     * is read-only.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CmsContent.
     * 
     * @param displayName   * The display name of the CMS this content is in. This attribute
     * is read-only.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the cmsContentId value for this CmsContent.
     * 
     * @return cmsContentId   * The ID of the {@link Content} in the CMS. This attribute is
     * read-only.
     */
    public java.lang.String getCmsContentId() {
        return cmsContentId;
    }


    /**
     * Sets the cmsContentId value for this CmsContent.
     * 
     * @param cmsContentId   * The ID of the {@link Content} in the CMS. This attribute is
     * read-only.
     */
    public void setCmsContentId(java.lang.String cmsContentId) {
        this.cmsContentId = cmsContentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmsContent)) return false;
        CmsContent other = (CmsContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.cmsContentId==null && other.getCmsContentId()==null) || 
             (this.cmsContentId!=null &&
              this.cmsContentId.equals(other.getCmsContentId())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getCmsContentId() != null) {
            _hashCode += getCmsContentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmsContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "CmsContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsContentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "cmsContentId"));
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
