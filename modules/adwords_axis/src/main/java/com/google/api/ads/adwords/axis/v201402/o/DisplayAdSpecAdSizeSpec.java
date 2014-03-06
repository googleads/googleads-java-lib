/**
 * DisplayAdSpecAdSizeSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.o;


/**
 * Specification for an ad size. This specification allows customization
 * by
 *             display options for more fine-grained control over returns,
 * so that
 *             customers can associate ad options with specific sizes.
 * For example,
 *             suppose the customer in general would like to see placements
 * with
 *             {@code DisplayOption.STANDARD} and {@code DisplayOption.POP_UNDER}
 * -
 *             except for 300x250 ads which should only be STANDARD.
 * The customer would
 *             create a {@code DisplayAdSpec} with {@code DisplayOption.STANDARD}
 * and
 *             {@code DisplayOption.POP_UNDER}, and also send in an {@code
 * AdSizeSpec}
 *             with {@code width} of 300, {@code} height of 250, and
 * {@code displayOptionFilter}
 *             set to {@code DisplayOption.STANDARD}.
 */
public class DisplayAdSpecAdSizeSpec  implements java.io.Serializable {
    private java.lang.Long width;

    private java.lang.Long height;

    private com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] activationOptionFilter;

    public DisplayAdSpecAdSizeSpec() {
    }

    public DisplayAdSpecAdSizeSpec(
           java.lang.Long width,
           java.lang.Long height,
           com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] activationOptionFilter) {
           this.width = width;
           this.height = height;
           this.activationOptionFilter = activationOptionFilter;
    }


    /**
     * Gets the width value for this DisplayAdSpecAdSizeSpec.
     * 
     * @return width
     */
    public java.lang.Long getWidth() {
        return width;
    }


    /**
     * Sets the width value for this DisplayAdSpecAdSizeSpec.
     * 
     * @param width
     */
    public void setWidth(java.lang.Long width) {
        this.width = width;
    }


    /**
     * Gets the height value for this DisplayAdSpecAdSizeSpec.
     * 
     * @return height
     */
    public java.lang.Long getHeight() {
        return height;
    }


    /**
     * Sets the height value for this DisplayAdSpecAdSizeSpec.
     * 
     * @param height
     */
    public void setHeight(java.lang.Long height) {
        this.height = height;
    }


    /**
     * Gets the activationOptionFilter value for this DisplayAdSpecAdSizeSpec.
     * 
     * @return activationOptionFilter
     */
    public com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] getActivationOptionFilter() {
        return activationOptionFilter;
    }


    /**
     * Sets the activationOptionFilter value for this DisplayAdSpecAdSizeSpec.
     * 
     * @param activationOptionFilter
     */
    public void setActivationOptionFilter(com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] activationOptionFilter) {
        this.activationOptionFilter = activationOptionFilter;
    }

    public com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption getActivationOptionFilter(int i) {
        return this.activationOptionFilter[i];
    }

    public void setActivationOptionFilter(int i, com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption _value) {
        this.activationOptionFilter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayAdSpecAdSizeSpec)) return false;
        DisplayAdSpecAdSizeSpec other = (DisplayAdSpecAdSizeSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.activationOptionFilter==null && other.getActivationOptionFilter()==null) || 
             (this.activationOptionFilter!=null &&
              java.util.Arrays.equals(this.activationOptionFilter, other.getActivationOptionFilter())));
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
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getActivationOptionFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivationOptionFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivationOptionFilter(), i);
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
        new org.apache.axis.description.TypeDesc(DisplayAdSpecAdSizeSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DisplayAdSpec.AdSizeSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationOptionFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "activationOptionFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DisplayAdSpec.ActivationOption"));
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
