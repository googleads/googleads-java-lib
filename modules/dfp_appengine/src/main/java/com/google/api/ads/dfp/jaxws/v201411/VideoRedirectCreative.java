
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that contains externally hosted video ads and
 *             is served via VAST 2.0 XML. This creative is read-only in versions
 *             V201408 and lower.
 *           
 * 
 * <p>Java class for VideoRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRedirectCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}BaseVideoCreative">
 *       &lt;sequence>
 *         &lt;element name="videoAssets" type="{https://www.google.com/apis/ads/publisher/v201411}VideoRedirectAsset" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRedirectCreative", propOrder = {
    "videoAssets"
})
public class VideoRedirectCreative
    extends BaseVideoCreative
{

    protected List<VideoRedirectAsset> videoAssets;

    /**
     * Gets the value of the videoAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoRedirectAsset }
     * 
     * 
     */
    public List<VideoRedirectAsset> getVideoAssets() {
        if (videoAssets == null) {
            videoAssets = new ArrayList<VideoRedirectAsset>();
        }
        return this.videoAssets;
    }

}
