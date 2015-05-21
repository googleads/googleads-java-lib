
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for submitting {@link Order} objects for approval. This
 *             action does not make any changes to the {@link LineItem#reservationStatus}
 *             of the line items within the order.
 *           
 * 
 * <p>Java class for SubmitOrdersForApprovalWithoutReservationChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitOrdersForApprovalWithoutReservationChanges">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}OrderAction">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitOrdersForApprovalWithoutReservationChanges")
public class SubmitOrdersForApprovalWithoutReservationChanges
    extends OrderAction
{


}
