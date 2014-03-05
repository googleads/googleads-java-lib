
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             <p>This extension is useful for advertisers who wish to provide users with a
 *             link that points to the advertiser's mobile application in addition to their
 *             website.
 *             
 *             <p>It is also known as Mobile App Extension.
 *             
 *             <p>The API allows one InAppLinkExtension per {@code AppStore} per campaign.
 *             Only the extension for a given {@code AppStore} will render on the device
 *             relevant to that {@code AppStore} (e.g. iPhones for {@code AppStore.ITUNES}
 *             and Android phones for {@code AppStore.GOOGLE_PLAY}).
 *             <span class="constraint Beta">This is a beta feature.</span>
 *           
 * 
 * <p>Java class for InAppLinkExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InAppLinkExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="inAppLinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inAppLinkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appStore" type="{https://adwords.google.com/api/adwords/cm/v201306}InAppLinkExtension.AppStore" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InAppLinkExtension", propOrder = {
    "inAppLinkText",
    "inAppLinkUrl",
    "appStore",
    "appId"
})
public class InAppLinkExtension
    extends AdExtension
{

    protected String inAppLinkText;
    protected String inAppLinkUrl;
    protected InAppLinkExtensionAppStore appStore;
    protected String appId;

    /**
     * Gets the value of the inAppLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAppLinkText() {
        return inAppLinkText;
    }

    /**
     * Sets the value of the inAppLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAppLinkText(String value) {
        this.inAppLinkText = value;
    }

    /**
     * Gets the value of the inAppLinkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAppLinkUrl() {
        return inAppLinkUrl;
    }

    /**
     * Sets the value of the inAppLinkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAppLinkUrl(String value) {
        this.inAppLinkUrl = value;
    }

    /**
     * Gets the value of the appStore property.
     * 
     * @return
     *     possible object is
     *     {@link InAppLinkExtensionAppStore }
     *     
     */
    public InAppLinkExtensionAppStore getAppStore() {
        return appStore;
    }

    /**
     * Sets the value of the appStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link InAppLinkExtensionAppStore }
     *     
     */
    public void setAppStore(InAppLinkExtensionAppStore value) {
        this.appStore = value;
    }

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

}
