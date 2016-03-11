/**
 * KeywordSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.express;


/**
 * A keyword set based {@link Criterion}.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class KeywordSet  extends com.google.api.ads.adwords.axis.v201509.cm.Criterion  implements java.io.Serializable {
    private java.lang.String keywordSetId;

    private java.lang.String name;

    private java.lang.Boolean deprecated;

    public KeywordSet() {
    }

    public KeywordSet(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201509.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String keywordSetId,
           java.lang.String name,
           java.lang.Boolean deprecated) {
        super(
            id,
            type,
            criterionType);
        this.keywordSetId = keywordSetId;
        this.name = name;
        this.deprecated = deprecated;
    }


    /**
     * Gets the keywordSetId value for this KeywordSet.
     * 
     * @return keywordSetId
     */
    public java.lang.String getKeywordSetId() {
        return keywordSetId;
    }


    /**
     * Sets the keywordSetId value for this KeywordSet.
     * 
     * @param keywordSetId
     */
    public void setKeywordSetId(java.lang.String keywordSetId) {
        this.keywordSetId = keywordSetId;
    }


    /**
     * Gets the name value for this KeywordSet.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this KeywordSet.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the deprecated value for this KeywordSet.
     * 
     * @return deprecated
     */
    public java.lang.Boolean getDeprecated() {
        return deprecated;
    }


    /**
     * Sets the deprecated value for this KeywordSet.
     * 
     * @param deprecated
     */
    public void setDeprecated(java.lang.Boolean deprecated) {
        this.deprecated = deprecated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordSet)) return false;
        KeywordSet other = (KeywordSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keywordSetId==null && other.getKeywordSetId()==null) || 
             (this.keywordSetId!=null &&
              this.keywordSetId.equals(other.getKeywordSetId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.deprecated==null && other.getDeprecated()==null) || 
             (this.deprecated!=null &&
              this.deprecated.equals(other.getDeprecated())));
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
        if (getKeywordSetId() != null) {
            _hashCode += getKeywordSetId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDeprecated() != null) {
            _hashCode += getDeprecated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "KeywordSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "keywordSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deprecated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "deprecated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
