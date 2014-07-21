
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Paging;


/**
 * 
 *             A filter for looking up and searching for YouTube videos and channels.
 *           
 * 
 * <p>Java class for VideoSearchSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSearchSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchType" type="{https://adwords.google.com/api/adwords/video/v201406}VideoSearchSelector.SearchType" minOccurs="0"/>
 *         &lt;element name="videoIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelUserNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="channelUserIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://adwords.google.com/api/adwords/cm/v201406}Paging" minOccurs="0"/>
 *         &lt;element name="sorting" type="{https://adwords.google.com/api/adwords/video/v201406}Sorting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSearchSelector", propOrder = {
    "searchType",
    "videoIds",
    "query",
    "channelUserNames",
    "channelUserIds",
    "paging",
    "sorting"
})
public class VideoSearchSelector {

    protected VideoSearchSelectorSearchType searchType;
    protected List<String> videoIds;
    protected String query;
    protected List<String> channelUserNames;
    protected List<String> channelUserIds;
    protected Paging paging;
    protected Sorting sorting;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSearchSelectorSearchType }
     *     
     */
    public VideoSearchSelectorSearchType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSearchSelectorSearchType }
     *     
     */
    public void setSearchType(VideoSearchSelectorSearchType value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the videoIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoIds() {
        if (videoIds == null) {
            videoIds = new ArrayList<String>();
        }
        return this.videoIds;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the channelUserNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelUserNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelUserNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChannelUserNames() {
        if (channelUserNames == null) {
            channelUserNames = new ArrayList<String>();
        }
        return this.channelUserNames;
    }

    /**
     * Gets the value of the channelUserIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelUserIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelUserIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChannelUserIds() {
        if (channelUserIds == null) {
            channelUserIds = new ArrayList<String>();
        }
        return this.channelUserIds;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Sorting }
     *     
     */
    public Sorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sorting }
     *     
     */
    public void setSorting(Sorting value) {
        this.sorting = value;
    }

}
