
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a Mobile Device Criterion.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type is only targetable.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *             <span class="constraint Beta">This is a beta feature.</span>
 *           
 * 
 * <p>Java class for MobileDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Criterion">
 *       &lt;sequence>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{https://adwords.google.com/api/adwords/cm/v201306}MobileDevice.DeviceType" minOccurs="0"/>
 *         &lt;element name="operatingSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDevice", propOrder = {
    "deviceName",
    "manufacturerName",
    "deviceType",
    "operatingSystemName"
})
public class MobileDevice
    extends Criterion
{

    protected String deviceName;
    protected String manufacturerName;
    protected MobileDeviceDeviceType deviceType;
    protected String operatingSystemName;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceDeviceType }
     *     
     */
    public MobileDeviceDeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceDeviceType }
     *     
     */
    public void setDeviceType(MobileDeviceDeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the operatingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    /**
     * Sets the value of the operatingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystemName(String value) {
        this.operatingSystemName = value;
    }

}
