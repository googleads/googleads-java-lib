
package com.google.api.ads.adwords.jaxws.v201406.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Simplified way of submitting a mutation job. The provided list of
 *             operations, if valid, will create a new job with a unique id, which will
 *             be returned. This id can later be used in invocations of
 *             {@link #get} and {@link #getResult}. Policy can optionally be specified.
 *             
 *             <p>When this method returns with success, the job will be in
 *             {@code PROCESSING} or {@code PENDING} state and no further action is
 *             needed for the job to get executed.</p>
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
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201406}Operation" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="policy" type="{https://adwords.google.com/api/adwords/cm/v201406}BulkMutateJobPolicy" minOccurs="0"/>
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
    "operations",
    "policy"
})
@XmlRootElement(name = "mutate")
public class MutateJobServiceInterfacemutate {

    protected List<Operation> operations;
    protected BulkMutateJobPolicy policy;

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
     * {@link Operation }
     * 
     * 
     */
    public List<Operation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<Operation>();
        }
        return this.operations;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link BulkMutateJobPolicy }
     *     
     */
    public BulkMutateJobPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkMutateJobPolicy }
     *     
     */
    public void setPolicy(BulkMutateJobPolicy value) {
        this.policy = value;
    }

}
