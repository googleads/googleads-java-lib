
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.ExemptionRequest;
import com.google.api.ads.adwords.jaxws.v201402.cm.Operation;


/**
 * 
 *             An operation for a VideoAd.
 *           
 * 
 * <p>Java class for VideoAdOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAdOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAd" minOccurs="0"/>
 *         &lt;element name="exemptionRequests" type="{https://adwords.google.com/api/adwords/cm/v201402}ExemptionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAdOperation", propOrder = {
    "operand",
    "exemptionRequests"
})
public class VideoAdOperation
    extends Operation
{

    protected VideoAd operand;
    protected List<ExemptionRequest> exemptionRequests;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAd }
     *     
     */
    public VideoAd getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAd }
     *     
     */
    public void setOperand(VideoAd value) {
        this.operand = value;
    }

    /**
     * Gets the value of the exemptionRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionRequest }
     * 
     * 
     */
    public List<ExemptionRequest> getExemptionRequests() {
        if (exemptionRequests == null) {
            exemptionRequests = new ArrayList<ExemptionRequest>();
        }
        return this.exemptionRequests;
    }

}
