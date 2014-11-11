
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that contains an arbitrary HTML snippet and file assets.
 *           
 * 
 * <p>Java class for CustomCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="htmlSnippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customCreativeAssets" type="{https://www.google.com/apis/ads/publisher/v201411}CustomCreativeAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isInterstitial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201411}LockedOrientation" minOccurs="0"/>
 *         &lt;element name="sslScanResult" type="{https://www.google.com/apis/ads/publisher/v201411}SslScanResult" minOccurs="0"/>
 *         &lt;element name="sslManualOverride" type="{https://www.google.com/apis/ads/publisher/v201411}SslManualOverride" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomCreative", propOrder = {
    "htmlSnippet",
    "customCreativeAssets",
    "isInterstitial",
    "lockedOrientation",
    "sslScanResult",
    "sslManualOverride"
})
public class CustomCreative
    extends HasDestinationUrlCreative
{

    protected String htmlSnippet;
    protected List<CustomCreativeAsset> customCreativeAssets;
    protected Boolean isInterstitial;
    protected LockedOrientation lockedOrientation;
    protected SslScanResult sslScanResult;
    protected SslManualOverride sslManualOverride;

    /**
     * Gets the value of the htmlSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlSnippet() {
        return htmlSnippet;
    }

    /**
     * Sets the value of the htmlSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlSnippet(String value) {
        this.htmlSnippet = value;
    }

    /**
     * Gets the value of the customCreativeAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customCreativeAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomCreativeAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomCreativeAsset }
     * 
     * 
     */
    public List<CustomCreativeAsset> getCustomCreativeAssets() {
        if (customCreativeAssets == null) {
            customCreativeAssets = new ArrayList<CustomCreativeAsset>();
        }
        return this.customCreativeAssets;
    }

    /**
     * Gets the value of the isInterstitial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterstitial() {
        return isInterstitial;
    }

    /**
     * Sets the value of the isInterstitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterstitial(Boolean value) {
        this.isInterstitial = value;
    }

    /**
     * Gets the value of the lockedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LockedOrientation }
     *     
     */
    public LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }

    /**
     * Sets the value of the lockedOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockedOrientation }
     *     
     */
    public void setLockedOrientation(LockedOrientation value) {
        this.lockedOrientation = value;
    }

    /**
     * Gets the value of the sslScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link SslScanResult }
     *     
     */
    public SslScanResult getSslScanResult() {
        return sslScanResult;
    }

    /**
     * Sets the value of the sslScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslScanResult }
     *     
     */
    public void setSslScanResult(SslScanResult value) {
        this.sslScanResult = value;
    }

    /**
     * Gets the value of the sslManualOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SslManualOverride }
     *     
     */
    public SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }

    /**
     * Sets the value of the sslManualOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslManualOverride }
     *     
     */
    public void setSslManualOverride(SslManualOverride value) {
        this.sslManualOverride = value;
    }

}
