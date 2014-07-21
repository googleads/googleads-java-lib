
package com.google.api.ads.adwords.jaxws.v201402.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Language;


/**
 * 
 *             A {@link SearchParameter} used to indicate multiple language being targeted.
 *             This can be used, for example, to search for {@code KEYWORD}
 *             {@link IdeaType}s that are best for Japanese language.
 *             
 *             <p>The service allows at most one language to be targeted for
 *             {@code KEYWORD} requests.
 *             <p>In the {@code KEYWORD} {@link IdeaType} {@code STATS} {@link RequestType}
 *             requests, those keywords that are from different language than specified in
 *             {@code LanguageSearchParameter} or have unknown language will be filtered
 *             out in the response. To avoid filtering, do not include
 *             {@code LanguageSearchParameter} in the request.
 *             <p>This search parameter can be used in bulk keyword requests through the {@link com.google.ads.api.services.targetingideas.TargetingIdeaService#getBulkKeywordIdeas(TargetingIdeaSelector)} method. It must be single-valued when used in a call to that method.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD, PLACEMENT.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for LanguageSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201402}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="languages" type="{https://adwords.google.com/api/adwords/cm/v201402}Language" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageSearchParameter", propOrder = {
    "languages"
})
public class LanguageSearchParameter
    extends SearchParameter
{

    protected List<Language> languages;

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * 
     * 
     */
    public List<Language> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<Language>();
        }
        return this.languages;
    }

}
