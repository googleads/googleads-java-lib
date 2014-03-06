
package com.google.api.ads.adwords.jaxws.v201402.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} for {@code KEYWORD} and {@code PLACEMENT}
 *             {@link IdeaType}s that specifies a set of URLs that results should
 *             in some way be related too. For example, keyword results would be
 *             similar to content keywords found on the related URLs.
 *             <p>This search parameter can be used in bulk keyword requests through the {@link com.google.ads.api.services.targetingideas.TargetingIdeaService#getBulkKeywordIdeas(TargetingIdeaSelector)} method. It must be single-valued when used in a call to that method.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD, PLACEMENT.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for RelatedToUrlSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedToUrlSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201402}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="urls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeSubUrls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedToUrlSearchParameter", propOrder = {
    "urls",
    "includeSubUrls"
})
public class RelatedToUrlSearchParameter
    extends SearchParameter
{

    protected List<String> urls;
    protected Boolean includeSubUrls;

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrls() {
        if (urls == null) {
            urls = new ArrayList<String>();
        }
        return this.urls;
    }

    /**
     * Gets the value of the includeSubUrls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubUrls() {
        return includeSubUrls;
    }

    /**
     * Sets the value of the includeSubUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubUrls(Boolean value) {
        this.includeSubUrls = value;
    }

}
