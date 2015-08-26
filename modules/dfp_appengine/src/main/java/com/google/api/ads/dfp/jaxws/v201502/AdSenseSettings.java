
package com.google.api.ads.dfp.jaxws.v201502;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains the AdSense configuration for an {@link AdUnit}.
 *           
 * 
 * <p>Java class for AdSenseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSenseSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adSenseEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adType" type="{https://www.google.com/apis/ads/publisher/v201502}AdSenseSettings.AdType" minOccurs="0"/>
 *         &lt;element name="borderStyle" type="{https://www.google.com/apis/ads/publisher/v201502}AdSenseSettings.BorderStyle" minOccurs="0"/>
 *         &lt;element name="fontFamily" type="{https://www.google.com/apis/ads/publisher/v201502}AdSenseSettings.FontFamily" minOccurs="0"/>
 *         &lt;element name="fontSize" type="{https://www.google.com/apis/ads/publisher/v201502}AdSenseSettings.FontSize" minOccurs="0"/>
 *         &lt;element name="afcFormats" type="{https://www.google.com/apis/ads/publisher/v201502}Size_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSenseSettings", propOrder = {
    "adSenseEnabled",
    "borderColor",
    "titleColor",
    "backgroundColor",
    "textColor",
    "urlColor",
    "adType",
    "borderStyle",
    "fontFamily",
    "fontSize",
    "afcFormats"
})
public class AdSenseSettings {

    protected Boolean adSenseEnabled;
    protected String borderColor;
    protected String titleColor;
    protected String backgroundColor;
    protected String textColor;
    protected String urlColor;
    @XmlSchemaType(name = "string")
    protected AdSenseSettingsAdType adType;
    @XmlSchemaType(name = "string")
    protected AdSenseSettingsBorderStyle borderStyle;
    @XmlSchemaType(name = "string")
    protected AdSenseSettingsFontFamily fontFamily;
    @XmlSchemaType(name = "string")
    protected AdSenseSettingsFontSize fontSize;
    protected List<SizeStringMapEntry> afcFormats;

    /**
     * Gets the value of the adSenseEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdSenseEnabled() {
        return adSenseEnabled;
    }

    /**
     * Sets the value of the adSenseEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdSenseEnabled(Boolean value) {
        this.adSenseEnabled = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the titleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * Sets the value of the titleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleColor(String value) {
        this.titleColor = value;
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
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the urlColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlColor() {
        return urlColor;
    }

    /**
     * Sets the value of the urlColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlColor(String value) {
        this.urlColor = value;
    }

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseSettingsAdType }
     *     
     */
    public AdSenseSettingsAdType getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseSettingsAdType }
     *     
     */
    public void setAdType(AdSenseSettingsAdType value) {
        this.adType = value;
    }

    /**
     * Gets the value of the borderStyle property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseSettingsBorderStyle }
     *     
     */
    public AdSenseSettingsBorderStyle getBorderStyle() {
        return borderStyle;
    }

    /**
     * Sets the value of the borderStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseSettingsBorderStyle }
     *     
     */
    public void setBorderStyle(AdSenseSettingsBorderStyle value) {
        this.borderStyle = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseSettingsFontFamily }
     *     
     */
    public AdSenseSettingsFontFamily getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseSettingsFontFamily }
     *     
     */
    public void setFontFamily(AdSenseSettingsFontFamily value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseSettingsFontSize }
     *     
     */
    public AdSenseSettingsFontSize getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseSettingsFontSize }
     *     
     */
    public void setFontSize(AdSenseSettingsFontSize value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the afcFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afcFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfcFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SizeStringMapEntry }
     * 
     * 
     */
    public List<SizeStringMapEntry> getAfcFormats() {
        if (afcFormats == null) {
            afcFormats = new ArrayList<SizeStringMapEntry>();
        }
        return this.afcFormats;
    }

}
