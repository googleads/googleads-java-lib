/**
 * ContentTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;


/**
 * Used to target {@link LineItem}s to specific videos on a publisher's
 * site.
 */
public class ContentTargeting  implements java.io.Serializable {
    /* The IDs of content being targeted by the {@code LineItem}. */
    private long[] targetedContentIds;

    /* The IDs of content being excluded by the {@code LineItem}. */
    private long[] excludedContentIds;

    /* A list of video content bundles, represented by {@link ContentBundle}
     * IDs, that are being targeted by the {@code LineItem}. */
    private long[] targetedVideoContentBundleIds;

    /* A list of video content bundles, represented by {@link ContentBundle}
     * IDs, that are being excluded by the {@code LineItem}. */
    private long[] excludedVideoContentBundleIds;

    /* A list of content metadata within hierarchies that are being
     * targeted by the {@code LineItem}. */
    private com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] targetedContentMetadata;

    /* A list of content metadata within hierarchies that are being
     * excluded by the {@code LineItem}. */
    private com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] excludedContentMetadata;

    public ContentTargeting() {
    }

    public ContentTargeting(
           long[] targetedContentIds,
           long[] excludedContentIds,
           long[] targetedVideoContentBundleIds,
           long[] excludedVideoContentBundleIds,
           com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] targetedContentMetadata,
           com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] excludedContentMetadata) {
           this.targetedContentIds = targetedContentIds;
           this.excludedContentIds = excludedContentIds;
           this.targetedVideoContentBundleIds = targetedVideoContentBundleIds;
           this.excludedVideoContentBundleIds = excludedVideoContentBundleIds;
           this.targetedContentMetadata = targetedContentMetadata;
           this.excludedContentMetadata = excludedContentMetadata;
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
     * Gets the targetedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @return targetedVideoContentBundleIds   * A list of video content bundles, represented by {@link ContentBundle}
     * IDs, that are being targeted by the {@code LineItem}.
     */
    public long[] getTargetedVideoContentBundleIds() {
        return targetedVideoContentBundleIds;
    }


    /**
     * Sets the targetedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @param targetedVideoContentBundleIds   * A list of video content bundles, represented by {@link ContentBundle}
     * IDs, that are being targeted by the {@code LineItem}.
     */
    public void setTargetedVideoContentBundleIds(long[] targetedVideoContentBundleIds) {
        this.targetedVideoContentBundleIds = targetedVideoContentBundleIds;
    }

    public long getTargetedVideoContentBundleIds(int i) {
        return this.targetedVideoContentBundleIds[i];
    }

    public void setTargetedVideoContentBundleIds(int i, long _value) {
        this.targetedVideoContentBundleIds[i] = _value;
    }


    /**
     * Gets the excludedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @return excludedVideoContentBundleIds   * A list of video content bundles, represented by {@link ContentBundle}
     * IDs, that are being excluded by the {@code LineItem}.
     */
    public long[] getExcludedVideoContentBundleIds() {
        return excludedVideoContentBundleIds;
    }


    /**
     * Sets the excludedVideoContentBundleIds value for this ContentTargeting.
     * 
     * @param excludedVideoContentBundleIds   * A list of video content bundles, represented by {@link ContentBundle}
     * IDs, that are being excluded by the {@code LineItem}.
     */
    public void setExcludedVideoContentBundleIds(long[] excludedVideoContentBundleIds) {
        this.excludedVideoContentBundleIds = excludedVideoContentBundleIds;
    }

    public long getExcludedVideoContentBundleIds(int i) {
        return this.excludedVideoContentBundleIds[i];
    }

    public void setExcludedVideoContentBundleIds(int i, long _value) {
        this.excludedVideoContentBundleIds[i] = _value;
    }


    /**
     * Gets the targetedContentMetadata value for this ContentTargeting.
     * 
     * @return targetedContentMetadata   * A list of content metadata within hierarchies that are being
     * targeted by the {@code LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] getTargetedContentMetadata() {
        return targetedContentMetadata;
    }


    /**
     * Sets the targetedContentMetadata value for this ContentTargeting.
     * 
     * @param targetedContentMetadata   * A list of content metadata within hierarchies that are being
     * targeted by the {@code LineItem}.
     */
    public void setTargetedContentMetadata(com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] targetedContentMetadata) {
        this.targetedContentMetadata = targetedContentMetadata;
    }

    public com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting getTargetedContentMetadata(int i) {
        return this.targetedContentMetadata[i];
    }

    public void setTargetedContentMetadata(int i, com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting _value) {
        this.targetedContentMetadata[i] = _value;
    }


    /**
     * Gets the excludedContentMetadata value for this ContentTargeting.
     * 
     * @return excludedContentMetadata   * A list of content metadata within hierarchies that are being
     * excluded by the {@code LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] getExcludedContentMetadata() {
        return excludedContentMetadata;
    }


    /**
     * Sets the excludedContentMetadata value for this ContentTargeting.
     * 
     * @param excludedContentMetadata   * A list of content metadata within hierarchies that are being
     * excluded by the {@code LineItem}.
     */
    public void setExcludedContentMetadata(com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting[] excludedContentMetadata) {
        this.excludedContentMetadata = excludedContentMetadata;
    }

    public com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting getExcludedContentMetadata(int i) {
        return this.excludedContentMetadata[i];
    }

    public void setExcludedContentMetadata(int i, com.google.api.ads.dfp.axis.v201605.ContentMetadataKeyHierarchyTargeting _value) {
        this.excludedContentMetadata[i] = _value;
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
            ((this.targetedVideoContentBundleIds==null && other.getTargetedVideoContentBundleIds()==null) || 
             (this.targetedVideoContentBundleIds!=null &&
              java.util.Arrays.equals(this.targetedVideoContentBundleIds, other.getTargetedVideoContentBundleIds()))) &&
            ((this.excludedVideoContentBundleIds==null && other.getExcludedVideoContentBundleIds()==null) || 
             (this.excludedVideoContentBundleIds!=null &&
              java.util.Arrays.equals(this.excludedVideoContentBundleIds, other.getExcludedVideoContentBundleIds()))) &&
            ((this.targetedContentMetadata==null && other.getTargetedContentMetadata()==null) || 
             (this.targetedContentMetadata!=null &&
              java.util.Arrays.equals(this.targetedContentMetadata, other.getTargetedContentMetadata()))) &&
            ((this.excludedContentMetadata==null && other.getExcludedContentMetadata()==null) || 
             (this.excludedContentMetadata!=null &&
              java.util.Arrays.equals(this.excludedContentMetadata, other.getExcludedContentMetadata())));
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
        if (getTargetedVideoContentBundleIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedVideoContentBundleIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedVideoContentBundleIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedVideoContentBundleIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedVideoContentBundleIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedVideoContentBundleIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetedContentMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedContentMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedContentMetadata(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedContentMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedContentMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedContentMetadata(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "ContentTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "targetedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedContentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "excludedContentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedVideoContentBundleIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "targetedVideoContentBundleIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedVideoContentBundleIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "excludedVideoContentBundleIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedContentMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "targetedContentMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "ContentMetadataKeyHierarchyTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedContentMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "excludedContentMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "ContentMetadataKeyHierarchyTargeting"));
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
