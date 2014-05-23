
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a youtube channel to be targeted. A youtube channel
 *             will match any playback of a video of that youtube channel.
 *             
 *             To target a channel, you create a channel with
 *             - either the userId (which is the ugly id in the standard channel url
 *             youtube.com/channel/[userId]
 *             - or the userName (which is the
 *             part of the url you see in a vanity url like youtube.com/user/[userName]
 *             
 *             To display to an end user, publicName should be used.
 *           
 * 
 * <p>Java class for Channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Channel">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201402}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", propOrder = {
    "userName",
    "userId",
    "publicName"
})
public class Channel
    extends BaseCriterion
{

    protected String userName;
    protected String userId;
    protected String publicName;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the publicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * Sets the value of the publicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicName(String value) {
        this.publicName = value;
    }

}
