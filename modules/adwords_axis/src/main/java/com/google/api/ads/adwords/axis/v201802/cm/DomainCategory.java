// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * DomainCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


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
public class DomainCategory  extends com.google.api.ads.adwords.axis.v201802.cm.DimensionProperties  implements java.io.Serializable {
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

    /* The recommended cost per click for the category.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "RecommendedCpc".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money recommendedCpc;

    /* Used to determine whether a category has sub-categories associated
     * with it.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "HasChild".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean hasChild;

    /* The position of this category in the recommended set of categories.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CategoryRank".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Integer categoryRank;

    public DomainCategory() {
    }

    public DomainCategory(
           java.lang.String dataEntryType,
           com.google.api.ads.adwords.axis.v201802.cm.LevelOfDetail levelOfDetail,
           java.lang.String category,
           java.lang.Double coverage,
           java.lang.String domainName,
           java.lang.String isoLanguage,
           com.google.api.ads.adwords.axis.v201802.cm.Money recommendedCpc,
           java.lang.Boolean hasChild,
           java.lang.Integer categoryRank) {
        super(
            dataEntryType,
            levelOfDetail);
        this.category = category;
        this.coverage = coverage;
        this.domainName = domainName;
        this.isoLanguage = isoLanguage;
        this.recommendedCpc = recommendedCpc;
        this.hasChild = hasChild;
        this.categoryRank = categoryRank;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("category", getCategory())
            .add("categoryRank", getCategoryRank())
            .add("coverage", getCoverage())
            .add("dataEntryType", getDataEntryType())
            .add("domainName", getDomainName())
            .add("hasChild", getHasChild())
            .add("isoLanguage", getIsoLanguage())
            .add("levelOfDetail", getLevelOfDetail())
            .add("recommendedCpc", getRecommendedCpc())
            .toString();
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


    /**
     * Gets the recommendedCpc value for this DomainCategory.
     * 
     * @return recommendedCpc   * The recommended cost per click for the category.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "RecommendedCpc".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getRecommendedCpc() {
        return recommendedCpc;
    }


    /**
     * Sets the recommendedCpc value for this DomainCategory.
     * 
     * @param recommendedCpc   * The recommended cost per click for the category.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "RecommendedCpc".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setRecommendedCpc(com.google.api.ads.adwords.axis.v201802.cm.Money recommendedCpc) {
        this.recommendedCpc = recommendedCpc;
    }


    /**
     * Gets the hasChild value for this DomainCategory.
     * 
     * @return hasChild   * Used to determine whether a category has sub-categories associated
     * with it.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "HasChild".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getHasChild() {
        return hasChild;
    }


    /**
     * Sets the hasChild value for this DomainCategory.
     * 
     * @param hasChild   * Used to determine whether a category has sub-categories associated
     * with it.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "HasChild".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setHasChild(java.lang.Boolean hasChild) {
        this.hasChild = hasChild;
    }


    /**
     * Gets the categoryRank value for this DomainCategory.
     * 
     * @return categoryRank   * The position of this category in the recommended set of categories.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CategoryRank".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getCategoryRank() {
        return categoryRank;
    }


    /**
     * Sets the categoryRank value for this DomainCategory.
     * 
     * @param categoryRank   * The position of this category in the recommended set of categories.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CategoryRank".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCategoryRank(java.lang.Integer categoryRank) {
        this.categoryRank = categoryRank;
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
              this.isoLanguage.equals(other.getIsoLanguage()))) &&
            ((this.recommendedCpc==null && other.getRecommendedCpc()==null) || 
             (this.recommendedCpc!=null &&
              this.recommendedCpc.equals(other.getRecommendedCpc()))) &&
            ((this.hasChild==null && other.getHasChild()==null) || 
             (this.hasChild!=null &&
              this.hasChild.equals(other.getHasChild()))) &&
            ((this.categoryRank==null && other.getCategoryRank()==null) || 
             (this.categoryRank!=null &&
              this.categoryRank.equals(other.getCategoryRank())));
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
        if (getRecommendedCpc() != null) {
            _hashCode += getRecommendedCpc().hashCode();
        }
        if (getHasChild() != null) {
            _hashCode += getHasChild().hashCode();
        }
        if (getCategoryRank() != null) {
            _hashCode += getCategoryRank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DomainCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "coverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "domainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isoLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "recommendedCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasChild");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "hasChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryRank");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "categoryRank"));
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
