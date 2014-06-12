
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link Order} objects.
 *           
 * 
 * <p>Java class for OrderAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAction", propOrder = {
    "orderActionType"
})
@XmlSeeAlso({
    DisapproveOrders.class,
    ResumeOrders.class,
    ApproveOrdersWithoutReservationChanges.class,
    SubmitOrdersForApprovalWithoutReservationChanges.class,
    ApproveOrders.class,
    PauseOrders.class,
    ArchiveOrders.class,
    DisapproveOrdersWithoutReservationChanges.class,
    DeleteOrders.class,
    RetractOrdersWithoutReservationChanges.class,
    UnarchiveOrders.class,
    RetractOrders.class,
    SubmitOrdersForApproval.class
})
public abstract class OrderAction {

    @XmlElement(name = "OrderAction.Type")
    protected String orderActionType;

    /**
     * Gets the value of the orderActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderActionType() {
        return orderActionType;
    }

    /**
     * Sets the value of the orderActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderActionType(String value) {
        this.orderActionType = value;
    }

}
