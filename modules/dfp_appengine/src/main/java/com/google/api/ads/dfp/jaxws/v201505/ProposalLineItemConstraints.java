
package com.google.api.ads.dfp.jaxws.v201505;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code PropoalLineItemConstraints} represents all the constraints set for a
 *             {@link ProposalLineItem} and is always readonly. It comes from the {@link Product},
 *             based on which the proposal line item is created.
 *           
 * 
 * <p>Java class for ProposalLineItemConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowFrequencyCapsCustomization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="builtInFrequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201505}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="builtInTargeting" type="{https://www.google.com/apis/ads/publisher/v201505}ProductTemplateTargeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemConstraints", propOrder = {
    "allowFrequencyCapsCustomization",
    "builtInFrequencyCaps",
    "builtInTargeting"
})
public class ProposalLineItemConstraints {

    protected Boolean allowFrequencyCapsCustomization;
    protected List<FrequencyCap> builtInFrequencyCaps;
    protected ProductTemplateTargeting builtInTargeting;

    /**
     * Gets the value of the allowFrequencyCapsCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowFrequencyCapsCustomization() {
        return allowFrequencyCapsCustomization;
    }

    /**
     * Sets the value of the allowFrequencyCapsCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowFrequencyCapsCustomization(Boolean value) {
        this.allowFrequencyCapsCustomization = value;
    }

    /**
     * Gets the value of the builtInFrequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInFrequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyCap }
     * 
     * 
     */
    public List<FrequencyCap> getBuiltInFrequencyCaps() {
        if (builtInFrequencyCaps == null) {
            builtInFrequencyCaps = new ArrayList<FrequencyCap>();
        }
        return this.builtInFrequencyCaps;
    }

    /**
     * Gets the value of the builtInTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTemplateTargeting }
     *     
     */
    public ProductTemplateTargeting getBuiltInTargeting() {
        return builtInTargeting;
    }

    /**
     * Sets the value of the builtInTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTemplateTargeting }
     *     
     */
    public void setBuiltInTargeting(ProductTemplateTargeting value) {
        this.builtInTargeting = value;
    }

}
