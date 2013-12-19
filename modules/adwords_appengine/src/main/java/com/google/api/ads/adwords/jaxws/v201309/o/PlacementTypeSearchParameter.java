
package com.google.api.ads.adwords.jaxws.v201309.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} for {@code PLACEMENT} {@link IdeaType}s
 *             used to filter results based on the type of website, known as
 *             {@link com.google.ads.api.services.targetingideas.attributes.Type#PLACEMENT_TYPE},
 *             that they appear in. For example, searches may be limited to find
 *             results that only appear within mobile websites or feeds.
 *             <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS.
 *           
 * 
 * <p>Java class for PlacementTypeSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementTypeSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201309}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="placementTypes" type="{https://adwords.google.com/api/adwords/o/v201309}SiteConstants.PlacementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementTypeSearchParameter", propOrder = {
    "placementTypes"
})
public class PlacementTypeSearchParameter
    extends SearchParameter
{

    protected List<SiteConstantsPlacementType> placementTypes;

    /**
     * Gets the value of the placementTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteConstantsPlacementType }
     * 
     * 
     */
    public List<SiteConstantsPlacementType> getPlacementTypes() {
        if (placementTypes == null) {
            placementTypes = new ArrayList<SiteConstantsPlacementType>();
        }
        return this.placementTypes;
    }

}
