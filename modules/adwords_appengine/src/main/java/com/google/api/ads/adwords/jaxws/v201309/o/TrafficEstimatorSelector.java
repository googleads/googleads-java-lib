
package com.google.api.ads.adwords.jaxws.v201309.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a list of campaigns to perform a traffic estimate on.
 *           
 * 
 * <p>Java class for TrafficEstimatorSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficEstimatorSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignEstimateRequests" type="{https://adwords.google.com/api/adwords/o/v201309}CampaignEstimateRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficEstimatorSelector", propOrder = {
    "campaignEstimateRequests"
})
public class TrafficEstimatorSelector {

    protected List<CampaignEstimateRequest> campaignEstimateRequests;

    /**
     * Gets the value of the campaignEstimateRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignEstimateRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignEstimateRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignEstimateRequest }
     * 
     * 
     */
    public List<CampaignEstimateRequest> getCampaignEstimateRequests() {
        if (campaignEstimateRequests == null) {
            campaignEstimateRequests = new ArrayList<CampaignEstimateRequest>();
        }
        return this.campaignEstimateRequests;
    }

}
