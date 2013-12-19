
package com.google.api.ads.adwords.jaxws.v201309.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The result of processing an {@link OperationStream}.
 *           
 * 
 * <p>Java class for OperationStreamResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationStreamResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationResults" type="{https://adwords.google.com/api/adwords/cm/v201309}OperationResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationStreamResult", propOrder = {
    "operationResults"
})
public class OperationStreamResult {

    protected List<OperationResult> operationResults;

    /**
     * Gets the value of the operationResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationResult }
     * 
     * 
     */
    public List<OperationResult> getOperationResults() {
        if (operationResults == null) {
            operationResults = new ArrayList<OperationResult>();
        }
        return this.operationResults;
    }

}
