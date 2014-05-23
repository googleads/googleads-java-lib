
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents one value in a dimension for a segmented entity (e.g. one country in the dimension
 *             Geo for a campaign segmented by Geo).
 *           
 * 
 * <p>Java class for SegmentKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CampaignKey" type="{https://adwords.google.com/api/adwords/video/v201402}CampaignKey"/>
 *         &lt;element name="ConversionTypeKey" type="{https://adwords.google.com/api/adwords/video/v201402}ConversionTypeKey"/>
 *         &lt;element name="DateKey" type="{https://adwords.google.com/api/adwords/video/v201402}DateKey"/>
 *         &lt;element name="DayOfWeekKey" type="{https://adwords.google.com/api/adwords/video/v201402}DayOfWeekKey"/>
 *         &lt;element name="DeviceKey" type="{https://adwords.google.com/api/adwords/video/v201402}DeviceKey"/>
 *         &lt;element name="DisplayFormatKey" type="{https://adwords.google.com/api/adwords/video/v201402}DisplayFormatKey"/>
 *         &lt;element name="DisplayFormatNetworkKey" type="{https://adwords.google.com/api/adwords/video/v201402}DisplayFormatNetworkKey"/>
 *         &lt;element name="DisplayFormatTypeKey" type="{https://adwords.google.com/api/adwords/video/v201402}DisplayFormatTypeKey"/>
 *         &lt;element name="HourOfDayKey" type="{https://adwords.google.com/api/adwords/video/v201402}HourOfDayKey"/>
 *         &lt;element name="NetworkKey" type="{https://adwords.google.com/api/adwords/video/v201402}NetworkKey"/>
 *         &lt;element name="PaidViewsKey" type="{https://adwords.google.com/api/adwords/video/v201402}PaidViewsKey"/>
 *         &lt;element name="TargetingGroupKey" type="{https://adwords.google.com/api/adwords/video/v201402}TargetingGroupKey"/>
 *         &lt;element name="VideoAdKey" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdKey"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentKey", propOrder = {
    "campaignKey",
    "conversionTypeKey",
    "dateKey",
    "dayOfWeekKey",
    "deviceKey",
    "displayFormatKey",
    "displayFormatNetworkKey",
    "displayFormatTypeKey",
    "hourOfDayKey",
    "networkKey",
    "paidViewsKey",
    "targetingGroupKey",
    "videoAdKey"
})
public class SegmentKey {

    @XmlElement(name = "CampaignKey")
    protected CampaignKey campaignKey;
    @XmlElement(name = "ConversionTypeKey")
    protected ConversionTypeKey conversionTypeKey;
    @XmlElement(name = "DateKey")
    protected DateKey dateKey;
    @XmlElement(name = "DayOfWeekKey")
    protected DayOfWeekKey dayOfWeekKey;
    @XmlElement(name = "DeviceKey")
    protected DeviceKey deviceKey;
    @XmlElement(name = "DisplayFormatKey")
    protected DisplayFormatKey displayFormatKey;
    @XmlElement(name = "DisplayFormatNetworkKey")
    protected DisplayFormatNetworkKey displayFormatNetworkKey;
    @XmlElement(name = "DisplayFormatTypeKey")
    protected DisplayFormatTypeKey displayFormatTypeKey;
    @XmlElement(name = "HourOfDayKey")
    protected HourOfDayKey hourOfDayKey;
    @XmlElement(name = "NetworkKey")
    protected NetworkKey networkKey;
    @XmlElement(name = "PaidViewsKey")
    protected PaidViewsKey paidViewsKey;
    @XmlElement(name = "TargetingGroupKey")
    protected TargetingGroupKey targetingGroupKey;
    @XmlElement(name = "VideoAdKey")
    protected VideoAdKey videoAdKey;

    /**
     * Gets the value of the campaignKey property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignKey }
     *     
     */
    public CampaignKey getCampaignKey() {
        return campaignKey;
    }

    /**
     * Sets the value of the campaignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignKey }
     *     
     */
    public void setCampaignKey(CampaignKey value) {
        this.campaignKey = value;
    }

    /**
     * Gets the value of the conversionTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTypeKey }
     *     
     */
    public ConversionTypeKey getConversionTypeKey() {
        return conversionTypeKey;
    }

    /**
     * Sets the value of the conversionTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTypeKey }
     *     
     */
    public void setConversionTypeKey(ConversionTypeKey value) {
        this.conversionTypeKey = value;
    }

