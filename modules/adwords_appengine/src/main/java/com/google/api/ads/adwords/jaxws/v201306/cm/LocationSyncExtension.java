
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Local business center(LBC) sync extension that ties a LBC account with a campaign.
 *           
 * 
 * <p>Java class for LocationSyncExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSyncExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oAuthInfo" type="{https://adwords.google.com/api/adwords/cm/v201306}OAuthInfo" minOccurs="0"/>
 *         &lt;element name="iconMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shouldSyncUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSyncExtension", propOrder = {
    "email",
    "authToken",
    "oAuthInfo",
    "iconMediaId",
    "shouldSyncUrl"
})
public class LocationSyncExtension
    extends AdExtension
{

    protected String email;
    protected String authToken;
    protected OAuthInfo oAuthInfo;
    protected Long iconMediaId;
    protected Boolean shouldSyncUrl;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the oAuthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OAuthInfo }
     *     
     */
    public OAuthInfo getOAuthInfo() {
        return oAuthInfo;
    }

    /**
     * Sets the value of the oAuthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAuthInfo }
     *     
     */
    public void setOAuthInfo(OAuthInfo value) {
        this.oAuthInfo = value;
    }

    /**
     * Gets the value of the iconMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIconMediaId() {
        return iconMediaId;
    }

    /**
     * Sets the value of the iconMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIconMediaId(Long value) {
        this.iconMediaId = value;
    }

    /**
     * Gets the value of the shouldSyncUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldSyncUrl() {
        return shouldSyncUrl;
    }

    /**
     * Sets the value of the shouldSyncUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShouldSyncUrl(Boolean value) {
        this.shouldSyncUrl = value;
    }

}
