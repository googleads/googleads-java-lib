
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the list of targeting group criteria that meet the selector criteria.
 *             
 *             @param selector Determines which targeting group criterions to return.
 *             If empty, all targeting groups are returned.
 *             @return A list of targeting group criteria.
 *             @throws ApiException if problems occurred while fetching targeting group information.
 *           
 * 
 * <p>Java class for get element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="get">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="selector" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroupCriterionSelector" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "selector"
})
@XmlRootElement(name = "get")
public class VideoTargetingGroupCriterionServiceInterfaceget {

    protected TargetingGroupCriterionSelector selector;

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupCriterionSelector }
     *     
     */
    public TargetingGroupCriterionSelector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupCriterionSelector }
     *     
     */
    public void setSelector(TargetingGroupCriterionSelector value) {
        this.selector = value;
    }

}
