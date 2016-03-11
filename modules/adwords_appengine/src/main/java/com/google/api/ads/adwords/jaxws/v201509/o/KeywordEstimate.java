
package com.google.api.ads.adwords.jaxws.v201509.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the traffic estimate result for a single keyword.
 *           
 * 
 * <p>Java class for KeywordEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordEstimate">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201509}Estimate">
 *       &lt;sequence>
 *         &lt;element name="criterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="min" type="{https://adwords.google.com/api/adwords/o/v201509}StatsEstimate" minOccurs="0"/>
 *         &lt;element name="max" type="{https://adwords.google.com/api/adwords/o/v201509}StatsEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordEstimate", propOrder = {
    "criterionId",
    "min",
    "max"
})
public class KeywordEstimate
    extends Estimate
{

    protected Long criterionId;
    protected StatsEstimate min;
    protected StatsEstimate max;

    /**
     * Gets the value of the criterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCriterionId() {
        return criterionId;
    }

    /**
     * Sets the value of the criterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCriterionId(Long value) {
        this.criterionId = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link StatsEstimate }
     *     
     */
    public StatsEstimate getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsEstimate }
     *     
     */
    public void setMin(StatsEstimate value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link StatsEstimate }
     *     
     */
    public StatsEstimate getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsEstimate }
     *     
     */
    public void setMax(StatsEstimate value) {
        this.max = value;
    }

}
