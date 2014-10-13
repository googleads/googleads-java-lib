/**
 * DynamicSearchAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Represents a dynamic search ad. This ad will have its headline
 * and
 *             destination URL auto-generated at serving time according
 * to domain name
 *             specific information provided by {@link DomainInfoExtension}
 * linked at the
 *             campaign level.
 *             
 *             <p>Auto-generated fields: headline and destination URL
 * (may contain an optional
 *             tracking URL).</p>
 *             
 *             <p><b>Required fields:</b> {@code description1}, {@code
 * description2},
 *             {@code displayUrl}.</p>
 *             
 *             <p>The URL field must contain at least one of the following
 * placeholder tags
 *             (URL parameters):</p>
 *             <ul>
 *             <li>{unescapedlpurl}</li>
 *             <li>{escapedlpurl}</li>
 *             <li>{lpurlpath}</li>
 *             <li>{lpurl}</li>
 *             </ul>
 *             
 *             <p>If no URL is specified, {unescapedlpurl} will be used
 * as default.</p>
 *             
 *             <ul>
 *             <li>{unescapedlpurl} can only be used at the beginning
 * of the URL field. It
 *             will be replaced with the full landing page URL of the
 * displayed ad. Extra query
 *             parameters can be added to the end, e.g.: "{unescapedlpurl}?lang=en".</li>
 * 
 *             <li>{escapedlpurl} will be replaced with the URL-encoded
 * version of the full
 *             landing page URL. This makes it suitable for use as a
 * query parameter
 *             value (e.g.: "http://www.3rdpartytracker.com/?lp={escapedlpurl}")
 * but
 *             not at the beginning of the URL field.</li>
 *             
 *             <li>{lpurlpath} will be replaced with the path and query
 * part of the landing
 *             page URL and can be added to a different URL, e.g.:
 *             "http://www.mygoodbusiness.com/tracking/{lpurlpath}".</li>
 * 
 *             <li>{lpurl} encodes the "?" and "=" of the landing page
 * URL making it suitable
 *             for use as a query parameter. If found at the beginning
 * of the URL field, it is
 *             replaced by the {unescapedlpurl} value.
 *             E.g.: "http://tracking.com/redir.php?tracking=xyz&url={lpurl}".</li>
 * </ul>
 *             
 *             <p>There are also special rules that come into play depending
 * on whether the
 *             destination URL uses local click tracking or third-party
 * click tracking.</p>
 *             
 *             <p class="note">Note that {@code finalUrls} and {@code
 * finalMobileUrls}
 *             cannot be set for dynamic search ads.</p>
 *             
 *             <p>For more information, see the article
 *             <a href="//support.google.com/adwords/answer/2549100">Using
 * dynamic tracking URLs</a>.
 *             </p>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class DynamicSearchAd  extends com.google.api.ads.adwords.axis.v201409.cm.Ad  implements java.io.Serializable {
    /* The first description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description1".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String description1;

    /* The second description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description2".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String description2;

    public DynamicSearchAd() {
    }

    public DynamicSearchAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201409.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201409.cm.CustomParameters urlCustomParameters,
           java.lang.Long devicePreference,
           java.lang.String adType,
           java.lang.String description1,
           java.lang.String description2) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            urlCustomParameters,
            devicePreference,
            adType);
        this.description1 = description1;
        this.description2 = description2;
    }


    /**
     * Gets the description1 value for this DynamicSearchAd.
     * 
     * @return description1   * The first description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description1".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this DynamicSearchAd.
     * 
     * @param description1   * The first description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description1".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this DynamicSearchAd.
     * 
     * @return description2   * The second description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description2".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this DynamicSearchAd.
     * 
     * @param description2   * The second description line.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Description2".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynamicSearchAd)) return false;
        DynamicSearchAd other = (DynamicSearchAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2())));
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
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DynamicSearchAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "DynamicSearchAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "description2"));
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
