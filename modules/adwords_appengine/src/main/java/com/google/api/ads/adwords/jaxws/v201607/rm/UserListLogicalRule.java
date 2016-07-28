
package com.google.api.ads.adwords.jaxws.v201607.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A user list logical rule. A rule has a logical operator (and/or/not) and a
 *             list of operands that can be user lists or user interests.
 *           
 * 
 * <p>Java class for UserListLogicalRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserListLogicalRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operator" type="{https://adwords.google.com/api/adwords/rm/v201607}UserListLogicalRule.Operator" minOccurs="0"/>
 *         &lt;element name="ruleOperands" type="{https://adwords.google.com/api/adwords/rm/v201607}LogicalUserListOperand" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserListLogicalRule", propOrder = {
    "operator",
    "ruleOperands"
})
public class UserListLogicalRule {

    @XmlSchemaType(name = "string")
    protected UserListLogicalRuleOperator operator;
    protected List<LogicalUserListOperand> ruleOperands;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link UserListLogicalRuleOperator }
     *     
     */
    public UserListLogicalRuleOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListLogicalRuleOperator }
     *     
     */
    public void setOperator(UserListLogicalRuleOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the ruleOperands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleOperands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleOperands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalUserListOperand }
     * 
     * 
     */
    public List<LogicalUserListOperand> getRuleOperands() {
        if (ruleOperands == null) {
            ruleOperands = new ArrayList<LogicalUserListOperand>();
        }
        return this.ruleOperands;
    }

}
