
package com.google.api.ads.adwords.jaxws.v201402.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a page of ideas that match the query described by the specified
 *             {@link TargetingIdeaSelector}.  This method is specialized for returning
 *             bulk keyword ideas, and thus the selector must be set for
 *             {@link com.google.ads.api.services.targetingideas.attributes.RequestType#IDEAS} and
 *             {@link com.google.ads.api.services.common.optimization.attributes.IdeaType#KEYWORD}.
 *             A limited, fixed set of attributes will be returned.
 *             
 *             <p>A single-valued
 *             {@link com.google.ads.api.services.targetingideas.search.RelatedToUrlSearchParameter}
 *             must be supplied.  Single-valued
 *             {@link com.google.ads.api.services.targetingideas.search.LanguageSearchParameter} and
 *             {@link com.google.ads.api.services.targetingideas.search.LocationSearchParameter} are
 *             both optional.  Other search parameters compatible with a keyword query may also be
 *             supplied.
 *             
 *             <p>The selector must specify a {@code paging} value, with {@code numberResults} set to 800
 *             or less. If a URL based search is performed it will return up to 100 keywords when the site is
 *             not owned, or up to 800 if it is. Number of keywords returned on a keyword based search is up
 *             to 800. Large result sets must be composed through multiple calls to this method, advancing the
 *             paging {@code startIndex} value by {@code numberResults} with each call.
 *             
 *             <p>This method can make many more results available than {@link #get(TargetingIdeaSelector)},
 *             but allows less control over the query. For fine-tuned queries that do not need large numbers
 *             of results, prefer {@link #get(TargetingIdeaSelector)}.
 *             
 *             @param selector Query describing the bulk keyword ideas to return.
 *             @return A {@link TargetingIdeaPage} of results, that is a subset of the
 *             list of possible ideas meeting the criteria of the
 *             {@link TargetingIdeaSelector}.
 *             @throws ApiException If problems occurred while querying for ideas.
 *           
 * 
 * <p>Java class for getBulkKeywordIdeas element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getBulkKeywordIdeas">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="selector" type="{https://adwords.google.com/api/adwords/o/v201402}TargetingIdeaSelector" minOccurs="0"/>
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
@XmlRootElement(name = "getBulkKeywordIdeas")
public class TargetingIdeaServiceInterfacegetBulkKeywordIdeas {

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
