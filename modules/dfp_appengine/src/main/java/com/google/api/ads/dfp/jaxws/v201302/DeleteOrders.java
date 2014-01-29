
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for deleting {@link Order} objects. All line items within
 *             that order are also deleted. Orders can only be deleted if none of its line
 *             items have been eligible to serve. This action can be used to delete
 *             proposed orders and line items if they are no longer valid.
 *           
 * 
 * <p>Java class for DeleteOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteOrders">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201302}OrderAction">
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
@XmlType(name = "DeleteOrders")
public class DeleteOrders
    extends OrderAction
{


}
