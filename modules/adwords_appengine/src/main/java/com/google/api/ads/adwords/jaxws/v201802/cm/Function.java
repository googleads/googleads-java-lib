// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a function where its operator is applied to its argument operands
 *             resulting in a return value. It has the form
 *             (Operand... Operator Operand...). The type of the return value depends on
 *             the operator being applied and the type of the operands.
 *             
 *             <p class="special">Operands per function is limited to <b>20</b>.</p>
 *             
 *             <p>Here is a code example:</p>
 *             
 *             <pre><code>
 *             
 *             // For example "feed_attribute == 30" can be represented as:
 *             FeedId feedId = (FeedId of Feed associated with feed_attribute)
 *             FeedAttributeId feedAttributeId = (FeedAttributeId of feed_attribute)
 *             Function function = new Function();
 *             function.setLhsOperand(
 *             Arrays.asList((Operand) new FeedAttributeOperand(feedId, feedAttributeId)));
 *             function.setOperator(Operator.IN);
 *             function.setRhsOperand(
 *             Arrays.asList((Operand) new ConstantOperand(30L)));
 *             
 *             // Another example matching on multiple values:
 *             "feed_item_id IN (10, 20, 30)" can be represented as:
 *             
 *             Function function = new Function();
 *             function.setLhsOperand(
 *             Arrays.asList((Operand) new RequestContextOperand(ContextType.FEED_ITEM_ID)));
 *             function.setOperator(Operator.IN);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new ConstantOperand(10L), new ConstantOperand(20L), new ConstantOperand(30L)));
 *             </code></pre>
 *           
 * 
 * <p>Java class for Function complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operator" type="{https://adwords.google.com/api/adwords/cm/v201802}Function.Operator" minOccurs="0"/>
 *         &lt;element name="lhsOperand" type="{https://adwords.google.com/api/adwords/cm/v201802}FunctionArgumentOperand" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rhsOperand" type="{https://adwords.google.com/api/adwords/cm/v201802}FunctionArgumentOperand" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="functionString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Function", propOrder = {
    "operator",
    "lhsOperand",
    "rhsOperand",
    "functionString"
})
public class Function {

    @XmlSchemaType(name = "string")
    protected FunctionOperator operator;
    protected List<FunctionArgumentOperand> lhsOperand;
    protected List<FunctionArgumentOperand> rhsOperand;
    protected String functionString;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionOperator }
     *     
     */
    public FunctionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionOperator }
     *     
     */
    public void setOperator(FunctionOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the lhsOperand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lhsOperand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLhsOperand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionArgumentOperand }
     * 
     * 
     */
    public List<FunctionArgumentOperand> getLhsOperand() {
        if (lhsOperand == null) {
            lhsOperand = new ArrayList<FunctionArgumentOperand>();
        }
        return this.lhsOperand;
    }

    /**
     * Gets the value of the rhsOperand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhsOperand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRhsOperand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionArgumentOperand }
     * 
     * 
     */
    public List<FunctionArgumentOperand> getRhsOperand() {
        if (rhsOperand == null) {
            rhsOperand = new ArrayList<FunctionArgumentOperand>();
        }
        return this.rhsOperand;
    }

    /**
     * Gets the value of the functionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionString() {
        return functionString;
    }

    /**
     * Sets the value of the functionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionString(String value) {
        this.functionString = value;
    }

}
