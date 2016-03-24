
package com.google.api.ads.adwords.jaxws.v201603.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Visitors of a page. The page visit is defined by one boolean rule expression.
 *           
 * 
 * <p>Java class for ExpressionRuleUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionRuleUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201603}RuleBasedUserList">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{https://adwords.google.com/api/adwords/rm/v201603}Rule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionRuleUserList", propOrder = {
    "rule"
})
public class ExpressionRuleUserList
    extends RuleBasedUserList
{

    protected Rule rule;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link Rule }
     *     
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rule }
     *     
     */
    public void setRule(Rule value) {
        this.rule = value;
    }

}
