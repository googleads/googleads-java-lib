
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Ad rule slot with optimized podding. Optimized pods are defined by a
 *             {@link BaseAdRuleSlot#maxPodDuration} and a {@link BaseAdRuleSlot#maxAdsInPod}, and the ad
 *             server chooses the best ads for the alloted duration.
 *           
 * 
 * <p>Java class for OptimizedPoddingAdRuleSlot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptimizedPoddingAdRuleSlot">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}BaseAdRuleSlot">
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
@XmlType(name = "OptimizedPoddingAdRuleSlot")
public class OptimizedPoddingAdRuleSlot
    extends BaseAdRuleSlot
{


}
