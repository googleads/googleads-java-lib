
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for submitting {@link Order} objects for approval.
 *           
 * 
 * <p>Java class for SubmitOrdersForApproval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitOrdersForApproval">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}OrderAction">
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
@XmlType(name = "SubmitOrdersForApproval")
@XmlSeeAlso({
    SubmitOrdersForApprovalAndOverbook.class
})
public class SubmitOrdersForApproval
    extends OrderAction
{


}
