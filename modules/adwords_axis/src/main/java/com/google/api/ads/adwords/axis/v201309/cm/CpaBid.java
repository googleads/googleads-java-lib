/**
 * CpaBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * CPA Bids.
 */
public class CpaBid  extends com.google.api.ads.adwords.axis.v201309.cm.Bids  implements java.io.Serializable {
    /* Target cost per acquisition/conversion. This is applicable
     * only at the ad group level.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetCpaBid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Money bid;

    public CpaBid() {
    }

    public CpaBid(
           java.lang.String bidsType,
           com.google.api.ads.adwords.axis.v201309.cm.Money bid) {
        super(
            bidsType);
        this.bid = bid;
    }


    /**
     * Gets the bid value for this CpaBid.
     * 
     * @return bid   * Target cost per acquisition/conversion. This is applicable
     * only at the ad group level.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetCpaBid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Money getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this CpaBid.
     * 
     * @param bid   * Target cost per acquisition/conversion. This is applicable
     * only at the ad group level.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetCpaBid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setBid(com.google.api.ads.adwords.axis.v201309.cm.Money bid) {
        this.bid = bid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpaBid)) return false;
        CpaBid other = (CpaBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid())));
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
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpaBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "CpaBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Money"));
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
