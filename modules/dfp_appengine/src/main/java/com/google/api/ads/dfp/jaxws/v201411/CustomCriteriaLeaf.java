
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CustomCriteriaLeaf} object represents a generic leaf of {@link CustomCriteria} tree
 *             structure.
 *           
 * 
 * <p>Java class for CustomCriteriaLeaf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomCriteriaLeaf">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}CustomCriteriaNode">
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
@XmlType(name = "CustomCriteriaLeaf")
@XmlSeeAlso({
    AudienceSegmentCriteria.class,
    CustomCriteria.class
})
public abstract class CustomCriteriaLeaf
    extends CustomCriteriaNode
{


}
