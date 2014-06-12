/**
 * CustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * An additional, user-created field on an entity.
 */
public class CustomField  implements java.io.Serializable {
    /* Unique ID of the {@code CustomField}. This value is readonly
     * and is assigned by
     *                 Google. */
    private java.lang.Long id;

    /* Name of the {@code CustomField}. This is value is required
     * to create a custom field. The
     *                 max length is 127 characters. */
    private java.lang.String name;

    /* A description of the custom field. This value is optional.
     * The maximum length is 511
     *                 characters */
    private java.lang.String description;

    /* Specifies whether or not the custom fields is active. This
     * attribute is read-only. */
    private java.lang.Boolean isActive;

    /* The type of entity that this custom field is associated with.
     * This attribute is read-only
     *                 if there exists a {@link CustomFieldValue} for this
     * field. */
    private com.google.api.ads.dfp.axis.v201405.CustomFieldEntityType entityType;

    /* The type of data this custom field contains. This attribute
     * is read-only
     *                 if there exists a {@link CustomFieldValue} for this
     * field. */
    private com.google.api.ads.dfp.axis.v201405.CustomFieldDataType dataType;

    /* How visible/accessible this field is in the UI. */
    private com.google.api.ads.dfp.axis.v201405.CustomFieldVisibility visibility;

    /* Indicates that this instance is a subtype of CustomField.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String customFieldType;

    public CustomField() {
    }

    public CustomField(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           java.lang.Boolean isActive,
           com.google.api.ads.dfp.axis.v201405.CustomFieldEntityType entityType,
           com.google.api.ads.dfp.axis.v201405.CustomFieldDataType dataType,
           com.google.api.ads.dfp.axis.v201405.CustomFieldVisibility visibility,
           java.lang.String customFieldType) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.isActive = isActive;
           this.entityType = entityType;
           this.dataType = dataType;
           this.visibility = visibility;
           this.customFieldType = customFieldType;
    }


    /**
     * Gets the id value for this CustomField.
     * 
     * @return id   * Unique ID of the {@code CustomField}. This value is readonly
     * and is assigned by
     *                 Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomField.
     * 
     * @param id   * Unique ID of the {@code CustomField}. This value is readonly
     * and is assigned by
     *                 Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this CustomField.
     * 
     * @return name   * Name of the {@code CustomField}. This is value is required
     * to create a custom field. The
     *                 max length is 127 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomField.
     * 
     * @param name   * Name of the {@code CustomField}. This is value is required
     * to create a custom field. The
     *                 max length is 127 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this CustomField.
     * 
     * @return description   * A description of the custom field. This value is optional.
     * The maximum length is 511
     *                 characters
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomField.
     * 
     * @param description   * A description of the custom field. This value is optional.
     * The maximum length is 511
     *                 characters
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isActive value for this CustomField.
     * 
     * @return isActive   * Specifies whether or not the custom fields is active. This
     * attribute is read-only.
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this CustomField.
     * 
     * @param isActive   * Specifies whether or not the custom fields is active. This
     * attribute is read-only.
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the entityType value for this CustomField.
     * 
     * @return entityType   * The type of entity that this custom field is associated with.
     * This attribute is read-only
     *                 if there exists a {@link CustomFieldValue} for this
     * field.
     */
    public com.google.api.ads.dfp.axis.v201405.CustomFieldEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this CustomField.
     * 
     * @param entityType   * The type of entity that this custom field is associated with.
     * This attribute is read-only
     *                 if there exists a {@link CustomFieldValue} for this
     * field.
     */
    public void setEntityType(com.google.api.ads.dfp.axis.v201405.CustomFieldEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the dataType value for this CustomField.
     * 
     * @return dataType   * The type of data this custom field contains. This attribute
     * is read-only
     *                 if there exists a {@link CustomFieldValue} for this
     * field.
     */
    public com.google.api.ads.dfp.axis.v201405.CustomFieldDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this CustomField.
     * 
     * @param dataType   * The type of data this custom field contains. This attribute
     * is read-only
     *                 if there exists a {@link CustomFieldValue} for this
     * field.
     */
    public void setDataType(com.google.api.ads.dfp.axis.v201405.CustomFieldDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the visibility value for this CustomField.
     * 
     * @return visibility   * How visible/accessible this field is in the UI.
     */
    public com.google.api.ads.dfp.axis.v201405.CustomFieldVisibility getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this CustomField.
     * 
     * @param visibility   * How visible/accessible this field is in the UI.
     */
    public void setVisibility(com.google.api.ads.dfp.axis.v201405.CustomFieldVisibility visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the customFieldType value for this CustomField.
     * 
     * @return customFieldType   * Indicates that this instance is a subtype of CustomField.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getCustomFieldType() {
        return customFieldType;
    }


    /**
     * Sets the customFieldType value for this CustomField.
     * 
     * @param customFieldType   * Indicates that this instance is a subtype of CustomField.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setCustomFieldType(java.lang.String customFieldType) {
        this.customFieldType = customFieldType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomField)) return false;
        CustomField other = (CustomField) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility()))) &&
            ((this.customFieldType==null && other.getCustomFieldType()==null) || 
             (this.customFieldType!=null &&
              this.customFieldType.equals(other.getCustomFieldType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        if (getCustomFieldType() != null) {
            _hashCode += getCustomFieldType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CustomField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CustomFieldEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CustomFieldDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "visibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CustomFieldVisibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CustomField.Type"));
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
