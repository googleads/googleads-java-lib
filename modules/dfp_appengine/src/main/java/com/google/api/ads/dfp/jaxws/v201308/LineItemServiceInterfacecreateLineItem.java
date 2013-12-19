
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link LineItem}.
 *             
 *             These fields are required:
 *             <ul>
 *             <li>{@link LineItem#costPerUnit}</li>
 *             <li>{@link LineItem#costType}<li>
 *             <li>{@link LineItem#endDateTime}</li>
 *             <li>{@link LineItem#lineItemType}</li>
 *             <li>{@link LineItem#name}</li>
 *             <li>{@link LineItem#orderId}</li>
 *             <li>{@link LineItem#startDateTime}</li>
 *             <li>{@link LineItem#unitsBought}</li>
 *             <li>{@link LineItem#creativePlaceholders}</li>
 *             <li>{@link LineItem#targeting}</li>
 *             </ul>
 *             
 *             @param lineItem the line item to create
 *             @return the line item with its ID filled in
 *           
 * 
 * <p>Java class for createLineItem element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createLineItem">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItem" type="{https://www.google.com/apis/ads/publisher/v201308}LineItem" minOccurs="0"/>
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
    "lineItem"
})
@XmlRootElement(name = "createLineItem")
public class LineItemServiceInterfacecreateLineItem {

    protected LineItem lineItem;

    /**
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem }
     *     
     */
    public LineItem getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem }
     *     
     */
    public void setLineItem(LineItem value) {
        this.lineItem = value;
    }

}
