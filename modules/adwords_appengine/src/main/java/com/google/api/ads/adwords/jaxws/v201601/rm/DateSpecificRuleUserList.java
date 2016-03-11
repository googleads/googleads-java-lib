
package com.google.api.ads.adwords.jaxws.v201601.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Visitors of a page during specific dates. The visiting periods are defined as follows:
 *             <ul>
 *             <li> between {@code startDate} (inclusive) and {@code endDate} (inclusive);
 *             <li> before {@code endDate} (exclusive) with {@code startDate} = 2000-01-01;
 *             <li> after {@code startDate} (exclusive) with {@code endDate} = 2037-12-30.
 *             </ul>
 *           
 * 
 * <p>Java class for DateSpecificRuleUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateSpecificRuleUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201601}RuleBasedUserList">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{https://adwords.google.com/api/adwords/rm/v201601}Rule" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateSpecificRuleUserList", propOrder = {
    "rule",
    "startDate",
    "endDate"
})
public class DateSpecificRuleUserList
    extends RuleBasedUserList
{

    protected Rule rule;
    protected String startDate;
    protected String endDate;

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

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
