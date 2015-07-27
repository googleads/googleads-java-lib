
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains base extension feed item data for an extension in an extension feed managed by AdWords.
 *           
 * 
 * <p>Java class for ExtensionFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionFeedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feedItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201502}FeedItem.Status" minOccurs="0"/>
 *         &lt;element name="feedType" type="{https://adwords.google.com/api/adwords/cm/v201502}Feed.Type" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devicePreference" type="{https://adwords.google.com/api/adwords/cm/v201502}FeedItemDevicePreference" minOccurs="0"/>
 *         &lt;element name="scheduling" type="{https://adwords.google.com/api/adwords/cm/v201502}FeedItemScheduling" minOccurs="0"/>
 *         &lt;element name="ExtensionFeedItem.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionFeedItem", propOrder = {
    "feedId",
    "feedItemId",
    "status",
    "feedType",
    "startTime",
    "endTime",
    "devicePreference",
    "scheduling",
    "extensionFeedItemType"
})
@XmlSeeAlso({
    CallFeedItem.class,
    SitelinkFeedItem.class,
    ReviewFeedItem.class,
    CalloutFeedItem.class,
    AppFeedItem.class
})
public class ExtensionFeedItem {

    protected Long feedId;
    protected Long feedItemId;
    @XmlSchemaType(name = "string")
    protected FeedItemStatus status;
    @XmlSchemaType(name = "string")
    protected FeedType feedType;
    protected String startTime;
    protected String endTime;
    protected FeedItemDevicePreference devicePreference;
    protected FeedItemScheduling scheduling;
    @XmlElement(name = "ExtensionFeedItem.Type")
    protected String extensionFeedItemType;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the feedItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedItemId() {
        return feedItemId;
    }

    /**
     * Sets the value of the feedItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedItemId(Long value) {
        this.feedItemId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemStatus }
     *     
     */
    public FeedItemStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemStatus }
     *     
     */
    public void setStatus(FeedItemStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the feedType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedType }
     *     
     */
    public FeedType getFeedType() {
        return feedType;
    }

    /**
     * Sets the value of the feedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedType }
     *     
     */
    public void setFeedType(FeedType value) {
        this.feedType = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the devicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemDevicePreference }
     *     
     */
    public FeedItemDevicePreference getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the value of the devicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemDevicePreference }
     *     
     */
    public void setDevicePreference(FeedItemDevicePreference value) {
        this.devicePreference = value;
    }

    /**
     * Gets the value of the scheduling property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemScheduling }
     *     
     */
    public FeedItemScheduling getScheduling() {
        return scheduling;
    }

    /**
     * Sets the value of the scheduling property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemScheduling }
     *     
     */
    public void setScheduling(FeedItemScheduling value) {
        this.scheduling = value;
    }

    /**
     * Gets the value of the extensionFeedItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionFeedItemType() {
        return extensionFeedItemType;
    }

    /**
     * Sets the value of the extensionFeedItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionFeedItemType(String value) {
        this.extensionFeedItemType = value;
    }

}
