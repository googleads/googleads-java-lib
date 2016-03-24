/**
 * MutateLinkResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.mcm;


/**
 * Results of a {@link ManagedCustomerService#mutateLink} call which
 * changes
 *             manager/client links.
 */
public class MutateLinkResults  implements java.io.Serializable {
    /* Links that were changed as a result of this call. */
    private com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomerLink[] links;

    public MutateLinkResults() {
    }

    public MutateLinkResults(
           com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomerLink[] links) {
           this.links = links;
    }


    /**
     * Gets the links value for this MutateLinkResults.
     * 
     * @return links   * Links that were changed as a result of this call.
     */
    public com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomerLink[] getLinks() {
        return links;
    }


    /**
     * Sets the links value for this MutateLinkResults.
     * 
     * @param links   * Links that were changed as a result of this call.
     */
    public void setLinks(com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomerLink[] links) {
        this.links = links;
    }

    public com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomerLink getLinks(int i) {
        return this.links[i];
    }

    public void setLinks(int i, com.google.api.ads.adwords.axis.v201603.mcm.ManagedCustomerLink _value) {
        this.links[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MutateLinkResults)) return false;
        MutateLinkResults other = (MutateLinkResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.links==null && other.getLinks()==null) || 
             (this.links!=null &&
              java.util.Arrays.equals(this.links, other.getLinks())));
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
        if (getLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinks(), i);
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
        new org.apache.axis.description.TypeDesc(MutateLinkResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201603", "MutateLinkResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("links");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201603", "links"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201603", "ManagedCustomerLink"));
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
