
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Operation;


/**
 * 
 *             An operation on a video.
 *             
 *             Note: only a limited number of modifications can be made to a video,
 *             like setting a call-to-action overlay.
 *           
 * 
 * <p>Java class for VideoOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/video/v201406}YouTubeVideo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoOperation", propOrder = {
    "operand"
})
public class VideoOperation
    extends Operation
{

    protected YouTubeVideo operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link YouTubeVideo }
     *     
     */
    public YouTubeVideo getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link YouTubeVideo }
     *     
     */
    public void setOperand(YouTubeVideo value) {
        this.operand = value;
    }

}
