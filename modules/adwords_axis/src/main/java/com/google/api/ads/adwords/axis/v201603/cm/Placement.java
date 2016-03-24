/**
 * Placement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;


/**
 * A placement used for modifying bids for sites when targeting the
 * content
 *             network.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class Placement  extends com.google.api.ads.adwords.axis.v201603.cm.Criterion  implements java.io.Serializable {
    /* Url of the placement.
     *                     
     *                     <p>For example, "http://www.domain.com".
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PlacementUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String url;

    public Placement() {
    }

    public Placement(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201603.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String url) {
        super(
            id,
            type,
            criterionType);
        this.url = url;
    }


    /**
     * Gets the url value for this Placement.
     * 
     * @return url   * Url of the placement.
     *                     
     *                     <p>For example, "http://www.domain.com".
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PlacementUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Placement.
     * 
     * @param url   * Url of the placement.
     *                     
     *                     <p>For example, "http://www.domain.com".
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "PlacementUrl".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Placement)) return false;
        Placement other = (Placement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Placement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "Placement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
