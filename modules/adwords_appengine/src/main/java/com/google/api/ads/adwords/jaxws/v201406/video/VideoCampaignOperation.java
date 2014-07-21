
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Operation;


/**
 * 
 *             An operation on a video campaign.
 *             Note: The REMOVE operator is not supported. To remove a campaign, set
 *             its status to REMOVED.
 *           
 * 
 * <p>Java class for VideoCampaignOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoCampaignOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/video/v201406}VideoCampaign" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoCampaignOperation", propOrder = {
    "operand"
})
public class VideoCampaignOperation
    extends Operation
{

    protected VideoCampaign operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCampaign }
     *     
     */
    public VideoCampaign getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCampaign }
     *     
     */
    public void setOperand(VideoCampaign value) {
        this.operand = value;
    }

}
