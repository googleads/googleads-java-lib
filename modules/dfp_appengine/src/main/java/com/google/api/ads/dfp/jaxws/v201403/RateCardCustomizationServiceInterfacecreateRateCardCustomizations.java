
package com.google.api.ads.dfp.jaxws.v201403;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a list of new {@link RateCardCustomization} objects.
 *             
 *             @param rateCardCustomizations the rate card customizations to be created
 *             @return the rate card customizations with their IDs filled in
 *           
 * 
 * <p>Java class for createRateCardCustomizations element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createRateCardCustomizations">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCardCustomizations" type="{https://www.google.com/apis/ads/publisher/v201403}RateCardCustomization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rateCardCustomizations"
})
@XmlRootElement(name = "createRateCardCustomizations")
public class RateCardCustomizationServiceInterfacecreateRateCardCustomizations {

    protected List<RateCardCustomization> rateCardCustomizations;

    /**
     * Gets the value of the rateCardCustomizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCardCustomizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCardCustomizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateCardCustomization }
     * 
     * 
     */
    public List<RateCardCustomization> getRateCardCustomizations() {
        if (rateCardCustomizations == null) {
            rateCardCustomizations = new ArrayList<RateCardCustomization>();
        }
        return this.rateCardCustomizations;
    }

}
