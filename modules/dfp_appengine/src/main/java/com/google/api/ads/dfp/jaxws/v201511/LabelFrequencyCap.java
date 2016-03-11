
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code LabelFrequencyCap} assigns a frequency cap to a label.  The
 *             frequency cap will limit the cumulative number of impressions of any ad
 *             units with this label that may be shown to a particular user over a time
 *             unit.
 *           
 * 
 * <p>Java class for LabelFrequencyCap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelFrequencyCap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequencyCap" type="{https://www.google.com/apis/ads/publisher/v201511}FrequencyCap" minOccurs="0"/>
 *         &lt;element name="labelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelFrequencyCap", propOrder = {
    "frequencyCap",
    "labelId"
})
public class LabelFrequencyCap {

    protected FrequencyCap frequencyCap;
    protected Long labelId;

    /**
     * Gets the value of the frequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyCap }
     *     
     */
    public FrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    /**
     * Sets the value of the frequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyCap }
     *     
     */
    public void setFrequencyCap(FrequencyCap value) {
        this.frequencyCap = value;
    }

    /**
     * Gets the value of the labelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLabelId(Long value) {
        this.labelId = value;
    }

}
