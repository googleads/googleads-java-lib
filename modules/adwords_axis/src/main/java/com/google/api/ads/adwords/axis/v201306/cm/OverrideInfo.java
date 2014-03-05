/**
 * OverrideInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents additional override info with which to augment the override
 * extension.
 */
public class OverrideInfo  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201306.cm.LocationOverrideInfo locationOverrideInfo;

    public OverrideInfo() {
    }

    public OverrideInfo(
           com.google.api.ads.adwords.axis.v201306.cm.LocationOverrideInfo locationOverrideInfo) {
           this.locationOverrideInfo = locationOverrideInfo;
    }


    /**
     * Gets the locationOverrideInfo value for this OverrideInfo.
     * 
     * @return locationOverrideInfo
     */
    public com.google.api.ads.adwords.axis.v201306.cm.LocationOverrideInfo getLocationOverrideInfo() {
        return locationOverrideInfo;
    }


    /**
     * Sets the locationOverrideInfo value for this OverrideInfo.
     * 
     * @param locationOverrideInfo
     */
    public void setLocationOverrideInfo(com.google.api.ads.adwords.axis.v201306.cm.LocationOverrideInfo locationOverrideInfo) {
        this.locationOverrideInfo = locationOverrideInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverrideInfo)) return false;
        OverrideInfo other = (OverrideInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locationOverrideInfo==null && other.getLocationOverrideInfo()==null) || 
             (this.locationOverrideInfo!=null &&
              this.locationOverrideInfo.equals(other.getLocationOverrideInfo())));
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
        if (getLocationOverrideInfo() != null) {
            _hashCode += getLocationOverrideInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverrideInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "OverrideInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationOverrideInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "LocationOverrideInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "LocationOverrideInfo"));
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
