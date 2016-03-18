/**
 * CriterionBidLandscape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * The bid landscape for a criterion.  A bid landscape estimates how
 * a
 *             a criterion will perform based on different bid amounts.
 */
public class CriterionBidLandscape  extends com.google.api.ads.adwords.axis.v201509.cm.BidLandscape  implements java.io.Serializable {
    /* ID of the criterion associated with this landscape.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CriterionId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long criterionId;

    public CriterionBidLandscape() {
    }

    public CriterionBidLandscape(
           java.lang.String dataEntryType,
           java.lang.Long campaignId,
           java.lang.Long adGroupId,
           java.lang.String startDate,
           java.lang.String endDate,
           com.google.api.ads.adwords.axis.v201509.cm.BidLandscapeLandscapePoint[] landscapePoints,
           java.lang.Long criterionId) {
        super(
            dataEntryType,
            campaignId,
            adGroupId,
            startDate,
            endDate,
            landscapePoints);
        this.criterionId = criterionId;
    }


    /**
     * Gets the criterionId value for this CriterionBidLandscape.
     * 
     * @return criterionId   * ID of the criterion associated with this landscape.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CriterionId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getCriterionId() {
        return criterionId;
    }


    /**
     * Sets the criterionId value for this CriterionBidLandscape.
     * 
     * @param criterionId   * ID of the criterion associated with this landscape.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CriterionId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCriterionId(java.lang.Long criterionId) {
        this.criterionId = criterionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriterionBidLandscape)) return false;
        CriterionBidLandscape other = (CriterionBidLandscape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criterionId==null && other.getCriterionId()==null) || 
             (this.criterionId!=null &&
              this.criterionId.equals(other.getCriterionId())));
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
        if (getCriterionId() != null) {
            _hashCode += getCriterionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriterionBidLandscape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "CriterionBidLandscape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "criterionId"));
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
