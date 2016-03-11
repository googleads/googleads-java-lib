
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CustomCriteriaNode} is a node in the custom targeting tree. A custom
 *             criteria node can either be a {@link CustomCriteriaSet} (a non-leaf node) or
 *             a {@link CustomCriteria} (a leaf node). The custom criteria targeting tree is
 *             subject to the rules defined on {@link Targeting#customTargeting}.
 *           
 * 
 * <p>Java class for CustomCriteriaNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomCriteriaNode">
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
@XmlType(name = "CustomCriteriaNode")
@XmlSeeAlso({
    CustomCriteriaSet.class,
    CustomCriteriaLeaf.class
})
public abstract class CustomCriteriaNode {


}
