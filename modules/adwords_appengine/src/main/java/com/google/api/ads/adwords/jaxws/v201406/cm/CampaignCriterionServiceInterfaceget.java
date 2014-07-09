
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets campaign criteria.
 *             
 *             @param serviceSelector The selector specifying the {@link CampaignCriterion}s to return.
 *             @return A list of campaign criteria.
 *             @throws ApiException when there is at least one error with the request.
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
 *           &lt;element name="serviceSelector" type="{https://adwords.google.com/api/adwords/cm/v201406}Selector" minOccurs="0"/>
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
    "serviceSelector"
})
@XmlRootElement(name = "get")
public class CampaignCriterionServiceInterfaceget {

    protected Selector serviceSelector;

    /**
     * Gets the value of the serviceSelector property.
     * 
     * @return
     *     possible object is
     *     {@link Selector }
     *     
     */
    public Selector getServiceSelector() {
        return serviceSelector;
    }

    /**
     * Sets the value of the serviceSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selector }
     *     
     */
    public void setServiceSelector(Selector value) {
        this.serviceSelector = value;
    }

}
