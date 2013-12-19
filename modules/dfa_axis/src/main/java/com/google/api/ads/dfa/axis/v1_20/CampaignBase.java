/**
 * CampaignBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CampaignBase  extends com.google.api.ads.dfa.axis.v1_20.Base  implements java.io.Serializable {
    private long advertiserId;

    private boolean archived;

    private java.lang.String billingInvoiceNotation;

    private java.lang.String comments;

    private long defaultLandingPageId;

    private java.util.Calendar endDate;

    private java.util.Calendar startDate;

    public CampaignBase() {
    }

    public CampaignBase(
           long id,
           java.lang.String name,
           long advertiserId,
           boolean archived,
           java.lang.String billingInvoiceNotation,
           java.lang.String comments,
           long defaultLandingPageId,
           java.util.Calendar endDate,
           java.util.Calendar startDate) {
        super(
            id,
            name);
        this.advertiserId = advertiserId;
        this.archived = archived;
        this.billingInvoiceNotation = billingInvoiceNotation;
        this.comments = comments;
        this.defaultLandingPageId = defaultLandingPageId;
        this.endDate = endDate;
        this.startDate = startDate;
    }


    /**
     * Gets the advertiserId value for this CampaignBase.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this CampaignBase.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the archived value for this CampaignBase.
     * 
     * @return archived
     */
    public boolean isArchived() {
        return archived;
    }


    /**
     * Sets the archived value for this CampaignBase.
     * 
     * @param archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }


    /**
     * Gets the billingInvoiceNotation value for this CampaignBase.
     * 
     * @return billingInvoiceNotation
     */
    public java.lang.String getBillingInvoiceNotation() {
        return billingInvoiceNotation;
    }


    /**
     * Sets the billingInvoiceNotation value for this CampaignBase.
     * 
     * @param billingInvoiceNotation
     */
    public void setBillingInvoiceNotation(java.lang.String billingInvoiceNotation) {
        this.billingInvoiceNotation = billingInvoiceNotation;
    }


    /**
     * Gets the comments value for this CampaignBase.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CampaignBase.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the defaultLandingPageId value for this CampaignBase.
     * 
     * @return defaultLandingPageId
     */
    public long getDefaultLandingPageId() {
        return defaultLandingPageId;
    }


    /**
     * Sets the defaultLandingPageId value for this CampaignBase.
     * 
     * @param defaultLandingPageId
     */
    public void setDefaultLandingPageId(long defaultLandingPageId) {
        this.defaultLandingPageId = defaultLandingPageId;
    }


    /**
     * Gets the endDate value for this CampaignBase.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CampaignBase.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the startDate value for this CampaignBase.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CampaignBase.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignBase)) return false;
        CampaignBase other = (CampaignBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.advertiserId == other.getAdvertiserId() &&
            this.archived == other.isArchived() &&
            ((this.billingInvoiceNotation==null && other.getBillingInvoiceNotation()==null) || 
             (this.billingInvoiceNotation!=null &&
              this.billingInvoiceNotation.equals(other.getBillingInvoiceNotation()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.defaultLandingPageId == other.getDefaultLandingPageId() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        _hashCode += new Long(getAdvertiserId()).hashCode();
        _hashCode += (isArchived() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBillingInvoiceNotation() != null) {
            _hashCode += getBillingInvoiceNotation().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += new Long(getDefaultLandingPageId()).hashCode();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CampaignBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInvoiceNotation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingInvoiceNotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLandingPageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLandingPageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
