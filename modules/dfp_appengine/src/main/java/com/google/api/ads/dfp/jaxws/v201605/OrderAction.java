
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAction")
@XmlSeeAlso({
    UnarchiveOrders.class,
    DeleteOrders.class,
    ResumeOrders.class,
    ArchiveOrders.class,
    DisapproveOrdersWithoutReservationChanges.class,
    RetractOrders.class,
    PauseOrders.class,
    SubmitOrdersForApproval.class,
    ApproveOrdersWithoutReservationChanges.class,
    DisapproveOrders.class,
    ApproveOrders.class,
    SubmitOrdersForApprovalWithoutReservationChanges.class,
    RetractOrdersWithoutReservationChanges.class
})
public abstract class OrderAction {


}
