/**
 * Alert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.mcm;


/**
 * Alert for a single client. Triggering events are grouped by {@link
 * AlertType} into the same alert
 *             with multiple {@link Details}.
 */
public class Alert  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201309.mcm.AlertSeverity alertSeverity;

    private com.google.api.ads.adwords.axis.v201309.mcm.AlertType alertType;

    /* The 10-digit Customer ID of the client causing this alert. */
    private java.lang.Long clientCustomerId;

    /* List of {@link Detail}s sorted by most recent trigger time. */
    private com.google.api.ads.adwords.axis.v201309.mcm.Detail[] details;

    public Alert() {
    }

    public Alert(
           com.google.api.ads.adwords.axis.v201309.mcm.AlertSeverity alertSeverity,
           com.google.api.ads.adwords.axis.v201309.mcm.AlertType alertType,
           java.lang.Long clientCustomerId,
           com.google.api.ads.adwords.axis.v201309.mcm.Detail[] details) {
           this.alertSeverity = alertSeverity;
           this.alertType = alertType;
           this.clientCustomerId = clientCustomerId;
           this.details = details;
    }


    /**
     * Gets the alertSeverity value for this Alert.
     * 
     * @return alertSeverity
     */
    public com.google.api.ads.adwords.axis.v201309.mcm.AlertSeverity getAlertSeverity() {
        return alertSeverity;
    }


    /**
     * Sets the alertSeverity value for this Alert.
     * 
     * @param alertSeverity
     */
    public void setAlertSeverity(com.google.api.ads.adwords.axis.v201309.mcm.AlertSeverity alertSeverity) {
        this.alertSeverity = alertSeverity;
    }


    /**
     * Gets the alertType value for this Alert.
     * 
     * @return alertType
     */
    public com.google.api.ads.adwords.axis.v201309.mcm.AlertType getAlertType() {
        return alertType;
    }


    /**
     * Sets the alertType value for this Alert.
     * 
     * @param alertType
     */
    public void setAlertType(com.google.api.ads.adwords.axis.v201309.mcm.AlertType alertType) {
        this.alertType = alertType;
    }


    /**
     * Gets the clientCustomerId value for this Alert.
     * 
     * @return clientCustomerId   * The 10-digit Customer ID of the client causing this alert.
     */
    public java.lang.Long getClientCustomerId() {
        return clientCustomerId;
    }


    /**
     * Sets the clientCustomerId value for this Alert.
     * 
     * @param clientCustomerId   * The 10-digit Customer ID of the client causing this alert.
     */
    public void setClientCustomerId(java.lang.Long clientCustomerId) {
        this.clientCustomerId = clientCustomerId;
    }


    /**
     * Gets the details value for this Alert.
     * 
     * @return details   * List of {@link Detail}s sorted by most recent trigger time.
     */
    public com.google.api.ads.adwords.axis.v201309.mcm.Detail[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this Alert.
     * 
     * @param details   * List of {@link Detail}s sorted by most recent trigger time.
     */
    public void setDetails(com.google.api.ads.adwords.axis.v201309.mcm.Detail[] details) {
        this.details = details;
    }

    public com.google.api.ads.adwords.axis.v201309.mcm.Detail getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, com.google.api.ads.adwords.axis.v201309.mcm.Detail _value) {
        this.details[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Alert)) return false;
        Alert other = (Alert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alertSeverity==null && other.getAlertSeverity()==null) || 
             (this.alertSeverity!=null &&
              this.alertSeverity.equals(other.getAlertSeverity()))) &&
            ((this.alertType==null && other.getAlertType()==null) || 
             (this.alertType!=null &&
              this.alertType.equals(other.getAlertType()))) &&
            ((this.clientCustomerId==null && other.getClientCustomerId()==null) || 
             (this.clientCustomerId!=null &&
              this.clientCustomerId.equals(other.getClientCustomerId()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails())));
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
        if (getAlertSeverity() != null) {
            _hashCode += getAlertSeverity().hashCode();
        }
        if (getAlertType() != null) {
            _hashCode += getAlertType().hashCode();
        }
        if (getClientCustomerId() != null) {
            _hashCode += getClientCustomerId().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
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
        new org.apache.axis.description.TypeDesc(Alert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "Alert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "alertSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "AlertSeverity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "alertType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "AlertType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "clientCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201309", "Detail"));
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
