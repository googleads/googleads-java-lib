
package com.google.api.ads.adwords.jaxws.v201607.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201607.cm.Page;


/**
 * 
 *             Return result of {@link ManagedCustomerService}
 *           
 * 
 * <p>Java class for ManagedCustomerPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/mcm/v201607}ManagedCustomer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="links" type="{https://adwords.google.com/api/adwords/mcm/v201607}ManagedCustomerLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerPage", propOrder = {
    "entries",
    "links"
})
public class ManagedCustomerPage
    extends Page
{

    protected List<ManagedCustomer> entries;
    protected List<ManagedCustomerLink> links;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedCustomer }
     * 
     * 
     */
    public List<ManagedCustomer> getEntries() {
        if (entries == null) {
            entries = new ArrayList<ManagedCustomer>();
        }
        return this.entries;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedCustomerLink }
     * 
     * 
     */
    public List<ManagedCustomerLink> getLinks() {
        if (links == null) {
            links = new ArrayList<ManagedCustomerLink>();
        }
        return this.links;
    }

}
