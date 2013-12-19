
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Container for criterion quality information.
 *           
 * 
 * <p>Java class for QualityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isKeywordAdRelevanceAcceptable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLandingPageQualityAcceptable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLandingPageLatencyAcceptable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="qualityScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityInfo", propOrder = {
    "isKeywordAdRelevanceAcceptable",
    "isLandingPageQualityAcceptable",
    "isLandingPageLatencyAcceptable",
    "qualityScore"
})
public class QualityInfo {

    protected Boolean isKeywordAdRelevanceAcceptable;
    protected Boolean isLandingPageQualityAcceptable;
    protected Boolean isLandingPageLatencyAcceptable;
    protected Integer qualityScore;

    /**
     * Gets the value of the isKeywordAdRelevanceAcceptable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsKeywordAdRelevanceAcceptable() {
        return isKeywordAdRelevanceAcceptable;
    }

    /**
     * Sets the value of the isKeywordAdRelevanceAcceptable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsKeywordAdRelevanceAcceptable(Boolean value) {
        this.isKeywordAdRelevanceAcceptable = value;
    }

    /**
     * Gets the value of the isLandingPageQualityAcceptable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLandingPageQualityAcceptable() {
        return isLandingPageQualityAcceptable;
    }

    /**
     * Sets the value of the isLandingPageQualityAcceptable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLandingPageQualityAcceptable(Boolean value) {
        this.isLandingPageQualityAcceptable = value;
    }

    /**
     * Gets the value of the isLandingPageLatencyAcceptable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLandingPageLatencyAcceptable() {
        return isLandingPageLatencyAcceptable;
    }

    /**
     * Sets the value of the isLandingPageLatencyAcceptable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLandingPageLatencyAcceptable(Boolean value) {
        this.isLandingPageLatencyAcceptable = value;
    }

    /**
     * Gets the value of the qualityScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQualityScore() {
        return qualityScore;
    }

    /**
     * Sets the value of the qualityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQualityScore(Integer value) {
        this.qualityScore = value;
    }

}
