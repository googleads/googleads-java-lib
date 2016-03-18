
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Encapsulation of data describing a distributor network that has shared an ad unit with a
 *             content provider network.
 *           
 * 
 * <p>Java class for CrossSellingDistributor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossSellingDistributor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossSellingDistributor", propOrder = {
    "networkName"
})
public class CrossSellingDistributor {

    protected String networkName;

    /**
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
    }

}
