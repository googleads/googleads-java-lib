
package com.google.api.ads.adwords.jaxws.v201603.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A container for return values from {@link ManagedCustomerService#mutateLabel}.
 *             <p>For successful {@linkplain ADD} operations, the input {@linkplain ManagedCustomerLabel}
 *             is returned.
 *             <p>For successful {@linkplain REMOVE} operations, the returned {@linkplain ManagedCustomerLabel}
 *             will contain the customer ID and a null label ID.
 *           
 * 
 * <p>Java class for ManagedCustomerLabelReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerLabelReturnValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/mcm/v201603}ManagedCustomerLabel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerLabelReturnValue", propOrder = {
    "value"
})
public class ManagedCustomerLabelReturnValue {

    protected List<ManagedCustomerLabel> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedCustomerLabel }
     * 
     * 
     */
    public List<ManagedCustomerLabel> getValue() {
        if (value == null) {
            value = new ArrayList<ManagedCustomerLabel>();
        }
        return this.value;
    }

}
