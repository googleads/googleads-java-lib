/**
 * Creative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;


/**
 * A {@code Creative} represents the media for the ad being served.
 */
public abstract class Creative  implements java.io.Serializable {
    /* The ID of the advertiser that owns the creative. This attribute
     * is
     *                 required. */
    private java.lang.Long advertiserId;

    /* Uniquely identifies the {@code Creative}. This value is read-only
     * and is
     *                 assigned by Google when the creative is created. This
     * attribute is required
     *                 for updates. */
    private java.lang.Long id;

    /* The name of the creative. This attribute is required and has
     * a maximum
     *                 length of 255 characters. */
    private java.lang.String name;

    /* The {@link Size} of the creative. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201502.Size size;

    /* The URL of the creative for previewing the media. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * is created. */
    private java.lang.String previewUrl;

    /* The set of labels applied to this creative. */
    private com.google.api.ads.dfp.axis.v201502.AppliedLabel[] appliedLabels;

    /* The date and time this creative was last modified. */
    private com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime;

    /* The values of the custom fields associated with this creative. */
    private com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue[] customFieldValues;

    public Creative() {
    }

    public Creative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201502.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201502.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue[] customFieldValues) {
           this.advertiserId = advertiserId;
           this.id = id;
           this.name = name;
           this.size = size;
           this.previewUrl = previewUrl;
           this.appliedLabels = appliedLabels;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.customFieldValues = customFieldValues;
    }


    /**
     * Gets the advertiserId value for this Creative.
     * 
     * @return advertiserId   * The ID of the advertiser that owns the creative. This attribute
     * is
     *                 required.
     */
    public java.lang.Long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this Creative.
     * 
     * @param advertiserId   * The ID of the advertiser that owns the creative. This attribute
     * is
     *                 required.
     */
    public void setAdvertiserId(java.lang.Long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the id value for this Creative.
     * 
     * @return id   * Uniquely identifies the {@code Creative}. This value is read-only
     * and is
     *                 assigned by Google when the creative is created. This
     * attribute is required
     *                 for updates.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Creative.
     * 
     * @param id   * Uniquely identifies the {@code Creative}. This value is read-only
     * and is
     *                 assigned by Google when the creative is created. This
     * attribute is required
     *                 for updates.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Creative.
     * 
     * @return name   * The name of the creative. This attribute is required and has
     * a maximum
     *                 length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Creative.
     * 
     * @param name   * The name of the creative. This attribute is required and has
     * a maximum
     *                 length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this Creative.
     * 
     * @return size   * The {@link Size} of the creative. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201502.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this Creative.
     * 
     * @param size   * The {@link Size} of the creative. This attribute is required.
     */
    public void setSize(com.google.api.ads.dfp.axis.v201502.Size size) {
        this.size = size;
    }


    /**
     * Gets the previewUrl value for this Creative.
     * 
     * @return previewUrl   * The URL of the creative for previewing the media. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * is created.
     */
    public java.lang.String getPreviewUrl() {
        return previewUrl;
    }


    /**
     * Sets the previewUrl value for this Creative.
     * 
     * @param previewUrl   * The URL of the creative for previewing the media. This attribute
     * is
     *                 read-only and is assigned by Google when a creative
     * is created.
     */
    public void setPreviewUrl(java.lang.String previewUrl) {
        this.previewUrl = previewUrl;
    }


    /**
     * Gets the appliedLabels value for this Creative.
     * 
     * @return appliedLabels   * The set of labels applied to this creative.
     */
    public com.google.api.ads.dfp.axis.v201502.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this Creative.
     * 
     * @param appliedLabels   * The set of labels applied to this creative.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201502.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201502.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201502.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this Creative.
     * 
     * @return lastModifiedDateTime   * The date and time this creative was last modified.
     */
    public com.google.api.ads.dfp.axis.v201502.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Creative.
     * 
     * @param lastModifiedDateTime   * The date and time this creative was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the customFieldValues value for this Creative.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this creative.
     */
    public com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this Creative.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this creative.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Creative)) return false;
        Creative other = (Creative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advertiserId==null && other.getAdvertiserId()==null) || 
             (this.advertiserId!=null &&
              this.advertiserId.equals(other.getAdvertiserId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.previewUrl==null && other.getPreviewUrl()==null) || 
             (this.previewUrl!=null &&
              this.previewUrl.equals(other.getPreviewUrl()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues())));
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
        if (getAdvertiserId() != null) {
            _hashCode += getAdvertiserId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getPreviewUrl() != null) {
            _hashCode += getPreviewUrl().hashCode();
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
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
        new org.apache.axis.description.TypeDesc(Creative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "Creative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "previewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "BaseCustomFieldValue"));
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
