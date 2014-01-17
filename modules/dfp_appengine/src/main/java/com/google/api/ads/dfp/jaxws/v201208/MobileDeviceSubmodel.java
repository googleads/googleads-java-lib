
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a mobile device submodel.
 *           
 * 
 * <p>Java class for MobileDeviceSubmodel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceSubmodel">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}Technology">
 *       &lt;sequence>
 *         &lt;element name="mobileDeviceCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deviceManufacturerCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceSubmodel", propOrder = {
    "mobileDeviceCriterionId",
    "deviceManufacturerCriterionId"
})
public class MobileDeviceSubmodel
    extends Technology
{

    protected Long mobileDeviceCriterionId;
    protected Long deviceManufacturerCriterionId;

    /**
     * Gets the value of the mobileDeviceCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileDeviceCriterionId() {
        return mobileDeviceCriterionId;
    }

    /**
     * Sets the value of the mobileDeviceCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileDeviceCriterionId(Long value) {
        this.mobileDeviceCriterionId = value;
    }

    /**
     * Gets the value of the deviceManufacturerCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceManufacturerCriterionId() {
        return deviceManufacturerCriterionId;
    }

    /**
     * Sets the value of the deviceManufacturerCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceManufacturerCriterionId(Long value) {
        this.deviceManufacturerCriterionId = value;
    }

}
