
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rval" type="{https://adwords.google.com/api/adwords/cm/v201603}DraftAsyncErrorPage" minOccurs="0"/>
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
@XmlRootElement(name = "getResponse")
public class DraftAsyncErrorServiceInterfacegetResponse {

    protected DraftAsyncErrorPage rval;

    /**
     * Gets the value of the rval property.
     * 
     * @return
     *     possible object is
     *     {@link DraftAsyncErrorPage }
     *     
     */
    public DraftAsyncErrorPage getRval() {
        return rval;
    }

    /**
     * Sets the value of the rval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftAsyncErrorPage }
     *     
     */
    public void setRval(DraftAsyncErrorPage value) {
        this.rval = value;
    }

}
