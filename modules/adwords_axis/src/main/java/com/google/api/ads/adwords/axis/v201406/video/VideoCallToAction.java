/**
 * VideoCallToAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents a video and associated call to action.
 */
public class VideoCallToAction  implements java.io.Serializable {
    /* Id of the video for which to edit the call to action.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String id;

    /* Call to action overlay data for this video. */
    private com.google.api.ads.adwords.axis.v201406.video.CallToAction callToAction;

    public VideoCallToAction() {
    }

    public VideoCallToAction(
           java.lang.String id,
           com.google.api.ads.adwords.axis.v201406.video.CallToAction callToAction) {
           this.id = id;
           this.callToAction = callToAction;
    }


    /**
     * Gets the id value for this VideoCallToAction.
     * 
     * @return id   * Id of the video for which to edit the call to action.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this VideoCallToAction.
     * 
     * @param id   * Id of the video for which to edit the call to action.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the callToAction value for this VideoCallToAction.
     * 
     * @return callToAction   * Call to action overlay data for this video.
     */
    public com.google.api.ads.adwords.axis.v201406.video.CallToAction getCallToAction() {
        return callToAction;
    }


    /**
     * Sets the callToAction value for this VideoCallToAction.
     * 
     * @param callToAction   * Call to action overlay data for this video.
     */
    public void setCallToAction(com.google.api.ads.adwords.axis.v201406.video.CallToAction callToAction) {
        this.callToAction = callToAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoCallToAction)) return false;
        VideoCallToAction other = (VideoCallToAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.callToAction==null && other.getCallToAction()==null) || 
             (this.callToAction!=null &&
              this.callToAction.equals(other.getCallToAction())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCallToAction() != null) {
            _hashCode += getCallToAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoCallToAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoCallToAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callToAction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "callToAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "CallToAction"));
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
