/**
 * ThirdPartySlot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;


/**
 * A {@code ThirdPartySlot} represents how third-party creatives are
 * uniquely identified in a third-party ad network, yield manager, or
 * ad exchange's system.
 */
public class ThirdPartySlot  implements java.io.Serializable {
    /* The unique ID of the {@code ThirdPartySlot}. This value is
     * readonly
     *                 and is assigned by Google. */
    private java.lang.Long id;

    /* Set of IDs of {@link Creative} objects that belong to this
     * slot. */
    private long[] creativeIds;

    /* ID of the {@link Company} to which this slot belongs. This
     * value is
     *                 required. */
    private java.lang.Long companyId;

    /* The unique identification for this creative in the third party
     * system.
     *                 This value is required and has a maximum length of
     * 255 characters. */
    private java.lang.String externalUniqueId;

    /* The name for the unique identification - this value may, and
     * will usually,
     *                 be the same as externalUniqueId.  This value is required
     * and has a maximum
     *                 length of 255 characters. */
    private java.lang.String externalUniqueName;

    /* A description of the unique identification.  This value is
     * required and
     *                 has a maximum length of 511 characters. */
    private java.lang.String description;

    /* The status of this {@code ThirdPartySlot}.  This attribute
     * is read-only. */
    private com.google.api.ads.dfp.axis.v201208.ThirdPartySlotStatus status;

    public ThirdPartySlot() {
    }

    public ThirdPartySlot(
           java.lang.Long id,
           long[] creativeIds,
           java.lang.Long companyId,
           java.lang.String externalUniqueId,
           java.lang.String externalUniqueName,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201208.ThirdPartySlotStatus status) {
           this.id = id;
           this.creativeIds = creativeIds;
           this.companyId = companyId;
           this.externalUniqueId = externalUniqueId;
           this.externalUniqueName = externalUniqueName;
           this.description = description;
           this.status = status;
    }


    /**
     * Gets the id value for this ThirdPartySlot.
     * 
     * @return id   * The unique ID of the {@code ThirdPartySlot}. This value is
     * readonly
     *                 and is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ThirdPartySlot.
     * 
     * @param id   * The unique ID of the {@code ThirdPartySlot}. This value is
     * readonly
     *                 and is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the creativeIds value for this ThirdPartySlot.
     * 
     * @return creativeIds   * Set of IDs of {@link Creative} objects that belong to this
     * slot.
     */
    public long[] getCreativeIds() {
        return creativeIds;
    }


    /**
     * Sets the creativeIds value for this ThirdPartySlot.
     * 
     * @param creativeIds   * Set of IDs of {@link Creative} objects that belong to this
     * slot.
     */
    public void setCreativeIds(long[] creativeIds) {
        this.creativeIds = creativeIds;
    }

    public long getCreativeIds(int i) {
        return this.creativeIds[i];
    }

    public void setCreativeIds(int i, long _value) {
        this.creativeIds[i] = _value;
    }


    /**
     * Gets the companyId value for this ThirdPartySlot.
     * 
     * @return companyId   * ID of the {@link Company} to which this slot belongs. This
     * value is
     *                 required.
     */
    public java.lang.Long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ThirdPartySlot.
     * 
     * @param companyId   * ID of the {@link Company} to which this slot belongs. This
     * value is
     *                 required.
     */
    public void setCompanyId(java.lang.Long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the externalUniqueId value for this ThirdPartySlot.
     * 
     * @return externalUniqueId   * The unique identification for this creative in the third party
     * system.
     *                 This value is required and has a maximum length of
     * 255 characters.
     */
    public java.lang.String getExternalUniqueId() {
        return externalUniqueId;
    }


    /**
     * Sets the externalUniqueId value for this ThirdPartySlot.
     * 
     * @param externalUniqueId   * The unique identification for this creative in the third party
     * system.
     *                 This value is required and has a maximum length of
     * 255 characters.
     */
    public void setExternalUniqueId(java.lang.String externalUniqueId) {
        this.externalUniqueId = externalUniqueId;
    }


    /**
     * Gets the externalUniqueName value for this ThirdPartySlot.
     * 
     * @return externalUniqueName   * The name for the unique identification - this value may, and
     * will usually,
     *                 be the same as externalUniqueId.  This value is required
     * and has a maximum
     *                 length of 255 characters.
     */
    public java.lang.String getExternalUniqueName() {
        return externalUniqueName;
    }


    /**
     * Sets the externalUniqueName value for this ThirdPartySlot.
     * 
     * @param externalUniqueName   * The name for the unique identification - this value may, and
     * will usually,
     *                 be the same as externalUniqueId.  This value is required
     * and has a maximum
     *                 length of 255 characters.
     */
    public void setExternalUniqueName(java.lang.String externalUniqueName) {
        this.externalUniqueName = externalUniqueName;
    }


    /**
     * Gets the description value for this ThirdPartySlot.
     * 
     * @return description   * A description of the unique identification.  This value is
     * required and
     *                 has a maximum length of 511 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ThirdPartySlot.
     * 
     * @param description   * A description of the unique identification.  This value is
     * required and
     *                 has a maximum length of 511 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this ThirdPartySlot.
     * 
     * @return status   * The status of this {@code ThirdPartySlot}.  This attribute
     * is read-only.
     */
    public com.google.api.ads.dfp.axis.v201208.ThirdPartySlotStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ThirdPartySlot.
     * 
     * @param status   * The status of this {@code ThirdPartySlot}.  This attribute
     * is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201208.ThirdPartySlotStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartySlot)) return false;
        ThirdPartySlot other = (ThirdPartySlot) obj;
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
            ((this.creativeIds==null && other.getCreativeIds()==null) || 
             (this.creativeIds!=null &&
              java.util.Arrays.equals(this.creativeIds, other.getCreativeIds()))) &&
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.externalUniqueId==null && other.getExternalUniqueId()==null) || 
             (this.externalUniqueId!=null &&
              this.externalUniqueId.equals(other.getExternalUniqueId()))) &&
            ((this.externalUniqueName==null && other.getExternalUniqueName()==null) || 
             (this.externalUniqueName!=null &&
              this.externalUniqueName.equals(other.getExternalUniqueName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCreativeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getExternalUniqueId() != null) {
            _hashCode += getExternalUniqueId().hashCode();
        }
        if (getExternalUniqueName() != null) {
            _hashCode += getExternalUniqueName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartySlot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "ThirdPartySlot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "creativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "externalUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalUniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "externalUniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "ThirdPartySlot.Status"));
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
