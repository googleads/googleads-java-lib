
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a criterion containing a function that when evaluated specifies how to target
 *             based on the type of the location. These "location groups" are custom, dynamic bundles of
 *             locations (for instance "High income areas in California" or "Airports in France").
 *             
 *             <p>Examples:</p>
 *             
 *             For income demographic targeting, we need to specify the income tier and the geo
 *             which it targets. Areas in California that are in the top national income tier can be
 *             represented by:
 *             <pre><code>
 *             Function function = new Function();
 *             function.setLhsOperand(Arrays.asList(
 *             (Operand) new IncomeOperand(IncomeTier.TIER_1));
 *             function.setOperator(Operator.AND);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new GeoTargetOperand(Lists.newArrayList(new CriterionId(21137L))));
 *             </code></pre>
 *             
 *             For place of interest targeting, we need to specify the place of interest category and the geo
 *             which it targets. Airports in France can be represented by:
 *             <pre><code>
 *             Function function = new Function();
 *             function.setLhsOperand(Arrays.asList(
 *             (Operand) new PlacesOfInterestOperand(PlacesOfInterestOperand.Category.AIRPORT));
 *             function.setOperator(Operator.AND);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new GeoTargetOperand(Lists.newArrayList(new CriterionId(2250L))));
 *             </code></pre>
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for LocationGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Criterion">
 *       &lt;sequence>
 *         &lt;element name="matchingFunction" type="{https://adwords.google.com/api/adwords/cm/v201406}Function" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroups", propOrder = {
    "matchingFunction"
})
public class LocationGroups
    extends Criterion
{

    protected Function matchingFunction;

    /**
     * Gets the value of the matchingFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getMatchingFunction() {
        return matchingFunction;
    }

    /**
     * Sets the value of the matchingFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setMatchingFunction(Function value) {
        this.matchingFunction = value;
    }

}
