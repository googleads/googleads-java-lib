/**
 * SpotlightActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class SpotlightActivity  extends com.google.api.ads.dfa.axis.v1_20.SpotlightActivityBase  implements java.io.Serializable {
    private long activityGroupId;

    private long activityTypeId;

    private long[] assignedCustomSpotlightVariableIds;

    private long countryId;

    private com.google.api.ads.dfa.axis.v1_20.FloodlightTag[] defaultFloodlightTags;

    private java.lang.String expectedUrl;

    private boolean imageTagsEnabled;

    private int minimumExpectedEvents;

    private com.google.api.ads.dfa.axis.v1_20.FloodlightPublisherTag[] publisherTags;

    private boolean secure;

    private long tagCodeTypeId;

    private long tagFormatId;

    private long tagMethodTypeId;

    private com.google.api.ads.dfa.axis.v1_20.SpotlightActivityTagProperty tagProperty;

    private java.lang.String tagString;

    public SpotlightActivity() {
    }

    public SpotlightActivity(
           long id,
           java.lang.String name,
           long activityGroupId,
           long activityTypeId,
           long[] assignedCustomSpotlightVariableIds,
           long countryId,
           com.google.api.ads.dfa.axis.v1_20.FloodlightTag[] defaultFloodlightTags,
           java.lang.String expectedUrl,
           boolean imageTagsEnabled,
           int minimumExpectedEvents,
           com.google.api.ads.dfa.axis.v1_20.FloodlightPublisherTag[] publisherTags,
           boolean secure,
           long tagCodeTypeId,
           long tagFormatId,
           long tagMethodTypeId,
           com.google.api.ads.dfa.axis.v1_20.SpotlightActivityTagProperty tagProperty,
           java.lang.String tagString) {
        super(
            id,
            name);
        this.activityGroupId = activityGroupId;
        this.activityTypeId = activityTypeId;
        this.assignedCustomSpotlightVariableIds = assignedCustomSpotlightVariableIds;
        this.countryId = countryId;
        this.defaultFloodlightTags = defaultFloodlightTags;
        this.expectedUrl = expectedUrl;
        this.imageTagsEnabled = imageTagsEnabled;
        this.minimumExpectedEvents = minimumExpectedEvents;
        this.publisherTags = publisherTags;
        this.secure = secure;
        this.tagCodeTypeId = tagCodeTypeId;
        this.tagFormatId = tagFormatId;
        this.tagMethodTypeId = tagMethodTypeId;
        this.tagProperty = tagProperty;
        this.tagString = tagString;
    }


    /**
     * Gets the activityGroupId value for this SpotlightActivity.
     * 
     * @return activityGroupId
     */
    public long getActivityGroupId() {
        return activityGroupId;
    }


    /**
     * Sets the activityGroupId value for this SpotlightActivity.
     * 
     * @param activityGroupId
     */
    public void setActivityGroupId(long activityGroupId) {
        this.activityGroupId = activityGroupId;
    }


    /**
     * Gets the activityTypeId value for this SpotlightActivity.
     * 
     * @return activityTypeId
     */
    public long getActivityTypeId() {
        return activityTypeId;
    }


    /**
     * Sets the activityTypeId value for this SpotlightActivity.
     * 
     * @param activityTypeId
     */
    public void setActivityTypeId(long activityTypeId) {
        this.activityTypeId = activityTypeId;
    }


    /**
     * Gets the assignedCustomSpotlightVariableIds value for this SpotlightActivity.
     * 
     * @return assignedCustomSpotlightVariableIds
     */
    public long[] getAssignedCustomSpotlightVariableIds() {
        return assignedCustomSpotlightVariableIds;
    }


    /**
     * Sets the assignedCustomSpotlightVariableIds value for this SpotlightActivity.
     * 
     * @param assignedCustomSpotlightVariableIds
     */
    public void setAssignedCustomSpotlightVariableIds(long[] assignedCustomSpotlightVariableIds) {
        this.assignedCustomSpotlightVariableIds = assignedCustomSpotlightVariableIds;
    }


    /**
     * Gets the countryId value for this SpotlightActivity.
     * 
     * @return countryId
     */
    public long getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this SpotlightActivity.
     * 
     * @param countryId
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the defaultFloodlightTags value for this SpotlightActivity.
     * 
     * @return defaultFloodlightTags
     */
    public com.google.api.ads.dfa.axis.v1_20.FloodlightTag[] getDefaultFloodlightTags() {
        return defaultFloodlightTags;
    }


    /**
     * Sets the defaultFloodlightTags value for this SpotlightActivity.
     * 
     * @param defaultFloodlightTags
     */
    public void setDefaultFloodlightTags(com.google.api.ads.dfa.axis.v1_20.FloodlightTag[] defaultFloodlightTags) {
        this.defaultFloodlightTags = defaultFloodlightTags;
    }


    /**
     * Gets the expectedUrl value for this SpotlightActivity.
     * 
     * @return expectedUrl
     */
    public java.lang.String getExpectedUrl() {
        return expectedUrl;
    }


    /**
     * Sets the expectedUrl value for this SpotlightActivity.
     * 
     * @param expectedUrl
     */
    public void setExpectedUrl(java.lang.String expectedUrl) {
        this.expectedUrl = expectedUrl;
    }


    /**
     * Gets the imageTagsEnabled value for this SpotlightActivity.
     * 
     * @return imageTagsEnabled
     */
    public boolean isImageTagsEnabled() {
        return imageTagsEnabled;
    }


    /**
     * Sets the imageTagsEnabled value for this SpotlightActivity.
     * 
     * @param imageTagsEnabled
     */
    public void setImageTagsEnabled(boolean imageTagsEnabled) {
        this.imageTagsEnabled = imageTagsEnabled;
    }


    /**
     * Gets the minimumExpectedEvents value for this SpotlightActivity.
     * 
     * @return minimumExpectedEvents
     */
    public int getMinimumExpectedEvents() {
        return minimumExpectedEvents;
    }


    /**
     * Sets the minimumExpectedEvents value for this SpotlightActivity.
     * 
     * @param minimumExpectedEvents
     */
    public void setMinimumExpectedEvents(int minimumExpectedEvents) {
        this.minimumExpectedEvents = minimumExpectedEvents;
    }


    /**
     * Gets the publisherTags value for this SpotlightActivity.
     * 
     * @return publisherTags
     */
    public com.google.api.ads.dfa.axis.v1_20.FloodlightPublisherTag[] getPublisherTags() {
        return publisherTags;
    }


    /**
     * Sets the publisherTags value for this SpotlightActivity.
     * 
     * @param publisherTags
     */
    public void setPublisherTags(com.google.api.ads.dfa.axis.v1_20.FloodlightPublisherTag[] publisherTags) {
        this.publisherTags = publisherTags;
    }


    /**
     * Gets the secure value for this SpotlightActivity.
     * 
     * @return secure
     */
    public boolean isSecure() {
        return secure;
    }


    /**
     * Sets the secure value for this SpotlightActivity.
     * 
     * @param secure
     */
    public void setSecure(boolean secure) {
        this.secure = secure;
    }


    /**
     * Gets the tagCodeTypeId value for this SpotlightActivity.
     * 
     * @return tagCodeTypeId
     */
    public long getTagCodeTypeId() {
        return tagCodeTypeId;
    }


    /**
     * Sets the tagCodeTypeId value for this SpotlightActivity.
     * 
     * @param tagCodeTypeId
     */
    public void setTagCodeTypeId(long tagCodeTypeId) {
        this.tagCodeTypeId = tagCodeTypeId;
    }


    /**
     * Gets the tagFormatId value for this SpotlightActivity.
     * 
     * @return tagFormatId
     */
    public long getTagFormatId() {
        return tagFormatId;
    }


    /**
     * Sets the tagFormatId value for this SpotlightActivity.
     * 
     * @param tagFormatId
     */
    public void setTagFormatId(long tagFormatId) {
        this.tagFormatId = tagFormatId;
    }


    /**
     * Gets the tagMethodTypeId value for this SpotlightActivity.
     * 
     * @return tagMethodTypeId
     */
    public long getTagMethodTypeId() {
        return tagMethodTypeId;
    }


    /**
     * Sets the tagMethodTypeId value for this SpotlightActivity.
     * 
     * @param tagMethodTypeId
     */
    public void setTagMethodTypeId(long tagMethodTypeId) {
        this.tagMethodTypeId = tagMethodTypeId;
    }


    /**
     * Gets the tagProperty value for this SpotlightActivity.
     * 
     * @return tagProperty
     */
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityTagProperty getTagProperty() {
        return tagProperty;
    }


    /**
     * Sets the tagProperty value for this SpotlightActivity.
     * 
     * @param tagProperty
     */
    public void setTagProperty(com.google.api.ads.dfa.axis.v1_20.SpotlightActivityTagProperty tagProperty) {
        this.tagProperty = tagProperty;
    }


    /**
     * Gets the tagString value for this SpotlightActivity.
     * 
     * @return tagString
     */
    public java.lang.String getTagString() {
        return tagString;
    }


    /**
     * Sets the tagString value for this SpotlightActivity.
     * 
     * @param tagString
     */
    public void setTagString(java.lang.String tagString) {
        this.tagString = tagString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpotlightActivity)) return false;
        SpotlightActivity other = (SpotlightActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.activityGroupId == other.getActivityGroupId() &&
            this.activityTypeId == other.getActivityTypeId() &&
            ((this.assignedCustomSpotlightVariableIds==null && other.getAssignedCustomSpotlightVariableIds()==null) || 
             (this.assignedCustomSpotlightVariableIds!=null &&
              java.util.Arrays.equals(this.assignedCustomSpotlightVariableIds, other.getAssignedCustomSpotlightVariableIds()))) &&
            this.countryId == other.getCountryId() &&
            ((this.defaultFloodlightTags==null && other.getDefaultFloodlightTags()==null) || 
             (this.defaultFloodlightTags!=null &&
              java.util.Arrays.equals(this.defaultFloodlightTags, other.getDefaultFloodlightTags()))) &&
            ((this.expectedUrl==null && other.getExpectedUrl()==null) || 
             (this.expectedUrl!=null &&
              this.expectedUrl.equals(other.getExpectedUrl()))) &&
            this.imageTagsEnabled == other.isImageTagsEnabled() &&
            this.minimumExpectedEvents == other.getMinimumExpectedEvents() &&
            ((this.publisherTags==null && other.getPublisherTags()==null) || 
             (this.publisherTags!=null &&
              java.util.Arrays.equals(this.publisherTags, other.getPublisherTags()))) &&
            this.secure == other.isSecure() &&
            this.tagCodeTypeId == other.getTagCodeTypeId() &&
            this.tagFormatId == other.getTagFormatId() &&
            this.tagMethodTypeId == other.getTagMethodTypeId() &&
            ((this.tagProperty==null && other.getTagProperty()==null) || 
             (this.tagProperty!=null &&
              this.tagProperty.equals(other.getTagProperty()))) &&
            ((this.tagString==null && other.getTagString()==null) || 
             (this.tagString!=null &&
              this.tagString.equals(other.getTagString())));
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
        _hashCode += new Long(getActivityGroupId()).hashCode();
        _hashCode += new Long(getActivityTypeId()).hashCode();
        if (getAssignedCustomSpotlightVariableIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedCustomSpotlightVariableIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedCustomSpotlightVariableIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCountryId()).hashCode();
        if (getDefaultFloodlightTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultFloodlightTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultFloodlightTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedUrl() != null) {
            _hashCode += getExpectedUrl().hashCode();
        }
        _hashCode += (isImageTagsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMinimumExpectedEvents();
        if (getPublisherTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublisherTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublisherTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSecure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getTagCodeTypeId()).hashCode();
        _hashCode += new Long(getTagFormatId()).hashCode();
        _hashCode += new Long(getTagMethodTypeId()).hashCode();
        if (getTagProperty() != null) {
            _hashCode += getTagProperty().hashCode();
        }
        if (getTagString() != null) {
            _hashCode += getTagString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpotlightActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SpotlightActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedCustomSpotlightVariableIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedCustomSpotlightVariableIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultFloodlightTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultFloodlightTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FloodlightTag"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expectedUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageTagsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageTagsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumExpectedEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumExpectedEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publisherTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FloodlightPublisherTag"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagCodeTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagCodeTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagMethodTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagMethodTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SpotlightActivityTagProperty"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
