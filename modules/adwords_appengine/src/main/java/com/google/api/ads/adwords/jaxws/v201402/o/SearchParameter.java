
package com.google.api.ads.adwords.jaxws.v201402.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A set of {@link SearchParameter}s are supplied to the
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaSelector}
 *             to specify how the user wants to filter the set of all possible
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdea}s.
 *             
 *             There is a {@link SearchParameter} for all types of inputs.
 *             {@link SearchParameter}s can conceptually be broken down into two types.
 *             <ul>
 *             <li>Input {@link SearchParameter}s provide the seed information from which
 *             ideas should be generated or statistic information is desired
 *             (e.g. {@link RelatedToQuerySearchParameter},
 *             {@link RelatedToUrlSearchParameter}, etc).
 *             Such {@link SearchParameters} are required for valid requests.</li>
 *             <li>Filter {@link SearchParameter}s are used to trim down the results based
 *             on {@link com.google.ads.api.services.targetingideas.attributes.Attribute}
 *             related information (eg. {@link CompetitionSearchParameter}, etc.).</li>
 *             </ul><p>
 *             
 *             A request should only contain one instance of each {@link SearchParameter}.
 *             
 *             NOTICE: Starting with version v201406, requests containing multiple
 *             instances of the same search parameter will be rejected.
 *             <p>One or more of the following {@link SearchParameter}s are required:<br/>
 * <ul><li>{@link CategoryProductsAndServicesSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * <li>{@link SeedAdGroupIdSearchParameter}</li>
 * </ul><p>
 * <p><b>{@link IdeaType} KEYWORD supports following {@link SearchParameter}s:</b><br/>
 * <ul>
 * <li>{@link CategoryProductsAndServicesSearchParameter}</li>
 * <li>{@link CompetitionSearchParameter}</li>
 * <li>{@link ExcludedKeywordSearchParameter}</li>
 * <li>{@link IdeaTextFilterSearchParameter}</li>
 * <li>{@link IncludeAdultContentSearchParameter}</li>
 * <li>{@link LanguageSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link NetworkSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * <li>{@link SearchVolumeSearchParameter}</li>
 * <li>{@link SeedAdGroupIdSearchParameter}</li>
 * </ul><p>
 * <p><b>{@link IdeaType} PLACEMENT supports following {@link SearchParameter}s:</b><br/>
 * <ul>
 * <li>{@link AdSpecListSearchParameter}</li>
 * <li>{@link LanguageSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link PlacementTypeSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * </ul><p>
 *           
 * 
 * <p>Java class for SearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchParameter.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParameter", propOrder = {
    "searchParameterType"
})
@XmlSeeAlso({
    CategoryProductsAndServicesSearchParameter.class,
    RelatedToUrlSearchParameter.class,
    IncludeAdultContentSearchParameter.class,
    IdeaTextFilterSearchParameter.class,
    SeedAdGroupIdSearchParameter.class,
    AdSpecListSearchParameter.class,
    PlacementTypeSearchParameter.class,
    ExcludedKeywordSearchParameter.class,
    NetworkSearchParameter.class,
    RelatedToQuerySearchParameter.class,
    SearchVolumeSearchParameter.class,
    LocationSearchParameter.class,
    CompetitionSearchParameter.class,
    LanguageSearchParameter.class
})
public abstract class SearchParameter {

    @XmlElement(name = "SearchParameter.Type")
    protected String searchParameterType;

    /**
     * Gets the value of the searchParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchParameterType() {
        return searchParameterType;
    }

    /**
     * Sets the value of the searchParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchParameterType(String value) {
        this.searchParameterType = value;
    }

}
