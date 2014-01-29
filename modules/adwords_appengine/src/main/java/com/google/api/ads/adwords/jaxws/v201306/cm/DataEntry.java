
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The base class of all return types of the table service.
 *           
 * 
 * <p>Java class for DataEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataEntry.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataEntry", propOrder = {
    "dataEntryType"
})
@XmlSeeAlso({
    BidLandscape.class
})
public abstract class DataEntry {

    @XmlElement(name = "DataEntry.Type")
    protected String dataEntryType;

    /**
     * Gets the value of the dataEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEntryType() {
        return dataEntryType;
    }

    /**
     * Sets the value of the dataEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEntryType(String value) {
        this.dataEntryType = value;
    }

}
