/**
 * GeoPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * Specifies a geo location with the supplied latitude/longitude.
 */
public class GeoPoint  implements java.io.Serializable {
    /* Micro degrees for the latitude.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer latitudeInMicroDegrees;

    /* Micro degrees for the longitude.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer longitudeInMicroDegrees;

    public GeoPoint() {
    }

    public GeoPoint(
           java.lang.Integer latitudeInMicroDegrees,
           java.lang.Integer longitudeInMicroDegrees) {
           this.latitudeInMicroDegrees = latitudeInMicroDegrees;
           this.longitudeInMicroDegrees = longitudeInMicroDegrees;
    }


    /**
     * Gets the latitudeInMicroDegrees value for this GeoPoint.
     * 
     * @return latitudeInMicroDegrees   * Micro degrees for the latitude.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getLatitudeInMicroDegrees() {
        return latitudeInMicroDegrees;
    }


    /**
     * Sets the latitudeInMicroDegrees value for this GeoPoint.
     * 
     * @param latitudeInMicroDegrees   * Micro degrees for the latitude.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setLatitudeInMicroDegrees(java.lang.Integer latitudeInMicroDegrees) {
        this.latitudeInMicroDegrees = latitudeInMicroDegrees;
    }


    /**
     * Gets the longitudeInMicroDegrees value for this GeoPoint.
     * 
     * @return longitudeInMicroDegrees   * Micro degrees for the longitude.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getLongitudeInMicroDegrees() {
        return longitudeInMicroDegrees;
    }


    /**
     * Sets the longitudeInMicroDegrees value for this GeoPoint.
     * 
     * @param longitudeInMicroDegrees   * Micro degrees for the longitude.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setLongitudeInMicroDegrees(java.lang.Integer longitudeInMicroDegrees) {
        this.longitudeInMicroDegrees = longitudeInMicroDegrees;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoPoint)) return false;
        GeoPoint other = (GeoPoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.latitudeInMicroDegrees==null && other.getLatitudeInMicroDegrees()==null) || 
             (this.latitudeInMicroDegrees!=null &&
              this.latitudeInMicroDegrees.equals(other.getLatitudeInMicroDegrees()))) &&
            ((this.longitudeInMicroDegrees==null && other.getLongitudeInMicroDegrees()==null) || 
             (this.longitudeInMicroDegrees!=null &&
              this.longitudeInMicroDegrees.equals(other.getLongitudeInMicroDegrees())));
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
        if (getLatitudeInMicroDegrees() != null) {
            _hashCode += getLatitudeInMicroDegrees().hashCode();
        }
        if (getLongitudeInMicroDegrees() != null) {
            _hashCode += getLongitudeInMicroDegrees().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "GeoPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeInMicroDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "latitudeInMicroDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudeInMicroDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "longitudeInMicroDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
