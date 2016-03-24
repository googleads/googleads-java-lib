/**
 * IpBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Criterion used for IP exclusions. We allow:
 *             
 *             <ul>
 *             <li>IPv4 and IPv6 addresses</li>
 *             <li>individual addresses (192.168.0.1)</li>
 *             <li>CIDR IP address blocks (e.g., 1.2.3.0/24, 2001:db8::/32).
 * </ul>
 *             
 *             <p> Note that for a CIDR IP address block, the specified
 * IP address portion must be properly
 *             truncated (i.e. all the host bits must be zero) or the
 * input is considered malformed.
 *             For example, "1.2.3.0/24" is accepted but "1.2.3.4/24"
 * is not.
 *             Similarly, for IPv6, "2001:db8::/32" is accepted whereas
 * "2001:db8::1/32" is not.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class IpBlock  extends com.google.api.ads.adwords.axis.v201506.cm.Criterion  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.String ipAddress;

    public IpBlock() {
    }

    public IpBlock(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201506.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String ipAddress) {
        super(
            id,
            type,
            criterionType);
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the ipAddress value for this IpBlock.
     * 
     * @return ipAddress   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this IpBlock.
     * 
     * @param ipAddress   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpBlock)) return false;
        IpBlock other = (IpBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress())));
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
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "IpBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ipAddress"));
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
