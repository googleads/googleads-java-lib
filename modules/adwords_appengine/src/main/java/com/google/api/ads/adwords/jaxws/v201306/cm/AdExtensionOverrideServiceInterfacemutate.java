
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Applies the list of mutate operations.
 *             
 *             <p>Conditions for adding an ad-level AdExtension override using an AdExtension
 *             under the Ad's campaign:</p>
 *             <ol>
 *             <li>If the text ad has never been overridden, an AdExtension override may
 *             be set on the creative using an extension under the campaign, along with
 *             any override info.</li>
 *             <li>If the text ad has been overriden before, the latitude/longitude of the
 *             new extension override must be the same as the previous override and
 *             no override info can be specified (i.e. the override info will inherit from
 *             the previous override info).</li>
 *             </ol>
 *             
 *             @param operations The operations to apply. The same ad extension override
 *             cannot be specified in more than one operation.
 *             @return The applied ad extension overrides.
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
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201306}AdExtensionOverrideOperation" maxOccurs="unbounded" minOccurs="0"/>
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
public class AdExtensionOverrideServiceInterfacemutate {

    protected List<AdExtensionOverrideOperation> operations;

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
     * {@link AdExtensionOverrideOperation }
     * 
     * 
     */
    public List<AdExtensionOverrideOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<AdExtensionOverrideOperation>();
        }
        return this.operations;
    }

}
