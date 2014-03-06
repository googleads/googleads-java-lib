
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a subset of {@link AdGroupBidLandscape} objects resulting from the
 *             filtering and paging of
 *             {@link com.google.ads.api.services.campaignmgmt.data.DataService#getAdGroupBidLandscape}
 *             call.
 *           
 * 
 * <p>Java class for AdGroupBidLandscapePage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupBidLandscapePage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}NoStatsPage">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupBidLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupBidLandscapePage", propOrder = {
    "entries"
})
public class AdGroupBidLandscapePage
    extends NoStatsPage
{

    protected List<AdGroupBidLandscape> entries;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupBidLandscape }
     * 
     * 
     */
    public List<AdGroupBidLandscape> getEntries() {
        if (entries == null) {
            entries = new ArrayList<AdGroupBidLandscape>();
        }
        return this.entries;
    }

}
