/**
 * CreativeBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public abstract class CreativeBase  extends com.google.api.ads.dfa.axis.v1_20.Base  implements java.io.Serializable {
    private boolean active;

    private long advertiserId;

    private boolean archived;

    private com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[] creativeFieldAssignments;

    private java.util.Calendar modifiedDate;

    private long renderingId;

    private long sizeId;

    private long typeId;

    private int version;

    public CreativeBase() {
    }

    public CreativeBase(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[] creativeFieldAssignments,
           java.util.Calendar modifiedDate,
           long renderingId,
           long sizeId,
           long typeId,
           int version) {
        super(
            id,
            name);
        this.active = active;
        this.advertiserId = advertiserId;
        this.archived = archived;
        this.creativeFieldAssignments = creativeFieldAssignments;
        this.modifiedDate = modifiedDate;
        this.renderingId = renderingId;
        this.sizeId = sizeId;
        this.typeId = typeId;
        this.version = version;
    }


    /**
     * Gets the active value for this CreativeBase.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this CreativeBase.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the advertiserId value for this CreativeBase.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this CreativeBase.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the archived value for this CreativeBase.
     * 
     * @return archived
     */
    public boolean isArchived() {
        return archived;
    }


    /**
     * Sets the archived value for this CreativeBase.
     * 
     * @param archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }


    /**
     * Gets the creativeFieldAssignments value for this CreativeBase.
     * 
     * @return creativeFieldAssignments
     */
    public com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[] getCreativeFieldAssignments() {
        return creativeFieldAssignments;
    }


    /**
     * Sets the creativeFieldAssignments value for this CreativeBase.
     * 
     * @param creativeFieldAssignments
     */
    public void setCreativeFieldAssignments(com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[] creativeFieldAssignments) {
        this.creativeFieldAssignments = creativeFieldAssignments;
    }


    /**
     * Gets the modifiedDate value for this CreativeBase.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this CreativeBase.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the renderingId value for this CreativeBase.
     * 
     * @return renderingId
     */
    public long getRenderingId() {
        return renderingId;
    }


    /**
     * Sets the renderingId value for this CreativeBase.
     * 
     * @param renderingId
     */
    public void setRenderingId(long renderingId) {
        this.renderingId = renderingId;
    }


    /**
     * Gets the sizeId value for this CreativeBase.
     * 
     * @return sizeId
     */
    public long getSizeId() {
        return sizeId;
    }


    /**
     * Sets the sizeId value for this CreativeBase.
     * 
     * @param sizeId
     */
    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }


    /**
     * Gets the typeId value for this CreativeBase.
     * 
     * @return typeId
     */
    public long getTypeId() {
        return typeId;
    }


    /**
     * Sets the typeId value for this CreativeBase.
     * 
     * @param typeId
     */
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }


    /**
     * Gets the version value for this CreativeBase.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CreativeBase.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeBase)) return false;
        CreativeBase other = (CreativeBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            this.advertiserId == other.getAdvertiserId() &&
            this.archived == other.isArchived() &&
            ((this.creativeFieldAssignments==null && other.getCreativeFieldAssignments()==null) || 
             (this.creativeFieldAssignments!=null &&
              java.util.Arrays.equals(this.creativeFieldAssignments, other.getCreativeFieldAssignments()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.renderingId == other.getRenderingId() &&
            this.sizeId == other.getSizeId() &&
            this.typeId == other.getTypeId() &&
            this.version == other.getVersion();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getAdvertiserId()).hashCode();
        _hashCode += (isArchived() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreativeFieldAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeFieldAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeFieldAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getRenderingId()).hashCode();
        _hashCode += new Long(getSizeId()).hashCode();
        _hashCode += new Long(getTypeId()).hashCode();
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeFieldAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeFieldAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeFieldAssignment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renderingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "renderingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
