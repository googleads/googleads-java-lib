
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A conversion tracker created through AdWords Conversion Tracking.
 *           
 * 
 * <p>Java class for AdWordsConversionTracker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdWordsConversionTracker">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markupLanguage" type="{https://adwords.google.com/api/adwords/cm/v201409}AdWordsConversionTracker.MarkupLanguage" minOccurs="0"/>
 *         &lt;element name="textFormat" type="{https://adwords.google.com/api/adwords/cm/v201409}AdWordsConversionTracker.TextFormat" minOccurs="0"/>
 *         &lt;element name="conversionPageLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingCodeType" type="{https://adwords.google.com/api/adwords/cm/v201409}AdWordsConversionTracker.TrackingCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdWordsConversionTracker", propOrder = {
    "snippet",
    "markupLanguage",
    "textFormat",
    "conversionPageLanguage",
    "backgroundColor",
    "trackingCodeType"
})
public class AdWordsConversionTracker
    extends ConversionTracker
{

    protected String snippet;
    protected AdWordsConversionTrackerMarkupLanguage markupLanguage;
    protected AdWordsConversionTrackerTextFormat textFormat;
    protected String conversionPageLanguage;
    protected String backgroundColor;
    protected AdWordsConversionTrackerTrackingCodeType trackingCodeType;

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippet(String value) {
        this.snippet = value;
    }

    /**
     * Gets the value of the markupLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link AdWordsConversionTrackerMarkupLanguage }
     *     
     */
    public AdWordsConversionTrackerMarkupLanguage getMarkupLanguage() {
        return markupLanguage;
    }

    /**
     * Sets the value of the markupLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdWordsConversionTrackerMarkupLanguage }
     *     
     */
    public void setMarkupLanguage(AdWordsConversionTrackerMarkupLanguage value) {
        this.markupLanguage = value;
    }

    /**
     * Gets the value of the textFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AdWordsConversionTrackerTextFormat }
     *     
     */
    public AdWordsConversionTrackerTextFormat getTextFormat() {
        return textFormat;
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdWordsConversionTrackerTextFormat }
     *     
     */
    public void setTextFormat(AdWordsConversionTrackerTextFormat value) {
        this.textFormat = value;
    }

    /**
     * Gets the value of the conversionPageLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionPageLanguage() {
        return conversionPageLanguage;
    }

    /**
     * Sets the value of the conversionPageLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionPageLanguage(String value) {
        this.conversionPageLanguage = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the trackingCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link AdWordsConversionTrackerTrackingCodeType }
     *     
     */
    public AdWordsConversionTrackerTrackingCodeType getTrackingCodeType() {
        return trackingCodeType;
    }

    /**
     * Sets the value of the trackingCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdWordsConversionTrackerTrackingCodeType }
     *     
     */
    public void setTrackingCodeType(AdWordsConversionTrackerTrackingCodeType value) {
        this.trackingCodeType = value;
    }

}
