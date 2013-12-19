/**
 * AlertSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.mcm;


/**
 * Selector for querying for alerts.
 */
public class AlertSelector  implements java.io.Serializable {
    /* Criteria of alerts to select like types and trigger time.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201306.mcm.AlertQuery query;

    /* Offset and count into the alerts matching this selector.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Paging paging;

    public AlertSelector() {
    }

    public AlertSelector(
           com.google.api.ads.adwords.axis.v201306.mcm.AlertQuery query,
           com.google.api.ads.adwords.axis.v201306.cm.Paging paging) {
           this.query = query;
           this.paging = paging;
    }


    /**
     * Gets the query value for this AlertSelector.
     * 
     * @return query   * Criteria of alerts to select like types and trigger time.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.mcm.AlertQuery getQuery() {
        return query;
    }


    /**
     * Sets the query value for this AlertSelector.
     * 
     * @param query   * Criteria of alerts to select like types and trigger time.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setQuery(com.google.api.ads.adwords.axis.v201306.mcm.AlertQuery query) {
        this.query = query;
    }


    /**
     * Gets the paging value for this AlertSelector.
     * 
     * @return paging   * Offset and count into the alerts matching this selector.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this AlertSelector.
     * 
     * @param paging   * Offset and count into the alerts matching this selector.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201306.cm.Paging paging) {
        this.paging = paging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlertSelector)) return false;
        AlertSelector other = (AlertSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging())));
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlertSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201306", "AlertSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201306", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201306", "AlertQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201306", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Paging"));
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
