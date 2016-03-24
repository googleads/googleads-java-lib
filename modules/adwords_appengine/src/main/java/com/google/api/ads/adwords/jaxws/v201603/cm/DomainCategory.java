
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents categories that AdWords finds automatically for your website.
 *             
 *             <p>
 *             No categories available means that AdWords couldn't automatically find categories for your
 *             website. To control how categories are assigned, manually add breadcrumbs to your webpages.
 *             
 *             <p>
 *             Categories can be filtered by domain name or by a set of campaign IDs.
 *           
 * 
 * <p>Java class for DomainCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}DimensionProperties">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isoLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recommendedCpc" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="hasChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="categoryRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainCategory", propOrder = {
    "category",
    "coverage",
    "domainName",
    "isoLanguage",
    "recommendedCpc",
    "hasChild",
    "categoryRank"
})
public class DomainCategory
    extends DimensionProperties
{

    protected String category;
    protected Double coverage;
    protected String domainName;
    protected String isoLanguage;
    protected Money recommendedCpc;
    protected Boolean hasChild;
    protected Integer categoryRank;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoverage(Double value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the isoLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoLanguage() {
        return isoLanguage;
    }

    /**
     * Sets the value of the isoLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoLanguage(String value) {
        this.isoLanguage = value;
    }

    /**
     * Gets the value of the recommendedCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getRecommendedCpc() {
        return recommendedCpc;
    }

    /**
     * Sets the value of the recommendedCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setRecommendedCpc(Money value) {
        this.recommendedCpc = value;
    }

    /**
     * Gets the value of the hasChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChild() {
        return hasChild;
    }

    /**
     * Sets the value of the hasChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChild(Boolean value) {
        this.hasChild = value;
    }

    /**
     * Gets the value of the categoryRank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryRank() {
        return categoryRank;
    }

    /**
     * Sets the value of the categoryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryRank(Integer value) {
        this.categoryRank = value;
    }

}
