/**
 * RichMediaNetworkConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaNetworkConfiguration  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.BillingCustomer billingCustomer;

    private long changeUserId;

    private long customerId;

    private java.util.Calendar dateAssigned;

    private long network;

    private long teaserSizeLimit;

    public RichMediaNetworkConfiguration() {
    }

    public RichMediaNetworkConfiguration(
           com.google.api.ads.dfa.axis.v1_20.BillingCustomer billingCustomer,
           long changeUserId,
           long customerId,
           java.util.Calendar dateAssigned,
           long network,
           long teaserSizeLimit) {
           this.billingCustomer = billingCustomer;
           this.changeUserId = changeUserId;
           this.customerId = customerId;
           this.dateAssigned = dateAssigned;
           this.network = network;
           this.teaserSizeLimit = teaserSizeLimit;
    }


    /**
     * Gets the billingCustomer value for this RichMediaNetworkConfiguration.
     * 
     * @return billingCustomer
     */
    public com.google.api.ads.dfa.axis.v1_20.BillingCustomer getBillingCustomer() {
        return billingCustomer;
    }


    /**
     * Sets the billingCustomer value for this RichMediaNetworkConfiguration.
     * 
     * @param billingCustomer
     */
    public void setBillingCustomer(com.google.api.ads.dfa.axis.v1_20.BillingCustomer billingCustomer) {
        this.billingCustomer = billingCustomer;
    }


    /**
     * Gets the changeUserId value for this RichMediaNetworkConfiguration.
     * 
     * @return changeUserId
     */
    public long getChangeUserId() {
        return changeUserId;
    }


    /**
     * Sets the changeUserId value for this RichMediaNetworkConfiguration.
     * 
     * @param changeUserId
     */
    public void setChangeUserId(long changeUserId) {
        this.changeUserId = changeUserId;
    }


    /**
     * Gets the customerId value for this RichMediaNetworkConfiguration.
     * 
     * @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this RichMediaNetworkConfiguration.
     * 
     * @param customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the dateAssigned value for this RichMediaNetworkConfiguration.
     * 
     * @return dateAssigned
     */
    public java.util.Calendar getDateAssigned() {
        return dateAssigned;
    }


    /**
     * Sets the dateAssigned value for this RichMediaNetworkConfiguration.
     * 
     * @param dateAssigned
     */
    public void setDateAssigned(java.util.Calendar dateAssigned) {
        this.dateAssigned = dateAssigned;
    }


    /**
     * Gets the network value for this RichMediaNetworkConfiguration.
     * 
     * @return network
     */
    public long getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this RichMediaNetworkConfiguration.
     * 
     * @param network
     */
    public void setNetwork(long network) {
        this.network = network;
    }


    /**
     * Gets the teaserSizeLimit value for this RichMediaNetworkConfiguration.
     * 
     * @return teaserSizeLimit
     */
    public long getTeaserSizeLimit() {
        return teaserSizeLimit;
    }


    /**
     * Sets the teaserSizeLimit value for this RichMediaNetworkConfiguration.
     * 
     * @param teaserSizeLimit
     */
    public void setTeaserSizeLimit(long teaserSizeLimit) {
        this.teaserSizeLimit = teaserSizeLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaNetworkConfiguration)) return false;
        RichMediaNetworkConfiguration other = (RichMediaNetworkConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingCustomer==null && other.getBillingCustomer()==null) || 
             (this.billingCustomer!=null &&
              this.billingCustomer.equals(other.getBillingCustomer()))) &&
            this.changeUserId == other.getChangeUserId() &&
            this.customerId == other.getCustomerId() &&
            ((this.dateAssigned==null && other.getDateAssigned()==null) || 
             (this.dateAssigned!=null &&
              this.dateAssigned.equals(other.getDateAssigned()))) &&
            this.network == other.getNetwork() &&
            this.teaserSizeLimit == other.getTeaserSizeLimit();
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
        if (getBillingCustomer() != null) {
            _hashCode += getBillingCustomer().hashCode();
        }
        _hashCode += new Long(getChangeUserId()).hashCode();
        _hashCode += new Long(getCustomerId()).hashCode();
        if (getDateAssigned() != null) {
            _hashCode += getDateAssigned().hashCode();
        }
        _hashCode += new Long(getNetwork()).hashCode();
        _hashCode += new Long(getTeaserSizeLimit()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaNetworkConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaNetworkConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "BillingCustomer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateAssigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teaserSizeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teaserSizeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
