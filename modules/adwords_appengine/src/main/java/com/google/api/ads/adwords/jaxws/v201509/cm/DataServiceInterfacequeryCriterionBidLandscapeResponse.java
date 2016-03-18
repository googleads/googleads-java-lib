
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryCriterionBidLandscapeResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="queryCriterionBidLandscapeResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rval" type="{https://adwords.google.com/api/adwords/cm/v201509}CriterionBidLandscapePage" minOccurs="0"/>
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
    "rval"
})
@XmlRootElement(name = "queryCriterionBidLandscapeResponse")
public class DataServiceInterfacequeryCriterionBidLandscapeResponse {

    protected CriterionBidLandscapePage rval;

    /**
     * Gets the value of the rval property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionBidLandscapePage }
     *     
     */
    public CriterionBidLandscapePage getRval() {
        return rval;
    }

    /**
     * Sets the value of the rval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionBidLandscapePage }
     *     
     */
    public void setRval(CriterionBidLandscapePage value) {
        this.rval = value;
    }

}
