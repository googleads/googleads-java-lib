
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for approving {@link Order} objects. All {@link LineItem}
 *             objects within the order will be approved as well.  This action does not
 *             make any changes to the {@link LineItem#reservationStatus} of the line
 *             items within the order. If there are reservable line items that have not
 *             been reserved the operation will not succeed.
 *           
 * 
 * <p>Java class for ApproveOrdersWithoutReservationChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproveOrdersWithoutReservationChanges">
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
@XmlType(name = "ApproveOrdersWithoutReservationChanges")
public class ApproveOrdersWithoutReservationChanges
    extends OrderAction
{


}
