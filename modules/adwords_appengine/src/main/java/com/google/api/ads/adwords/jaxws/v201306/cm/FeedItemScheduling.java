
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a collection of FeedItem schedules specifying all time intervals for which
 *             the feed item may serve. Any time range not covered by the specified FeedItemSchedules will
 *             prevent the feed item from serving during those times.
 *           
 * 
 * <p>Java class for FeedItemScheduling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemScheduling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedItemSchedules" type="{https://adwords.google.com/api/adwords/cm/v201306}FeedItemSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemScheduling", propOrder = {
    "feedItemSchedules"
})
public class FeedItemScheduling {

    protected List<FeedItemSchedule> feedItemSchedules;

    /**
     * Gets the value of the feedItemSchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedItemSchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedItemSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemSchedule }
     * 
     * 
     */
    public List<FeedItemSchedule> getFeedItemSchedules() {
        if (feedItemSchedules == null) {
            feedItemSchedules = new ArrayList<FeedItemSchedule>();
        }
        return this.feedItemSchedules;
    }

}
