
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adUnits" type="{https://www.google.com/apis/ads/publisher/v201408}AdUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adUnits"
})
@XmlRootElement(name = "createAdUnits")
public class CreateAdUnits {

    protected List<AdUnit> adUnits;

    /**
     * Gets the value of the adUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdUnit }
     * 
     * 
     */
    public List<AdUnit> getAdUnits() {
        if (adUnits == null) {
            adUnits = new ArrayList<AdUnit>();
        }
        return this.adUnits;
    }

}
