
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Page;


/**
 * 
 *             A page of videos resulting from a YouTube search.
 *           
 * 
 * <p>Java class for VideoSearchPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSearchPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Page">
 *       &lt;sequence>
 *         &lt;element name="recommendedChannels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/video/v201406}YouTubeVideo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSearchPage", propOrder = {
    "recommendedChannels",
    "entries"
})
public class VideoSearchPage
    extends Page
{

    protected List<String> recommendedChannels;
    protected List<YouTubeVideo> entries;

    /**
     * Gets the value of the recommendedChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendedChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendedChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecommendedChannels() {
        if (recommendedChannels == null) {
            recommendedChannels = new ArrayList<String>();
        }
        return this.recommendedChannels;
    }

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
     * {@link YouTubeVideo }
     * 
     * 
     */
    public List<YouTubeVideo> getEntries() {
        if (entries == null) {
            entries = new ArrayList<YouTubeVideo>();
        }
        return this.entries;
    }

}
