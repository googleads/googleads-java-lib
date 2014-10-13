
package com.google.api.ads.adwords.jaxws.v201409.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.Operation;


/**
 * 
 *             A typed {@link Operation} class that uses an instance of {@link ExpressBusiness} as its operand.
 *             
 *             <p class="note"><b>Note:</b> The <code>REMOVE</code> operator is not
 *             supported. To remove an {@link ExpressBusiness}, set its {@link ExpressBusiness#status status}
 *             to <code>DELETED</code>.</p>
 *           
 * 
 * <p>Java class for ExpressBusinessOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressBusinessOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/express/v201409}ExpressBusiness" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressBusinessOperation", propOrder = {
    "operand"
})
public class ExpressBusinessOperation
    extends Operation
{

    protected ExpressBusiness operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressBusiness }
     *     
     */
    public ExpressBusiness getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressBusiness }
     *     
     */
    public void setOperand(ExpressBusiness value) {
        this.operand = value;
    }

}
