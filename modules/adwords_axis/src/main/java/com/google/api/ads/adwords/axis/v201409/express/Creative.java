/**
 * Creative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.express;


/**
 * Creative for a text ad.
 */
public class Creative  implements java.io.Serializable {
    /* The headline of the creative.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive.</span> */
    private java.lang.String headline;

    /* The first description line.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 35, inclusive.</span> */
    private java.lang.String line1;

    /* The second description line.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 35, inclusive.</span> */
    private java.lang.String line2;

    public Creative() {
    }

    public Creative(
           java.lang.String headline,
           java.lang.String line1,
           java.lang.String line2) {
           this.headline = headline;
           this.line1 = line1;
           this.line2 = line2;
    }


    /**
     * Gets the headline value for this Creative.
     * 
     * @return headline   * The headline of the creative.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive.</span>
     */
    public java.lang.String getHeadline() {
        return headline;
    }


    /**
     * Sets the headline value for this Creative.
     * 
     * @param headline   * The headline of the creative.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive.</span>
     */
    public void setHeadline(java.lang.String headline) {
        this.headline = headline;
    }


    /**
     * Gets the line1 value for this Creative.
     * 
     * @return line1   * The first description line.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 35, inclusive.</span>
     */
    public java.lang.String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this Creative.
     * 
     * @param line1   * The first description line.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 35, inclusive.</span>
     */
    public void setLine1(java.lang.String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the line2 value for this Creative.
     * 
     * @return line2   * The second description line.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 35, inclusive.</span>
     */
    public java.lang.String getLine2() {
        return line2;
    }


    /**
     * Sets the line2 value for this Creative.
     * 
     * @param line2   * The second description line.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 0 and 35, inclusive.</span>
     */
    public void setLine2(java.lang.String line2) {
        this.line2 = line2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Creative)) return false;
        Creative other = (Creative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.headline==null && other.getHeadline()==null) || 
             (this.headline!=null &&
              this.headline.equals(other.getHeadline()))) &&
            ((this.line1==null && other.getLine1()==null) || 
             (this.line1!=null &&
              this.line1.equals(other.getLine1()))) &&
            ((this.line2==null && other.getLine2()==null) || 
             (this.line2!=null &&
              this.line2.equals(other.getLine2())));
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
        if (getHeadline() != null) {
            _hashCode += getHeadline().hashCode();
        }
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getLine2() != null) {
            _hashCode += getLine2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Creative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201409", "Creative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201409", "headline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201409", "line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201409", "line2"));
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
