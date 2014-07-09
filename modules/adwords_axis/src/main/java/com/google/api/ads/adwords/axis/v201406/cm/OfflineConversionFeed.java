/**
 * OfflineConversionFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;


/**
 * Represents an entire record in the offline conversions feed that
 * the advertiser uploads.
 */
public class OfflineConversionFeed  implements java.io.Serializable {
    /* The google click ID associated with this conversion, as captured
     * from the landing page.
     *                 <p>
     *                 If your account has auto-tagging turned on, the google
     * click ID can be obtained from a query
     *                 parameter called 'gclid'.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionGclid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 512, inclusive, (trimmed).</span> */
    private java.lang.String googleClickId;

    /* The type associated with this conversion.
     *                 <p>
     *                 It is valid to report multiple conversions for the
     * same google
     *                 click ID, since visitors may trigger multiple conversions
     * for a
     *                 click. These conversions names are generated in the
     * front end by
     *                 advertisers.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span> */
    private java.lang.String conversionName;

    /* The time that this conversion occurred at.
     *                 <p>
     *                 This has to be after the click time. A time in the
     * future is not allowed.
     *                 A timezone is always required.
     *                 <p>
     *                 When a conversion for the same google click ID, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String conversionTime;

    /* This conversions value for the advertiser.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span> */
    private java.lang.Double conversionValue;

    public OfflineConversionFeed() {
    }

    public OfflineConversionFeed(
           java.lang.String googleClickId,
           java.lang.String conversionName,
           java.lang.String conversionTime,
           java.lang.Double conversionValue) {
           this.googleClickId = googleClickId;
           this.conversionName = conversionName;
           this.conversionTime = conversionTime;
           this.conversionValue = conversionValue;
    }


    /**
     * Gets the googleClickId value for this OfflineConversionFeed.
     * 
     * @return googleClickId   * The google click ID associated with this conversion, as captured
     * from the landing page.
     *                 <p>
     *                 If your account has auto-tagging turned on, the google
     * click ID can be obtained from a query
     *                 parameter called 'gclid'.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionGclid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 512, inclusive, (trimmed).</span>
     */
    public java.lang.String getGoogleClickId() {
        return googleClickId;
    }


    /**
     * Sets the googleClickId value for this OfflineConversionFeed.
     * 
     * @param googleClickId   * The google click ID associated with this conversion, as captured
     * from the landing page.
     *                 <p>
     *                 If your account has auto-tagging turned on, the google
     * click ID can be obtained from a query
     *                 parameter called 'gclid'.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionGclid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 512, inclusive, (trimmed).</span>
     */
    public void setGoogleClickId(java.lang.String googleClickId) {
        this.googleClickId = googleClickId;
    }


    /**
     * Gets the conversionName value for this OfflineConversionFeed.
     * 
     * @return conversionName   * The type associated with this conversion.
     *                 <p>
     *                 It is valid to report multiple conversions for the
     * same google
     *                 click ID, since visitors may trigger multiple conversions
     * for a
     *                 click. These conversions names are generated in the
     * front end by
     *                 advertisers.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span>
     */
    public java.lang.String getConversionName() {
        return conversionName;
    }


    /**
     * Sets the conversionName value for this OfflineConversionFeed.
     * 
     * @param conversionName   * The type associated with this conversion.
     *                 <p>
     *                 It is valid to report multiple conversions for the
     * same google
     *                 click ID, since visitors may trigger multiple conversions
     * for a
     *                 click. These conversions names are generated in the
     * front end by
     *                 advertisers.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 100, inclusive, (trimmed).</span>
     */
    public void setConversionName(java.lang.String conversionName) {
        this.conversionName = conversionName;
    }


    /**
     * Gets the conversionTime value for this OfflineConversionFeed.
     * 
     * @return conversionTime   * The time that this conversion occurred at.
     *                 <p>
     *                 This has to be after the click time. A time in the
     * future is not allowed.
     *                 A timezone is always required.
     *                 <p>
     *                 When a conversion for the same google click ID, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getConversionTime() {
        return conversionTime;
    }


    /**
     * Sets the conversionTime value for this OfflineConversionFeed.
     * 
     * @param conversionTime   * The time that this conversion occurred at.
     *                 <p>
     *                 This has to be after the click time. A time in the
     * future is not allowed.
     *                 A timezone is always required.
     *                 <p>
     *                 When a conversion for the same google click ID, conversion
     * name
     *                 and conversion time is uploaded multiple times, the
     * first one
     *                 results in a conversion being recorded. The duplicates
     * are
     *                 ignored and reported as successes, to indicate that
     * a conversion
     *                 for this combination has been recorded.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setConversionTime(java.lang.String conversionTime) {
        this.conversionTime = conversionTime;
    }


    /**
     * Gets the conversionValue value for this OfflineConversionFeed.
     * 
     * @return conversionValue   * This conversions value for the advertiser.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span>
     */
    public java.lang.Double getConversionValue() {
        return conversionValue;
    }


    /**
     * Sets the conversionValue value for this OfflineConversionFeed.
     * 
     * @param conversionValue   * This conversions value for the advertiser.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ConversionValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 0.</span>
     */
    public void setConversionValue(java.lang.Double conversionValue) {
        this.conversionValue = conversionValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfflineConversionFeed)) return false;
        OfflineConversionFeed other = (OfflineConversionFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.googleClickId==null && other.getGoogleClickId()==null) || 
             (this.googleClickId!=null &&
              this.googleClickId.equals(other.getGoogleClickId()))) &&
            ((this.conversionName==null && other.getConversionName()==null) || 
             (this.conversionName!=null &&
              this.conversionName.equals(other.getConversionName()))) &&
            ((this.conversionTime==null && other.getConversionTime()==null) || 
             (this.conversionTime!=null &&
              this.conversionTime.equals(other.getConversionTime()))) &&
            ((this.conversionValue==null && other.getConversionValue()==null) || 
             (this.conversionValue!=null &&
              this.conversionValue.equals(other.getConversionValue())));
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
        if (getGoogleClickId() != null) {
            _hashCode += getGoogleClickId().hashCode();
        }
        if (getConversionName() != null) {
            _hashCode += getConversionName().hashCode();
        }
        if (getConversionTime() != null) {
            _hashCode += getConversionTime().hashCode();
        }
        if (getConversionValue() != null) {
            _hashCode += getConversionValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfflineConversionFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "OfflineConversionFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleClickId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "googleClickId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "conversionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "conversionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "conversionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
