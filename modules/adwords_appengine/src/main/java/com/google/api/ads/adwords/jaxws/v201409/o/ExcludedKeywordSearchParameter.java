
package com.google.api.ads.adwords.jaxws.v201409.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.Keyword;


/**
 * 
 *             A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s that
 *             specifies {@link Keyword}s that should be excluded from the results.<p>
 *             
 *             The {@link KeywordMatchType} associated with these keywords is used to
 *             provide various filtering strategies. For example, the excluded keyword
 *             <b>"brand x player"</b> will exclude ideas from the resulting ideas as
 *             described by the table below.
 *             
 *             <table border="1">
 *             <tr style="font-weight: bold;">
 *             <th>Idea</th>
 *             <th>{@code BROAD}</th>
 *             <th>{@code PHRASE}</th>
 *             <th>{@code EXACT}</th>
 *             </tr>
 *             <tr>
 *             <td>brand x player</td>
 *             <td>Exclude</td>
 *             <td>Exclude</td>
 *             <td>Exclude</td>
 *             </tr>
 *             <tr>
 *             <td>blu-ray brand x player</td>
 *             <td>Exclude</td>
 *             <td>Exclude</td>
 *             <td>Include</td>
 *             </tr>
 *             <tr>
 *             <td>brand x dvd player</td>
 *             <td>Exclude</td>
 *             <td>Include</td>
 *             <td>Include</td>
 *             </tr>
 *             <tr>
 *             <td>brand x dvd</td>
 *             <td>Include</td>
 *             <td>Include</td>
 *             <td>Include</td>
 *             </tr>
 *             </table>
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for ExcludedKeywordSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcludedKeywordSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201409}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="keywords" type="{https://adwords.google.com/api/adwords/cm/v201409}Keyword" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcludedKeywordSearchParameter", propOrder = {
    "keywords"
})
public class ExcludedKeywordSearchParameter
    extends SearchParameter
{

    protected List<Keyword> keywords;

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyword }
     * 
     * 
     */
    public List<Keyword> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keyword>();
        }
        return this.keywords;
    }

}
