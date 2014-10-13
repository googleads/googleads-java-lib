
package com.google.api.ads.adwords.jaxws.v201409.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.Criterion;


/**
 * 
 *             A negative criterion. It wraps a {@link Criterion} and will be associated with an ad group as a
 *             {@link com.google.ads.api.services.campaignmgmt.criterion.adgroupcriterion.NegativeAdGroupCriterion}
 *             .
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for NegativeCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegativeCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}Criterion">
 *       &lt;sequence>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/cm/v201409}Criterion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegativeCriterion", propOrder = {
    "criterion"
})
public class NegativeCriterion
    extends Criterion
{

    protected Criterion criterion;

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link Criterion }
     *     
     */
    public Criterion getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criterion }
     *     
     */
    public void setCriterion(Criterion value) {
        this.criterion = value;
    }

}
