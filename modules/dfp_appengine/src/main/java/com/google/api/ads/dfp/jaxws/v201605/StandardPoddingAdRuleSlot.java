
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An ad rule slot with standard podding. A standard pod is a series of video ads played
 *             back to back. Standard pods are defined by a {@link BaseAdRuleSlot#maxAdsInPod} and a
 *             {@link BaseAdRuleSlot#maxVideoAdDuration}.
 *           
 * 
 * <p>Java class for StandardPoddingAdRuleSlot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardPoddingAdRuleSlot">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201605}BaseAdRuleSlot">
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
@XmlType(name = "StandardPoddingAdRuleSlot")
public class StandardPoddingAdRuleSlot
    extends BaseAdRuleSlot
{


}
