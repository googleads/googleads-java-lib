
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An operand that can be used in a function expression.
 *           
 * 
 * <p>Java class for FunctionArgumentOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionArgumentOperand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionArgumentOperand.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionArgumentOperand", propOrder = {
    "functionArgumentOperandType"
})
@XmlSeeAlso({
    FeedAttributeOperand.class,
    PlacesOfInterestOperand.class,
    RequestContextOperand.class,
    ConstantOperand.class,
    IncomeOperand.class,
    GeoTargetOperand.class,
    LocationExtensionOperand.class,
    FunctionOperand.class
})
public abstract class FunctionArgumentOperand {

    @XmlElement(name = "FunctionArgumentOperand.Type")
    protected String functionArgumentOperandType;

    /**
     * Gets the value of the functionArgumentOperandType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionArgumentOperandType() {
        return functionArgumentOperandType;
    }

    /**
     * Sets the value of the functionArgumentOperandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionArgumentOperandType(String value) {
        this.functionArgumentOperandType = value;
    }

}
