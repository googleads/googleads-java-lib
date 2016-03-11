/**
 * Content.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;


/**
 * A {@code Content} represents video metadata from a publisher's
 *             Content Management System (CMS) that has been synced to
 * DFP.
 *             <p>
 *             Video line items can be targeted to {@code Content}
 *             to indicate what ads should match when the {@code Content}
 * is being played.
 */
public class Content  implements java.io.Serializable {
    /* Uniquely identifies the {@code Content}. This attribute is
     * read-only and
     *                 is assigned by Google when the content is created. */
    private java.lang.Long id;

    /* The name of the {@code Content}. This attribute is read-only. */
    private java.lang.String name;

    /* The status of this {@code Content}. This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.ContentStatus status;

    /* Whether the content status was defined by the user, or by the
     * source CMS
     *                 from which the content was ingested. This attribute
     * is read-only. */
    private com.google.api.ads.dfp.axis.v201508.ContentStatusDefinedBy statusDefinedBy;

    /* The date and time at which this content was published. This
     * attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.DateTime importDateTime;

    /* The date and time at which this content was last modified.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.DateTime lastModifiedDateTime;

    /* A collection of custom targeting value IDs manually assigned
     * to this content
     *                 by the user. This attribute is optional. */
    private long[] userDefinedCustomTargetingValueIds;

    /* A collection of custom targeting value IDs automatically targeted
     * to this
     *                 content via metadata mapping rules. This attribute
     * is read-only. */
    private long[] mappingRuleDefinedCustomTargetingValueIds;

    /* Information about the content from the CMS it was ingested
     * from.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.CmsContent[] cmsSources;

    public Content() {
    }

    public Content(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201508.ContentStatus status,
           com.google.api.ads.dfp.axis.v201508.ContentStatusDefinedBy statusDefinedBy,
           com.google.api.ads.dfp.axis.v201508.DateTime importDateTime,
           com.google.api.ads.dfp.axis.v201508.DateTime lastModifiedDateTime,
           long[] userDefinedCustomTargetingValueIds,
           long[] mappingRuleDefinedCustomTargetingValueIds,
           com.google.api.ads.dfp.axis.v201508.CmsContent[] cmsSources) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.statusDefinedBy = statusDefinedBy;
           this.importDateTime = importDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.userDefinedCustomTargetingValueIds = userDefinedCustomTargetingValueIds;
           this.mappingRuleDefinedCustomTargetingValueIds = mappingRuleDefinedCustomTargetingValueIds;
           this.cmsSources = cmsSources;
    }


    /**
     * Gets the id value for this Content.
     * 
     * @return id   * Uniquely identifies the {@code Content}. This attribute is
     * read-only and
     *                 is assigned by Google when the content is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Content.
     * 
     * @param id   * Uniquely identifies the {@code Content}. This attribute is
     * read-only and
     *                 is assigned by Google when the content is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Content.
     * 
     * @return name   * The name of the {@code Content}. This attribute is read-only.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Content.
     * 
     * @param name   * The name of the {@code Content}. This attribute is read-only.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Content.
     * 
     * @return status   * The status of this {@code Content}. This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.ContentStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Content.
     * 
     * @param status   * The status of this {@code Content}. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201508.ContentStatus status) {
        this.status = status;
    }


    /**
     * Gets the statusDefinedBy value for this Content.
     * 
     * @return statusDefinedBy   * Whether the content status was defined by the user, or by the
     * source CMS
     *                 from which the content was ingested. This attribute
     * is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.ContentStatusDefinedBy getStatusDefinedBy() {
        return statusDefinedBy;
    }


    /**
     * Sets the statusDefinedBy value for this Content.
     * 
     * @param statusDefinedBy   * Whether the content status was defined by the user, or by the
     * source CMS
     *                 from which the content was ingested. This attribute
     * is read-only.
     */
    public void setStatusDefinedBy(com.google.api.ads.dfp.axis.v201508.ContentStatusDefinedBy statusDefinedBy) {
        this.statusDefinedBy = statusDefinedBy;
    }


