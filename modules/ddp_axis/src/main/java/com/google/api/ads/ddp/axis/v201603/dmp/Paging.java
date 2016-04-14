/**
 * Paging.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;


/**
 * Specifies the page of results to return in the response. A page
 * is specified
 *                         by the result position to start at and the
 * maximum number of results to
 *                         return.
 */
public class Paging  implements java.io.Serializable {
    /* Index of the first result to return in this page.
     *                                 <span class="constraint InRange">This
     * field must be greater than or equal to 0.</span> */
    private java.lang.Integer startIndex;

    /* Maximum number of results to return in this page. Set this
     * to a reasonable value to limit
     *                                 the number of results returned per
     * page.
     *                                 <span class="constraint InRange">This
     * field must be greater than or equal to 0.</span> */
    private java.lang.Integer numberResults;

    public Paging() {
    }

    public Paging(
           java.lang.Integer startIndex,
           java.lang.Integer numberResults) {
           this.startIndex = startIndex;
           this.numberResults = numberResults;
    }


    /**
     * Gets the startIndex value for this Paging.
     * 
     * @return startIndex   * Index of the first result to return in this page.
     *                                 <span class="constraint InRange">This
     * field must be greater than or equal to 0.</span>
     */
    public java.lang.Integer getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this Paging.
     * 
     * @param startIndex   * Index of the first result to return in this page.
     *                                 <span class="constraint InRange">This
     * field must be greater than or equal to 0.</span>
     */
    public void setStartIndex(java.lang.Integer startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the numberResults value for this Paging.
     * 
     * @return numberResults   * Maximum number of results to return in this page. Set this
     * to a reasonable value to limit
     *                                 the number of results returned per
     * page.
     *                                 <span class="constraint InRange">This
     * field must be greater than or equal to 0.</span>
     */
    public java.lang.Integer getNumberResults() {
        return numberResults;
    }


    /**
     * Sets the numberResults value for this Paging.
     * 
     * @param numberResults   * Maximum number of results to return in this page. Set this
     * to a reasonable value to limit
     *                                 the number of results returned per
     * page.
     *                                 <span class="constraint InRange">This
     * field must be greater than or equal to 0.</span>
     */
    public void setNumberResults(java.lang.Integer numberResults) {
        this.numberResults = numberResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paging)) return false;
        Paging other = (Paging) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.numberResults==null && other.getNumberResults()==null) || 
             (this.numberResults!=null &&
              this.numberResults.equals(other.getNumberResults())));
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
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getNumberResults() != null) {
            _hashCode += getNumberResults().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paging.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Paging"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "startIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberResults");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "numberResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
