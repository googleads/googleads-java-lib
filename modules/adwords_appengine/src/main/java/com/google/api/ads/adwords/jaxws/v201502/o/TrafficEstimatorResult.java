
package com.google.api.ads.adwords.jaxws.v201502.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains results of traffic estimation request.
 *           
 * 
 * <p>Java class for TrafficEstimatorResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficEstimatorResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignEstimates" type="{https://adwords.google.com/api/adwords/o/v201502}CampaignEstimate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficEstimatorResult", propOrder = {
    "campaignEstimates"
})
public class TrafficEstimatorResult {

    protected List<CampaignEstimate> campaignEstimates;

    /**
     * Gets the value of the campaignEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignEstimate }
     * 
     * 
     */
    public List<CampaignEstimate> getCampaignEstimates() {
        if (campaignEstimates == null) {
            campaignEstimates = new ArrayList<CampaignEstimate>();
        }
        return this.campaignEstimates;
    }

}
