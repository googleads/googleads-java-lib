
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies the list of mutate operations such as adding or updating conversion trackers.
 *             <p class="note"><b>Note:</b> {@link ConversionTrackerOperation} does not support the
 *             <code>REMOVE</code> operator. In order to 'disable' a conversion type, send a
 *             <code>SET</code> operation for the conversion tracker with the <code>status</code>
 *             property set to <code>DISABLED</code></p>
 *             
 *             @param operations A list of mutate operations to perform.
 *             @return The list of the conversion trackers as they appear after mutation,
 *             in the same order as they appeared in the list of operations.
 *             @throws com.google.ads.api.services.common.error.ApiException if problems
 *             occurred while updating the data.
 *           
 * 
 * <p>Java class for mutate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201409}ConversionTrackerOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations"
})
@XmlRootElement(name = "mutate")
public class ConversionTrackerServiceInterfacemutate {

    protected List<ConversionTrackerOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionTrackerOperation }
     * 
     * 
     */
    public List<ConversionTrackerOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<ConversionTrackerOperation>();
        }
        return this.operations;
    }

}
