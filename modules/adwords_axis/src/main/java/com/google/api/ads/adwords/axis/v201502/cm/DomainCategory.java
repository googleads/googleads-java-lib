/**
 * DomainCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Represents categories that AdWords finds automatically for your
 * website.
 *             
 *             <p>
 *             No categories available means that AdWords couldn't automatically
 * find categories for your
 *             website. To control how categories are assigned, manually
 * add breadcrumbs to your webpages.
 *             
 *             <p>
 *             Categories can be filtered by domain name or by a set
 * of campaign IDs.
 */
public class DomainCategory  extends com.google.api.ads.adwords.axis.v201502.cm.DimensionProperties  implements java.io.Serializable {
    /* Recommended category for the website domain.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String category;

    /* Coverage is the number of docs that match a label / number
     * of docs that match the
     *                     immediate parent label.
     *                     <p>
     *                     Example : united states/ca/sfo matches 500 docs
     * and united states/ca matches 1000
     *                     docs. The coverage will be 50%.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Coverage".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Double coverage;

    /* The domain for the website. Since many different domains can
     * have the same categories, the
     *                     domain and the language are used to uniquely identify
     * the categories.
     *                     <p>
     *                     The domain can be specified in the DynamicSearchAdsSetting
     * required for dynamic search ads.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DomainName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String domainName;

    /* The language for the website. Since many different domains
     * can have the same categories, the
     *                     domain and the language are used to uniquely identify
     * the categories.
     *                     <p>
     *                     The language can be specified in the DynamicSearchAdsSetting
     * required for dynamic search ads.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IsoLanguage".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String isoLanguage;

    public DomainCategory() {
    }

    public DomainCategory(
           java.lang.String dataEntryType,
           com.google.api.ads.adwords.axis.v201502.cm.LevelOfDetail levelOfDetail,
           java.lang.String category,
           java.lang.Double coverage,
           java.lang.String domainName,
           java.lang.String isoLanguage) {
        super(
            dataEntryType,
            levelOfDetail);
        this.category = category;
        this.coverage = coverage;
        this.domainName = domainName;
        this.isoLanguage = isoLanguage;
    }


    /**
     * Gets the category value for this DomainCategory.
     * 
     * @return category   * Recommended category for the website domain.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this DomainCategory.
     * 
     * @param category   * Recommended category for the website domain.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the coverage value for this DomainCategory.
     * 
     * @return coverage   * Coverage is the number of docs that match a label / number
     * of docs that match the
     *                     immediate parent label.
     *                     <p>
     *                     Example : united states/ca/sfo matches 500 docs
     * and united states/ca matches 1000
     *                     docs. The coverage will be 50%.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Coverage".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Double getCoverage() {
        return coverage;
    }


    /**
     * Sets the coverage value for this DomainCategory.
     * 
     * @param coverage   * Coverage is the number of docs that match a label / number
     * of docs that match the
     *                     immediate parent label.
     *                     <p>
     *                     Example : united states/ca/sfo matches 500 docs
     * and united states/ca matches 1000
     *                     docs. The coverage will be 50%.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Coverage".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCoverage(java.lang.Double coverage) {
        this.coverage = coverage;
    }


    /**
     * Gets the domainName value for this DomainCategory.
     * 
     * @return domainName   * The domain for the website. Since many different domains can
     * have the same categories, the
     *                     domain and the language are used to uniquely identify
     * the categories.
     *                     <p>
     *                     The domain can be specified in the DynamicSearchAdsSetting
     * required for dynamic search ads.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DomainName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this DomainCategory.
     * 
     * @param domainName   * The domain for the website. Since many different domains can
     * have the same categories, the
     *                     domain and the language are used to uniquely identify
     * the categories.
     *                     <p>
     *                     The domain can be specified in the DynamicSearchAdsSetting
     * required for dynamic search ads.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DomainName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the isoLanguage value for this DomainCategory.
     * 
     * @return isoLanguage   * The language for the website. Since many different domains
     * can have the same categories, the
     *                     domain and the language are used to uniquely identify
     * the categories.
     *                     <p>
     *                     The language can be specified in the DynamicSearchAdsSetting
     * required for dynamic search ads.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IsoLanguage".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getIsoLanguage() {
        return isoLanguage;
    }


    /**
     * Sets the isoLanguage value for this DomainCategory.
     * 
     * @param isoLanguage   * The language for the website. Since many different domains
     * can have the same categories, the
     *                     domain and the language are used to uniquely identify
     * the categories.
     *                     <p>
     *                     The language can be specified in the DynamicSearchAdsSetting
     * required for dynamic search ads.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "IsoLanguage".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setIsoLanguage(java.lang.String isoLanguage) {
        this.isoLanguage = isoLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainCategory)) return false;
        DomainCategory other = (DomainCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.coverage==null && other.getCoverage()==null) || 
             (this.coverage!=null &&
              this.coverage.equals(other.getCoverage()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.isoLanguage==null && other.getIsoLanguage()==null) || 
             (this.isoLanguage!=null &&
              this.isoLanguage.equals(other.getIsoLanguage())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCoverage() != null) {
            _hashCode += getCoverage().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getIsoLanguage() != null) {
            _hashCode += getIsoLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "DomainCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "coverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "isoLanguage"));
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
