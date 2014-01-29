
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link Order}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link Order#advertiserId}</li>
 *             <li>{@link Order#name}</li>
 *             <li>{@link Order#traffickerId}</li>
 *             </ul>
 *             
 *             @param order the order to create
 *             @return the order with its ID filled in
 *           
 * 
 * <p>Java class for createOrder element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createOrder">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="order" type="{https://www.google.com/apis/ads/publisher/v201308}Order" minOccurs="0"/>
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
    "order"
})
@XmlRootElement(name = "createOrder")
public class OrderServiceInterfacecreateOrder {

    protected Order order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}
