/**
 * PendingInvitationSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.mcm;


/**
 * Selector for getPendingInvitations method.
 */
public class PendingInvitationSelector  implements java.io.Serializable {
    /* Manager customer IDs to check for sent invitations. */
    private long[] managerCustomerIds;

    /* Client customer IDs to check for received invitations. */
    private long[] clientCustomerIds;

    public PendingInvitationSelector() {
    }

    public PendingInvitationSelector(
           long[] managerCustomerIds,
           long[] clientCustomerIds) {
           this.managerCustomerIds = managerCustomerIds;
           this.clientCustomerIds = clientCustomerIds;
    }


    /**
     * Gets the managerCustomerIds value for this PendingInvitationSelector.
     * 
     * @return managerCustomerIds   * Manager customer IDs to check for sent invitations.
     */
    public long[] getManagerCustomerIds() {
        return managerCustomerIds;
    }


    /**
     * Sets the managerCustomerIds value for this PendingInvitationSelector.
     * 
     * @param managerCustomerIds   * Manager customer IDs to check for sent invitations.
     */
    public void setManagerCustomerIds(long[] managerCustomerIds) {
        this.managerCustomerIds = managerCustomerIds;
    }

    public long getManagerCustomerIds(int i) {
        return this.managerCustomerIds[i];
    }

    public void setManagerCustomerIds(int i, long _value) {
        this.managerCustomerIds[i] = _value;
    }


    /**
     * Gets the clientCustomerIds value for this PendingInvitationSelector.
     * 
     * @return clientCustomerIds   * Client customer IDs to check for received invitations.
     */
    public long[] getClientCustomerIds() {
        return clientCustomerIds;
    }


    /**
     * Sets the clientCustomerIds value for this PendingInvitationSelector.
     * 
     * @param clientCustomerIds   * Client customer IDs to check for received invitations.
     */
    public void setClientCustomerIds(long[] clientCustomerIds) {
        this.clientCustomerIds = clientCustomerIds;
    }

    public long getClientCustomerIds(int i) {
        return this.clientCustomerIds[i];
    }

    public void setClientCustomerIds(int i, long _value) {
        this.clientCustomerIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingInvitationSelector)) return false;
        PendingInvitationSelector other = (PendingInvitationSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managerCustomerIds==null && other.getManagerCustomerIds()==null) || 
             (this.managerCustomerIds!=null &&
              java.util.Arrays.equals(this.managerCustomerIds, other.getManagerCustomerIds()))) &&
            ((this.clientCustomerIds==null && other.getClientCustomerIds()==null) || 
             (this.clientCustomerIds!=null &&
              java.util.Arrays.equals(this.clientCustomerIds, other.getClientCustomerIds())));
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
        if (getManagerCustomerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagerCustomerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagerCustomerIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientCustomerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientCustomerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientCustomerIds(), i);
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
        new org.apache.axis.description.TypeDesc(PendingInvitationSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201502", "PendingInvitationSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerCustomerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201502", "managerCustomerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCustomerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201502", "clientCustomerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
