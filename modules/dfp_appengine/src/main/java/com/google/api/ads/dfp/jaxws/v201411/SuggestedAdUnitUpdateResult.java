
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the result of performing an action on {@link SuggestedAdUnit} objects.
 *           
 * 
 * <p>Java class for SuggestedAdUnitUpdateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedAdUnitUpdateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newAdUnitIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numChanges" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestedAdUnitUpdateResult", propOrder = {
    "newAdUnitIds",
    "numChanges"
})
public class SuggestedAdUnitUpdateResult {

    protected List<String> newAdUnitIds;
    protected Integer numChanges;

    /**
     * Gets the value of the newAdUnitIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newAdUnitIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewAdUnitIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNewAdUnitIds() {
        if (newAdUnitIds == null) {
            newAdUnitIds = new ArrayList<String>();
        }
        return this.newAdUnitIds;
    }

    /**
     * Gets the value of the numChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumChanges() {
        return numChanges;
    }

    /**
     * Sets the value of the numChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumChanges(Integer value) {
        this.numChanges = value;
    }

}
