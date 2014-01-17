
package com.google.api.ads.adwords.jaxws.v201306.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Modifies the ManagedCustomer forest. These actions are possible (categorized by
 *             Operator + Link Status):
 *             
 *             <ul>
 *             <li>ADD + PENDING:   manager extends invitations
 *             <li>SET + CANCELLED: manager rescinds invitations
 *             <li>SET + INACTIVE:  manager/client terminates links
 *             <li>SET + ACTIVE:    client accepts invitations
 *             <li>SET + REFUSED:   client declines invitations
 *             </ul>
 *             
 *             @param operations the list of operations
 *             @return results for the given operations
 *             @throws ApiException with a {@link ManagedCustomerServiceError}
 *           
 * 
 * <p>Java class for mutateLink element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateLink">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/mcm/v201306}LinkOperation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "mutateLink")
public class ManagedCustomerServiceInterfacemutateLink {

    protected List<LinkOperation> operations;

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
     * {@link LinkOperation }
     * 
     * 
     */
    public List<LinkOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<LinkOperation>();
        }
        return this.operations;
    }

}
