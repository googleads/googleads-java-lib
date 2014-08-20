/**
 * LiveStreamEventAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201408;


/**
 * Represents the actions that can be performed on {@link LiveStreamEvent}
 * objects.
 */
public abstract class LiveStreamEventAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of LiveStreamEventAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String liveStreamEventActionType;

    public LiveStreamEventAction() {
    }

    public LiveStreamEventAction(
           java.lang.String liveStreamEventActionType) {
           this.liveStreamEventActionType = liveStreamEventActionType;
    }


    /**
     * Gets the liveStreamEventActionType value for this LiveStreamEventAction.
     * 
     * @return liveStreamEventActionType   * Indicates that this instance is a subtype of LiveStreamEventAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getLiveStreamEventActionType() {
        return liveStreamEventActionType;
    }


    /**
     * Sets the liveStreamEventActionType value for this LiveStreamEventAction.
     * 
     * @param liveStreamEventActionType   * Indicates that this instance is a subtype of LiveStreamEventAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setLiveStreamEventActionType(java.lang.String liveStreamEventActionType) {
        this.liveStreamEventActionType = liveStreamEventActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveStreamEventAction)) return false;
        LiveStreamEventAction other = (LiveStreamEventAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.liveStreamEventActionType==null && other.getLiveStreamEventActionType()==null) || 
             (this.liveStreamEventActionType!=null &&
              this.liveStreamEventActionType.equals(other.getLiveStreamEventActionType())));
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
        if (getLiveStreamEventActionType() != null) {
            _hashCode += getLiveStreamEventActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveStreamEventAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "LiveStreamEventAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveStreamEventActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "LiveStreamEventAction.Type"));
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
