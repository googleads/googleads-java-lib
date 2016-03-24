
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Loads a TrialPage containing a list of {@link Trial} objects matching the selector.
 *             
 *             @param selector defines which subset of all available trials to return, the sort order, and
 *             which fields to include
 *             
 *             @return Returns a page of matching trial objects.
 *             @throws com.google.ads.api.services.common.error.ApiException if errors occurred while
 *             retrieving the results.
 *           
 * 
 * <p>Java class for get element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="get">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="selector" type="{https://adwords.google.com/api/adwords/cm/v201603}Selector" minOccurs="0"/>
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
    "selector"
})
@XmlRootElement(name = "get")
public class TrialServiceInterfaceget {

    protected Selector selector;

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link Selector }
     *     
     */
    public Selector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selector }
     *     
     */
    public void setSelector(Selector value) {
        this.selector = value;
    }

}
