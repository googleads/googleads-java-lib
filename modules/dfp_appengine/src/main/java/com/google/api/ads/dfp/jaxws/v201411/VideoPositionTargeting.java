
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents positions within and around a video where ads can be targeted to.
 *             <p>
 *             Example positions could be {@code pre-roll} (before the video plays),
 *             {@code post-roll} (after a video has completed playback) and
 *             {@code mid-roll} (during video playback).
 *           
 * 
 * <p>Java class for VideoPositionTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPositionTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetedPositions" type="{https://www.google.com/apis/ads/publisher/v201411}VideoPositionTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPositionTargeting", propOrder = {
    "targetedPositions"
})
public class VideoPositionTargeting {

    protected List<VideoPositionTarget> targetedPositions;

    /**
     * Gets the value of the targetedPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoPositionTarget }
     * 
     * 
     */
    public List<VideoPositionTarget> getTargetedPositions() {
        if (targetedPositions == null) {
            targetedPositions = new ArrayList<VideoPositionTarget>();
        }
        return this.targetedPositions;
    }

}
