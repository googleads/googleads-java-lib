
package com.google.api.ads.dfp.jaxws.v201311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents device capabilities that are being targeted or excluded by the {@link LineItem}.
 *           
 * 
 * <p>Java class for DeviceCapabilityTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCapabilityTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedDeviceCapabilities" type="{https://www.google.com/apis/ads/publisher/v201311}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludedDeviceCapabilities" type="{https://www.google.com/apis/ads/publisher/v201311}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCapabilityTargeting", propOrder = {
    "targetedDeviceCapabilities",
    "excludedDeviceCapabilities"
})
public class DeviceCapabilityTargeting {

    protected List<Technology> targetedDeviceCapabilities;
    protected List<Technology> excludedDeviceCapabilities;

    /**
     * Gets the value of the targetedDeviceCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedDeviceCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedDeviceCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getTargetedDeviceCapabilities() {
        if (targetedDeviceCapabilities == null) {
            targetedDeviceCapabilities = new ArrayList<Technology>();
        }
        return this.targetedDeviceCapabilities;
    }

    /**
     * Gets the value of the excludedDeviceCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedDeviceCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedDeviceCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getExcludedDeviceCapabilities() {
        if (excludedDeviceCapabilities == null) {
            excludedDeviceCapabilities = new ArrayList<Technology>();
        }
        return this.excludedDeviceCapabilities;
    }

}
