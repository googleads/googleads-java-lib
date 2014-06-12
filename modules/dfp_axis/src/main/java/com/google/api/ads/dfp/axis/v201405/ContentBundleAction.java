/**
 * ContentBundleAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * Represents the actions that can be performed on {@link ContentBundle}
 * objects.
 */
public abstract class ContentBundleAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of ContentBundleAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String contentBundleActionType;

    public ContentBundleAction() {
    }

    public ContentBundleAction(
           java.lang.String contentBundleActionType) {
           this.contentBundleActionType = contentBundleActionType;
    }


    /**
     * Gets the contentBundleActionType value for this ContentBundleAction.
     * 
     * @return contentBundleActionType   * Indicates that this instance is a subtype of ContentBundleAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getContentBundleActionType() {
        return contentBundleActionType;
    }


    /**
     * Sets the contentBundleActionType value for this ContentBundleAction.
     * 
     * @param contentBundleActionType   * Indicates that this instance is a subtype of ContentBundleAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setContentBundleActionType(java.lang.String contentBundleActionType) {
        this.contentBundleActionType = contentBundleActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentBundleAction)) return false;
        ContentBundleAction other = (ContentBundleAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentBundleActionType==null && other.getContentBundleActionType()==null) || 
             (this.contentBundleActionType!=null &&
              this.contentBundleActionType.equals(other.getContentBundleActionType())));
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
        if (getContentBundleActionType() != null) {
            _hashCode += getContentBundleActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentBundleAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ContentBundleAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentBundleActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ContentBundleAction.Type"));
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
