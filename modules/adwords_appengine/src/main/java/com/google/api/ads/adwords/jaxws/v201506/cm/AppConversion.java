
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A ConversionTracker for mobile apps.
 *           
 * 
 * <p>Java class for AppConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppConversion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}ConversionTracker">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appPlatform" type="{https://adwords.google.com/api/adwords/cm/v201506}AppConversion.AppPlatform" minOccurs="0"/>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appConversionType" type="{https://adwords.google.com/api/adwords/cm/v201506}AppConversion.AppConversionType" minOccurs="0"/>
 *         &lt;element name="appPostbackUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppConversion", propOrder = {
    "appId",
    "appPlatform",
    "snippet",
    "appConversionType",
    "appPostbackUrl"
})
public class AppConversion
    extends ConversionTracker
{

    protected String appId;
    protected AppConversionAppPlatform appPlatform;
    protected String snippet;
    protected AppConversionAppConversionType appConversionType;
    protected String appPostbackUrl;

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link AppConversionAppPlatform }
     *     
     */
    public AppConversionAppPlatform getAppPlatform() {
        return appPlatform;
    }

    /**
     * Sets the value of the appPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppConversionAppPlatform }
     *     
     */
    public void setAppPlatform(AppConversionAppPlatform value) {
        this.appPlatform = value;
    }

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
     * Gets the value of the appConversionType property.
     * 
     * @return
     *     possible object is
     *     {@link AppConversionAppConversionType }
     *     
     */
    public AppConversionAppConversionType getAppConversionType() {
        return appConversionType;
    }

    /**
     * Sets the value of the appConversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppConversionAppConversionType }
     *     
     */
    public void setAppConversionType(AppConversionAppConversionType value) {
        this.appConversionType = value;
    }

    /**
     * Gets the value of the appPostbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPostbackUrl() {
        return appPostbackUrl;
    }

    /**
     * Sets the value of the appPostbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPostbackUrl(String value) {
        this.appPostbackUrl = value;
    }

}
