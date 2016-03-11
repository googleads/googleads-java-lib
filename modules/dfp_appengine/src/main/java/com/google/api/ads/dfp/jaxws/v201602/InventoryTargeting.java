
package com.google.api.ads.dfp.jaxws.v201602;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A collection of targeted and excluded ad units and placements.
 *           
 * 
 * <p>Java class for InventoryTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedAdUnits" type="{https://www.google.com/apis/ads/publisher/v201602}AdUnitTargeting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludedAdUnits" type="{https://www.google.com/apis/ads/publisher/v201602}AdUnitTargeting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetedPlacementIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryTargeting", propOrder = {
    "targetedAdUnits",
    "excludedAdUnits",
    "targetedPlacementIds"
})
public class InventoryTargeting {

    protected List<AdUnitTargeting> targetedAdUnits;
    protected List<AdUnitTargeting> excludedAdUnits;
    @XmlElement(type = Long.class)
    protected List<Long> targetedPlacementIds;

    /**
     * Gets the value of the targetedAdUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedAdUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedAdUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitTargeting }
     * 
     * 
     */
    public List<AdUnitTargeting> getTargetedAdUnits() {
        if (targetedAdUnits == null) {
            targetedAdUnits = new ArrayList<AdUnitTargeting>();
        }
        return this.targetedAdUnits;
    }

    /**
     * Gets the value of the excludedAdUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedAdUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedAdUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnitTargeting }
     * 
     * 
     */
    public List<AdUnitTargeting> getExcludedAdUnits() {
        if (excludedAdUnits == null) {
            excludedAdUnits = new ArrayList<AdUnitTargeting>();
        }
        return this.excludedAdUnits;
    }

    /**
     * Gets the value of the targetedPlacementIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedPlacementIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedPlacementIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTargetedPlacementIds() {
        if (targetedPlacementIds == null) {
            targetedPlacementIds = new ArrayList<Long>();
        }
        return this.targetedPlacementIds;
    }

}
