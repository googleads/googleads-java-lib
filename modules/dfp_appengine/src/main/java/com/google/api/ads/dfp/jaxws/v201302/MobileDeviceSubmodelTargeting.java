
package com.google.api.ads.dfp.jaxws.v201302;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents mobile devices that are being targeted or excluded by the {@link LineItem}.
 *           
 * 
 * <p>Java class for MobileDeviceSubmodelTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceSubmodelTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedMobileDeviceSubmodels" type="{https://www.google.com/apis/ads/publisher/v201302}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludedMobileDeviceSubmodels" type="{https://www.google.com/apis/ads/publisher/v201302}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceSubmodelTargeting", propOrder = {
    "targetedMobileDeviceSubmodels",
    "excludedMobileDeviceSubmodels"
})
public class MobileDeviceSubmodelTargeting {

    protected List<Technology> targetedMobileDeviceSubmodels;
    protected List<Technology> excludedMobileDeviceSubmodels;

    /**
     * Gets the value of the targetedMobileDeviceSubmodels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedMobileDeviceSubmodels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedMobileDeviceSubmodels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getTargetedMobileDeviceSubmodels() {
        if (targetedMobileDeviceSubmodels == null) {
            targetedMobileDeviceSubmodels = new ArrayList<Technology>();
        }
        return this.targetedMobileDeviceSubmodels;
    }

    /**
     * Gets the value of the excludedMobileDeviceSubmodels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedMobileDeviceSubmodels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedMobileDeviceSubmodels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getExcludedMobileDeviceSubmodels() {
        if (excludedMobileDeviceSubmodels == null) {
            excludedMobileDeviceSubmodels = new ArrayList<Technology>();
        }
        return this.excludedMobileDeviceSubmodels;
    }

}
