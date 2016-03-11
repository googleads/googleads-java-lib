
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for disapproving {@link Order} objects. All {@link LineItem}
 *             objects within the order will be disapproved as well. This action does not
 *             make any changes to the {@link LineItem#reservationStatus} of the line items
 *             within the order.
 *           
 * 
 * <p>Java class for DisapproveOrdersWithoutReservationChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisapproveOrdersWithoutReservationChanges">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}OrderAction">
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
@XmlType(name = "DisapproveOrdersWithoutReservationChanges")
public class DisapproveOrdersWithoutReservationChanges
    extends OrderAction
{


}
