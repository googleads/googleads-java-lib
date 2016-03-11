
package com.google.api.ads.adwords.jaxws.v201601.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201601.cm.Operation;


/**
 * 
 *             A typed {@link Operation} class that uses an instance of {@link Promotion} as its operand.
 *             
 *             <p class="note"><b>Note:</b> The <code>REMOVE</code> operator is not
 *             supported. To remove a {@link Promotion}, set its {@link Promotion#status status} to
 *             <code>DELETED</code>.</p>
 *           
 * 
 * <p>Java class for PromotionOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/express/v201601}Promotion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionOperation", propOrder = {
    "operand"
})
public class PromotionOperation
    extends Operation
{

    protected Promotion operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setOperand(Promotion value) {
        this.operand = value;
    }

}
