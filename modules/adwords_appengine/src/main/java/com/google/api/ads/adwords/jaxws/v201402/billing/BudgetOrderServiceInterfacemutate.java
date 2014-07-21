
package com.google.api.ads.adwords.jaxws.v201402.billing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Mutates BudgetOrders, supported operations are:
 *             <p><code>ADD</code>: Adds a {@link BudgetOrder} to the billing account
 *             specified by the billing account ID.</p>
 *             <p><code>SET</code>: Sets the start/end date and amount of the
 *             {@link BudgetOrder}.</p>
 *             <p><code>REMOVE</code>: Cancels the {@link BudgetOrder} (status change).</p>
 *             <p class="warning"><b>Warning:</b> The <code>BudgetOrderService</code>
 *             is limited to one operation per mutate request. Any attempt to make more
 *             than one operation will result in an <code>ApiException</code>.</p>
 *             @param operations A list of operations, <b>however currently we only
 *             support one operation per mutate call</b>.
 *             @return BudgetOrders affected by the mutate operation.
 *             @throws ApiException
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
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/billing/v201402}BudgetOrderOperation" maxOccurs="unbounded" minOccurs="0"/>
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
public class BudgetOrderServiceInterfacemutate {

    protected List<BudgetOrderOperation> operations;

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
     * {@link BudgetOrderOperation }
     * 
     * 
     */
    public List<BudgetOrderOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<BudgetOrderOperation>();
        }
        return this.operations;
    }

}
