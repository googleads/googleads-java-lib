
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Marker interface for enums that represent sortable fields.
 *           
 * 
 * <p>Java class for Sortable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sortable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="StatsSortable" type="{https://adwords.google.com/api/adwords/video/v201402}StatsSortable"/>
 *         &lt;element name="TargetingGroupSortable" type="{https://adwords.google.com/api/adwords/video/v201402}TargetingGroupSortable"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sortable", propOrder = {
    "statsSortable",
    "targetingGroupSortable"
})
public class Sortable {

    @XmlElement(name = "StatsSortable")
    protected StatsSortable statsSortable;
    @XmlElement(name = "TargetingGroupSortable")
    protected TargetingGroupSortable targetingGroupSortable;

    /**
     * Gets the value of the statsSortable property.
     * 
     * @return
     *     possible object is
     *     {@link StatsSortable }
     *     
     */
    public StatsSortable getStatsSortable() {
        return statsSortable;
    }

    /**
     * Sets the value of the statsSortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsSortable }
     *     
     */
    public void setStatsSortable(StatsSortable value) {
        this.statsSortable = value;
    }

    /**
     * Gets the value of the targetingGroupSortable property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupSortable }
     *     
     */
    public TargetingGroupSortable getTargetingGroupSortable() {
        return targetingGroupSortable;
    }

    /**
     * Sets the value of the targetingGroupSortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupSortable }
     *     
     */
    public void setTargetingGroupSortable(TargetingGroupSortable value) {
        this.targetingGroupSortable = value;
    }

}
