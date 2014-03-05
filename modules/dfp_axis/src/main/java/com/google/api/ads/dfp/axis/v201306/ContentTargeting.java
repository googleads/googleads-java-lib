/**
 * ContentTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


/**
 * Used to target {@link LineItem}s to specific videos on a publisher's
 * site.
 */
public class ContentTargeting  implements java.io.Serializable {
    /* The IDs of content being targeted by the {@code LineItem}. */
    private long[] targetedContentIds;

    /* The IDs of content being excluded by the {@code LineItem}. */
    private long[] excludedContentIds;

    /* A list of video categories, represented by {@link CustomTargetingValue}
     * IDs, that are being targeted by the {@code LineItem}.
     *                 <p>
     *                 These IDs must be from video categories, which are
     * a set of
     *                 {@link CustomTargetingValue}s that belong to the content
     * browse key.
     *                 <p>
     *                 The content browse key can be obtained by getting
     * the
     *                 {@link Network#contentBrowseCustomTargetingKeyId}
     * and the acceptable
     *                 values can be obtained using the
     *                 {@link CustomTargetingService#getCustomTargetingValuesByStatement}. */
    private long[] targetedVideoCategoryIds;

    /* A list of video categories, represented by {@link CustomTargetingValue}
     * IDs, that are being excluded by the {@code LineItem}.
     *                 <p>
     *                 These IDs must be from video categories, which are
     * a set of
     *                 {@link CustomTargetingValue}s that belong to the content
     * browse key.
     *                 <p>
     *                 The content browse key can be obtained by getting
     * the
     *                 {@link Network#contentBrowseCustomTargetingKeyId}
     * and the acceptable
     *                 values can be obtained using the
     *                 {@link CustomTargetingService#getCustomTargetingValuesByStatement}. */
    private long[] excludedVideoCategoryIds;

    public ContentTargeting() {
    }

    public ContentTargeting(
           long[] targetedContentIds,
           long[] excludedContentIds,
           long[] targetedVideoCategoryIds,
           long[] excludedVideoCategoryIds) {
           this.targetedContentIds = targetedContentIds;
           this.excludedContentIds = excludedContentIds;
           this.targetedVideoCategoryIds = targetedVideoCategoryIds;
           this.excludedVideoCategoryIds = excludedVideoCategoryIds;
    }


    /**
     * Gets the targetedContentIds value for this ContentTargeting.
     * 
     * @return targetedContentIds   * The IDs of content being targeted by the {@code LineItem}.
     */
    public long[] getTargetedContentIds() {
        return targetedContentIds;
    }


    /**
     * Sets the targetedContentIds value for this ContentTargeting.
     * 
     * @param targetedContentIds   * The IDs of content being targeted by the {@code LineItem}.
     */
    public void setTargetedContentIds(long[] targetedContentIds) {
        this.targetedContentIds = targetedContentIds;
    }

    public long getTargetedContentIds(int i) {
        return this.targetedContentIds[i];
    }

    public void setTargetedContentIds(int i, long _value) {
        this.targetedContentIds[i] = _value;
    }


    /**
     * Gets the excludedContentIds value for this ContentTargeting.
     * 
     * @return excludedContentIds   * The IDs of content being excluded by the {@code LineItem}.
     */
    public long[] getExcludedContentIds() {
        return excludedContentIds;
    }


    /**
     * Sets the excludedContentIds value for this ContentTargeting.
     * 
     * @param excludedContentIds   * The IDs of content being excluded by the {@code LineItem}.
     */
    public void setExcludedContentIds(long[] excludedContentIds) {
        this.excludedContentIds = excludedContentIds;
    }

    public long getExcludedContentIds(int i) {
        return this.excludedContentIds[i];
    }

    public void setExcludedContentIds(int i, long _value) {
        this.excludedContentIds[i] = _value;
    }


    /**
     * Gets the targetedVideoCategoryIds value for this ContentTargeting.
     * 
     * @return targetedVideoCategoryIds   * A list of video categories, represented by {@link CustomTargetingValue}
     * IDs, that are being targeted by the {@code LineItem}.
     *                 <p>
     *                 These IDs must be from video categories, which are
     * a set of
     *                 {@link CustomTargetingValue}s that belong to the content
     * browse key.
     *                 <p>
     *                 The content browse key can be obtained by getting
     * the
     *                 {@link Network#contentBrowseCustomTargetingKeyId}
     * and the acceptable
     *                 values can be obtained using the
     *                 {@link CustomTargetingService#getCustomTargetingValuesByStatement}.
     */
    public long[] getTargetedVideoCategoryIds() {
        return targetedVideoCategoryIds;
    }


