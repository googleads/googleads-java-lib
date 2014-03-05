
package com.google.api.ads.adwords.jaxws.v201306.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201306.cm.Keyword;
import com.google.api.ads.adwords.jaxws.v201306.cm.Money;


/**
 * 
 *             Represents a keyword to be estimated.
 *           
 * 
 * <p>Java class for KeywordEstimateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordEstimateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201306}EstimateRequest">
 *       &lt;sequence>
 *         &lt;element name="keyword" type="{https://adwords.google.com/api/adwords/cm/v201306}Keyword" minOccurs="0"/>
 *         &lt;element name="maxCpc" type="{https://adwords.google.com/api/adwords/cm/v201306}Money" minOccurs="0"/>
 *         &lt;element name="isNegative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordEstimateRequest", propOrder = {
    "keyword",
    "maxCpc",
    "isNegative"
})
public class KeywordEstimateRequest
    extends EstimateRequest
{

    protected Keyword keyword;
    protected Money maxCpc;
    protected Boolean isNegative;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link Keyword }
     *     
     */
    public Keyword getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keyword }
     *     
     */
    public void setKeyword(Keyword value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the maxCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxCpc() {
        return maxCpc;
    }

    /**
     * Sets the value of the maxCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxCpc(Money value) {
        this.maxCpc = value;
    }

    /**
     * Gets the value of the isNegative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegative() {
        return isNegative;
    }

    /**
     * Sets the value of the isNegative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegative(Boolean value) {
        this.isNegative = value;
    }

}
