
package com.google.api.ads.adwords.jaxws.v201309.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} for {@code PLACEMENT} {@link IdeaType}s used to
 *             filter the results by the list of {@link AdSpec}s. See {@link AdSpec}
 *             documentation for details on available options.
 *             <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for AdSpecListSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSpecListSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201309}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="adSpecs" type="{https://adwords.google.com/api/adwords/o/v201309}AdSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSpecListSearchParameter", propOrder = {
    "adSpecs"
})
public class AdSpecListSearchParameter
    extends SearchParameter
{

    protected List<AdSpec> adSpecs;

    /**
     * Gets the value of the adSpecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adSpecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdSpec }
     * 
     * 
     */
    public List<AdSpec> getAdSpecs() {
        if (adSpecs == null) {
            adSpecs = new ArrayList<AdSpec>();
        }
        return this.adSpecs;
    }

}
