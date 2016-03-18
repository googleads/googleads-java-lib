/**
 * CustomerExtensionSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * A CustomerExtensionSetting is used to add or modify extensions
 * being served for the customer.
 */
public class CustomerExtensionSetting  implements java.io.Serializable {
    /* The extension type the extension setting applies to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExtensionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.FeedType extensionType;

    /* The extension setting specifying which extensions to serve
     * for all of the customer's campaigns.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.ExtensionSetting extensionSetting;

    public CustomerExtensionSetting() {
    }

    public CustomerExtensionSetting(
           com.google.api.ads.adwords.axis.v201601.cm.FeedType extensionType,
           com.google.api.ads.adwords.axis.v201601.cm.ExtensionSetting extensionSetting) {
           this.extensionType = extensionType;
           this.extensionSetting = extensionSetting;
    }


    /**
     * Gets the extensionType value for this CustomerExtensionSetting.
     * 
     * @return extensionType   * The extension type the extension setting applies to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExtensionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.FeedType getExtensionType() {
        return extensionType;
    }


    /**
     * Sets the extensionType value for this CustomerExtensionSetting.
     * 
     * @param extensionType   * The extension type the extension setting applies to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExtensionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setExtensionType(com.google.api.ads.adwords.axis.v201601.cm.FeedType extensionType) {
        this.extensionType = extensionType;
    }


    /**
     * Gets the extensionSetting value for this CustomerExtensionSetting.
     * 
     * @return extensionSetting   * The extension setting specifying which extensions to serve
     * for all of the customer's campaigns.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.ExtensionSetting getExtensionSetting() {
        return extensionSetting;
    }


    /**
     * Sets the extensionSetting value for this CustomerExtensionSetting.
     * 
     * @param extensionSetting   * The extension setting specifying which extensions to serve
     * for all of the customer's campaigns.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setExtensionSetting(com.google.api.ads.adwords.axis.v201601.cm.ExtensionSetting extensionSetting) {
        this.extensionSetting = extensionSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerExtensionSetting)) return false;
        CustomerExtensionSetting other = (CustomerExtensionSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionType==null && other.getExtensionType()==null) || 
             (this.extensionType!=null &&
              this.extensionType.equals(other.getExtensionType()))) &&
            ((this.extensionSetting==null && other.getExtensionSetting()==null) || 
             (this.extensionSetting!=null &&
              this.extensionSetting.equals(other.getExtensionSetting())));
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
        if (getExtensionType() != null) {
            _hashCode += getExtensionType().hashCode();
        }
        if (getExtensionSetting() != null) {
            _hashCode += getExtensionSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerExtensionSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CustomerExtensionSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "extensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Feed.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "extensionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ExtensionSetting"));
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
