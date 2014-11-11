
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents operating system versions that are being targeted or excluded by the {@link LineItem}.
 *           
 * 
 * <p>Java class for OperatingSystemVersionTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemVersionTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedOperatingSystemVersions" type="{https://www.google.com/apis/ads/publisher/v201411}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludedOperatingSystemVersions" type="{https://www.google.com/apis/ads/publisher/v201411}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemVersionTargeting", propOrder = {
    "targetedOperatingSystemVersions",
    "excludedOperatingSystemVersions"
})
public class OperatingSystemVersionTargeting {

    protected List<Technology> targetedOperatingSystemVersions;
    protected List<Technology> excludedOperatingSystemVersions;

    /**
     * Gets the value of the targetedOperatingSystemVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedOperatingSystemVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedOperatingSystemVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getTargetedOperatingSystemVersions() {
        if (targetedOperatingSystemVersions == null) {
            targetedOperatingSystemVersions = new ArrayList<Technology>();
        }
        return this.targetedOperatingSystemVersions;
    }

    /**
     * Gets the value of the excludedOperatingSystemVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedOperatingSystemVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedOperatingSystemVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getExcludedOperatingSystemVersions() {
        if (excludedOperatingSystemVersions == null) {
            excludedOperatingSystemVersions = new ArrayList<Technology>();
        }
        return this.excludedOperatingSystemVersions;
    }

}
