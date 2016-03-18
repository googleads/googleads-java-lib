
package com.google.api.ads.dfp.jaxws.v201505;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An {@link AudienceSegmentCriteria} object is used to target {@link AudienceSegment} objects.
 *           
 * 
 * <p>Java class for AudienceSegmentCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceSegmentCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}CustomCriteriaLeaf">
 *       &lt;sequence>
 *         &lt;element name="operator" type="{https://www.google.com/apis/ads/publisher/v201505}AudienceSegmentCriteria.ComparisonOperator" minOccurs="0"/>
 *         &lt;element name="audienceSegmentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceSegmentCriteria", propOrder = {
    "operator",
    "audienceSegmentIds"
})
public class AudienceSegmentCriteria
    extends CustomCriteriaLeaf
{

    @XmlSchemaType(name = "string")
    protected AudienceSegmentCriteriaComparisonOperator operator;
    @XmlElement(type = Long.class)
    protected List<Long> audienceSegmentIds;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceSegmentCriteriaComparisonOperator }
     *     
     */
    public AudienceSegmentCriteriaComparisonOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceSegmentCriteriaComparisonOperator }
     *     
     */
    public void setOperator(AudienceSegmentCriteriaComparisonOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the audienceSegmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audienceSegmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceSegmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAudienceSegmentIds() {
        if (audienceSegmentIds == null) {
            audienceSegmentIds = new ArrayList<Long>();
        }
        return this.audienceSegmentIds;
    }

}
