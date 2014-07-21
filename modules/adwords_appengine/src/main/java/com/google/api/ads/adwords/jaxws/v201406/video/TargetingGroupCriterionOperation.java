
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.ExemptionRequest;
import com.google.api.ads.adwords.jaxws.v201406.cm.Operation;


/**
 * 
 *             An operation on a targeting group criterion.
 *           
 * 
 * <p>Java class for TargetingGroupCriterionOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupCriterionOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroupCriterion" minOccurs="0"/>
 *         &lt;element name="exemptionRequests" type="{https://adwords.google.com/api/adwords/cm/v201406}ExemptionRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupCriterionOperation", propOrder = {
    "operand",
    "exemptionRequests"
})
public class TargetingGroupCriterionOperation
    extends Operation
{

    protected TargetingGroupCriterion operand;
    protected List<ExemptionRequest> exemptionRequests;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupCriterion }
     *     
     */
    public TargetingGroupCriterion getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupCriterion }
     *     
     */
    public void setOperand(TargetingGroupCriterion value) {
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
