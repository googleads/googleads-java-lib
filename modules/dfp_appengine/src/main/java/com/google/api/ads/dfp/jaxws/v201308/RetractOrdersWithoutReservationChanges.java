
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for retracting {@link Order} objects. This action does not
 *             make any changes to the {@link LineItem#reservationStatus} of the line items
 *             within the order.
 *           
 * 
 * <p>Java class for RetractOrdersWithoutReservationChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetractOrdersWithoutReservationChanges">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201308}OrderAction">
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
@XmlType(name = "RetractOrdersWithoutReservationChanges")
public class RetractOrdersWithoutReservationChanges
    extends OrderAction
{


}
