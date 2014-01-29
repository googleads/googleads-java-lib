/**
 * RemoveAdUnitsFromPlacement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * The action used for removing a group of {@link AdUnit} objects
 *             from a {@link Placement}.
 */
public class RemoveAdUnitsFromPlacement  extends com.google.api.ads.dfp.axis.v201302.AdUnitAction  implements java.io.Serializable {
    /* The {@link Placement#id} from which ad units are to be removed. */
    private java.lang.Long placementId;

    public RemoveAdUnitsFromPlacement() {
    }

    public RemoveAdUnitsFromPlacement(
           java.lang.String adUnitActionType,
           java.lang.Long placementId) {
        super(
            adUnitActionType);
        this.placementId = placementId;
    }


    /**
     * Gets the placementId value for this RemoveAdUnitsFromPlacement.
     * 
     * @return placementId   * The {@link Placement#id} from which ad units are to be removed.
     */
    public java.lang.Long getPlacementId() {
        return placementId;
    }


    /**
     * Sets the placementId value for this RemoveAdUnitsFromPlacement.
     * 
     * @param placementId   * The {@link Placement#id} from which ad units are to be removed.
     */
    public void setPlacementId(java.lang.Long placementId) {
        this.placementId = placementId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveAdUnitsFromPlacement)) return false;
        RemoveAdUnitsFromPlacement other = (RemoveAdUnitsFromPlacement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.placementId==null && other.getPlacementId()==null) || 
             (this.placementId!=null &&
              this.placementId.equals(other.getPlacementId())));
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
        if (getPlacementId() != null) {
            _hashCode += getPlacementId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveAdUnitsFromPlacement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "RemoveAdUnitsFromPlacement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "placementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
