
package com.google.api.ads.dfp.jaxws.v201605;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The forecast of delivery for a list of {@link ProspectiveLineItem} objects to be reserved at the
 *             same time.
 *           
 * 
 * <p>Java class for DeliveryForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineItemDeliveryForecasts" type="{https://www.google.com/apis/ads/publisher/v201605}LineItemDeliveryForecast" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryForecast", propOrder = {
    "lineItemDeliveryForecasts"
})
public class DeliveryForecast {

    protected List<LineItemDeliveryForecast> lineItemDeliveryForecasts;

    /**
     * Gets the value of the lineItemDeliveryForecasts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemDeliveryForecasts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemDeliveryForecasts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDeliveryForecast }
     * 
     * 
     */
    public List<LineItemDeliveryForecast> getLineItemDeliveryForecasts() {
        if (lineItemDeliveryForecasts == null) {
            lineItemDeliveryForecasts = new ArrayList<LineItemDeliveryForecast>();
        }
        return this.lineItemDeliveryForecasts;
    }

}
