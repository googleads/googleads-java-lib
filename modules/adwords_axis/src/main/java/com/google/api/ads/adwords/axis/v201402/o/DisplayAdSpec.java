/**
 * DisplayAdSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.o;


/**
 * Placement request/response object which provides details about
 * display
 *             ad types, options, and other available configuration variables.
 */
public class DisplayAdSpec  implements java.io.Serializable {
    /* Display ad subtypes requested. Only one of each DisplayType
     * is allowed and multiples will result in an error being returned from
     * the
     *                 service. Parameters specific to each display type
     * may be set within this
     *                 set. */
    private com.google.api.ads.adwords.axis.v201402.o.DisplayType[] displayTypes;

    private com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] activationOptions;

    private com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecAdSizeSpec[] adSizeSpecs;

    public DisplayAdSpec() {
    }

    public DisplayAdSpec(
           com.google.api.ads.adwords.axis.v201402.o.DisplayType[] displayTypes,
           com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] activationOptions,
           com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecAdSizeSpec[] adSizeSpecs) {
           this.displayTypes = displayTypes;
           this.activationOptions = activationOptions;
           this.adSizeSpecs = adSizeSpecs;
    }


    /**
     * Gets the displayTypes value for this DisplayAdSpec.
     * 
     * @return displayTypes   * Display ad subtypes requested. Only one of each DisplayType
     * is allowed and multiples will result in an error being returned from
     * the
     *                 service. Parameters specific to each display type
     * may be set within this
     *                 set.
     */
    public com.google.api.ads.adwords.axis.v201402.o.DisplayType[] getDisplayTypes() {
        return displayTypes;
    }


    /**
     * Sets the displayTypes value for this DisplayAdSpec.
     * 
     * @param displayTypes   * Display ad subtypes requested. Only one of each DisplayType
     * is allowed and multiples will result in an error being returned from
     * the
     *                 service. Parameters specific to each display type
     * may be set within this
     *                 set.
     */
    public void setDisplayTypes(com.google.api.ads.adwords.axis.v201402.o.DisplayType[] displayTypes) {
        this.displayTypes = displayTypes;
    }

    public com.google.api.ads.adwords.axis.v201402.o.DisplayType getDisplayTypes(int i) {
        return this.displayTypes[i];
    }

    public void setDisplayTypes(int i, com.google.api.ads.adwords.axis.v201402.o.DisplayType _value) {
        this.displayTypes[i] = _value;
    }


    /**
     * Gets the activationOptions value for this DisplayAdSpec.
     * 
     * @return activationOptions
     */
    public com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] getActivationOptions() {
        return activationOptions;
    }


    /**
     * Sets the activationOptions value for this DisplayAdSpec.
     * 
     * @param activationOptions
     */
    public void setActivationOptions(com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption[] activationOptions) {
        this.activationOptions = activationOptions;
    }

    public com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption getActivationOptions(int i) {
        return this.activationOptions[i];
    }

    public void setActivationOptions(int i, com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecActivationOption _value) {
        this.activationOptions[i] = _value;
    }


    /**
     * Gets the adSizeSpecs value for this DisplayAdSpec.
     * 
     * @return adSizeSpecs
     */
    public com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecAdSizeSpec[] getAdSizeSpecs() {
        return adSizeSpecs;
    }


    /**
     * Sets the adSizeSpecs value for this DisplayAdSpec.
     * 
     * @param adSizeSpecs
     */
    public void setAdSizeSpecs(com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecAdSizeSpec[] adSizeSpecs) {
        this.adSizeSpecs = adSizeSpecs;
    }

    public com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecAdSizeSpec getAdSizeSpecs(int i) {
        return this.adSizeSpecs[i];
    }

    public void setAdSizeSpecs(int i, com.google.api.ads.adwords.axis.v201402.o.DisplayAdSpecAdSizeSpec _value) {
        this.adSizeSpecs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayAdSpec)) return false;
        DisplayAdSpec other = (DisplayAdSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayTypes==null && other.getDisplayTypes()==null) || 
             (this.displayTypes!=null &&
              java.util.Arrays.equals(this.displayTypes, other.getDisplayTypes()))) &&
            ((this.activationOptions==null && other.getActivationOptions()==null) || 
             (this.activationOptions!=null &&
              java.util.Arrays.equals(this.activationOptions, other.getActivationOptions()))) &&
            ((this.adSizeSpecs==null && other.getAdSizeSpecs()==null) || 
             (this.adSizeSpecs!=null &&
              java.util.Arrays.equals(this.adSizeSpecs, other.getAdSizeSpecs())));
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
        if (getDisplayTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActivationOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivationOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivationOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdSizeSpecs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdSizeSpecs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdSizeSpecs(), i);
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
        new org.apache.axis.description.TypeDesc(DisplayAdSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DisplayAdSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "displayTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "activationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DisplayAdSpec.ActivationOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSizeSpecs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "adSizeSpecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DisplayAdSpec.AdSizeSpec"));
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