    /**
     * Sets the targetedVideoCategoryIds value for this ContentTargeting.
     * 
     * @param targetedVideoCategoryIds   * A list of video categories, represented by {@link CustomTargetingValue}
     * IDs, that are being targeted by the {@code LineItem}.
     *                 <p>
     *                 These IDs must be from video categories, which are
     * a set of
     *                 {@link CustomTargetingValue}s that belong to the content
     * browse key.
     *                 <p>
     *                 The content browse key can be obtained by getting
     * the
     *                 {@link Network#contentBrowseCustomTargetingKeyId}
     * and the acceptable
     *                 values can be obtained using the
     *                 {@link CustomTargetingService#getCustomTargetingValuesByStatement}.
     */
    public void setTargetedVideoCategoryIds(long[] targetedVideoCategoryIds) {
        this.targetedVideoCategoryIds = targetedVideoCategoryIds;
    }

    public long getTargetedVideoCategoryIds(int i) {
        return this.targetedVideoCategoryIds[i];
    }

    public void setTargetedVideoCategoryIds(int i, long _value) {
        this.targetedVideoCategoryIds[i] = _value;
    }


    /**
     * Gets the excludedVideoCategoryIds value for this ContentTargeting.
     * 
     * @return excludedVideoCategoryIds   * A list of video categories, represented by {@link CustomTargetingValue}
     * IDs, that are being excluded by the {@code LineItem}.
     *                 <p>
     *                 These IDs must be from video categories, which are
     * a set of
     *                 {@link CustomTargetingValue}s that belong to the content
     * browse key.
     *                 <p>
     *                 The content browse key can be obtained by getting
     * the
     *                 {@link Network#contentBrowseCustomTargetingKeyId}
     * and the acceptable
     *                 values can be obtained using the
     *                 {@link CustomTargetingService#getCustomTargetingValuesByStatement}.
     */
    public long[] getExcludedVideoCategoryIds() {
        return excludedVideoCategoryIds;
    }


    /**
     * Sets the excludedVideoCategoryIds value for this ContentTargeting.
     * 
     * @param excludedVideoCategoryIds   * A list of video categories, represented by {@link CustomTargetingValue}
     * IDs, that are being excluded by the {@code LineItem}.
     *                 <p>
     *                 These IDs must be from video categories, which are
     * a set of
     *                 {@link CustomTargetingValue}s that belong to the content
     * browse key.
     *                 <p>
     *                 The content browse key can be obtained by getting
     * the
     *                 {@link Network#contentBrowseCustomTargetingKeyId}
     * and the acceptable
     *                 values can be obtained using the
     *                 {@link CustomTargetingService#getCustomTargetingValuesByStatement}.
     */
    public void setExcludedVideoCategoryIds(long[] excludedVideoCategoryIds) {
        this.excludedVideoCategoryIds = excludedVideoCategoryIds;
    }

    public long getExcludedVideoCategoryIds(int i) {
        return this.excludedVideoCategoryIds[i];
    }

    public void setExcludedVideoCategoryIds(int i, long _value) {
        this.excludedVideoCategoryIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentTargeting)) return false;
        ContentTargeting other = (ContentTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedContentIds==null && other.getTargetedContentIds()==null) || 
             (this.targetedContentIds!=null &&
              java.util.Arrays.equals(this.targetedContentIds, other.getTargetedContentIds()))) &&
            ((this.excludedContentIds==null && other.getExcludedContentIds()==null) || 
             (this.excludedContentIds!=null &&
              java.util.Arrays.equals(this.excludedContentIds, other.getExcludedContentIds()))) &&
            ((this.targetedVideoCategoryIds==null && other.getTargetedVideoCategoryIds()==null) || 
             (this.targetedVideoCategoryIds!=null &&
              java.util.Arrays.equals(this.targetedVideoCategoryIds, other.getTargetedVideoCategoryIds()))) &&
            ((this.excludedVideoCategoryIds==null && other.getExcludedVideoCategoryIds()==null) || 
             (this.excludedVideoCategoryIds!=null &&
              java.util.Arrays.equals(this.excludedVideoCategoryIds, other.getExcludedVideoCategoryIds())));
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
        if (getTargetedContentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedContentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedContentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedContentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedContentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedContentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetedVideoCategoryIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedVideoCategoryIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedVideoCategoryIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedVideoCategoryIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedVideoCategoryIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedVideoCategoryIds(), i);
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
        new org.apache.axis.description.TypeDesc(ContentTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ContentTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "targetedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "excludedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedVideoCategoryIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "targetedVideoCategoryIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedVideoCategoryIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "excludedVideoCategoryIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
