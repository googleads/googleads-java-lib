
package com.google.api.ads.adwords.jaxws.v201306.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Placement request/response object which provides details about display
 *             ad types, options, and other available configuration variables.
 *           
 * 
 * <p>Java class for DisplayAdSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayAdSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayTypes" type="{https://adwords.google.com/api/adwords/o/v201306}DisplayType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activationOptions" type="{https://adwords.google.com/api/adwords/o/v201306}DisplayAdSpec.ActivationOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adSizeSpecs" type="{https://adwords.google.com/api/adwords/o/v201306}DisplayAdSpec.AdSizeSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayAdSpec", propOrder = {
    "displayTypes",
    "activationOptions",
    "adSizeSpecs"
})
public class DisplayAdSpec {

    protected List<DisplayType> displayTypes;
    protected List<DisplayAdSpecActivationOption> activationOptions;
    protected List<DisplayAdSpecAdSizeSpec> adSizeSpecs;

    /**
     * Gets the value of the displayTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayType }
     * 
     * 
     */
    public List<DisplayType> getDisplayTypes() {
        if (displayTypes == null) {
            displayTypes = new ArrayList<DisplayType>();
        }
        return this.displayTypes;
    }

    /**
     * Gets the value of the activationOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayAdSpecActivationOption }
     * 
     * 
     */
    public List<DisplayAdSpecActivationOption> getActivationOptions() {
        if (activationOptions == null) {
            activationOptions = new ArrayList<DisplayAdSpecActivationOption>();
        }
        return this.activationOptions;
    }

    /**
     * Gets the value of the adSizeSpecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adSizeSpecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdSizeSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayAdSpecAdSizeSpec }
     * 
     * 
     */
    public List<DisplayAdSpecAdSizeSpec> getAdSizeSpecs() {
        if (adSizeSpecs == null) {
            adSizeSpecs = new ArrayList<DisplayAdSpecAdSizeSpec>();
        }
        return this.adSizeSpecs;
    }

}
