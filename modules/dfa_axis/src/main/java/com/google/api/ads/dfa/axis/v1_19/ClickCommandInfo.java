/**
 * ClickCommandInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class ClickCommandInfo  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.AdBase ad;

    private java.lang.String clickCommand;

    private com.google.api.ads.dfa.axis.v1_19.PlacementBase placement;

    public ClickCommandInfo() {
    }

    public ClickCommandInfo(
           com.google.api.ads.dfa.axis.v1_19.AdBase ad,
           java.lang.String clickCommand,
           com.google.api.ads.dfa.axis.v1_19.PlacementBase placement) {
           this.ad = ad;
           this.clickCommand = clickCommand;
           this.placement = placement;
    }


    /**
     * Gets the ad value for this ClickCommandInfo.
     * 
     * @return ad
     */
    public com.google.api.ads.dfa.axis.v1_19.AdBase getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this ClickCommandInfo.
     * 
     * @param ad
     */
    public void setAd(com.google.api.ads.dfa.axis.v1_19.AdBase ad) {
        this.ad = ad;
    }


    /**
     * Gets the clickCommand value for this ClickCommandInfo.
     * 
     * @return clickCommand
     */
    public java.lang.String getClickCommand() {
        return clickCommand;
    }


    /**
     * Sets the clickCommand value for this ClickCommandInfo.
     * 
     * @param clickCommand
     */
    public void setClickCommand(java.lang.String clickCommand) {
        this.clickCommand = clickCommand;
    }


    /**
     * Gets the placement value for this ClickCommandInfo.
     * 
     * @return placement
     */
    public com.google.api.ads.dfa.axis.v1_19.PlacementBase getPlacement() {
        return placement;
    }


    /**
     * Sets the placement value for this ClickCommandInfo.
     * 
     * @param placement
     */
    public void setPlacement(com.google.api.ads.dfa.axis.v1_19.PlacementBase placement) {
        this.placement = placement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClickCommandInfo)) return false;
        ClickCommandInfo other = (ClickCommandInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              this.ad.equals(other.getAd()))) &&
            ((this.clickCommand==null && other.getClickCommand()==null) || 
             (this.clickCommand!=null &&
              this.clickCommand.equals(other.getClickCommand()))) &&
            ((this.placement==null && other.getPlacement()==null) || 
             (this.placement!=null &&
              this.placement.equals(other.getPlacement())));
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
        if (getAd() != null) {
            _hashCode += getAd().hashCode();
        }
        if (getClickCommand() != null) {
            _hashCode += getClickCommand().hashCode();
        }
        if (getPlacement() != null) {
            _hashCode += getPlacement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClickCommandInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ClickCommandInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementBase"));
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
