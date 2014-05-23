
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents bids per format.
 *           
 * 
 * <p>Java class for BidsByFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidsByFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bidsByFormat" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdDisplayFormat_VideoBidMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidsByFormat", propOrder = {
    "bidsByFormat"
})
public class BidsByFormat {

    protected List<VideoAdDisplayFormatVideoBidMapEntry> bidsByFormat;

    /**
     * Gets the value of the bidsByFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidsByFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidsByFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoAdDisplayFormatVideoBidMapEntry }
     * 
     * 
     */
    public List<VideoAdDisplayFormatVideoBidMapEntry> getBidsByFormat() {
        if (bidsByFormat == null) {
            bidsByFormat = new ArrayList<VideoAdDisplayFormatVideoBidMapEntry>();
        }
        return this.bidsByFormat;
    }

}
