
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents interest criterion used for audience targeting.
 *             Interest criterion is immutable.
 *           
 * 
 * <p>Java class for AudienceInterest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceInterest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201406}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="interestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="interestPath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceInterest", propOrder = {
    "interestId",
    "interestPath"
})
public class AudienceInterest
    extends BaseCriterion
{

    protected Long interestId;
    protected List<String> interestPath;

    /**
     * Gets the value of the interestId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterestId() {
        return interestId;
    }

    /**
     * Sets the value of the interestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterestId(Long value) {
        this.interestId = value;
    }

    /**
     * Gets the value of the interestPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInterestPath() {
        if (interestPath == null) {
            interestPath = new ArrayList<String>();
        }
        return this.interestPath;
    }

}
