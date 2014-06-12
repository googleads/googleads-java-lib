/**
 * InventoryUnitPartnerAssociationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;

public class InventoryUnitPartnerAssociationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InventoryUnitPartnerAssociationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ANCESTOR_AD_UNIT_HAS_PARTNER_ASSOCIATION = "ANCESTOR_AD_UNIT_HAS_PARTNER_ASSOCIATION";
    public static final java.lang.String _DESCENDANT_AD_UNIT_HAS_PARTNER_ASSOCIATION = "DESCENDANT_AD_UNIT_HAS_PARTNER_ASSOCIATION";
    public static final java.lang.String _SAME_PARTNER_ASSOCIATION_IN_INVENTORY_HIERARCHY = "SAME_PARTNER_ASSOCIATION_IN_INVENTORY_HIERARCHY";
    public static final java.lang.String _NO_PARTNER_CATCH_ALL = "NO_PARTNER_CATCH_ALL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final InventoryUnitPartnerAssociationErrorReason ANCESTOR_AD_UNIT_HAS_PARTNER_ASSOCIATION = new InventoryUnitPartnerAssociationErrorReason(_ANCESTOR_AD_UNIT_HAS_PARTNER_ASSOCIATION);
    public static final InventoryUnitPartnerAssociationErrorReason DESCENDANT_AD_UNIT_HAS_PARTNER_ASSOCIATION = new InventoryUnitPartnerAssociationErrorReason(_DESCENDANT_AD_UNIT_HAS_PARTNER_ASSOCIATION);
    public static final InventoryUnitPartnerAssociationErrorReason SAME_PARTNER_ASSOCIATION_IN_INVENTORY_HIERARCHY = new InventoryUnitPartnerAssociationErrorReason(_SAME_PARTNER_ASSOCIATION_IN_INVENTORY_HIERARCHY);
    public static final InventoryUnitPartnerAssociationErrorReason NO_PARTNER_CATCH_ALL = new InventoryUnitPartnerAssociationErrorReason(_NO_PARTNER_CATCH_ALL);
    public static final InventoryUnitPartnerAssociationErrorReason UNKNOWN = new InventoryUnitPartnerAssociationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static InventoryUnitPartnerAssociationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InventoryUnitPartnerAssociationErrorReason enumeration = (InventoryUnitPartnerAssociationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InventoryUnitPartnerAssociationErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryUnitPartnerAssociationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "InventoryUnitPartnerAssociationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
