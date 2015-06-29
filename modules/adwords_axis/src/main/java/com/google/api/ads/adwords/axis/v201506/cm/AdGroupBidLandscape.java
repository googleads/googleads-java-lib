/**
 * AdGroupBidLandscape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Represents data about a bidlandscape for an adgroup.
 */
public class AdGroupBidLandscape  extends com.google.api.ads.adwords.axis.v201506.cm.BidLandscape  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "LandscapeType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201506.cm.AdGroupBidLandscapeType type;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "LandscapeCurrent".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Boolean landscapeCurrent;

    public AdGroupBidLandscape() {
    }

    public AdGroupBidLandscape(
           java.lang.String dataEntryType,
           java.lang.Long campaignId,
           java.lang.Long adGroupId,
           java.lang.String startDate,
           java.lang.String endDate,
           com.google.api.ads.adwords.axis.v201506.cm.BidLandscapeLandscapePoint[] landscapePoints,
           com.google.api.ads.adwords.axis.v201506.cm.AdGroupBidLandscapeType type,
           java.lang.Boolean landscapeCurrent) {
        super(
            dataEntryType,
            campaignId,
            adGroupId,
            startDate,
            endDate,
            landscapePoints);
        this.type = type;
        this.landscapeCurrent = landscapeCurrent;
    }


    /**
     * Gets the type value for this AdGroupBidLandscape.
     * 
     * @return type   * <span class="constraint Selectable">This field can be selected
     * using the value "LandscapeType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201506.cm.AdGroupBidLandscapeType getType() {
        return type;
    }


    /**
     * Sets the type value for this AdGroupBidLandscape.
     * 
     * @param type   * <span class="constraint Selectable">This field can be selected
     * using the value "LandscapeType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201506.cm.AdGroupBidLandscapeType type) {
        this.type = type;
    }


    /**
     * Gets the landscapeCurrent value for this AdGroupBidLandscape.
     * 
     * @return landscapeCurrent   * <span class="constraint Selectable">This field can be selected
     * using the value "LandscapeCurrent".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Boolean getLandscapeCurrent() {
        return landscapeCurrent;
    }


    /**
     * Sets the landscapeCurrent value for this AdGroupBidLandscape.
     * 
     * @param landscapeCurrent   * <span class="constraint Selectable">This field can be selected
     * using the value "LandscapeCurrent".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setLandscapeCurrent(java.lang.Boolean landscapeCurrent) {
        this.landscapeCurrent = landscapeCurrent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupBidLandscape)) return false;
        AdGroupBidLandscape other = (AdGroupBidLandscape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.landscapeCurrent==null && other.getLandscapeCurrent()==null) || 
             (this.landscapeCurrent!=null &&
              this.landscapeCurrent.equals(other.getLandscapeCurrent())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLandscapeCurrent() != null) {
            _hashCode += getLandscapeCurrent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupBidLandscape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "AdGroupBidLandscape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "AdGroupBidLandscape.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landscapeCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "landscapeCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
