
package com.google.api.ads.adwords.jaxws.v201309.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a page of ideas that match the query described by the specified
 *             {@link TargetingIdeaSelector}.
 *             
 *             <p>The selector must specify a {@code paging} value, with {@code numberResults} set to 800 or
 *             less.  Large result sets must be composed through multiple calls to this method, advancing the
 *             paging {@code startIndex} value by {@code numberResults} with each call.
 *             
 *             <p>Only a relatively small total number of results will be available through this method.
 *             Much larger result sets may be available using
 *             {@link #getBulkKeywordIdeas(TargetingIdeaSelector)} at the price of reduced flexibility in
 *             selector options.
 *             
 *             @param selector Query describing the types of results to return when
 *             finding matches (similar keyword ideas/placement ideas).
 *             @return A {@link TargetingIdeaPage} of results, that is a subset of the
 *             list of possible ideas meeting the criteria of the
 *             {@link TargetingIdeaSelector}.
 *             @throws ApiException If problems occurred while querying for ideas.
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
 *           &lt;element name="selector" type="{https://adwords.google.com/api/adwords/o/v201309}TargetingIdeaSelector" minOccurs="0"/>
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
public class TargetingIdeaServiceInterfaceget {

    protected TargetingIdeaSelector selector;

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingIdeaSelector }
     *     
     */
    public TargetingIdeaSelector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingIdeaSelector }
     *     
     */
    public void setSelector(TargetingIdeaSelector value) {
        this.selector = value;
    }

}