    /**
     * Gets the importDateTime value for this Content.
     * 
     * @return importDateTime   * The date and time at which this content was published. This
     * attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.DateTime getImportDateTime() {
        return importDateTime;
    }


    /**
     * Sets the importDateTime value for this Content.
     * 
     * @param importDateTime   * The date and time at which this content was published. This
     * attribute is read-only.
     */
    public void setImportDateTime(com.google.api.ads.dfp.axis.v201508.DateTime importDateTime) {
        this.importDateTime = importDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this Content.
     * 
     * @return lastModifiedDateTime   * The date and time at which this content was last modified.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Content.
     * 
     * @param lastModifiedDateTime   * The date and time at which this content was last modified.
     *                 This attribute is read-only.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201508.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the userDefinedCustomTargetingValueIds value for this Content.
     * 
     * @return userDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs manually assigned
     * to this content
     *                 by the user. This attribute is optional.
     */
    public long[] getUserDefinedCustomTargetingValueIds() {
        return userDefinedCustomTargetingValueIds;
    }


    /**
     * Sets the userDefinedCustomTargetingValueIds value for this Content.
     * 
     * @param userDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs manually assigned
     * to this content
     *                 by the user. This attribute is optional.
     */
    public void setUserDefinedCustomTargetingValueIds(long[] userDefinedCustomTargetingValueIds) {
        this.userDefinedCustomTargetingValueIds = userDefinedCustomTargetingValueIds;
    }

    public long getUserDefinedCustomTargetingValueIds(int i) {
        return this.userDefinedCustomTargetingValueIds[i];
    }

    public void setUserDefinedCustomTargetingValueIds(int i, long _value) {
        this.userDefinedCustomTargetingValueIds[i] = _value;
    }


    /**
     * Gets the mappingRuleDefinedCustomTargetingValueIds value for this Content.
     * 
     * @return mappingRuleDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs automatically targeted
     * to this
     *                 content via metadata mapping rules. This attribute
     * is read-only.
     */
    public long[] getMappingRuleDefinedCustomTargetingValueIds() {
        return mappingRuleDefinedCustomTargetingValueIds;
    }


    /**
     * Sets the mappingRuleDefinedCustomTargetingValueIds value for this Content.
     * 
     * @param mappingRuleDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs automatically targeted
     * to this
     *                 content via metadata mapping rules. This attribute
     * is read-only.
     */
    public void setMappingRuleDefinedCustomTargetingValueIds(long[] mappingRuleDefinedCustomTargetingValueIds) {
        this.mappingRuleDefinedCustomTargetingValueIds = mappingRuleDefinedCustomTargetingValueIds;
    }

    public long getMappingRuleDefinedCustomTargetingValueIds(int i) {
        return this.mappingRuleDefinedCustomTargetingValueIds[i];
    }

    public void setMappingRuleDefinedCustomTargetingValueIds(int i, long _value) {
        this.mappingRuleDefinedCustomTargetingValueIds[i] = _value;
    }


    /**
     * Gets the cmsSources value for this Content.
     * 
     * @return cmsSources   * Information about the content from the CMS it was ingested
     * from.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.CmsContent[] getCmsSources() {
        return cmsSources;
    }


    /**
     * Sets the cmsSources value for this Content.
     * 
     * @param cmsSources   * Information about the content from the CMS it was ingested
     * from.
     *                 This attribute is read-only.
     */
    public void setCmsSources(com.google.api.ads.dfp.axis.v201508.CmsContent[] cmsSources) {
        this.cmsSources = cmsSources;
    }

    public com.google.api.ads.dfp.axis.v201508.CmsContent getCmsSources(int i) {
        return this.cmsSources[i];
    }

    public void setCmsSources(int i, com.google.api.ads.dfp.axis.v201508.CmsContent _value) {
        this.cmsSources[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Content)) return false;
        Content other = (Content) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDefinedBy==null && other.getStatusDefinedBy()==null) || 
             (this.statusDefinedBy!=null &&
              this.statusDefinedBy.equals(other.getStatusDefinedBy()))) &&
            ((this.importDateTime==null && other.getImportDateTime()==null) || 
             (this.importDateTime!=null &&
              this.importDateTime.equals(other.getImportDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.userDefinedCustomTargetingValueIds==null && other.getUserDefinedCustomTargetingValueIds()==null) || 
             (this.userDefinedCustomTargetingValueIds!=null &&
              java.util.Arrays.equals(this.userDefinedCustomTargetingValueIds, other.getUserDefinedCustomTargetingValueIds()))) &&
            ((this.mappingRuleDefinedCustomTargetingValueIds==null && other.getMappingRuleDefinedCustomTargetingValueIds()==null) || 
             (this.mappingRuleDefinedCustomTargetingValueIds!=null &&
              java.util.Arrays.equals(this.mappingRuleDefinedCustomTargetingValueIds, other.getMappingRuleDefinedCustomTargetingValueIds()))) &&
            ((this.cmsSources==null && other.getCmsSources()==null) || 
             (this.cmsSources!=null &&
              java.util.Arrays.equals(this.cmsSources, other.getCmsSources())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDefinedBy() != null) {
            _hashCode += getStatusDefinedBy().hashCode();
        }
        if (getImportDateTime() != null) {
            _hashCode += getImportDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getUserDefinedCustomTargetingValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedCustomTargetingValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedCustomTargetingValueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMappingRuleDefinedCustomTargetingValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMappingRuleDefinedCustomTargetingValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMappingRuleDefinedCustomTargetingValueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmsSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmsSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmsSources(), i);
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
        new org.apache.axis.description.TypeDesc(Content.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "Content"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "ContentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDefinedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "statusDefinedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "ContentStatusDefinedBy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "importDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedCustomTargetingValueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "userDefinedCustomTargetingValueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingRuleDefinedCustomTargetingValueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "mappingRuleDefinedCustomTargetingValueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsSources");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "cmsSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "CmsContent"));
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
