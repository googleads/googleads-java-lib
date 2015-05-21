
package com.google.api.ads.adwords.jaxws.v201502.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s used to
 *             filter the results by the amount of competition (eg: LOW, MEDIUM, HIGH).
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for CompetitionSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetitionSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201502}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="levels" type="{https://adwords.google.com/api/adwords/o/v201502}CompetitionSearchParameter.Level" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetitionSearchParameter", propOrder = {
    "levels"
})
public class CompetitionSearchParameter
    extends SearchParameter
{

    protected List<CompetitionSearchParameterLevel> levels;

    /**
     * Gets the value of the levels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitionSearchParameterLevel }
     * 
     * 
     */
    public List<CompetitionSearchParameterLevel> getLevels() {
        if (levels == null) {
            levels = new ArrayList<CompetitionSearchParameterLevel>();
        }
        return this.levels;
    }

}
