/**
 * CustomTargetingValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


/**
 * {@code CustomTargetingValue} represents a value used for custom
 * targeting.
 */
public class CustomTargetingValue  implements java.io.Serializable {
    /* The ID of the {@code CustomTargetingKey} for which this is
     * the value. */
    private java.lang.Long customTargetingKeyId;

    /* The ID of the {@code CustomTargetingValue}. This value is readonly
     * and is
     *                 populated by Google. */
    private java.lang.Long id;

    /* Name of the value. This can be used for encoding . If you don't
     * want users
     *                 to be able to see potentially sensitive targeting
     * information in the ad
     *                 tags of your site, you can encode your key/values.
     * For example, you can
     *                 create key/value g1=abc to represent gender=female.
     * Values can contain up
     *                 to 40 characters each. You can use alphanumeric characters
     * and symbols
     *                 other than the following: ", ', =, !, +, #, *, ~,
     * ;, ^, (, ), <, >, [, ].
     *                 Values are not data-specific; all values are treated
     * as string. For
     *                 example, instead of using "age>=18 AND <=34", try
     * "18-34" */
    private java.lang.String name;

    /* Descriptive name for the value. */
    private java.lang.String displayName;

    /* The way in which the {@link CustomTargetingValue#name} strings
     * will be
     *                 matched. */
    private com.google.api.ads.dfp.axis.v201306.CustomTargetingValueMatchType matchType;

    public CustomTargetingValue() {
    }

    public CustomTargetingValue(
           java.lang.Long customTargetingKeyId,
           java.lang.Long id,
           java.lang.String name,
           java.lang.String displayName,
           com.google.api.ads.dfp.axis.v201306.CustomTargetingValueMatchType matchType) {
           this.customTargetingKeyId = customTargetingKeyId;
           this.id = id;
           this.name = name;
           this.displayName = displayName;
           this.matchType = matchType;
    }


    /**
     * Gets the customTargetingKeyId value for this CustomTargetingValue.
     * 
     * @return customTargetingKeyId   * The ID of the {@code CustomTargetingKey} for which this is
     * the value.
     */
    public java.lang.Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }


    /**
     * Sets the customTargetingKeyId value for this CustomTargetingValue.
     * 
     * @param customTargetingKeyId   * The ID of the {@code CustomTargetingKey} for which this is
     * the value.
     */
    public void setCustomTargetingKeyId(java.lang.Long customTargetingKeyId) {
        this.customTargetingKeyId = customTargetingKeyId;
    }


    /**
     * Gets the id value for this CustomTargetingValue.
     * 
     * @return id   * The ID of the {@code CustomTargetingValue}. This value is readonly
     * and is
     *                 populated by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomTargetingValue.
     * 
     * @param id   * The ID of the {@code CustomTargetingValue}. This value is readonly
     * and is
     *                 populated by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CustomTargetingValue.
     * 
     * @return name   * Name of the value. This can be used for encoding . If you don't
     * want users
     *                 to be able to see potentially sensitive targeting
     * information in the ad
     *                 tags of your site, you can encode your key/values.
     * For example, you can
     *                 create key/value g1=abc to represent gender=female.
     * Values can contain up
     *                 to 40 characters each. You can use alphanumeric characters
     * and symbols
     *                 other than the following: ", ', =, !, +, #, *, ~,
     * ;, ^, (, ), <, >, [, ].
     *                 Values are not data-specific; all values are treated
     * as string. For
     *                 example, instead of using "age>=18 AND <=34", try
     * "18-34"
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomTargetingValue.
     * 
     * @param name   * Name of the value. This can be used for encoding . If you don't
     * want users
     *                 to be able to see potentially sensitive targeting
     * information in the ad
     *                 tags of your site, you can encode your key/values.
     * For example, you can
     *                 create key/value g1=abc to represent gender=female.
     * Values can contain up
     *                 to 40 characters each. You can use alphanumeric characters
     * and symbols
     *                 other than the following: ", ', =, !, +, #, *, ~,
     * ;, ^, (, ), <, >, [, ].
     *                 Values are not data-specific; all values are treated
     * as string. For
     *                 example, instead of using "age>=18 AND <=34", try
     * "18-34"
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this CustomTargetingValue.
     * 
     * @return displayName   * Descriptive name for the value.
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CustomTargetingValue.
     * 
     * @param displayName   * Descriptive name for the value.
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the matchType value for this CustomTargetingValue.
     * 
     * @return matchType   * The way in which the {@link CustomTargetingValue#name} strings
     * will be
     *                 matched.
     */
    public com.google.api.ads.dfp.axis.v201306.CustomTargetingValueMatchType getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this CustomTargetingValue.
     * 
     * @param matchType   * The way in which the {@link CustomTargetingValue#name} strings
     * will be
     *                 matched.
     */
    public void setMatchType(com.google.api.ads.dfp.axis.v201306.CustomTargetingValueMatchType matchType) {
        this.matchType = matchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTargetingValue)) return false;
        CustomTargetingValue other = (CustomTargetingValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTargetingKeyId==null && other.getCustomTargetingKeyId()==null) || 
             (this.customTargetingKeyId!=null &&
              this.customTargetingKeyId.equals(other.getCustomTargetingKeyId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType())));
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
        if (getCustomTargetingKeyId() != null) {
            _hashCode += getCustomTargetingKeyId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTargetingValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomTargetingValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "customTargetingKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "matchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomTargetingValue.MatchType"));
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
