
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation for uploading {@link OfflineConversionFeed}.
 *             See {@link OfflineConversionFeedService#mutate}
 *           
 * 
 * <p>Java class for OfflineConversionFeedOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversionFeedOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201406}OfflineConversionFeed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionFeedOperation", propOrder = {
    "operand"
})
public class OfflineConversionFeedOperation
    extends Operation
{

    protected OfflineConversionFeed operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineConversionFeed }
     *     
     */
    public OfflineConversionFeed getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineConversionFeed }
     *     
     */
    public void setOperand(OfflineConversionFeed value) {
        this.operand = value;
    }

}
