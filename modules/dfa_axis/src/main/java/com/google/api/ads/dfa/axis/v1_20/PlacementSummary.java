/**
 * PlacementSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class PlacementSummary  extends com.google.api.ads.dfa.axis.v1_20.PlacementBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow;

    public PlacementSummary() {
    }

    public PlacementSummary(
           long id,
           java.lang.String name,
           com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow) {
        super(
            id,
            name);
        this.lookbackWindow = lookbackWindow;
    }


    /**
     * Gets the lookbackWindow value for this PlacementSummary.
     * 
     * @return lookbackWindow
     */
    public com.google.api.ads.dfa.axis.v1_20.LookbackWindow getLookbackWindow() {
        return lookbackWindow;
    }


    /**
     * Sets the lookbackWindow value for this PlacementSummary.
     * 
     * @param lookbackWindow
     */
    public void setLookbackWindow(com.google.api.ads.dfa.axis.v1_20.LookbackWindow lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementSummary)) return false;
        PlacementSummary other = (PlacementSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lookbackWindow==null && other.getLookbackWindow()==null) || 
             (this.lookbackWindow!=null &&
              this.lookbackWindow.equals(other.getLookbackWindow())));
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
        if (getLookbackWindow() != null) {
            _hashCode += getLookbackWindow().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PlacementSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "LookbackWindow"));
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
