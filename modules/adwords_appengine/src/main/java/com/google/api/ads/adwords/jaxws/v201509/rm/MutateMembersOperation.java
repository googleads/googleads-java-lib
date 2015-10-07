
package com.google.api.ads.adwords.jaxws.v201509.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201509.cm.Operation;


/**
 * 
 *             Operation representing a request to add or remove members from a user list.
 *           
 * 
 * <p>Java class for MutateMembersOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutateMembersOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/rm/v201509}MutateMembersOperand" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateMembersOperation", propOrder = {
    "operand"
})
public class MutateMembersOperation
    extends Operation
{

    protected MutateMembersOperand operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link MutateMembersOperand }
     *     
     */
    public MutateMembersOperand getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link MutateMembersOperand }
     *     
     */
    public void setOperand(MutateMembersOperand value) {
        this.operand = value;
    }

}