    /**
     * Gets the value of the dateKey property.
     * 
     * @return
     *     possible object is
     *     {@link DateKey }
     *     
     */
    public DateKey getDateKey() {
        return dateKey;
    }

    /**
     * Sets the value of the dateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateKey }
     *     
     */
    public void setDateKey(DateKey value) {
        this.dateKey = value;
    }

    /**
     * Gets the value of the dayOfWeekKey property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekKey }
     *     
     */
    public DayOfWeekKey getDayOfWeekKey() {
        return dayOfWeekKey;
    }

    /**
     * Sets the value of the dayOfWeekKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekKey }
     *     
     */
    public void setDayOfWeekKey(DayOfWeekKey value) {
        this.dayOfWeekKey = value;
    }

    /**
     * Gets the value of the deviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceKey }
     *     
     */
    public DeviceKey getDeviceKey() {
        return deviceKey;
    }

    /**
     * Sets the value of the deviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceKey }
     *     
     */
    public void setDeviceKey(DeviceKey value) {
        this.deviceKey = value;
    }

    /**
     * Gets the value of the displayFormatKey property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayFormatKey }
     *     
     */
    public DisplayFormatKey getDisplayFormatKey() {
        return displayFormatKey;
    }

    /**
     * Sets the value of the displayFormatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayFormatKey }
     *     
     */
    public void setDisplayFormatKey(DisplayFormatKey value) {
        this.displayFormatKey = value;
    }

    /**
     * Gets the value of the displayFormatNetworkKey property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayFormatNetworkKey }
     *     
     */
    public DisplayFormatNetworkKey getDisplayFormatNetworkKey() {
        return displayFormatNetworkKey;
    }

    /**
     * Sets the value of the displayFormatNetworkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayFormatNetworkKey }
     *     
     */
    public void setDisplayFormatNetworkKey(DisplayFormatNetworkKey value) {
        this.displayFormatNetworkKey = value;
    }

    /**
     * Gets the value of the displayFormatTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayFormatTypeKey }
     *     
     */
    public DisplayFormatTypeKey getDisplayFormatTypeKey() {
        return displayFormatTypeKey;
    }

    /**
     * Sets the value of the displayFormatTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayFormatTypeKey }
     *     
     */
    public void setDisplayFormatTypeKey(DisplayFormatTypeKey value) {
        this.displayFormatTypeKey = value;
    }

    /**
     * Gets the value of the hourOfDayKey property.
     * 
     * @return
     *     possible object is
     *     {@link HourOfDayKey }
     *     
     */
    public HourOfDayKey getHourOfDayKey() {
        return hourOfDayKey;
    }

    /**
     * Sets the value of the hourOfDayKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link HourOfDayKey }
     *     
     */
    public void setHourOfDayKey(HourOfDayKey value) {
        this.hourOfDayKey = value;
    }

    /**
     * Gets the value of the networkKey property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkKey }
     *     
     */
    public NetworkKey getNetworkKey() {
        return networkKey;
    }

    /**
     * Sets the value of the networkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkKey }
     *     
     */
    public void setNetworkKey(NetworkKey value) {
        this.networkKey = value;
    }

    /**
     * Gets the value of the paidViewsKey property.
     * 
     * @return
     *     possible object is
     *     {@link PaidViewsKey }
     *     
     */
    public PaidViewsKey getPaidViewsKey() {
        return paidViewsKey;
    }

    /**
     * Sets the value of the paidViewsKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidViewsKey }
     *     
     */
    public void setPaidViewsKey(PaidViewsKey value) {
        this.paidViewsKey = value;
    }

    /**
     * Gets the value of the targetingGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupKey }
     *     
     */
    public TargetingGroupKey getTargetingGroupKey() {
        return targetingGroupKey;
    }

    /**
     * Sets the value of the targetingGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupKey }
     *     
     */
    public void setTargetingGroupKey(TargetingGroupKey value) {
        this.targetingGroupKey = value;
    }

    /**
     * Gets the value of the videoAdKey property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdKey }
     *     
     */
    public VideoAdKey getVideoAdKey() {
        return videoAdKey;
    }

    /**
     * Sets the value of the videoAdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdKey }
     *     
     */
    public void setVideoAdKey(VideoAdKey value) {
        this.videoAdKey = value;
    }

}
