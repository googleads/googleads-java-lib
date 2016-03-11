
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An operation on a {@code BatchJob}.
 *             
 *             <p class="note"><b>Note:</b> Only the <code>ADD</code> and <code>SET</code>
 *             operators are supported.
 *           
 * 
 * <p>Java class for BatchJobOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchJobOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201601}BatchJob" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchJobOperation", propOrder = {
    "operand"
})
public class BatchJobOperation
    extends Operation
{

    protected BatchJob operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link BatchJob }
     *     
     */
    public BatchJob getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchJob }
     *     
     */
    public void setOperand(BatchJob value) {
        this.operand = value;
    }

}
